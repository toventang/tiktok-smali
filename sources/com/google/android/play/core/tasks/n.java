package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;

public abstract class n extends RuntimeException {
    static {
        Covode.recordClassIndex(32976);
    }

    public n(String str) {
        super(str);
    }

    public n(Throwable th) {
        super(th);
    }

    public abstract int getErrorCode();
}
