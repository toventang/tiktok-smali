package com.ss.android.ugc.aweme.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

final /* synthetic */ class ao implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88814a;

    static {
        Covode.recordClassIndex(55868);
    }

    ao(ac acVar) {
        this.f88814a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ac acVar = this.f88814a;
        Long l2 = (Long) obj;
        if (acVar.K && l2 != null) {
            long a2 = acVar.B.a(l2.longValue());
            acVar.f88782e.setValue(t.a(a2));
            acVar.O.f88902a = a2;
            acVar.O.f88903b = l2.longValue();
            acVar.a(l2.intValue(), true);
        }
    }
}
