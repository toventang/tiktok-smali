package com.ss.android.ugc.aweme.bullet.module.ad;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.a.e;
import com.bytedance.ies.bullet.kit.web.c;
import com.bytedance.ies.bullet.service.base.web.g;
import com.bytedance.ies.bullet.service.base.web.h;
import h.f.b.l;

public class i extends e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f69371a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69372b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f69373c;

    /* renamed from: d  reason: collision with root package name */
    public long f69374d;

    /* renamed from: f  reason: collision with root package name */
    public a f69375f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f69376g = true;

    public interface a {
        static {
            Covode.recordClassIndex(42774);
        }

        void a();

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(42773);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    public final void a(boolean z) {
        this.f69373c = z;
        if (z && !this.f69371a && this.f69375f != null) {
            System.currentTimeMillis();
        }
    }

    public void onPageFinished(WebView webView, String str) {
        WebView n;
        if (!l.a((Object) str, (Object) "about:blank")) {
            if (this.f69376g) {
                this.f69376g = false;
                c cVar = this.f32407e;
                if (!(cVar == null || (n = cVar.n()) == null)) {
                    n.clearHistory();
                }
            }
            if (!this.f69371a && !this.f69372b && !this.f69373c) {
                this.f69371a = true;
            }
            a aVar = this.f69375f;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!l.a((Object) str, (Object) "about:blank")) {
            this.f69371a = false;
            this.f69372b = false;
            a(false);
            this.f69374d = System.currentTimeMillis();
            a aVar = this.f69375f;
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
            this.f69372b = true;
            a aVar = this.f69375f;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        if (!l.a((Object) str2, (Object) "about:blank")) {
            this.f69372b = true;
            a aVar = this.f69375f;
            if (aVar != null) {
                aVar.b();
            }
        }
    }
}
