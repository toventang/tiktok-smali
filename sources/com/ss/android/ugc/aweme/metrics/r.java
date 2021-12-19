package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.w.a;

public final class r extends a<r> {
    public String X;
    public String Y;
    public boolean Z;
    public String aa;
    public String ab;
    private String ac;
    private String ad;
    private String ae;
    private Aweme af;
    private String ag;
    private String ah;
    private String ai;
    private String aj;
    private boolean ak;
    private String al;
    private String am;
    private String an;
    private String ao;

    /* renamed from: e  reason: collision with root package name */
    public String f109595e;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;

    static {
        Covode.recordClassIndex(70143);
    }

    public r() {
        super("enter_tag_detail");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str;
        a("group_id", this.f109595e, c.a.f109563b);
        a("author_id", this.p, c.a.f109563b);
        a("tag_id", this.q, c.a.f109563b);
        a("request_id", this.ac, c.a.f109562a);
        a("category_name", this.ab, c.a.f109562a);
        try {
            this.ao = ChallengeUtilApi.a(this.q);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!m.a(this.ad)) {
            a("content_type", this.ad, c.a.f109562a);
        }
        a(ForwardStatisticsServiceImpl.b().a(this.af, this.ae));
        if (g.a().a(this.f109595e)) {
            a("previous_page", "push", c.a.f109562a);
        } else if (!TextUtils.isEmpty(this.X)) {
            a("previous_page", this.X, c.a.f109562a);
            a("previous_page_position", this.Y, c.a.f109562a);
        }
        if (this.Z) {
            a("is_instructive", "1", c.a.f109562a);
            a("bottom_bar_show", "1", c.a.f109562a);
        }
        if (ac.a(this.f109556h)) {
            h(this.ac);
        }
        if (!TextUtils.isEmpty(this.u)) {
            a(this.u, this.v, c.a.f109562a);
        }
        if (TextUtils.equals(this.f109556h, "homepage_fresh") || TextUtils.equals(this.f109556h, "homepage_channel")) {
            a.a();
        }
        if (!TextUtils.isEmpty(this.t)) {
            a("playlist_type", this.t, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            a("impr_type", this.ag, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ah)) {
            a("compilation_id", this.ah, c.a.f109562a);
        }
        a("impr_id", this.ac);
        if (i.f79764a) {
            a("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(this.ai)) {
            a("search_keyword", this.ai, c.a.f109562a);
        }
        if (TextUtils.equals("homepage_familiar", this.f109556h)) {
            if (this.ak) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            a("relation_type", str);
            a("video_type", this.al);
            a("rec_uid", this.am);
        }
        String str2 = this.r;
        if (!TextUtils.isEmpty(str2)) {
            a("process_id", str2);
        }
        if (!TextUtils.isEmpty(this.x)) {
            a("tab_name", this.x);
        }
        if (!TextUtils.isEmpty(this.an)) {
            a("hashtag", this.an);
        }
        if (!TextUtils.isEmpty(this.aa)) {
            a("parent_tag_id", this.aa);
        }
        if (!TextUtils.isEmpty(this.aj)) {
            a("search_type", this.aj);
        }
        if (!TextUtils.isEmpty(this.s)) {
            a("tag_line", this.s);
        }
        if (!TextUtils.isEmpty(this.y)) {
            a("order", this.y);
        }
        a("is_bundled", !TextUtils.isEmpty(this.ao) ? 1 : 0);
        if (!TextUtils.isEmpty(this.ao)) {
            a("prop_id", this.ao);
        }
    }

    public final r o(String str) {
        this.f109556h = str;
        return this;
    }

    public final r p(String str) {
        if (!m.a(str)) {
            this.ac = str;
        }
        return this;
    }

    /* renamed from: f */
    public final r g(Aweme aweme) {
        String str;
        super.g(aweme);
        if (aweme != null) {
            this.af = aweme;
            this.f109595e = aweme.getAid();
            if (TextUtils.isEmpty(this.ac)) {
                this.ac = aweme.getRequestId();
            }
            if (aweme.getAuthor() != null) {
                str = aweme.getAuthor().getUid();
            } else {
                str = "";
            }
            this.p = str;
            this.ad = ac.g(aweme);
            this.ag = ac.j(aweme);
            if (aweme.getMixInfo() != null) {
                this.ah = aweme.getMixInfo().mixId;
            }
            this.ak = in.a(aweme);
            this.al = ac.k(aweme);
            this.am = ac.l(aweme);
        }
        return this;
    }
}
