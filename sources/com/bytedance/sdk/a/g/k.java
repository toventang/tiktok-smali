package com.bytedance.sdk.a.g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.d.l;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.n.a;
import org.json.JSONObject;

public final class k extends h<l> {

    /* renamed from: e  reason: collision with root package name */
    a f43234e;

    /* renamed from: f  reason: collision with root package name */
    private String f43235f = "";

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.sdk.a.m.a f43236g;

    /* renamed from: h  reason: collision with root package name */
    private JSONObject f43237h;

    static {
        Covode.recordClassIndex(26512);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(l lVar) {
        if (TextUtils.isEmpty(this.f43235f)) {
            return;
        }
        if (this.f43235f.equals("mobile")) {
            com.bytedance.sdk.a.i.a.a("passport_mobile_reset_password", "mobile", "ticket", lVar);
        } else if (this.f43235f.equals("email")) {
            com.bytedance.sdk.a.i.a.a("passport_email_reset_password", "email", "ticket", lVar);
        }
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43237h = jSONObject2;
        b.a(this.f43236g, jSONObject);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43234e = b.a.a(jSONObject, jSONObject2);
        this.f43237h = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ l a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        l lVar = new l(z);
        if (z) {
            lVar.f43082j = this.f43234e;
        } else {
            lVar.f43073d = bVar.f43158b;
            lVar.f43075f = bVar.f43159c;
            if (this.f43236g.f43438g == 1075) {
                lVar.p = this.f43236g.f43444m;
                lVar.s = this.f43236g.p;
                lVar.r = this.f43236g.o;
                lVar.q = this.f43236g.n;
                lVar.o = this.f43236g.f43443l;
            }
        }
        lVar.f43077h = this.f43237h;
        return lVar;
    }

    public k(Context context, com.bytedance.sdk.a.d.a aVar, String str, com.bytedance.sdk.a.a.b.h hVar) {
        super(context, aVar, hVar);
        this.f43235f = str;
        this.f43236g = new com.bytedance.sdk.a.m.a();
    }
}
