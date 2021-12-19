package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.dialog.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.helper.o;
import com.ss.android.ugc.aweme.feed.helper.t;
import com.ss.android.ugc.aweme.feed.i.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.u.ad;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j implements ad, h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f123754c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f123755a;

    /* renamed from: b  reason: collision with root package name */
    public final String f123756b;

    /* renamed from: d  reason: collision with root package name */
    private final String f123757d;

    static {
        Covode.recordClassIndex(81228);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.dhi;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "dislike";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_broken_heart;
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
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return R.raw.icon_heart_broken;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81229);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f123758a;

        static {
            Covode.recordClassIndex(81230);
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.dialog.d
        public final void a() {
            c.a(new e(this.f123758a.f123755a, this.f123758a.f123756b));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(j jVar) {
            this.f123758a = jVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.ad
    public final void h() {
        Context a2;
        if (f.j() != null) {
            a2 = f.j();
        } else {
            a2 = com.bytedance.ies.ugc.appcontext.d.a();
        }
        if (!a(this.f123755a)) {
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            aj<Boolean> hasLongPressDislike = inst.getHasLongPressDislike();
            l.b(hasLongPressDislike, "");
            Boolean c2 = hasLongPressDislike.c();
            l.b(c2, "");
            if (c2.booleanValue() || l.a((Object) this.f123756b, (Object) "long_video_detail_page") || l.a((Object) this.f123756b, (Object) "homepage_long_video")) {
                new com.ss.android.ugc.aweme.tux.a.i.a(a2).a(R.string.b9c).a();
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(a2).a(R.string.d0w).a();
            }
        }
        if ((!l.a((Object) this.f123756b, (Object) "long_video_detail_page")) && (!l.a((Object) this.f123756b, (Object) "homepage_long_video")) && !a(this.f123755a)) {
            c.a(new e(this.f123755a, this.f123756b, e.f93471e));
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    private static boolean a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        com.ss.android.ugc.aweme.commercialize.model.b dislikeInfo;
        if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.getEnable() != 1) {
            return false;
        }
        return true;
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public j(Aweme aweme, String str) {
        this(aweme, str, "click_share_button");
        l.d(aweme, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        int i2;
        IFeedAdService c2;
        androidx.fragment.app.d a2;
        ITalentAdRevenueShareService e2;
        l.d(context, "");
        l.d(sharePackage, "");
        int a3 = com.ss.android.ugc.aweme.app.c.c.a(this.f123756b);
        if (this.f123755a.getAuthor() != null) {
            User author = this.f123755a.getAuthor();
            l.b(author, "");
            i2 = author.getFollowStatus();
        } else {
            i2 = -1;
        }
        k a4 = new k().a(this.f123756b);
        a4.f109578a = ac.e(this.f123755a);
        a4.f109579b = ac.a(this.f123755a);
        a4.f109580c = this.f123757d;
        a4.f109582e = ac.g(this.f123755a);
        a4.f109581d = ac.b(this.f123755a);
        a4.p = "detail";
        a4.q = this.f123755a.isForwardAweme() ? 1 : 0;
        a4.r = ac.e(this.f123755a.getForwardItem());
        a4.s = ac.a(this.f123755a.getForwardItem());
        com.ss.android.ugc.aweme.metrics.c a5 = com.ss.android.ugc.aweme.upvote.event.c.a(eu.a(a4, this.f123755a.getAuthor()), this.f123755a, this.f123756b);
        Aweme aweme = this.f123755a;
        l.d(a5, "");
        if (aweme != null && com.ss.android.ugc.aweme.story.d.a.g(aweme)) {
            a5.a("story_type", "story");
            a5.a("story_collection_id", com.ss.android.ugc.aweme.story.d.a.b(aweme));
        }
        k kVar = (k) a5;
        kVar.V = i2;
        kVar.f();
        AwemeRawAd awemeRawAd = this.f123755a.getAwemeRawAd();
        if (!(awemeRawAd == null || (e2 = TalentAdRevenueShareServiceImpl.e()) == null)) {
            l.b(awemeRawAd, "");
            e2.a(awemeRawAd);
        }
        if (!TextUtils.isEmpty(this.f123756b) && !TextUtils.isEmpty(this.f123755a.getAid())) {
            String aid = this.f123755a.getAid();
            l.b(aid, "");
            t.a(new o(aid, 2, System.currentTimeMillis(), this.f123756b));
            String aid2 = this.f123755a.getAid();
            l.b(aid2, "");
            t.a(new o(aid2, 3, System.currentTimeMillis(), this.f123756b));
        }
        com.ss.android.ugc.aweme.share.g.a.b bVar = new com.ss.android.ugc.aweme.share.g.a.b();
        bVar.a(new com.ss.android.ugc.aweme.share.g.a.a());
        bVar.a_(this);
        bVar.a(this.f123755a, Integer.valueOf(a3));
        if (a(this.f123755a) && (context instanceof androidx.fragment.app.e) && (c2 = FeedAdServiceImpl.c()) != null && (a2 = c2.a(this.f123755a.getAwemeRawAd(), this.f123755a.getAid(), new b(this))) != null) {
            a2.setCancelable(true);
            a2.show(((androidx.fragment.app.e) context).getSupportFragmentManager(), "feed_ad_dislike_sub_reason_dialog");
        }
    }

    public j(Aweme aweme, String str, String str2) {
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        this.f123755a = aweme;
        this.f123756b = str;
        this.f123757d = str2;
    }
}
