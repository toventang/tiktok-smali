package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.follow.e.a;
import com.ss.android.ugc.aweme.friends.e;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.in;

public final class y extends h<y> {
    public String X;
    public String Y;
    public String Z;

    /* renamed from: a  reason: collision with root package name */
    public int f109619a;
    private int aA;
    public String aa;
    public String ab = "";
    public String ac = "";
    public String ad = "";
    private String ae;
    private String af;
    private String ag;
    private int ah;
    private String ai;
    private String aj;
    private int ak = 1;
    private String al;
    private String am;
    private String an;
    private boolean ao;
    private boolean ap;
    private String aq;
    private String ar;
    private String as;
    private int at;
    private int au;
    private boolean av;
    private int aw = -1;
    private AwemeRelationRecommendModel ax;
    private int ay;
    private int az;

    /* renamed from: b  reason: collision with root package name */
    public String f109620b;

    /* renamed from: c  reason: collision with root package name */
    public String f109621c;

    /* renamed from: d  reason: collision with root package name */
    public String f109622d;

    /* renamed from: e  reason: collision with root package name */
    public String f109623e;
    public String p;
    public boolean q;
    public String r;
    public String s;
    public String t;
    public int u = -1;
    public long v;

    static {
        Covode.recordClassIndex(70153);
    }

