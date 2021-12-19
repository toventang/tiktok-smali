package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;

public final class af extends c {

    /* renamed from: a  reason: collision with root package name */
    public String f109474a;

    /* renamed from: b  reason: collision with root package name */
    public String f109475b;

    /* renamed from: c  reason: collision with root package name */
    public String f109476c;

    /* renamed from: d  reason: collision with root package name */
    private String f109477d;

    static {
        Covode.recordClassIndex(70101);
    }

    public af() {
        super("qr_code_save");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("previous_page", this.f109474a, c.a.f109562a);
        a("platform", this.f109475b, c.a.f109562a);
        a("qr_code_type", this.f109476c, c.a.f109562a);
        a("enter_method", this.f109477d, c.a.f109562a);
    }
}
