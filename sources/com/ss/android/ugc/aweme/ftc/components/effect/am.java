package com.ss.android.ugc.aweme.ftc.components.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.u;
import com.ss.android.ugc.aweme.ftc.components.effect.f;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import h.f.b.l;
import java.util.List;

final /* synthetic */ class am implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f.AnonymousClass6 f97826a;

    /* renamed from: b  reason: collision with root package name */
    private final List f97827b;

    static {
        Covode.recordClassIndex(62176);
    }

    am(f.AnonymousClass6 r1, List list) {
        this.f97826a = r1;
        this.f97827b = list;
    }

    public final void run() {
        f.AnonymousClass6 r4 = this.f97826a;
        List list = this.f97827b;
        if (f.this.J.f97841a != null && (f.this.J.f97841a instanceof u)) {
            List<EffectPointModel> d2 = ((u) f.this.J.f97841a).d();
            f.this.f97857j.a(d2, f.this.B.c());
            if (l.a((Object) "sticker", (Object) ((EffectCategoryResponse) list.get(0)).getKey())) {
                f.this.a(d2, true, false);
            }
        }
    }
}
