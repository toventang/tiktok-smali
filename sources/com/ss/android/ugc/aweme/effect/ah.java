package com.ss.android.ugc.aweme.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

final /* synthetic */ class ah implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88807a;

    static {
        Covode.recordClassIndex(55861);
    }

    ah(ac acVar) {
        this.f88807a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        S s;
        ac acVar = this.f88807a;
        if (acVar.K && (s = acVar.x.getPlayBoundary().f2398b) != null) {
            acVar.f88782e.setValue(t.a(acVar.B.a((long) s.intValue())));
            acVar.g();
        }
    }
}
