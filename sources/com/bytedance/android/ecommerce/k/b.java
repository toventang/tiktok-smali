package com.bytedance.android.ecommerce.k;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.android.ecommerce.j.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7130a;

    /* renamed from: b  reason: collision with root package name */
    private final WebChromeClient f7131b = new WebChromeClient() {
        /* class com.bytedance.android.ecommerce.k.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(3429);
        }

        public final void onProgressChanged(WebView webView, int i2) {
        }
    };

    static {
        Covode.recordClassIndex(3428);
    }

    public b(Context context) {
        this.f7130a = context;
    }

    @Override // com.bytedance.android.ecommerce.j.d
    public final String a(String str) {
        MethodCollector.i(6103);
        try {
            WebView webView = new WebView(this.f7130a);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(this.f7131b);
            webView.loadData("<head>\n    <script type=\"text/javascript\"\n            src=\"https://h.online-metrix.net/fp/tags.js?org_id=" + "k8vif92e" + "&session_id=" + "bytedance" + str + "\"></script>\n</head>", "text/html", "UTF-8");
            MethodCollector.o(6103);
            return "success";
        } catch (Throwable th) {
            th.getLocalizedMessage();
            String message = th.getMessage();
            MethodCollector.o(6103);
            return message;
        }
    }
}
