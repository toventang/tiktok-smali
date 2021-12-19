package com.ss.android.newmedia;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tiktok.security.b.h;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final a f59975a = new b((byte) 0);

    static class a {
        static {
            Covode.recordClassIndex(37062);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public void a(WebView webView, String str) {
            MethodCollector.i(12555);
            if (webView == null) {
                MethodCollector.o(12555);
                return;
            }
            try {
                String a2 = h.f149026a.a(webView, str);
                if (!TextUtils.isEmpty(a2)) {
                    str = a2;
                }
                webView.loadUrl(str);
                MethodCollector.o(12555);
            } catch (Throwable unused) {
                MethodCollector.o(12555);
            }
        }
    }

    static class b extends a {
        static {
            Covode.recordClassIndex(37063);
        }

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.ss.android.newmedia.g.a
        public final void a(WebView webView, String str) {
            MethodCollector.i(12553);
            if (webView == null) {
                MethodCollector.o(12553);
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    MethodCollector.o(12553);
                    return;
                } catch (Throwable th) {
                    boolean z = th instanceof IllegalStateException;
                }
            }
            try {
                String a2 = h.f149026a.a(webView, str);
                if (!TextUtils.isEmpty(a2)) {
                    str = a2;
                }
                webView.loadUrl(str);
                MethodCollector.o(12553);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(37061);
        int i2 = Build.VERSION.SDK_INT;
    }

    public static void a(WebView webView, String str) {
        f59975a.a(webView, str);
    }
}
