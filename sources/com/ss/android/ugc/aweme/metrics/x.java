package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;

public final class x extends c {

    /* renamed from: a  reason: collision with root package name */
    public String f109614a;

    /* renamed from: b  reason: collision with root package name */
    public String f109615b;

    /* renamed from: c  reason: collision with root package name */
    public String f109616c;

    /* renamed from: d  reason: collision with root package name */
    public String f109617d;

    /* renamed from: e  reason: collision with root package name */
    public String f109618e;
    private boolean p;
    private String q;

    static {
        Covode.recordClassIndex(70152);
    }

    public x() {
        super("launch_log");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str;
        a("launch_method", this.f109614a, c.a.f109562a);
        a("push_id", this.q, c.a.f109562a);
        a("enter_to", this.f109615b, c.a.f109562a);
        a("red_badge_number", this.f109616c, c.a.f109562a);
        a("is_cold_launch", this.f109617d, c.a.f109562a);
        if (this.p) {
            str = "1";
        } else {
            str = "0";
        }
        a("is_share_link_launch", str);
        if (!TextUtils.isEmpty(this.f109618e)) {
            a("launch_from", this.f109618e, c.a.f109562a);
        }
    }
}
