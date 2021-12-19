package com.ss.ugc.effectplatform.b;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.util.u;
import d.a.a.b;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f153535a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static b<String, f> f153536b = new b<>(true);

    private d() {
    }

    static {
        Covode.recordClassIndex(102367);
    }

    public static f a(String str) {
        l.c(str, "");
        if (!u.a(str) && f153536b.containsKey(str)) {
            return f153536b.get(str);
        }
        return null;
    }

    public static void a(String str, f fVar) {
        l.c(str, "");
        f153536b.put(str, fVar);
    }
}
