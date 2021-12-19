package com.ss.android.ugc.aweme.account.login.recover.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.m;
import h.f.b.l;
import org.json.JSONObject;

public final class c extends h<d<m>> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f63564f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final m f63565e;

    static {
        Covode.recordClassIndex(39190);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39191);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(d<m> dVar) {
        d<m> dVar2 = dVar;
        l.d(dVar2, "");
        com.bytedance.sdk.a.i.a.a("passport_mobile_login", "mobile", "login", dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<m> a(boolean z, b bVar) {
        l.d(bVar, "");
        return new d(z, 1006, this.f63565e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        this.f63565e.f43301e = b.a.a(jSONObject, jSONObject2);
        this.f63565e.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        com.bytedance.sdk.a.f.b.a(this.f63565e, jSONObject);
        this.f63565e.f43284m = jSONObject2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, com.bytedance.sdk.a.d.a aVar, m mVar, com.bytedance.sdk.a.h.b.a.h hVar) {
        super(context, aVar, hVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(mVar, "");
        l.d(hVar, "");
        this.f63565e = mVar;
    }
}
