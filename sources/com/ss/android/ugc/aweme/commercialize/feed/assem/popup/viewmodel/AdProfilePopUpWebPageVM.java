package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.utils.aa;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.d.a.c;

public final class AdProfilePopUpWebPageVM extends AbsAdPopUpWebPageVM {
    static {
        Covode.recordClassIndex(45743);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AbsAdPopUpWebPageVM
    public final void h() {
        String str;
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        if (aa.f75533d == 1) {
            str = "slide";
        } else {
            str = "slide_down";
        }
        VideoItemParams videoItemParams = (VideoItemParams) g();
        Aweme aweme2 = null;
        if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null) {
            awemeRawAd = null;
        } else {
            awemeRawAd = aweme.getAwemeRawAd();
        }
        a.C0791a a2 = a.a("landing_ad", "close", awemeRawAd);
        String str2 = ((AbsAdPopUpWebPageVM) this).f74135k;
        if (str2 != null) {
            str = str2;
        }
        a2.b("refer", str).b();
        VideoItemParams videoItemParams2 = (VideoItemParams) g();
        if (videoItemParams2 != null) {
            aweme2 = videoItemParams2.mAweme;
        }
        if (b.aC(aweme2)) {
            c.a(new com.ss.android.ugc.aweme.profile.widgets.a.a());
        }
        a(System.currentTimeMillis() - ((AbsAdPopUpWebPageVM) this).f74136l);
    }
}
