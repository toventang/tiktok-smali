package com.bytedance.sdk.a.m;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.e;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import org.json.JSONObject;

public final class c extends h<e> {

    /* renamed from: e  reason: collision with root package name */
    private a f43451e = new a();

    public static class a extends f {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f43452a;

        static {
            Covode.recordClassIndex(26609);
        }
    }

    static {
        Covode.recordClassIndex(26608);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(e eVar) {
        String str;
        e eVar2 = eVar;
        if (!TextUtils.isEmpty(eVar2.f43072c)) {
            if (eVar2.f43072c.contains(c.b.a("/passport/auth/bind_with_mobile/"))) {
                str = "passport_oauth_bind_with_mobile_click";
            } else {
                str = "passport_oauth_bind_click";
            }
            com.bytedance.sdk.a.i.a.a(str, this.f43207b.a("platform"), "auth_bind", eVar2);
        }
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a.a(jSONObject, this.f43451e);
        this.f43451e.f43452a = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a.a(this.f43451e, jSONObject);
        this.f43451e.f43452a = jSONObject2;
        if (jSONObject != null) {
            this.f43451e.f43440i = jSONObject.optString("profile_key");
            this.f43451e.f43441j = jSONObject.optString("shark_ticket");
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ e a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        e a2 = b.a.a(this.f43451e, z);
        if (z) {
            a2.f43082j = this.f43451e.f43457b;
        } else {
            a2.f43073d = this.f43451e.f43438g;
            a2.f43075f = this.f43451e.f43439h;
            a2.n = this.f43451e.f43441j;
            a2.u = this.f43451e.f43440i;
            if (this.f43451e.f43438g == 1075) {
                a2.p = this.f43451e.f43444m;
                a2.s = this.f43451e.p;
                a2.r = this.f43451e.o;
                a2.q = this.f43451e.n;
                a2.o = this.f43451e.f43443l;
            }
        }
        a2.f43077h = this.f43451e.f43452a;
        return a2;
    }

    public c(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.a.a<e> aVar2) {
        super(context, aVar, aVar2);
    }
}
