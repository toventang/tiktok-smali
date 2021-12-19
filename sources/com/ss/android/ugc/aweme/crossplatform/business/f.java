package com.ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.ax.a.m;
import com.ss.android.ugc.aweme.crossplatform.c.h;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import h.f.b.l;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class f implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    private final DouPlusMonitorBusiness f78676a;

    /* renamed from: b  reason: collision with root package name */
    private final int f78677b;

    /* renamed from: c  reason: collision with root package name */
    private final String f78678c;

    /* renamed from: d  reason: collision with root package name */
    private final WebView f78679d;

    static {
        Covode.recordClassIndex(48845);
    }

    f(DouPlusMonitorBusiness douPlusMonitorBusiness, int i2, String str, WebView webView) {
        this.f78676a = douPlusMonitorBusiness;
        this.f78677b = i2;
        this.f78678c = str;
        this.f78679d = webView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        k monitorSession;
        m mVar;
        int i2 = this.f78677b;
        String str = this.f78678c;
        WebView webView = this.f78679d;
        String str2 = (String) obj;
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.length() != 0) {
                    l.d(jSONObject, "");
                    l.d(webView, "");
                    if ((webView instanceof SingleWebView) && webView != null) {
                        Objects.requireNonNull(webView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView");
                        SingleWebView singleWebView = (SingleWebView) webView;
                        if (!(singleWebView == null || (monitorSession = singleWebView.getMonitorSession()) == null || (mVar = (m) monitorSession.a(m.class)) == null)) {
                            try {
                                h.a(jSONObject, mVar);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_status", i2);
                        jSONObject2.put("error_message", str);
                        jSONObject2.put("full_process_event", str2);
                    } catch (JSONException unused) {
                    }
                    b.a("douplus_full_process_log", 0, jSONObject2);
                }
            } catch (Exception unused2) {
            }
        }
    }
}
