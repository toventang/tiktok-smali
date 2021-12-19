package com.bytedance.android.livesdk.browser.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.f.ac;
import com.bytedance.android.live.uikit.layout.FullscreenVideoFrame;
import com.bytedance.android.livesdk.browser.c.g;
import com.bytedance.android.livesdk.browser.f;
import com.bytedance.android.livesdk.browser.jsbridge.d.c;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bn;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bo;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.br;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.j;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.l;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.t;
import com.bytedance.android.livesdk.livesetting.hybrid.AllowHtmlVideoSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEnableWebviewGlobalpropsSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.y;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.b.d;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.e;
import com.facebook.imagepipeline.e.k;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class h extends com.bytedance.android.livesdk.lynx.ui.a implements View.OnClickListener, c.a, bg.a, j.a, d, WeakHandler.IHandler {
    public long A;
    public long B;
    public long C;
    public long D;
    String E;
    public Map<String, Object> F = new HashMap();
    private FrameLayout P;
    private View Q;
    private ViewGroup R;
    private View S;
    private View T;
    private boolean U;
    private boolean V;
    private boolean W = true;
    private String X;
    private String Y;
    private int Z;

    /* renamed from: a  reason: collision with root package name */
    public String f14355a;
    private int aa = -1;
    private com.bytedance.android.livesdk.browser.i.b ab;
    private com.bytedance.android.livesdk.browser.b.a ac;
    private boolean ad;
    private boolean ae;
    private Handler af;
    private JSONObject ag;
    private boolean ah;
    private String ai;
    private String aj;
    private View.OnClickListener ak = new i(this);

    /* renamed from: b  reason: collision with root package name */
    public String f14356b = "";

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.b.h f14357c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14358d = true;

    /* renamed from: e  reason: collision with root package name */
    protected View f14359e;

    /* renamed from: f  reason: collision with root package name */
    View f14360f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f14361g;

    /* renamed from: h  reason: collision with root package name */
    public FullscreenVideoFrame f14362h;

    /* renamed from: i  reason: collision with root package name */
    public View f14363i;

    /* renamed from: j  reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f14364j;

    /* renamed from: k  reason: collision with root package name */
    public WebView f14365k;

    /* renamed from: l  reason: collision with root package name */
    boolean f14366l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14367m = true;
    b n;
    bn o;
    br p;
    l q;
    bo r;
    t s;
    public boolean t = true;
    public long u;
    public boolean v = true;
    public com.bytedance.android.livesdk.browser.jsbridge.c w;
    public String x;
    public boolean y;
    public com.bytedance.android.livesdk.browser.k.a z;

    public interface a {
        static {
            Covode.recordClassIndex(7955);
        }

        void a(com.bytedance.android.livesdk.browser.c.a aVar);
    }

    static {
        Covode.recordClassIndex(7952);
    }

    @Override // com.bytedance.android.livesdkapi.b.d
    public final Fragment a() {
        return this;
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg.a
    public final com.bytedance.android.livesdk.browser.i.b c() {
        return this.ab;
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.newmethods.j.a
    public final void d() {
        e();
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a
    public final View f() {
        return this.f14365k;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    public final void e() {
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.d.c.a
    public final void h() {
        this.z.a(1, 0, "");
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.d.c.a
    public final void g() {
        this.F.put("first_loaded", Long.valueOf((System.currentTimeMillis() - this.A) / 1000));
    }

    public h() {
        this.K = com.bytedance.android.livesdk.browser.c.a();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        WebView webView = this.f14365k;
        if (webView != null) {
            webView.clearCache(false);
            JSONObject jSONObject = this.ag;
            if (jSONObject == null || jSONObject.length() <= 0) {
                com.bytedance.android.livesdk.browser.a.a(this.aj, this.f14365k, this.ai);
                return;
            }
            HashMap hashMap = new HashMap();
            com.bytedance.android.livesdk.browser.a.a(hashMap, this.ag);
            com.bytedance.android.livesdk.browser.a.a(this.aj, this.f14365k, hashMap);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WebView webView = this.f14365k;
        if (webView != null) {
            webView.getSettings().setBlockNetworkLoads(false);
            Handler handler = this.af;
            if (handler != null) {
                handler.removeMessages(10011);
            }
        }
        super.onResume();
        WebView webView2 = this.f14365k;
        if (webView2 != null) {
            int i2 = Build.VERSION.SDK_INT;
            webView2.onResume();
        }
        WebView webView3 = this.f14365k;
        if (!(webView3 == null || this.aa == -1)) {
            webView3.reload();
        }
        a("container_appear", new JSONObject());
    }

    class b extends com.bytedance.android.livesdk.browser.a.d {
        static {
            Covode.recordClassIndex(7956);
        }

        public final void onGeolocationPermissionsHidePrompt() {
        }

        public final void onHideCustomView() {
            if (h.this.f14363i == null) {
                h.this.f14364j = null;
                return;
            }
            h hVar = h.this;
            if (hVar.f14360f != null && !hVar.f14366l) {
                hVar.f14360f.setVisibility(0);
            }
            h.this.f14362h.setVisibility(8);
            h.this.f14362h.removeView(h.this.f14363i);
            n.a((Activity) h.this.getActivity(), false);
            h.this.f14363i = null;
            h.this.f14364j.onCustomViewHidden();
        }

        b() {
            super(h.this);
        }

        @Override // com.bytedance.android.livesdk.browser.a.b
        public final void onProgressChanged(WebView webView, int i2) {
            super.onProgressChanged(webView, i2);
            i.f23764a.a(webView, i2);
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (h.this.t && h.this.getActivity() != null && !m.a(str) && !TextUtils.equals("about:blank", str)) {
                h hVar = h.this;
                if (hVar.f14361g != null) {
                    hVar.f14361g.setText(str);
                }
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (h.this.v) {
                if (h.this.f14363i != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                h hVar = h.this;
                if (hVar.f14360f != null) {
                    hVar.f14360f.setVisibility(8);
                }
                h.this.f14364j = customViewCallback;
                h.this.f14362h.addView(view);
                h.this.f14363i = view;
                n.a((Activity) h.this.getActivity(), true);
                h.this.f14362h.setVisibility(0);
                h.this.f14362h.requestFocus();
            }
        }

        public final void onConsoleMessage(String str, int i2, String str2) {
            if (Logger.debug()) {
                com.bytedance.android.live.core.c.a.a(3, "LiveBrowserFragment", str + " -- line " + i2);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.bytedance.android.livesdk.browser.k.a aVar = this.z;
        if (aVar != null && this.u == 0) {
            aVar.a(3, 0, "");
        }
        a(0);
        g.b().b(this);
        com.bytedance.android.livesdk.browser.i.c.a().a(getActivity());
        com.bytedance.android.livesdk.browser.jsbridge.c cVar = this.w;
        if (cVar != null) {
            cVar.b();
        }
        if (this.f14365k != null) {
            try {
                g.b().a(this.f14365k);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        Handler handler = this.af;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onPause() {
        e a2;
        int i2;
        MethodCollector.i(10262);
        super.onPause();
        e activity = getActivity();
        WebView webView = this.f14365k;
        if (webView != null) {
            int i3 = Build.VERSION.SDK_INT;
            webView.onPause();
        }
        e activity2 = getActivity();
        com.bytedance.android.livesdk.browser.b.a aVar = this.ac;
        WebView webView2 = this.f14365k;
        if (!(activity2 == null || webView2 == null || aVar == null || ((aVar.a() == 0 && ((i2 = com.bytedance.android.livesdk.browser.h.f14423b) >= 0 ? i2 <= 0 : !com.bytedance.android.livesdk.browser.h.f14422a)) || (a2 = p.a((Context) activity2)) == null || !a2.isFinishing()))) {
            try {
                com.bytedance.android.live.core.f.t.a(webView2, "about:blank");
                if (com.bytedance.android.livesdk.browser.h.f14424c > 0) {
                    View rootView = webView2.getRootView();
                    if (rootView instanceof ViewGroup) {
                        View childAt = ((ViewGroup) rootView).getChildAt(0);
                        childAt.setDrawingCacheEnabled(true);
                        Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                        childAt.setDrawingCacheEnabled(false);
                        ImageView imageView = new ImageView(a2);
                        imageView.setImageBitmap(createBitmap);
                        imageView.setVisibility(0);
                        ((ViewGroup) rootView).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            } catch (Exception unused) {
            }
            if (Logger.debug()) {
                com.bytedance.android.live.core.c.a.a(2, "WebViewTweaker", "tweak webview pause when finishing");
            }
        }
        if (!(this.af == null || activity == null || activity.isFinishing())) {
            this.af.sendEmptyMessageDelayed(10011, 120000);
        }
        a("container_disappear", new JSONObject());
        MethodCollector.o(10262);
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.d.c.a
    public final void b(String str) {
        this.E = str;
    }

    class c extends com.bytedance.android.livesdk.browser.a.a {

        /* renamed from: a  reason: collision with root package name */
        Map<String, Boolean> f14373a = new HashMap();

        static {
            Covode.recordClassIndex(7957);
        }

        c() {
        }

        @Override // com.bytedance.ies.web.a.c
        public final void onLoadResource(WebView webView, String str) {
            if (Logger.debug() && !com.bytedance.android.livesdk.browser.a.b(str)) {
                com.bytedance.android.live.core.c.a.a(3, "LiveBrowserFragment", "onLoadResource ".concat(String.valueOf(str)));
            }
            super.onLoadResource(webView, str);
        }

        @Override // com.bytedance.android.livesdk.browser.a.c, com.bytedance.android.livesdk.browser.a.a
        public final void onPageFinished(WebView webView, String str) {
            MethodCollector.i(7770);
            h.this.u = System.currentTimeMillis();
            if (Logger.debug()) {
                com.bytedance.android.live.core.c.a.a(2, "LiveBrowserFragment", "onPageFinished " + str + ", time " + h.this.u);
            }
            if (h.this.H != null) {
                h.this.H.e();
            }
            if (h.this.f14358d) {
                webView.clearHistory();
                h.this.f14358d = false;
            }
            super.onPageFinished(webView, str);
            if (TextUtils.isEmpty(h.this.f14356b) && h.this.f14365k != null) {
                h hVar = h.this;
                hVar.f14356b = hVar.f14365k.getTitle();
                h.this.f14361g.setText(h.this.f14356b);
            }
            if (h.this.y && h.this.f14365k != null) {
                WebView webView2 = h.this.f14365k;
                String str2 = "about:blank";
                String a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(webView2, str2);
                if (!TextUtils.isEmpty(a2)) {
                    str2 = a2;
                }
                webView2.loadUrl(str2);
            }
            if (!h.this.f14367m) {
                h.this.e();
            }
            this.f14373a.clear();
            MethodCollector.o(7770);
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.web.a.c
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Logger.debug()) {
                com.bytedance.android.live.core.c.a.a(3, "LiveBrowserFragment", "shouldOverrideUrlLoading ".concat(String.valueOf(str)));
            }
            if (g.b().a(str) || super.shouldOverrideUrlLoading(webView, str)) {
                return true;
            }
            try {
                Uri parse = Uri.parse(str);
                String lowerCase = parse.getScheme().toLowerCase();
                if (!TextUtils.isEmpty(lowerCase) && !"about".equals(lowerCase) && !"http".equals(lowerCase) && !"https".equals(lowerCase)) {
                    return ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(h.this.getContext(), parse);
                }
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(5, "TAG", "view url " + str + " exception: " + e2);
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            String path;
            com.ss.android.ugc.aweme.net.model.e<String, WebResourceResponse> n = com.ss.android.ugc.aweme.net.monitor.n.f112474e.n(new com.ss.android.ugc.aweme.net.model.e<>(str, webView, null, com.ss.android.ugc.aweme.net.model.d.CONTINUE));
            if (n.f112463f == com.ss.android.ugc.aweme.net.model.d.INTERCEPT && n.f112459b != null) {
                return n.f112459b;
            }
            if (n.f112463f != com.ss.android.ugc.aweme.net.model.d.EXCEPTION || n.f112462e == null) {
                WebView webView2 = n.f112460c;
                Q q = n.f112458a;
                com.bytedance.android.livesdk.browser.e.c.f14412a = System.currentTimeMillis();
                if (!TextUtils.isEmpty(q)) {
                    WebResourceResponse a2 = com.bytedance.android.livesdk.browser.f.d.a().a(q, webView2);
                    if (a2 != null) {
                        if (TextUtils.equals("text/html", a2.getMimeType())) {
                            h.this.D = System.currentTimeMillis();
                            h.this.F.put("intercept_delay", Long.valueOf((h.this.D - h.this.C) / 1000));
                        }
                        if (h.c(q)) {
                            com.bytedance.android.livesdk.browser.e.c.a(h.this.f14355a, (String) q, 0);
                        }
                        this.f14373a.put(q, true);
                        com.bytedance.android.livesdk.browser.e.b.a(webView2, q, true);
                        Uri parse = Uri.parse(q);
                        if (parse.getPath() == null) {
                            path = "";
                        } else {
                            path = parse.getPath();
                        }
                        if (path.endsWith("jpg") || path.endsWith("jpeg") || path.endsWith("png") || path.endsWith("gif") || path.endsWith("ico")) {
                            h hVar = h.this;
                            Uri parse2 = Uri.parse(q);
                            com.facebook.imagepipeline.e.h e2 = k.a().e();
                            if (!e2.b(parse2)) {
                                e2.d(parse2).a(new com.facebook.d.b<Boolean>(webView2, q) {
                                    /* class com.bytedance.android.livesdk.browser.d.h.AnonymousClass2 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ WebView f14369a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ String f14370b;

                                    static {
                                        Covode.recordClassIndex(7954);
                                    }

                                    @Override // com.facebook.d.b
                                    public final void onFailureImpl(com.facebook.d.c<Boolean> cVar) {
                                    }

                                    @Override // com.facebook.d.b
                                    public final void onNewResultImpl(com.facebook.d.c<Boolean> cVar) {
                                        if (cVar.b() && cVar.d() != null) {
                                            cVar.d().booleanValue();
                                        }
                                    }

                                    {
                                        this.f14369a = r2;
                                        this.f14370b = r3;
                                    }
                                }, AsyncTask.THREAD_POOL_EXECUTOR);
                            }
                        }
                        return a2;
                    }
                    if (h.c(q)) {
                        com.bytedance.android.livesdk.browser.e.c.a(h.this.f14355a, (String) q, 1);
                    }
                    this.f14373a.put(q, false);
                    com.bytedance.android.livesdk.browser.e.b.a(webView2, q, true);
                }
                return super.shouldInterceptRequest(webView2, (String) q);
            }
            throw n.f112462e;
        }

        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            if (Logger.debug()) {
                com.bytedance.android.live.core.c.a.a(2, "LiveBrowserFragment", "doUpdateVisitedHistory " + webView.getUrl() + " " + str + " " + z);
            }
            super.doUpdateVisitedHistory(webView, str, z);
        }

        @Override // com.bytedance.android.livesdk.browser.a.c, com.bytedance.android.livesdk.browser.a.a
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            String str2;
            super.onPageStarted(webView, str, bitmap);
            h.this.B = System.currentTimeMillis();
            if (webView != null) {
                int i2 = Build.VERSION.SDK_INT;
                if (LiveEnableWebviewGlobalpropsSetting.INSTANCE.getValue() && com.bytedance.android.livesdk.browser.a.a(str)) {
                    boolean equals = Boolean.TRUE.equals(this.f14373a.get(str));
                    Context context = webView.getContext();
                    if (TextUtils.isEmpty(h.this.x)) {
                        str2 = str;
                    } else {
                        str2 = h.this.x;
                    }
                    webView.evaluateJavascript(com.a.a("(function(){var __globalProps=%s;window.__globalProps=__globalProps;})();", new Object[]{f.a(context, str2, h.this.K, equals)}), null);
                }
            }
            h.this.y = false;
            if (Logger.debug()) {
                com.bytedance.android.live.core.c.a.a(2, "LiveBrowserFragment", "onPageStarted " + str + ", time " + h.this.B);
            }
            h.this.F.put("constrution_duration", Long.valueOf((h.this.B - h.this.A) / 1000));
            if (h.this.H != null) {
                h.this.H.d();
            }
        }

        @Override // com.bytedance.android.livesdk.browser.a.c, com.bytedance.android.livesdk.browser.a.a
        public final void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            h.this.u = System.currentTimeMillis();
            if (Logger.debug()) {
                com.bytedance.android.live.core.c.a.a(2, "LiveBrowserFragment", "onReceivedError " + str2 + ", time " + h.this.u);
            }
            h.this.e();
            h.this.y = true;
            if (h.this.H != null) {
                h.this.H.f();
            }
            if (h.this.z != null) {
                h.this.z.a(2, i2, str);
            }
            h.this.a(1);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg.a
    public final void a(com.bytedance.android.livesdk.browser.i.b bVar) {
        this.ab = bVar;
        this.Q.setVisibility(0);
    }

    public final void a(int i2) {
        if (!TextUtils.isEmpty(this.E)) {
            com.bytedance.android.live.core.d.c.a(this.E, i2, this.F);
            this.E = null;
            this.F = null;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        WebView webView;
        if (message.what == 10011 && !this.mStatusActive && (webView = this.f14365k) != null) {
            try {
                webView.getSettings().setBlockNetworkLoads(true);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String path = new URL(str).getPath();
            if (path.endsWith(".htm") || path.endsWith(".html") || path.endsWith(".css")) {
                return true;
            }
            if (path.endsWith(".js")) {
                return true;
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view) {
        int id = view.getId();
        if (id == R.id.q9) {
            a("nav_bar_back_press");
        } else if (id == R.id.fm4) {
            b();
        }
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.zo || id == R.id.a03) {
            if (this.ab != null) {
                com.bytedance.android.live.share.a share = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).share();
                e activity = getActivity();
                c.a a2 = com.bytedance.android.livesdkapi.depend.e.c.a();
                a2.f22989l = this.ab.f14431d;
                a2.n = this.ab.f14429b;
                a2.o = this.ab.f14430c;
                a2.N = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
                share.a(activity, a2.a(), new com.bytedance.android.livesdkapi.depend.e.b() {
                    /* class com.bytedance.android.livesdk.browser.d.h.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(7953);
                    }

                    @Override // com.bytedance.android.livesdkapi.depend.e.b
                    public final void a(String str, String str2, Bundle bundle) {
                    }

                    @Override // com.bytedance.android.livesdkapi.depend.e.b
                    public final void a(Throwable th) {
                    }
                });
            }
        } else if (id == R.id.a02) {
            a("nav_bar_back_press");
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a, com.bytedance.android.livesdkapi.b.a
    public final boolean a(String str) {
        super.a(str);
        if (this.M != null && this.M.a()) {
            return true;
        }
        WebView webView = this.f14365k;
        if (webView != null && webView.canGoBack()) {
            this.f14365k.goBack();
            return true;
        } else if (!"nav_bar_back_press".equals(str)) {
            return false;
        } else {
            e activity = getActivity();
            if (activity instanceof com.bytedance.android.livesdkapi.b.c) {
                activity.finish();
            }
            return true;
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a, com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        Window window2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        super.onCreate(bundle);
        this.ac = com.bytedance.android.livesdk.browser.b.b.b();
        ((z) u.a().b().k().a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(new j(this));
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.getBoolean("from_notification", false);
        String string = arguments.getString("url");
        if (!TextUtils.isEmpty(string)) {
            Uri parse = Uri.parse(string);
            if (!this.V) {
                this.V = arguments.getBoolean("hide_status_bar", false);
            }
            if (!this.f14366l) {
                this.f14366l = arguments.getBoolean("hide_nav_bar", false);
            }
            if (!this.W) {
                this.W = arguments.getBoolean("hide_more", false);
            }
            this.U = arguments.getBoolean("shouldChangeBgResIntoTransparent", false);
            this.Z = arguments.getInt("bundle_web_view_background_color", Color.parseColor("#ffffff"));
            this.L = arguments.getString("soft_input_mode", "");
            if (parse != null) {
                try {
                    if (!TextUtils.isEmpty(parse.getQueryParameter("web_bg_color"))) {
                        this.Z = Color.parseColor(com.bytedance.android.livesdk.browser.j.a.a(parse.getQueryParameter("web_bg_color")));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                try {
                    if (parse.getQueryParameter("hide_nav_bar") != null) {
                        if (Integer.parseInt(parse.getQueryParameter("hide_nav_bar")) == 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        this.f14366l = z5;
                    }
                    if (parse.getQueryParameter("hide_status_bar") != null) {
                        if (Integer.parseInt(parse.getQueryParameter("hide_status_bar")) == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.V = z4;
                    }
                    if (parse.getQueryParameter("hide_more") != null) {
                        if (Integer.parseInt(parse.getQueryParameter("hide_more")) == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.W = z3;
                    }
                    if (parse.getQueryParameter("hide_loading") != null) {
                        if (ah.b(parse.getQueryParameter("hide_loading")) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f14367m = z2;
                    }
                    this.X = parse.getQueryParameter("status_bar_color");
                    this.Y = parse.getQueryParameter("status_bar_bg_color");
                } catch (Throwable th) {
                    String message = th.getMessage();
                    HashMap hashMap = new HashMap();
                    hashMap.put("urlString", string);
                    hashMap.put("errorMsg", message);
                    com.bytedance.android.live.core.d.c.a("ttlive_uri_parsing_fail", 1, hashMap);
                }
            }
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            this.ai = arguments2.getString("referer");
            this.f14356b = arguments2.getString("title");
            if (parse != null) {
                if (!TextUtils.isEmpty(parse.getQueryParameter("title"))) {
                    this.f14356b = parse.getQueryParameter("title");
                }
                if (parse.getQueryParameter("bundle_sale_show_status") != null) {
                    this.aa = Integer.parseInt(parse.getQueryParameter("bundle_sale_show_status"));
                }
            }
        }
        if ("black".equals(this.X)) {
            e activity = getActivity();
            if (!(activity == null || (window2 = activity.getWindow()) == null)) {
                int i2 = Build.VERSION.SDK_INT;
                if (!com.bytedance.android.live.core.f.c.a.b(window2, true) && !com.bytedance.android.live.core.f.c.a.a(window2, true) && Build.VERSION.SDK_INT >= 23) {
                    com.bytedance.android.live.core.f.c.a.c(window2, true);
                }
            }
        } else if ("white".equals(this.X) && (window = getActivity().getWindow()) != null) {
            String a2 = com.bytedance.android.live.core.f.c.b.a();
            if ("MIUI".equals(a2)) {
                com.bytedance.android.live.core.f.c.a.b(window, false);
            } else if ("FLYME".equals(a2)) {
                com.bytedance.android.live.core.f.c.a.a(window, false);
            } else {
                com.bytedance.android.live.core.f.c.a.c(window, false);
            }
        }
        if (!m.a(this.Y)) {
            try {
                com.bytedance.android.live.uikit.b.a.a(getActivity(), Color.parseColor(this.Y));
            } catch (Exception unused) {
            }
        }
        if (this.V) {
            ac.a((Activity) getActivity());
        }
        this.af = new WeakHandler(this);
        this.v = AllowHtmlVideoSetting.INSTANCE.getValue();
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            this.ah = arguments3.getBoolean("bundle_no_hw_acceleration", false);
            this.ae = arguments3.getBoolean("bundle_enable_app_cache", false);
            this.aj = arguments3.getString("url");
            this.x = arguments3.getString("original_scheme");
            if (this.aj == null) {
                this.aj = "";
            }
            this.ai = arguments3.getString("referer");
            this.t = arguments3.getBoolean("bundle_user_webview_title", true);
            String string2 = arguments3.getString("wap_headers");
            try {
                if (!m.a(string2)) {
                    this.ag = new JSONObject(string2);
                }
            } catch (JSONException unused2) {
            }
            this.ad = arguments3.getBoolean("bundle_load_no_cache", false);
        }
        if (!this.ah) {
            this.ah = false;
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.d.c.a
    public final void b(String str, Object obj) {
        this.F.put(str, obj);
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.b
    public final <T> void a(String str, T t2) {
        com.bytedance.android.livesdk.browser.jsbridge.c cVar = this.w;
        if (cVar != null) {
            cVar.f14451b.a(str, (Object) t2);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        if (this.w != null) {
            if (!jSONObject.has("code")) {
                try {
                    jSONObject.put("code", 1);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            this.w.f14451b.a(str, jSONObject);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        b bVar = this.n;
        if (bVar != null) {
            bVar.a(i2, i3, intent);
        }
        bn bnVar = this.o;
        if (bnVar != null) {
            bnVar.a(i2, i3, intent);
        }
        bo boVar = this.r;
        if (boVar != null) {
            boVar.a(i2, i3, intent);
        }
        l lVar = this.q;
        if (lVar != null) {
            lVar.a(i2, i3, intent);
        }
        br brVar = this.p;
        if (brVar != null) {
            brVar.a(i2, i3, intent);
        }
        t tVar = this.s;
        if (tVar != null) {
            tVar.a(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebSettings settings;
        MethodCollector.i(10257);
        try {
            View a2 = com.a.a(layoutInflater, R.layout.b5n, viewGroup, false);
            this.f14359e = a2.findViewById(R.id.dqn);
            this.f14360f = a2.findViewById(R.id.em8);
            View findViewById = a2.findViewById(R.id.eme);
            a2.findViewById(R.id.eqp).setVisibility(8);
            this.f14360f.findViewById(R.id.q9).setOnClickListener(this.ak);
            TextView textView = (TextView) this.f14360f.findViewById(R.id.title);
            this.f14361g = textView;
            textView.setText(this.f14356b);
            this.R = (ViewGroup) a2.findViewById(R.id.fm5);
            this.S = a2.findViewById(R.id.fm6);
            this.T = a2.findViewById(R.id.fm4);
            this.P = (FrameLayout) a2.findViewById(R.id.e93);
            int i2 = -1;
            this.P.addView(new com.bytedance.android.livesdk.browser.view.a(getActivity()), new FrameLayout.LayoutParams(-2, -1));
            if (this.f14367m) {
                this.P.setVisibility(8);
            }
            FullscreenVideoFrame fullscreenVideoFrame = (FullscreenVideoFrame) a2.findViewById(R.id.ai1);
            this.f14362h = fullscreenVideoFrame;
            fullscreenVideoFrame.setListener(new n(this));
            View findViewById2 = a2.findViewById(R.id.zo);
            this.Q = findViewById2;
            findViewById2.setOnClickListener(this);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f14361g.getLayoutParams();
            marginLayoutParams.leftMargin = (int) n.b(getContext(), 50.0f);
            marginLayoutParams.rightMargin = (int) n.b(getContext(), 50.0f);
            this.f14361g.setLayoutParams(marginLayoutParams);
            this.f14361g.setSingleLine(true);
            this.f14361g.setEllipsize(TextUtils.TruncateAt.END);
            if (this.f14366l) {
                this.f14360f.setVisibility(8);
                findViewById.setVisibility(8);
                this.f14361g.setVisibility(8);
            }
            ((y) u.a().b().h().c().a(o.f14381a).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(new p(this));
            com.bytedance.android.livesdk.browser.c.d b2 = g.b();
            b2.a(this);
            com.bytedance.android.livesdk.browser.c.f.a();
            this.A = System.currentTimeMillis();
            this.F.put("webview_cache", Integer.valueOf(b2.a() ? 1 : 0));
            try {
                this.f14365k = b2.a(getContext());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            WebView webView = this.f14365k;
            if (webView == null) {
                MethodCollector.o(10257);
                return a2;
            }
            this.R.addView(webView);
            this.f14365k.setScrollBarStyle(0);
            this.f14365k.setBackgroundColor(this.Z);
            if (!this.U) {
                this.R.setBackgroundColor(this.Z);
            }
            CookieManager.getInstance().setAcceptCookie(true);
            this.f14365k.setVerticalScrollBarEnabled(false);
            com.bytedance.android.livesdk.browser.view.b a3 = com.bytedance.android.livesdk.browser.view.b.a(getActivity());
            a3.f14836a = !this.ah;
            a3.a(this.f14365k);
            this.n = new b();
            if (this.ad) {
                settings = this.f14365k.getSettings();
                i2 = 2;
            } else {
                settings = this.f14365k.getSettings();
                if (this.ae) {
                    i2 = 1;
                }
            }
            settings.setCacheMode(i2);
            this.F.put("page_cache", Integer.valueOf(this.f14365k.getSettings().getCacheMode()));
            this.w = com.bytedance.android.livesdk.browser.jsbridge.c.a(getActivity(), this.f14365k, new c(), this.n);
            if (this.G != null) {
                this.G.a(this.w);
            }
            com.bytedance.android.livesdk.browser.jsbridge.c cVar = this.w;
            if (cVar != null) {
                com.bytedance.android.livesdk.browser.jsbridge.newmethods.g gVar = new com.bytedance.android.livesdk.browser.jsbridge.newmethods.g();
                this.M = gVar;
                cVar.f14451b.a("viewController", (com.bytedance.ies.web.jsbridge2.f<?, ?>) gVar);
            }
            this.w.f14451b.a("shareInfo", (e.b) new q(this));
            this.w.f14451b.a("sharePanel", (e.b) new r(this));
            this.w.f14451b.a("cancelLoading", (e.b) new s(this));
            this.w.f14451b.a("uploadPhoto", (e.b) new t(this));
            this.w.f14451b.a("uploadPicture", (e.b) new u(this));
            this.w.f14451b.a("uploadVideo", (e.b) new k(this));
            this.w.f14451b.a("chooseImage", (e.b) new l(this));
            this.w.f14451b.a("upload", (e.b) new m(this));
            this.w.f14452c.a("ttliveMonitorPage", new com.bytedance.android.livesdk.browser.jsbridge.d.c(new WeakReference(this))).a("share", new com.bytedance.android.livesdk.browser.jsbridge.d.h(new WeakReference(getContext()), this));
            this.C = System.currentTimeMillis();
            JSONObject jSONObject = this.ag;
            if (jSONObject == null || jSONObject.length() <= 0) {
                com.bytedance.android.livesdk.browser.a.a(this.aj, this.f14365k, this.ai);
            } else {
                HashMap hashMap = new HashMap();
                com.bytedance.android.livesdk.browser.a.a(hashMap, this.ag);
                com.bytedance.android.livesdk.browser.a.a(this.aj, this.f14365k, hashMap);
            }
            com.bytedance.android.livesdk.browser.k.a aVar = new com.bytedance.android.livesdk.browser.k.a(this.f14355a, this.aj, this.f14357c);
            this.z = aVar;
            aVar.a(0, 0, "");
            MethodCollector.o(10257);
            return a2;
        } catch (Exception e3) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            com.bytedance.android.livesdk.ab.i.b();
            com.bytedance.android.live.core.c.a.a(6, "ttlive_exception", e3.getStackTrace());
            View view = new View(getContext());
            MethodCollector.o(10257);
            return view;
        }
    }
}
