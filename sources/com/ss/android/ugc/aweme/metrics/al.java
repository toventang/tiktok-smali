package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.w.a;

public final class al extends c {
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private Aweme F;
    private String G;
    private String H;

    /* renamed from: a  reason: collision with root package name */
    public String f109493a;

    /* renamed from: b  reason: collision with root package name */
    public String f109494b;

    /* renamed from: c  reason: collision with root package name */
    public String f109495c;

    /* renamed from: d  reason: collision with root package name */
    public String f109496d;

    /* renamed from: e  reason: collision with root package name */
    public String f109497e;
    public String p;
    public String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private Long w;
    private String x;
    private String y;
    private String z;

    static {
        Covode.recordClassIndex(70107);
    }

    public al() {
        super("client_show");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        if (!TextUtils.isEmpty(this.r)) {
            a("content_type", this.r);
        }
        if (!TextUtils.isEmpty(this.C)) {
            a("rank_index", this.C, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.D)) {
            a("banner_id", this.D, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.E)) {
            a("previous_page", this.E, c.a.f109562a);
        }
        a("enter_from", this.f109556h, c.a.f109562a);
        a("group_id", this.s, c.a.f109563b);
        a("author_id", this.t, c.a.f109563b);
        if (!TextUtils.isEmpty(this.H)) {
            a("topic_name", this.H, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.q)) {
            a("tab_name", this.q, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.u)) {
            a("repost_from_group_id", this.u);
        }
        if (!TextUtils.isEmpty(this.v)) {
            a("repost_from_user_id", this.v);
        }
        if (TextUtils.equals(this.f109556h, "homepage_fresh")) {
            a.a();
        }
        if (TextUtils.equals(this.f109556h, "sticker_profile_detail")) {
            a("tab_name", "effect", c.a.f109562a);
        }
        a("request_id", this.A, c.a.f109563b);
        a("content", this.z, c.a.f109562a);
        if ("prop_page".equals(this.f109556h)) {
            a("prop_id", this.x, c.a.f109563b);
            a("log_pb", ac.a.f91473a.a(this.A), c.a.f109563b);
        } else {
            a("music_id", String.valueOf(this.w), c.a.f109563b);
            if ("homepage_fresh".equals(this.f109556h) || "homepage_channel".equalsIgnoreCase(this.f109556h)) {
                h(this.A);
            }
        }
        a("display", this.f109493a, c.a.f109562a);
        if (!TextUtils.isEmpty(this.B)) {
            a("distance_km", this.B, c.a.f109562a);
        }
        String str = this.f109556h;
        String str2 = this.f109495c;
        String str3 = this.f109497e;
        String str4 = this.f109496d;
        if (TextUtils.equals("challenge", str)) {
            a("process_id", str2);
            a("tag_id", str3);
            a("rank_index", str4);
        }
        if (!TextUtils.isEmpty(this.G)) {
            a("parent_tag_id", this.p, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.G)) {
            a("page_type", this.G, c.a.f109562a);
        }
    }

    public final al a(String str) {
        this.f109556h = str;
        return this;
    }

    public final al c(Aweme aweme, int i2) {
        this.F = aweme;
        if (aweme != null) {
            this.r = aweme.getLiveType();
            this.s = aweme.getAid();
            this.t = c(aweme);
            this.A = a(aweme, i2);
            this.z = d(aweme);
            this.w = e(aweme);
            this.y = aweme.getAid();
            if (aweme.isForwardAweme()) {
                this.u = aweme.getRepostFromGroupId();
                this.v = aweme.getRepostFromUserId();
            }
            if (aweme.getHotListStruct() != null && aweme.getHotListStruct().getType() == 9) {
                this.H = aweme.getHotListStruct().getTitile();
            }
        }
        return this;
    }
}
