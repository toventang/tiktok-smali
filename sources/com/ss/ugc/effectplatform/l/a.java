package com.ss.ugc.effectplatform.l;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import d.a.d.a.d;
import d.a.d.a.f;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final d.a.a.a<String> f153643a = new d.a.a.a<>(true);

    /* renamed from: b  reason: collision with root package name */
    public static final a f153644b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(102440);
    }

    public static void a(Effect effect) {
        l.c(effect, "");
        f153643a.add(effect.getUnzipPath() + "_trans_");
    }

    public static void b(Effect effect) {
        l.c(effect, "");
        f153643a.remove(effect.getUnzipPath() + "_trans_");
    }

    public static void a(String str, Effect effect) {
        l.c(str, "");
        l.c(effect, "");
        List<f> a2 = d.a(str);
        if (a2 != null) {
            for (T t : a2) {
                if (p.b(t.f156625a, effect.getId() + "_trans_", false)) {
                    d.c(t.f156626b);
                }
            }
        }
        b(effect);
    }
}
