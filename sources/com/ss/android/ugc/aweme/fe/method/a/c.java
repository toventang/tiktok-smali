package com.ss.android.ugc.aweme.fe.method.a;

import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;

final /* synthetic */ class c implements IAVProcessService.IProcessCallback {

    /* renamed from: a  reason: collision with root package name */
    private final j f91234a;

    static {
        Covode.recordClassIndex(57416);
    }

    c(j jVar) {
        this.f91234a = jVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
    public final void finish(Object obj) {
        this.f91234a.a(obj);
    }
}
