package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.commercialize.utils.av;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aw implements av.a {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeRawAd f75620a;

    static {
        Covode.recordClassIndex(46646);
    }

    aw(AwemeRawAd awemeRawAd) {
        this.f75620a = awemeRawAd;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.av.a
    public final void a(boolean z) {
        AwemeRawAd awemeRawAd = this.f75620a;
        if (z) {
            av.a(d.a(), "landing_deeplink_success", awemeRawAd);
            if (b.a() != null) {
                b.a().a("landing_ad", awemeRawAd);
                return;
            }
            return;
        }
        av.a(d.a(), "landing_deeplink_failed", awemeRawAd);
    }
}
