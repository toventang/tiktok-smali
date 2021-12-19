package com.bytedance.sdk.xbridge.protocol.impl.b;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.xbridge.protocol.c.f;
import com.bytedance.sdk.xbridge.protocol.c.g;
import com.bytedance.sdk.xbridge.protocol.c.h;
import com.bytedance.sdk.xbridge.protocol.d.d;
import com.bytedance.sdk.xbridge.protocol.d.e;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private WebView f44006a;

    /* renamed from: b  reason: collision with root package name */
    private String f44007b = "";

    /* renamed from: c  reason: collision with root package name */
    private final String f44008c = "WebViewImpl";

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<g> f44009d = new ArrayList<>();

    static {
        Covode.recordClassIndex(26875);
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.f
    public final WebView b() {
        return this.f44006a;
    }

    /* renamed from: com.bytedance.sdk.xbridge.protocol.impl.b.a$a  reason: collision with other inner class name */
    static final class RunnableC1072a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f44010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44011b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ValueCallback f44012c;

        static {
            Covode.recordClassIndex(26876);
        }

        RunnableC1072a(a aVar, String str, ValueCallback valueCallback) {
            this.f44010a = aVar;
            this.f44011b = str;
            this.f44012c = valueCallback;
        }

        public final void run() {
            this.f44010a.b(this.f44011b, this.f44012c);
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.g
    public final void c() {
        Iterator<g> it = this.f44009d.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f44009d.clear();
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.f
    public final String a() {
        WebView webView = this.f44006a;
        if (webView instanceof h) {
            if (webView != null) {
                String a2 = ((h) webView).a();
                if (!TextUtils.isEmpty(a2)) {
                    return a2;
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        if (!TextUtils.isEmpty(this.f44007b)) {
            return this.f44007b;
        }
        e.a(this.f44008c, "cannot get current url, can u register IIWebViewStatusListener?");
        WebView webView2 = this.f44006a;
        if (webView2 != null) {
            return webView2.getUrl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.f
    public final void a(g gVar) {
        l.c(gVar, "");
        this.f44009d.add(gVar);
    }

    public a(WebView webView) {
        l.c(webView, "");
        this.f44006a = webView;
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.g
    public final boolean b(String str) {
        Iterator<g> it = this.f44009d.iterator();
        while (it.hasNext()) {
            if (it.next().b(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.g
    public final void c(String str) {
        l.c(str, "");
        Iterator<g> it = this.f44009d.iterator();
        if (it.hasNext()) {
            it.next().c(str);
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.g
    public final void a(String str) {
        l.c(str, "");
        Iterator<g> it = this.f44009d.iterator();
        while (it.hasNext()) {
            it.next().a(str);
        }
        this.f44007b = str;
    }

    private static void a(WebView webView, String str) {
        MethodCollector.i(4947);
        String a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str);
        MethodCollector.o(4947);
    }

    public final void b(String str, ValueCallback<String> valueCallback) {
        l.c(str, "");
        int i2 = Build.VERSION.SDK_INT;
        WebView webView = this.f44006a;
        if (webView != null) {
            webView.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.f
    public final void a(Object obj, String str) {
        l.c(obj, "");
        l.c(str, "");
        WebView webView = this.f44006a;
        if (webView != null) {
            webView.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.f
    public final void a(String str, ValueCallback<String> valueCallback) {
        l.c(str, "");
        if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
            b(str, valueCallback);
        } else if (!com.bytedance.sdk.xbridge.protocol.d.a.f43956a) {
            WebView webView = this.f44006a;
            if (webView != null) {
                webView.post(new RunnableC1072a(this, str, valueCallback));
            }
        } else {
            throw new d("call evaluateJavaScript in wrong thread!!!");
        }
    }
}
