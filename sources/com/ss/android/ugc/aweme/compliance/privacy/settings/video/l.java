package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import java.util.concurrent.Callable;

final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f77888a;

    static {
        Covode.recordClassIndex(48274);
    }

    l(a aVar) {
        this.f77888a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i2;
        a aVar = this.f77888a;
        String aid = aVar.f77828c.getAid();
        if (aVar.f77828c.getStitchSetting() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        String valueOf = String.valueOf(i2);
        g gVar = new g(a.s);
        gVar.a("aweme_id", aid);
        gVar.a("item_stitch", valueOf);
        return AVApiImpl.b().a(gVar.toString(), BaseResponse.class);
    }
}
