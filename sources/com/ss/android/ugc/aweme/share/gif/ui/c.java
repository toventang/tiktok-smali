package com.ss.android.ugc.aweme.share.gif.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.ugc.aweme.shortvideo.view.d;

final /* synthetic */ class c implements IAVTransformService.ITransformProgress {

    /* renamed from: a  reason: collision with root package name */
    private final d f123542a;

    static {
        Covode.recordClassIndex(81103);
    }

    c(d dVar) {
        this.f123542a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformProgress
    public final void update(int i2) {
        this.f123542a.setProgress(i2);
    }
}
