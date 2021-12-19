package com.ss.android.ugc.aweme.live.livehostimpl;

import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;

final /* synthetic */ class b implements IAVEffectService.IAVEffectReadyCallback {

    /* renamed from: a  reason: collision with root package name */
    private final j f108460a;

    static {
        Covode.recordClassIndex(69503);
    }

    b(j jVar) {
        this.f108460a = jVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(Object obj) {
        j jVar = this.f108460a;
        f fVar = (f) obj;
        if (fVar != null) {
            jVar.a(fVar.c());
        } else {
            jVar.b((Exception) new RuntimeException("Decompress failed"));
        }
    }
}
