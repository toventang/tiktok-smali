package com.ss.android.ugc.aweme.ftc.components.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.c.b.a;
import h.f.a.b;

final /* synthetic */ class t implements b {

    /* renamed from: a  reason: collision with root package name */
    private final f f97885a;

    static {
        Covode.recordClassIndex(62212);
    }

    t(f fVar) {
        this.f97885a = fVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        f fVar = this.f97885a;
        return Long.valueOf(a.a(fVar.M, ((Float) obj).longValue(), (long) fVar.A.G()));
    }
}
