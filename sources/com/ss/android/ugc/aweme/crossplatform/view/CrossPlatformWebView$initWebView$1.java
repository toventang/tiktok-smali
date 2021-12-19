package com.ss.android.ugc.aweme.crossplatform.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.sdk.activity.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.activity.m;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.XpathBusiness;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;
import com.ss.android.ugc.aweme.crossplatform.d.f;
import com.ss.android.ugc.aweme.crossplatform.d.g;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.e;
import com.ss.android.ugc.aweme.crossplatform.view.g;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBarView;
import com.ss.android.ugc.tiktok.security.b.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import org.json.JSONException;
import org.json.JSONObject;

public final class CrossPlatformWebView$initWebView$1 implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CrossPlatformWebView f78958a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f78959b;

    static {
        Covode.recordClassIndex(48998);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    CrossPlatformWebView$initWebView$1(CrossPlatformWebView crossPlatformWebView) {
        this.f78958a = crossPlatformWebView;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void c(WebView webView, String str) {
        e customWebViewStatus = this.f78958a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.c(webView, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final boolean b(WebView webView, String str) {
        AdWebStatBusiness webStatBusiness = this.f78958a.getWebStatBusiness();
        if (webStatBusiness != null) {
            webStatBusiness.c(webView, str);
        }
        e customWebViewStatus = this.f78958a.getCustomWebViewStatus();
        if (customWebViewStatus == null || !customWebViewStatus.b(webView, str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str) {
        a crossPlatformParams;
        g gVar;
        com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness;
        XpathBusiness xpathBusiness;
        e e2;
        MethodCollector.i(11871);
        m mVar = this.f78958a.f78940e;
        if (!(mVar == null || (e2 = mVar.e()) == null)) {
            e2.a(webView, str);
        }
        e customWebViewStatus = this.f78958a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.a(webView, str);
        }
        ((DmtStatusView) this.f78958a.a(R.id.ci9)).a(false);
        if (!this.f78959b) {
            DmtStatusView dmtStatusView = (DmtStatusView) this.f78958a.a(R.id.axu);
            l.b(dmtStatusView, "");
            dmtStatusView.setVisibility(8);
            this.f78958a.a((Integer) 0, "", str, true);
        }
        this.f78958a.f78939d = true;
        this.f78958a.getRegistry().a(g.a.LOAD_FINISH);
        m mVar2 = this.f78958a.f78940e;
        if (!(mVar2 == null || (crossPlatformBusiness = mVar2.getCrossPlatformBusiness()) == null || (xpathBusiness = (XpathBusiness) crossPlatformBusiness.a(XpathBusiness.class)) == null)) {
            xpathBusiness.xpathDirect(this.f78958a.getCrossPlatformParams(), webView);
        }
        AdWebStatBusiness webStatBusiness = this.f78958a.getWebStatBusiness();
        if (webStatBusiness != null) {
            webStatBusiness.b(webView, str);
        }
        if (webView != null) {
            String reactId = this.f78958a.getReactId();
            l.d(webView, "");
            if (reactId != null) {
                String str2 = "javascript:(function () {    window.reactId = '" + reactId + "';})();";
                String a2 = h.f149026a.a(webView, str2);
                if (!TextUtils.isEmpty(a2)) {
                    str2 = a2;
                }
                webView.loadUrl(str2);
            }
        }
        CrossPlatformWebView crossPlatformWebView = this.f78958a;
        int i2 = !this.f78959b ? 1 : 0;
        if (!(crossPlatformWebView.f78944i || (crossPlatformParams = crossPlatformWebView.getCrossPlatformParams()) == null || (gVar = crossPlatformParams.f78745e) == null || gVar.f78808c == null)) {
            a crossPlatformParams2 = crossPlatformWebView.getCrossPlatformParams();
            if (crossPlatformParams2 == null) {
                l.b();
            }
            JSONObject jSONObject = new JSONObject(crossPlatformParams2.f78745e.f78808c);
            try {
                jSONObject.put("status", String.valueOf(i2)).put("duration", System.currentTimeMillis() - CrossPlatformActivity.f78496c);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            r.a("request_anchor_detail", jSONObject);
            crossPlatformWebView.f78944i = true;
        }
        MethodCollector.o(11871);
    }

    public final void webStatBusinessOnReceivedError(WebView webView, WebResourceRequest webResourceRequest, String str) {
        AdWebStatBusiness webStatBusiness = this.f78958a.getWebStatBusiness();
        if (webStatBusiness != null) {
            webStatBusiness.a(webView, webResourceRequest, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        e e2;
        m mVar = this.f78958a.f78940e;
        if (!(mVar == null || (e2 = mVar.e()) == null)) {
            e2.a(webView, sslErrorHandler, sslError);
        }
        e customWebViewStatus = this.f78958a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.a(webView, sslErrorHandler, sslError);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        e e2;
        m mVar = this.f78958a.f78940e;
        if (!(mVar == null || (e2 = mVar.e()) == null)) {
            e2.a(webView, webResourceRequest, webResourceResponse);
        }
        e customWebViewStatus = this.f78958a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.a(webView, webResourceRequest, webResourceResponse);
        }
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "host", webResourceRequest.getUrl().getHost());
        b.a(jSONObject, "path", webResourceRequest.getUrl().getPath());
        b.a(jSONObject, "statusCode", Integer.valueOf(webResourceResponse.getStatusCode()));
        b.a(jSONObject, "errorCode", 1001);
        com.bytedance.apm.b.a("aweme_webview_assets_error", 0, jSONObject);
        AdWebStatBusiness webStatBusiness = this.f78958a.getWebStatBusiness();
        if (webStatBusiness != null) {
            webStatBusiness.a(webView, webResourceRequest, webResourceResponse.getReasonPhrase());
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        Uri uri;
        Boolean bool;
        Uri url;
        String path;
        CharSequence description;
        e e2;
        m mVar = this.f78958a.f78940e;
        if (!(mVar == null || (e2 = mVar.e()) == null)) {
            e2.a(webView, webResourceRequest, webResourceError);
        }
        e customWebViewStatus = this.f78958a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.a(webView, webResourceRequest, webResourceError);
        }
        Integer num = null;
        if (webResourceError == null || (description = webResourceError.getDescription()) == null) {
            str = null;
        } else {
            str = description.toString();
        }
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        String valueOf = String.valueOf(uri);
        if (webResourceRequest != null) {
            bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
        } else {
            bool = null;
        }
        if (l.a((Object) bool, (Object) true)) {
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (path = url.getPath()) == null || !p.c(path, ".apk", false)) {
                this.f78959b = true;
                this.f78958a.d();
                CrossPlatformWebView crossPlatformWebView = this.f78958a;
                if (webResourceError != null) {
                    num = Integer.valueOf(webResourceError.getErrorCode());
                }
                crossPlatformWebView.a(num, str, valueOf, false);
            } else {
                return;
            }
        } else if (l.a((Object) bool, (Object) false)) {
            Uri url2 = webResourceRequest.getUrl();
            if (!(url2 == null || url2.getPath() == null)) {
                Uri url3 = webResourceRequest.getUrl();
                l.b(url3, "");
                String path2 = url3.getPath();
                if (path2 == null) {
                    l.b();
                }
                l.b(path2, "");
                if (p.c(path2, "favicon.ico", false)) {
                    return;
                }
            }
            JSONObject jSONObject = new JSONObject();
            b.a(jSONObject, "host", webResourceRequest.getUrl().getHost());
            b.a(jSONObject, "path", webResourceRequest.getUrl().getPath());
            b.a(jSONObject, "statusCode", null);
            b.a(jSONObject, "errorCode", Integer.valueOf(webResourceError.getErrorCode()));
            com.bytedance.apm.b.a("aweme_webview_assets_error", 0, jSONObject);
        }
        webStatBusinessOnReceivedError(webView, webResourceRequest, str);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str, Bitmap bitmap) {
        f fVar;
        e e2;
        m mVar = this.f78958a.f78940e;
        if (!(mVar == null || (e2 = mVar.e()) == null)) {
            e2.a(webView, str, bitmap);
        }
        e customWebViewStatus = this.f78958a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.a(webView, str, bitmap);
        }
        this.f78959b = false;
        this.f78958a.f78939d = false;
        this.f78958a.getRegistry().a(g.a.LOAD_START);
        CrossPlatformWebView crossPlatformWebView = this.f78958a;
        a crossPlatformParams = crossPlatformWebView.getCrossPlatformParams();
        if (!(crossPlatformParams == null || (fVar = crossPlatformParams.f78744d) == null || !fVar.E)) {
            LineProgressBarView lineProgressBarView = (LineProgressBarView) crossPlatformWebView.a(R.id.d2u);
            l.b(lineProgressBarView, "");
            lineProgressBarView.setVisibility(0);
            crossPlatformWebView.e();
        }
        AdWebStatBusiness webStatBusiness = this.f78958a.getWebStatBusiness();
        if (webStatBusiness != null) {
            webStatBusiness.a(webView, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, int i2, String str, String str2) {
        e e2;
        if (Build.VERSION.SDK_INT < 23) {
            AdWebStatBusiness webStatBusiness = this.f78958a.getWebStatBusiness();
            if (webStatBusiness != null) {
                webStatBusiness.a(webView, str2, str);
            }
            m mVar = this.f78958a.f78940e;
            if (!(mVar == null || (e2 = mVar.e()) == null)) {
                e2.a(webView, i2, str, str2);
            }
            e customWebViewStatus = this.f78958a.getCustomWebViewStatus();
            if (customWebViewStatus != null) {
                customWebViewStatus.a(webView, i2, str, str2);
            }
            this.f78959b = true;
            this.f78958a.d();
            this.f78958a.a(Integer.valueOf(i2), str, str2, false);
        }
    }
}
