package com.bytedance.sdk.a.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.b.k;
import com.bytedance.sdk.a.a.d.o;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class n extends h<o> {

    /* renamed from: e  reason: collision with root package name */
    private String f43239e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f43240f;

    static {
        Covode.recordClassIndex(26515);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(o oVar) {
        a.a("passport_email_verify", (String) null, (String) null, oVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43240f = jSONObject2;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43240f = jSONObject;
        this.f43239e = jSONObject2.optString("ticket");
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ o a(boolean z, b bVar) {
        o oVar = new o(z);
        if (z) {
            oVar.f43104j = this.f43239e;
        } else {
            oVar.f43073d = bVar.f43158b;
            oVar.f43075f = bVar.f43159c;
        }
        oVar.f43077h = this.f43240f;
        return oVar;
    }

    public n(Context context, com.bytedance.sdk.a.d.a aVar, k kVar) {
        super(context, aVar, kVar);
    }
}
