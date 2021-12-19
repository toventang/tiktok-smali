package com.bytedance.common.utility.collection;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = 3805937866184666407L;
    final int mMaxSize;

    static {
        Covode.recordClassIndex(15893);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }

    public c(int i2, int i3) {
        this(i2, i3, false);
    }

    public c(int i2, int i3, boolean z) {
        super(i3, 0.75f, true);
        this.mMaxSize = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
