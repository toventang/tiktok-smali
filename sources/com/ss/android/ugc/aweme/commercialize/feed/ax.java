package com.ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.log.aa;
import com.ss.android.ugc.aweme.commercialize.log.ah;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.log.m;
import com.ss.android.ugc.aweme.commercialize.log.p;
import com.ss.android.ugc.aweme.commercialize.log.q;
import com.ss.android.ugc.aweme.commercialize.log.r;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ax implements be {
    static {
        Covode.recordClassIndex(45765);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j2) {
        j.a(context, str, str2, jSONObject, str3, j2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void a(Collection<String> collection) {
        g.a((ah) null, collection, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final long a(AwemeRawAd awemeRawAd) {
        return j.a(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void d(Context context, Aweme aweme) {
        j.o(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void f(Context context, Aweme aweme) {
        j.i(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void g(Context context, Aweme aweme) {
        j.j(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void k(Context context, Aweme aweme) {
        j.b(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void p(Context context, Aweme aweme) {
        j.r(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void r(Context context, Aweme aweme) {
        j.s(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void s(Context context, Aweme aweme) {
        j.t(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void t(Context context, Aweme aweme) {
        j.v(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void v(Context context, Aweme aweme) {
        j.a(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void c(Context context, Aweme aweme) {
        j.a(context, aweme, (String) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void b(Context context, Aweme aweme) {
        j.d(context, "follow_cancel", aweme, j.a(context, aweme, false, (Map<String, String>) null));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void i(Context context, Aweme aweme) {
        j.b(context, "logo_show", aweme, j.a(context, aweme, false, (Map<String, String>) null));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void l(Context context, Aweme aweme) {
        j.b(context, "play_failed", aweme, j.a(context, aweme, false, (Map<String, String>) null));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void m(Context context, Aweme aweme) {
        j.d(context, "homepagelink_click", aweme, j.a(context, aweme, false, (Map<String, String>) null));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void a(Context context, Aweme aweme) {
        j.a(context, aweme, (FollowStatus) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void j(Context context, Aweme aweme) {
        j.b(context, "button_show", aweme, j.a(context, aweme, false, (Map<String, String>) null));
        j.b(context, "othershow", aweme, j.a(context, aweme, "raw ad button show refer", "button"));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void e(Context context, Aweme aweme) {
        f.b a2 = f.a();
        a2.f74804a = "draw_ad";
        a2.f74805b = "otherclick";
        a2.b(aweme).c("comment_sign").a(j.a()).a(context);
        if (aweme != null) {
            a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", "comment_sign").a(j.a()).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void h(Context context, Aweme aweme) {
        j.b(context, "logo_click", aweme, j.a(context, aweme, false, (Map<String, String>) null));
        if (b.s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new aa(awemeRawAd));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void n(Context context, Aweme aweme) {
        f.b a2 = f.a();
        a2.f74804a = "homepage_ad";
        a2.f74805b = "click_download";
        a2.b(aweme).a(context);
        if (aweme != null) {
            a.a("homepage_ad", "click_download", aweme.getAwemeRawAd()).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void o(Context context, Aweme aweme) {
        f.b a2 = f.a();
        a2.f74804a = "homepage_ad";
        a2.f74805b = "click_website";
        a2.b(aweme).a(context);
        if (aweme != null) {
            a.a("homepage_ad", "click_website", aweme.getAwemeRawAd()).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void q(Context context, Aweme aweme) {
        j.d(context, "click", aweme, j.a(context, aweme, true, (Map<String, String>) null));
        if (b.s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new m(awemeRawAd));
        }
        com.ss.android.ugc.aweme.crossplatform.business.a.a.a("homepage_ad", "button");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void u(Context context, Aweme aweme) {
        f.b a2 = f.a();
        a2.f74804a = "draw_ad";
        a2.f74805b = "otherclick";
        a2.b(aweme).c("share_sign").a(j.a()).a(context);
        a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", "share_sign").a(j.a()).c();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void a(Context context, Aweme aweme, int i2) {
        j.a(context, aweme, i2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void b(Context context, Aweme aweme, String str) {
        j.d(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final JSONObject a(Context context, JSONObject jSONObject, String str) {
        return j.a(context, jSONObject, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void a(Context context, Aweme aweme, FollowStatus followStatus) {
        j.a(context, aweme, followStatus);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void b(Context context, Banner banner, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("banner_order", Integer.valueOf(i2));
        f.b a2 = f.a();
        a2.f74805b = "click";
        f.b e2 = a2.e(banner.getLogExtra());
        e2.f74804a = "discovery_ad";
        e2.c("banner").a(Long.valueOf(banner.getCreativeId())).a(hashMap).a(context);
        a.a("discovery_ad", "click", String.valueOf(banner.getCreativeId()), banner.getLogExtra(), "0").b("refer", "banner").a("banner_order", Integer.valueOf(i2)).c();
        aj.a("click", banner.getClickTrackUrlList(), Long.valueOf(banner.getCreativeId()), banner.getLogExtra(), new JSONObject(hashMap), new r(hashMap, banner));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void b(Context context, Aweme aweme, FollowStatus followStatus) {
        JSONObject a2;
        int i2;
        if (b.Y(aweme)) {
            HashMap hashMap = new HashMap();
            int i3 = 1;
            if (followStatus == null || !followStatus.isCheating()) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            hashMap.put("is_cheated_follow", Integer.valueOf(i2));
            if (followStatus != null) {
                i3 = followStatus.followStatus;
            }
            hashMap.put("follow_status", Integer.valueOf(i3));
            a2 = j.a(context, aweme, false, j.a(hashMap));
        } else {
            a2 = j.a(context, aweme, false, (Map<String, String>) null);
        }
        j.d(context, "follow", aweme, a2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void a(Context context, Banner banner, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("banner_order", Integer.valueOf(i2));
        f.b a2 = f.a();
        a2.f74805b = "show";
        f.b e2 = a2.e(banner.getLogExtra());
        e2.f74804a = "discovery_ad";
        e2.c("banner").a(Long.valueOf(banner.getCreativeId())).a(hashMap).a(context);
        a.a("discovery_ad", "show", String.valueOf(banner.getCreativeId()), banner.getLogExtra(), "0").b("refer", "banner").a("banner_order", Integer.valueOf(i2)).c();
        aj.a("show", banner.getTrackUrlList(), Long.valueOf(banner.getCreativeId()), banner.getLogExtra(), new JSONObject(hashMap), new q(hashMap, banner));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void a(Context context, Aweme aweme, String str) {
        j.a(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void a(Context context, Aweme aweme, JSONObject jSONObject) {
        j.a(context, aweme, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void a(Context context, AwemeRawAd awemeRawAd, String str) {
        if (j.b(context, awemeRawAd) && !TextUtils.isEmpty(str)) {
            j.a(context, str, "hide_app", j.a(context, awemeRawAd, false, (Map<String, String>) null), awemeRawAd);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void b(Context context, long j2, String str, UrlModel urlModel) {
        f.b a2 = f.a();
        a2.f74805b = "click";
        f.b e2 = a2.e(str);
        e2.f74804a = "discovery_ad";
        e2.c("title").a(Long.valueOf(j2)).a(context);
        a.a("discovery_ad", "click", String.valueOf(j2), str, "0").b("refer", "title").c();
        aj.a("click", urlModel, Long.valueOf(j2), str, (h.f.a.m<? super f.b, ? super Boolean, ? extends f.b>) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void c(Context context, long j2, String str, UrlModel urlModel) {
        f.b a2 = f.a();
        a2.f74805b = "show";
        f.b e2 = a2.e(str);
        e2.f74804a = "discovery_ad";
        e2.c("hashtag").a(Long.valueOf(j2)).a(context);
        a.a("discovery_ad", "show", String.valueOf(j2), str, "0").b("refer", "hashtag").c();
        aj.a("show", urlModel, Long.valueOf(j2), str, (h.f.a.m<? super f.b, ? super Boolean, ? extends f.b>) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void a(Context context, long j2, String str, UrlModel urlModel) {
        f.b a2 = f.a();
        a2.f74805b = "video_slide";
        f.b e2 = a2.e(str);
        e2.f74804a = "discovery_ad";
        e2.c("video").a(Long.valueOf(j2)).a(context);
        a.a("discovery_ad", "video_slide", String.valueOf(j2), str, "0").b("refer", "video").c();
        f.b a3 = f.a();
        a3.f74805b = "click";
        f.b e3 = a3.e(str);
        e3.f74804a = "discovery_ad";
        e3.c("video").a(Long.valueOf(j2)).a(context);
        a.a("discovery_ad", "click", String.valueOf(j2), str, "0").b("refer", "video").c();
        aj.a("click", urlModel, Long.valueOf(j2), str, (h.f.a.m<? super f.b, ? super Boolean, ? extends f.b>) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.be
    public final void a(Context context, long j2, String str, UrlModel urlModel, String str2) {
        f.b a2 = f.a();
        a2.f74805b = "auto_full_screen";
        a2.f74804a = "discovery_ad";
        f.b e2 = a2.c("video").a(Long.valueOf(j2)).e(str);
        e2.f74808e.a("item_id", str2);
        e2.a(context);
        a.a("discovery_ad", "auto_full_screen", String.valueOf(j2), str, "0").b("item_id", str2).b("refer", "video").c();
        aj.a("click", urlModel, Long.valueOf(j2), str, p.f74829a);
    }
}
