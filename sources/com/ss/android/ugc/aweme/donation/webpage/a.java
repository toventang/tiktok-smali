package com.ss.android.ugc.aweme.donation.webpage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.crossplatform.activity.m;
import com.ss.android.ugc.aweme.crossplatform.business.g;
import com.ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.e;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar;
import com.ss.android.ugc.aweme.crossplatform.view.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class a implements m {

    /* renamed from: h  reason: collision with root package name */
    public static final C1952a f83058h = new C1952a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.ugc.aweme.crossplatform.view.a f83059a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f83060b;

    /* renamed from: c  reason: collision with root package name */
    public TuxTextView f83061c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.a<z> f83062d;

    /* renamed from: e  reason: collision with root package name */
    public h.f.a.a<z> f83063e;

    /* renamed from: f  reason: collision with root package name */
    public Activity f83064f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.crossplatform.d.a.a f83065g;

    /* renamed from: i  reason: collision with root package name */
    private e f83066i;

    /* renamed from: j  reason: collision with root package name */
    private CrossPlatformTitleBar f83067j;

    /* renamed from: k  reason: collision with root package name */
    private ConstraintLayout f83068k;

    /* renamed from: l  reason: collision with root package name */
    private final g f83069l;

    /* renamed from: m  reason: collision with root package name */
    private View f83070m;

    static {
        Covode.recordClassIndex(51781);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.webpage.a$a  reason: collision with other inner class name */
    public static final class C1952a {
        static {
            Covode.recordClassIndex(51782);
        }

        private C1952a() {
        }

        public /* synthetic */ C1952a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final Context getContext() {
        return this.f83064f;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final g getCrossPlatformBusiness() {
        return this.f83069l;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final com.ss.android.ugc.aweme.crossplatform.d.a.a getCrossPlatformParams() {
        return this.f83065g;
    }

    private final void i() {
        this.f83066i = new d(this);
    }

    public static final class c implements CrossPlatformTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83072a;

        static {
            Covode.recordClassIndex(51784);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
        public final void a(View view) {
            l.d(view, "");
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
        public final void d() {
            h.f.a.a<z> aVar = this.f83072a.f83063e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
        public final void e() {
            h.f.a.a<z> aVar = this.f83072a.f83063e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
        public final void a() {
            h.f.a.a<z> aVar;
            a aVar2 = this.f83072a;
            com.ss.android.ugc.aweme.crossplatform.view.a aVar3 = aVar2.f83059a;
            if (aVar3 == null) {
                l.a("mCrossPlatformWebView");
            }
            if (!aVar3.a() && (aVar = aVar2.f83063e) != null) {
                aVar.invoke();
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
        public final void b() {
            ((ReportBusinessProxy) this.f83072a.getCrossPlatformBusiness().a(ReportBusinessProxy.class)).a(this.f83072a.f83064f);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f83072a = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void d() {
        CrossPlatformTitleBar crossPlatformTitleBar = this.f83067j;
        if (crossPlatformTitleBar == null) {
            l.a("mCrossPlatformTitleBar");
        }
        crossPlatformTitleBar.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final e e() {
        e eVar = this.f83066i;
        if (eVar == null) {
            l.a("mISingleWebViewStatus");
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final com.ss.android.ugc.aweme.crossplatform.view.a f() {
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = this.f83059a;
        if (aVar == null) {
            l.a("mCrossPlatformWebView");
        }
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final void g() {
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = this.f83059a;
        if (aVar == null) {
            l.a("mCrossPlatformWebView");
        }
        aVar.g();
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final boolean h() {
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = this.f83059a;
        if (aVar == null) {
            l.a("mCrossPlatformWebView");
        }
        return aVar.h();
    }

    private final void b() {
        i();
        this.f83059a = (com.ss.android.ugc.aweme.crossplatform.view.a) a(R.id.ah_);
        this.f83068k = (ConstraintLayout) a(R.id.a6v);
        this.f83061c = (TuxTextView) a(R.id.f3x);
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = this.f83059a;
        if (aVar == null) {
            l.a("mCrossPlatformWebView");
        }
        aVar.setCrossPlatformActivityContainer(this);
        j();
    }

    public final void a() {
        b();
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = this.f83059a;
        if (aVar == null) {
            l.a("mCrossPlatformWebView");
        }
        aVar.a(this.f83064f);
        k();
    }

    private final void k() {
        if (!this.f83065g.f78741a.f78738k) {
            Integer num = this.f83065g.f78741a.f78728a;
            if (num != null && num.intValue() == 2) {
                com.ss.android.ugc.aweme.crossplatform.view.a aVar = this.f83059a;
                if (aVar == null) {
                    l.a("mCrossPlatformWebView");
                }
                ((com.ss.android.ugc.aweme.crossplatform.view.e) aVar.a(com.ss.android.ugc.aweme.crossplatform.view.e.class)).a(getCrossPlatformParams());
                return;
            }
            String a2 = com.ss.android.ugc.aweme.crossplatform.a.b.a(this.f83065g.f78741a.f78730c, com.ss.android.ugc.aweme.crossplatform.a.b.b(this.f83064f));
            com.ss.android.ugc.aweme.crossplatform.view.a aVar2 = this.f83059a;
            if (aVar2 == null) {
                l.a("mCrossPlatformWebView");
            }
            ((j) aVar2.a(j.class)).a(a2);
        }
    }

    private final void j() {
        CrossPlatformTitleBar crossPlatformTitleBar = (CrossPlatformTitleBar) a(R.id.ahd);
        this.f83067j = crossPlatformTitleBar;
        if (crossPlatformTitleBar == null) {
            l.a("mCrossPlatformTitleBar");
        }
        crossPlatformTitleBar.setCrossPlatformParams(getCrossPlatformParams());
        CrossPlatformTitleBar crossPlatformTitleBar2 = this.f83067j;
        if (crossPlatformTitleBar2 == null) {
            l.a("mCrossPlatformTitleBar");
        }
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) crossPlatformTitleBar2.findViewById(R.id.zo);
        autoRTLImageView.setImageDrawable(com.bytedance.tux.c.c.a(b.f83071a).a(getContext()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(n.a(44.0d), n.a(44.0d));
        l.b(autoRTLImageView, "");
        autoRTLImageView.setLayoutParams(layoutParams);
        CrossPlatformTitleBar crossPlatformTitleBar3 = this.f83067j;
        if (crossPlatformTitleBar3 == null) {
            l.a("mCrossPlatformTitleBar");
        }
        crossPlatformTitleBar3.setTitleWrap(new c(this));
        if (TextUtils.equals(this.f83065g.f78741a.f78733f, "donation_sticker_consume")) {
            ConstraintLayout constraintLayout = this.f83068k;
            if (constraintLayout == null) {
                l.a("mClRoot");
            }
            constraintLayout.setBackgroundResource(R.drawable.r_);
            CrossPlatformTitleBar crossPlatformTitleBar4 = this.f83067j;
            if (crossPlatformTitleBar4 == null) {
                l.a("mCrossPlatformTitleBar");
            }
            crossPlatformTitleBar4.setBackgroundResource(R.drawable.r_);
        }
    }

    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83073a;

        static {
            Covode.recordClassIndex(51785);
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
        d(a aVar) {
            this.f83073a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.donation.webpage.a$d$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC1953a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f83074a;

            static {
                Covode.recordClassIndex(51786);
            }

            View$OnClickListenerC1953a(d dVar) {
                this.f83074a = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                h.f.a.a<z> aVar = this.f83074a.f83073a.f83062d;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str) {
            if (TextUtils.equals(this.f83073a.f83065g.f78741a.f78733f, "org_detail_page")) {
                a aVar = this.f83073a;
                Uri parse = Uri.parse(aVar.f83065g.f78741a.f78730c);
                l.b(parse, "");
                String path = parse.getPath();
                com.ss.android.ugc.aweme.crossplatform.view.a aVar2 = aVar.f83059a;
                if (aVar2 == null) {
                    l.a("mCrossPlatformWebView");
                }
                Uri parse2 = Uri.parse(aVar2.getCurrentUrl());
                l.b(parse2, "");
                if (TextUtils.equals(path, parse2.getPath()) && !this.f83073a.f83060b) {
                    TuxTextView tuxTextView = this.f83073a.f83061c;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(0);
                    }
                    TuxTextView tuxTextView2 = this.f83073a.f83061c;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setTuxFont(33);
                    }
                    TuxTextView tuxTextView3 = this.f83073a.f83061c;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setOnClickListener(new View$OnClickListenerC1953a(this));
                    }
                    this.f83073a.f83060b = false;
                }
            }
            TuxTextView tuxTextView4 = this.f83073a.f83061c;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(8);
            }
            this.f83073a.f83060b = false;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f83073a.f83060b = true;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, int i2, String str, String str2) {
            this.f83073a.f83060b = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.web.g
    public final void a(String str) {
        a(str, true);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f83071a = new b();

        static {
            Covode.recordClassIndex(51783);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_x_mark;
            return z.f158842a;
        }
    }

    private final <T extends View> T a(int i2) {
        T t = (T) this.f83064f.findViewById(i2);
        if (t == null) {
            View view = this.f83070m;
            t = view != null ? (T) view.findViewById(i2) : null;
        }
        l.b(t, "");
        return t;
    }

    private a(Activity activity, com.ss.android.ugc.aweme.crossplatform.d.a.a aVar) {
        l.d(activity, "");
        l.d(aVar, "");
        this.f83064f = activity;
        this.f83065g = aVar;
        this.f83070m = null;
        g a2 = g.a.a(this);
        l.b(a2, "");
        this.f83069l = a2;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void a(CharSequence charSequence, boolean z) {
        Integer num;
        if (charSequence == null) {
            return;
        }
        if ((!TextUtils.isEmpty(charSequence) && com.ss.android.ugc.aweme.crossplatform.a.b.a(charSequence)) || getCrossPlatformParams().f78741a.f78728a == null || (num = getCrossPlatformParams().f78741a.f78728a) == null || num.intValue() != 1) {
            return;
        }
        if (getCrossPlatformParams().f78744d.y || z) {
            CrossPlatformTitleBar crossPlatformTitleBar = this.f83067j;
            if (crossPlatformTitleBar == null) {
                l.a("mCrossPlatformTitleBar");
            }
            crossPlatformTitleBar.setTitle(charSequence);
        }
    }

    public /* synthetic */ a(Activity activity, com.ss.android.ugc.aweme.crossplatform.d.a.a aVar, byte b2) {
        this(activity, aVar);
    }
}
