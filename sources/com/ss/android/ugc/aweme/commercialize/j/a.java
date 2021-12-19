package com.ss.android.ugc.aweme.commercialize.j;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.h;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.e;
import h.m.p;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class a implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final List<JSONObject> f74484c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final C1682a f74485d = new C1682a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static final String f74486f = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public boolean f74487a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f74488b;

    /* renamed from: e  reason: collision with root package name */
    private boolean f74489e = false;

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final boolean b(WebView webView, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void c(WebView webView, String str) {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.j.a$a  reason: collision with other inner class name */
    public static final class C1682a {
        static {
            Covode.recordClassIndex(45939);
        }

        private C1682a() {
        }

        public /* synthetic */ C1682a(byte b2) {
            this();
        }

        public static void a(String str, int i2, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("error_code", i2);
                jSONObject.put("description", str2);
                a.f74484c.add(jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    static {
        Covode.recordClassIndex(45938);
    }

    private static boolean a(String str) {
        if (str == null || !str.equals("about:blank")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str) {
        if (!a(str) && !this.f74487a) {
            this.f74487a = true;
            h.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        int i2;
        if (sslError != null) {
            str = sslError.getUrl();
            i2 = sslError.getPrimaryError();
        } else {
            str = null;
            i2 = 0;
        }
        C1682a.a(str, i2, "ssl error");
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        String str2;
        int i2;
        Uri url;
        Uri url2;
        String str3 = null;
        if (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) {
            str = null;
        } else {
            str = url2.toString();
        }
        if (!a(str)) {
            this.f74488b = true;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                str2 = null;
            } else {
                str2 = url.toString();
            }
            if (webResourceError != null) {
                i2 = webResourceError.getErrorCode();
                CharSequence description = webResourceError.getDescription();
                if (description != null) {
                    str3 = description.toString();
                }
            } else {
                i2 = 0;
            }
            C1682a.a(str2, i2, str3);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        String str2;
        Uri url;
        Uri url2;
        String path;
        Uri url3;
        String str3 = null;
        if (webResourceRequest == null || (url3 = webResourceRequest.getUrl()) == null) {
            str = null;
        } else {
            str = url3.toString();
        }
        if (!a(str)) {
            int i2 = 0;
            if (this.f74489e && (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null || (path = url2.getPath()) == null || !p.c(path, "favicon.ico", false))) {
                this.f74488b = true;
            }
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                str2 = null;
            } else {
                str2 = url.toString();
            }
            if (webResourceResponse != null) {
                i2 = webResourceResponse.getStatusCode();
                str3 = webResourceResponse.getReasonPhrase();
            }
            C1682a.a(str2, i2, str3);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (!a(str)) {
            this.f74487a = false;
            this.f74488b = false;
            f74484c.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, int i2, String str, String str2) {
        if (!a(str2)) {
            this.f74488b = true;
            C1682a.a(str2, i2, str);
        }
    }
}
