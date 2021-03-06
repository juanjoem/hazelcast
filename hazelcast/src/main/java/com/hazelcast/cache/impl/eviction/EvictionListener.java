/*
 * Copyright (c) 2008-2015, Hazelcast, Inc. All Rights Reserved.
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

package com.hazelcast.cache.impl.eviction;

/**
 * Interface for entries, records or whatever that can be evicted via its accessor (key or id).
 *
 * @param <A> Type of the accessor
 * @param <E> Type of the {@link com.hazelcast.cache.impl.eviction.Evictable} value
 */
public interface EvictionListener<A, E extends Evictable> {

    EvictionListener NO_LISTENER = null;

    /**
     * Called when an {@link com.hazelcast.cache.impl.eviction.Evictable} entry is evicted.
     *
     * @param evictedEntryAccessor  Accessor of the {@link com.hazelcast.cache.impl.eviction.Evictable} entry
     *                              that is evicted.
     * @param evictedEntry          {@link com.hazelcast.cache.impl.eviction.Evictable} entry that is evicted.
     */
    void onEvict(A evictedEntryAccessor, E evictedEntry);

}
