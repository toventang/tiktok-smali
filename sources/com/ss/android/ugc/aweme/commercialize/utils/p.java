package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements n.a {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f75802a;

    static {
        Covode.recordClassIndex(46749);
    }

    p(Aweme aweme) {
        this.f75802a = aweme;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.n.a
    public final void sendLog(boolean z) {
        Aweme aweme = this.f75802a;
        if (z) {
            a.a("result_ad", "deeplink_success", aweme.getAwemeRawAd()).b("refer", "button").c();
        } else {
            a.a("result_ad", "deeplink_failed", aweme.getAwemeRawAd()).b("refer", "button").c();
        }
    }
}
