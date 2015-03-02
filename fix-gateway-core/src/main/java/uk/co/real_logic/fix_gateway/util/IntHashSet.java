/*
 * Copyright 2015 Real Logic Ltd.
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
package uk.co.real_logic.fix_gateway.util;

import uk.co.real_logic.agrona.BitUtil;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.joining;

/**
 * Simple fixed-size int hashset for validating tags.
 */
public final class IntHashSet implements Set<Integer>
{
    private final int[] values;
    private final IntIterator iterator;
    private final int mask;
    private final int missingValue;

    private int size;

    public IntHashSet(final int proposedCapacity, final int missingValue)
    {
        size = 0;
        this.missingValue = missingValue;
        final int capacity = BitUtil.findNextPositivePowerOfTwo(proposedCapacity);
        mask = capacity - 1;
        values = new int[capacity];
        Arrays.fill(values, missingValue);

        // NB: references values in the constructor, so must be assigned after values
        iterator = new IntIterator(missingValue, values);
    }

    /**
     * {@inheritDoc}
     */
    public boolean add(final Integer value)
    {
        return add(value.intValue());
    }

    /**
     * Primitive specialised overload of {@link this#add(Integer)}
     *
     * @param value the value to add
     * @return true if the collection has changed, false otherwise
     */
    public boolean add(final int value)
    {
        int index = hash(value);

        while (values[index] != missingValue)
        {
            if (values[index] == value)
            {
                return false;
            }

            index = ++index & mask;
        }

        values[index] = value;
        size++;

        return true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean remove(final Object value)
    {
        return value instanceof Integer && remove(((Integer)value).intValue());
    }

    /**
     * {@inheritDoc}
     */
    public boolean remove(final int value)
    {
        int index = hash(value);

        while (values[index] != missingValue)
        {
            if (values[index] == value)
            {
                values[index] = missingValue;
                return true;
            }

            index = ++index & mask;
        }

        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean contains(final Object value)
    {
        return value instanceof Integer && contains(((Integer) value).intValue());
    }

    /**
     * {@inheritDoc}
     */
    public boolean contains(final int value)
    {
        int index = hash(value);

        while (values[index] != missingValue)
        {
            if (values[index] == value)
            {
                return true;
            }

            index = ++index & mask;
        }

        return false;
    }

    /**
     * {@inheritDoc}
     */
    private int hash(final int value)
    {
        final int hash = (value << 1) - (value << 8);
        return hash & mask;
    }

    /**
     * {@inheritDoc}
     */
    public int size()
    {
        return size;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isEmpty()
    {
        return size() == 0;
    }

    /**
     * {@inheritDoc}
     */
    public void clear()
    {
        final int[] values = this.values;
        final int length = values.length;
        for (int i = 0; i < length; i++)
        {
            values[i] = missingValue;
        }
        size = 0;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(final T[] ignore)
    {
        return (T[])(Object)Arrays.copyOf(values, values.length);
    }

    /**
     * {@inheritDoc}
     */
    public boolean addAll(final Collection<? extends Integer> coll)
    {
        return conjunction(coll, (x) -> add(x));
    }

    /**
     * {@inheritDoc}
     */
    public boolean containsAll(final Collection<?> coll)
    {
        return conjunction(coll, this::contains);
    }

    /**
     * IntHashSet specialised variant of {this#containsAll(Collection)}.
     */
    public boolean containsAll(final IntHashSet other)
    {
        final IntIterator iterator = other.iterator();
        while (iterator.hasNext())
        {
            if (!contains(iterator.nextValue()))
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Fast Path set difference for comparison with another IntHashSet.
     *
     * NB: garbage free in the identical case, allocates otherwise.
     *
     * @param collection the other set to subtract
     * @return null if identical, otherwise the set of differences
     */
    public IntHashSet difference(final IntHashSet collection)
    {
        Objects.requireNonNull(collection);

        IntHashSet difference = null;

        final IntIterator it = iterator();

        while (it.hasNext())
        {
            final int value = it.nextValue();
            if (!collection.contains(value))
            {
                if (difference == null)
                {
                    difference = new IntHashSet(size, missingValue);
                }

                difference.add(value);
            }
        }

        return difference;
    }

    /**
     * {@inheritDoc}
     */
    public boolean removeAll(final Collection<?> coll)
    {
        return conjunction(coll, this::remove);
    }

    private <T> boolean conjunction(final Collection<T> collection, final Predicate<T> predicate)
    {
        Objects.requireNonNull(collection);

        boolean acc = false;
        for (final T t : collection)
        {
            // Deliberate strict evaluation
            acc |= predicate.test(t);
        }

        return acc;
    }

    /**
     * {@inheritDoc}
     */
    public IntIterator iterator()
    {
        iterator.reset();
        return iterator;
    }

    /**
     * {@inheritDoc}
     */
    public void copy(final IntHashSet obj)
    {
        // NB: mask also implies the length is the same
        if (this.mask != obj.mask)
        {
            throw new IllegalArgumentException("Cannot copy object: masks not equal");
        }

        if (this.missingValue != obj.missingValue)
        {
            throw new IllegalArgumentException("Cannot copy object: missingValues not equal");
        }

        System.arraycopy(obj.values, 0, this.values, 0, this.values.length);
        this.size = obj.size;
    }

    /**
     * {@inheritDoc}
     */
    public String toString()
    {
        return stream()
            .map((x) -> Integer.toString(x))
            .collect(joining(",", "{", "}"));
    }

    /**
     * {@inheritDoc}
     */
    public Object[] toArray()
    {
        final int[] values = this.values;
        final Object[] array = new Object[values.length];
        for (int i = 0; i < values.length; i++)
        {
            array[i] = values[i];
        }
        return array;
    }

    /**
     * {@inheritDoc}
     */
    public boolean equals(final Object other)
    {
        if (other == this)
        {
            return true;
        }

        if (other instanceof IntHashSet)
        {
            final IntHashSet otherSet = (IntHashSet) other;
            return otherSet.missingValue == missingValue
                && otherSet.size() == size()
                && containsAll(otherSet);
        }

        return false;
    }

    /**
     * {@inheritDoc}
     */
    public int hashCode()
    {
        final IntIterator iterator = iterator();
        int total = 0;
        while (iterator.hasNext())
        {
            total += iterator.nextValue();
        }
        return total;
    }

    // --- Unimplemented below here

    public boolean retainAll(final Collection<?> coll)
    {
        throw new UnsupportedOperationException("Not implemented");
    }
}
