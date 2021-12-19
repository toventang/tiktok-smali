package com.ss.android.ugc.aweme.account.login.v2.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.d.b;
import com.bytedance.sdk.a.f.h;
import h.f.b.l;
import org.json.JSONObject;

public final class j extends h<d<l>> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f64244e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final l f64245f;

    static {
        Covode.recordClassIndex(39580);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39581);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ void a(d<l> dVar) {
        l.d(dVar, "");
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ d<l> a(boolean z, b bVar) {
        l.d(bVar, "");
        return new d(z, 1010, this.f64245f);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        this.f64245f.f43284m = jSONObject;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        com.bytedance.sdk.a.f.b.a(this.f64245f, jSONObject);
        this.f64245f.f43284m = jSONObject2;
    }

    private j(Context context, com.bytedance.sdk.a.d.a aVar, l lVar, k kVar) {
        super(context, aVar, kVar);
        this.f64245f = lVar;
    }

    public /* synthetic */ j(Context context, com.bytedance.sdk.a.d.a aVar, l lVar, k kVar, byte b2) {
        this(context, aVar, lVar, kVar);
    }
}
