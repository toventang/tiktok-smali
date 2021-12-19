package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.friends.e;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.w.a;

public final class q extends a<q> {
    public String X;
    public String Y;
    public String Z;
    public boolean aa;
    public int ab;
    public String ac;
    public String ad;
    public String ae;
    private Aweme af;
    private String ag;
    private String ah;
    private String ai;
    private int aj;
    private String ak;
    private String al;
    private int am;
    private boolean an;
    private String ao;
    private String ap;
    private String aq;
    private String ar;
    private String as;
    private int at;
    private boolean au;
    private AwemeRelationRecommendModel av;
    private int aw;
    private boolean ax;
    private int ay;

    /* renamed from: e  reason: collision with root package name */
    public String f109594e;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;

    static {
        Covode.recordClassIndex(70142);
    }

    public q() {
        super("enter_personal_detail");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str;
        String str2;
        a("group_id", this.f109594e, c.a.f109563b);
        a("author_id", this.p, c.a.f109563b);
        a("to_user_id", this.q, c.a.f109563b);
        a("request_id", this.r, c.a.f109563b);
        a("req_id", this.s, c.a.f109563b);
        a(ForwardStatisticsServiceImpl.b().a(this.af, this.ag));
        a("is_reposted", new StringBuilder().append(this.aj).toString());
        a("repost_from_group_id", this.ak);
        a("repost_from_user_id", this.al);
        a("is_original_author_homepage", new StringBuilder().append(this.am).toString());
        a("relation_tag", new StringBuilder().append(this.ab).toString());
        if (this.au) {
            str = "1";
        } else {
            str = "0";
        }
        a("is_live_record", str);
        if (g.a().a(this.f109594e)) {
            a("previous_page", "push", c.a.f109562a);
        } else if (!TextUtils.isEmpty(this.Y)) {
            a("previous_page", this.Y, c.a.f109562a);
            a("previous_page_position", this.Z, c.a.f109562a);
        }
        if (this.aa) {
            a("is_instructive", "1", c.a.f109562a);
            a("bottom_bar_show", "1", c.a.f109562a);
        }
        if (TextUtils.equals(this.f109556h, "homepage_fresh") || TextUtils.equals(this.f109556h, "homepage_channel")) {
            a.a();
        }
        if (ac.a(this.f109556h)) {
            h(this.r);
        }
        if (!TextUtils.isEmpty(this.u)) {
            a(this.u, this.v, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.t)) {
            a("playlist_type", this.t, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.X)) {
            a("scene_id", this.X, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ah)) {
            a("impr_type", this.ah, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ai)) {
            a("compilation_id", this.ai, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aq)) {
            a("card_type", this.aq, c.a.f109562a);
        }
        if (i.f79764a) {
            a("is_fullscreen", "1");
        }
        if (TextUtils.equals("homepage_familiar", this.f109556h)) {
            if (this.an) {
                str2 = "follow";
            } else {
                str2 = "unfollow";
            }
            a("relation_type", str2);
            a("video_type", this.ao);
            a("rec_uid", this.ap);
        }
        if (!TextUtils.isEmpty(this.ar)) {
            a("rec_user_type", this.ar, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.as)) {
            a("follow_status", this.as);
        }
        if (!TextUtils.isEmpty(this.x)) {
            a("tab_name", this.x);
        }
        if (e.b() && this.at != 0) {
            a("is_avatar", e.c());
        }
        if (TextUtils.equals(this.f109556h, "general_search") || TextUtils.equals(this.f109556h, "search_result") || TextUtils.equals(this.f109556h, "trending_page")) {
            if (!TextUtils.isEmpty(this.ac)) {
                a("user_tag", this.ac);
            } else {
                a("user_tag", "");
            }
            if (!TextUtils.isEmpty(this.O)) {
                a("search_id", this.O);
            } else if (!TextUtils.isEmpty(this.J)) {
                a("search_id", this.J);
            } else {
                a("search_id", this.r);
            }
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.av;
        if (awemeRelationRecommendModel != null) {
            a("rec_type", awemeRelationRecommendModel.getRecType());
            a("relation_type", this.av.getFriendTypeStr());
        }
        a("is_highlighted", this.ax);
        a("rank_index", this.ay);
        a("is_promoted", this.aw);
        a("category_name", this.ad);
        String str3 = this.ae;
        if (str3 != null && !"".equals(str3)) {
            a("new_sug_session_id", this.ae);
        }
    }

    public final q o(String str) {
        this.f109556h = str;
        return this;
    }

    public final q a(User user) {
        return (q) eu.a(this, user);
    }

    /* renamed from: f */
    public final q g(Aweme aweme) {
        super.g(aweme);
        if (aweme != null) {
            this.r = ac.b(aweme);
            h(aweme);
        }
        return this;
    }

    private void h(Aweme aweme) {
        int i2;
        boolean z;
        if (aweme != null) {
            this.af = aweme;
            this.f109594e = aweme.getAid();
            this.p = c(aweme);
            this.q = aweme.getAuthorUid();
            if (aweme.getAuthor() != null) {
                i2 = aweme.getAuthor().getFollowStatus();
            } else {
                i2 = -2;
            }
            this.ab = i2;
            this.ah = ac.j(aweme);
            if (aweme.getMixInfo() != null) {
                this.ai = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.at = aweme.getMutualRelation().getMutualType();
            }
            this.an = in.a(aweme);
            this.ao = ac.k(aweme);
            this.ap = ac.l(aweme);
            this.as = aa.a(aweme);
            this.C = ac.m(aweme);
            this.D = ac.n(aweme);
            if (aweme.getAwemeType() == 63) {
                z = true;
            } else {
                z = false;
            }
            this.au = z;
            this.av = aweme.getRelationRecommendInfo();
            this.ax = aweme.isHighlighted();
            this.ay = aweme.getOriginalPos();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.aw = 1;
            }
            a(aweme.getAuthor());
        }
    }

    public final q c(Aweme aweme, int i2) {
        super.g(aweme);
        if (aweme != null) {
            this.r = a(aweme, i2);
            h(aweme);
        }
        return this;
    }
}
