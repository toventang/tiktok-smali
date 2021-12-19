package com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.utils.ab;
import com.ss.android.ugc.aweme.commercialize.utils.ac;
import com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer;
import com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebTitleBar;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.m.p;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class CommonPopUpWebPageView extends FrameLayout implements au, d {

    /* renamed from: m  reason: collision with root package name */
    public static final b f76201m = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ad.feed.h.b f76202a;

    /* renamed from: b  reason: collision with root package name */
    public AdPopUpWebPageContainer f76203b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f76204c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f76205d;

    /* renamed from: e  reason: collision with root package name */
    public ac f76206e;

    /* renamed from: f  reason: collision with root package name */
    public a f76207f;

    /* renamed from: g  reason: collision with root package name */
    public String f76208g;

    /* renamed from: h  reason: collision with root package name */
    public h.f.a.a<? extends Object> f76209h;

    /* renamed from: i  reason: collision with root package name */
    public o f76210i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f76211j;

    /* renamed from: k  reason: collision with root package name */
    public c f76212k;

    /* renamed from: l  reason: collision with root package name */
    public final k f76213l;
    private d n;
    private c o;
    private final h.h p;
    private final e q;
    private final View.OnTouchListener r;
    private final m s;
    private SparseArray t;

    public interface a {
        static {
            Covode.recordClassIndex(46993);
        }

        void a();

        void b();
    }

    public interface c {
        static {
            Covode.recordClassIndex(46995);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(46996);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(46992);
    }

    public final View a(int i2) {
        if (this.t == null) {
            this.t = new SparseArray();
        }
        View view = (View) this.t.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.t.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final boolean b(WebView webView, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void c(WebView webView, String str) {
    }

    public final ab getLoadListener() {
        return (ab) this.p.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
    }

    public static final class b {
        static {
            Covode.recordClassIndex(46994);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final c getKeyDownCallBack() {
        return this.o;
    }

    public final a getMBehaviorCallback() {
        return this.f76207f;
    }

    public final ac getParams() {
        return this.f76206e;
    }

    public final d getTitleBarCallback() {
        return this.n;
    }

    public static final class e implements CommonPopUpWebBottomSheetContainer.b {

        /* renamed from: a  reason: collision with root package name */
        public int f76214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommonPopUpWebPageView f76215b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f76216c;

        static {
            Covode.recordClassIndex(46997);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer.b
        public final void a() {
            if (this.f76214a != 3) {
                this.f76214a = 3;
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer.b
        public final void b() {
            if (this.f76214a != 4) {
                this.f76214a = 4;
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer.b
        public final void c() {
            if (CommonPopUpWebBottomSheetContainer.f76193i) {
                com.ss.android.ugc.aweme.commercialize.utils.l.a(this.f76216c);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer.b
        public final void d() {
            com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness;
            AdWebStatBusiness adWebStatBusiness;
            if (this.f76214a != 5) {
                this.f76214a = 5;
                this.f76215b.getLoadListener().a(true);
                com.ss.android.ugc.aweme.ad.feed.h.b bVar = this.f76215b.f76202a;
                if (bVar != null) {
                    bVar.a(false);
                }
                FrameLayout frameLayout = (FrameLayout) this.f76215b.a(R.id.d74);
                h.f.b.l.b(frameLayout, "");
                frameLayout.setVisibility(8);
                ((FrameLayout) this.f76215b.a(R.id.d74)).setOnClickListener(null);
                FrameLayout frameLayout2 = (FrameLayout) this.f76215b.a(R.id.d74);
                h.f.b.l.b(frameLayout2, "");
                frameLayout2.setClickable(false);
                AdPopUpWebPageContainer adPopUpWebPageContainer = this.f76215b.f76203b;
                if (!(adPopUpWebPageContainer == null || (crossPlatformBusiness = adPopUpWebPageContainer.getCrossPlatformBusiness()) == null || (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.a(AdWebStatBusiness.class)) == null)) {
                    adWebStatBusiness.a(true);
                }
                a mBehaviorCallback = this.f76215b.getMBehaviorCallback();
                if (mBehaviorCallback != null) {
                    mBehaviorCallback.b();
                }
                CrossPlatformWebView.a((CrossPlatformWebView) this.f76215b.a(R.id.d79), "about:blank", false, null, 6);
                CommonPopUpWebPageView commonPopUpWebPageView = this.f76215b;
                c cVar = commonPopUpWebPageView.f76212k;
                if (cVar != null) {
                    String str = cVar.f76252c.get("EVENT_NAME_FOR_STAY");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, String> entry : cVar.f76252c.entrySet()) {
                        if ((!h.f.b.l.a((Object) entry.getKey(), (Object) "EVENT_NAME_WHEN_REQUEST")) && (!h.f.b.l.a((Object) entry.getKey(), (Object) "EVENT_NAME_FOR_STAY"))) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap.put("duration", String.valueOf(commonPopUpWebPageView.f76210i.a(TimeUnit.MILLISECONDS)));
                    if (hl.a(str)) {
                        r.a(str, linkedHashMap);
                    }
                }
                this.f76215b.f76211j = false;
                this.f76215b.f76204c = false;
                this.f76215b.getLoadListener().f75545f = true;
            }
        }

        e(CommonPopUpWebPageView commonPopUpWebPageView, Context context) {
            this.f76215b = commonPopUpWebPageView;
            this.f76216c = context;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer.b
        public final void a(View view, float f2) {
            h.f.b.l.d(view, "");
            if (Float.isNaN(f2)) {
                FrameLayout frameLayout = (FrameLayout) this.f76215b.a(R.id.d74);
                h.f.b.l.b(frameLayout, "");
                frameLayout.setAlpha(1.0f);
            } else if (f2 < 0.0f) {
                float abs = Math.abs(f2);
                FrameLayout frameLayout2 = (FrameLayout) this.f76215b.a(R.id.d74);
                h.f.b.l.b(frameLayout2, "");
                frameLayout2.setAlpha(1.0f - abs);
            }
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<ab> {
        final /* synthetic */ CommonPopUpWebPageView this$0;

        static {
            Covode.recordClassIndex(47002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(CommonPopUpWebPageView commonPopUpWebPageView) {
            super(0);
            this.this$0 = commonPopUpWebPageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ab invoke() {
            ab abVar = new ab();
            abVar.f75544e = this.this$0.f76213l;
            return abVar;
        }
    }

    public final a getActionMode() {
        return ((CommonPopUpWebBottomSheetContainer) a(R.id.d70)).getActionMode();
    }

    public static final class k implements ab.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonPopUpWebPageView f76222a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f76223b;

        static {
            Covode.recordClassIndex(47003);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.ab.a
        public final void c() {
            Context context = this.f76223b;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null || !activity.isFinishing()) {
                this.f76222a.f76205d = true;
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.ab.a
        public final void a() {
            FrameLayout frameLayout = (FrameLayout) this.f76222a.a(R.id.d78);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(8);
            View findViewById = ((CrossPlatformWebView) this.f76222a.a(R.id.d79)).findViewById(R.id.axu);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.ab.a
        public final void b() {
            FrameLayout frameLayout = (FrameLayout) this.f76222a.a(R.id.d78);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(0);
            View findViewById = ((CrossPlatformWebView) this.f76222a.a(R.id.d79)).findViewById(R.id.axu);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        k(CommonPopUpWebPageView commonPopUpWebPageView, Context context) {
            this.f76222a = commonPopUpWebPageView;
            this.f76223b = context;
        }
    }

    public static final class m implements CommonPopUpWebTitleBar.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonPopUpWebPageView f76225a;

        static {
            Covode.recordClassIndex(47005);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebTitleBar.b
        public final void a() {
            this.f76225a.f76208g = "button";
            this.f76225a.a(false);
            d titleBarCallback = this.f76225a.getTitleBarCallback();
            if (titleBarCallback != null) {
                titleBarCallback.a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f76225a = commonPopUpWebPageView;
        }
    }

    public final WebView getWebView() {
        return ((com.ss.android.ugc.aweme.crossplatform.view.j) ((CrossPlatformWebView) a(R.id.d79)).a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        AdPopUpWebPageContainer adPopUpWebPageContainer = this.f76203b;
        if (adPopUpWebPageContainer != null) {
            adPopUpWebPageContainer.a();
        }
        super.onDetachedFromWindow();
        com.ss.android.ugc.aweme.ad.feed.h.b bVar = this.f76202a;
        if (bVar != null) {
            bVar.a(false);
        }
        this.f76202a = null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        Bundle bundle;
        int i2;
        androidx.lifecycle.m mVar;
        MethodCollector.i(4017);
        super.onAttachedToWindow();
        ac acVar = this.f76206e;
        if (acVar == null || (bundle = acVar.f75550e) == null) {
            MethodCollector.o(4017);
            return;
        }
        bundle.putBoolean("show_load_dialog", false);
        View.inflate(getContext(), R.layout.a9w, this);
        FrameLayout frameLayout = (FrameLayout) a(R.id.d19);
        h.f.b.l.b(frameLayout, "");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ac acVar2 = this.f76206e;
            if (acVar2 != null) {
                i2 = acVar2.f75548c;
            } else {
                i2 = 0;
            }
            marginLayoutParams.topMargin = i2;
            frameLayout.requestLayout();
            int b2 = com.ss.android.ugc.aweme.base.utils.i.b(getContext());
            int a2 = com.ss.android.ugc.aweme.base.utils.i.a(getContext());
            b.f76246e = (a2 - com.ss.android.ugc.aweme.base.utils.i.b()) / b2;
            b.f76244c = b2;
            b.f76245d = a2;
            CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer = (CommonPopUpWebBottomSheetContainer) a(R.id.d70);
            FrameLayout frameLayout2 = (FrameLayout) a(R.id.d7c);
            h.f.b.l.b(frameLayout2, "");
            h.f.b.l.d(frameLayout2, "");
            ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
            if (layoutParams2 != null) {
                ((CoordinatorLayout.e) layoutParams2).a(commonPopUpWebBottomSheetContainer.f76195h);
                ((CrossPlatformWebView) a(R.id.d79)).setCustomWebViewStatus(this);
                ((com.ss.android.ugc.aweme.crossplatform.view.j) ((CrossPlatformWebView) a(R.id.d79)).a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a().setWebScrollListener(new i(this));
                ((CrossPlatformWebView) a(R.id.d79)).setShouldShowProgressBarBg(false);
                com.bytedance.ies.dmt.ui.f.c.a(a(R.id.d7b), 0.5f);
                TuxTextView tuxTextView = (TuxTextView) a(R.id.aiq);
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                }
                Context context = getContext();
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    this.f76202a = new f(this, activity, activity);
                    ac acVar3 = this.f76206e;
                    if (!(acVar3 == null || (mVar = acVar3.f75547b) == null)) {
                        CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) a(R.id.d79);
                        h.f.b.l.b(crossPlatformWebView, "");
                        this.f76203b = AdPopUpWebPageContainer.a.a(activity, crossPlatformWebView, getLoadListener(), bundle, mVar);
                    }
                    ((CommonPopUpWebBottomSheetContainer) a(R.id.d70)).setCallback(this.q);
                    ((CommonPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().n = true;
                    ((TuxTextView) a(R.id.d7b)).setOnClickListener(new g(this));
                    ((CommonPopUpWebTitleBar) a(R.id.d7g)).setTitleBarListener(this.s);
                    ((CommonPopUpWebTitleBar) a(R.id.d7g)).setOnTouchListener(new h(this));
                    ((CrossPlatformWebView) a(R.id.d79)).setWebViewTouchListener(this.r);
                    int a3 = com.ss.android.ugc.aweme.base.utils.n.a(52.5d);
                    CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) a(R.id.d79);
                    h.f.b.l.b(crossPlatformWebView2, "");
                    a(crossPlatformWebView2, a3);
                    FrameLayout frameLayout3 = (FrameLayout) a(R.id.d78);
                    h.f.b.l.b(frameLayout3, "");
                    a(frameLayout3, a3);
                }
                h.f.a.a<? extends Object> aVar = this.f76209h;
                if (aVar != null) {
                    aVar.invoke();
                    MethodCollector.o(4017);
                    return;
                }
                MethodCollector.o(4017);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            MethodCollector.o(4017);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        MethodCollector.o(4017);
        throw nullPointerException2;
    }

    public final boolean a() {
        CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer = (CommonPopUpWebBottomSheetContainer) a(R.id.d70);
        if (commonPopUpWebBottomSheetContainer == null || !commonPopUpWebBottomSheetContainer.b()) {
            return false;
        }
        return true;
    }

    public final void setKeyDownCallBack(c cVar) {
        this.o = cVar;
    }

    public final void setMBehaviorCallback(a aVar) {
        this.f76207f = aVar;
    }

    public final void setParams(ac acVar) {
        this.f76206e = acVar;
    }

    public final void setTitleBarCallback(d dVar) {
        this.n = dVar;
    }

    public static final class i implements com.ss.android.ugc.aweme.crossplatform.view.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonPopUpWebPageView f76221a;

        static {
            Covode.recordClassIndex(47001);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f76221a = commonPopUpWebPageView;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.b
        public final void a(int i2, int i3) {
            boolean z;
            WebView webView = this.f76221a.getWebView();
            if (webView != null) {
                if (webView.getScrollY() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                CommonPopUpWebBottomSheetContainer.f76193i = z;
            }
        }
    }

    public static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonPopUpWebPageView f76224a;

        static {
            Covode.recordClassIndex(47004);
        }

        public l(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f76224a = commonPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76224a.a(false);
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonPopUpWebPageView f76219a;

        static {
            Covode.recordClassIndex(46999);
        }

        g(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f76219a = commonPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            CommonPopUpWebPageView commonPopUpWebPageView = this.f76219a;
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) commonPopUpWebPageView.a(R.id.d79);
            h.f.b.l.b(crossPlatformWebView, "");
            commonPopUpWebPageView.a(crossPlatformWebView.getCurrentUrl());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommonPopUpWebPageView(Context context) {
        super(context, null, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(4092);
        this.f76210i = new o();
        this.p = h.i.a((h.f.a.a) new j(this));
        this.q = new e(this, context);
        this.f76213l = new k(this, context);
        this.r = new n(this);
        this.s = new m(this);
        MethodCollector.o(4092);
    }

    private final void b(int i2) {
        if (!this.f76204c && !this.f76211j) {
            this.f76211j = true;
            c cVar = this.f76212k;
            if (cVar != null) {
                String str = cVar.f76252c.get("EVENT_NAME_WHEN_REQUEST");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : cVar.f76252c.entrySet()) {
                    if ((!h.f.b.l.a((Object) entry.getKey(), (Object) "EVENT_NAME_WHEN_REQUEST")) && (!h.f.b.l.a((Object) entry.getKey(), (Object) "EVENT_NAME_FOR_STAY"))) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.put("status", String.valueOf(i2));
                linkedHashMap.put("duration", String.valueOf(this.f76210i.a(TimeUnit.MILLISECONDS)));
                if (hl.a(str)) {
                    r.a(str, linkedHashMap);
                }
            }
        }
    }

    public final void a(String str) {
        ac acVar;
        this.f76211j = false;
        if (str != null || ((acVar = this.f76206e) != null && (str = acVar.f75546a) != null)) {
            String uri = Uri.parse(str).buildUpon().appendQueryParameter("hide_loading", "1").build().toString();
            h.f.b.l.b(uri, "");
            CrossPlatformWebView.a((CrossPlatformWebView) a(R.id.d79), uri, false, null, 6);
        }
    }

    public final void a(boolean z) {
        if (!z) {
            CrossPlatformWebView.a((CrossPlatformWebView) a(R.id.d79), "about:blank", false, null, 6);
        }
        CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer = (CommonPopUpWebBottomSheetContainer) a(R.id.d70);
        if (commonPopUpWebBottomSheetContainer.b()) {
            commonPopUpWebBottomSheetContainer.f76195h.c(5);
        }
        com.ss.android.ugc.aweme.commercialize.utils.l.a(getContext());
    }

    public /* synthetic */ CommonPopUpWebPageView(Context context, byte b2) {
        this(context);
    }

    static final class n implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonPopUpWebPageView f76226a;

        static {
            Covode.recordClassIndex(47006);
        }

        n(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f76226a = commonPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            this.f76226a.getActionMode().a(motionEvent);
            return false;
        }
    }

    private static void a(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i2;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static final class f extends com.ss.android.ugc.aweme.ad.feed.h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonPopUpWebPageView f76217a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f76218b;

        static {
            Covode.recordClassIndex(46998);
        }

        @Override // com.ss.android.ugc.aweme.base.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || (!this.f76217a.a() && !this.f76217a.f76204c)) {
                return false;
            }
            this.f76217a.getKeyDownCallBack();
            if (((CrossPlatformWebView) this.f76217a.a(R.id.d79)).b()) {
                ((CrossPlatformWebView) this.f76217a.a(R.id.d79)).a();
                return true;
            }
            this.f76217a.a(false);
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CommonPopUpWebPageView commonPopUpWebPageView, Activity activity, Activity activity2) {
            super(activity2);
            this.f76217a = commonPopUpWebPageView;
            this.f76218b = activity;
        }
    }

    static final class h implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonPopUpWebPageView f76220a;

        static {
            Covode.recordClassIndex(47000);
        }

        h(CommonPopUpWebPageView commonPopUpWebPageView) {
            this.f76220a = commonPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            WebView webView;
            a actionMode = this.f76220a.getActionMode();
            h.f.b.l.b(motionEvent, "");
            actionMode.a(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                CommonPopUpWebBottomSheetContainer.f76193i = true;
            } else if ((action == 1 || action == 3) && (webView = this.f76220a.getWebView()) != null && webView.getScrollY() > 0) {
                CommonPopUpWebBottomSheetContainer.f76193i = false;
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str) {
        String str2;
        ProgressBar progressBar = (ProgressBar) a(R.id.d6z);
        h.f.b.l.b(progressBar, "");
        progressBar.setVisibility(8);
        String str3 = null;
        if (webView != null) {
            str2 = webView.getTitle();
        } else {
            str2 = null;
        }
        if (!hl.a(str2)) {
            str2 = null;
        }
        if (str2 != null) {
            h.f.b.l.b(str2, "");
            if (p.b(str2, "about:blank", true)) {
                TuxTextView tuxTextView = (TuxTextView) a(R.id.d7f);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setText("");
                a(true);
                return;
            }
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.d7f);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setText(str2);
        }
        if (webView != null) {
            str3 = webView.getUrl();
        }
        if (hl.a(str3) && str3 != null) {
            h.f.b.l.b(str3, "");
            if (p.b(str3, "about:blank", true)) {
                TuxTextView tuxTextView3 = (TuxTextView) a(R.id.d7e);
                h.f.b.l.b(tuxTextView3, "");
                tuxTextView3.setText("");
            } else {
                TuxTextView tuxTextView4 = (TuxTextView) a(R.id.d7e);
                h.f.b.l.b(tuxTextView4, "");
                tuxTextView4.setText(str3);
            }
        }
        o oVar = this.f76210i;
        h.f.b.l.b(oVar, "");
        if (oVar.f53699a) {
            b(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        o oVar = this.f76210i;
        h.f.b.l.b(oVar, "");
        if (oVar.f53699a) {
            b(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str, Bitmap bitmap) {
        ProgressBar progressBar = (ProgressBar) a(R.id.d6z);
        h.f.b.l.b(progressBar, "");
        progressBar.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, int i2, String str, String str2) {
        o oVar = this.f76210i;
        h.f.b.l.b(oVar, "");
        if (oVar.f53699a) {
            b(0);
        }
    }
}
