package com.ss.android.ugc.aweme.bullet.module.ad;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.web.g;
import com.bytedance.ies.bullet.service.base.web.h;
import h.f.b.l;

public final class e extends com.bytedance.ies.bullet.kit.web.a.e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f69364a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69365b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f69366c;

    /* renamed from: d  reason: collision with root package name */
    public long f69367d;

    /* renamed from: f  reason: collision with root package name */
    public a f69368f;

    public interface a {
        static {
            Covode.recordClassIndex(42769);
        }

        void a();

        void a(long j2);

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(42768);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    public final void a(boolean z) {
        a aVar;
        this.f69366c = z;
        if (z && !this.f69364a && (aVar = this.f69368f) != null) {
            aVar.c();
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!l.a((Object) str, (Object) "about:blank") && !this.f69364a && !this.f69365b && !this.f69366c) {
            this.f69364a = true;
            a aVar = this.f69368f;
            if (aVar != null) {
                aVar.a(System.currentTimeMillis() - this.f69367d);
            }
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!l.a((Object) str, (Object) "about:blank")) {
            this.f69364a = false;
            this.f69365b = false;
            a(false);
            this.f69367d = System.currentTimeMillis();
            a aVar = this.f69368f;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.o
    public final void a(WebView webView, h hVar, g gVar) {
        String str;
        Uri a2;
        if (hVar == null || (a2 = hVar.a()) == null) {
            str = null;
        } else {
            str = a2.toString();
        }
        if (!l.a((Object) str, (Object) "about:blank") && hVar != null && hVar.b()) {
            this.f69365b = true;
            a aVar = this.f69368f;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        if (!l.a((Object) str2, (Object) "about:blank")) {
            this.f69365b = true;
            a aVar = this.f69368f;
            if (aVar != null) {
                aVar.b();
            }
        }
    }
}
