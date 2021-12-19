package com.ss.android.ugc.aweme.trending.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.trending.a.c;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class TrendingDetailServiceImpl implements ITrendingFeedService {
    static {
        Covode.recordClassIndex(92104);
    }

    public static ITrendingFeedService b() {
        Object a2 = b.a(ITrendingFeedService.class, false);
        if (a2 != null) {
            return (ITrendingFeedService) a2;
        }
        return new TrendingDetailServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.trending.service.ITrendingFeedService
    public final boolean a() {
        if (com.bytedance.ies.abmock.b.a().a(true, "enable_search_trending_inflow", 0) == com.ss.android.ugc.aweme.trending.a.b.f141041a) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.trending.service.ITrendingFeedService
    public final boolean a(String str) {
        l.d(str, "");
        return c.a(str);
    }
}
