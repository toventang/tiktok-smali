package com.ss.android.ugc.aweme.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.ac;
import dmt.av.video.p;
import dmt.av.video.t;
import h.f.b.l;

public final /* synthetic */ class ba implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88861a;

    static {
        Covode.recordClassIndex(55896);
    }

    public ba(ac acVar) {
        this.f88861a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ac acVar = this.f88861a;
        t tVar = (t) obj;
        if (tVar == null) {
            return;
        }
        if (tVar.f156954a == 0) {
            acVar.c();
            p value = acVar.f88781d.getValue();
            if (acVar.x.getVisibility() == 0) {
                acVar.V.post(acVar.ag);
            } else if (value == null || value.f156931g != 0 || l.a((Object) "trans", (Object) value.n)) {
                acVar.H = new ac.a();
                acVar.f88785h.post(acVar.H);
            } else {
                acVar.G = new ac.b(value.f156925a[0]);
                acVar.f88785h.post(acVar.G);
            }
        } else {
            acVar.c();
        }
    }
}
