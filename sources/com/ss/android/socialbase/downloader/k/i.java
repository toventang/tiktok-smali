package com.ss.android.socialbase.downloader.k;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

public final class i<K, T> extends LinkedHashMap<K, T> {
    private int mMaxSize;

    static {
        Covode.recordClassIndex(37529);
    }

    public i() {
        this(4, 4);
    }

    public final void setMaxSize(int i2) {
        this.mMaxSize = i2;
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, T> entry) {
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }

    public i(int i2, int i3) {
        this(i2, i3, true);
    }

    public i(int i2, int i3, boolean z) {
        super(i2, 0.75f, z);
        setMaxSize(i3);
    }
}
