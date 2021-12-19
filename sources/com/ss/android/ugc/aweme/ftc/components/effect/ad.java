package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ftc.components.effect.f;
import dmt.av.video.p;
import dmt.av.video.t;
import h.f.b.l;

final /* synthetic */ class ad implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97814a;

    static {
        Covode.recordClassIndex(62167);
    }

    ad(f fVar) {
        this.f97814a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        f fVar = this.f97814a;
        t tVar = (t) obj;
        if (tVar == null) {
            return;
        }
        if (tVar.f156954a == 0) {
            fVar.b();
            p value = fVar.f97851d.getValue();
            if (fVar.x.getVisibility() == 0) {
                fVar.V.post(fVar.ac);
            } else if (value == null || value.f156931g != 0 || l.a((Object) "trans", (Object) value.n)) {
                fVar.H = new f.a();
                fVar.f97855h.post(fVar.H);
            } else {
                fVar.G = new f.b(value.f156925a[0]);
                fVar.f97855h.post(fVar.G);
            }
        } else {
            fVar.b();
        }
    }
}
