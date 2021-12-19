package com.ss.android.ugc.aweme.bullet.module.ad;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.a.e;
import com.bytedance.ies.bullet.service.base.web.g;
import com.bytedance.ies.bullet.service.base.web.h;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.b.c;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class d extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final List<JSONObject> f69359c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final a f69360d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f69361a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69362b;

    /* renamed from: f  reason: collision with root package name */
    private boolean f69363f = false;

    public static final class a {
        static {
            Covode.recordClassIndex(42767);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str, int i2, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("error_code", i2);
                jSONObject.put("description", str2);
                d.f69359c.add(jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    static {
        Covode.recordClassIndex(42766);
    }

    private static boolean a(String str) {
        if (str == null || !str.equals("about:blank")) {
            return false;
        }
        return true;
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!a(str) && !this.f69361a) {
            this.f69361a = true;
            l.b(b.a.f65586a, "");
            c a2 = b.a();
            if (a2 != null) {
                a2.a(str);
            }
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!a(str)) {
            this.f69361a = false;
            this.f69362b = false;
            f69359c.clear();
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        int i2;
        if (sslError != null) {
            str = sslError.getUrl();
            i2 = sslError.getPrimaryError();
        } else {
            str = null;
            i2 = 0;
        }
        a.a(str, i2, "ssl error");
    }

    @Override // com.bytedance.ies.bullet.service.base.web.o
    public final void a(WebView webView, h hVar, g gVar) {
        String str;
        String str2;
        int i2;
        Uri a2;
        Uri a3;
        String str3 = null;
        if (hVar == null || (a3 = hVar.a()) == null) {
            str = null;
        } else {
            str = a3.toString();
        }
        if (!a(str)) {
            this.f69362b = true;
            if (hVar == null || (a2 = hVar.a()) == null) {
                str2 = null;
            } else {
                str2 = a2.toString();
            }
            if (gVar != null) {
                i2 = gVar.a();
                CharSequence b2 = gVar.b();
                if (b2 != null) {
                    str3 = b2.toString();
                }
            } else {
                i2 = 0;
            }
            a.a(str2, i2, str3);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.o
    public final void a(WebView webView, h hVar, WebResourceResponse webResourceResponse) {
        String str;
        String str2;
        Uri a2;
        Uri a3;
        String path;
        Uri a4;
        String str3 = null;
        if (hVar == null || (a4 = hVar.a()) == null) {
            str = null;
        } else {
            str = a4.toString();
        }
        if (!a(str)) {
            int i2 = 0;
            if (this.f69363f && (hVar == null || (a3 = hVar.a()) == null || (path = a3.getPath()) == null || !p.c(path, "favicon.ico", false))) {
                this.f69362b = true;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (hVar == null || (a2 = hVar.a()) == null) {
                    str2 = null;
                } else {
                    str2 = a2.toString();
                }
                if (webResourceResponse != null) {
                    i2 = webResourceResponse.getStatusCode();
                    str3 = webResourceResponse.getReasonPhrase();
                }
                a.a(str2, i2, str3);
            }
        }
    }

    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        if (!a(str2)) {
            this.f69362b = true;
            a.a(str2, i2, str);
        }
    }
}
