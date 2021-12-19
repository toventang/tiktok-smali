package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

final /* synthetic */ class q implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97882a;

    static {
        Covode.recordClassIndex(62209);
    }

    q(f fVar) {
        this.f97882a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        f fVar = this.f97882a;
        Long l2 = (Long) obj;
        if (fVar.K && l2 != null) {
            long a2 = fVar.B.a(l2.longValue());
            fVar.f97852e.setValue(t.a(a2));
            fVar.O.f88902a = a2;
            fVar.O.f88903b = l2.longValue();
            fVar.a(l2.intValue(), true);
        }
    }
}
