package com.ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Multimap<K, V> {
    private HashMap<K, Collection<V>> mInternalHashMap = new HashMap<>();

    static {
        Covode.recordClassIndex(95247);
    }

    public static class Entry<K, V> {
        K mKey;
        V mValue;

        static {
            Covode.recordClassIndex(95248);
        }

        public K getKey() {
            return this.mKey;
        }

        public V getValue() {
            return this.mValue;
        }

        public int hashCode() {
            return (this.mKey.hashCode() * 31) + this.mValue.hashCode();
        }

        public void setKey(K k2) {
            this.mKey = k2;
        }

        public void setValue(V v) {
            this.mValue = v;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.mKey.equals(entry.mKey)) {
                return false;
            }
            return this.mValue.equals(entry.mValue);
        }

        Entry(K k2, V v) {
            this.mKey = k2;
            this.mValue = v;
        }
    }

    public Set<K> keySet() {
        return this.mInternalHashMap.keySet();
    }

    public Set<Entry<K, V>> entrySet() {
        HashSet hashSet = new HashSet();
        for (K k2 : keySet()) {
            for (V v : get(k2)) {
                hashSet.add(new Entry(k2, v));
            }
        }
        return hashSet;
    }

    public Collection<V> values() {
        Collection<Collection<V>> values = this.mInternalHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Collection<V> collection : values) {
            arrayList.addAll(collection);
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public boolean containsKey(K k2) {
        return this.mInternalHashMap.containsKey(k2);
    }

    public Collection<V> get(K k2) {
        Collection<V> collection = this.mInternalHashMap.get(k2);
        if (collection == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableCollection(collection);
    }

    public boolean containsEntry(K k2, V v) {
        return get(k2).contains(v);
    }

    public void put(K k2, V v) {
        Collection<V> collection = this.mInternalHashMap.get(k2);
        if (collection == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(v);
            this.mInternalHashMap.put(k2, arrayList);
            return;
        }
        collection.add(v);
    }

    public boolean remove(K k2, V v) {
        Collection<V> collection = this.mInternalHashMap.get(k2);
        if (collection == null) {
            return false;
        }
        boolean remove = collection.remove(v);
        if (remove && collection.isEmpty()) {
            this.mInternalHashMap.remove(k2);
        }
        return remove;
    }
}
