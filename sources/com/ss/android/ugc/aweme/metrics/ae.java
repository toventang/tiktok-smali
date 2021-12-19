package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.friends.e;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.w.a;

public final class ae extends h<ae> {
    public String X;
    public boolean Y;
    public int Z = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f109469a;
    private Aweme aA;
    private String aB;
    private boolean aC;
    private String aD;
    private String aE;
    private String aF;
    private String aG;
    private int aH;
    private String aI;
    private int aJ = -1;
    private Integer aK;
    private AwemeRelationRecommendModel aL;
    private boolean aM;
    private int aN = -1;
    private int aO;
    private String aP = "";
    private int aQ;
    public int aa;
    public int ab;
    public String ac = "";
    public String ad;
    public String ae;
    public int af;
    public String ag;
    public int ah;
    public String ai;
    public String aj;
    public String ak;
    public String al;
    public String am = "";
    public int an;
    public String ao = "";
    public String ap = "";
    public int aq;
    public String ar = "";
    public String as = "";
    public String at = "";
    public String au = "";
    public String av;
    public String aw;
    private String ax;
    private String ay;
    private String az;

    /* renamed from: b  reason: collision with root package name */
    public String f109470b;

    /* renamed from: c  reason: collision with root package name */
    public String f109471c;

    /* renamed from: d  reason: collision with root package name */
    public String f109472d;

    /* renamed from: e  reason: collision with root package name */
    public String f109473e;
    public String p;
    public int q;
    public boolean r;
    public String s;
    public String t;
    public String u;
    public String v;

    static {
        Covode.recordClassIndex(70100);
    }

