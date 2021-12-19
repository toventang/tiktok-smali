package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.friends.e;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.w.a;

public final class v extends h<v> {
    public String X;
    public String Y;
    public String Z = "";

    /* renamed from: a  reason: collision with root package name */
    public String f109604a;
    private boolean aA;
    private String aB = "";
    private int aC;
    public int aa = -1;
    public int ab = -1;
    public AwemeRelationRecommendModel ac;
    public boolean ad;
    public int ae = -1;
    public String af = "";
    public String ag;
    public int ah;
    private String ai;
    private String aj;
    private String ak;
    private String al;
    private String am;
    private String an;
    private int ao;
    private String ap;
    private String aq;
    private int ar;
    private String as;
    private String at;
    private String au;
    private String av;
    private String aw;
    private String ax;
    private String ay;
    private int az = -1;

    /* renamed from: b  reason: collision with root package name */
    public String f109605b;

    /* renamed from: c  reason: collision with root package name */
    public String f109606c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f109607d;

    /* renamed from: e  reason: collision with root package name */
    public String f109608e;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;

    static {
        Covode.recordClassIndex(70150);
    }

    public v() {
        super("follow");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("scene_id", this.f109604a, c.a.f109562a);
        a("previous_page", this.f109605b, c.a.f109562a);
        a("previous_page_position", this.f109606c, c.a.f109562a);
        if (this.f109607d) {
            a("is_instructive", "1", c.a.f109562a);
            a("bottom_bar_show", "1", c.a.f109562a);
        }
        a("enter_method", this.s, c.a.f109562a);
        a("to_user_id", this.f109608e, c.a.f109563b);
        a("group_id", this.p, c.a.f109563b);
        a("author_id", this.f109608e, c.a.f109563b);
        a("author_id", this.f109608e, c.a.f109563b);
        a("follow_type", this.v, c.a.f109562a);
        a("page_status", this.an, c.a.f109562a);
        a("request_id", this.q, c.a.f109563b);
        a("req_id", this.r, c.a.f109563b);
        a("enter_type", this.aj, c.a.f109562a);
        a("is_reposted", new StringBuilder().append(this.ao).toString());
        a("repost_from_group_id", this.ap);
        a("repost_from_user_id", this.aq);
        a("is_search_scene", this.ah);
        if (!TextUtils.isEmpty(this.ai)) {
            a("enter_from_request", this.ai, c.a.f109563b);
        }
        if (!TextUtils.isEmpty(this.Z)) {
            a("homepage_user_id", this.Z);
        }
        if (ac.a(this.f109556h) || "homepage_hot".equals(this.f109605b) || "potential_friends".equals(this.f109605b) || "homepage_familiar".equals(this.f109605b)) {
            h(this.q);
        }
        TextUtils.equals(this.f109554f, "follow_cancel");
        if (g.a().a(this.p)) {
            a("previous_page", "push", c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.al)) {
            a(this.al, this.am, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ak)) {
            a("playlist_type", this.ak, c.a.f109562a);
        }
        if (TextUtils.equals(this.f109556h, "homepage_fresh") || TextUtils.equals(this.f109556h, "homepage_channel")) {
            a.a();
        }
        if (!TextUtils.isEmpty(this.u)) {
            a("rule_id", this.u, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.as)) {
            a("impr_type", this.as, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.at)) {
            a("compilation_id", this.at, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aw)) {
            a("card_type", this.aw, c.a.f109562a);
        }
        if (i.f79764a) {
            a("is_fullscreen", "1");
        }
        if (TextUtils.equals("homepage_familiar", this.f109556h)) {
            a("video_type", this.av);
        }
        if (!TextUtils.isEmpty(this.au)) {
            a("search_keyword", this.au);
        }
        if (e.b() && this.ar != 0) {
            a("is_avatar", e.c());
        }
        if (TextUtils.equals(this.f109556h, "others_homepage") && !TextUtils.isEmpty(this.C)) {
            a("rec_type", this.C, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ax)) {
            a("cid", this.ax);
        }
        if (!TextUtils.isEmpty(this.X)) {
            a("tag_id", this.X);
        }
        if (!TextUtils.isEmpty(this.Y)) {
            a("parent_tag_id", this.Y);
        }
        if (!TextUtils.isEmpty(this.ay)) {
            a("log_extra", this.ay);
        }
        int i2 = this.az;
        if (i2 != -1) {
            a("is_child_mode", String.valueOf(i2));
        }
        if (this.aA) {
            a("is_live_record", "1");
        }
        int i3 = this.aa;
        if (i3 != -1) {
            a("is_private", String.valueOf(i3));
        }
        int i4 = this.ab;
        if (i4 != -1) {
            a("cancel_type", String.valueOf(i4));
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.ac;
        if (awemeRelationRecommendModel != null) {
            a("rec_type", awemeRelationRecommendModel.getRecType());
            a("relation_type", this.ac.getFriendTypeStr());
        }
        a("is_highlighted", String.valueOf(this.ad));
        a("rank_index", String.valueOf(this.ae));
        if (!TextUtils.isEmpty(this.aB)) {
            a("playlist_id", this.aB);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            a("account_type", this.ag);
        }
        if (!TextUtils.isEmpty(this.af)) {
            a("category_name", this.af);
        }
        String str = this.t;
        if (str != null && !TextUtils.isEmpty(str)) {
            a("sub_page", this.t);
        }
        a("is_long", this.aC);
    }

    public final v a(String str) {
        this.f109556h = str;
        return this;
    }

    public final v a(User user) {
        return (v) eu.a(this, user);
    }

    public v(String str) {
        super(str);
        this.f109559k = true;
    }

    public final v c(Aweme aweme, int i2) {
        super.g(aweme);
        if (aweme != null) {
            this.p = aweme.getAid();
            this.q = a(aweme, i2);
            this.f109608e = aweme.getAuthorUid();
            this.as = ac.j(aweme);
            if (aweme.getMixInfo() != null) {
                this.at = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.ar = aweme.getMutualRelation().getMutualType();
            }
            this.av = ac.k(aweme);
            this.C = ac.m(aweme);
            this.D = ac.n(aweme);
            this.ac = aweme.getRelationRecommendInfo();
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                this.aB = aweme.playlist_info.getMixId();
            }
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.aC = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.aC = 1;
            }
        }
        return this;
    }
}
