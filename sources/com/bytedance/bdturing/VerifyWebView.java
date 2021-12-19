package com.bytedance.bdturing;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.bytedance.bdturing.a;
import com.bytedance.bdturing.c;
import com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.example.a.c;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.tiktok.security.c.b;

public class VerifyWebView extends WebView {

    /* renamed from: a  reason: collision with root package name */
    public n f26382a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26383b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f26384c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f26385d;

    /* renamed from: e  reason: collision with root package name */
    private i f26386e;

    /* renamed from: f  reason: collision with root package name */
    private WebChromeClient f26387f = new WebChromeClient() {
        /* class com.bytedance.bdturing.VerifyWebView.AnonymousClass3 */

        static {
            Covode.recordClassIndex(15525);
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return super.onConsoleMessage(consoleMessage);
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private WebViewClient f26388g = new WebViewClient() {
        /* class com.bytedance.bdturing.VerifyWebView.AnonymousClass4 */

        static {
            Covode.recordClassIndex(15526);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return c.a(webView, renderProcessGoneDetail);
        }

        public final void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        private WebResourceResponse a(WebView webView, String str) {
            if (str.toLowerCase().contains("/favicon.ico")) {
                try {
                    return new WebResourceResponse("image/png", null, null);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            g.a("onPageFinished ");
            if (!VerifyWebView.this.f26383b && !VerifyWebView.this.f26384c) {
                VerifyWebView.this.f26384c = true;
                VerifyWebView.this.f26382a.a();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            e<String, WebResourceResponse> n = n.f112474e.n(new e<>(str, webView, null, d.CONTINUE));
            if (n.f112463f == d.INTERCEPT && n.f112459b != null) {
                return n.f112459b;
            }
            if (n.f112463f != d.EXCEPTION || n.f112462e == null) {
                return a(n.f112460c, n.f112458a);
            }
            throw n.f112462e;
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            g.a("onPageStarted ");
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (g.a()) {
                VerifyWebView.this.getContext();
            }
            if (VerifyWebView.this.f26385d != null && (VerifyWebView.this.f26385d instanceof TwiceVerifyWebActivity)) {
                int i2 = 0;
                try {
                    i2 = webResourceResponse.getStatusCode();
                } catch (Throwable unused) {
                }
                ((TwiceVerifyWebActivity) VerifyWebView.this.f26385d).a(i2);
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            try {
                webResourceRequest.getUrl().toString().toLowerCase().contains("/favicon.ico");
            } catch (Exception e2) {
                g.a(e2);
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (g.a()) {
                Toast makeText = Toast.makeText(VerifyWebView.this.getContext(), "onReceivedSslError : ".concat(String.valueOf(sslError)), 1);
                if (Build.VERSION.SDK_INT == 25) {
                    ic.a(makeText);
                }
                makeText.show();
            }
            if (VerifyWebView.this.f26385d != null && (VerifyWebView.this.f26385d instanceof TwiceVerifyWebActivity)) {
                int i2 = 0;
                try {
                    i2 = sslError.getPrimaryError();
                } catch (Throwable unused) {
                }
                ((TwiceVerifyWebActivity) VerifyWebView.this.f26385d).a(i2);
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        public final void onReceivedError(WebView webView, int i2, String str, String str2) {
            VerifyWebView.this.f26383b = true;
            g.a(i2 + " onReceivedError " + str);
            VerifyWebView.this.f26382a.a(i2, str + "|" + str2);
            if (VerifyWebView.this.f26385d != null && (VerifyWebView.this.f26385d instanceof TwiceVerifyWebActivity)) {
                ((TwiceVerifyWebActivity) VerifyWebView.this.f26385d).a(i2);
            }
            super.onReceivedError(webView, i2, str, str2);
        }
    };

    static {
        Covode.recordClassIndex(15522);
    }

    public void setOnTouchListener(i iVar) {
        this.f26386e = iVar;
    }

    public void setParentActivity(Activity activity) {
        this.f26385d = activity;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        i iVar = this.f26386e;
        if (iVar != null) {
            iVar.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void a(n nVar) {
        this.f26382a = nVar;
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheEnabled(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setCacheMode(2);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setTextZoom(100);
        if (a.C0562a.f26400a.f26393a.f26406a == c.b.REGION_BOE && Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        try {
            setOverScrollMode(2);
        } catch (Throwable unused) {
        }
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        if (g.a()) {
            setWebChromeClient(this.f26387f);
        }
        a(this, this.f26388g);
    }

    public VerifyWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(688);
        MethodCollector.o(688);
    }

    private static void a(VerifyWebView verifyWebView, WebViewClient webViewClient) {
        if (b.a() && webViewClient != null) {
            WebSettings settings = verifyWebView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings.setUserAgentString(sb.toString());
            }
        }
        verifyWebView.setWebViewClient(com.example.a.c.a(webViewClient));
    }
}
