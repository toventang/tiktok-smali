package com.bytedance.sdk.a.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class c extends h {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.a.a.d.c f43222e;

    static {
        Covode.recordClassIndex(26504);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(b bVar) {
        a.a("passport_mobile_check_qrconnect", (String) null, (String) null, bVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final b a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        com.bytedance.sdk.a.a.d.c cVar = this.f43222e;
        if (cVar == null) {
            cVar = new com.bytedance.sdk.a.a.d.c(z);
        } else {
            cVar.f43071b = z;
        }
        if (!z) {
            cVar.f43073d = bVar.f43158b;
            cVar.f43075f = bVar.f43159c;
        }
        return cVar;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.a.d.c cVar = new com.bytedance.sdk.a.a.d.c(true);
        this.f43222e = cVar;
        cVar.v = jSONObject2.optString("qrcode");
        this.f43222e.y = jSONObject2.optString("status");
        this.f43222e.A = jSONObject2.optString("app_name");
        this.f43222e.B = jSONObject2.optString("web_name");
        this.f43222e.w = jSONObject2.optString("qrcode_index_url");
        this.f43222e.z = jSONObject2.optString("token");
        this.f43222e.x = jSONObject2.optString("redirect_url");
        JSONObject optJSONObject = jSONObject2.optJSONObject("user_data");
        if (optJSONObject != null) {
            jSONObject.put("data", optJSONObject);
            this.f43222e.f43082j = b.a.a(jSONObject, optJSONObject);
        }
    }

    public c(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.a.a aVar2) {
        super(context, aVar, aVar2);
    }
}
