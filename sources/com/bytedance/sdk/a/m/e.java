package com.bytedance.sdk.a.m;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import org.json.JSONObject;

public final class e extends h<com.bytedance.sdk.a.a.a.e> {

    /* renamed from: e  reason: collision with root package name */
    private a f43455e = new a();

    public static class a extends f {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f43456a;

        static {
            Covode.recordClassIndex(26613);
        }
    }

    static {
        Covode.recordClassIndex(26612);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.e eVar) {
        com.bytedance.sdk.a.i.a.a("passport_auth_login_only", this.f43207b.a("platform"), (String) null, eVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a.a(jSONObject, this.f43455e);
        this.f43455e.f43456a = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a.a(this.f43455e, jSONObject);
        this.f43455e.f43456a = jSONObject2;
        if (jSONObject != null) {
            this.f43455e.f43440i = jSONObject.optString("profile_key");
            this.f43455e.f43441j = jSONObject.optString("shark_ticket");
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ com.bytedance.sdk.a.a.a.e a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        com.bytedance.sdk.a.a.a.e eVar = new com.bytedance.sdk.a.a.a.e(z, 1);
        if (z) {
            eVar.f43082j = this.f43455e.f43457b;
        } else {
            eVar.u = this.f43455e.f43440i;
            eVar.f43073d = this.f43455e.f43438g;
            eVar.f43075f = this.f43455e.f43439h;
            eVar.n = this.f43455e.f43441j;
            if (this.f43455e.f43438g == 1075) {
                eVar.p = this.f43455e.f43444m;
                eVar.s = this.f43455e.p;
                eVar.r = this.f43455e.o;
                eVar.q = this.f43455e.n;
                eVar.o = this.f43455e.f43443l;
            }
        }
        eVar.f43077h = this.f43455e.f43456a;
        return eVar;
    }

    public e(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.a.a<com.bytedance.sdk.a.a.a.e> aVar2) {
        super(context, aVar, aVar2);
    }
}
