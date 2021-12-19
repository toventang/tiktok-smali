package com.google.android.datatransport;

import com.bytedance.covode.number.Covode;

public abstract class c<T> {
    static {
        Covode.recordClassIndex(30853);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract d c();

    public static <T> c<T> a(T t) {
        return new a(t, d.VERY_LOW);
    }
}
