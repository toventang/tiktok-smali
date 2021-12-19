package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;

public final class e extends c {

    /* renamed from: a  reason: collision with root package name */
    public String f109565a;

    /* renamed from: b  reason: collision with root package name */
    public String f109566b;

    /* renamed from: c  reason: collision with root package name */
    public String f109567c;

    static {
        Covode.recordClassIndex(70129);
    }

    public e() {
        super("choose_filter");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("content_type", this.f109565a, c.a.f109562a);
        a("enter_from", this.f109566b, c.a.f109562a);
        a("filter_name", this.f109567c, c.a.f109562a);
    }
}
