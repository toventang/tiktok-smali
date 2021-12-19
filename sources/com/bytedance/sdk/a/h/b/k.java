package com.bytedance.sdk.a.h.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.n;
import com.bytedance.sdk.a.h.b.a.l;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class k extends h<d<n>> {

    /* renamed from: e  reason: collision with root package name */
    private n f43331e;

    static {
        Covode.recordClassIndex(26558);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<n> dVar) {
        a.a("passport_mobile_send_voice_code", (String) null, (String) null, dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<n> a(boolean z, b bVar) {
        return new d(z, 1002, this.f43331e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43331e, jSONObject);
        this.f43331e.f43284m = jSONObject2;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43331e.t = jSONObject2.optInt("retry_time", 30);
        this.f43331e.f43284m = jSONObject;
    }

    public k(Context context, com.bytedance.sdk.a.d.a aVar, n nVar, l lVar) {
        super(context, aVar, lVar);
        this.f43331e = nVar;
    }
}
