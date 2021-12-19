package com.bytedance.ies.bullet.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, e> f31989a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final c f31990b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(18720);
    }

    public static e a(String str) {
        l.c(str, "");
        return f31989a.get(str);
    }

    public static void a(String str, e eVar) {
        l.c(str, "");
        l.c(eVar, "");
        f31989a.put(str, eVar);
    }
}
