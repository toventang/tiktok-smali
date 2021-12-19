package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final C3202a f123577a = new C3202a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f123578b;

    /* renamed from: c  reason: collision with root package name */
    private final e f123579c;

    /* renamed from: d  reason: collision with root package name */
    private String f123580d;

    static {
        Covode.recordClassIndex(81125);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.bv0;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "ad_explain";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_question_mark_circle_ltr;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return R.raw.icon_question_mark_circle_ltr;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.a$a  reason: collision with other inner class name */
    public static final class C3202a {
        static {
            Covode.recordClassIndex(81126);
        }

        private C3202a() {
        }

        public /* synthetic */ C3202a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        Aweme aweme;
        Aweme aweme2;
        AwemeRawAd awemeRawAd;
        if (!this.f123578b.isAd() || (aweme = this.f123578b) == null || aweme.getAwemeRawAd() == null || (aweme2 = this.f123578b) == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null || !awemeRawAd.isShowDisplayWhyThisAd()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        Long l2;
        String str;
        AwemeRawAd awemeRawAd;
        l.d(context, "");
        l.d(sharePackage, "");
        Aweme aweme = this.f123578b;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            l2 = null;
        } else {
            l2 = awemeRawAd.getCreativeId();
        }
        String valueOf = String.valueOf(l2);
        AwemeRawAd awemeRawAd2 = this.f123578b.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            str = awemeRawAd2.getLogExtra();
        } else {
            str = null;
        }
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", valueOf, str, null).b("refer", "about_tiktok_ads").a("enter_from", "share_channel").b();
        FeedAdServiceImpl.c().a(this.f123579c, this.f123578b.getAwemeRawAd(), this.f123580d);
    }

    public a(Aweme aweme, e eVar, String str) {
        l.d(aweme, "");
        l.d(eVar, "");
        l.d(str, "");
        this.f123578b = aweme;
        this.f123579c = eVar;
        this.f123580d = str;
    }
}
