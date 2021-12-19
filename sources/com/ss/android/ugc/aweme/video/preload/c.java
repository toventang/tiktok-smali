package com.ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;

public enum c {
    Normal(null, -1),
    GHouse("g-house", 100);
    
    private final String cacheDir;
    private final long sizeMB;

    public final String getCacheDir() {
        return this.cacheDir;
    }

    public final long getSizeMB() {
        return this.sizeMB;
    }

    static {
        Covode.recordClassIndex(93988);
    }

    private c(String str, long j2) {
        this.cacheDir = str;
        this.sizeMB = j2;
    }
}
