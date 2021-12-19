package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface ar<K, V> {
    static {
        Covode.recordClassIndex(33426);
    }

    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    Collection<Map.Entry<K, V>> entries();

    Collection<V> get(K k2);

    boolean isEmpty();

    Set<K> keySet();

    boolean put(K k2, V v);

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    int size();
}