    public ae() {
        super("post_comment");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str;
        int i2;
        String str2;
        Aweme aweme;
        a("group_id", this.ax, c.a.f109563b);
        a("author_id", this.ay, c.a.f109563b);
        a("user_level", this.au);
        if (!TextUtils.isEmpty(this.av)) {
            a("comment_author_level", this.av);
        }
        if (!TextUtils.isEmpty(this.aw)) {
            a("reply_comment_level", this.aw);
        }
        if (!TextUtils.isEmpty(this.f109470b)) {
            a("comment_category", this.f109470b, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.f109469a)) {
            a("reply_to_comment_id", this.f109469a, c.a.f109563b);
        }
        if (ac.a(this.f109556h)) {
            h(ac.b(this.aA));
        }
        a(ForwardStatisticsServiceImpl.b().a(this.aA, this.p));
        if (g.a().a(this.ax)) {
            a("previous_page", "push", c.a.f109562a);
        } else {
            a("previous_page", this.v, c.a.f109562a);
            a("previous_page_position", this.X, c.a.f109562a);
        }
        if (this.Y) {
            a("is_instructive", "1", c.a.f109562a);
            a("bottom_bar_show", "1", c.a.f109562a);
        }
        if (this.q == 1) {
            a("is_long_item", new StringBuilder().append(this.q).toString(), c.a.f109562a);
        }
        a("is_repost_comment", new StringBuilder().append(this.aa).toString(), c.a.f109562a);
        if (!TextUtils.isEmpty(this.f109471c)) {
            a("emoji_times", this.f109471c, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.t)) {
            a(this.t, this.u, c.a.f109562a);
        }
        a("is_retry", String.valueOf(this.r ? 1 : 0), c.a.f109562a);
        if (!TextUtils.isEmpty(this.s)) {
            a("playlist_type", this.s, c.a.f109562a);
        }
        if (this.aC) {
            str = "1";
        } else {
            str = "0";
        }
        a("is_text_empty", str);
        if (!TextUtils.isEmpty(this.f109472d)) {
            a("enter_method", this.f109472d, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            a("impr_type", this.aB, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(BusinessComponentServiceUtils.getBusinessBridgeService().a()) && (TextUtils.equals(this.f109556h, "homepage_fresh") || TextUtils.equals(this.f109556h, "homepage_channel"))) {
            a.a();
        }
        if (ac.b(this.f109556h)) {
            if (!TextUtils.isEmpty(this.aD)) {
                a("content_type", this.aD, c.a.f109562a);
            }
            a("enter_fullscreen", String.valueOf(this.Z), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aE)) {
            a("is_reposted", "1", c.a.f109562a);
            a("repost_from_group_id", this.aE, c.a.f109562a);
            a("repost_from_user_id", this.aF, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aG)) {
            a("compilation_id", this.aG, c.a.f109562a);
        }
        a("request_id", ac.b(this.aA));
        if (i.f79764a) {
            a("is_fullscreen", "1");
        }
        if (this.A.booleanValue()) {
            a("is_fullscreen", "0");
        }
        if (TextUtils.equals("homepage_familiar", this.f109556h) || ((aweme = this.aA) != null && aweme.isFamiliar())) {
            a("relation_type", this.aI, c.a.f109562a);
            a("rec_uid", ac.l(this.aA), c.a.f109562a);
            a("video_type", ac.k(this.aA), c.a.f109562a);
        }
        a("label_type", this.ad);
        a("relation_label_type", this.ae);
        if (!TextUtils.isEmpty(this.f109560l)) {
            a("creation_id", this.f109560l);
        }
        int i3 = this.af;
        if (i3 != -1) {
            a("follow_status", i3);
        }
        a("send_method", this.ag);
        a("is_pure_emoji", String.valueOf(this.ah));
        a("emoji_order", this.ai);
        a("reply_comment_type", this.aj);
        a("reply_method", this.f109473e);
        a("search_id", this.O);
        a("relation_tag", new StringBuilder().append(this.aJ).toString());
        a("relation_tag_reply", new StringBuilder().append(this.ab).toString());
        Integer num = this.aK;
        if (num != null) {
            a("is_zero_comment", String.valueOf(num));
        }
        if (e.b() && (i2 = this.aH) != 0) {
            Integer valueOf = Integer.valueOf(i2);
            if (valueOf != null) {
                if (valueOf.intValue() == 1) {
                    str2 = "friends with";
                } else if (valueOf.intValue() == 2) {
                    str2 = "followed by";
                } else if (valueOf.intValue() == 3) {
                    str2 = "follows";
                }
                a("label_text", str2);
                a("is_avatar", e.c());
            }
            str2 = "";
            a("label_text", str2);
            a("is_avatar", e.c());
        }
        a("reply_uid", this.ac);
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.aL;
        if (awemeRelationRecommendModel != null) {
            a("rec_type", awemeRelationRecommendModel.getRecType());
            a("relation_type", this.aL.getFriendTypeStr());
        }
        if (!TextUtils.isEmpty(this.ak)) {
            a("tag_id", this.ak);
        }
        if (!TextUtils.isEmpty(this.at)) {
            a("news_id", this.at);
        }
        if (!TextUtils.isEmpty(this.al)) {
            a("parent_tag_id", this.al);
        }
        a("is_highlighted", this.aM);
        a("rank_index", this.aN);
        a("is_promoted", this.aO);
        if (!TextUtils.isEmpty(this.aP)) {
            a("playlist_id", this.aP);
        }
        if (!TextUtils.isEmpty(this.am)) {
            a("category_name", this.am);
        }
        a("is_long", this.aQ);
        int i4 = this.an;
        if (i4 != -1) {
            a("follow_status_to_user", i4);
        }
        if (!TextUtils.isEmpty(this.ao)) {
            a("story_type", this.ao);
        }
        if (!TextUtils.isEmpty(this.ap)) {
            a("story_collection_id", this.ap);
        }
        a("is_emoji_react", this.aq);
        if (!TextUtils.isEmpty(this.ar) && (TextUtils.equals(this.ar, "click_comment_chain") || TextUtils.equals(this.ar, "click_comment_bubble") || TextUtils.equals(this.ar, "push"))) {
            a("comment_enter_method", this.ar);
            a("last_group_id", this.as);
        } else if (!TextUtils.isEmpty(this.ar) && TextUtils.equals(this.ar, "notification_page")) {
            a("comment_enter_method", "notification");
            a("last_group_id", this.as);
        } else if (!TextUtils.isEmpty(this.ar) && TextUtils.equals(this.ar, UGCMonitor.EVENT_COMMENT)) {
            a("comment_enter_method", "comment_panel");
            a("last_group_id", this.as);
        }
    }

    public final ae a(String str) {
        this.f109556h = str;
        return this;
    }

    public final ae o(String str) {
        this.f109560l = str;
        return this;
    }

    /* renamed from: f */
    public final ae g(Aweme aweme) {
        String str;
        super.g(aweme);
        if (aweme != null) {
            this.aA = aweme;
            this.az = aweme.getAid();
            this.ax = aweme.getAid();
            this.ay = aweme.getAuthorUid();
            this.aB = ac.j(aweme);
            this.aD = ac.g(aweme);
            this.aE = aweme.getRepostFromGroupId();
            this.aF = aweme.getRepostFromUserId();
            if (in.a(aweme)) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            this.aI = str;
            if (aweme.getAuthor() != null) {
                this.aJ = aweme.getAuthor().getFollowStatus();
            }
            if (aweme.getMixInfo() != null) {
                this.aG = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.aH = aweme.getMutualRelation().getMutualType();
            }
            this.C = ac.m(aweme);
            this.D = ac.n(aweme);
            this.aL = aweme.getRelationRecommendInfo();
            this.aM = aweme.isHighlighted();
            this.aN = aweme.getOriginalPos();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.aO = 1;
            }
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                this.aP = aweme.playlist_info.getMixId();
            }
            eu.a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.aQ = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.aQ = 1;
            }
        }
        return this;
    }
}
