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
package uk.co.real_logic.fix_gateway.stress;

import uk.co.real_logic.fix_gateway.engine.EngineConfiguration;
import uk.co.real_logic.fix_gateway.engine.FixEngine;

import java.io.IOException;

public final class SoleEngine
{
    static final String AERON_CHANNEL = "aeron:udp?endpoint=localhost:10000";

    public static void main(String[] args) throws IOException
    {
        final EngineConfiguration configuration = new EngineConfiguration()
            .bindTo("localhost", StressConfiguration.PORT)
            .logFileDir("stress-server-logs")
            .libraryAeronChannel(AERON_CHANNEL);

        configuration.replyTimeoutInMs(1000);

        System.out.println("Server Logs at " + configuration.logFileDir());

        StressUtil.cleanupOldLogFileDir(configuration);

        try (final FixEngine fixEngine = FixEngine.launch(configuration))
        {
            StressUtil.awaitKeyPress();
        }
    }
}