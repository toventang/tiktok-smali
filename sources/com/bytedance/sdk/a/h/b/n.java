package com.bytedance.sdk.a.h.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.p;
import com.bytedance.sdk.a.h.b.a.o;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class n extends h<d<p>> {

    /* renamed from: e  reason: collision with root package name */
    private p f43336e;

    static {
        Covode.recordClassIndex(26562);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<p> dVar) {
        a.a("passport_account_register", (String) null, (String) null, dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<p> a(boolean z, b bVar) {
        return new d(z, 1023, this.f43336e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43336e.f43318c = b.a.a(jSONObject, jSONObject2);
        this.f43336e.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43336e, jSONObject);
        this.f43336e.f43284m = jSONObject2;
    }

    public n(Context context, com.bytedance.sdk.a.d.a aVar, p pVar, o oVar) {
        super(context, aVar, oVar);
        this.f43336e = pVar;
    }
}
