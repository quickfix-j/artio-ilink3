/*
 * Copyright 2015-2016 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.fix_gateway.library;

import io.aeron.logbuffer.ControlledFragmentHandler.Action;
import org.agrona.DirectBuffer;
import uk.co.real_logic.fix_gateway.messages.DisconnectReason;
import uk.co.real_logic.fix_gateway.session.AcceptorSession;
import uk.co.real_logic.fix_gateway.session.CompositeKey;
import uk.co.real_logic.fix_gateway.session.Session;
import uk.co.real_logic.fix_gateway.session.SessionParser;
import uk.co.real_logic.fix_gateway.timing.Timer;

import static io.aeron.logbuffer.ControlledFragmentHandler.Action.BREAK;

class SessionSubscriber implements AutoCloseable
{
    private final SessionParser parser;
    private final Session session;
    private final SessionHandler handler;
    private final Timer receiveTimer;
    private final Timer sessionTimer;
    private int remainingCatchupCount;

    SessionSubscriber(
        final SessionParser parser,
        final Session session,
        final SessionHandler handler,
        final Timer receiveTimer,
        final Timer sessionTimer)
    {
        this.parser = parser;
        this.session = session;
        this.handler = handler;
        this.receiveTimer = receiveTimer;
        this.sessionTimer = sessionTimer;
    }

    public Action onMessage(final DirectBuffer buffer,
                            final int offset,
                            final int length,
                            final int libraryId,
                            final long connectionId,
                            final long sessionId,
                            final int messageType,
                            final long timestamp,
                            final long position)
    {
        final long now = receiveTimer.recordSince(timestamp);

        try
        {
            if (remainingCatchupCount == 0)
            {
                final Action action = parser.onMessage(buffer, offset, length, messageType, sessionId);
                if (action == BREAK)
                {
                    return BREAK;
                }

                if (session.isConnected())
                {
                    return handler.onMessage(
                        buffer, offset, length, libraryId, sessionId, messageType, timestamp, position);
                }

                return action;
            }
            else
            {
                remainingCatchupCount--;
                return handler.onMessage(
                    buffer, offset, length, libraryId, sessionId, messageType, timestamp, position);
            }
        }
        finally
        {
            sessionTimer.recordSince(now);
        }
    }

    public Action onDisconnect(final int libraryId, final DisconnectReason reason)
    {
        session.onDisconnect();
        return handler.onDisconnect(libraryId, session.id(), reason);
    }

    public void onLogon(
        final long sessionId,
        final int lastSentSequenceNumber,
        final int lastReceivedSequenceNumber,
        final CompositeKey compositeKey,
        final String username,
        final String password)
    {
        if (compositeKey != null)
        {
            session.setupSession(sessionId, compositeKey);
        }
        else
        {
            session.id(sessionId);
        }

        // Acceptors need to wait for Logon message to identify
        if (session instanceof AcceptorSession)
        {
            session.lastSentMsgSeqNum(lastSentSequenceNumber);
            session.lastReceivedMsgSeqNum(lastReceivedSequenceNumber);
        }

        session.username(username);
        session.password(password);
    }

    public int poll(final long time)
    {
        return session.poll(time);
    }

    public void close()
    {
        session.requestDisconnect();
    }

    public Session session()
    {
        return session;
    }

    void startCatchup(final int messageCount)
    {
        remainingCatchupCount = messageCount;
    }
}
