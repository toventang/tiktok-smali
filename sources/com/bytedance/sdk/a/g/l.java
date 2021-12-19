package com.bytedance.sdk.a.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.b.i;
import com.bytedance.sdk.a.a.d.m;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.i.a;
import org.json.JSONObject;

public final class l extends h<m> {
    static {
        Covode.recordClassIndex(26513);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(m mVar) {
        a.a("passport_update_pwd", (String) null, (String) null, mVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ m a(boolean z, b bVar) {
        m mVar = new m(z);
        if (!z) {
            mVar.f43073d = bVar.f43158b;
            mVar.f43075f = bVar.f43159c;
        }
        return mVar;
    }

    public l(Context context, com.bytedance.sdk.a.d.a aVar, i iVar) {
        super(context, aVar, iVar);
    }
}
