package com.bytedance.sdk.a.m;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.e;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import org.json.JSONObject;

public final class g extends h<e> {

    /* renamed from: e  reason: collision with root package name */
    private a f43462e = new a();

    public static class a extends f {
        static {
            Covode.recordClassIndex(26616);
        }
    }

    static {
        Covode.recordClassIndex(26615);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(e eVar) {
        com.bytedance.sdk.a.i.a.a("2_user_info", this.f43207b.a("platform"), (String) null, eVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a.a(this.f43462e, jSONObject);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a.a(jSONObject, this.f43462e);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ e a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        e a2 = b.a.a(this.f43462e, z);
        if (z) {
            a2.f43082j = this.f43462e.f43457b;
        } else {
            a2.f43073d = this.f43462e.f43438g;
            a2.f43075f = this.f43462e.f43439h;
        }
        return a2;
    }

    public g(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.a.a<e> aVar2) {
        super(context, aVar, aVar2);
    }
}
