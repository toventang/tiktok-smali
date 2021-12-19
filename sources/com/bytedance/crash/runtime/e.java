package com.bytedance.crash.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.runtime.b.a;
import com.bytedance.crash.util.n;
import org.json.JSONObject;

public final class e extends a {
    static {
        Covode.recordClassIndex(16332);
    }

    @Override // com.bytedance.crash.runtime.b.a
    public final long a() {
        return Long.decode(n.b(this.f27884b, "general", "slardar_api_settings", "fetch_setting", "fetch_setting_interval")).longValue() * 1000;
    }

    public e(JSONObject jSONObject, String str) {
        super(jSONObject, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r9 == false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.e.a(java.util.Map, java.lang.String):boolean");
    }
}
