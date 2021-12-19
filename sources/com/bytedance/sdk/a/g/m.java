package com.bytedance.sdk.a.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.b.j;
import com.bytedance.sdk.a.a.d.n;
import com.bytedance.sdk.a.d.a;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class m extends h<n> {

    /* renamed from: e  reason: collision with root package name */
    private n f43238e;

    static {
        Covode.recordClassIndex(26514);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(n nVar) {
        a.a("passport_token_beat_v2", (String) null, (String) null, nVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        n nVar = new n(true);
        this.f43238e = nVar;
        nVar.f43077h = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ n a(boolean z, b bVar) {
        n nVar = this.f43238e;
        if (nVar == null) {
            nVar = new n(z);
        } else {
            nVar.f43071b = z;
        }
        if (!z) {
            nVar.f43073d = bVar.f43158b;
            nVar.f43075f = bVar.f43159c;
        }
        return nVar;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        n nVar = new n(false);
        this.f43238e = nVar;
        nVar.f43077h = jSONObject2;
        this.f43238e.f43103j = jSONObject.optString("error_name");
    }

    private m(Context context, com.bytedance.sdk.a.d.a aVar, j jVar) {
        super(context, aVar, jVar);
    }

    public static m a(Context context, String str, j jVar) {
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = str;
        return new m(context, aVar.b(), jVar);
    }
}
