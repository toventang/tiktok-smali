package com.bytedance.sdk.a.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.b;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class h extends com.bytedance.sdk.a.f.h {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.a.a.d.h f43229e;

    static {
        Covode.recordClassIndex(26509);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(b bVar) {
        a.a("passport_mobile_get_qrcode", (String) null, (String) null, bVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final b a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        com.bytedance.sdk.a.a.d.h hVar = this.f43229e;
        if (hVar == null) {
            hVar = new com.bytedance.sdk.a.a.d.h(z);
        } else {
            hVar.f43071b = z;
        }
        if (!z) {
            hVar.f43073d = bVar.f43158b;
            hVar.f43075f = bVar.f43159c;
        }
        return hVar;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.a.d.h hVar = new com.bytedance.sdk.a.a.d.h(true);
        this.f43229e = hVar;
        hVar.f43096j = jSONObject2.optString("qrcode");
        this.f43229e.f43097k = jSONObject2.optString("qrcode_index_url");
        this.f43229e.f43098l = jSONObject2.optString("token");
        this.f43229e.f43099m = jSONObject2.optString("app_name");
        this.f43229e.n = jSONObject2.optString("web_name");
    }

    public h(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.a.a aVar2) {
        super(context, aVar, aVar2);
    }
}
