package com.ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f110797a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f110798b;

    private o() {
    }

    static {
        Covode.recordClassIndex(71101);
        o oVar = new o();
        f110797a = oVar;
        f110798b = oVar.getClass().getSimpleName();
    }

    public static n a(Effect effect, d dVar) {
        l.d(effect, "");
        l.d(dVar, "");
        p pVar = null;
        try {
            pVar = new p(effect.getName(), effect.getUnzipPath(), dVar, effect, effect.getIcon_url().getUrl_list().get(0));
            return pVar;
        } catch (Exception e2) {
            e2.getMessage();
            return pVar;
        }
    }
}
