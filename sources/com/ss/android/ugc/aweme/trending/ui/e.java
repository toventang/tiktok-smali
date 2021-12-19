package com.ss.android.ugc.aweme.trending.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class e extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f141121a = new e();

    static {
        Covode.recordClassIndex(92147);
    }

    e() {
        super(TrendingMainState.class, "showTrendExpiredToast", "getShowTrendExpiredToast()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((TrendingMainState) obj).getShowTrendExpiredToast());
    }
}
