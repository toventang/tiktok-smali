package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.c.a;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import h.f.b.l;

public final class ILiveParasiticModuleLaunchServiceECImpl implements ILiveParasiticModuleLaunchService {
    static {
        Covode.recordClassIndex(67000);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void a() {
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.n().a(new a());
    }
}
