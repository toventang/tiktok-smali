package com.bytedance.ies.web.a;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tiktok.security.b.h;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static final a f35539a = new b((byte) 0);

    /* access modifiers changed from: package-private */
    public static class a {
        static {
            Covode.recordClassIndex(21249);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public void a(WebView webView, String str) {
            MethodCollector.i(6170);
            if (webView == null) {
                MethodCollector.o(6170);
                return;
            }
            try {
                String a2 = h.f149026a.a(webView, str);
                if (!TextUtils.isEmpty(a2)) {
                    str = a2;
                }
                webView.loadUrl(str);
                MethodCollector.o(6170);
            } catch (Throwable unused) {
                MethodCollector.o(6170);
            }
        }
    }

    static class b extends a {
        static {
            Covode.recordClassIndex(21250);
        }

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.bytedance.ies.web.a.i.a
        public final void a(WebView webView, String str) {
            MethodCollector.i(5373);
            if (webView == null) {
                MethodCollector.o(5373);
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    MethodCollector.o(5373);
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
                MethodCollector.o(5373);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(21248);
        int i2 = Build.VERSION.SDK_INT;
    }

    public static void a(WebView webView, String str) {
        f35539a.a(webView, str);
    }
}
