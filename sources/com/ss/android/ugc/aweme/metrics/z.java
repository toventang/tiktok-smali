package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.push.g;

public final class z extends h<z> {

    /* renamed from: a  reason: collision with root package name */
    public String f109624a;

    /* renamed from: b  reason: collision with root package name */
    public String f109625b;

    /* renamed from: c  reason: collision with root package name */
    public int f109626c;

    /* renamed from: d  reason: collision with root package name */
    public int f109627d;

    /* renamed from: e  reason: collision with root package name */
    public int f109628e;
    private String p;
    private String q;

    static {
        Covode.recordClassIndex(70154);
    }

    public z() {
        super("unlogin_like");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("group_id", this.f109624a, c.a.f109563b);
        a("author_id", this.p, c.a.f109563b);
        a("request_id", this.q, c.a.f109563b);
        if (ac.a(this.f109556h)) {
            h(this.q);
        }
        if (!TextUtils.equals(this.f109554f, "like_cancel")) {
            TextUtils.equals(this.f109554f, "unlogin_like");
        }
        if (g.a().a(this.f109624a)) {
            a("previous_page", "push", c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.f109625b)) {
            a("enter_method", this.f109625b, c.a.f109562a);
        }
        a("is_first", String.valueOf(this.f109626c), c.a.f109562a);
        a("is_login_notify", String.valueOf(this.f109627d), c.a.f109562a);
    }

    public final z a(String str) {
        this.f109556h = str;
        return this;
    }

    /* renamed from: f */
    public final z g(Aweme aweme) {
        String a2;
        super.g(aweme);
        if (aweme != null) {
            this.f109624a = aweme.getAid();
            this.p = c(aweme);
            if (TextUtils.isEmpty(ac.a(aweme, this.f109628e))) {
                a2 = aweme.getRequestId();
            } else {
                a2 = ac.a(aweme, this.f109628e);
            }
            this.q = a2;
        }
        return this;
    }
}
