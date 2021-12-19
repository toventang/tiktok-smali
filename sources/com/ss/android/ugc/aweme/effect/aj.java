package com.ss.android.ugc.aweme.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

final /* synthetic */ class aj implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88809a;

    static {
        Covode.recordClassIndex(55863);
    }

    aj(ac acVar) {
        this.f88809a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        F f2;
        ac acVar = this.f88809a;
        if (acVar.K && (f2 = acVar.x.getPlayBoundary().f2397a) != null) {
            acVar.f88782e.setValue(t.a(acVar.B.a((long) f2.intValue())));
            acVar.g();
        }
    }
}
