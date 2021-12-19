package com.ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.ecommerce.e.a;
import com.bytedance.android.ecommerce.j.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import h.m.p;
import org.json.JSONObject;

public final class InitPIPOSdkMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68985b = "initPipo";

    static {
        Covode.recordClassIndex(42534);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68985b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InitPIPOSdkMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final b f68987a = new b();

        static {
            Covode.recordClassIndex(42536);
        }

        b() {
        }

        @Override // com.bytedance.android.ecommerce.j.k
        public final void a(String str) {
            l.b(str, "");
            if (!p.b(str, "aweme://webview/", false)) {
                SmartRouter.buildRoute(g.b(), "aweme://webview/").withParam("url", str).open();
            } else {
                SmartRouter.buildRoute(g.b(), str).open();
            }
        }
    }

    static final class a implements com.bytedance.android.ecommerce.i.b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f68986a = new a();

        static {
            Covode.recordClassIndex(42535);
        }

        a() {
        }

        @Override // com.bytedance.android.ecommerce.i.b
        public final void a(String str, JSONObject jSONObject) {
            r.a(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        a.C0095a aVar2 = new a.C0095a(g.a());
        aVar2.f7053l = a.f68986a;
        aVar2.q = b.f68987a;
        aVar2.f7043b = "https://fp22-normal-useast1a.tiktokv.com";
        com.bytedance.android.ecommerce.e.a a2 = aVar2.a();
        l.b(a2, "");
        com.bytedance.android.ecommerce.a.f6869a.a(a2);
        aVar.a((Object) 1);
    }
}
