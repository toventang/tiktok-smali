package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.utils.eu;

public final class k extends h<k> {
    private AwemeRelationRecommendModel X;

    /* renamed from: a  reason: collision with root package name */
    public String f109578a;

    /* renamed from: b  reason: collision with root package name */
    public String f109579b;

    /* renamed from: c  reason: collision with root package name */
    public String f109580c;

    /* renamed from: d  reason: collision with root package name */
    public String f109581d;

    /* renamed from: e  reason: collision with root package name */
    public String f109582e;
    public String p;
    public int q;
    public String r;
    public String s;
    public String t;
    private String u;
    private int v;

    static {
        Covode.recordClassIndex(70136);
    }

    public k() {
        super("dislike");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("group_id", this.f109578a, c.a.f109563b);
        a("author_id", this.f109579b, c.a.f109563b);
        a("enter_method", this.f109580c, c.a.f109562a);
        if (g.a().a(this.f109578a)) {
            a("previous_page", "push", c.a.f109562a);
        }
        if (ac.a(this.f109556h)) {
            h(this.f109581d);
        }
        if (!TextUtils.isEmpty(this.u)) {
            a("impr_type", this.u, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.f109582e)) {
            a("content_type", this.f109582e, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.p)) {
            a("display_method", this.p, c.a.f109562a);
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.X;
        if (awemeRelationRecommendModel != null) {
            a("rec_type", awemeRelationRecommendModel.getRecType());
            a("relation_type", this.X.getFriendTypeStr());
        }
        if (!TextUtils.isEmpty(this.t)) {
            a("follow_status", this.t, c.a.f109562a);
        }
        a("is_reposted", new StringBuilder().append(this.q).toString());
        a("repost_from_group_id", this.r);
        a("repost_from_user_id", this.s);
        a("is_promoted", this.v);
    }

    public final k a(String str) {
        this.f109556h = str;
        return this;
    }

    /* renamed from: f */
    public final k g(Aweme aweme) {
        super.g(aweme);
        this.u = ac.j(aweme);
        if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
            this.v = 1;
        }
        this.X = aweme.getRelationRecommendInfo();
        eu.a(this, aweme.getAuthor());
        return this;
    }
}
