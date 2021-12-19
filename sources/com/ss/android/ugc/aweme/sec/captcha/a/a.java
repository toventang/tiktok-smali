package com.ss.android.ugc.aweme.sec.captcha.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.a.b;
import com.bytedance.sdk.bridge.a.c;
import com.bytedance.sdk.bridge.b.b;
import com.bytedance.sdk.bridge.b.d;
import com.bytedance.sdk.bridge.g;
import h.f.b.l;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(79320);
    }

    @c(a = "appInfo", b = "public", c = "SYNC")
    public final void appInfo(@b d dVar, @com.bytedance.sdk.bridge.a.d(a = "permissionGroup") String str) {
        l.d(dVar, "");
        JSONObject jSONObject = new JSONObject();
        for (T t : com.ss.android.ugc.aweme.fe.a.d.a(str).entrySet()) {
            jSONObject.put((String) t.getKey(), t.getValue());
        }
        g.a("BridgeResult", "createSuccessResult " + String.valueOf(jSONObject) + " " + "");
        com.bytedance.sdk.bridge.b.b bVar = new com.bytedance.sdk.bridge.b.b((byte) 0);
        bVar.f43845a = b.a.SUCCESS.getValue();
        if (!TextUtils.isEmpty("")) {
            bVar.f43846b = "";
        }
        bVar.f43847c = jSONObject;
    }
}
