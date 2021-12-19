package com.ss.android.ugc.aweme.prop.b;

import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.prop.b.j;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;

final /* synthetic */ class y implements IAVEffectService.IAVEffectReadyCallback {

    /* renamed from: a  reason: collision with root package name */
    private final j.AnonymousClass1 f118271a;

    /* renamed from: b  reason: collision with root package name */
    private final b.j f118272b;

    /* renamed from: c  reason: collision with root package name */
    private final g f118273c;

    static {
        Covode.recordClassIndex(76808);
    }

    y(j.AnonymousClass1 r1, b.j jVar, g gVar) {
        this.f118271a = r1;
        this.f118272b = jVar;
        this.f118273c = gVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(Object obj) {
        j.AnonymousClass1 r0 = this.f118271a;
        b.j jVar = this.f118272b;
        g gVar = this.f118273c;
        f fVar = (f) obj;
        j.this.av = fVar;
        jVar.a(fVar);
        jVar.f4869a.a(gVar);
    }
}
