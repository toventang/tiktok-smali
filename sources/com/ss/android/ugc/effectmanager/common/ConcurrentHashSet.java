package com.ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashSet<E> extends AbstractSet<E> implements Set<E> {
    private transient Set<E> _keys;
    private final Map<E, Boolean> _map;

    static {
        Covode.recordClassIndex(95238);
    }

    public void clear() {
        this._map.clear();
    }

    public int hashCode() {
        return this._keys.hashCode();
    }

    public boolean isEmpty() {
        return this._map.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return this._keys.iterator();
    }

    public int size() {
        return this._map.size();
    }

    public Object[] toArray() {
        return this._keys.toArray();
    }

    public String toString() {
        return this._keys.toString();
    }

    public ConcurrentHashSet() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this._map = concurrentHashMap;
        this._keys = concurrentHashMap.keySet();
    }

    public boolean contains(Object obj) {
        return this._map.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return this._keys.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.AbstractSet, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        return this._keys.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        return this._keys.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e2) {
        if (this._map.put(e2, Boolean.TRUE) == null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this || this._keys.equals(obj)) {
            return true;
        }
        return false;
    }

    public boolean remove(Object obj) {
        if (this._map.remove(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this._keys.toArray(tArr);
    }
}
