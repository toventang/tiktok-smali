package com.bytedance.bdturing.verify.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends a {

    /* renamed from: f  reason: collision with root package name */
    public String f26579f;

    /* renamed from: g  reason: collision with root package name */
    public String f26580g;

    static {
        Covode.recordClassIndex(15615);
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int b() {
        return 7;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final String c() {
        return "twice_verify";
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int d() {
        return 6000;
    }

    private /* synthetic */ b() {
        this(null, null);
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final void a(StringBuilder sb) {
        l.c(sb, "");
        com.bytedance.bdturing.f.b.a(sb, "decision_config", "block-sms");
        com.bytedance.bdturing.f.b.a(sb, "is_turing", 1);
        if (!TextUtils.isEmpty(this.f26579f)) {
            com.bytedance.bdturing.f.b.a(sb, "verify_ticket", this.f26579f);
        }
        if (!TextUtils.isEmpty(this.f26580g)) {
            com.bytedance.bdturing.f.b.a(sb, "show_mobile", this.f26580g);
        }
        com.bytedance.bdturing.f.b.a(sb, "use_turing_bridge", 1);
    }

    public b(String str, String str2) {
        this.f26579f = str;
        this.f26580g = str2;
    }
}
