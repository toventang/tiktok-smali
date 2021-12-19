package com.bytedance.bdturing.verify.a;

import com.bytedance.bdturing.f.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f extends a {

    /* renamed from: f  reason: collision with root package name */
    public int f26584f;

    static {
        Covode.recordClassIndex(15619);
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int b() {
        return 2;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final String c() {
        return "verify";
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int d() {
        return 6000;
    }

    public /* synthetic */ f() {
        this(0);
    }

    public f(int i2) {
        this.f26584f = i2;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final void a(StringBuilder sb) {
        l.c(sb, "");
        int i2 = this.f26584f;
        if (i2 != 0) {
            b.a(sb, "challenge_code", i2);
        }
    }
}
