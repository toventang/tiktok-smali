package com.ss.android.ugc.aweme.ftc.components.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.c.b.a;
import h.f.a.s;

final /* synthetic */ class u implements s {

    /* renamed from: a  reason: collision with root package name */
    private final f f97886a;

    static {
        Covode.recordClassIndex(62213);
    }

    u(f fVar) {
        this.f97886a = fVar;
    }

    @Override // h.f.a.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        f fVar = this.f97886a;
        return Float.valueOf(a.a(fVar.M, fVar.A.G(), ((Boolean) obj).booleanValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue(), ((Integer) obj4).intValue(), ((Float) obj5).floatValue()));
    }
}
