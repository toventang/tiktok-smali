package com.ss.android.ugc.aweme.qrcode.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public String f119715a;

    /* renamed from: b  reason: collision with root package name */
    public String f119716b;

    /* renamed from: c  reason: collision with root package name */
    public String f119717c;

    /* renamed from: d  reason: collision with root package name */
    public String f119718d;

    /* renamed from: e  reason: collision with root package name */
    public String f119719e;

    static {
        Covode.recordClassIndex(77768);
    }

    public b() {
        super("qr_code_scanned");
    }

    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("url_content", this.f119715a, c.a.f109562a);
        a("enter_method", this.f119716b, c.a.f109562a);
        a("landing_page", this.f119717c, c.a.f109562a);
        a("from_user_code", this.f119718d, c.a.f109562a);
        a("qr_code_type", this.f119719e, c.a.f109562a);
    }
}
