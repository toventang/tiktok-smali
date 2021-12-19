package com.ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    private final c f124038a;

    static {
        Covode.recordClassIndex(81439);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.a, com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_question_mark_circle_ltr;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(c cVar) {
        super(cVar);
        l.d(cVar, "");
        this.f124038a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.a, com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        AwemeRawAd awemeRawAd;
        Long l2;
        String str;
        l.d(context, "");
        l.d(sharePackage, "");
        Aweme b2 = AwemeService.b().b(this.f124038a.M);
        if (b2 != null && b2.isAd() && b2.getAwemeRawAd() != null && (awemeRawAd = b2.getAwemeRawAd()) != null && awemeRawAd.isShowDisplayWhyThisAd()) {
            Activity a2 = b.a(context);
            if (a2 instanceof e) {
                AwemeRawAd awemeRawAd2 = b2.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    l2 = awemeRawAd2.getCreativeId();
                } else {
                    l2 = null;
                }
                String valueOf = String.valueOf(l2);
                AwemeRawAd awemeRawAd3 = b2.getAwemeRawAd();
                if (awemeRawAd3 != null) {
                    str = awemeRawAd3.getLogExtra();
                } else {
                    str = null;
                }
                a.a("draw_ad", "otherclick", valueOf, str, null).b("refer", "about_tiktok_ads").a("enter_from", "long_press").b();
                FeedAdServiceImpl.c().a((e) a2, b2.getAwemeRawAd(), "long_press");
            }
        }
    }
}
