package com.bytedance.ies.xbridge.base.runtime.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f35833a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final f f35834b = new f();

    private c() {
    }

    static {
        Covode.recordClassIndex(21397);
    }

    public static String a(Object obj) {
        l.c(obj, "");
        String b2 = f35834b.b(obj);
        l.a((Object) b2, "");
        return b2;
    }

    public static <T> T a(String str, Class<T> cls) {
        l.c(str, "");
        l.c(cls, "");
        return (T) f35834b.a(str, (Class) cls);
    }
}
