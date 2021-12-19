package com.google.b.a.f.a.a.a.a;

import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(33164);
    }

    public static RuntimeException a(Throwable th) {
        Throwable th2 = (Throwable) b.a(th);
        a(th2, Error.class);
        a(th2, RuntimeException.class);
        throw new RuntimeException(th);
    }

    private static <X extends Throwable> void a(Throwable th, Class<X> cls) {
        if (th != null && cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }
}
