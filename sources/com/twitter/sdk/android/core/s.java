package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;

public class s extends RuntimeException {
    static {
        Covode.recordClassIndex(103727);
    }

    public s(String str) {
        super(str);
    }

    public s(String str, Throwable th) {
        super(str, th);
    }
}
