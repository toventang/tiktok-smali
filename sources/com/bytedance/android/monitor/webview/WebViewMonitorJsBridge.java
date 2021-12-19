package com.bytedance.android.monitor.webview;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.d.c;
import com.bytedance.android.monitor.f.a;
import com.bytedance.android.monitor.h.b;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class WebViewMonitorJsBridge {
    public WeakReference<WebView> mWebViewRef;
    public Handler mainHandler = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(14031);
    }

    @JavascriptInterface
    public String getVersion() {
        return "1.2.5";
    }

    @JavascriptInterface
    public void injectJS() {
        b.b("WebViewMonitorJsBridge", "inject js");
        final long currentTimeMillis = System.currentTimeMillis();
        a.a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.AnonymousClass7 */

            static {
                Covode.recordClassIndex(14039);
            }

            public final void run() {
                if (i.f23765b.g(WebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    i.f23765b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), currentTimeMillis);
                }
            }
        });
    }

    @JavascriptInterface
    public void reportPageLatestData(final String str) {
        b.b("WebViewMonitorJsBridge", "report latest page data");
        a.a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.AnonymousClass6 */

            static {
                Covode.recordClassIndex(14037);
            }

            public final void run() {
                if (i.f23765b.g(WebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    final JSONObject a2 = d.a(str);
                    String b2 = d.b(a2, "performance");
                    String b3 = d.b(d.a(b2), "serviceType");
                    String b4 = d.b(a2, "resource");
                    String b5 = d.b(d.a(b4), "serviceType");
                    final String b6 = d.b(a2, "url");
                    i.f23765b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), b6, b3, b2);
                    i.f23765b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), b5, b4);
                    WebViewMonitorJsBridge.this.mainHandler.post(new Runnable() {
                        /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.AnonymousClass6.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14038);
                        }

                        public final void run() {
                            try {
                                b.a("TTLiveWebViewMonitorJsBridge", "reportPageLatestData : " + b6);
                                String b2 = d.b(a2, "needReport");
                                if (!TextUtils.isEmpty(b2) && b2.equals("true")) {
                                    i.f23764a.b(WebViewMonitorJsBridge.this.mWebViewRef.get());
                                }
                            } catch (Throwable unused) {
                                HybridMonitor.getInstance().getExceptionHandler();
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
        if (i.f23765b.g(this.mWebViewRef.get())) {
            a.a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(14034);
                }

                public final void run() {
                    try {
                        JSONArray jSONArray = new JSONArray(str);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            String jSONObject2 = jSONObject.toString();
                            String b2 = d.b(jSONObject, "serviceType");
                            if (b2.equals("")) {
                                JSONObject a2 = d.a(d.b(jSONObject, "category"));
                                JSONObject a3 = d.a(d.b(jSONObject, "metrics"));
                                JSONObject a4 = d.a(d.b(jSONObject, "timing"));
                                JSONObject a5 = d.a(d.b(jSONObject, "extra"));
                                c.a aVar = new c.a(d.b(jSONObject, "eventName"));
                                aVar.f23443c = a2;
                                aVar.f23445e = a5;
                                aVar.f23446f = a4;
                                aVar.f23444d = a3;
                                aVar.f23448h = d.a(jSONObject, "canSample", (Boolean) true);
                                i.f23764a.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), aVar.a());
                            } else if (b2.equals("perf")) {
                                i.f23765b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), d.b(jSONObject, "url"), b2, jSONObject2);
                            } else {
                                i.f23765b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), b2, jSONObject2);
                            }
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
        if (i.f23765b.g(this.mWebViewRef.get())) {
            a.a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(14036);
                }

                public final void run() {
                    i.f23765b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), str);
                }
            });
        }
    }

    @JavascriptInterface
    public void cover(final String str, final String str2) {
        b.b("WebViewMonitorJsBridge", "cover: eventType: ".concat(String.valueOf(str2)));
        if (i.f23765b.g(this.mWebViewRef.get())) {
            a.a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14032);
                }

                public final void run() {
                    try {
                        i.f23765b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), d.b(d.a(str), "url"), str2, str);
                    } catch (Throwable unused) {
                        HybridMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void reportDirectly(final String str, final String str2) {
        b.b("WebViewMonitorJsBridge", "reportDirectly: eventType: ".concat(String.valueOf(str2)));
        if (i.f23765b.g(this.mWebViewRef.get())) {
            a.a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(14033);
                }

                public final void run() {
                    try {
                        i.f23765b.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), str2, str);
                    } catch (Throwable unused) {
                        HybridMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void customReport(final String str, final String str2, final String str3, final boolean z, final String str4, final String str5) {
        b.b("WebViewMonitorJsBridge", "customReport: event: ".concat(String.valueOf(str)));
        if (i.f23765b.g(this.mWebViewRef.get()) && !TextUtils.isEmpty(str)) {
            a.a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(14035);
                }

                public final void run() {
                    try {
                        JSONObject a2 = d.a(str3);
                        JSONObject a3 = d.a(str2);
                        JSONObject a4 = d.a(str4);
                        JSONObject a5 = d.a(str5);
                        c.a aVar = new c.a(str);
                        aVar.f23443c = a2;
                        aVar.f23444d = a3;
                        aVar.f23445e = a4;
                        aVar.f23446f = a5;
                        aVar.f23448h = z;
                        i.f23764a.a(WebViewMonitorJsBridge.this.mWebViewRef.get(), aVar.a());
                    } catch (Throwable unused) {
                        HybridMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }
}
