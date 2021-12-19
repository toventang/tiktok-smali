package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

final /* synthetic */ class n implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97879a;

    static {
        Covode.recordClassIndex(62206);
    }

    n(f fVar) {
        this.f97879a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        F f2;
        f fVar = this.f97879a;
        if (fVar.K && (f2 = fVar.x.getPlayBoundary().f2397a) != null) {
            fVar.f97852e.setValue(t.a(fVar.B.a((long) f2.intValue())));
            fVar.e();
        }
    }
}
