package com.ss.android.ugc.aweme.ecommerce.address.edit.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import java.util.HashMap;

public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f84441a;

    /* renamed from: b  reason: collision with root package name */
    private final String f84442b;

    static {
        Covode.recordClassIndex(52680);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        String str;
        p[] pVarArr = new p[1];
        if (this.f84441a) {
            str = "1";
        } else {
            str = "0";
        }
        pVarArr[0] = v.a("is_fail", str);
        HashMap<String, Object> c2 = ag.c(pVarArr);
        if (!this.f84441a) {
            c2.put("fail_reason", this.f84442b);
        }
        return c2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(boolean z, String str) {
        super("tiktokec_edit_address_save_click_result");
        l.d(str, "");
        this.f84441a = z;
        this.f84442b = str;
    }
}
