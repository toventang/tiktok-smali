package com.ss.android.ugc.aweme.choosemusic.model;

import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;

/* access modifiers changed from: package-private */
public final /* synthetic */ class v implements IAVInfoService.IGetInfoCallback {

    /* renamed from: a  reason: collision with root package name */
    private final j f70692a;

    static {
        Covode.recordClassIndex(43583);
    }

    v(j jVar) {
        this.f70692a = jVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Object obj) {
        this.f70692a.a(obj);
    }
}
