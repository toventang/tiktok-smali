package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ag implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97819a;

    static {
        Covode.recordClassIndex(62170);
    }

    ag(f fVar) {
        this.f97819a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        f fVar = this.f97819a;
        Boolean bool = (Boolean) obj;
        if (fVar.B != null && bool != null) {
            fVar.B.a(bool.booleanValue());
            fVar.O.a(fVar.A.j(), fVar.A.G());
        }
    }
}
