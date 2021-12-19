package com.bytedance.monitor.a.c;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Class f41398a;

    /* renamed from: b  reason: collision with root package name */
    public static Object f41399b;

    /* renamed from: c  reason: collision with root package name */
    private static a f41400c;

    static {
        Covode.recordClassIndex(25372);
        try {
            if (a.f41397a == null) {
                a.f41397a = new a();
            }
            f41400c = a.f41397a;
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f41398a = cls;
            f41399b = a.a(a.a(cls, "getUnsafe", new Class[0]), (Object) null, new Object[0]);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
    }
}
