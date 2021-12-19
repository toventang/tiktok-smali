package com.bytedance.ies.d.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.m;
import com.bytedance.ies.d.a.n;
import com.bytedance.ies.d.a.x;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import h.f.b.l;
import org.json.JSONObject;

public final class c extends e<JSONObject, JSONObject> implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33167a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final x f33168b;

    static {
        Covode.recordClassIndex(19815);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19816);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        this.f33168b.a();
    }

    @Override // com.bytedance.ies.d.a.n
    public final void a(Throwable th) {
        l.c(th, "");
        finishWithFailure(th);
    }

    public c(m mVar) {
        l.c(mVar, "");
        this.f33168b = new x(mVar, this);
    }

    @Override // com.bytedance.ies.d.a.n
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        finishWithResult(jSONObject);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        l.c(jSONObject2, "");
        l.c(gVar, "");
        this.f33168b.a(jSONObject2);
    }
}
