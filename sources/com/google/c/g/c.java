package com.google.c.g;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class c {
    static {
        Covode.recordClassIndex(33570);
    }

    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        k.a(invocationHandler);
        k.a(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
