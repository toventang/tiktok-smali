package com.ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.d.v;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.ss.android.sdk.webview.q;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.a.d;
import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.activity.m;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.g;
import com.ss.android.ugc.aweme.crossplatform.c.d;
import com.ss.android.ugc.aweme.crossplatform.c.f;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.CWebViewInterceptor;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBarView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;
import org.json.JSONObject;

public class CrossPlatformWebView extends FrameLayout implements a, org.greenrobot.eventbus.i, j {
    private long A;
    private final Set<h.f.a.b<Boolean, z>> B;
    private SparseArray C;

    /* renamed from: a */
    public SingleWebView f78936a;

    /* renamed from: b */
    public final Set<d> f78937b;

    /* renamed from: c */
    public int f78938c;

    /* renamed from: d */
    public boolean f78939d;

    /* renamed from: e */
    public m f78940e;

    /* renamed from: f */
    public k f78941f;

    /* renamed from: g */
    public com.ss.android.ugc.aweme.crossplatform.d.a.a f78942g;

    /* renamed from: h */
    public String f78943h;

    /* renamed from: i */
    boolean f78944i;

    /* renamed from: j */
    private final g f78945j;

    /* renamed from: k */
    private com.ss.android.ugc.aweme.search.model.b f78946k;

    /* renamed from: l */
    private final com.ss.android.ugc.aweme.crossplatform.a f78947l;

    /* renamed from: m */
    private boolean f78948m;
    private final h.h n;
    private boolean o;
    private final e p;
    private final j q;
    private com.ss.android.ugc.aweme.crossplatform.platform.webview.d r;
    private com.ss.android.ugc.aweme.crossplatform.platform.webview.e s;
    private final String t;
    private final com.ss.android.sdk.webview.c u;
    private Map<String, String> v;
    private com.ss.android.ugc.aweme.crossplatform.business.g w;
    private boolean x;
    private Throwable y;
    private long z;

    static {
        Covode.recordClassIndex(48988);
    }

