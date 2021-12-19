package com.ss.android.ugc.aweme.effect;

import androidx.core.g.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class af implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88804a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f88805b;

    static {
        Covode.recordClassIndex(55859);
    }

    af(ac acVar, boolean z) {
        this.f88804a = acVar;
        this.f88805b = z;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        ac acVar = this.f88804a;
        if (this.f88805b) {
            acVar.s.setVisibility(0);
            acVar.t.setVisibility(0);
        }
    }
}
