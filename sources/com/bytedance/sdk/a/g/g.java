package com.bytedance.sdk.a.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.b.d;
import com.bytedance.sdk.a.a.d.f;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.i.a;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public final class g extends h<f> {

    /* renamed from: e  reason: collision with root package name */
    private f f43228e;

    static {
        Covode.recordClassIndex(26508);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(f fVar) {
        a.a("passport_account_info", (String) null, (String) null, fVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ f a(boolean z, b bVar) {
        f fVar = this.f43228e;
        if (fVar == null) {
            fVar = new f(z);
        } else {
            fVar.f43071b = z;
        }
        if (!z) {
            fVar.f43073d = bVar.f43158b;
            fVar.f43075f = bVar.f43159c;
        }
        return fVar;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        f fVar = new f(true);
        this.f43228e = fVar;
        fVar.f43077h = jSONObject;
        this.f43228e.f43082j = b.a.a(jSONObject, jSONObject2);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        f fVar = new f(false);
        this.f43228e = fVar;
        fVar.f43077h = jSONObject2;
        if (jSONObject.has(StringSet.name)) {
            this.f43228e.v = jSONObject.optString(StringSet.name);
        } else if (jSONObject.has("error_name")) {
            this.f43228e.v = jSONObject.optString("error_name");
        }
    }

    public g(Context context, com.bytedance.sdk.a.d.a aVar, d dVar) {
        super(context, aVar, dVar);
    }
}
