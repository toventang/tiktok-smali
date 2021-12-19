package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.w.a;

public final class ag extends h<ag> {
    public String X;
    public boolean Y;
    public String Z;

    /* renamed from: a  reason: collision with root package name */
    public String f109478a;
    public String aa;
    public String ab;
    public String ac = "";
    public Boolean ad = false;
    public String ae;
    public String af = "";
    public String ag = "";
    private String ah;
    private String ai;
    private Aweme aj;
    private String ak;
    private String al;
    private int am;
    private String an;
    private String ao;
    private boolean ap;
    private String aq;
    private String ar;
    private boolean as;
    private boolean at;
    private int au = -1;
    private String av = "";
    private int aw;
    private int ax;
    private AwemeRelationRecommendModel ay;
    private int az = 0;

    /* renamed from: b  reason: collision with root package name */
    public String f109479b;

    /* renamed from: c  reason: collision with root package name */
    public String f109480c;

    /* renamed from: d  reason: collision with root package name */
    public String f109481d = "normal_share";

    /* renamed from: e  reason: collision with root package name */
    public int f109482e;
    public int p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;

    static {
        Covode.recordClassIndex(70102);
    }

    public ag() {
        super("share_video");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str;
        String str2;
        a("group_id", this.f109478a, c.a.f109563b);
        a("author_id", this.f109479b, c.a.f109563b);
        a("platform", this.f109480c, c.a.f109562a);
        a("content_type", this.ah, c.a.f109562a);
        a("share_mode", this.ai, c.a.f109562a);
        a("reflow_flag", String.valueOf(this.p), c.a.f109562a);
        a("enter_method", this.f109481d, c.a.f109562a);
        if ("homepage_hot".equals(this.f109556h)) {
            a("has_ad", this.az);
        }
        if (ac.a(this.f109556h)) {
            h(ac.b(this.aj));
        }
        if (this.f109482e != 0) {
            a("is_long_item", new StringBuilder().append(this.f109482e).toString(), c.a.f109562a);
        }
        a(ForwardStatisticsServiceImpl.b().a(this.aj, ForwardStatisticsServiceImpl.b().a()));
        if (g.a().a(this.f109478a)) {
            a("previous_page", "push", c.a.f109562a);
        } else {
            a("previous_page", this.v, c.a.f109562a);
            a("previous_page_position", this.X, c.a.f109562a);
        }
        if (this.Y) {
            a("is_instructive", "1", c.a.f109562a);
            a("bottom_bar_show", "1", c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.q)) {
            a("share_url", this.q, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.r)) {
            a("news_id", this.r, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.t)) {
            a(this.t, this.u, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.s)) {
            a("playlist_type", this.s, c.a.f109562a);
        }
        if (TextUtils.equals(this.f109556h, "homepage_fresh") || TextUtils.equals(this.f109556h, "homepage_channel")) {
            a.a();
        }
        a("sector", this.ak, c.a.f109562a);
        if (!TextUtils.isEmpty(this.al)) {
            a("impr_type", this.al, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.an)) {
            a("is_reposted", new StringBuilder().append(this.am).toString(), c.a.f109562a);
            a("repost_from_group_id", this.an, c.a.f109562a);
            a("repost_from_user_id", this.ao, c.a.f109562a);
        }
        if (this.as) {
            str = "1";
        } else {
            str = "0";
        }
        a("is_horizontal_screen", str);
        a("request_id", ac.b(this.aj), c.a.f109563b);
        if (i.f79764a) {
            a("is_fullscreen", "1");
        }
        if (TextUtils.equals("homepage_familiar", this.f109556h)) {
            if (this.ap) {
                str2 = "follow";
            } else {
                str2 = "unfollow";
            }
            a("relation_type", str2);
            a("video_type", this.aq);
            a("rec_uid", this.ar);
        }
        if (!TextUtils.isEmpty(this.f109560l)) {
            a("creation_id", this.f109560l);
        }
        if (!TextUtils.isEmpty(this.Z)) {
            a("share_form", this.Z);
        }
        if (!TextUtils.isEmpty(this.aa)) {
            a("tag_id", this.aa);
        }
        if (!TextUtils.isEmpty(this.ab)) {
            a("parent_tag_id", this.ab);
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.ay;
        if (awemeRelationRecommendModel != null) {
            a("rec_type", awemeRelationRecommendModel.getRecType());
            a("relation_type", this.ay.getFriendTypeStr());
        }
        a("is_highlighted", this.at);
        a("rank_index", this.au);
        a("is_promoted", this.ax);
        if (!TextUtils.isEmpty(this.av)) {
            a("playlist_id", this.av);
        }
        if (!TextUtils.isEmpty(this.ac)) {
            a("category_name", this.ac);
        }
        a("is_long", this.aw);
        if (!TextUtils.isEmpty(this.af) && (TextUtils.equals(this.af, "click_comment_chain") || TextUtils.equals(this.af, "click_comment_bubble") || TextUtils.equals(this.af, "push"))) {
            a("comment_enter_method", this.af);
            a("last_group_id", this.ag);
        } else if (!TextUtils.isEmpty(this.af) && TextUtils.equals(this.af, "notification_page")) {
            a("comment_enter_method", "notification");
            a("last_group_id", this.ag);
        } else if (!TextUtils.isEmpty(this.af) && TextUtils.equals(this.af, UGCMonitor.EVENT_COMMENT)) {
            a("comment_enter_method", "comment_panel");
            a("last_group_id", this.ag);
        }
        if (this.ad.booleanValue()) {
            a("story_type", "story");
        } else {
            a("story_type", UGCMonitor.TYPE_POST);
        }
        if (!TextUtils.isEmpty(this.ae)) {
            a("story_collection_id", this.ae);
        }
    }

    public final ag a(String str) {
        this.f109556h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.ss.android.ugc.aweme.metrics.h
    public final /* bridge */ /* synthetic */ ag b_(String str) {
        this.ae = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.ss.android.ugc.aweme.metrics.h
    public final /* bridge */ /* synthetic */ ag m(String str) {
        this.r = str;
        return this;
    }

    public final ag o(String str) {
        this.f109560l = str;
        return this;
    }

    /* renamed from: f */
    public final ag g(Aweme aweme) {
        super.g(aweme);
        if (aweme != null) {
            this.aj = aweme;
            this.f109478a = aweme.getAid();
            this.f109479b = c(aweme);
            this.ah = ac.g(aweme);
            this.al = ac.j(aweme);
            this.am = aweme.isForwardAweme() ? 1 : 0;
            this.an = aweme.getRepostFromGroupId();
            this.ao = aweme.getRepostFromUserId();
            this.ap = in.a(aweme);
            this.aq = ac.k(aweme);
            this.ar = ac.l(aweme);
            this.at = aweme.isHighlighted();
            this.au = aweme.getOriginalPos();
            this.ay = aweme.getRelationRecommendInfo();
            this.az = aweme.getHasAd();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.ax = 1;
            }
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                this.av = aweme.playlist_info.getMixId();
            }
            eu.a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.aw = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.aw = 1;
            }
        }
        return this;
    }
}
