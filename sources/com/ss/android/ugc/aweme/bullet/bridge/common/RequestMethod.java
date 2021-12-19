package com.ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.web.jsbridge.a.a;
import h.f.b.l;
import org.json.JSONObject;

public final class RequestMethod extends BaseBridgeMethod implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f69027c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public k f69028b;

    /* renamed from: d  reason: collision with root package name */
    private final String f69029d = "request";

    /* renamed from: e  reason: collision with root package name */
    private k.a f69030e = k.a.PROTECT;

    /* renamed from: f  reason: collision with root package name */
    private final a.c f69031f = new c(this);

    static {
        Covode.recordClassIndex(42569);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42570);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69030e;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69029d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69030e = aVar;
    }

    static final class b implements a.AbstractC3854a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f69032a;

        static {
            Covode.recordClassIndex(42571);
        }

        b(BaseBridgeMethod.a aVar) {
            this.f69032a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.web.jsbridge.a.a.AbstractC3854a
        public final void a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("_raw"));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("response", jSONObject2);
            this.f69032a.a((Object) jSONObject3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            com.ss.android.ugc.aweme.web.jsbridge.a.a.a(a(jSONObject), jSONObject.optJSONObject("res"), null, new b(aVar), this.f69031f).a();
        } catch (Exception unused) {
        }
    }

    static final class c implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RequestMethod f69033a;

        static {
            Covode.recordClassIndex(42572);
        }

        c(RequestMethod requestMethod) {
            this.f69033a = requestMethod;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
            if (r0 != 0) goto L_0x0053;
         */
        @Override // com.ss.android.ugc.aweme.web.jsbridge.a.a.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.web.jsbridge.a.a.b r7, com.ss.android.ugc.aweme.web.jsbridge.a.a.d r8) {
            /*
            // Method dump skipped, instructions count: 199
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod.c.a(com.ss.android.ugc.aweme.web.jsbridge.a.a$b, com.ss.android.ugc.aweme.web.jsbridge.a.a$d):void");
        }
    }
}
