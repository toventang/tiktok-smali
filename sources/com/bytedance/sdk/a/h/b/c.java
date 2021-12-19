package com.bytedance.sdk.a.h.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.i.a;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public final class c extends h<d<com.bytedance.sdk.a.h.a.d>> {

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.a.h.a.d f43321e;

    static {
        Covode.recordClassIndex(26550);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<com.bytedance.sdk.a.h.a.d> dVar) {
        a.a("passport_email_check_register", "email", this.f43207b.a(StringSet.type), dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<com.bytedance.sdk.a.h.a.d> a(boolean z, b bVar) {
        return new d(z, 1026, this.f43321e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43321e.f43260d = jSONObject2.optInt("is_registered");
        this.f43321e.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43321e, jSONObject);
        this.f43321e.f43284m = jSONObject2;
    }

    public c(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.h.a.d dVar, com.bytedance.sdk.a.h.b.a.d dVar2) {
        super(context, aVar, dVar2);
        this.f43321e = dVar;
    }
}
