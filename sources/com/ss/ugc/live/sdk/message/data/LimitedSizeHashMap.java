package com.ss.ugc.live.sdk.message.data;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

public class LimitedSizeHashMap<K, V> extends LinkedHashMap<K, V> {
    private int mMaxSize;

    static {
        Covode.recordClassIndex(102773);
    }

    public LimitedSizeHashMap(int i2) {
        this.mMaxSize = i2;
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }
}
