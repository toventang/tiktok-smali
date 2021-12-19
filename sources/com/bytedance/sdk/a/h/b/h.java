package com.bytedance.sdk.a.h.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.h.a.l;
import com.bytedance.sdk.a.h.b.a.j;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class h extends com.bytedance.sdk.a.f.h<d<l>> {

    /* renamed from: e  reason: collision with root package name */
    private l f43326e;

    static {
        Covode.recordClassIndex(26555);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<l> dVar) {
        a.a("passport_mobile_login_only", "mobile", "login_only", dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<l> a(boolean z, b bVar) {
        return new d(z, 1021, this.f43326e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43326e.f43296e = b.a.a(jSONObject, jSONObject2);
        this.f43326e.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43326e, jSONObject);
        this.f43326e.f43284m = jSONObject2;
        try {
            this.f43326e.f43295d = jSONObject.optString("sms_code_key");
        } catch (Exception unused) {
        }
    }

    public h(Context context, com.bytedance.sdk.a.d.a aVar, l lVar, j jVar) {
        super(context, aVar, jVar);
        this.f43326e = lVar;
    }
}
