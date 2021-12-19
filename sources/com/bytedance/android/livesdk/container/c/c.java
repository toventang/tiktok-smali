package com.bytedance.android.livesdk.container.c;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.bytedance.android.livesdk.browser.b.a;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.f;
import com.bytedance.android.livesdk.browser.c.g;
import com.bytedance.android.livesdk.browser.jsbridge.b;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends a implements b {

    /* renamed from: f  reason: collision with root package name */
    public WebView f16767f;

    /* renamed from: g  reason: collision with root package name */
    public final d f16768g = g.b();

    /* renamed from: h  reason: collision with root package name */
    public final boolean f16769h = false;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.android.livesdk.container.b.c f16770i;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.android.livesdk.container.b.b f16771j;

    /* renamed from: k  reason: collision with root package name */
    private a f16772k;

    static {
        Covode.recordClassIndex(9291);
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void a(com.bytedance.android.livesdk.browser.jsbridge.c cVar) {
        l.d(cVar, "");
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final /* bridge */ /* synthetic */ View f() {
        return this.f16767f;
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final boolean g() {
        WebView webView = this.f16767f;
        if (webView == null || !webView.canGoBack()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void h() {
        WebView webView = this.f16767f;
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        }
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final com.bytedance.android.livesdk.browser.jsbridge.c b() {
        this.f16770i = new com.bytedance.android.livesdk.container.b.c(this);
        this.f16771j = new com.bytedance.android.livesdk.container.b.b(this);
        com.bytedance.android.livesdk.browser.jsbridge.c a2 = com.bytedance.android.livesdk.browser.jsbridge.c.a(this.f16751b, this.f16767f, this.f16770i, this.f16771j);
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void c() {
        this.f16772k = com.bytedance.android.livesdk.browser.b.b.b();
        g.b().a(this);
        f.a();
        CookieManager.getInstance().setAcceptCookie(true);
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void d() {
        WebView a2 = this.f16768g.a(this.f16751b);
        this.f16767f = a2;
        if (a2 != null) {
            a2.setVerticalScrollBarEnabled(false);
        }
        com.bytedance.android.livesdk.browser.view.b a3 = com.bytedance.android.livesdk.browser.view.b.a(this.f16751b);
        a3.f14836a = !this.f16769h;
        a3.a(this.f16767f);
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void a(String str) {
        l.d(str, "");
        com.bytedance.android.livesdk.browser.a.a(str, this.f16767f, (String) null);
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.b
    public final <T> void a(String str, T t) {
        com.bytedance.android.livesdk.browser.jsbridge.c cVar = this.f16750a;
        if (cVar != null) {
            cVar.a(str, t);
        }
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void a(int i2, int i3, Intent intent) {
        l.d(intent, "");
        com.bytedance.android.livesdk.container.b.b bVar = this.f16771j;
        if (bVar != null) {
            bVar.a(i2, i3, intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Activity activity, HybridConfig hybridConfig, String str, com.bytedance.android.livesdk.container.h.a aVar) {
        super(activity, hybridConfig, str, aVar);
        l.d(activity, "");
        l.d(hybridConfig, "");
        l.d(str, "");
    }
}
