package com.bytedance.bdturing.verify.a;

import android.text.TextUtils;
import com.bytedance.bdturing.f.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h extends a {

    /* renamed from: f  reason: collision with root package name */
    public String f26585f;

    static {
        Covode.recordClassIndex(15621);
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int b() {
        return 8;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final String c() {
        return "twice_verify";
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int d() {
        return 6000;
    }

    private /* synthetic */ h() {
        this("");
    }

    public h(String str) {
        l.c(str, "");
        this.f26585f = str;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final void a(StringBuilder sb) {
        l.c(sb, "");
        b.a(sb, "decision_config", "block-password");
        if (!TextUtils.isEmpty(this.f26585f)) {
            b.a(sb, "verify_ticket", this.f26585f);
        }
        b.a(sb, "is_turing", 1);
        b.a(sb, "use_turing_bridge", 1);
    }
}
