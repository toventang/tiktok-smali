package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public class VESensException extends Exception {
    static {
        Covode.recordClassIndex(99204);
    }

    public VESensException(String str) {
        super(str);
    }
}
