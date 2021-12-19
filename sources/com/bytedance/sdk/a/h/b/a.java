package com.bytedance.sdk.a.h.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import org.json.JSONObject;

public final class a extends h<d<com.bytedance.sdk.a.h.a.a>> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.a.h.a.a f43319e;

    static {
        Covode.recordClassIndex(26532);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<com.bytedance.sdk.a.h.a.a> dVar) {
        com.bytedance.sdk.a.i.a.a("passport_mobile_bind", "mobile", (String) null, dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<com.bytedance.sdk.a.h.a.a> a(boolean z, b bVar) {
        return new d(z, 1012, this.f43319e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43319e.f43247g = b.a.a(jSONObject, jSONObject2);
        this.f43319e.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43319e, jSONObject);
        this.f43319e.f43284m = jSONObject2;
    }

    public a(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.h.a.a aVar2, com.bytedance.sdk.a.h.b.a.a aVar3) {
        super(context, aVar, aVar3);
        this.f43319e = aVar2;
    }
}
