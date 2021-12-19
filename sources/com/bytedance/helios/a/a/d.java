package com.bytedance.helios.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f30633a = e.a("android.os.SystemProperties");

    /* renamed from: b  reason: collision with root package name */
    public static Method f30634b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f30635c = new d();

    private d() {
    }

    static {
        Method method;
        Covode.recordClassIndex(17792);
        Class[] clsArr = {String.class, String.class};
        l.c("android.os.SystemProperties", "");
        l.c("get", "");
        l.c(clsArr, "");
        Class<?> a2 = e.a("android.os.SystemProperties");
        if (a2 != null) {
            method = e.a(a2, "get", (Class[]) Arrays.copyOf(clsArr, 2));
        } else {
            method = null;
        }
        f30634b = method;
    }
}
