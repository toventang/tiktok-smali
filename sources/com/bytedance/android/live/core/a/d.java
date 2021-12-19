package com.bytedance.android.live.core.a;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

final class d<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    static {
        Covode.recordClassIndex(4547);
    }

    public d(int i2) {
        super(i2, 0.75f, true);
        this.capacity = i2;
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.capacity) {
            return true;
        }
        return false;
    }
}
