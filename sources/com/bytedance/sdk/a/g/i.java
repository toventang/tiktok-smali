package com.bytedance.sdk.a.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.b.f;
import com.bytedance.sdk.a.a.d.j;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class i extends h<j> {

    /* renamed from: e  reason: collision with root package name */
    private String f43230e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f43231f;

    /* renamed from: g  reason: collision with root package name */
    private JSONObject f43232g;

    static {
        Covode.recordClassIndex(26510);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(j jVar) {
        a.a("passport_shark_safe_verify", (String) null, (String) null, jVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43232g = jSONObject2;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ j a(boolean z, b bVar) {
        j jVar = new j(z);
        if (z) {
            jVar.f43101j = this.f43230e;
            jVar.f43102k = this.f43231f;
        } else {
            jVar.f43073d = bVar.f43158b;
            jVar.f43075f = bVar.f43159c;
        }
        jVar.f43077h = this.f43232g;
        return jVar;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43232g = jSONObject;
        this.f43230e = jSONObject2.optString("ticket");
        this.f43231f = jSONObject2.optBoolean("safe");
    }

    public i(Context context, com.bytedance.sdk.a.d.a aVar, f fVar) {
        super(context, aVar, fVar);
    }
}
