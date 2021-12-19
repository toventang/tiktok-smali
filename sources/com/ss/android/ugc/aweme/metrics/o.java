package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;

public final class o extends c {

    /* renamed from: a  reason: collision with root package name */
    public String f109589a;

    static {
        Covode.recordClassIndex(70140);
    }

    public o() {
        super("enter_page");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("page", this.f109589a, c.a.f109562a);
    }
}
