package com.ss.android.ugc.aweme.effect;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.b.a.c;
import com.ss.android.ugc.aweme.main.ay;

final /* synthetic */ class q implements g {

    /* renamed from: a  reason: collision with root package name */
    private final EffectJobService f88957a;

    static {
        Covode.recordClassIndex(55949);
    }

    q(EffectJobService effectJobService) {
        this.f88957a = effectJobService;
    }

    @Override // b.g
    public final Object then(i iVar) {
        EffectJobService effectJobService = this.f88957a;
        ay ayVar = (ay) c.a(effectJobService, ay.class);
        ayVar.b();
        ayVar.a(System.currentTimeMillis());
        effectJobService.stopSelf();
        return null;
    }
}
