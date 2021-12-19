package com.ss.android.ugc.aweme.trending.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.d;
import com.ss.android.ugc.aweme.search.m;
import com.ss.android.ugc.aweme.trending.TrendingDetailApi;
import f.a.t;
import h.f.b.l;

public final class a extends d<d, m> {
    static {
        Covode.recordClassIndex(92184);
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        if (l.a((Object) dVar.f141204g, (Object) "click_fyp_trending_bar")) {
            return TrendingDetailApi.a.f141035a.getTrendingDetailFYP(dVar.f141199b, dVar.f141198a.f39460b, dVar.f141200c, dVar.f141201d, dVar.f141202e, dVar.f141203f);
        }
        return TrendingDetailApi.a.f141035a.getTrendingDetailDataSearch(dVar.f141199b, dVar.f141198a.f39460b, dVar.f141200c, dVar.f141201d, dVar.f141202e, dVar.f141203f);
    }
}
