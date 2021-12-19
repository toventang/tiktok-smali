package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;

public final class al extends RuntimeException {
    static {
        Covode.recordClassIndex(32793);
    }

    public al(String str) {
        super(str);
    }

    public al(Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
