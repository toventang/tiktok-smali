package com.bytedance.sdk.a.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.d.k;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.n.a;
import org.json.JSONObject;

public final class j extends h<k> {

    /* renamed from: e  reason: collision with root package name */
    a f43233e;

    static {
        Covode.recordClassIndex(26511);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(k kVar) {
        com.bytedance.sdk.a.i.a.a("passport_account_switch", (String) null, (String) null, kVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43233e = b.a.a(jSONObject, jSONObject2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ k a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        k kVar = new k(z);
        if (z) {
            kVar.f43082j = this.f43233e;
        } else {
            kVar.f43073d = bVar.f43158b;
            kVar.f43075f = bVar.f43159c;
        }
        return kVar;
    }

    public j(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.a.a aVar2) {
        super(context, aVar, aVar2);
    }
}
