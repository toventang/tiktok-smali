package com.ss.android.ugc.aweme.account.login.v2.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class aa extends h<d<c>> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f64189e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final c f64190f;

    static {
        Covode.recordClassIndex(39549);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39550);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(d<c> dVar) {
        d<c> dVar2 = dVar;
        l.d(dVar2, "");
        com.bytedance.sdk.a.i.a.a("passport_mobile_change_password", "mobile", (String) null, dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<c> a(boolean z, b bVar) {
        l.d(bVar, "");
        return new d(z, 1010, this.f64190f);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        this.f64190f.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        com.bytedance.sdk.a.f.b.a(this.f64190f, jSONObject);
        this.f64190f.f43284m = jSONObject2;
    }

    private aa(Context context, com.bytedance.sdk.a.d.a aVar, c cVar, com.bytedance.sdk.a.h.b.a.c cVar2) {
        super(context, aVar, cVar2);
        this.f64190f = cVar;
    }

    public /* synthetic */ aa(Context context, com.bytedance.sdk.a.d.a aVar, c cVar, com.bytedance.sdk.a.h.b.a.c cVar2, byte b2) {
        this(context, aVar, cVar, cVar2);
    }
}
