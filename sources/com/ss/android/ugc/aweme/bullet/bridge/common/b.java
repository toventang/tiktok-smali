package com.ss.android.ugc.aweme.bullet.bridge.common;

import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;

final /* synthetic */ class b implements IAVProcessService.IProcessCallback {

    /* renamed from: a  reason: collision with root package name */
    private final j f69066a;

    static {
        Covode.recordClassIndex(42587);
    }

    b(j jVar) {
        this.f69066a = jVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
    public final void finish(Object obj) {
        this.f69066a.a(obj);
    }
}
