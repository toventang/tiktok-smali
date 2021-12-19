package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.d.a.c;
import org.json.JSONObject;

public final class CloseMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91029a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57256);
    }

    private CloseMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57257);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ CloseMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public static final class b implements com.ss.android.ugc.d.a.b {

        /* renamed from: a  reason: collision with root package name */
        public final int f91030a;

        static {
            Covode.recordClassIndex(57258);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.f91030a == ((b) obj).f91030a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f91030a;
        }

        public final String toString() {
            return "WebViewFragmentBackEvent(webViewHash=" + this.f91030a + ")";
        }

        public b(int i2) {
            this.f91030a = i2;
        }
    }

    public CloseMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        int i2;
        WebView webView;
        WebView webView2;
        String optString;
        if (this.mJsBridge != null) {
            int i3 = 0;
            if (jSONObject != null && (optString = jSONObject.optString("reactId")) != null && optString.length() != 0 && optString != null) {
                c.a(new com.ss.android.sdk.webview.b(optString));
            } else if (this.mContextRef != null) {
                Context actContext = getActContext();
                if (actContext instanceof Activity) {
                    Activity activity = (Activity) actContext;
                    if (activity.isFinishing()) {
                        return;
                    }
                    if (actContext instanceof f.c) {
                        com.bytedance.ies.web.a.a aVar2 = this.mJsBridge;
                        if (aVar2 == null || (webView2 = aVar2.f35513d) == null) {
                            i2 = 0;
                        } else {
                            i2 = webView2.hashCode();
                        }
                        c.a(new b(i2));
                        com.bytedance.ies.web.a.a aVar3 = this.mJsBridge;
                        if (!(aVar3 == null || (webView = aVar3.f35513d) == null)) {
                            i3 = webView.hashCode();
                        }
                        c.a(new com.ss.android.ugc.aweme.ad.c.b(i3));
                        return;
                    }
                    activity.finish();
                }
            }
        }
    }
}
