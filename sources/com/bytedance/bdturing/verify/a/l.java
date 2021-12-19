package com.bytedance.bdturing.verify.a;

import com.bytedance.bdturing.f.b;
import com.bytedance.covode.number.Covode;

public final class l extends a {

    /* renamed from: f  reason: collision with root package name */
    public String f26592f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f26593g;

    /* renamed from: h  reason: collision with root package name */
    public String f26594h;

    static {
        Covode.recordClassIndex(15625);
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int b() {
        return 1;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final String c() {
        return "sms";
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int d() {
        return 6000;
    }

    public /* synthetic */ l() {
        this(null);
    }

    private l(String str) {
        this.f26592f = null;
        this.f26593g = false;
        this.f26594h = null;
        a(true);
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final void a(StringBuilder sb) {
        h.f.b.l.c(sb, "");
        b.a(sb, "scene", this.f26592f);
        b.a(sb, "show_success_toast", this.f26593g ? 1 : 0);
        b.a(sb, "uid", this.f26594h);
    }
}
