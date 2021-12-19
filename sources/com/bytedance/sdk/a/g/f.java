package com.bytedance.sdk.a.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.e;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.n.a;
import com.ss.android.account.c;
import org.json.JSONObject;

public final class f extends h<e> {

    /* renamed from: e  reason: collision with root package name */
    private a f43227e;

    static {
        Covode.recordClassIndex(26507);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(e eVar) {
        com.bytedance.sdk.a.i.a.a("passport_app_email_register_ticket_register", (String) null, (String) null, eVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43227e = c.a.a(jSONObject);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ e a(boolean z, b bVar) {
        e eVar = new e(z, 10053);
        if (z) {
            eVar.f43082j = this.f43227e;
        } else {
            eVar.f43073d = bVar.f43158b;
            eVar.f43075f = bVar.f43159c;
            eVar.f43076g = bVar.f43161e;
        }
        return eVar;
    }

    public f(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.a.a<e> aVar2) {
        super(context, aVar, aVar2);
    }
}
