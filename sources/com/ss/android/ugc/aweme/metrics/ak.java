package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;

public final class ak extends c {

    /* renamed from: a  reason: collision with root package name */
    public String f109491a;

    /* renamed from: b  reason: collision with root package name */
    public String f109492b;

    static {
        Covode.recordClassIndex(70106);
    }

    public ak() {
        super("tag_show");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("enter_from", this.f109491a, c.a.f109562a);
        a("tag_id", this.f109492b, c.a.f109563b);
        a("content", "tag", c.a.f109562a);
    }
}
