package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import java.util.concurrent.Callable;

final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f77886a;

    static {
        Covode.recordClassIndex(48272);
    }

    j(a aVar) {
        this.f77886a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a aVar = this.f77886a;
        String aid = aVar.f77828c.getAid();
        int i2 = 0;
        String valueOf = String.valueOf((aVar.f77828c.getDuetSetting() == 0 || aVar.f77828c.getReactSetting() == 0) ? 1 : 0);
        if (aVar.f77828c.getDuetSetting() == 0 || aVar.f77828c.getReactSetting() == 0) {
            i2 = 1;
        }
        String valueOf2 = String.valueOf(i2);
        g gVar = new g(a.s);
        gVar.a("aweme_id", aid);
        gVar.a("item_duet", valueOf2);
        gVar.a("item_react", valueOf);
        gVar.a("enable_stitch", aVar.q ? 1 : 0);
        return AVApiImpl.b().a(gVar.toString(), BaseResponse.class);
    }
}
