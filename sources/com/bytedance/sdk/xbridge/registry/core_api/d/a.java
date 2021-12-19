package com.bytedance.sdk.xbridge.registry.core_api.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.c.d;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f44076a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(26940);
    }

    public static void a(d dVar) {
        l.c(dVar, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", -2);
        jSONObject.put("data", new JSONObject());
        jSONObject.put("msg", "The JSBridge method is not found, please register");
        dVar.a(jSONObject);
    }
}
