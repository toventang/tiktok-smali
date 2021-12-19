package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.core.g.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class al implements a {

    /* renamed from: a  reason: collision with root package name */
    private final f f97824a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f97825b;

    static {
        Covode.recordClassIndex(62175);
    }

    al(f fVar, boolean z) {
        this.f97824a = fVar;
        this.f97825b = z;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        f fVar = this.f97824a;
        if (this.f97825b) {
            fVar.s.setVisibility(0);
            fVar.t.setVisibility(0);
        }
    }
}
