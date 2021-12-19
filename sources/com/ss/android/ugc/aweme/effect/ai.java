package com.ss.android.ugc.aweme.effect;

import androidx.core.g.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.bu;
import dmt.av.video.t;

final /* synthetic */ class ai implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88808a;

    static {
        Covode.recordClassIndex(55862);
    }

    ai(ac acVar) {
        this.f88808a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ac acVar = this.f88808a;
        if (acVar.K) {
            e<Long, Long> playBoundary = acVar.x.getPlayBoundary();
            F f2 = playBoundary.f2397a;
            S s = playBoundary.f2398b;
            if (f2 != null && s != null) {
                if (!bu.a()) {
                    acVar.f88782e.setValue(t.b(acVar.B.a((long) f2.intValue())));
                }
                acVar.a((long) f2.intValue(), (long) s.intValue(), false);
            }
        }
    }
}
