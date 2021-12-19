package com.bytedance.android.livesdk.browser.c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.d;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.b.o;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.f;
import com.bytedance.android.livesdk.browser.h;
import com.bytedance.android.livesdk.browser.jsbridge.c;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import com.bytedance.android.livesdk.browser.view.SSWebView;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEnableWebviewGlobalpropsSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class g implements d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f14319a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.bytedance.android.livesdk.browser.jsbridge.b> f14320b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<d> f14321c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    private Set<com.bytedance.android.livesdk.browser.h.a> f14322d;

    /* renamed from: e  reason: collision with root package name */
    private d.AbstractC0310d f14323e;

    static {
        Covode.recordClassIndex(7932);
    }

    static class a extends com.bytedance.android.livesdk.browser.a.b {

        /* renamed from: a  reason: collision with root package name */
        public c f14324a;

        static {
            Covode.recordClassIndex(7933);
        }

        public final void onGeolocationPermissionsHidePrompt() {
        }

        a() {
        }
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final boolean a(String str) {
        Set<com.bytedance.android.livesdk.browser.h.a> set = this.f14322d;
        if (set == null || set.size() <= 0) {
            return false;
        }
        for (com.bytedance.android.livesdk.browser.h.a aVar : this.f14322d) {
            if (aVar.a(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final void a(com.bytedance.android.livesdk.browser.jsbridge.b bVar) {
        this.f14320b.add(bVar);
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final void a(String str, JSONObject jSONObject) {
        for (com.bytedance.android.livesdk.browser.jsbridge.b bVar : this.f14320b) {
            bVar.a(str, jSONObject);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final boolean a() {
        d.AbstractC0310d dVar = this.f14323e;
        return dVar == null || dVar.a();
    }

    private g() {
        HashSet hashSet = new HashSet();
        this.f14322d = hashSet;
        hashSet.add(new com.bytedance.android.livesdk.browser.h.b());
        f.a();
    }

    public static d b() {
        MethodCollector.i(8005);
        if (f14319a == null) {
            synchronized (g.class) {
                try {
                    if (f14319a == null) {
                        f14319a = new g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8005);
                    throw th;
                }
            }
        }
        g gVar = f14319a;
        MethodCollector.o(8005);
        return gVar;
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final com.bytedance.android.live.core.widget.a a(d.b bVar) {
        return com.bytedance.android.livesdk.browser.d.a.a(bVar, (o) null);
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final void b(com.bytedance.android.livesdk.browser.jsbridge.b bVar) {
        this.f14320b.remove(bVar);
    }

    static class b extends com.bytedance.android.livesdk.browser.a.c implements d.c {

        /* renamed from: a  reason: collision with root package name */
        Map<String, Boolean> f14325a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private d.e f14326b;

        static {
            Covode.recordClassIndex(7934);
        }

        @Override // com.bytedance.android.livesdk.browser.c.d.c
        public final WebViewClient a() {
            return this;
        }

        @Override // com.bytedance.android.livesdk.browser.c.d.c
        public final void b() {
            this.f14326b = null;
        }

        b(d.e eVar) {
            this.f14326b = eVar;
        }

        @Override // com.bytedance.android.livesdk.browser.a.c
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            d.e eVar = this.f14326b;
            if (eVar != null) {
                eVar.a(webView, str);
            }
            this.f14325a.clear();
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            e<String, WebResourceResponse> n = n.f112474e.n(new e<>(str, webView, null, com.ss.android.ugc.aweme.net.model.d.CONTINUE));
            if (n.f112463f == com.ss.android.ugc.aweme.net.model.d.INTERCEPT && n.f112459b != null) {
                return n.f112459b;
            }
            if (n.f112463f != com.ss.android.ugc.aweme.net.model.d.EXCEPTION || n.f112462e == null) {
                WebView webView2 = n.f112460c;
                Q q = n.f112458a;
                WebResourceResponse a2 = com.bytedance.android.livesdk.browser.f.d.a().a(q, webView2);
                if (a2 != null) {
                    this.f14325a.put(q, true);
                    com.bytedance.android.livesdk.browser.e.b.a(webView2, q, true);
                    return a2;
                }
                this.f14325a.put(q, false);
                com.bytedance.android.livesdk.browser.e.b.a(webView2, q, false);
                return super.shouldInterceptRequest(webView2, (String) q);
            }
            throw n.f112462e;
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.web.a.c
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String lowerCase;
            if (super.shouldOverrideUrlLoading(webView, str)) {
                return true;
            }
            try {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() == null) {
                    lowerCase = "";
                } else {
                    lowerCase = parse.getScheme().toLowerCase();
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    return false;
                }
                if (!"about".equals(lowerCase) && !lowerCase.equals("https")) {
                    if (!lowerCase.equals("http")) {
                        return ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(webView.getContext(), str);
                    }
                }
                return false;
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(5, "TAG", "view url " + str + " exception: " + e2);
                return false;
            }
        }

        @Override // com.bytedance.android.livesdk.browser.a.c
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (webView instanceof SSWebView) {
                ((SSWebView) webView).setPageStartUrl(str);
            }
            super.onPageStarted(webView, str, bitmap);
            if (webView != null) {
                int i2 = Build.VERSION.SDK_INT;
                if (LiveEnableWebviewGlobalpropsSetting.INSTANCE.getValue() && com.bytedance.android.livesdk.browser.a.a(str)) {
                    webView.evaluateJavascript(com.a.a("(function(){var __globalProps=%s;window.__globalProps=__globalProps;})();", new Object[]{f.a(webView.getContext(), str, "0", Boolean.TRUE.equals(this.f14325a.get(str)))}), null);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final WebView a(Context context) {
        d.f b2;
        String str;
        d.AbstractC0310d dVar = this.f14323e;
        if (dVar != null && (b2 = dVar.b()) != null) {
            return b2.f14313a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        RoundRectWebView roundRectWebView = new RoundRectWebView(context);
        if (context != null) {
            str = context.getClass().getName();
        } else {
            str = "other";
        }
        com.bytedance.android.livesdk.browser.e.c.a(str, roundRectWebView, currentTimeMillis);
        com.bytedance.android.livesdk.browser.b.b.b().a(roundRectWebView);
        return roundRectWebView;
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final void a(WebView webView) {
        MethodCollector.i(8034);
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        d.AbstractC0310d dVar = this.f14323e;
        if (dVar == null || !dVar.c()) {
            h.a(webView);
        }
        i.f23764a.a(webView);
        MethodCollector.o(8034);
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final void a(d.f fVar) {
        if (fVar != null) {
            b(fVar);
            h.a(fVar.f14313a);
            if (fVar.f14314b != null) {
                fVar.f14314b.b();
            }
            i.f23764a.a(fVar.f14313a);
            fVar.f14314b = null;
            fVar.f14313a = null;
            fVar.f14315c = null;
            fVar.f14316d = null;
            fVar.f14317e.b();
            fVar.f14317e = null;
        }
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final com.bytedance.android.live.core.widget.a a(d.b bVar, o oVar) {
        return com.bytedance.android.livesdk.browser.d.a.a(bVar, oVar);
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final d.f a(Activity activity, d.e eVar) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        RoundRectWebView roundRectWebView = new RoundRectWebView(activity);
        if (activity != null) {
            str = activity.getClass().getName();
        } else {
            str = "other";
        }
        com.bytedance.android.livesdk.browser.e.c.a(str, roundRectWebView, currentTimeMillis);
        roundRectWebView.setHorizontalScrollBarEnabled(false);
        roundRectWebView.setVerticalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT >= 21) {
            roundRectWebView.getSettings().setMixedContentMode(2);
        }
        com.bytedance.android.livesdk.browser.b.b.b().a(roundRectWebView);
        b bVar = new b(eVar);
        a aVar = new a();
        c a2 = c.a(activity, roundRectWebView, bVar, aVar);
        aVar.f14324a = a2;
        bVar.f35529d = a2.f14452c.f35719a;
        com.bytedance.android.livesdk.browser.view.b a3 = com.bytedance.android.livesdk.browser.view.b.a(activity);
        a3.f14836a = true;
        a3.a(roundRectWebView);
        d.f fVar = new d.f(roundRectWebView, a2, aVar, bVar);
        a((com.bytedance.android.livesdk.browser.jsbridge.b) fVar);
        return fVar;
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final void a(Context context, d.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", aVar.f14292c);
        bundle.putBoolean("hide_status_bar", aVar.f14293d);
        bundle.putString("title", aVar.f14291b);
        bundle.putBoolean("show_progress", aVar.f14294e);
        bundle.putBoolean("bundle_user_webview_title", aVar.f14298i);
        bundle.putString("status_bar_color", aVar.f14295f);
        bundle.putString("status_bar_bg_color", aVar.f14296g);
        bundle.putInt("bundle_web_view_background_color", y.b((int) R.color.va));
        bundle.putString("original_scheme", aVar.f14297h);
        bundle.putString("soft_input_mode", aVar.f14299j);
        ((IHostAction) com.bytedance.android.live.t.a.a(IHostAction.class)).openLiveBrowser(aVar.f14290a, bundle, context);
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final void a(d.f fVar, String str) {
        Map<String, String> hashMap;
        if (fVar != null && fVar.f14313a != null) {
            if (com.bytedance.android.livesdk.browser.a.a(str)) {
                hashMap = ((k) com.bytedance.android.live.t.a.a(k.class)).b(str);
            } else {
                hashMap = new HashMap<>();
            }
            com.bytedance.android.livesdk.browser.a.a(str, fVar.f14313a, hashMap);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.c.d
    public final void a(d.f fVar, String str, JSONObject jSONObject) {
        if (fVar != null && fVar.f14314b != null) {
            fVar.a(str, jSONObject);
        }
    }
}
