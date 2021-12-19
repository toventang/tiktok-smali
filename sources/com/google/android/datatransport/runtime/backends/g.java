package com.google.android.datatransport.runtime.backends;

import com.bytedance.covode.number.Covode;

public abstract class g {
    static {
        Covode.recordClassIndex(30918);
    }

    public abstract a a();

    public abstract long b();

    public static g c() {
        return new b(a.TRANSIENT_ERROR, -1);
    }

    public static g d() {
        return new b(a.FATAL_ERROR, -1);
    }

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR;

        static {
            Covode.recordClassIndex(30919);
        }
    }
}
