package com.ss.android.ugc.aweme.account.login.recover.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.n;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import org.json.JSONObject;

public final class e extends h<d<n>> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f63571f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final n f63572e;

    static {
        Covode.recordClassIndex(39194);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39195);
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
        d<n> dVar2 = dVar;
        l.d(dVar2, "");
        com.bytedance.sdk.a.i.a.a("passport_mobile_sendcode", "mobile", this.f43207b.a(StringSet.type), dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<n> a(boolean z, b bVar) {
        l.d(bVar, "");
        return new d(z, 1002, this.f63572e);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        n nVar = this.f63572e;
        if (nVar != null) {
            nVar.t = jSONObject2.optInt("retry_time", 30);
        }
        n nVar2 = this.f63572e;
        if (nVar2 != null) {
            nVar2.f43284m = jSONObject;
        }
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        com.bytedance.sdk.a.f.b.a(this.f63572e, jSONObject);
        n nVar = this.f63572e;
        if (nVar != null) {
            nVar.f43284m = jSONObject2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, com.bytedance.sdk.a.d.a aVar, n nVar, com.bytedance.sdk.a.h.b.a.l lVar) {
        super(context, aVar, lVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(nVar, "");
        l.d(lVar, "");
        this.f63572e = nVar;
    }
}
