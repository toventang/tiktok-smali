package com.bytedance.sdk.a.h.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class b extends h<d<com.bytedance.sdk.a.h.a.b>> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.a.h.a.b f43320e;

    static {
        Covode.recordClassIndex(26549);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<com.bytedance.sdk.a.h.a.b> dVar) {
        a.a("passport_mobile_change", "mobile", (String) null, dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<com.bytedance.sdk.a.h.a.b> a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        return new d(z, 1011, this.f43320e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43320e.f43253f = b.a.a(jSONObject, jSONObject2);
        this.f43320e.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43320e, jSONObject);
        this.f43320e.f43284m = jSONObject2;
    }

    public b(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.h.a.b bVar, com.bytedance.sdk.a.h.b.a.b bVar2) {
        super(context, aVar, bVar2);
        this.f43320e = bVar;
    }
}
