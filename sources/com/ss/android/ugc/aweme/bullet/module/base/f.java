package com.ss.android.ugc.aweme.bullet.module.base;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.kit.web.a.e;
import com.bytedance.ies.bullet.kit.web.c;
import com.bytedance.ies.bullet.service.base.web.g;
import com.bytedance.ies.bullet.service.base.web.h;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.monitor.n;
import h.f.b.l;
import h.m.p;
import org.json.JSONObject;

public class f extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f69447c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f69448a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.bullet.business.b f69449b;

    static {
        Covode.recordClassIndex(42810);
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject, boolean z) {
        l.d(jSONObject, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42811);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    protected static SSWebView b(c cVar) {
        if (cVar != null) {
            try {
                WebView n = cVar.n();
                if (n != null) {
                    return (SSWebView) n;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.web.SSWebView");
    }

    public f(b bVar, com.ss.android.ugc.aweme.bullet.business.b bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f69448a = bVar;
        this.f69449b = bVar2;
    }

    public void onPageFinished(WebView webView, String str) {
        a(0, "", str, true);
    }

    @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.o
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (a(this.f32407e, str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    protected static boolean a(c cVar, String str) {
        com.bytedance.ies.bullet.kit.web.b.a m2;
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a2 != null) {
            a2.b(str);
        }
        if (cVar == null || (m2 = cVar.m()) == null || !m2.a(str)) {
            return false;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.o
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        com.ss.android.ugc.aweme.net.model.e<String, WebResourceResponse> n = n.f112474e.n(new com.ss.android.ugc.aweme.net.model.e<>(str, webView, null, d.CONTINUE));
        if (n.f112463f == d.INTERCEPT && n.f112459b != null) {
            return n.f112459b;
        }
        if (n.f112463f != d.EXCEPTION || n.f112462e == null) {
            return super.shouldInterceptRequest(n.f112460c, (String) n.f112458a);
        }
        throw n.f112462e;
    }

    protected static void a(JSONObject jSONObject, String str, Object obj) {
        l.d(str, "");
        if (jSONObject != null && !TextUtils.isEmpty(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a2 != null) {
            a2.a(this, str);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.o
    public void a(WebView webView, h hVar, g gVar) {
        String str;
        String str2;
        String path;
        String str3;
        Integer num;
        String str4;
        Uri a2;
        String path2;
        if (hVar != null) {
            if (hVar.b() || !((a2 = hVar.a()) == null || (path2 = a2.getPath()) == null || p.c(path2, "favicon.ico", false))) {
                Uri a3 = hVar.a();
                if (a3 == null || (str3 = a3.toString()) == null) {
                    str3 = "null";
                }
                l.b(str3, "");
                if (gVar != null) {
                    num = Integer.valueOf(gVar.a());
                    CharSequence b2 = gVar.b();
                    if (b2 != null) {
                        str4 = b2.toString();
                    }
                    str4 = null;
                } else {
                    num = null;
                    str4 = null;
                }
                a(num, str4, String.valueOf(hVar.a()), false);
            }
            if (!hVar.b()) {
                Uri a4 = hVar.a();
                if ((a4 == null || (path = a4.getPath()) == null || !p.c(path, "favicon.ico", false)) && gVar != null) {
                    int a5 = gVar.a();
                    Uri a6 = hVar.a();
                    if (a6 != null) {
                        str = a6.getHost();
                    } else {
                        str = null;
                    }
                    Uri a7 = hVar.a();
                    if (a7 != null) {
                        str2 = a7.getPath();
                    } else {
                        str2 = null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    a(jSONObject, "host", str);
                    a(jSONObject, "path", str2);
                    a(jSONObject, "statusCode", (Object) null);
                    a(jSONObject, "errorCode", Integer.valueOf(a5));
                    com.bytedance.apm.b.a("aweme_webview_assets_error", 0, jSONObject);
                }
            }
        }
    }

    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        if (Build.VERSION.SDK_INT < 23) {
            a(Integer.valueOf(i2), str, str2, false);
        }
    }

    private final void a(Integer num, String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "errorCode", num);
        if (!TextUtils.isEmpty(str)) {
            a(jSONObject, "errorDesc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(str2);
            a(jSONObject, "url", str2);
            l.b(parse, "");
            a(jSONObject, "host", parse.getHost());
            a(jSONObject, "path", parse.getPath());
        }
        a(jSONObject, "container_type", "bullet");
        a(jSONObject, z);
        com.bytedance.apm.b.a("aweme_webview_open_error_rate", !z ? 1 : 0, jSONObject);
    }
}
