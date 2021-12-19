package com.squareup.b;

import com.bytedance.covode.number.Covode;

public enum q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int index;

    static {
        Covode.recordClassIndex(36072);
    }

    public static boolean isOfflineOnly(int i2) {
        if ((i2 & OFFLINE.index) != 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldReadFromDiskCache(int i2) {
        if ((i2 & NO_CACHE.index) == 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldWriteToDiskCache(int i2) {
        if ((i2 & NO_STORE.index) == 0) {
            return true;
        }
        return false;
    }

    private q(int i2) {
        this.index = i2;
    }
}
