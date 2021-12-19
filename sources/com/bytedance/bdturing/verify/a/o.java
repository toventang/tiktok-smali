package com.bytedance.bdturing.verify.a;

import android.text.TextUtils;
import com.bytedance.bdturing.f.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class o extends a {

    /* renamed from: f  reason: collision with root package name */
    public String f26598f;

    static {
        Covode.recordClassIndex(15628);
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int b() {
        return 13;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final String c() {
        return "twice_verify";
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int d() {
        return 6000;
    }

    private /* synthetic */ o() {
        this("");
    }

    public o(String str) {
        l.c(str, "");
        this.f26598f = str;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final void a(StringBuilder sb) {
        l.c(sb, "");
        b.a(sb, "decision_config", "mobile_voice_sms_verify");
        if (!TextUtils.isEmpty(this.f26598f)) {
            b.a(sb, "verify_ticket", this.f26598f);
        }
        b.a(sb, "use_turing_bridge", 1);
    }
}
