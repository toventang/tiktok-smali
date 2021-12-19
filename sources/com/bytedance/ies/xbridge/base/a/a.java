package com.bytedance.ies.xbridge.base.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35769a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final f f35770b = new f();

    private a() {
    }

    static {
        Covode.recordClassIndex(21364);
    }

    public static String a(Object obj) {
        l.c(obj, "");
        String b2 = f35770b.b(obj);
        l.a((Object) b2, "");
        return b2;
    }

    public static <T> T a(String str, Class<T> cls) {
        l.c(str, "");
        l.c(cls, "");
        return (T) f35770b.a(str, (Class) cls);
    }
}
