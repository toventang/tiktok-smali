package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.b;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenAdPanelPageMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69010b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69011c = "openAdPanelPage";

    static {
        Covode.recordClassIndex(42553);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42554);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69011c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAdPanelPageMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("url");
        boolean z = false;
        int optInt = jSONObject.optInt("landingStyle", 0);
        try {
            Context e2 = e();
            if (e2 == null) {
                e2 = d.a();
            }
            l.b(optString, "");
            z = com.ss.android.ugc.aweme.commercialize.util.adrouter.d.a(e2, new b.a().f(optString).g(optString).f(optInt).f75413a).a();
        } catch (Throwable unused) {
        }
        if (z) {
            aVar.a(null, 1, null);
        } else {
            aVar.a(-1, "Can not handle url");
        }
    }
}
