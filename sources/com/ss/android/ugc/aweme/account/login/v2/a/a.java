package com.ss.android.ugc.aweme.account.login.v2.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import h.f.b.l;
import org.json.JSONObject;

public final class a extends h<d<com.bytedance.sdk.a.h.a.a>> {

    /* renamed from: e  reason: collision with root package name */
    public static final C1437a f64144e = new C1437a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.sdk.a.h.a.a f64145f;

    static {
        Covode.recordClassIndex(39525);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a$a  reason: collision with other inner class name */
    public static final class C1437a {
        static {
            Covode.recordClassIndex(39526);
        }

        private C1437a() {
        }

        public /* synthetic */ C1437a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(d<com.bytedance.sdk.a.h.a.a> dVar) {
        d<com.bytedance.sdk.a.h.a.a> dVar2 = dVar;
        l.d(dVar2, "");
        com.bytedance.sdk.a.i.a.a("passport_mobile_bind", "mobile", (String) null, dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<com.bytedance.sdk.a.h.a.a> a(boolean z, b bVar) {
        l.d(bVar, "");
        return new d(z, 1012, this.f64145f);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        this.f64145f.f43247g = b.a.a(jSONObject, jSONObject2);
        this.f64145f.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        com.bytedance.sdk.a.f.b.a(this.f64145f, jSONObject);
        this.f64145f.f43284m = jSONObject2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.h.a.a aVar2, com.bytedance.sdk.a.h.b.a.a aVar3) {
        super(context, aVar, aVar3);
        l.d(context, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        this.f64145f = aVar2;
    }
}
