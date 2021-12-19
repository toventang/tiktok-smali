package com.bytedance.android.ecommerce.b;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.h.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.n;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7006a = "LoadCyberScriptMethod";

    static {
        Covode.recordClassIndex(3357);
    }

    @Override // com.bytedance.android.ecommerce.b.a
    public final String a() {
        return "pipo.executeRiskJS";
    }

    @Override // com.bytedance.ies.xbridge.b, com.bytedance.android.ecommerce.b.a
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        String str;
        super.a(nVar, bVar, eVar);
        if (nVar.a("session_id")) {
            str = nVar.f("session_id");
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            a.a("orgId/sessionId/merchantId is null!", bVar);
            return;
        }
        try {
            String a2 = com.bytedance.android.ecommerce.e.c.f7063a.i().a(str);
            if (TextUtils.equals(a2, "success")) {
                a.a((Object) "success", bVar);
            } else {
                a.a(a2, bVar);
            }
        } catch (Throwable th) {
            a.a(th.getMessage(), bVar);
        }
    }
}
