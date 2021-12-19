package com.bytedance.sdk.a.h.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.f;
import com.bytedance.sdk.a.i.a;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public final class e extends h<d<f>> {

    /* renamed from: e  reason: collision with root package name */
    private f f43323e;

    static {
        Covode.recordClassIndex(26552);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<f> dVar) {
        a.a("passport_email_register_verify", "email", this.f43207b.a(StringSet.type), dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<f> a(boolean z, b bVar) {
        return new d(z, 1025, this.f43323e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43323e.f43271f = b.a.a(jSONObject, jSONObject2);
        this.f43323e.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43323e, jSONObject);
        this.f43323e.f43284m = jSONObject2;
    }

    public e(Context context, com.bytedance.sdk.a.d.a aVar, f fVar, com.bytedance.sdk.a.h.b.a.f fVar2) {
        super(context, aVar, fVar2);
        this.f43323e = fVar;
    }
}
