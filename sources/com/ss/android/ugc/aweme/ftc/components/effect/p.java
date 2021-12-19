package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class p implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97881a;

    static {
        Covode.recordClassIndex(62208);
    }

    p(f fVar) {
        this.f97881a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        f fVar = this.f97881a;
        Boolean bool = (Boolean) obj;
        if (fVar.K && bool != null && bool.booleanValue()) {
            fVar.j();
        }
    }
}
