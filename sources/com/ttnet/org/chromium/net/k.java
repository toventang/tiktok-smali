package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;

public abstract class k extends d {
    static {
        Covode.recordClassIndex(103544);
    }

    public abstract int getCronetInternalErrorCode();

    public abstract int getErrorCode();

    public abstract boolean immediatelyRetryable();

    public k(String str, Throwable th) {
        super(str, th);
    }
}
