package com.lynx.tasm.b;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class b<K, V> extends ConcurrentHashMap<K, V> {
    public static final Object NULL = new Object();

    static {
        Covode.recordClassIndex(34861);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentHashMap
    public final Set<Map.Entry<K, V>> entrySet() {
        final Set<Map.Entry<K, V>> entrySet = super.entrySet();
        return new Set<Map.Entry<K, V>>() {
            /* class com.lynx.tasm.b.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34862);
            }

            public final void clear() {
                entrySet.clear();
            }

            public final boolean isEmpty() {
                return entrySet.isEmpty();
            }

            public final int size() {
                return entrySet.size();
            }

            @Override // java.util.Collection, java.util.Set, java.lang.Iterable
            public final Iterator<Map.Entry<K, V>> iterator() {
                final Iterator it = entrySet.iterator();
                return new Iterator<Map.Entry<K, V>>() {
                    /* class com.lynx.tasm.b.b.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34863);
                    }

                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final /* synthetic */ Object next() {
                        final Map.Entry entry = (Map.Entry) it.next();
                        return new Map.Entry<K, V>() {
                            /* class com.lynx.tasm.b.b.AnonymousClass1.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(34864);
                            }

                            @Override // java.util.Map.Entry
                            public final K getKey() {
                                K k2 = (K) entry.getKey();
                                if (k2 == b.NULL) {
                                    return null;
                                }
                                return k2;
                            }

                            @Override // java.util.Map.Entry
                            public final V getValue() {
                                V v = (V) entry.getValue();
                                if (v == b.NULL) {
                                    return null;
                                }
                                return v;
                            }

                            @Override // java.util.Map.Entry
                            public final V setValue(V v) {
                                Map.Entry entry = entry;
                                if (v == null) {
                                    v = (V) b.NULL;
                                }
                                return (V) entry.setValue(v);
                            }
                        };
                    }
                };
            }

            public final Object[] toArray() {
                Object[] array = entrySet.toArray();
                for (int i2 = 0; i2 < array.length; i2++) {
                    if (array[i2] == b.NULL) {
                        array[i2] = null;
                    }
                }
                return array;
            }

            @Override // java.util.Collection, java.util.Set
            public final /* bridge */ /* synthetic */ boolean add(Object obj) {
                return entrySet.add(obj);
            }

            @Override // java.util.Collection, java.util.Set
            public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                return entrySet.addAll(collection);
            }

            @Override // java.util.Collection, java.util.Set
            public final boolean containsAll(Collection<?> collection) {
                return entrySet.containsAll(collection);
            }

            public final boolean remove(Object obj) {
                return entrySet.remove(obj);
            }

            @Override // java.util.Collection, java.util.Set
            public final boolean removeAll(Collection<?> collection) {
                return entrySet.retainAll(collection);
            }

            @Override // java.util.Collection, java.util.Set
            public final boolean retainAll(Collection<?> collection) {
                return entrySet.retainAll(collection);
            }

            @Override // java.util.Collection, java.util.Set
            public final <T> T[] toArray(T[] tArr) {
                return (T[]) entrySet.toArray(tArr);
            }

            public final boolean contains(Object obj) {
                Set set = entrySet;
                if (obj == null) {
                    obj = b.NULL;
                }
                return set.contains(obj);
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentHashMap
    public final V get(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        V v = (V) super.get(obj);
        if (v == NULL) {
            return null;
        }
        return v;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.lynx.tasm.b.b<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentHashMap
    public final void putAll(Map<? extends K, ? extends V> map) {
        if (map != null) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentHashMap
    public final V put(K k2, V v) {
        if (k2 == null) {
            k2 = (K) NULL;
        }
        if (v == null) {
            v = (V) NULL;
        }
        V v2 = (V) super.put(k2, v);
        if (v2 == NULL) {
            return null;
        }
        return v2;
    }
}
