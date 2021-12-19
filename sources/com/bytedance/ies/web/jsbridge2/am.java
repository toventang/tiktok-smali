package com.bytedance.ies.web.jsbridge2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class am extends b {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ boolean f35619b = true;

    /* renamed from: a  reason: collision with root package name */
    public WebView f35620a;

    /* renamed from: c  reason: collision with root package name */
    private String f35621c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f35622d;
    private boolean n;

    am() {
    }

    static {
        Covode.recordClassIndex(21279);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.b
    public final void c() {
        super.c();
        this.f35620a.removeJavascriptInterface(this.f35621c);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.b
    public final String a() {
        WebView webView = this.f35620a;
        if (webView instanceof t) {
            String safeUrl = ((t) webView).getSafeUrl();
            if (TextUtils.isEmpty(safeUrl)) {
                return this.f35620a.getUrl();
            }
            return safeUrl;
        }
        l.a(this.f35622d, this.n, webView);
        return this.f35620a.getUrl();
    }

    @Override // com.bytedance.ies.web.jsbridge2.b
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.b
    public final Context b(l lVar) {
        if (lVar.f35677f != null) {
            return lVar.f35677f;
        }
        if (lVar.f35672a != null) {
            return lVar.f35672a.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    private void b(final String str) {
        if (!this.f35635j && !TextUtils.isEmpty(str)) {
            AnonymousClass1 r2 = new Runnable() {
                /* class com.bytedance.ies.web.jsbridge2.am.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(21280);
                }

                public final void run() {
                    MethodCollector.i(689);
                    if (am.this.f35635j) {
                        MethodCollector.o(689);
                        return;
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    am.this.f35620a.evaluateJavascript(str, null);
                    MethodCollector.o(689);
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f35633h.post(r2);
            } else {
                r2.run();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.b
    public final void a(l lVar) {
        this.f35622d = lVar.f35678g;
        this.n = lVar.t;
        this.f35620a = lVar.f35672a;
        this.f35621c = lVar.f35675d;
        int i2 = Build.VERSION.SDK_INT;
        if (lVar.o) {
            return;
        }
        if (f35619b || this.f35620a != null) {
            this.f35620a.addJavascriptInterface(this, this.f35621c);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.b
    public final void a(String str) {
        b("javascript:" + this.f35621c + "._handleMessageFromToutiao(" + str + ")");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.b
    public final void a(String str, w wVar) {
        if (wVar == null || TextUtils.isEmpty(wVar.f35696h)) {
            super.a(str, wVar);
            return;
        }
        String str2 = wVar.f35696h;
        b(a.a("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", new Object[]{Base64.encodeToString(a.a("iframe[src=\"%s\"", new Object[]{str2}).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)}));
    }
}
