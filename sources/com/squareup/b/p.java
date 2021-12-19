package com.squareup.b;

import com.bytedance.covode.number.Covode;

public enum p {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int index;

    static {
        Covode.recordClassIndex(36071);
    }

    static boolean a(int i2) {
        if ((i2 & NO_CACHE.index) == 0) {
            return true;
        }
        return false;
    }

    private p(int i2) {
        this.index = i2;
    }
}
