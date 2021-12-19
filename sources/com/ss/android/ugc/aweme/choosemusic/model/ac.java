package com.ss.android.ugc.aweme.choosemusic.model;

import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;

final /* synthetic */ class ac implements IAVInfoService.IGetInfoCallback {

    /* renamed from: a  reason: collision with root package name */
    private final j f70607a;

    static {
        Covode.recordClassIndex(43545);
    }

    ac(j jVar) {
        this.f70607a = jVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Object obj) {
        this.f70607a.a(obj);
    }
}
