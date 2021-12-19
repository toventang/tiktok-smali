package com.google.c.g;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class d<T> {
    static {
        Covode.recordClassIndex(33571);
    }

    d() {
    }

    /* access modifiers changed from: package-private */
    public final Type a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        k.a(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
