package com.ss.android.ugc.aweme.compliance.business.report;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.a.b;
import com.ss.android.ugc.aweme.crossplatform.activity.m;
import com.ss.android.ugc.aweme.crossplatform.business.g;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.e;
import com.ss.android.ugc.aweme.crossplatform.view.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public abstract class a implements m, e {

    /* renamed from: a  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.crossplatform.view.a f77146a;

    /* renamed from: b  reason: collision with root package name */
    private final g f77147b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f77148c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.crossplatform.d.a.a f77149d;

    /* renamed from: e  reason: collision with root package name */
    private View f77150e;

    static {
        Covode.recordClassIndex(47691);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, int i2, String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void a(CharSequence charSequence, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.web.g
    public final void a(String str) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final boolean b(WebView webView, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void c(WebView webView, String str) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final e e() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public Context getContext() {
        return this.f77148c;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public g getCrossPlatformBusiness() {
        return this.f77147b;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public com.ss.android.ugc.aweme.crossplatform.d.a.a getCrossPlatformParams() {
        return this.f77149d;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final com.ss.android.ugc.aweme.crossplatform.view.a f() {
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = this.f77146a;
        if (aVar == null) {
            l.a("mCrossPlatformWebView");
        }
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final void g() {
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = this.f77146a;
        if (aVar == null) {
            l.a("mCrossPlatformWebView");
        }
        aVar.g();
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final boolean h() {
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = this.f77146a;
        if (aVar == null) {
            l.a("mCrossPlatformWebView");
        }
        return aVar.h();
    }

    public final void a() {
        View findViewById = this.f77148c.findViewById(R.id.ah_);
        if (findViewById == null) {
            View view = this.f77150e;
            if (view != null) {
                findViewById = view.findViewById(R.id.ah_);
            } else {
                findViewById = null;
            }
        }
        l.b(findViewById, "");
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = (com.ss.android.ugc.aweme.crossplatform.view.a) findViewById;
        this.f77146a = aVar;
        if (aVar == null) {
            l.a("mCrossPlatformWebView");
        }
        aVar.a(this.f77148c);
        com.ss.android.ugc.aweme.crossplatform.view.a aVar2 = this.f77146a;
        if (aVar2 == null) {
            l.a("mCrossPlatformWebView");
        }
        aVar2.setCrossPlatformActivityContainer(this);
        if (!this.f77149d.f78741a.f78738k) {
            Integer num = this.f77149d.f78741a.f78728a;
            if (num != null && num.intValue() == 2) {
                com.ss.android.ugc.aweme.crossplatform.view.a aVar3 = this.f77146a;
                if (aVar3 == null) {
                    l.a("mCrossPlatformWebView");
                }
                ((com.ss.android.ugc.aweme.crossplatform.view.e) aVar3.a(com.ss.android.ugc.aweme.crossplatform.view.e.class)).a(getCrossPlatformParams());
                return;
            }
            String a2 = b.a(this.f77149d.f78741a.f78730c, b.b(this.f77148c));
            com.ss.android.ugc.aweme.crossplatform.view.a aVar4 = this.f77146a;
            if (aVar4 == null) {
                l.a("mCrossPlatformWebView");
            }
            ((j) aVar4.a(j.class)).a(a2);
        }
    }

    private a(Activity activity, com.ss.android.ugc.aweme.crossplatform.d.a.a aVar) {
        l.d(activity, "");
        l.d(aVar, "");
        this.f77148c = activity;
        this.f77149d = aVar;
        this.f77150e = null;
        g a2 = g.a.a(this);
        l.b(a2, "");
        this.f77147b = a2;
    }

    public /* synthetic */ a(Activity activity, com.ss.android.ugc.aweme.crossplatform.d.a.a aVar, byte b2) {
        this(activity, aVar);
    }
}
