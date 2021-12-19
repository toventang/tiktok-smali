package com.ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class g<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    static {
        Covode.recordClassIndex(56215);
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public final Set getEntries() {
        return super.entrySet();
    }

    public final Set getKeys() {
        return super.keySet();
    }

    public final int getSize() {
        return super.size();
    }

    public final Collection getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<K> keySet() {
        return getKeys();
    }

    public final int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Collection<V> values() {
        return getValues();
    }

    public g(int i2) {
        this.capacity = i2;
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.capacity) {
            return true;
        }
        return false;
    }
}
