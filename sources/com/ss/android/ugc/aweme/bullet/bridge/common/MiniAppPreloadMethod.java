package com.ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import h.f.b.l;
import org.json.JSONObject;

public final class MiniAppPreloadMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69006b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69007c = "preloadMiniApp";

    static {
        Covode.recordClassIndex(42549);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42550);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69007c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniAppPreloadMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (jSONObject.has("mini_app_url")) {
            c cVar = c.a.f109704a;
            l.b(cVar, "");
            cVar.a().preloadMiniApp(jSONObject.optString("mini_app_url"));
        }
    }
}
