package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

final /* synthetic */ class j implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97875a;

    static {
        Covode.recordClassIndex(62202);
    }

    j(f fVar) {
        this.f97875a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        S s;
        f fVar = this.f97875a;
        if (fVar.K && (s = fVar.x.getPlayBoundary().f2398b) != null) {
            fVar.f97852e.setValue(t.a(fVar.B.a((long) s.intValue())));
            fVar.e();
        }
    }
}
