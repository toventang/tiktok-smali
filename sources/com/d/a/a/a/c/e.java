package com.d.a.a.a.c;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.d.a.a.a.e.c;
import com.ss.android.ugc.tiktok.security.b.h;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static e f46383a = new e();

    static {
        Covode.recordClassIndex(28317);
    }

    private e() {
    }

    private void a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            c(webView, sb2);
        } else {
            handler.post(new Runnable() {
                /* class com.d.a.a.a.c.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28318);
                }

                public final void run() {
                    MethodCollector.i(6302);
                    WebView webView = webView;
                    String str = sb2;
                    String a2 = h.f149026a.a(webView, str);
                    if (!TextUtils.isEmpty(a2)) {
                        str = a2;
                    }
                    webView.loadUrl(str);
                    MethodCollector.o(6302);
                }
            });
        }
    }

    private static void a(StringBuilder sb, Object[] objArr) {
        StringBuilder append;
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    append = sb.append('\"');
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            append = sb.append('\"').append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                append.append('\"');
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    public static boolean a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        c(webView, "javascript: ".concat(String.valueOf(str)));
        return true;
    }

    public final void a(WebView webView, float f2) {
        a(webView, "setDeviceVolume", Float.valueOf(f2));
    }

    public final void a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        a(webView, "publishMediaEvent", str);
    }

    public final void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            a(sb, objArr);
            sb.append(")}");
            a(webView, sb);
            return;
        }
        c.a("The WebView is null for ".concat(String.valueOf(str)));
    }

    public final void b(WebView webView, String str) {
        a(webView, "setNativeViewHierarchy", str);
    }

    private static void c(WebView webView, String str) {
        MethodCollector.i(6127);
        String a2 = h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str);
        MethodCollector.o(6127);
    }
}
