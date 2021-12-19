package com.bytedance.sdk.a.g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.n.a;
import com.ss.android.account.c;
import java.util.Map;
import org.json.JSONObject;

public final class d extends h<com.bytedance.sdk.a.a.d.d> {

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f43223e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f43224f;

    /* renamed from: g  reason: collision with root package name */
    private a f43225g;

    static {
        Covode.recordClassIndex(26505);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.d.d dVar) {
        com.bytedance.sdk.a.i.a.a("passport_sdk_common_request", (String) null, (String) null, dVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43223e = jSONObject2;
        this.f43224f = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43223e = jSONObject;
        this.f43224f = jSONObject2;
        if (!TextUtils.isEmpty(jSONObject2.optString("user_id"))) {
            this.f43225g = c.a.a(jSONObject);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public com.bytedance.sdk.a.a.d.d a(boolean z, b bVar) {
        com.bytedance.sdk.a.a.d.d dVar = new com.bytedance.sdk.a.a.d.d(z);
        if (!z) {
            dVar.f43073d = bVar.f43158b;
            dVar.f43075f = bVar.f43159c;
        } else {
            dVar.f43082j = this.f43225g;
        }
        dVar.f43077h = this.f43223e;
        dVar.v = this.f43224f;
        if (z && bVar.f43157a.f43149d > 0) {
            String b2 = com.bytedance.sdk.a.o.b.b(bVar.f43160d);
            Map<String, String> map = bVar.f43157a.f43148c;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("result", dVar.f43077h);
                jSONObject.put("data", dVar.v);
                com.bytedance.sdk.a.o.b.a().a(b2, map, jSONObject.toString(), System.currentTimeMillis() + bVar.f43157a.f43149d);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return dVar;
    }

    public d(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.a.a<com.bytedance.sdk.a.a.d.d> aVar2) {
        super(context, aVar, aVar2);
    }
}
