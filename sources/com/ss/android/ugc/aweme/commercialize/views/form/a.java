package com.ss.android.ugc.aweme.commercialize.views.form;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends com.bytedance.ies.uikit.a.b implements i, j {

    /* renamed from: j  reason: collision with root package name */
    public static final C1734a f76165j = new C1734a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public CrossPlatformWebView f76166a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f76167b;

    /* renamed from: c  reason: collision with root package name */
    public b f76168c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f76169d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f76170e;

    /* renamed from: k  reason: collision with root package name */
    private ViewGroup f76171k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f76172l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f76173m;
    private String n = "";
    private boolean o;
    private boolean p;
    private SparseArray q;

    static {
        Covode.recordClassIndex(46970);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(221, new g(a.class, "onEvent", com.ss.android.ugc.aweme.commercialize.event.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(62, new g(a.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        hashMap.put(298, new g(a.class, "onEvent", c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(30, new g(a.class, "onEvent", com.ss.android.ugc.aweme.commercialize.views.cards.d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @r
    public final void onEvent(c cVar) {
        l.d(cVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a$a  reason: collision with other inner class name */
    public static final class C1734a {
        static {
            Covode.recordClassIndex(46971);
        }

        private C1734a() {
        }

        public /* synthetic */ C1734a(byte b2) {
            this();
        }

        public static a a(Bundle bundle) {
            l.d(bundle, "");
            a aVar = new a();
            aVar.setArguments(bundle);
            return aVar;
        }

        public static void a(androidx.fragment.app.i iVar, ViewGroup viewGroup, int i2, a aVar) {
            MethodCollector.i(3136);
            l.d(iVar, "");
            l.d(viewGroup, "");
            l.d(aVar, "");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setId(i2);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup.addView(frameLayout);
            n a2 = iVar.a();
            l.b(a2, "");
            v.O().B();
            a2.a(i2, aVar);
            a2.c();
            MethodCollector.o(3136);
        }

        public static void a(androidx.fragment.app.i iVar, ViewGroup viewGroup, int i2, boolean z) {
            MethodCollector.i(3138);
            l.d(iVar, "");
            l.d(viewGroup, "");
            Fragment a2 = iVar.a(i2);
            if (a2 != null) {
                n a3 = iVar.a();
                l.b(a3, "");
                a3.a(a2);
                a3.c();
            }
            viewGroup.removeView((FrameLayout) viewGroup.findViewById(i2));
            if (z) {
                v.O().y();
            }
            MethodCollector.o(3138);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76174a;

        static {
            Covode.recordClassIndex(46972);
        }

        b(a aVar) {
            this.f76174a = aVar;
        }

        public final void run() {
            CrossPlatformWebView crossPlatformWebView = this.f76174a.f76166a;
            if (crossPlatformWebView == null) {
                l.a("mWebView");
            }
            crossPlatformWebView.setVisibility(0);
            this.f76174a.a();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Window window;
        super.onDestroy();
        EventBus.a().b(this);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(18);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        b bVar = this.f76168c;
        if (bVar != null && !this.f76170e) {
            bVar.a(this.p);
        }
        com.ss.android.ugc.aweme.commercialize.utils.l.a(getContext(), false);
        SparseArray sparseArray = this.q;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final void a() {
        if (!this.f76170e && !this.o) {
            com.ss.android.ugc.aweme.commercialize.log.j.b(getContext(), this.f76167b, ag.a());
            Context context = getContext();
            Aweme aweme = this.f76167b;
            AwemeRawAd awemeRawAd = null;
            com.ss.android.ugc.aweme.commercialize.log.j.c(context, "form_show", aweme, com.ss.android.ugc.aweme.commercialize.log.j.a(context, aweme, false, (Map<String, String>) null));
            Aweme aweme2 = this.f76167b;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("background_ad", "form_show", awemeRawAd).c();
            this.o = true;
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.crossplatform.platform.webview.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76177a;

        static {
            Covode.recordClassIndex(46975);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final boolean b(WebView webView, String str) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void c(WebView webView, String str) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f76177a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str) {
            b bVar = this.f76177a.f76168c;
            if (bVar != null && this.f76177a.f76169d) {
                a aVar = this.f76177a;
                CrossPlatformWebView crossPlatformWebView = aVar.f76166a;
                if (crossPlatformWebView == null) {
                    l.a("mWebView");
                }
                SingleWebView a2 = a.a(crossPlatformWebView);
                String str2 = "javascript:(function extra(){" + "var aa =document.createElement(\"link\");aa.type='text/css'; aa.rel='stylesheet'; aa.href='';document.getElementsByTagName(\"head\")[0].appendChild(aa);" + "})();";
                l.b(str2, "");
                a2.loadUrl(str2);
                CrossPlatformWebView crossPlatformWebView2 = aVar.f76166a;
                if (crossPlatformWebView2 == null) {
                    l.a("mWebView");
                }
                crossPlatformWebView2.postDelayed(new b(aVar), 3000);
                bVar.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f76177a.f76170e = true;
            b bVar = this.f76177a.f76168c;
            if (bVar != null) {
                bVar.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, int i2, String str, String str2) {
            this.f76177a.f76170e = true;
            b bVar = this.f76177a.f76168c;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    @r
    public final void onEvent(AdCardClose adCardClose) {
        l.d(adCardClose, "");
        b bVar = this.f76168c;
        if (bVar != null) {
            bVar.c();
        }
    }

    static SingleWebView a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView a2 = ((com.ss.android.ugc.aweme.crossplatform.view.j) crossPlatformWebView.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a();
        l.b(a2, "");
        return a2;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76175a;

        static {
            Covode.recordClassIndex(46973);
        }

        c(a aVar) {
            this.f76175a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.commercialize.log.j.l(this.f76175a.getContext(), this.f76175a.f76167b);
            com.ss.android.ugc.aweme.commerce.a.a.d();
            this.f76175a.getContext();
            com.ss.android.ugc.aweme.commerce.a.a.c(this.f76175a.f76167b);
            b bVar = this.f76175a.f76168c;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    @r
    public final void onEvent(com.ss.android.ugc.aweme.commercialize.event.c cVar) {
        l.d(cVar, "");
        new com.bytedance.tux.g.b(this).a(getString(R.string.ga3)).b();
        this.p = true;
        b bVar = this.f76168c;
        if (bVar != null) {
            bVar.c();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76176a;

        static {
            Covode.recordClassIndex(46974);
        }

        d(a aVar) {
            this.f76176a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a c2;
            ClickAgent.onClick(view);
            IAdSceneService f2 = AdSceneServiceImpl.f();
            if (!(f2 == null || (c2 = f2.c()) == null)) {
                c2.a(this.f76176a.f76167b, this.f76176a.getContext(), 3);
            }
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aN(this.f76176a.f76167b) && com.ss.android.ugc.aweme.commercialize.utils.n.a(this.f76176a.getContext(), this.f76176a.f76167b)) {
                return;
            }
            if (w.e(this.f76176a.getContext(), this.f76176a.f76167b, 3)) {
                b bVar = this.f76176a.f76168c;
                if (bVar != null) {
                    bVar.c();
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.commercialize.utils.n.a(this.f76176a.getContext(), this.f76176a.f76167b, (String) null, (String) null);
            b bVar2 = this.f76176a.f76168c;
            if (bVar2 != null) {
                bVar2.c();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Aweme b2;
        Window window;
        super.onCreate(bundle);
        androidx.fragment.app.e activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setSoftInputMode(32);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("url", "");
            l.b(string, "");
            Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
            this.n = p.b((CharSequence) string).toString();
            this.f76169d = arguments.getBoolean("use_css_injection", false);
            String string2 = arguments.getString("aweme_id", "");
            if (AwemeService.b().d(string2) != null) {
                b2 = AwemeService.b().d(string2);
            } else {
                b2 = AwemeService.b().b(string2);
            }
            this.f76167b = b2;
        }
        EventBus.a(EventBus.a(), this);
    }

    @r
    public final void onEvent(com.ss.android.ugc.aweme.commercialize.views.cards.d dVar) {
        l.d(dVar, "");
        b bVar = this.f76168c;
        if (bVar != null) {
            int i2 = dVar.f76061a;
            if (i2 == 0) {
                bVar.b();
            } else if (i2 == 1) {
                bVar.a();
                CrossPlatformWebView crossPlatformWebView = this.f76166a;
                if (crossPlatformWebView == null) {
                    l.a("mWebView");
                }
                crossPlatformWebView.setVisibility(0);
                a();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        this.f76171k = viewGroup;
        if (viewGroup == null) {
            l.a("mRootView");
        }
        viewGroup.setOnClickListener(new c(this));
        View findViewById = view.findViewById(R.id.fm8);
        l.b(findViewById, "");
        this.f76166a = (CrossPlatformWebView) findViewById;
        e eVar = new e(this);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            CrossPlatformWebView crossPlatformWebView = this.f76166a;
            if (crossPlatformWebView == null) {
                l.a("mWebView");
            }
            CommercializeWebViewHelper.a(crossPlatformWebView, eVar, this, activity, getArguments());
        }
        CrossPlatformWebView crossPlatformWebView2 = this.f76166a;
        if (crossPlatformWebView2 == null) {
            l.a("mWebView");
        }
        a(crossPlatformWebView2).setEnableScrollControl(true);
        CrossPlatformWebView crossPlatformWebView3 = this.f76166a;
        if (crossPlatformWebView3 == null) {
            l.a("mWebView");
        }
        a(crossPlatformWebView3).setCanScrollVertically(false);
        CrossPlatformWebView crossPlatformWebView4 = this.f76166a;
        if (crossPlatformWebView4 == null) {
            l.a("mWebView");
        }
        SingleWebChromeClient singleWebChromeClient = a(crossPlatformWebView4).getSingleWebChromeClient();
        if (singleWebChromeClient != null) {
            singleWebChromeClient.f78880c = false;
        }
        if (this.f76169d) {
            CrossPlatformWebView crossPlatformWebView5 = this.f76166a;
            if (crossPlatformWebView5 == null) {
                l.a("mWebView");
            }
            WebSettings settings = a(crossPlatformWebView5).getSettings();
            com.a.a(settings, settings.getUserAgentString() + "/RevealType/Dialog");
        }
        View findViewById2 = view.findViewById(R.id.dn);
        l.b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        this.f76172l = textView;
        if (textView == null) {
            l.a("mAdBtn");
        }
        textView.setOnClickListener(new d(this));
        TextView textView2 = this.f76172l;
        if (textView2 == null) {
            l.a("mAdBtn");
        }
        com.ss.android.ugc.aweme.utils.j.a(textView2);
        View findViewById3 = view.findViewById(R.id.dky);
        l.b(findViewById3, "");
        TextView textView3 = (TextView) findViewById3;
        this.f76173m = textView3;
        if (textView3 == null) {
            l.a("mReplayBtn");
        }
        com.ss.android.ugc.aweme.utils.j.a(textView3);
        CrossPlatformWebView crossPlatformWebView6 = this.f76166a;
        if (crossPlatformWebView6 == null) {
            l.a("mWebView");
        }
        CrossPlatformWebView.a(crossPlatformWebView6, this.n, false, null, 6);
        com.ss.android.ugc.aweme.commercialize.utils.l.a(getContext(), true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a0l, viewGroup, false);
    }
}
