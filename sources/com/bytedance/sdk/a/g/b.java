package com.bytedance.sdk.a.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class b extends h<com.bytedance.sdk.a.a.d.b> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.a.a.d.b f43221e;

    static {
        Covode.recordClassIndex(26503);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.d.b bVar) {
        a.a("passport_check_password", (String) null, (String) null, bVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ com.bytedance.sdk.a.a.d.b a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        com.bytedance.sdk.a.a.d.b bVar2 = this.f43221e;
        if (bVar2 == null) {
            bVar2 = new com.bytedance.sdk.a.a.d.b(z);
        } else {
            bVar2.f43071b = z;
        }
        if (!z) {
            bVar2.f43073d = bVar.f43158b;
            bVar2.f43075f = bVar.f43159c;
        }
        return bVar2;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.a.d.b bVar = new com.bytedance.sdk.a.a.d.b(true);
        this.f43221e = bVar;
        bVar.f43090j = jSONObject2.optString("captcha");
    }

    public b(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.b.b bVar) {
        super(context, aVar, bVar);
    }
}
