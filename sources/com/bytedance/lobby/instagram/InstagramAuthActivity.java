package com.bytedance.lobby.instagram;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.lobby.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.example.a.c;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.feed.experiment.ag;
import com.ss.android.ugc.tiktok.security.b.h;
import com.ss.android.ugc.tiktok.security.b.i;
import com.ss.android.ugc.tiktok.security.c.b;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import okhttp3.HttpUrl;

public class InstagramAuthActivity extends d {

    /* renamed from: b  reason: collision with root package name */
    public static String f40217b;

    /* renamed from: c  reason: collision with root package name */
    public static String f40218c;

    /* renamed from: d  reason: collision with root package name */
    public static String f40219d;

    /* renamed from: e  reason: collision with root package name */
    public static String f40220e;

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f40221f = a.f40144a;

    /* renamed from: h  reason: collision with root package name */
    private static String f40222h;

    /* renamed from: a  reason: collision with root package name */
    public String f40223a = "";

    /* renamed from: g  reason: collision with root package name */
    private WebView f40224g;

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    static {
        Covode.recordClassIndex(24792);
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("ig_result_error_info", "Login flow cancelled by pressing back");
        intent.putExtra("error_stage", "goto_URL_and_auth");
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public final boolean a(String str) {
        HttpUrl parse = HttpUrl.parse(str);
        Intent intent = new Intent();
        if (parse != null) {
            try {
                if (TextUtils.equals(parse.scheme() + "://" + parse.url().getHost() + parse.url().getPath(), f40217b)) {
                    int i2 = -1;
                    if (!this.f40223a.equals(parse.queryParameter("state"))) {
                        intent.putExtra("ig_result_error_info", "State does not match");
                        intent.putExtra("error_stage", "redirect_and_get_token");
                        setResult(-1, intent);
                        finish();
                        return true;
                    }
                    String queryParameter = parse.queryParameter("error");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        String queryParameter2 = parse.queryParameter("error_description");
                        String str2 = "error = [ " + queryParameter + " ], desc = [ " + queryParameter2 + " ]";
                        if (!TextUtils.equals(queryParameter2, "The user denied your request.")) {
                            i2 = 0;
                        }
                        intent.putExtra("ig_result_error_info", str2);
                        intent.putExtra("error_stage", "redirect_and_get_token");
                        setResult(i2, intent);
                        finish();
                        return true;
                    }
                    intent.putExtra("ig_result_code", parse.queryParameter("code"));
                    setResult(1, intent);
                    finish();
                    return true;
                }
            } catch (Exception e2) {
                intent.putExtra("ig_result_error_info", "exception: url = [" + str + "], message = [" + e2.getMessage() + "], stacktrace = [" + Log.getStackTraceString(e2) + "]");
                setResult(0, intent);
                intent.putExtra("error_stage", "redirect_and_get_token");
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        String cookie;
        MethodCollector.i(6676);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.bf);
        this.f40224g = (WebView) findViewById(R.id.bq_);
        Intent intent = getIntent();
        if (intent != null) {
            f40218c = a(intent, "client_id");
            f40222h = a(intent, "login_auth_url");
            f40217b = a(intent, "redirect_url");
            f40219d = a(intent, "response_type");
            f40220e = a(intent, "scope");
        }
        try {
            WebSettings settings = this.f40224g.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setLoadsImagesAutomatically(true);
            settings.setDefaultTextEncodingName("utf-8");
            settings.setDomStorageEnabled(true);
        } catch (Exception unused) {
        }
        WebView webView = this.f40224g;
        AnonymousClass1 r8 = new WebViewClient() {
            /* class com.bytedance.lobby.instagram.InstagramAuthActivity.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            private String f40226b;

            static {
                Covode.recordClassIndex(24793);
            }

            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return c.a(webView, renderProcessGoneDetail);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                HttpUrl parse;
                MethodCollector.i(7689);
                if (i.b(webView, str)) {
                    MethodCollector.o(7689);
                    return true;
                }
                String str2 = this.f40226b;
                if (str2 == null || !str2.contains("www.instagram.com/challenge") || !TextUtils.equals("https://www.instagram.com/", str) || (parse = HttpUrl.parse("https://www.instagram.com/oauth/authorize")) == null) {
                    this.f40226b = str;
                    if (InstagramAuthActivity.this.a(str) || super.shouldOverrideUrlLoading(webView, str)) {
                        MethodCollector.o(7689);
                        return true;
                    }
                } else {
                    String httpUrl = parse.newBuilder().addQueryParameter("client_id", InstagramAuthActivity.f40218c).addQueryParameter("redirect_uri", InstagramAuthActivity.f40217b).addQueryParameter("response_type", InstagramAuthActivity.f40219d).addQueryParameter("state", InstagramAuthActivity.this.f40223a).addQueryParameter("scope", InstagramAuthActivity.f40220e).build().toString();
                    this.f40226b = httpUrl;
                    String a2 = h.f149026a.a(webView, httpUrl);
                    if (!TextUtils.isEmpty(a2)) {
                        httpUrl = a2;
                    }
                    webView.loadUrl(httpUrl);
                }
                MethodCollector.o(7689);
                return false;
            }
        };
        if (b.a()) {
            WebSettings settings2 = webView.getSettings();
            String userAgentString = settings2.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings2.setUserAgentString(sb.toString());
            }
        }
        webView.setWebViewClient(c.a(r8));
        CookieManager instance = CookieManager.getInstance();
        if (!TextUtils.isEmpty(instance.getCookie("https://.instagram.com"))) {
            instance.setCookie("https://.instagram.com", "sessionid=");
            if (f.a(g.a()) && ag.a() && (cookie = CookieManager.getInstance().getCookie(com.ss.android.ugc.aweme.feed.f.a.a())) != null && !TextUtils.equals(cookie, com.ss.android.ugc.aweme.feed.f.a.b())) {
                com.ss.android.ugc.aweme.feed.f.a.a(com.ss.android.ugc.aweme.feed.f.a.a(), cookie);
            }
        }
        this.f40223a = UUID.randomUUID().toString();
        HttpUrl parse = HttpUrl.parse(f40222h);
        if (parse != null) {
            HttpUrl build = parse.newBuilder().addQueryParameter("client_id", f40218c).addQueryParameter("redirect_uri", f40217b).addQueryParameter("response_type", f40219d).addQueryParameter("state", this.f40223a).addQueryParameter("scope", f40220e).build();
            WebView webView2 = this.f40224g;
            String httpUrl = build.toString();
            String a2 = h.f149026a.a(webView2, httpUrl);
            if (!TextUtils.isEmpty(a2)) {
                httpUrl = a2;
            }
            webView2.loadUrl(httpUrl);
        }
        MethodCollector.o(6676);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
