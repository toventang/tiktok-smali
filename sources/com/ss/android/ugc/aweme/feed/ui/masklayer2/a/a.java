package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.f;
import h.f.b.l;

public final class a extends n {

    /* renamed from: a  reason: collision with root package name */
    private final f f94867a;

    /* renamed from: b  reason: collision with root package name */
    private final e f94868b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f94869c;

    /* renamed from: d  reason: collision with root package name */
    private final String f94870d;

    static {
        Covode.recordClassIndex(60170);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void b(View view) {
        l.d(view, "");
        this.f94867a.a("adExplain");
        super.b(view);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void a(View view) {
        Long l2;
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        l.d(view, "");
        Aweme aweme = this.f94901f;
        if (aweme == null || aweme.isAd()) {
            Aweme aweme2 = this.f94901f;
            AwemeRawAd awemeRawAd4 = null;
            if (aweme2 != null && aweme2.getAwemeRawAd() != null) {
                Aweme aweme3 = this.f94901f;
                if ((aweme3 == null || (awemeRawAd3 = aweme3.getAwemeRawAd()) == null || awemeRawAd3.isShowDisplayWhyThisAd()) && com.bytedance.ies.ugc.appcontext.f.j() != null) {
                    Aweme aweme4 = this.f94901f;
                    if (aweme4 == null || (awemeRawAd2 = aweme4.getAwemeRawAd()) == null) {
                        l2 = null;
                    } else {
                        l2 = awemeRawAd2.getCreativeId();
                    }
                    String valueOf = String.valueOf(l2);
                    Aweme aweme5 = this.f94869c;
                    if (aweme5 == null || (awemeRawAd = aweme5.getAwemeRawAd()) == null) {
                        str = null;
                    } else {
                        str = awemeRawAd.getLogExtra();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", valueOf, str, null).b("refer", "about_tiktok_ads").a("enter_from", "long_press").b();
                    IFeedAdService c2 = FeedAdServiceImpl.c();
                    e eVar = this.f94868b;
                    Aweme aweme6 = this.f94869c;
                    if (aweme6 != null) {
                        awemeRawAd4 = aweme6.getAwemeRawAd();
                    }
                    c2.a(eVar, awemeRawAd4, this.f94870d);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.ss.android.ugc.aweme.feed.ui.masklayer2.a aVar, f fVar, e eVar, Aweme aweme, String str) {
        super(aVar, fVar);
        l.d(aVar, "");
        l.d(fVar, "");
        l.d(eVar, "");
        l.d(str, "");
        this.f94867a = fVar;
        this.f94868b = eVar;
        this.f94869c = aweme;
        this.f94870d = str;
    }
}
