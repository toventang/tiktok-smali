package com.ss.android.ugc.aweme.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class be implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88867a;

    static {
        Covode.recordClassIndex(55900);
    }

    public be(ac acVar) {
        this.f88867a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ac acVar = this.f88867a;
        Boolean bool = (Boolean) obj;
        if (acVar.B != null && bool != null) {
            acVar.B.a(bool.booleanValue());
            acVar.O.a(acVar.A.j(), acVar.A.G());
        }
    }
}
