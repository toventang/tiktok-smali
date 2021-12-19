package com.ss.android.ugc.aweme.trending.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class d extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f141120a = new d();

    static {
        Covode.recordClassIndex(92146);
    }

    d() {
        super(TrendingMainState.class, "trendingList", "getTrendingList()Ljava/util/ArrayList;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((TrendingMainState) obj).getTrendingList();
    }
}
