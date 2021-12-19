package com.ss.android.ugc.aweme.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class an implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88813a;

    static {
        Covode.recordClassIndex(55867);
    }

    an(ac acVar) {
        this.f88813a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ac acVar = this.f88813a;
        Boolean bool = (Boolean) obj;
        if (acVar.K && bool != null && bool.booleanValue()) {
            acVar.l();
        }
    }
}
