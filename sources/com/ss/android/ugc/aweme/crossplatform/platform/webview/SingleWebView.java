package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge2.t;
import com.bytedance.ies.web.jsbridge2.x;
import com.ss.android.sdk.webview.e;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.ax.a.ae;
import com.ss.android.ugc.aweme.ax.a.s;
import com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService;
import com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.utils.bd;
import com.ss.android.ugc.aweme.commercialize.utils.bi;
import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.crossplatform.c.d;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.j;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.web.jsbridge.s;
import h.f.a.r;
import h.z;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

public final class SingleWebView extends n implements t, au, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    private SparseArray _$_findViewCache;
    private Map<String, String> additionReportParams;
    private com.ss.android.ugc.aweme.web.i baseJsMessageHandler;
    private boolean canScrollVertically;
    private final h.h chromeVersion$delegate;
    private com.ss.android.sdk.webview.c contextProviderFactory;
    private String curUrl;
    private boolean disableIntercept;
    private d[] disableInterceptRegionList;
    private boolean enableScrollControl;
    private final h.h gson$delegate;
    public com.ss.android.ugc.aweme.crossplatform.activity.m iCrossPlatformActivityContainer;
    public com.ss.android.sdk.webview.e iesJsBridge;
    private boolean isVastAd;
    private final h.h lastClickDetector$delegate;
    public long lastClickTime;
    private m mTTNetInterceptorWrapper;
    private com.ss.android.ugc.aweme.ax.a.k monitorSession;
    private boolean monitorSessionCreatedBySelf;
    private String pageCommitVisibleUrl;
    public String pageStartUrl;
    public List<String> pauseList;
    private com.ss.android.ugc.aweme.crossplatform.view.b scrollListener;
    private SingleWebChromeClient singleWebChromeClient;
    private j singleWebViewClient;
    private Set<String> visitedUrls;
    private View.OnTouchListener webviewTouchListener;

    static {
        Covode.recordClassIndex(48925);
    }

    public SingleWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static int com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2, Throwable th) {
        return 0;
    }

    private final com.google.gson.f getGson() {
        return (com.google.gson.f) this.gson$delegate.getValue();
    }

    private final GestureDetector getLastClickDetector() {
        return (GestureDetector) this.lastClickDetector$delegate.getValue();
    }

    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this._$_findViewCache;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new SparseArray();
        }
        View view = (View) this._$_findViewCache.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this._$_findViewCache.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.newmedia.e.a.d
    public final boolean canGoBack() {
        return com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack(this);
    }

    public final String getChromeVersion() {
        return (String) this.chromeVersion$delegate.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(349, new org.greenrobot.eventbus.g(SingleWebView.class, "onJsBroadcast", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.newmedia.e.a.d
    public final void goBack() {
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack(this);
    }

    @Override // com.ss.android.newmedia.e.a.d
    public final void loadUrl(String str) {
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(this, str);
    }

    @Override // com.ss.android.newmedia.e.a.d, android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(this, str, map);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
    }

    public final Map<String, String> getAdditionReportParams() {
        return this.additionReportParams;
    }

    public final com.ss.android.ugc.aweme.web.i getBaseJsMessageHandler() {
        return this.baseJsMessageHandler;
    }

    public final boolean getCanScrollVertically() {
        return this.canScrollVertically;
    }

    public final boolean getEnableScrollControl() {
        return this.enableScrollControl;
    }

    public final long getLastClickTime() {
        return this.lastClickTime;
    }

    public final com.ss.android.ugc.aweme.ax.a.k getMonitorSession() {
        return this.monitorSession;
    }

    public final boolean getMonitorSessionCreatedBySelf() {
        return this.monitorSessionCreatedBySelf;
    }

    @Override // com.bytedance.ies.web.jsbridge2.t
    public final String getSafeUrl() {
        return this.pageStartUrl;
    }

    public final SingleWebChromeClient getSingleWebChromeClient() {
        return this.singleWebChromeClient;
    }

    public final View.OnTouchListener getWebviewTouchListener() {
        return this.webviewTouchListener;
    }

    public static final class c implements com.ss.android.sdk.webview.g<com.ss.android.ugc.aweme.ax.a.k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleWebView f78866a;

        static {
            Covode.recordClassIndex(48931);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.sdk.webview.g
        public final /* synthetic */ com.ss.android.ugc.aweme.ax.a.k a() {
            return this.f78866a.getMonitorSession();
        }

        c(SingleWebView singleWebView) {
            this.f78866a = singleWebView;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<com.google.gson.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f78872a = new g();

        static {
            Covode.recordClassIndex(48935);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.google.gson.f invoke() {
            return new com.google.gson.f();
        }
    }

    public static final class k implements com.ss.android.sdk.webview.g<com.ss.android.ugc.aweme.ax.a.k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleWebView f78875a;

        static {
            Covode.recordClassIndex(48939);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.sdk.webview.g
        public final /* synthetic */ com.ss.android.ugc.aweme.ax.a.k a() {
            return this.f78875a.getMonitorSession();
        }

        k(SingleWebView singleWebView) {
            this.f78875a = singleWebView;
        }
    }

    public final boolean SingleWebView__canGoBack$___twin___() {
        return super.canGoBack();
    }

    public final void transparentBackground() {
        setBackgroundColor(0);
    }

    private final void addPageStartListener() {
        addOnSingleWebViewStatus(new e(this));
    }

    public final void SingleWebView__goBack$___twin___() {
        com.ss.android.ugc.aweme.crossplatform.c.a.a().p(this);
        super.goBack();
    }

    public final void destroy() {
        com.ss.android.ugc.aweme.crossplatform.c.a.a().l(this);
        super.destroy();
    }

    public final x getJsBridge2() {
        com.ss.android.sdk.webview.e eVar = this.iesJsBridge;
        if (eVar != null) {
            return eVar.f60187d;
        }
        return null;
    }

    @Override // com.ss.android.newmedia.e.a.d
    public final void reload() {
        com.ss.android.ugc.aweme.crossplatform.c.a.a().n(this);
        super.reload();
    }

    public final void setLoadNoCache() {
        WebSettings settings = getSettings();
        h.f.b.l.b(settings, "");
        settings.setCacheMode(2);
    }

    public static final class a implements com.ss.android.sdk.webview.g<AbsActivityContainer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleWebView f78864a;

        static {
            Covode.recordClassIndex(48929);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.sdk.webview.g
        public final /* synthetic */ AbsActivityContainer a() {
            com.ss.android.ugc.aweme.crossplatform.activity.m mVar = this.f78864a.iCrossPlatformActivityContainer;
            if (mVar == null || !(mVar instanceof AbsActivityContainer)) {
                return null;
            }
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer");
            return mVar;
        }

        a(SingleWebView singleWebView) {
            this.f78864a = singleWebView;
        }
    }

    public static final class b implements com.ss.android.sdk.webview.g<bi> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleWebView f78865a;

        static {
            Covode.recordClassIndex(48930);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.sdk.webview.g
        public final /* synthetic */ bi a() {
            com.ss.android.ugc.aweme.crossplatform.activity.m mVar = this.f78865a.iCrossPlatformActivityContainer;
            if (mVar == null || !(mVar instanceof bi)) {
                return null;
            }
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.utils.NoTitleBarWebViewContainer");
            return mVar;
        }

        b(SingleWebView singleWebView) {
            this.f78865a = singleWebView;
        }
    }

    public static final class d {
        @com.google.gson.a.c(a = "x")

        /* renamed from: a  reason: collision with root package name */
        public final double f78867a = Double.MIN_VALUE;
        @com.google.gson.a.c(a = "y")

        /* renamed from: b  reason: collision with root package name */
        public final double f78868b = Double.MIN_VALUE;
        @com.google.gson.a.c(a = "width")

        /* renamed from: c  reason: collision with root package name */
        public final double f78869c = Double.MAX_VALUE;
        @com.google.gson.a.c(a = "height")

        /* renamed from: d  reason: collision with root package name */
        public final double f78870d = Double.MAX_VALUE;

        static {
            Covode.recordClassIndex(48932);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Double.compare(this.f78867a, dVar.f78867a) == 0 && Double.compare(this.f78868b, dVar.f78868b) == 0 && Double.compare(this.f78869c, dVar.f78869c) == 0 && Double.compare(this.f78870d, dVar.f78870d) == 0;
        }

        public final int hashCode() {
            return (((((a(this.f78867a) * 31) + a(this.f78868b)) * 31) + a(this.f78869c)) * 31) + a(this.f78870d);
        }

        public final String toString() {
            return "DisableInterceptRegion(x=" + this.f78867a + ", y=" + this.f78868b + ", width=" + this.f78869c + ", height=" + this.f78870d + ")";
        }

        private d() {
        }

        private static int a(double d2) {
            long doubleToLongBits = Double.doubleToLongBits(d2);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
    }

    public static final class i implements com.ss.android.sdk.webview.g<AbsActivityContainer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleWebView f78873a;

        static {
            Covode.recordClassIndex(48937);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.sdk.webview.g
        public final /* synthetic */ AbsActivityContainer a() {
            com.ss.android.ugc.aweme.crossplatform.activity.m mVar = this.f78873a.iCrossPlatformActivityContainer;
            if (mVar == null || !(mVar instanceof AbsActivityContainer)) {
                return null;
            }
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer");
            return mVar;
        }

        i(SingleWebView singleWebView) {
            this.f78873a = singleWebView;
        }
    }

    public static final class j implements com.ss.android.sdk.webview.g<bi> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleWebView f78874a;

        static {
            Covode.recordClassIndex(48938);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.sdk.webview.g
        public final /* synthetic */ bi a() {
            com.ss.android.ugc.aweme.crossplatform.activity.m mVar = this.f78874a.iCrossPlatformActivityContainer;
            if (mVar == null || !(mVar instanceof bi)) {
                return null;
            }
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.utils.NoTitleBarWebViewContainer");
            return mVar;
        }

        j(SingleWebView singleWebView) {
            this.f78874a = singleWebView;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<GestureDetector> {
        final /* synthetic */ Context $context;
        final /* synthetic */ SingleWebView this$0;

        static {
            Covode.recordClassIndex(48943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(SingleWebView singleWebView, Context context) {
            super(0);
            this.this$0 = singleWebView;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GestureDetector invoke() {
            GestureDetector gestureDetector = new GestureDetector(this.$context, new GestureDetector.SimpleOnGestureListener(this) {
                /* class com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.o.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ o f78877a;

                static {
                    Covode.recordClassIndex(48944);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f78877a = r1;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    this.f78877a.this$0.lastClickTime = System.currentTimeMillis();
                    return super.onSingleTapUp(motionEvent);
                }
            });
            gestureDetector.setIsLongpressEnabled(true);
            return gestureDetector;
        }
    }

    private final void enableTTWebViewFullProcessLog() {
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar;
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar = this.iCrossPlatformActivityContainer;
        if (mVar != null && (crossPlatformParams = mVar.getCrossPlatformParams()) != null && (bVar = crossPlatformParams.f78742b) != null && bVar.s) {
            int i2 = Build.VERSION.SDK_INT;
            evaluateJavascript("ttwebview:/*enableTTLogEvent*/;", null);
        }
    }

    private final Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public final void contextDestroy() {
        this.baseJsMessageHandler.d();
        com.ss.android.newmedia.a.b.a(this);
        j jVar = this.singleWebViewClient;
        if (jVar != null) {
            com.ss.android.ugc.aweme.cw.g.c().execute(new j.b(jVar));
        }
    }

    public final void contextPause() {
        onPause();
        com.ss.android.newmedia.a.b.a(getContext(), this);
        if (getInPauseList() || this.isVastAd) {
            pauseTimers();
        }
    }

    @Override // com.ss.android.newmedia.e.a.d
    public final boolean hasClickInTimeInterval() {
        if (System.currentTimeMillis() - this.lastClickTime < ((long) getTimeInterval())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        com.ss.android.ugc.aweme.crossplatform.c.a.a().r(this);
        super.onAttachedToWindow();
        EventBus.a(EventBus.a(), this);
    }

    static final class f extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ SingleWebView this$0;

        static {
            Covode.recordClassIndex(48934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SingleWebView singleWebView) {
            super(0);
            this.this$0 = singleWebView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String str;
            com.ss.android.ugc.aweme.crossplatform.c.d a2 = d.a.a();
            SingleWebView singleWebView = this.this$0;
            h.f.b.l.d(singleWebView, "");
            WebSettings settings = singleWebView.getSettings();
            h.f.b.l.b(settings, "");
            String userAgentString = settings.getUserAgentString();
            h.m.l lVar = a2.f78702e;
            h.f.b.l.b(userAgentString, "");
            h.m.j find$default = h.m.l.find$default(lVar, userAgentString, 0, 2, null);
            if (find$default == null || find$default.d().size() < 2 || (str = find$default.d().get(1)) == null) {
                return "not_found";
            }
            return str;
        }
    }

    private final boolean getInPauseList() {
        h.l.h e2;
        List<String> list = this.pauseList;
        if (!(list == null || (e2 = h.l.k.e(h.a.n.t(list))) == null)) {
            Iterator a2 = e2.a();
            while (a2.hasNext()) {
                String str = (String) a2.next();
                String url = getUrl();
                if (url != null && h.m.p.b(url, str, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void initConfig() {
        com.ss.android.newmedia.e.a.a a2 = com.ss.android.newmedia.e.a.a.a(getContext());
        a2.f59953a = true;
        a2.a(this);
        setFocusableInTouchMode(true);
        setScrollBarStyle(0);
        CookieManager.getInstance().setAcceptCookie(true);
        WebSettings settings = getSettings();
        h.f.b.l.b(settings, "");
        settings.setCacheMode(getCacheMode());
        com.ss.android.ugc.aweme.ad.utils.a.a(new h(this));
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        com.ss.android.ugc.aweme.ax.a.k kVar;
        super.onDetachedFromWindow();
        EventBus.a().b(this);
        if (this.monitorSessionCreatedBySelf && (kVar = this.monitorSession) != null && kVar.f67659c) {
            d.a.a().b(kVar.bz_());
        }
    }

    private final int getCacheMode() {
        Intent intent;
        Activity activity = getActivity();
        List<String> list = null;
        String valueOf = String.valueOf((activity == null || (intent = activity.getIntent()) == null) ? null : intent.getData());
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d("WebViewCache", "uriString:".concat(String.valueOf(valueOf)));
        String decode = Uri.decode(valueOf);
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            h.f.b.l.b(iESSettingsProxy, "");
            list = iESSettingsProxy.getWebviewCacheUrls();
        } catch (Throwable unused) {
        }
        if (!(list == null || decode == null)) {
            for (String str : list) {
                if (h.m.p.a((CharSequence) decode, (CharSequence) str, false)) {
                    com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d("WebViewCache", "settings.cache mode:WebSettings.LOAD_NO_CACHE");
                    return 2;
                }
            }
        }
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d("WebViewCache", "cache mode:WebSettings.LOAD_DEFAULT");
        return -1;
    }

    private final boolean isAllowJsbMonitor() {
        Uri parse;
        String host;
        try {
            String str = this.curUrl;
            if (!(str == null || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
                d.a.a();
                HybridMonitorConfig a2 = com.ss.android.ugc.aweme.crossplatform.c.d.a();
                if (a2 != null) {
                    if (a2.getJsbHostAllowList().isEmpty()) {
                        return true;
                    }
                    for (String str2 : a2.getJsbHostAllowList()) {
                        h.f.b.l.b(host, "");
                        h.f.b.l.b(str2, "");
                        if (h.m.p.a((CharSequence) host, (CharSequence) str2, false)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void contextResume() {
        com.ss.android.sdk.webview.a.e eVar = this.baseJsMessageHandler.z;
        if (!TextUtils.isEmpty(eVar.f60171b)) {
            int i2 = 0;
            if (!TextUtils.isEmpty(eVar.f60170a) ? com.ss.android.sdk.webview.di.a.a().f60182a.isPlatformBinded(eVar.f60170a) : !(!com.ss.android.sdk.webview.di.a.a().f60182a.hasPlatformBinded() && !com.ss.android.sdk.webview.di.a.a().f60182a.isPlatformBinded(com.ss.android.sdk.webview.di.a.a().f60182a.getPlayNameMobile()))) {
                i2 = 1;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i2);
                if (eVar.f60172c != null) {
                    eVar.f60172c.a(eVar.f60171b, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
        eVar.f60171b = null;
        eVar.f60170a = null;
        onResume();
        resumeTimers();
    }

    public final void setAdditionReportParams(Map<String, String> map) {
        this.additionReportParams = map;
    }

    public final void setAdditionalReportParams(Map<String, String> map) {
        this.additionReportParams = map;
    }

    public final void setCanScrollVertically(boolean z) {
        this.canScrollVertically = z;
    }

    public final void setEnableScrollControl(boolean z) {
        this.enableScrollControl = z;
    }

    public final void setMonitorSession(com.ss.android.ugc.aweme.ax.a.k kVar) {
        this.monitorSession = kVar;
    }

    public final void setMonitorSessionCreatedBySelf(boolean z) {
        this.monitorSessionCreatedBySelf = z;
    }

    public final void setSingleWebChromeClient(SingleWebChromeClient singleWebChromeClient2) {
        this.singleWebChromeClient = singleWebChromeClient2;
    }

    public final void setWebScrollListener(com.ss.android.ugc.aweme.crossplatform.view.b bVar) {
        this.scrollListener = bVar;
    }

    public final void setWebviewTouchListener(View.OnTouchListener onTouchListener) {
        this.webviewTouchListener = onTouchListener;
    }

    public static final class e implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleWebView f78871a;

        static {
            Covode.recordClassIndex(48933);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final boolean b(WebView webView, String str) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void c(WebView webView, String str) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(SingleWebView singleWebView) {
            this.f78871a = singleWebView;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (Build.VERSION.SDK_INT >= 21 && com.ss.android.ugc.aweme.crossplatform.abtest.a.a() && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f78871a.pageStartUrl = "about:blank";
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str, Bitmap bitmap) {
            com.bytedance.sdk.xbridge.protocol.c.g b2;
            this.f78871a.pageStartUrl = str;
            if (str != null && (b2 = this.f78871a.iesJsBridge.b().b()) != null) {
                b2.a(str);
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, int i2, String str, String str2) {
            if (com.ss.android.ugc.aweme.crossplatform.abtest.a.a()) {
                this.f78871a.pageStartUrl = "about:blank";
            }
        }
    }

    public static final class n implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleWebView f78876a;

        static {
            Covode.recordClassIndex(48942);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(SingleWebView singleWebView) {
            this.f78876a = singleWebView;
        }

        public final void onViewAttachedToWindow(View view) {
            com.ss.android.ugc.aweme.ax.a.m mVar;
            h.f.b.l.d(view, "");
            com.ss.android.ugc.aweme.ax.a.k monitorSession = this.f78876a.getMonitorSession();
            if (monitorSession != null && (mVar = (com.ss.android.ugc.aweme.ax.a.m) monitorSession.a(com.ss.android.ugc.aweme.ax.a.m.class)) != null) {
                mVar.j();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            com.ss.android.ugc.aweme.ax.a.m mVar;
            h.f.b.l.d(view, "");
            com.ss.android.ugc.aweme.ax.a.k monitorSession = this.f78876a.getMonitorSession();
            if (!(monitorSession == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) monitorSession.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
                mVar.k();
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public final void setBaseJsMessageHandler(com.ss.android.ugc.aweme.web.i iVar) {
        h.f.b.l.d(iVar, "");
        this.baseJsMessageHandler = iVar;
    }

    public static boolean com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack(SingleWebView singleWebView) {
        if (!singleWebView.SingleWebView__canGoBack$___twin___() || !com.ss.android.ugc.tiktok.security.b.i.a(singleWebView)) {
            return false;
        }
        return true;
    }

    public static void com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack(SingleWebView singleWebView) {
        if (!com.ss.android.ugc.tiktok.security.b.i.b(singleWebView)) {
            singleWebView.SingleWebView__goBack$___twin___();
        }
    }

    public final void addOnSingleWebViewStatus(e eVar) {
        h.f.b.l.d(eVar, "");
        j jVar = this.singleWebViewClient;
        if (jVar != null) {
            jVar.f78889a.add(eVar);
        }
    }

    public final void addOnWebChromeStatus(f fVar) {
        h.f.b.l.d(fVar, "");
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 != null) {
            singleWebChromeClient2.f78859g.add(fVar);
        }
    }

    public final void controlGeolocationPermissions(boolean z) {
        this.baseJsMessageHandler.y = Boolean.valueOf(z);
    }

    public final boolean isVisited(String str) {
        h.f.b.l.d(str, "");
        return this.visitedUrls.contains(str);
    }

    public final void removeOnSingleWebViewStatus(e eVar) {
        h.f.b.l.d(eVar, "");
        j jVar = this.singleWebViewClient;
        if (jVar != null) {
            jVar.f78889a.remove(eVar);
        }
    }

    public final void removeOnWebChromeStatus(f fVar) {
        h.f.b.l.d(fVar, "");
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 != null) {
            singleWebChromeClient2.f78859g.remove(fVar);
        }
    }

    public final void setShouldOverrideInterceptor(h.f.a.m<? super WebView, ? super String, Boolean> mVar) {
        h.f.b.l.d(mVar, "");
        j jVar = this.singleWebViewClient;
        if (jVar != null) {
            jVar.f78890b = mVar;
        }
    }

    public final void setShouldOverrideUrlLoadingListener(h hVar) {
        h.f.b.l.d(hVar, "");
        j jVar = this.singleWebViewClient;
        if (jVar != null) {
            jVar.f78891c = hVar;
        }
    }

    public final void visit(String str) {
        h.f.b.l.d(str, "");
        this.visitedUrls.add(str);
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ad.e.a, z> {
        final /* synthetic */ SingleWebView this$0;

        static {
            Covode.recordClassIndex(48936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SingleWebView singleWebView) {
            super(1);
            this.this$0 = singleWebView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ad.e.a aVar) {
            com.ss.android.ugc.aweme.ad.e.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            this.this$0.setTimeInterval(aVar2.getAutoJumpInterval());
            this.this$0.pauseList = aVar2.getPauseList();
            return z.f158842a;
        }
    }

    public final boolean canScrollVertically(int i2) {
        if (!this.enableScrollControl) {
            return super.canScrollVertically(i2);
        }
        if (!this.canScrollVertically || !super.canScrollVertically(i2)) {
            return false;
        }
        return true;
    }

    public SingleWebView(Context context) {
        this(context, null, 0, 6, null);
        if (com.ss.android.ugc.tiktok.security.c.b.a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                com.a.a(settings, sb.toString());
            }
        }
    }

    private final String appendStatusBarHeightIfNeeded(String str) {
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("__status_bar");
            if (queryParameter == null || !h.f.b.l.a((Object) queryParameter, (Object) "true")) {
                return str;
            }
            String builder = parse.buildUpon().appendQueryParameter("status_bar_height", String.valueOf(com.bytedance.common.utility.n.c(com.bytedance.ies.ugc.appcontext.d.a(), ((float) com.bytedance.common.utility.n.e(com.bytedance.ies.ugc.appcontext.d.a())) + 0.0f))).toString();
            h.f.b.l.b(builder, "");
            return builder;
        } catch (Exception e2) {
            com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d("SingleWebView", "Append status_bar_height exception [" + e2.getMessage() + "] for url " + str);
            return str;
        }
    }

    public final void SingleWebView__loadUrl$___twin___(String str) {
        h.f.b.l.d(str, "");
        if (!TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.crossplatform.c.a.a().g(this, str);
            if (q.a(String.valueOf(str))) {
                m mVar = new m(String.valueOf(str));
                this.mTTNetInterceptorWrapper = mVar;
                j jVar = this.singleWebViewClient;
                if (jVar != null) {
                    jVar.f78894g = mVar;
                }
            }
            String beforeLoadUrl = beforeLoadUrl(str);
            r<? super WebView, ? super String, ? super Map<String, String>, ? super h.f.a.m<? super String, ? super Map<String, String>, z>, z> rVar = q.f78917b.f78921a;
            if (rVar != null) {
                rVar.a(this, beforeLoadUrl, null, new p(this, beforeLoadUrl));
            } else {
                super.loadUrl(beforeLoadUrl);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public final void onJsBroadcast(com.ss.android.ugc.aweme.fe.method.j jVar) {
        String str;
        h.f.b.l.d(jVar, "");
        com.google.gson.l a2 = com.google.gson.q.a(jVar.f91311b.toString());
        h.f.b.l.b(a2, "");
        com.google.gson.o j2 = a2.j();
        com.google.gson.l c2 = j2.c("eventName");
        if (c2 != null) {
            str = c2.c();
        } else {
            str = null;
        }
        if (h.f.b.l.a((Object) str, (Object) "disableIntercept")) {
            com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d("afpro", "got disableIntercept event");
            com.google.gson.l c3 = j2.c("data");
            if (c3 != null) {
                try {
                    this.disableInterceptRegionList = (d[]) getGson().a(c3, d[].class);
                    return;
                } catch (com.google.gson.t e2) {
                    com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d("afpro", "parse region failed", e2);
                }
            }
            this.disableInterceptRegionList = null;
        }
    }

    @Override // com.ss.android.newmedia.e.a.d
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        h.f.b.l.d(motionEvent, "");
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d("afpro", "webview touch ".concat(String.valueOf(motionEvent)));
        if (motionEvent.getActionMasked() == 0) {
            this.disableIntercept = false;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int b2 = com.ss.android.ugc.aweme.base.utils.n.b((double) (motionEvent.getRawX() - ((float) iArr[0])));
            int b3 = com.ss.android.ugc.aweme.base.utils.n.b((double) (motionEvent.getRawY() - ((float) iArr[1])));
            d[] dVarArr = this.disableInterceptRegionList;
            if (dVarArr != null) {
                int length = dVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    d dVar = dVarArr[i2];
                    double d2 = (double) b2;
                    if (d2 >= dVar.f78867a && d2 <= dVar.f78867a + dVar.f78869c) {
                        double d3 = (double) b3;
                        if (d3 >= dVar.f78868b && d3 <= dVar.f78868b + dVar.f78870d) {
                            z = true;
                            break;
                        }
                    }
                    i2++;
                }
                this.disableIntercept = z;
            }
            z = false;
            this.disableIntercept = z;
        }
        if (this.disableIntercept) {
            requestDisallowInterceptTouchEvent(true);
            com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d("afpro", "webview touch disable intercept");
        }
        if (this.canTouch) {
            getLastClickDetector().onTouchEvent(motionEvent);
            View.OnTouchListener onTouchListener = this.webviewTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
        }
        if (!this.enableScrollControl) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.canScrollVertically) {
            requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 2) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void initWeb(Activity activity) {
        h.f.b.l.d(activity, "");
        com.ss.android.ugc.aweme.ax.a.a.a.f67661m = SystemClock.uptimeMillis();
        this.lastClickTime = 0;
        this.contextProviderFactory = new com.ss.android.sdk.webview.c();
        this.baseJsMessageHandler = s.a(activity);
        this.iCrossPlatformActivityContainer = null;
        this.singleWebChromeClient = null;
        this.disableInterceptRegionList = null;
        this.pauseList = null;
        this.mTTNetInterceptorWrapper = null;
        this.visitedUrls = new LinkedHashSet();
        com.ss.android.sdk.webview.c cVar = this.contextProviderFactory;
        cVar.a(AbsActivityContainer.class, new i(this));
        cVar.a(bi.class, new j(this));
        cVar.a(com.ss.android.ugc.aweme.ax.a.k.class, new k(this));
        this.singleWebViewClient = new j();
        addPageStartListener();
        j jVar = this.singleWebViewClient;
        if (jVar == null) {
            h.f.b.l.b();
        }
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient(this, jVar);
        SingleWebChromeClient singleWebChromeClient2 = new SingleWebChromeClient(this);
        this.singleWebChromeClient = singleWebChromeClient2;
        singleWebChromeClient2.f78857e = this.baseJsMessageHandler;
        setWebChromeClient(this.singleWebChromeClient);
        boolean z = true;
        if (com.bytedance.ies.abmock.b.a().a(false, "use_injection_jsb", 1) != 1) {
            z = false;
        }
        com.ss.android.sdk.webview.e a2 = e.b.a(this);
        SingleWebChromeClient singleWebChromeClient3 = this.singleWebChromeClient;
        if (singleWebChromeClient3 == null) {
            h.f.b.l.b();
        }
        com.ss.android.sdk.webview.e a3 = a2.a(singleWebChromeClient3);
        j jVar2 = this.singleWebViewClient;
        if (jVar2 == null) {
            h.f.b.l.b();
        }
        com.ss.android.sdk.webview.e a4 = a3.a(jVar2);
        a4.f60191h = this.contextProviderFactory;
        com.ss.android.sdk.webview.e a5 = a4.a(this.baseJsMessageHandler);
        a5.f60188e = false;
        a5.f60189f = new g();
        a5.f60186c = z;
        com.ss.android.sdk.webview.e a6 = com.ss.android.sdk.webview.e.a(a5, null, false, new l(this), new m(this), 3);
        this.iesJsBridge = a6;
        this.baseJsMessageHandler.a(a6, this.contextProviderFactory);
        if (SettingsManager.a().a("jsb_open_third_app", false)) {
            this.iesJsBridge.a("openThirdApp", new com.ss.android.sdk.webview.a.h(new WeakReference(activity)));
        }
        j jVar3 = this.singleWebViewClient;
        if (jVar3 == null) {
            h.f.b.l.b();
        }
        jVar3.f35529d = this.iesJsBridge.f60185b;
        initConfig();
        addOnAttachStateChangeListener(new n(this));
    }

    public final void setCrossPlatformActivityContainer(com.ss.android.ugc.aweme.crossplatform.activity.m mVar) {
        String str;
        Long g2;
        boolean z;
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar2;
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams2;
        com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness;
        AdWebStatBusiness adWebStatBusiness;
        com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness2;
        AdWebStatBusiness adWebStatBusiness2;
        com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness3;
        AdWebStatBusiness adWebStatBusiness3;
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams3;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar3;
        boolean z2 = false;
        long j2 = 0;
        if (mVar != null) {
            this.iCrossPlatformActivityContainer = mVar;
            ILegacyCommercializeService l2 = LegacyCommercializeServiceImpl.l();
            h.f.b.l.b(l2, "");
            bd h2 = l2.h();
            IAwemeService b2 = AwemeService.b();
            com.ss.android.ugc.aweme.crossplatform.activity.m mVar2 = this.iCrossPlatformActivityContainer;
            if (mVar2 == null || (crossPlatformParams3 = mVar2.getCrossPlatformParams()) == null || (bVar3 = crossPlatformParams3.f78742b) == null) {
                str = null;
            } else {
                str = String.valueOf(bVar3.f78759a);
            }
            this.isVastAd = h2.a(b2.e(str));
            SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
            if (singleWebChromeClient2 != null) {
                singleWebChromeClient2.f78858f = mVar;
            }
            j jVar = this.singleWebViewClient;
            if (jVar != null) {
                jVar.f78897j = mVar;
                com.ss.android.ugc.aweme.web.k kVar = com.ss.android.ugc.aweme.web.k.f145061a;
                if (kVar != null) {
                    com.ss.android.sdk.webview.i a2 = jVar.a();
                    if (a2 != null) {
                        a2.b();
                    }
                    com.ss.android.ugc.aweme.crossplatform.activity.m mVar3 = jVar.f78897j;
                    if (!(mVar3 == null || (crossPlatformBusiness3 = mVar3.getCrossPlatformBusiness()) == null || (adWebStatBusiness3 = (AdWebStatBusiness) crossPlatformBusiness3.a(AdWebStatBusiness.class)) == null)) {
                        adWebStatBusiness3.a(jVar.a(), kVar);
                    }
                    com.ss.android.ugc.aweme.crossplatform.activity.m mVar4 = jVar.f78897j;
                    if (!(mVar4 == null || (crossPlatformBusiness2 = mVar4.getCrossPlatformBusiness()) == null || (adWebStatBusiness2 = (AdWebStatBusiness) crossPlatformBusiness2.a(AdWebStatBusiness.class)) == null)) {
                        adWebStatBusiness2.b(jVar.a(), kVar);
                    }
                    List<Pattern> b3 = com.ss.android.ugc.aweme.web.l.b();
                    com.ss.android.ugc.aweme.crossplatform.activity.m mVar5 = jVar.f78897j;
                    if (!(mVar5 == null || (crossPlatformBusiness = mVar5.getCrossPlatformBusiness()) == null || (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.a(AdWebStatBusiness.class)) == null)) {
                        adWebStatBusiness.a(b3);
                    }
                    com.ss.android.sdk.webview.h hVar = jVar.f78893f;
                    if (hVar != null) {
                        hVar.a(b3);
                    }
                }
                PassBackWebInfoBusiness b4 = jVar.b();
                if (b4 != null) {
                    com.ss.android.ugc.aweme.crossplatform.activity.m mVar6 = jVar.f78897j;
                    if (mVar6 == null || (crossPlatformParams2 = mVar6.getCrossPlatformParams()) == null) {
                        bVar2 = null;
                    } else {
                        bVar2 = crossPlatformParams2.f78742b;
                    }
                    b4.f78631m = bVar2;
                    try {
                        IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                        h.f.b.l.b(iESSettingsProxy, "");
                        b4.f78623a = iESSettingsProxy.getAdLandingPageConfig();
                        AdLandingPageConfig adLandingPageConfig = b4.f78623a;
                        if (adLandingPageConfig != null) {
                            Boolean adLandingPageReportWifiOnlyEnable = adLandingPageConfig.getAdLandingPageReportWifiOnlyEnable();
                            h.f.b.l.b(adLandingPageReportWifiOnlyEnable, "");
                            b4.f78624b = adLandingPageReportWifiOnlyEnable.booleanValue();
                            Integer adLandingPageReportPageCount = adLandingPageConfig.getAdLandingPageReportPageCount();
                            h.f.b.l.b(adLandingPageReportPageCount, "");
                            b4.f78625c = adLandingPageReportPageCount.intValue();
                            Integer adLandingPageReportLimitTimes = adLandingPageConfig.getAdLandingPageReportLimitTimes();
                            h.f.b.l.b(adLandingPageReportLimitTimes, "");
                            b4.f78626d = adLandingPageReportLimitTimes.intValue();
                            b4.f78627e = adLandingPageConfig.getAdLandingPageReportDelay();
                            String adLandingPageReportUrl = adLandingPageConfig.getAdLandingPageReportUrl();
                            if (adLandingPageReportUrl != null) {
                                b4.f78628f = adLandingPageReportUrl;
                            }
                            b4.f78629g = adLandingPageConfig.getAdLandingPageReportPacketKey();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                com.ss.android.ugc.aweme.crossplatform.activity.m mVar7 = jVar.f78897j;
                if (mVar7 == null || (crossPlatformParams = mVar7.getCrossPlatformParams()) == null || (bVar = crossPlatformParams.f78742b) == null || bVar.M <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                jVar.f78896i = z;
            }
            this.baseJsMessageHandler.a(mVar);
            com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams4 = mVar.getCrossPlatformParams();
            if (crossPlatformParams4 != null) {
                boolean z3 = crossPlatformParams4.f78741a.f78734g;
                int i2 = Build.VERSION.SDK_INT;
                try {
                    if (com.bytedance.ies.abmock.b.a().a(true, "enable_audio_auto_play_experiment", false)) {
                        WebSettings settings = getSettings();
                        h.f.b.l.b(settings, "");
                        if (!z3) {
                            z2 = true;
                        }
                        settings.setMediaPlaybackRequiresUserGesture(z2);
                    } else {
                        WebSettings settings2 = getSettings();
                        h.f.b.l.b(settings2, "");
                        settings2.setMediaPlaybackRequiresUserGesture(true);
                    }
                } catch (Exception unused) {
                    WebSettings settings3 = getSettings();
                    h.f.b.l.b(settings3, "");
                    settings3.setMediaPlaybackRequiresUserGesture(true);
                }
                this.baseJsMessageHandler.a(crossPlatformParams4.f78742b.f78759a, crossPlatformParams4.f78742b.f78760b, crossPlatformParams4.f78742b.f78761c, crossPlatformParams4.f78742b.f78767i, crossPlatformParams4.f78742b.f78763e, crossPlatformParams4.f78742b.F, crossPlatformParams4.f78742b.G, crossPlatformParams4.f78742b.R);
                this.baseJsMessageHandler.a(crossPlatformParams4.f78746f.f78772a, crossPlatformParams4.f78746f.f78773b, crossPlatformParams4.f78746f.f78774c, crossPlatformParams4.f78746f.f78775d, crossPlatformParams4.f78746f.f78776e, crossPlatformParams4.f78746f.f78777f, crossPlatformParams4.f78746f.f78778g);
                com.ss.android.ugc.aweme.web.i iVar = this.baseJsMessageHandler;
                String str2 = crossPlatformParams4.f78741a.f78732e;
                if (!(str2 == null || (g2 = h.m.p.g(str2)) == null)) {
                    j2 = g2.longValue();
                }
                iVar.n = j2;
                this.baseJsMessageHandler.f60164l = crossPlatformParams4.f78742b.f78765g;
                this.baseJsMessageHandler.f60165m = crossPlatformParams4.f78742b.f78764f;
                if (crossPlatformParams4.f78741a.f78739l) {
                    setLayerType(1, null);
                }
            }
        }
    }

    private final String beforeLoadUrl(String str) {
        com.ss.android.ugc.aweme.crossplatform.d.b bVar;
        long j2;
        int i2;
        String str2;
        com.ss.android.ugc.aweme.crossplatform.d.a.a aVar;
        String str3;
        com.ss.android.ugc.aweme.crossplatform.d.a.a aVar2;
        String str4;
        com.ss.android.ugc.aweme.crossplatform.d.a.a aVar3;
        String str5;
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar;
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar2;
        boolean z;
        boolean z2;
        long j3;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar3;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar4;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar5;
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams2;
        com.ss.android.ugc.aweme.ax.a.m mVar2;
        boolean z3;
        enableTTWebViewFullProcessLog();
        this.curUrl = str;
        com.ss.android.ugc.aweme.ax.a.k kVar = this.monitorSession;
        boolean z4 = true;
        int i3 = 0;
        if (kVar == null || !kVar.f67659c) {
            com.ss.android.ugc.aweme.crossplatform.c.d a2 = d.a.a();
            this.monitorSession = a2.a(a2.a(str));
            this.monitorSessionCreatedBySelf = true;
        } else {
            this.monitorSessionCreatedBySelf = false;
        }
        com.ss.android.ugc.aweme.ax.a.k kVar2 = this.monitorSession;
        if (!(kVar2 == null || (mVar2 = (com.ss.android.ugc.aweme.ax.a.m) kVar2.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
            d.a.a();
            HybridMonitorConfig a3 = com.ss.android.ugc.aweme.crossplatform.c.d.a();
            if (a3 != null) {
                try {
                    Boolean h5StaticResourceReportEnabled = a3.getH5StaticResourceReportEnabled();
                    h.f.b.l.b(h5StaticResourceReportEnabled, "");
                    z3 = h5StaticResourceReportEnabled.booleanValue();
                } catch (com.bytedance.ies.a unused) {
                    z3 = false;
                }
                mVar2.a(z3);
                List<String> h5StaticResourceReportAllowList = a3.getH5StaticResourceReportAllowList();
                if (h5StaticResourceReportAllowList == null) {
                    h5StaticResourceReportAllowList = Collections.emptyList();
                    h.f.b.l.b(h5StaticResourceReportAllowList, "");
                }
                mVar2.a(h5StaticResourceReportAllowList);
            }
        }
        com.ss.android.ugc.aweme.ax.a.k kVar3 = this.monitorSession;
        if (kVar3 != null) {
            String str6 = null;
            if (!kVar3.f67659c) {
                kVar3 = null;
            }
            if (kVar3 != null) {
                d.a.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, String> map = this.additionReportParams;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                com.ss.android.ugc.aweme.crossplatform.activity.m mVar3 = this.iCrossPlatformActivityContainer;
                if (mVar3 == null || (crossPlatformParams2 = mVar3.getCrossPlatformParams()) == null) {
                    bVar = null;
                } else {
                    bVar = crossPlatformParams2.f78742b;
                }
                if (bVar != null) {
                    j2 = bVar.f78759a;
                } else {
                    j2 = 0;
                }
                if (bVar != null) {
                    i2 = bVar.y;
                } else {
                    i2 = 0;
                }
                if (j2 <= 0) {
                    str2 = null;
                } else if (i2 == 1) {
                    str2 = "ad_floor_page";
                } else {
                    str2 = "ad";
                }
                if (str2 != null) {
                    linkedHashMap.put("package", str2);
                }
                com.ss.android.ugc.aweme.crossplatform.activity.m mVar4 = this.iCrossPlatformActivityContainer;
                if (mVar4 != null) {
                    aVar = mVar4.getCrossPlatformParams();
                } else {
                    aVar = null;
                }
                if (aVar == null || (bVar5 = aVar.f78742b) == null) {
                    str3 = null;
                } else {
                    str3 = bVar5.H;
                }
                if (str3 != null) {
                    linkedHashMap.put("enter_from", str3);
                }
                com.ss.android.ugc.aweme.crossplatform.activity.m mVar5 = this.iCrossPlatformActivityContainer;
                if (mVar5 != null) {
                    aVar2 = mVar5.getCrossPlatformParams();
                } else {
                    aVar2 = null;
                }
                if (aVar2 == null || (bVar4 = aVar2.f78742b) == null) {
                    str4 = null;
                } else {
                    str4 = bVar4.K;
                }
                if (str4 != null) {
                    linkedHashMap.put("challenge_id", str4);
                }
                com.ss.android.ugc.aweme.crossplatform.activity.m mVar6 = this.iCrossPlatformActivityContainer;
                if (mVar6 != null) {
                    aVar3 = mVar6.getCrossPlatformParams();
                } else {
                    aVar3 = null;
                }
                if (aVar3 == null || (bVar3 = aVar3.f78742b) == null) {
                    str5 = null;
                } else {
                    str5 = bVar3.L;
                }
                if (str5 != null) {
                    linkedHashMap.put("sticker_id", str5);
                }
                linkedHashMap.put("chrome_version", getChromeVersion());
                h.f.b.l.b("SystemWebView", "");
                linkedHashMap.put("webview_type", "SystemWebView");
                kVar3.a(ae.a(str), this, linkedHashMap);
                com.ss.android.ugc.aweme.ax.a.m mVar7 = (com.ss.android.ugc.aweme.ax.a.m) kVar3.a(com.ss.android.ugc.aweme.ax.a.m.class);
                if (!(mVar7 == null || (mVar = this.iCrossPlatformActivityContainer) == null || (crossPlatformParams = mVar.getCrossPlatformParams()) == null || (bVar2 = crossPlatformParams.f78742b) == null)) {
                    String str7 = bVar2.f78771m;
                    if (str7 == null || str7.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(!z)) {
                        bVar2 = null;
                    }
                    if (bVar2 != null) {
                        String str8 = bVar2.f78771m;
                        String str9 = bVar2.f78767i;
                        String str10 = bVar2.u;
                        int i4 = bVar2.x;
                        h.f.b.l.d(mVar7, "");
                        if (str8 == null || str8.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            mVar7.a("creative_id", str8);
                            mVar7.a("log_extra", str9);
                            mVar7.a("channel_name", str10);
                            if (AdLandPagePreloadServiceImpl.f() != null) {
                                h.f.b.l.b(b.a.f65586a, "");
                                com.ss.android.ugc.aweme.ad.b.c a4 = com.ss.android.ugc.aweme.ad.b.b.a();
                                if (a4 != null) {
                                    str6 = a4.b(str10, "feed");
                                }
                            }
                            if (!(str6 == null || str6.length() == 0)) {
                                z4 = false;
                            }
                            long j4 = -1;
                            if (!z4 && new File(str6).exists()) {
                                if (i4 != 0) {
                                    IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                                    Long g2 = h.m.p.g(str8);
                                    if (g2 != null) {
                                        j3 = g2.longValue();
                                    } else {
                                        j3 = 0;
                                    }
                                    j4 = f2.a(j3, System.currentTimeMillis());
                                }
                                i3 = j4 > 0 ? 3 : 2;
                            }
                            mVar7.a("preload_status", String.valueOf(i3));
                            mVar7.a("preload_webview_time", String.valueOf(j4));
                        }
                        mVar7.a(com.ss.android.ugc.aweme.commercialize.utils.j.f75776a);
                    }
                }
                j jVar = this.singleWebViewClient;
                if (jVar != null) {
                    jVar.f78895h = kVar3;
                }
                SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
                if (singleWebChromeClient2 != null) {
                    singleWebChromeClient2.f78860h = kVar3;
                }
            }
        }
        this.baseJsMessageHandler.a(this.monitorSession);
        String appendStatusBarHeightIfNeeded = appendStatusBarHeightIfNeeded(str);
        String a5 = CrossPlatformLegacyServiceImpl.f().a(appendStatusBarHeightIfNeeded);
        return a5 == null ? appendStatusBarHeightIfNeeded : a5;
    }

    public final void sendEventToWebView(String str, JSONObject jSONObject) {
        h.f.b.l.d(str, "");
        this.baseJsMessageHandler.a(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.m<String, e.a, z> {
        final /* synthetic */ SingleWebView this$0;

        static {
            Covode.recordClassIndex(48940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(SingleWebView singleWebView) {
            super(2);
            this.this$0 = singleWebView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, e.a aVar) {
            String str2 = str;
            e.a aVar2 = aVar;
            h.f.b.l.d(str2, "");
            h.f.b.l.d(aVar2, "");
            this.this$0.reportOnJsbInvoke(str2, aVar2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.m<String, Map<String, String>, z> {
        final /* synthetic */ String $loadUrl$inlined;
        final /* synthetic */ SingleWebView this$0;

        static {
            Covode.recordClassIndex(48945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(SingleWebView singleWebView, String str) {
            super(2);
            this.this$0 = singleWebView;
            this.$loadUrl$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            String str2 = str;
            Map<String, String> map2 = map;
            if (!TextUtils.isEmpty(str2) && map2 != null) {
                SingleWebView singleWebView = this.this$0;
                if (str2 == null) {
                    h.f.b.l.b();
                }
                SingleWebView.super.loadUrl(str2, map2);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.m<String, Map<String, String>, z> {
        final /* synthetic */ Map $additionalHttpHeaders$inlined;
        final /* synthetic */ String $loadUrl$inlined;
        final /* synthetic */ SingleWebView this$0;

        static {
            Covode.recordClassIndex(48946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(SingleWebView singleWebView, String str, Map map) {
            super(2);
            this.this$0 = singleWebView;
            this.$loadUrl$inlined = str;
            this.$additionalHttpHeaders$inlined = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            String str2 = str;
            Map<String, String> map2 = map;
            if (!TextUtils.isEmpty(str2) && map2 != null) {
                SingleWebView singleWebView = this.this$0;
                if (str2 == null) {
                    h.f.b.l.b();
                }
                SingleWebView.super.loadUrl(str2, map2);
            }
            return z.f158842a;
        }
    }

    public static void com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(SingleWebView singleWebView, String str) {
        String a2 = com.ss.android.ugc.tiktok.security.b.i.f149045a.a(singleWebView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        singleWebView.SingleWebView__loadUrl$___twin___(str);
    }

    public static void com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient(SingleWebView singleWebView, WebViewClient webViewClient) {
        if (com.ss.android.ugc.tiktok.security.c.b.a() && webViewClient != null) {
            WebSettings settings = singleWebView.getSettings();
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
        singleWebView.setWebViewClient(com.example.a.c.a(webViewClient));
    }

    public final void reportOnJsbInvoke(String str, e.a aVar) {
        com.ss.android.ugc.aweme.ax.a.k kVar;
        com.ss.android.ugc.aweme.ax.a.m mVar;
        if (isAllowJsbMonitor() && (kVar = this.monitorSession) != null && (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bridge_name", str);
            int i2 = i.f78886a[aVar.ordinal()];
            if (i2 == 1) {
                jSONObject.put("bridge_access", "public");
            } else if (i2 == 2) {
                jSONObject.put("bridge_access", "private");
            }
            s.a.a(mVar, "hybrid_app_monitor_bridge_invoke_event", "bridge_invoke", jSONObject);
        }
    }

    public final void SingleWebView__loadUrl$___twin___(String str, Map<String, String> map) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(map, "");
        if (!TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.crossplatform.c.a.a().g(this, str);
            if (q.a(String.valueOf(str))) {
                m mVar = new m(String.valueOf(str));
                this.mTTNetInterceptorWrapper = mVar;
                j jVar = this.singleWebViewClient;
                if (jVar != null) {
                    jVar.f78894g = mVar;
                }
            }
            String beforeLoadUrl = beforeLoadUrl(str);
            r<? super WebView, ? super String, ? super Map<String, String>, ? super h.f.a.m<? super String, ? super Map<String, String>, z>, z> rVar = q.f78917b.f78921a;
            if (rVar != null) {
                rVar.a(this, beforeLoadUrl, map, new q(this, beforeLoadUrl, map));
            } else {
                super.loadUrl(beforeLoadUrl, map);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.q<String, e.a, Integer, z> {
        final /* synthetic */ SingleWebView this$0;

        static {
            Covode.recordClassIndex(48941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(SingleWebView singleWebView) {
            super(3);
            this.this$0 = singleWebView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(String str, e.a aVar, Integer num) {
            String str2 = str;
            e.a aVar2 = aVar;
            int intValue = num.intValue();
            h.f.b.l.d(str2, "");
            h.f.b.l.d(aVar2, "");
            this.this$0.reportOnJsbReject(str2, aVar2, intValue);
            return z.f158842a;
        }
    }

    public static void com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(SingleWebView singleWebView, String str, Map map) {
        String a2 = com.ss.android.ugc.tiktok.security.b.i.f149045a.a(singleWebView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        singleWebView.SingleWebView__loadUrl$___twin___(str, map);
    }

    public final void reportOnJsbReject(String str, e.a aVar, int i2) {
        com.ss.android.ugc.aweme.ax.a.k kVar;
        com.ss.android.ugc.aweme.ax.a.m mVar;
        if (isAllowJsbMonitor() && (kVar = this.monitorSession) != null && (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bridge_name", str);
            int i3 = i.f78887b[aVar.ordinal()];
            if (i3 == 1) {
                jSONObject.put("bridge_access", "public");
            } else if (i3 == 2) {
                jSONObject.put("bridge_access", "private");
            }
            jSONObject.put("reason", String.valueOf(i2));
            s.a.a(mVar, "hybrid_app_monitor_bridge_invoke_event", "bridge_reject", jSONObject);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean z;
        h.f.b.l.d(context, "");
        this.contextProviderFactory = new com.ss.android.sdk.webview.c();
        this.baseJsMessageHandler = com.ss.android.ugc.aweme.web.jsbridge.s.a(context);
        this.gson$delegate = h.i.a((h.f.a.a) g.f78872a);
        this.visitedUrls = new LinkedHashSet();
        this.chromeVersion$delegate = h.i.a(h.m.NONE, new f(this));
        this.lastClickDetector$delegate = h.i.a((h.f.a.a) new o(this, context));
        com.ss.android.ugc.aweme.crossplatform.c.a.a().j(this);
        com.ss.android.ugc.aweme.ax.a.a.a.f67661m = SystemClock.uptimeMillis();
        com.ss.android.sdk.webview.c cVar = this.contextProviderFactory;
        cVar.a(AbsActivityContainer.class, new a(this));
        cVar.a(bi.class, new b(this));
        cVar.a(com.ss.android.ugc.aweme.ax.a.k.class, new c(this));
        this.singleWebViewClient = new j();
        addPageStartListener();
        j jVar = this.singleWebViewClient;
        if (jVar == null) {
            h.f.b.l.b();
        }
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient(this, jVar);
        SingleWebChromeClient singleWebChromeClient2 = new SingleWebChromeClient(this);
        this.singleWebChromeClient = singleWebChromeClient2;
        singleWebChromeClient2.f78857e = this.baseJsMessageHandler;
        setWebChromeClient(this.singleWebChromeClient);
        if (com.bytedance.ies.abmock.b.a().a(false, "use_injection_jsb", 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.sdk.webview.e a2 = e.b.a(this);
        SingleWebChromeClient singleWebChromeClient3 = this.singleWebChromeClient;
        if (singleWebChromeClient3 == null) {
            h.f.b.l.b();
        }
        com.ss.android.sdk.webview.e a3 = a2.a(singleWebChromeClient3);
        j jVar2 = this.singleWebViewClient;
        if (jVar2 == null) {
            h.f.b.l.b();
        }
        com.ss.android.sdk.webview.e a4 = a3.a(jVar2).a(this.baseJsMessageHandler);
        a4.f60191h = this.contextProviderFactory;
        a4.f60188e = false;
        a4.f60189f = new g();
        a4.f60186c = z;
        com.ss.android.sdk.webview.e a5 = com.ss.android.sdk.webview.e.a(a4, null, false, new h.f.a.m<String, e.a, z>(this) {
            /* class com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.AnonymousClass1 */
            final /* synthetic */ SingleWebView this$0;

            static {
                Covode.recordClassIndex(48926);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(String str, e.a aVar) {
                String str2 = str;
                e.a aVar2 = aVar;
                h.f.b.l.d(str2, "");
                h.f.b.l.d(aVar2, "");
                this.this$0.reportOnJsbInvoke(str2, aVar2);
                return z.f158842a;
            }
        }, new h.f.a.q<String, e.a, Integer, z>(this) {
            /* class com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.AnonymousClass2 */
            final /* synthetic */ SingleWebView this$0;

            static {
                Covode.recordClassIndex(48927);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ z invoke(String str, e.a aVar, Integer num) {
                String str2 = str;
                e.a aVar2 = aVar;
                int intValue = num.intValue();
                h.f.b.l.d(str2, "");
                h.f.b.l.d(aVar2, "");
                this.this$0.reportOnJsbReject(str2, aVar2, intValue);
                return z.f158842a;
            }
        }, 3);
        this.iesJsBridge = a5;
        this.baseJsMessageHandler.a(a5, this.contextProviderFactory);
        j jVar3 = this.singleWebViewClient;
        if (jVar3 == null) {
            h.f.b.l.b();
        }
        jVar3.f35529d = this.iesJsBridge.f60185b;
        initConfig();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SingleWebView f78863a;

            static {
                Covode.recordClassIndex(48928);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f78863a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                com.ss.android.ugc.aweme.ax.a.m mVar;
                h.f.b.l.d(view, "");
                com.ss.android.ugc.aweme.ax.a.k monitorSession = this.f78863a.getMonitorSession();
                if (monitorSession != null && (mVar = (com.ss.android.ugc.aweme.ax.a.m) monitorSession.a(com.ss.android.ugc.aweme.ax.a.m.class)) != null) {
                    mVar.j();
                }
            }

            public final void onViewDetachedFromWindow(View view) {
                com.ss.android.ugc.aweme.ax.a.m mVar;
                h.f.b.l.d(view, "");
                com.ss.android.ugc.aweme.ax.a.k monitorSession = this.f78863a.getMonitorSession();
                if (!(monitorSession == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) monitorSession.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
                    mVar.k();
                }
                view.removeOnAttachStateChangeListener(this);
            }
        });
        this.canScrollVertically = true;
        if (com.ss.android.ugc.tiktok.security.c.b.a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                com.a.a(settings, sb.toString());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setAdditionalReportParams$default(SingleWebView singleWebView, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = null;
        }
        singleWebView.setAdditionalReportParams(map);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_aweme_lancet_LogLancet_d("onScrollChanged", "l = " + i2 + "; t = " + i3 + "; oldl = " + i4 + ";oldt = " + i5);
        com.ss.android.ugc.aweme.crossplatform.view.b bVar = this.scrollListener;
        if (bVar != null) {
            bVar.a(i3, i5);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleWebView(Context context, AttributeSet attributeSet, int i2, int i3, h.f.b.g gVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
