package com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercelive.business.common.a.b;
import com.ss.android.ugc.aweme.ecommercelive.business.common.a.d;
import com.ss.android.ugc.aweme.ecommercelive.business.common.a.f;
import com.ss.android.ugc.aweme.ecommercelive.business.common.a.g;
import com.ss.android.ugc.aweme.ecommercelive.business.common.a.h;
import com.ss.android.ugc.aweme.ecommercelive.business.common.a.i;
import com.ss.android.ugc.aweme.ecommercelive.business.common.c.a;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class ILiveParasiticModuleLaunchServiceECImpl implements ILiveParasiticModuleLaunchService {
    static {
        Covode.recordClassIndex(55343);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void a() {
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.n().a(new a());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("WebcastOecLiveShoppingMessage", b.class);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(b.class, new g());
        linkedHashMap2.put(d.class, new h());
        linkedHashMap2.put(f.class, new i());
        ILiveOuterService s2 = LiveOuterService.s();
        l.b(s2, "");
        s2.d().a(linkedHashMap, linkedHashMap2);
    }
}
