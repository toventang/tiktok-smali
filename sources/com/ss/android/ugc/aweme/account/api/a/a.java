package com.ss.android.ugc.aweme.account.api.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.n;
import com.bytedance.sdk.a.h.b.a.l;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public final class a extends h<d<n>> {

    /* renamed from: f  reason: collision with root package name */
    public static final C1383a f62859f = new C1383a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final n f62860e;

    static {
        Covode.recordClassIndex(38719);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.api.a.a$a  reason: collision with other inner class name */
    public static final class C1383a {
        static {
            Covode.recordClassIndex(38720);
        }

        private C1383a() {
        }

        public /* synthetic */ C1383a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(d<n> dVar) {
        com.bytedance.sdk.a.i.a.a("passport_mobile_sendcode", "mobile", this.f43207b.a(StringSet.type), dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<n> a(boolean z, b bVar) {
        return new d(z, 1002, this.f62860e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        int i2;
        n nVar = this.f62860e;
        if (jSONObject2 != null) {
            i2 = jSONObject2.optInt("retry_time", 30);
        } else {
            i2 = 0;
        }
        nVar.t = i2;
        this.f62860e.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.a.f.b.a(this.f62860e, jSONObject);
        this.f62860e.f43284m = jSONObject2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, com.bytedance.sdk.a.d.a aVar, n nVar, l lVar) {
        super(context, aVar, lVar);
        h.f.b.l.d(context, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(nVar, "");
        h.f.b.l.d(lVar, "");
        this.f62860e = nVar;
    }
}
