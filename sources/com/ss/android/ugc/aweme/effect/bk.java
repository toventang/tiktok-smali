package com.ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.ac;
import com.ss.android.ugc.aweme.experiment.ep;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import h.f.b.l;
import java.util.List;

final /* synthetic */ class bk implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ac.AnonymousClass6 f88873a;

    /* renamed from: b  reason: collision with root package name */
    private final List f88874b;

    static {
        Covode.recordClassIndex(55906);
    }

    bk(ac.AnonymousClass6 r1, List list) {
        this.f88873a = r1;
        this.f88874b = list;
    }

    public final void run() {
        ac.AnonymousClass6 r4 = this.f88873a;
        List list = this.f88874b;
        if (ac.this.J.f88958a != null && (ac.this.J.f88958a instanceof u)) {
            List<EffectPointModel> d2 = ((u) ac.this.J.f88958a).d();
            ac.this.f88787j.a(d2, ac.this.B.c());
            if (!ep.a() && l.a((Object) "sticker", (Object) ((EffectCategoryResponse) list.get(0)).getKey())) {
                ac.this.a(d2, true, false);
            }
        }
    }
}
