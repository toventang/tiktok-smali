package com.ss.android.ugc.aweme.account.login.v2.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import h.f.b.l;
import org.json.JSONObject;

public final class o extends h<d<n>> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f64251e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final n f64252f;

    static {
        Covode.recordClassIndex(39586);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39587);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(d<n> dVar) {
        l.d(dVar, "");
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        this.f64252f.f43284m = jSONObject2;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        this.f64252f.f43284m = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<n> a(boolean z, b bVar) {
        l.d(bVar, "");
        this.f64252f.f43279h = bVar.f43158b;
        this.f64252f.f43281j = bVar.f43159c;
        return new d(z, 1009, this.f64252f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(Context context, com.bytedance.sdk.a.d.a aVar, n nVar, m mVar) {
        super(context, aVar, mVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(nVar, "");
        l.d(mVar, "");
        this.f64252f = nVar;
    }
}