    public y() {
        super("like");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str;
        String str2;
        a("group_id", this.ae, c.a.f109563b);
        a("author_id", this.af, c.a.f109563b);
        a("request_id", this.ag, c.a.f109563b);
        a("previous_page", this.f109623e, c.a.f109562a);
        a("previous_page_position", this.p, c.a.f109562a);
        if (this.q) {
            a("is_instructive", "1", c.a.f109562a);
            a("bottom_bar_show", "1", c.a.f109562a);
        }
        a("duration", String.valueOf(this.v), c.a.f109562a);
        if ("homepage_hot".equals(this.f109556h)) {
            a("has_ad", this.aA);
        }
        if (!TextUtils.isEmpty(this.ad)) {
            a("news_id", this.ad);
        }
        if (ac.a(this.f109556h)) {
            h(this.ag);
        }
        TextUtils.equals(this.f109554f, "like_cancel");
        if (g.a().a(this.ae)) {
            a("previous_page", "push", c.a.f109562a);
        }
        if (this.ah != 0) {
            a("is_long_item", new StringBuilder().append(this.ah).toString(), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.f109621c)) {
            a(this.f109621c, this.f109622d, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.f109620b)) {
            a("playlist_type", this.f109620b, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ab) && (TextUtils.equals(this.ab, "click_comment_chain") || TextUtils.equals(this.ab, "click_comment_bubble") || TextUtils.equals(this.ab, "push"))) {
            a("comment_enter_method", this.ab);
            a("last_group_id", this.ac);
        } else if (!TextUtils.isEmpty(this.ab) && TextUtils.equals(this.ab, "notification_page")) {
            a("comment_enter_method", "notification");
            a("last_group_id", this.ac);
        } else if (!TextUtils.isEmpty(this.ab) && TextUtils.equals(this.ab, UGCMonitor.EVENT_COMMENT)) {
            a("comment_enter_method", "comment_panel");
            a("last_group_id", this.ac);
        }
        if (!TextUtils.isEmpty(this.ai)) {
            a("impr_type", this.ai, c.a.f109562a);
        }
        if (this.ao) {
            str = "1";
        } else {
            str = "0";
        }
        a("is_text_empty", str);
        if (ac.b(this.f109556h)) {
            if (!TextUtils.isEmpty(this.t)) {
                a("enter_method", this.t, c.a.f109562a);
            }
            if (!TextUtils.isEmpty(this.aj)) {
                a("content_type", this.aj, c.a.f109562a);
            }
            a("enter_fullscreen", String.valueOf(this.ak), c.a.f109562a);
            a("notice_type", a.f96227a);
            a("show_cnt", String.valueOf(a.f96228b));
            a("yellow_dot_logid", a.f96229c);
        }
        if (!TextUtils.isEmpty(this.al)) {
            a("is_reposted", "1", c.a.f109562a);
            a("repost_from_group_id", this.al, c.a.f109562a);
            a("repost_from_user_id", this.am, c.a.f109562a);
        }
        if (TextUtils.equals(this.f109556h, "homepage_fresh") || TextUtils.equals(this.f109556h, "homepage_channel")) {
            com.ss.android.ugc.aweme.w.a.a();
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
        if (!TextUtils.isEmpty(this.t)) {
            a("enter_method", this.t, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.an)) {
            a("compilation_id", this.an, c.a.f109562a);
        }
        if (this.u != -1) {
            a("is_logged_in", new StringBuilder().append(this.u).toString(), c.a.f109562a);
        }
        if (i.f79764a) {
            a("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(this.aa)) {
            a("is_fullscreen", this.aa);
        }
        if (!TextUtils.isEmpty(this.Y)) {
            a("search_keywords", this.Y);
        }
        if (!TextUtils.isEmpty(this.Z)) {
            a("search_type", this.Z);
        }
        if (!TextUtils.isEmpty(this.f109560l)) {
            a("creation_id", this.f109560l);
        }
        if (!TextUtils.isEmpty(this.r)) {
            a("tag_id", this.r);
        }
        if (!TextUtils.isEmpty(this.s)) {
            a("parent_tag_id", this.s);
        }
        if (e.b() && this.au != 0) {
            a("is_avatar", e.c());
        }
        if (!TextUtils.isEmpty(this.as)) {
            a("follow_status", this.as);
        }
        if (!TextUtils.isEmpty(this.X)) {
            a("playlist_id", this.X);
        }
        a("relation_tag", new StringBuilder().append(this.at).toString());
        a("is_highlighted", this.av);
        a("rank_index", this.aw);
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.ax;
        if (awemeRelationRecommendModel != null) {
            a("rec_type", awemeRelationRecommendModel.getRecType());
            a("relation_type", this.ax.getFriendTypeStr());
        }
        a("is_long", this.az);
        a("is_promoted", this.ay);
    }

    public final y a(String str) {
        this.f109556h = str;
        return this;
    }

    public final y o(String str) {
        this.f109560l = str;
        return this;
    }

    public y(String str) {
        super(str);
        this.f109559k = true;
    }

    /* renamed from: f */
    public final y g(Aweme aweme) {
        String a2;
        int followStatus;
        super.g(aweme);
        if (aweme != null) {
            this.ae = aweme.getAid();
            this.af = c(aweme);
            if (TextUtils.isEmpty(ac.a(aweme, this.f109619a))) {
                a2 = aweme.getRequestId();
            } else {
                a2 = ac.a(aweme, this.f109619a);
            }
            this.ag = a2;
            this.ai = ac.j(aweme);
            this.aj = ac.g(aweme);
            this.al = aweme.getRepostFromGroupId();
            this.am = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.an = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.au = aweme.getMutualRelation().getMutualType();
            }
            this.ap = in.a(aweme);
            this.aq = ac.k(aweme);
            this.ar = ac.l(aweme);
            this.as = aa.a(aweme);
            this.C = ac.m(aweme);
            this.D = ac.n(aweme);
            if (aweme.getAuthor() == null) {
                followStatus = -2;
            } else {
                followStatus = aweme.getAuthor().getFollowStatus();
            }
            this.at = followStatus;
            this.av = aweme.isHighlighted();
            this.aw = aweme.getOriginalPos();
            this.ax = aweme.getRelationRecommendInfo();
            this.aA = aweme.getHasAd();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.ay = 1;
            }
            eu.a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.az = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.az = 1;
            }
        }
        return this;
    }
}
