package com.ss.android.ugc.aweme.live.slot;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import h.f.b.l;

public final class LiveBusinessParasiticModule implements ILiveParasiticModuleLaunchService {
    static {
        Covode.recordClassIndex(69592);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void a() {
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.n().a(new a());
    }
}
