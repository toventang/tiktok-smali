package com.ss.android.ugc.aweme.fe.method;

import android.webkit.WebView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class GetWebViewInfo extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91056a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57280);
    }

    private GetWebViewInfo(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57281);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ GetWebViewInfo() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public GetWebViewInfo(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    public static final class b implements com.ss.android.ugc.d.a.b {

        /* renamed from: a  reason: collision with root package name */
        public final int f91057a;

        /* renamed from: b  reason: collision with root package name */
        public final BaseCommonJavaMethod.a f91058b;

        static {
            Covode.recordClassIndex(57282);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f91057a == bVar.f91057a && l.a(this.f91058b, bVar.f91058b);
        }

        public final int hashCode() {
            int i2 = this.f91057a * 31;
            BaseCommonJavaMethod.a aVar = this.f91058b;
            return i2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "GetStatusEvent(webViewHash=" + this.f91057a + ", iReturn=" + this.f91058b + ")";
        }

        public b(int i2, BaseCommonJavaMethod.a aVar) {
            this.f91057a = i2;
            this.f91058b = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        int i2;
        WebView webView;
        com.bytedance.ies.web.a.a aVar2 = this.mJsBridge;
        if (aVar2 == null || (webView = aVar2.f35513d) == null) {
            i2 = 0;
        } else {
            i2 = webView.hashCode();
        }
        c.a(new b(i2, aVar));
    }
}
