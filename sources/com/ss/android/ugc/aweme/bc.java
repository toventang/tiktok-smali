package com.ss.android.ugc.aweme;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.az;
import com.ss.android.ugc.aweme.bb;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bc implements bb.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f68523a;

    static {
        Covode.recordClassIndex(42192);
    }

    bc(String str) {
        this.f68523a = str;
    }

    @Override // com.ss.android.ugc.aweme.bb.a
    public final void a(String str) {
        String str2 = this.f68523a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str2, str);
            if ("internal".equals(str2)) {
                az.a a2 = az.a();
                jSONObject.put("free", a2.f67856a);
                jSONObject.put("total", a2.f67857b);
                jSONObject.put("availPercent", a2.f67858c);
            }
            b.a("tt_diskusage", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
