package com.bytedance.android.live.core.f;

import android.os.Build;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    static final a f9110a = new b((byte) 0);

    static class a {
        static {
            Covode.recordClassIndex(4666);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public void a(WebView webView, String str) {
            MethodCollector.i(10100);
            if (webView == null) {
                MethodCollector.o(10100);
                return;
            }
            try {
                webView.loadUrl(str);
                MethodCollector.o(10100);
            } catch (Throwable unused) {
                MethodCollector.o(10100);
            }
        }
    }

    static class b extends a {
        static {
            Covode.recordClassIndex(4667);
        }

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.bytedance.android.live.core.f.t.a
        public final void a(WebView webView, String str) {
            MethodCollector.i(10263);
            if (webView == null) {
                MethodCollector.o(10263);
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    MethodCollector.o(10263);
                    return;
                } catch (Throwable th) {
                    boolean z = th instanceof IllegalStateException;
                }
            }
            try {
                webView.loadUrl(str);
                MethodCollector.o(10263);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(4665);
        int i2 = Build.VERSION.SDK_INT;
    }

    public static void a(WebView webView, String str) {
        f9110a.a(webView, str);
    }
}
