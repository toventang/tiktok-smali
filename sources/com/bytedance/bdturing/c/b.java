package com.bytedance.bdturing.c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.bdturing.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public WebView f26433a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f26434b;

    static {
        Covode.recordClassIndex(15542);
    }

    class a {

        /* renamed from: a  reason: collision with root package name */
        public a f26440a;

        static {
            Covode.recordClassIndex(15545);
        }

        @JavascriptInterface
        public final void offMethodParams(String str) {
            g.d("JS called method ======= offMethodParams(" + str + ")");
        }

        @JavascriptInterface
        public final void callMethodParams(final String str) {
            g.d("JS called method ======= callMethodParams(" + str + ")");
            if (b.this.f26434b == null) {
                g.a("uihandler is null");
            } else {
                b.this.f26434b.post(new Runnable() {
                    /* class com.bytedance.bdturing.c.b.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(15546);
                    }

                    public final void run() {
                        a.this.f26440a.b(new c(b.this, str));
                    }
                });
            }
        }

        @JavascriptInterface
        public final void onMethodParams(String str) {
            g.d("JS called method ======= onMethodParams(" + str + ")");
            try {
                new JSONObject(str).getString("__callback_id");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        public a(a aVar) {
            this.f26440a = aVar;
        }
    }

    public final void a(final String str) {
        Handler handler;
        if (str != null && this.f26433a != null && (handler = this.f26434b) != null) {
            handler.post(new Runnable() {
                /* class com.bytedance.bdturing.c.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                WebView f26435a;

                static {
                    Covode.recordClassIndex(15543);
                }

                public final void run() {
                    MethodCollector.i(738);
                    int i2 = Build.VERSION.SDK_INT;
                    this.f26435a.evaluateJavascript("javascript:window.Native2JSBridge._handleMessageFromApp(" + str + ")", null);
                    g.b("callJsCode ====== " + str);
                    MethodCollector.o(738);
                }

                {
                    this.f26435a = b.this.f26433a;
                }
            });
            g.d("callJsCode ====== ".concat(String.valueOf(str)));
        }
    }

    public b(a aVar, WebView webView) {
        this.f26433a = webView;
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(true);
            this.f26433a.addJavascriptInterface(new a(aVar), "androidJsBridge");
            this.f26434b = new Handler(Looper.getMainLooper());
        }
    }
}
