package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.core.g.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

final /* synthetic */ class m implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97878a;

    static {
        Covode.recordClassIndex(62205);
    }

    m(f fVar) {
        this.f97878a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        f fVar = this.f97878a;
        if (fVar.K) {
            e<Long, Long> playBoundary = fVar.x.getPlayBoundary();
            F f2 = playBoundary.f2397a;
            S s = playBoundary.f2398b;
            if (f2 != null && s != null) {
                fVar.f97852e.setValue(t.b(fVar.B.a((long) f2.intValue())));
                fVar.a((long) f2.intValue(), (long) s.intValue());
            }
        }
    }
}
