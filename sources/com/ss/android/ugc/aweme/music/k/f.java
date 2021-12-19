package com.ss.android.ugc.aweme.music.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements IAVInfoService.IGetInfoCallback {

    /* renamed from: a  reason: collision with root package name */
    private final IAVInfoService.IGetInfoCallback f111551a;

    /* renamed from: b  reason: collision with root package name */
    private final List f111552b;

    static {
        Covode.recordClassIndex(71648);
    }

    f(IAVInfoService.IGetInfoCallback iGetInfoCallback, List list) {
        this.f111551a = iGetInfoCallback;
        this.f111552b = list;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Object obj) {
        this.f111551a.finish(obj);
    }
}
