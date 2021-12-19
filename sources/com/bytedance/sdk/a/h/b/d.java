package com.bytedance.sdk.a.h.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.e;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class d extends h<com.bytedance.sdk.a.a.a.d<e>> {

    /* renamed from: e  reason: collision with root package name */
    private e f43322e;

    static {
        Covode.recordClassIndex(26551);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.d<e> dVar) {
        a.a("passport_email_register", "email", (String) null, dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ com.bytedance.sdk.a.a.a.d<e> a(boolean z, b bVar) {
        return new com.bytedance.sdk.a.a.a.d(z, 1009, this.f43322e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43322e.f43265e = b.a.a(jSONObject, jSONObject2);
        this.f43322e.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43322e, jSONObject);
        this.f43322e.f43284m = jSONObject2;
    }

    public d(Context context, com.bytedance.sdk.a.d.a aVar, e eVar, com.bytedance.sdk.a.h.b.a.e eVar2) {
        super(context, aVar, eVar2);
        this.f43322e = eVar;
    }
}
