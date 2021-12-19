package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.g;
import com.ss.android.ugc.aweme.feed.x.m;
import f.a.d.k;

final /* synthetic */ class bs implements k {

    /* renamed from: a  reason: collision with root package name */
    private final bq f94412a;

    static {
        Covode.recordClassIndex(59971);
    }

    bs(bq bqVar) {
        this.f94412a = bqVar;
    }

    @Override // f.a.d.k
    public final boolean a(Object obj) {
        Aweme aweme = (Aweme) obj;
        return !n.a(aweme) && !aweme.isHotSearchAweme() && !aweme.isHotVideoAweme() && !m.g(aweme) && !g.a(aweme);
    }
}
