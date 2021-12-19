package com.ss.android.ugc.aweme.bullet.bridge.ad;

import android.webkit.WebView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class GetWebViewInfo extends BaseBridgeMethod implements au {
    static {
        Covode.recordClassIndex(42450);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return "getWebViewInfo";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetWebViewInfo(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    public static final class a implements com.ss.android.ugc.d.a.b {

        /* renamed from: a  reason: collision with root package name */
        public final int f68879a;

        /* renamed from: b  reason: collision with root package name */
        public final BaseBridgeMethod.a f68880b;

        static {
            Covode.recordClassIndex(42451);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f68879a == aVar.f68879a && l.a(this.f68880b, aVar.f68880b);
        }

        public final int hashCode() {
            int i2 = this.f68879a * 31;
            BaseBridgeMethod.a aVar = this.f68880b;
            return i2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "GetStatusEvent(webViewHash=" + this.f68879a + ", iReturn=" + this.f68880b + ")";
        }

        public a(int i2, BaseBridgeMethod.a aVar) {
            this.f68879a = i2;
            this.f68880b = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        int i2;
        WebView webView;
        l.d(jSONObject, "");
        l.d(aVar, "");
        com.bytedance.ies.web.a.a aVar2 = (com.bytedance.ies.web.a.a) this.f32005a.c(com.bytedance.ies.web.a.a.class);
        if (aVar2 == null || (webView = aVar2.f35513d) == null) {
            i2 = 0;
        } else {
            i2 = webView.hashCode();
        }
        c.a(new a(i2, aVar));
    }
}