    public CrossPlatformWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public View a(int i2) {
        if (this.C == null) {
            this.C = new SparseArray();
        }
        View view = (View) this.C.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.C.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public final void c() {
        this.x = true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(184, new org.greenrobot.eventbus.g(CrossPlatformWebView.class, "onEvent", com.ss.android.sdk.webview.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(185, new org.greenrobot.eventbus.g(CrossPlatformWebView.class, "onJsBroadcastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final com.ss.android.ugc.aweme.crossplatform.f.d getTimeStatisticsUtils() {
        return (com.ss.android.ugc.aweme.crossplatform.f.d) this.n.getValue();
    }

    public static final class c implements i {
        static {
            Covode.recordClassIndex(48991);
        }

        c() {
        }
    }

    public final int getCurrentMode() {
        return this.f78938c;
    }

    public final com.ss.android.ugc.aweme.crossplatform.platform.webview.e getCustomWebViewStatus() {
        return this.s;
    }

    public final boolean getDisplayed() {
        return this.f78948m;
    }

    public final Throwable getError() {
        return this.y;
    }

    public final com.ss.android.ugc.aweme.crossplatform.platform.webview.d getIFullScreen() {
        return this.r;
    }

    public final long getLoadRNViewCompleteTimestamp() {
        return this.z;
    }

    public final String getLogTag() {
        return this.t;
    }

    public final com.ss.android.ugc.aweme.crossplatform.a getMDidMountHandler() {
        return this.f78947l;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public k getMonitorSession() {
        return this.f78941f;
    }

    public final g getRegistry() {
        return this.f78945j;
    }

    public final com.ss.android.ugc.aweme.search.model.b getSearchEnterParam() {
        return this.f78946k;
    }

    public final boolean getShouldShowProgressBarBg() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public g getViewStatusRegistry() {
        return this.f78945j;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public final boolean a() {
        if (this.f78938c == 2) {
            return false;
        }
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        if (!singleWebView.canGoBack()) {
            return false;
        }
        SingleWebView singleWebView2 = this.f78936a;
        if (singleWebView2 == null) {
            l.a("singleWebView");
        }
        singleWebView2.goBack();
        return true;
    }

    public final void a(boolean z2) {
        if (z2) {
            View a2 = a(R.id.a7a);
            l.b(a2, "");
            a2.setVisibility(0);
            ((DmtStatusView) a(R.id.ci9)).f();
            return;
        }
        View a3 = a(R.id.a7a);
        l.b(a3, "");
        a3.setVisibility(8);
        ((DmtStatusView) a(R.id.ci9)).a(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Integer num, String str, String str2, boolean z2) {
        com.ss.android.ugc.aweme.crossplatform.d.b bVar;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar2;
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
            if (str2 != null && !p.b(str2, "about:blank", false)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (l.a((Object) parse.getQueryParameter("_enable_loading_duration_report"), (Object) "1")) {
                        if (!TextUtils.isEmpty(parse.getQueryParameter("_project_name"))) {
                            a(jSONObject2, "project_name", parse.getQueryParameter("_project_name"));
                        }
                        if (!TextUtils.isEmpty(parse.getQueryParameter("_enter_from"))) {
                            a(jSONObject2, "enter_from", parse.getQueryParameter("_enter_from"));
                        }
                        jSONObject2.put("duration", SystemClock.elapsedRealtime() - this.A);
                        r.a("client_loading_duration", jSONObject2);
                    }
                } catch (Exception unused) {
                }
            }
        }
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams = getCrossPlatformParams();
        if (((crossPlatformParams == null || (bVar2 = crossPlatformParams.f78742b) == null) ? 0 : bVar2.f78759a) > 0) {
            com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams2 = getCrossPlatformParams();
            a(jSONObject, "creativeId", (crossPlatformParams2 == null || (bVar = crossPlatformParams2.f78742b) == null) ? null : Long.valueOf(bVar.f78759a));
            if (z2 == 0) {
                com.bytedance.apm.b.a("aweme_ad_landingpage_open_error", 1, jSONObject);
            } else if (this.A > 0) {
                a(jSONObject, "duration", Long.valueOf(SystemClock.elapsedRealtime() - this.A));
            }
            com.bytedance.apm.b.a("aweme_ad_landingpage_open_error_rate", !z2, jSONObject);
        }
        com.bytedance.apm.b.a("aweme_webview_open_error_rate", 1 ^ (z2 ? 1 : 0), jSONObject);
    }

    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        if (singleWebView.getVisibility() == 0) {
            SingleWebView singleWebView2 = this.f78936a;
            if (singleWebView2 == null) {
                l.a("singleWebView");
            }
            singleWebView2.sendEventToWebView(str, jSONObject);
        }
    }

    public final void a(String str, JSONObject jSONObject, String str2) {
        l.d(str, "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventName", str);
        if (!(str2 == null || str2.length() == 0)) {
            jSONObject2.put("reactId", str2);
        }
        jSONObject2.put("data", jSONObject);
        a("notification", jSONObject2);
    }

    public void a(String str, boolean z2, boolean z3) {
        l.d(str, "");
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("rn_schema");
        if (queryParameter == null || queryParameter.length() == 0) {
            l.b(parse, "");
            if (l.a((Object) parse.getScheme(), (Object) "http") || l.a((Object) parse.getScheme(), (Object) "https")) {
                a(this, str, z3, null, 4);
                return;
            }
            String queryParameter2 = parse.getQueryParameter("url");
            if (queryParameter2 != null && queryParameter2.length() != 0) {
                String queryParameter3 = parse.getQueryParameter("url");
                if (queryParameter3 == null) {
                    l.b();
                }
                l.b(queryParameter3, "");
                a(this, queryParameter3, z3, null, 4);
                return;
            }
            return;
        }
        l.d(str, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013a, code lost:
        if (r2 == null) goto L_0x013c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
        // Method dump skipped, instructions count: 437
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.a(java.lang.String, java.util.Map):void");
    }

    public final void a(String str) {
        com.ss.android.ugc.aweme.crossplatform.d.a aVar;
        com.ss.android.ugc.aweme.crossplatform.d.e eVar;
        com.ss.android.ugc.aweme.crossplatform.d.a aVar2;
        Integer num;
        l.d(str, "");
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams = getCrossPlatformParams();
        String str2 = null;
        String a2 = (crossPlatformParams == null || (aVar2 = crossPlatformParams.f78741a) == null || (num = aVar2.f78728a) == null) ? null : com.ss.android.ugc.aweme.crossplatform.a.b.a(num.intValue());
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams2 = getCrossPlatformParams();
        String str3 = (crossPlatformParams2 == null || (eVar = crossPlatformParams2.f78743c) == null) ? null : eVar.f78784e;
        String str4 = this.f78943h;
        if (str4 != null) {
            str2 = str4;
        } else {
            com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams3 = getCrossPlatformParams();
            if (!(crossPlatformParams3 == null || (aVar = crossPlatformParams3.f78741a) == null)) {
                str2 = aVar.f78730c;
            }
        }
        a(str, a2, str3, str2);
    }

    public static final class b implements com.ss.android.sdk.webview.g<k> {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f78950a;

        static {
            Covode.recordClassIndex(48990);
        }

        @Override // com.ss.android.sdk.webview.g
        public final /* bridge */ /* synthetic */ k a() {
            return this.f78950a.f78941f;
        }

        b(CrossPlatformWebView crossPlatformWebView) {
            this.f78950a = crossPlatformWebView;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.crossplatform.f.d> {

        /* renamed from: a */
        public static final h f78956a = new h();

        static {
            Covode.recordClassIndex(48996);
        }

        h() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.crossplatform.f.d invoke() {
            return new com.ss.android.ugc.aweme.crossplatform.f.d();
        }
    }

    public static final class i implements j {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f78957a;

        static {
            Covode.recordClassIndex(48997);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.j
        public final SingleWebView a() {
            return this.f78957a.getSingleWebView();
        }

        i(CrossPlatformWebView crossPlatformWebView) {
            this.f78957a = crossPlatformWebView;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.j
        public final void a(String str) {
            if (str != null) {
                CrossPlatformWebView.a(this.f78957a, str, false, null, 6);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public com.ss.android.ugc.aweme.crossplatform.d.a.a getCrossPlatformParams() {
        m mVar = this.f78940e;
        if (mVar != null) {
            return mVar.getCrossPlatformParams();
        }
        return this.f78942g;
    }

    public LayoutInflater getLayoutInflater() {
        LayoutInflater from = LayoutInflater.from(getContext());
        l.b(from, "");
        return from;
    }

    public String getReactId() {
        k kVar = this.f78941f;
        if (kVar != null) {
            return kVar.bz_();
        }
        return null;
    }

    public final SingleWebView getSingleWebView() {
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        return singleWebView;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final boolean h() {
        if (this.f78938c == 2) {
            return true;
        }
        return this.f78939d;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f78945j.f78974a.clear();
    }

    public static final class a implements com.ss.android.sdk.webview.g<AbsActivityContainer> {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f78949a;

        static {
            Covode.recordClassIndex(48989);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, java.lang.Object, com.ss.android.ugc.aweme.crossplatform.activity.m] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.ss.android.sdk.webview.g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer a() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r3.f78949a
                com.ss.android.ugc.aweme.crossplatform.activity.m r2 = r0.f78940e
                r1 = 0
                if (r2 == 0) goto L_0x0011
                boolean r0 = r2 instanceof com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
                if (r0 == 0) goto L_0x0011
                java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer"
                java.util.Objects.requireNonNull(r2, r0)
                return r2
            L_0x0011:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.a.a():java.lang.Object");
        }

        a(CrossPlatformWebView crossPlatformWebView) {
            this.f78949a = crossPlatformWebView;
        }
    }

    public static final class f implements com.ss.android.ugc.aweme.crossplatform.platform.webview.f {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f78953a;

        /* renamed from: b */
        private View f78954b;

        static {
            Covode.recordClassIndex(48994);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.f
        public final void a(WebView webView, String str) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.f
        public final void a() {
            View view = this.f78954b;
            if (view != null) {
                this.f78953a.removeView(view);
                this.f78954b = null;
            }
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d iFullScreen = this.f78953a.getIFullScreen();
            if (iFullScreen != null) {
                iFullScreen.a();
            }
        }

        f(CrossPlatformWebView crossPlatformWebView) {
            this.f78953a = crossPlatformWebView;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.f
        public final void a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d iFullScreen = this.f78953a.getIFullScreen();
            if (iFullScreen == null || !iFullScreen.a(view)) {
                this.f78954b = view;
                if (view != null) {
                    this.f78953a.addView(view);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.f
        public final void a(WebView webView, int i2) {
            if (!l.a((Object) this.f78953a.f78943h, (Object) "about:blank")) {
                if (i2 == 100) {
                    LineProgressBarView lineProgressBarView = (LineProgressBarView) this.f78953a.a(R.id.d2u);
                    l.b(lineProgressBarView, "");
                    lineProgressBarView.setVisibility(8);
                    if (this.f78953a.getShouldShowProgressBarBg()) {
                        View a2 = this.f78953a.a(R.id.t0);
                        l.b(a2, "");
                        a2.setVisibility(8);
                        return;
                    }
                    return;
                }
                LineProgressBarView lineProgressBarView2 = (LineProgressBarView) this.f78953a.a(R.id.d2u);
                l.b(lineProgressBarView2, "");
                lineProgressBarView2.setProgress(i2);
            }
        }
    }

    private final View getCurrentContainer() {
        if (this.f78938c != 1) {
            return null;
        }
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        return singleWebView;
    }

    public final boolean b() {
        if (this.f78938c != 1) {
            return false;
        }
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        if (singleWebView.canGoBack()) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (this.o) {
            View a2 = a(R.id.t0);
            l.b(a2, "");
            a2.setVisibility(0);
        }
    }

    public Activity getActivity() {
        Context context = getContext();
        l.b(context, "");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            l.b(context, "");
        }
        return null;
    }

    public final AdWebStatBusiness getWebStatBusiness() {
        com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness;
        m mVar = this.f78940e;
        if (mVar == null || (crossPlatformBusiness = mVar.getCrossPlatformBusiness()) == null) {
            return null;
        }
        return (AdWebStatBusiness) crossPlatformBusiness.a(AdWebStatBusiness.class);
    }

    private final void i() {
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        singleWebView.addOnSingleWebViewStatus(new CrossPlatformWebView$initWebView$1(this));
        SingleWebView singleWebView2 = this.f78936a;
        if (singleWebView2 == null) {
            l.a("singleWebView");
        }
        singleWebView2.addOnWebChromeStatus(new f(this));
        ((LineProgressBarView) a(R.id.d2u)).setColor(androidx.core.content.b.c(getContext(), R.color.a2q));
    }

    public final void d() {
        ((DmtStatusView) a(R.id.ci9)).a(false);
        ((DmtStatusView) a(R.id.axu)).h();
        DmtStatusView dmtStatusView = (DmtStatusView) a(R.id.axu);
        l.b(dmtStatusView, "");
        dmtStatusView.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final void g() {
        if (this.f78938c == 2) {
            String str = this.f78943h;
            if (str == null) {
                com.ss.android.ugc.aweme.crossplatform.d.a.a aVar = this.f78942g;
                if (aVar == null) {
                    l.b();
                }
                l.d(aVar, "");
                l.b();
            }
            l.d(str, "");
            return;
        }
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        singleWebView.reload();
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public com.ss.android.ugc.aweme.crossplatform.business.g getCrossPlatformBusiness() {
        m mVar = this.f78940e;
        if (mVar != null) {
            com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness = mVar.getCrossPlatformBusiness();
            l.b(crossPlatformBusiness, "");
            return crossPlatformBusiness;
        }
        if (this.w == null) {
            this.w = g.a.a(this);
        }
        com.ss.android.ugc.aweme.crossplatform.business.g gVar = this.w;
        if (gVar == null) {
            l.b();
        }
        return gVar;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public String getCurrentUrl() {
        String str;
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams;
        com.ss.android.ugc.aweme.crossplatform.d.e eVar;
        String str2 = this.f78943h;
        if (str2 == null) {
            str2 = "";
        }
        if (p.a((CharSequence) str2, (CharSequence) "wallet/home", false)) {
            return this.f78943h;
        }
        if (this.f78938c == 2) {
            str = this.f78943h;
            if (str == null && ((crossPlatformParams = getCrossPlatformParams()) == null || (eVar = crossPlatformParams.f78743c) == null || (str = eVar.f78789j) == null)) {
                return "";
            }
        } else {
            SingleWebView singleWebView = this.f78936a;
            if (singleWebView == null) {
                l.a("singleWebView");
            }
            str = singleWebView.getUrl();
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    private final void f() {
        ((DmtStatusView) a(R.id.ci9)).setBuilder(DmtStatusView.a.a(getContext()));
        com.bytedance.ies.dmt.ui.widget.d dVar = new d.a(getContext()).a(2131232886).b(R.string.h2z).c(R.string.h2y).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, R.string.h35, new e(this)).f33648a;
        com.bytedance.ies.dmt.ui.widget.e eVar = new com.bytedance.ies.dmt.ui.widget.e(getContext());
        eVar.setStatus(dVar);
        if (com.bytedance.ies.dmt.ui.common.b.b(getContext())) {
            eVar.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
        } else {
            eVar.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.bx));
        }
        ((DmtStatusView) a(R.id.axu)).setBuilder(DmtStatusView.a.a(getContext()).c(eVar));
    }

    public final void setAdditionalReportParams(Map<String, String> map) {
        this.v = map;
    }

    public final void setCurrentMode(int i2) {
        this.f78938c = i2;
    }

    public final void setCustomWebViewStatus(com.ss.android.ugc.aweme.crossplatform.platform.webview.e eVar) {
        this.s = eVar;
    }

    public final void setDisplayed(boolean z2) {
        this.f78948m = z2;
    }

    public final void setIFullScreen(com.ss.android.ugc.aweme.crossplatform.platform.webview.d dVar) {
        this.r = dVar;
    }

    public final void setLoadRNViewCompleteTimestamp(long j2) {
        this.z = j2;
    }

    public final void setSearchEnterParam(com.ss.android.ugc.aweme.search.model.b bVar) {
        this.f78946k = bVar;
    }

    public final void setShouldShowProgressBarBg(boolean z2) {
        this.o = z2;
    }

    public static final class g implements e {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f78955a;

        static {
            Covode.recordClassIndex(48995);
        }

        g(CrossPlatformWebView crossPlatformWebView) {
            this.f78955a = crossPlatformWebView;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.e
        public final void a(com.ss.android.ugc.aweme.crossplatform.d.a.a aVar) {
            if (aVar != null) {
                l.d(aVar, "");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public void setFullScreen(com.ss.android.ugc.aweme.crossplatform.platform.webview.d dVar) {
        l.d(dVar, "");
        this.r = dVar;
    }

    public final void setSingleWebView(SingleWebView singleWebView) {
        l.d(singleWebView, "");
        this.f78936a = singleWebView;
    }

    public final void onJsBroadcastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        l.d(jVar, "");
        String str = jVar.f91310a;
        JSONObject jSONObject = jVar.f91311b;
        l.b(str, "");
        a(str, jSONObject);
    }

    public final void setWebViewTouchListener(View.OnTouchListener onTouchListener) {
        SingleWebView a2 = this.q.a();
        if (a2 != null) {
            a2.setWebviewTouchListener(onTouchListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public void setCrossPlatformActivityContainer(m mVar) {
        l.d(mVar, "");
        this.f78940e = mVar;
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        singleWebView.setCrossPlatformActivityContainer(mVar);
    }

    public final void setShouldOverrideInterceptor(h.f.a.m<? super WebView, ? super String, Boolean> mVar) {
        l.d(mVar, "");
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        singleWebView.setShouldOverrideInterceptor(mVar);
    }

    public static final class e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f78952a;

        static {
            Covode.recordClassIndex(48993);
        }

        e(CrossPlatformWebView crossPlatformWebView) {
            this.f78952a = crossPlatformWebView;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.crossplatform.d.f fVar;
            m mVar;
            ClickAgent.onClick(view);
            this.f78952a.getSingleWebView().reload();
            com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams = this.f78952a.getCrossPlatformParams();
            if (crossPlatformParams != null && (fVar = crossPlatformParams.f78744d) != null && fVar.t && (mVar = this.f78952a.f78940e) != null) {
                mVar.d();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public final void c(Activity activity) {
        l.d(activity, "");
        f.a.a().b(getCurrentContainer(), this.f78943h, 1);
        a("viewDisappeared", (JSONObject) null);
        a("invisible", (JSONObject) null);
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        singleWebView.contextPause();
        a("onPause");
    }

    public final void onEvent(com.ss.android.sdk.webview.b bVar) {
        String str;
        Activity activity;
        if (bVar != null && (str = bVar.f60179a) != null && str.length() != 0 && p.a(bVar.f60179a, getReactId(), true) && 1 != 0 && (activity = getActivity()) != null && (!activity.isFinishing())) {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public final void b(Activity activity) {
        int i2;
        l.d(activity, "");
        f.a.a().a(getCurrentContainer(), this.f78943h, 1);
        a("viewAppeared", (JSONObject) null);
        JSONObject jSONObject = new JSONObject();
        if (this.x) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        jSONObject.put("code", i2);
        a("visible", jSONObject);
        this.x = false;
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        singleWebView.contextResume();
        a("onResume");
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public void d(Activity activity) {
        f.a.a().b(getCurrentContainer(), this.f78943h, 2);
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        singleWebView.contextDestroy();
        a("onDestroy");
        k kVar = this.f78941f;
        if (kVar != null && kVar.f67659c) {
            d.a.a().b(kVar.bz_());
        }
        EventBus.a().b(this);
        com.ss.android.ugc.aweme.crossplatform.a aVar = this.f78947l;
        CrossPlatformWebView crossPlatformWebView = aVar.f78487b;
        l.d(aVar, "");
        crossPlatformWebView.f78937b.remove(aVar);
        EventBus.a().b(aVar);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public final <T extends i> T a(Class<T> cls) {
        l.d(cls, "");
        if (l.a(cls, e.class)) {
            e eVar = this.p;
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type T");
            return eVar;
        } else if (!l.a(cls, j.class)) {
            return new c();
        } else {
            j jVar = this.q;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type T");
            return jVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.a
    public final void a(Activity activity) {
        l.d(activity, "");
        a("onCreate");
    }

    public static final class d implements View.OnTouchListener {

        /* renamed from: a */
        public static final d f78951a = new d();

        static {
            Covode.recordClassIndex(48992);
        }

        d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            return true;
        }
    }

    private final Map<String, String> b(String str, Map<String, String> map) {
        com.ss.android.ugc.aweme.crossplatform.d.b bVar;
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams = getCrossPlatformParams();
        boolean z2 = true;
        if (!(crossPlatformParams == null || (bVar = crossPlatformParams.f78742b) == null || bVar.f78759a == 0 || !(!l.a((Object) str, (Object) "about:blank")))) {
            CWebViewInterceptor.f78851a = str;
            if (com.ss.android.ugc.aweme.ad.settings.a.a() && bVar.S) {
                SingleWebView singleWebView = this.f78936a;
                if (singleWebView == null) {
                    l.a("singleWebView");
                }
                WebSettings settings = singleWebView.getSettings();
                l.b(settings, "");
                String userAgentString = settings.getUserAgentString();
                l.b(userAgentString, "");
                String a2 = p.a(userAgentString, v.f30935b, "", false);
                SingleWebView singleWebView2 = this.f78936a;
                if (singleWebView2 == null) {
                    l.a("singleWebView");
                }
                WebSettings settings2 = singleWebView2.getSettings();
                l.b(settings2, "");
                com.a.a(settings2, a2);
            }
        }
        try {
            Boolean enableReferer = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getAdLandingPageConfig().getEnableReferer();
            l.b(enableReferer, "");
            z2 = enableReferer.booleanValue();
        } catch (Exception unused) {
        }
        if (!z2) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("referer", "https://www.tiktok.com");
        return linkedHashMap;
    }

    public final void a(int i2, int i3) {
        DmtStatusView dmtStatusView = (DmtStatusView) a(R.id.ci9);
        l.b(dmtStatusView, "");
        ViewGroup.LayoutParams layoutParams = dmtStatusView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        layoutParams2.topMargin = i3;
        layoutParams2.bottomMargin = 0;
        layoutParams2.gravity = i2;
        DmtStatusView dmtStatusView2 = (DmtStatusView) a(R.id.ci9);
        l.b(dmtStatusView2, "");
        dmtStatusView2.setLayoutParams(layoutParams2);
    }

    public final void a(Context context, boolean z2) {
        l.d(context, "");
        if (!com.ss.android.ugc.aweme.experiment.e.f89880b || !z2) {
            this.f78936a = new SingleWebView(context, null, 0, 6, null);
        } else {
            com.ss.android.ugc.aweme.crossplatform.activity.v a2 = com.ss.android.ugc.aweme.crossplatform.activity.v.a();
            l.b(a2, "");
            SingleWebView b2 = a2.b();
            if (b2 == null) {
                b2 = new SingleWebView(context, null, 0, 6, null);
            }
            this.f78936a = b2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        SingleWebView singleWebView = this.f78936a;
        if (singleWebView == null) {
            l.a("singleWebView");
        }
        singleWebView.setOverScrollMode(2);
        SingleWebView singleWebView2 = this.f78936a;
        if (singleWebView2 == null) {
            l.a("singleWebView");
        }
        singleWebView2.setVisibility(8);
        WebViewFrameLayout webViewFrameLayout = (WebViewFrameLayout) a(R.id.fma);
        SingleWebView singleWebView3 = this.f78936a;
        if (singleWebView3 == null) {
            l.a("singleWebView");
        }
        webViewFrameLayout.addView(singleWebView3, layoutParams);
        i();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrossPlatformWebView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    private static void a(JSONObject jSONObject, String str, Object obj) {
        if (!com.bytedance.common.utility.m.a(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void a(String str, boolean z2, Map<String, String> map) {
        boolean a2;
        boolean z3;
        AdWebStatBusiness webStatBusiness;
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar2;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar3;
        String str2;
        IAdLandPagePreloadService f2;
        com.ss.android.ugc.aweme.ad.preload.e a3;
        l.d(str, "");
        this.f78943h = str;
        com.ss.android.ugc.aweme.crossplatform.c.d a4 = d.a.a();
        boolean z4 = false;
        if (getParent() == null) {
            a2 = false;
        } else {
            a2 = a4.a(str);
        }
        this.f78941f = a4.a(a2);
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams2 = getCrossPlatformParams();
        if (!(crossPlatformParams2 == null || (bVar3 = crossPlatformParams2.f78742b) == null || (str2 = bVar3.u) == null || (f2 = AdLandPagePreloadServiceImpl.f()) == null || (a3 = f2.a()) == null)) {
            a3.b(str2);
        }
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams3 = getCrossPlatformParams();
        if (crossPlatformParams3 == null || (bVar2 = crossPlatformParams3.f78742b) == null || bVar2.f78759a != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        q.a().a(z3, str);
        if (z3 && (crossPlatformParams = getCrossPlatformParams()) != null && (bVar = crossPlatformParams.f78742b) != null && bVar.w == 4) {
            z4 = true;
        }
        com.ss.android.ugc.aweme.web.a.f144866l = z4;
        if (z3 && (webStatBusiness = getWebStatBusiness()) != null) {
            webStatBusiness.b(str);
        }
        if (z2) {
            a(Uri.parse(str).buildUpon().appendQueryParameter("reactId", getReactId()).toString(), map);
        } else {
            a(str, map);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CrossPlatformWebView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(12406);
        this.f78945j = new g();
        this.n = h.i.a((h.f.a.a) h.f78956a);
        this.f78937b = new HashSet();
        this.p = new g(this);
        this.q = new i(this);
        this.f78938c = 1;
        this.t = "RN_VIEW";
        com.ss.android.sdk.webview.c cVar = new com.ss.android.sdk.webview.c();
        this.u = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.qn});
        l.b(obtainStyledAttributes, "");
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        cVar.a(AbsActivityContainer.class, new a(this));
        cVar.a(k.class, new b(this));
        d.a.f78490a.a();
        com.a.a(getLayoutInflater(), R.layout.v_, this, true);
        EventBus.a(EventBus.a(), this);
        f();
        this.f78947l = new com.ss.android.ugc.aweme.crossplatform.a(this);
        getTimeStatisticsUtils().f78849a = System.currentTimeMillis();
        WebViewFrameLayout webViewFrameLayout = (WebViewFrameLayout) a(R.id.fma);
        l.b(webViewFrameLayout, "");
        if (webViewFrameLayout.getChildCount() == 0) {
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            l.b(mainLooper, "");
            if (l.a(currentThread, mainLooper.getThread())) {
                a(context, z2);
            }
        } else {
            View childAt = ((WebViewFrameLayout) a(R.id.fma)).getChildAt(0);
            if (childAt != null) {
                SingleWebView singleWebView = (SingleWebView) childAt;
                this.f78936a = singleWebView;
                if (singleWebView == null) {
                    l.a("singleWebView");
                }
                singleWebView.setOverScrollMode(2);
                SingleWebView singleWebView2 = this.f78936a;
                if (singleWebView2 == null) {
                    l.a("singleWebView");
                }
                singleWebView2.setVisibility(8);
                i();
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView");
                MethodCollector.o(12406);
                throw nullPointerException;
            }
        }
        this.z = -1;
        this.A = -1;
        this.B = new HashSet();
        MethodCollector.o(12406);
    }

    private static void a(String str, String str2, String str3, String str4) {
        l.d(str, "");
        r.a("crossplatform_view", new com.ss.android.ugc.aweme.app.f.d().a("platform", str2).a("status", str).a("module_name", str3).a("url", str4).f66730a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(CrossPlatformWebView crossPlatformWebView, String str, boolean z2, Map map, int i2) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            map = null;
        }
        crossPlatformWebView.a(str, z2, map);
    }
}
