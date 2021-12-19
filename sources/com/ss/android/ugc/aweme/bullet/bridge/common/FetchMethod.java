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

public final class FetchMethod extends BaseBridgeMethod implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f68960c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public k f68961b;

    /* renamed from: d  reason: collision with root package name */
    private final String f68962d = "fetch";

    /* renamed from: e  reason: collision with root package name */
    private k.a f68963e = k.a.PROTECT;

    /* renamed from: f  reason: collision with root package name */
    private final a.c f68964f = new c(this);

    static {
        Covode.recordClassIndex(42512);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42513);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f68963e;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68962d;
    }

    static final class b implements a.AbstractC3854a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f68965a;

        static {
            Covode.recordClassIndex(42514);
        }

        b(BaseBridgeMethod.a aVar) {
            this.f68965a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.web.jsbridge.a.a.AbstractC3854a
        public final void a(JSONObject jSONObject) {
            this.f68965a.a(jSONObject);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f68963e = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            com.ss.android.ugc.aweme.web.jsbridge.a.a.a(a(jSONObject), jSONObject.optJSONObject("res"), i(), new b(aVar), this.f68964f).a();
        } catch (Exception unused) {
        }
    }

    static final class c implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FetchMethod f68966a;

        static {
            Covode.recordClassIndex(42515);
        }

        c(FetchMethod fetchMethod) {
            this.f68966a = fetchMethod;
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod.c.a(com.ss.android.ugc.aweme.web.jsbridge.a.a$b, com.ss.android.ugc.aweme.web.jsbridge.a.a$d):void");
        }
    }
}
