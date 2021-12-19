package com.bytedance.sdk.a.h.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.e;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.b.a.k;
import com.bytedance.sdk.a.n.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class i extends h<e> {

    /* renamed from: e  reason: collision with root package name */
    private a f43327e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.a.m.a f43328f = new com.bytedance.sdk.a.m.a();

    /* renamed from: g  reason: collision with root package name */
    private JSONObject f43329g;

    static {
        Covode.recordClassIndex(26556);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(e eVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (eVar.f43071b) {
                jSONObject.put("result", 1);
            } else {
                jSONObject.put("result", 0);
                jSONObject.put("errCode", eVar.f43073d);
                jSONObject.put("errDesc", eVar.f43075f);
            }
            com.bytedance.sdk.a.i.a.b("passport_device_one_login", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a(this.f43328f, jSONObject);
        this.f43329g = jSONObject2;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43327e = b.a.a(jSONObject, jSONObject2);
        this.f43329g = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ e a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        e eVar = new e(z, 10037);
        if (z) {
            eVar.f43082j = this.f43327e;
        } else {
            eVar.f43073d = this.f43328f.f43438g;
            eVar.f43075f = this.f43328f.f43439h;
            eVar.p = this.f43328f.f43444m;
            eVar.q = this.f43328f.n;
            eVar.s = this.f43328f.p;
            eVar.r = this.f43328f.o;
            eVar.o = this.f43328f.f43443l;
            eVar.u = this.f43328f.f43440i;
            eVar.n = this.f43328f.f43441j;
        }
        eVar.f43077h = this.f43329g;
        return eVar;
    }

    public i(Context context, com.bytedance.sdk.a.d.a aVar, k kVar) {
        super(context, aVar, kVar);
    }
}
