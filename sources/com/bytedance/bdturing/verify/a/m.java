package com.bytedance.bdturing.verify.a;

import android.text.TextUtils;
import com.bytedance.bdturing.f.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m extends a {

    /* renamed from: f  reason: collision with root package name */
    public String f26595f;

    /* renamed from: g  reason: collision with root package name */
    public String f26596g;

    /* renamed from: h  reason: collision with root package name */
    public String f26597h;

    static {
        Covode.recordClassIndex(15626);
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int b() {
        return 6;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final String c() {
        return "twice_verify";
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int d() {
        return 6000;
    }

    private /* synthetic */ m() {
        this("", "", "");
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final void a(StringBuilder sb) {
        l.c(sb, "");
        b.a(sb, "decision_config", "block-upsms");
        b.a(sb, "is_turing", 1);
        if (!TextUtils.isEmpty(this.f26595f)) {
            b.a(sb, "verify_ticket", this.f26595f);
        }
        b.a(sb, "channel_mobile", this.f26596g);
        b.a(sb, "sms_content", this.f26597h);
        b.a(sb, "use_turing_bridge", 1);
    }

    public m(String str, String str2, String str3) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        this.f26595f = str;
        this.f26596g = str2;
        this.f26597h = str3;
    }
}
