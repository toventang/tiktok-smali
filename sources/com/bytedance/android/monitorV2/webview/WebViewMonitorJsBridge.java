package com.bytedance.android.monitorV2.webview;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.d.d;
import com.bytedance.android.monitorV2.f.a;
import com.bytedance.android.monitorV2.i.b;
import com.bytedance.android.monitorV2.l.e;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class WebViewMonitorJsBridge {
    public WeakReference<WebView> mWebViewRef;
    public Handler mainHandler = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(14212);
    }

    @JavascriptInterface
    public String getVersion() {
        return "1.2.0-alpha.4";
    }

    @JavascriptInterface
    public void injectJS() {
        b.b("WebViewMonitorJsBridge", "inject js");
        final long currentTimeMillis = System.currentTimeMillis();
        a.a(new Runnable() {
            /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.AnonymousClass7 */

            static {
                Covode.recordClassIndex(14220);
            }

            public final void run() {
                if (n.f24265b.g(WebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    n.f24265b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), currentTimeMillis);
                }
            }
        });
    }

    @JavascriptInterface
    public void reportPageLatestData(final String str) {
        b.b("WebViewMonitorJsBridge", "report latest page data");
        a.a(new Runnable() {
            /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.AnonymousClass6 */

            static {
                Covode.recordClassIndex(14218);
            }

            public final void run() {
                if (n.f24265b.g(WebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    final JSONObject a2 = f.a(str);
                    String c2 = f.c(a2, "performance");
                    String c3 = f.c(f.a(c2), "serviceType");
                    String c4 = f.c(a2, "resource");
                    String c5 = f.c(f.a(c4), "serviceType");
                    final String c6 = f.c(a2, "url");
                    n.f24265b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), c6, c3, c2);
                    n.f24265b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), c5, c4);
                    String c7 = f.c(a2, "cacheData");
                    n.f24265b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), f.c(f.a(c7), "serviceType"), c7);
                    WebViewMonitorJsBridge.this.mainHandler.post(new Runnable() {
                        /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.AnonymousClass6.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14219);
                        }

                        public final void run() {
                            try {
                                b.a("WebViewMonitorJsBridge", "reportPageLatestData : " + c6);
                                String c2 = f.c(a2, "needReport");
                                if (!TextUtils.isEmpty(c2) && c2.equals("true")) {
                                    n.f24264a.b(WebViewMonitorJsBridge.this.mWebViewRef.get());
                                }
                            } catch (Throwable unused) {
                                HybridMultiMonitor.getInstance().getExceptionHandler();
                            }
                        }
                    });
                }
            }
        });
    }

    public WebViewMonitorJsBridge(WebView webView) {
        this.mWebViewRef = new WeakReference<>(webView);
    }

    @JavascriptInterface
    public void batch(final String str) {
        b.b("WebViewMonitorJsBridge", "batch");
        if (n.f24265b.g(this.mWebViewRef.get())) {
            a.a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(14215);
                }

                public final void run() {
                    try {
                        JSONArray jSONArray = new JSONArray(str);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            l.a().a(WebViewMonitorJsBridge.this.mWebViewRef.get(), jSONArray.getJSONObject(i2));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void sendInitTimeInfo(final String str) {
        b.b("WebViewMonitorJsBridge", "sendInitTimeInfo: ");
        if (n.f24265b.g(this.mWebViewRef.get())) {
            a.a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(14217);
                }

                public final void run() {
                    n.f24265b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), str);
                }
            });
        }
    }

    @JavascriptInterface
    public void terminatedPreCollect(String str) {
        b.b("WebViewMonitorJsBridge", "terminatedPreCollect: ".concat(String.valueOf(str)));
        if (n.f24265b.g(this.mWebViewRef.get())) {
            final WebView webView = this.mWebViewRef.get();
            a.a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(14221);
                }

                public final void run() {
                    if (webView != null) {
                        l.a().m(WebViewMonitorJsBridge.this.mWebViewRef.get());
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void config(String str) {
        b.b("WebViewMonitorJsBridge", "config: ".concat(String.valueOf(str)));
        if (n.f24265b.g(this.mWebViewRef.get())) {
            JSONObject a2 = f.a(str);
            String c2 = f.c(a2, "bid");
            WebView webView = this.mWebViewRef.get();
            if (webView != null) {
                n.b(webView, c2);
                JSONObject a3 = e.a.a(a2);
                String i2 = l.a().i(webView);
                o oVar = l.a().f24233a;
                if (i2 != null && !i2.isEmpty()) {
                    if (oVar.f24293m.containsKey(i2)) {
                        oVar.f24293m.put(i2, f.b(oVar.f24293m.get(i2), a3));
                        return;
                    }
                    oVar.f24293m.put(i2, a3);
                }
            }
        }
    }

    @JavascriptInterface
    public void cover(final String str, final String str2) {
        b.b("WebViewMonitorJsBridge", "cover: eventType: ".concat(String.valueOf(str2)));
        if (n.f24265b.g(this.mWebViewRef.get())) {
            a.a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14213);
                }

                public final void run() {
                    try {
                        n.f24265b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), f.c(f.a(str), "url"), str2, str);
                    } catch (Throwable unused) {
                        HybridMultiMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void reportDirectly(final String str, final String str2) {
        b.b("WebViewMonitorJsBridge", "reportDirectly: eventType: ".concat(String.valueOf(str2)));
        if (n.f24265b.g(this.mWebViewRef.get())) {
            a.a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(14214);
                }

                public final void run() {
                    try {
                        n.f24265b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), str2, str);
                    } catch (Throwable unused) {
                        HybridMultiMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void customReport(final String str, final String str2, final String str3, boolean z, String str4, final String str5, final String str6) {
        final int parseInt;
        b.b("WebViewMonitorJsBridge", "customReport: event: ".concat(String.valueOf(str)));
        if (n.f24265b.g(this.mWebViewRef.get()) && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str4)) {
                parseInt = Integer.parseInt(str4);
            } else if (z) {
                parseInt = 1;
            } else {
                parseInt = 2;
            }
            a.a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(14216);
                }

                public final void run() {
                    try {
                        JSONObject a2 = f.a(str3);
                        JSONObject a3 = f.a(str2);
                        JSONObject a4 = f.a(str5);
                        JSONObject a5 = f.a(str6);
                        d.a aVar = new d.a(str);
                        aVar.f23862c = a2;
                        aVar.f23863d = a3;
                        aVar.f23864e = a4;
                        aVar.f23866g = a5;
                        n.f24264a.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), aVar.a(parseInt).a());
                    } catch (Throwable unused) {
                        HybridMultiMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }
}
