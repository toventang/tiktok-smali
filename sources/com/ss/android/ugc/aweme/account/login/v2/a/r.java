package com.ss.android.ugc.aweme.account.login.v2.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import h.f.b.l;
import org.json.JSONObject;

public final class r extends h<d<q>> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f64260e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final q f64261f;

    static {
        Covode.recordClassIndex(39590);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39591);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(d<q> dVar) {
        d<q> dVar2 = dVar;
        l.d(dVar2, "");
        com.bytedance.sdk.a.i.a.a("passport_email_check_code", "email", (String) null, dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<q> a(boolean z, b bVar) {
        l.d(bVar, "");
        return new d(z, 10046, this.f64261f);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        com.bytedance.sdk.a.f.b.a(this.f64261f, jSONObject);
        this.f64261f.f43284m = jSONObject2;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        q qVar = this.f64261f;
        com.bytedance.sdk.a.n.a a2 = b.a.a(jSONObject, jSONObject2);
        l.b(a2, "");
        l.d(a2, "");
        qVar.f64254b = a2;
        this.f64261f.f43284m = jSONObject;
        q qVar2 = this.f64261f;
        String optString = jSONObject2.optString("ticket");
        l.b(optString, "");
        l.d(optString, "");
        qVar2.f64253a = optString;
    }

    private r(Context context, com.bytedance.sdk.a.d.a aVar, q qVar, p pVar) {
        super(context, aVar, pVar);
        this.f64261f = qVar;
    }

    public /* synthetic */ r(Context context, com.bytedance.sdk.a.d.a aVar, q qVar, p pVar, byte b2) {
        this(context, aVar, qVar, pVar);
    }
}
