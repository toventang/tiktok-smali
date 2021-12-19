package com.bytedance.sdk.a.h.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.i;
import com.bytedance.sdk.a.h.b.a.m;
import org.json.JSONObject;

public final class l extends h<d<a>> {

    /* renamed from: e  reason: collision with root package name */
    private a f43332e;

    static {
        Covode.recordClassIndex(26559);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<a> dVar) {
        com.bytedance.sdk.a.i.a.a("passport_mobile_set_password", "mobile", (String) null, dVar);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f43332e.f43284m = jSONObject;
    }

    public static class a extends i {

        /* renamed from: a  reason: collision with root package name */
        public String f43333a;

        /* renamed from: b  reason: collision with root package name */
        public String f43334b = null;

        static {
            Covode.recordClassIndex(26560);
        }

        public a(String str, String str2) {
            super(13);
            this.f43333a = str;
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<a> a(boolean z, b bVar) {
        return new d(z, 10002, this.f43332e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f43332e, jSONObject);
        this.f43332e.f43284m = jSONObject2;
    }

    public l(Context context, com.bytedance.sdk.a.d.a aVar, a aVar2, m mVar) {
        super(context, aVar, mVar);
        this.f43332e = aVar2;
    }
}
