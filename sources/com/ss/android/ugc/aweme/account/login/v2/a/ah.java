package com.ss.android.ugc.aweme.account.login.v2.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import h.f.b.l;
import org.json.JSONObject;

public final class ah extends h<d<ag>> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f64225e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final ag f64226f;

    static {
        Covode.recordClassIndex(39569);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39570);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(d<ag> dVar) {
        d<ag> dVar2 = dVar;
        l.d(dVar2, "");
        com.bytedance.sdk.a.i.a.a("passport_account_verify", "mobile", (String) null, dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<ag> a(boolean z, b bVar) {
        l.d(bVar, "");
        return new d(z, 10031, this.f64226f);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        this.f64226f.f43284m = jSONObject;
        ag agVar = this.f64226f;
        String optString = jSONObject2.optString("ticket");
        l.b(optString, "");
        l.d(optString, "");
        agVar.f64222a = optString;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        com.bytedance.sdk.a.f.b.a(this.f64226f, jSONObject);
        this.f64226f.f43284m = jSONObject2;
    }

    private ah(Context context, com.bytedance.sdk.a.d.a aVar, ag agVar, af afVar) {
        super(context, aVar, afVar);
        this.f64226f = agVar;
    }

    public /* synthetic */ ah(Context context, com.bytedance.sdk.a.d.a aVar, ag agVar, af afVar, byte b2) {
        this(context, aVar, agVar, afVar);
    }
}
