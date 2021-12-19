package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.push.g;

public final class w extends h<w> {

    /* renamed from: a  reason: collision with root package name */
    public String f109609a;

    /* renamed from: b  reason: collision with root package name */
    public String f109610b;

    /* renamed from: c  reason: collision with root package name */
    public String f109611c;

    /* renamed from: d  reason: collision with root package name */
    public String f109612d;

    /* renamed from: e  reason: collision with root package name */
    private String f109613e;
    private String p;
    private String q;
    private String r;
    private String s;

    static {
        Covode.recordClassIndex(70151);
    }

    public w() {
        super("unlogin_follow");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("previous_page", this.f109609a, c.a.f109562a);
        a("previous_page_position", this.f109610b, c.a.f109562a);
        a("enter_method", this.f109612d, c.a.f109562a);
        a("to_user_id", this.f109611c, c.a.f109563b);
        a("group_id", this.f109613e, c.a.f109563b);
        a("author_id", this.f109611c, c.a.f109563b);
        a("request_id", this.p, c.a.f109563b);
        a("enter_type", this.r, c.a.f109562a);
        if (!TextUtils.isEmpty(this.q)) {
            a("enter_from_request", this.q, c.a.f109563b);
        }
        if (ac.a(this.f109556h) || "homepage_hot".equals(this.f109609a)) {
            h(this.p);
        }
        if (!TextUtils.equals(this.f109554f, "follow_cancel")) {
            TextUtils.equals(this.f109554f, "unlogin_follow");
        }
        if (g.a().a(this.f109613e)) {
            a("previous_page", "push", c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.s)) {
            a("impr_type", this.s, c.a.f109562a);
        }
    }

    public final w a(String str) {
        this.f109556h = str;
        return this;
    }

    public final w c(Aweme aweme, int i2) {
        super.g(aweme);
        if (aweme != null) {
            this.f109613e = aweme.getAid();
            this.p = a(aweme, i2);
            this.f109611c = aweme.getAuthorUid();
            this.s = ac.j(aweme);
        }
        return this;
    }
}
