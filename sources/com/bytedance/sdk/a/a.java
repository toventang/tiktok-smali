package com.bytedance.sdk.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.c;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import org.json.JSONObject;

public final class a extends h<c> {

    /* renamed from: e  reason: collision with root package name */
    private String f43064e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.a.m.a f43065f = new com.bytedance.sdk.a.m.a();

    static {
        Covode.recordClassIndex(26396);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(c cVar) {
        com.bytedance.sdk.a.i.a.a("passport_logout", (String) null, (String) null, cVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a(this.f43065f, jSONObject);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43065f.f43442k = jSONObject.optString("session_key");
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ c a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        c cVar = new c(z);
        if (z) {
            cVar.f43079j = this.f43065f.f43442k;
        } else {
            cVar.f43073d = this.f43065f.f43438g;
            cVar.f43075f = this.f43065f.f43439h;
        }
        cVar.f43080k = this.f43064e;
        return cVar;
    }

    public a(Context context, com.bytedance.sdk.a.d.a aVar, String str, com.bytedance.sdk.a.a.a.a<c> aVar2) {
        super(context, aVar, aVar2);
        this.f43064e = str;
    }
}
