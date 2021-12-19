package com.bytedance.sdk.a.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.c;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class e extends h<com.bytedance.sdk.a.a.d.e> {

    /* renamed from: e  reason: collision with root package name */
    private String f43226e;

    static {
        Covode.recordClassIndex(26506);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.d.e eVar) {
        a.a("passport_app_email_register_code_verify", (String) null, (String) null, eVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43226e = jSONObject2.optString("email_ticket");
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ com.bytedance.sdk.a.a.d.e a(boolean z, b bVar) {
        com.bytedance.sdk.a.a.d.e eVar = new com.bytedance.sdk.a.a.d.e(z);
        if (z) {
            eVar.f43091j = this.f43226e;
        } else {
            eVar.f43073d = bVar.f43158b;
            eVar.f43075f = bVar.f43159c;
            eVar.f43076g = bVar.f43161e;
        }
        return eVar;
    }

    public e(Context context, com.bytedance.sdk.a.d.a aVar, c<com.bytedance.sdk.a.a.d.e> cVar) {
        super(context, aVar, cVar);
    }
}
