package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;

public final class p extends c {

    /* renamed from: a  reason: collision with root package name */
    public String f109590a;

    /* renamed from: b  reason: collision with root package name */
    public String f109591b;

    /* renamed from: c  reason: collision with root package name */
    public String f109592c;

    /* renamed from: d  reason: collision with root package name */
    private String f109593d;

    static {
        Covode.recordClassIndex(70141);
    }

    public p() {
        super("enter_personal_detail_backup");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("group_id", this.f109591b, c.a.f109563b);
        a("to_user_id", this.f109590a, c.a.f109563b);
        a("enter_from", this.f109556h, c.a.f109562a);
        a("enter_method", this.f109593d, c.a.f109562a);
        a("request_id", this.f109592c, c.a.f109563b);
        if (ac.a(this.f109556h)) {
            h(this.f109591b);
        }
    }

    public final p a(String str) {
        this.f109556h = str;
        return this;
    }
}
