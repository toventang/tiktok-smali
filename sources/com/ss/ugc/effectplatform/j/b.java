package com.ss.ugc.effectplatform.j;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.h.g;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.d;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.util.EffectUtilKt;
import com.ss.ugc.effectplatform.util.j;
import d.a.a.c;
import h.f.b.l;
import h.m.p;
import java.util.Iterator;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final d.a.a.b<String, Effect> f153620a = new d.a.a.b<>(true);

    /* renamed from: b  reason: collision with root package name */
    public static final d.a.a.b<String, c<g>> f153621b = new d.a.a.b<>(true);

    /* renamed from: c  reason: collision with root package name */
    public static final b f153622c = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(102427);
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        return f153620a.containsKey(str);
    }

    public static boolean a(Effect effect) {
        boolean z = false;
        if (effect != null && !p.a((CharSequence) effect.getId())) {
            if (a(d.a(effect))) {
                return false;
            }
            z = d.a.d.a.d.f(effect.getUnzipPath());
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                boolean a2 = EffectUtilKt.a(effect.getUnzipPath());
                d.a.e.b.a("checkEffect", "checkEffectChildrenFile effect: " + effect.getEffect_id() + ", name: " + effect.getName() + ", result: " + a2 + ", time cost: " + (System.currentTimeMillis() - currentTimeMillis));
                return a2;
            }
        }
        return z;
    }

    public static void a(Effect effect, g gVar) {
        String str;
        String a2;
        l.c(gVar, "");
        if (effect != null) {
            str = d.a(effect);
        } else {
            str = null;
        }
        if (!a(str)) {
            if (a(effect)) {
                gVar.onSuccess(effect);
            }
        } else if (effect != null && (a2 = d.a(effect)) != null) {
            d.a.a.b<String, c<g>> bVar = f153621b;
            c<g> cVar = bVar.get(a2);
            if (cVar == null) {
                cVar = new c<>(true);
                bVar.put(a2, cVar);
            }
            cVar.add(gVar);
        }
    }

    public static void a(Effect effect, e eVar) {
        String a2;
        l.c(eVar, "");
        if (effect != null && (a2 = d.a(effect)) != null) {
            c<g> cVar = f153621b.get(a2);
            if (cVar != null) {
                Iterator<T> it = cVar.iterator();
                while (it.hasNext()) {
                    it.next().onFail(effect, eVar);
                }
            }
            f153621b.remove(a2);
            f153620a.remove(a2);
        }
    }

    public static boolean a(String str, Effect effect) {
        l.c(str, "");
        l.c(effect, "");
        if (p.a((CharSequence) effect.getTransResPath())) {
            j.a(str, effect);
        }
        d.a.e.b.a("checkEffect", "effect has trans res");
        return d.a.d.a.d.f(effect.getTransResPath());
    }
}
