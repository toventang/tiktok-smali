package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

final /* synthetic */ class l implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97877a;

    static {
        Covode.recordClassIndex(62204);
    }

    l(f fVar) {
        this.f97877a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        F f2;
        f fVar = this.f97877a;
        if (fVar.K && (f2 = fVar.x.getPlayBoundary().f2397a) != null) {
            fVar.f97852e.setValue(t.a(fVar.B.a((long) f2.intValue())));
            fVar.e();
        }
    }
}
