package com.ss.android.ugc.aweme.commercialize.live.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.live.business.links.c.a;
import com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.c;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class ILiveParasiticModuleLaunchServiceCommercializeImpl implements ILiveParasiticModuleLaunchService {
    static {
        Covode.recordClassIndex(46066);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void a() {
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.n().a(new a());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("WebcastBALinkFullMessage", com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a.class);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a.class, new c());
        ILiveOuterService s2 = LiveOuterService.s();
        l.b(s2, "");
        s2.d().a(linkedHashMap, linkedHashMap2);
    }
}
