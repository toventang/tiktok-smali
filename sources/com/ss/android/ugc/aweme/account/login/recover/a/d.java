package com.ss.android.ugc.aweme.account.login.recover.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.b;
import com.bytedance.sdk.a.f.h;
import com.ss.android.ugc.aweme.account.login.recover.a.b.c;
import h.f.b.l;
import org.json.JSONObject;

public final class d extends h<b> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f63567f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public c f63568e;

    static {
        Covode.recordClassIndex(39192);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(b bVar) {
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39193);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.sdk.a.f.h
    public final b a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        c cVar = this.f63568e;
        if (cVar == null) {
            cVar = new c(z);
            cVar.f43071b = z;
        }
        if (!z && bVar != null) {
            cVar.f43073d = bVar.f43158b;
            cVar.f43075f = bVar.f43159c;
        }
        this.f63568e = null;
        return cVar;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        c cVar = new c(true);
        this.f63568e = cVar;
        if (jSONObject2 != null) {
            cVar.f63560j = jSONObject2.optBoolean("safe");
            cVar.f63561k = jSONObject2.optString("ticket");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, com.bytedance.sdk.a.d.a aVar, com.ss.android.ugc.aweme.account.login.recover.a.a.c cVar) {
        super(context, aVar, cVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(cVar, "");
    }
}
