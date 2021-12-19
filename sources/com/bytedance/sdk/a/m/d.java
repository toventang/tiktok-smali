package com.bytedance.sdk.a.m;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.e;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import org.json.JSONObject;

public final class d extends h<e> {

    /* renamed from: e  reason: collision with root package name */
    private a f43453e = new a();

    public static class a extends f {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f43454a;

        static {
            Covode.recordClassIndex(26611);
        }
    }

    static {
        Covode.recordClassIndex(26610);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(e eVar) {
        String str;
        e eVar2 = eVar;
        if (!TextUtils.isEmpty(eVar2.f43072c)) {
            if (eVar2.f43072c.contains(c.b.a("/passport/auth/bind_with_mobile_login/"))) {
                str = "passport_auth_bind_with_mobile_login_click";
            } else if (eVar2.f43072c.contains(c.b.a("/passport/auth/share_login/"))) {
                str = "passport_auth_share_login";
            } else {
                str = "passport_oauth_login_click";
            }
            com.bytedance.sdk.a.i.a.a(str, this.f43207b.a("platform"), "login", eVar2);
        }
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a.a(jSONObject, this.f43453e);
        this.f43453e.f43454a = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a.a(this.f43453e, jSONObject);
        this.f43453e.f43454a = jSONObject2;
        if (jSONObject != null) {
            this.f43453e.f43440i = jSONObject.optString("profile_key");
            this.f43453e.f43441j = jSONObject.optString("shark_ticket");
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ e a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        e eVar = new e(z, 1);
        if (z) {
            eVar.f43082j = this.f43453e.f43457b;
        } else {
            eVar.f43073d = this.f43453e.f43438g;
            eVar.f43075f = this.f43453e.f43439h;
            eVar.n = this.f43453e.f43441j;
            eVar.u = this.f43453e.f43440i;
            if (this.f43453e.f43438g == 1075) {
                eVar.p = this.f43453e.f43444m;
                eVar.s = this.f43453e.p;
                eVar.r = this.f43453e.o;
                eVar.q = this.f43453e.n;
                eVar.o = this.f43453e.f43443l;
            }
            eVar.t = this.f43453e.q;
        }
        eVar.f43077h = this.f43453e.f43454a;
        return eVar;
    }

    public d(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.a.a<e> aVar2) {
        super(context, aVar, aVar2);
    }
}
