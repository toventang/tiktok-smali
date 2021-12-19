package com.ss.android.ugc.aweme.fe.method;

import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements IAVProcessService.IProcessCallback {

    /* renamed from: a  reason: collision with root package name */
    private final j f91305a;

    static {
        Covode.recordClassIndex(57465);
    }

    h(j jVar) {
        this.f91305a = jVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
    public final void finish(Object obj) {
        this.f91305a.a(obj);
    }
}
