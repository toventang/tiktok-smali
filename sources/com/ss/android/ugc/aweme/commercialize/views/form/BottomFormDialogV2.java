package com.ss.android.ugc.aweme.commercialize.views.form;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class BottomFormDialogV2 extends com.bytedance.ies.foundation.activity.a implements i, j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f76150c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Aweme f76151a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f76152b;

    /* renamed from: d  reason: collision with root package name */
    private CrossPlatformWebView f76153d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f76154e;

    /* renamed from: f  reason: collision with root package name */
    private final h f76155f = RouteArgExtension.INSTANCE.optionalArg(this, f.f76164a, "url", String.class);

    /* renamed from: g  reason: collision with root package name */
    private final h f76156g = RouteArgExtension.INSTANCE.optionalArg(this, c.f76161a, "click_from", Integer.class);

    /* renamed from: h  reason: collision with root package name */
    private final h f76157h = RouteArgExtension.INSTANCE.optionalArg(this, b.f76160a, "aweme_id", String.class);

    /* renamed from: i  reason: collision with root package name */
    private boolean f76158i;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f76159j;

    static {
        Covode.recordClassIndex(46963);
    }

    private final String b() {
        return (String) this.f76157h.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f76159j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f76159j == null) {
            this.f76159j = new SparseArray();
        }
        View view = (View) this.f76159j.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f76159j.put(i2, findViewById);
        return findViewById;
    }

    public final Integer a() {
        return (Integer) this.f76156g.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(221, new g(BottomFormDialogV2.class, "onEvent", com.ss.android.ugc.aweme.commercialize.event.c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46964);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            com.ss.android.ugc.aweme.common.f.e.a(this, currentFocus);
            currentFocus.clearFocus();
        }
        super.finish();
        overridePendingTransition(R.anim.bh, R.anim.bi);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        Integer a2;
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        if (!this.f76158i) {
            Integer a3 = a();
            AwemeRawAd awemeRawAd = null;
            if (a3 != null && a3.intValue() == 8) {
                Aweme aweme = this.f76151a;
                com.ss.android.ugc.aweme.commercialize.log.j.d(this, "click_cancel", aweme, com.ss.android.ugc.aweme.commercialize.log.j.a((Context) this, aweme, false, (Map<String, String>) null));
                Aweme aweme2 = this.f76151a;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click_call", awemeRawAd).c();
            } else {
                Integer a4 = a();
                if ((a4 != null && a4.intValue() == 2) || ((a2 = a()) != null && a2.intValue() == 10)) {
                    com.ss.android.ugc.aweme.commercialize.log.j.x(this, this.f76151a);
                    Aweme aweme3 = this.f76151a;
                    if (aweme3 != null) {
                        awemeRawAd = aweme3.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("feed_form", "click_cancel", awemeRawAd).c();
                }
            }
        }
        EventBus.a().b(this);
    }

    static final class b extends m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f76160a = new b();

        static {
            Covode.recordClassIndex(46965);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.crossplatform.platform.webview.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BottomFormDialogV2 f76163a;

        static {
            Covode.recordClassIndex(46968);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str) {
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
        e(BottomFormDialogV2 bottomFormDialogV2) {
            this.f76163a = bottomFormDialogV2;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Integer a2;
            Integer a3 = this.f76163a.a();
            AwemeRawAd awemeRawAd = null;
            if (a3 != null && a3.intValue() == 8) {
                BottomFormDialogV2 bottomFormDialogV2 = this.f76163a;
                com.ss.android.ugc.aweme.commercialize.log.j.u(bottomFormDialogV2, bottomFormDialogV2.f76151a);
                Aweme aweme = this.f76163a.f76151a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "load_fail", awemeRawAd).c();
                return;
            }
            Integer a4 = this.f76163a.a();
            if ((a4 != null && a4.intValue() == 2) || ((a2 = this.f76163a.a()) != null && a2.intValue() == 10)) {
                BottomFormDialogV2 bottomFormDialogV22 = this.f76163a;
                com.ss.android.ugc.aweme.commercialize.log.j.y(bottomFormDialogV22, bottomFormDialogV22.f76151a);
                Aweme aweme2 = this.f76163a.f76151a;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("feed_form", "load_fail", awemeRawAd).c();
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            Integer a2;
            if (!this.f76163a.f76152b) {
                Integer a3 = this.f76163a.a();
                AwemeRawAd awemeRawAd = null;
                if (a3 != null && a3.intValue() == 8) {
                    BottomFormDialogV2 bottomFormDialogV2 = this.f76163a;
                    com.ss.android.ugc.aweme.commercialize.log.j.u(bottomFormDialogV2, bottomFormDialogV2.f76151a);
                    Aweme aweme = this.f76163a.f76151a;
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "load_fail", awemeRawAd).c();
                    this.f76163a.f76152b = true;
                    return;
                }
                Integer a4 = this.f76163a.a();
                if ((a4 != null && a4.intValue() == 2) || ((a2 = this.f76163a.a()) != null && a2.intValue() == 10)) {
                    BottomFormDialogV2 bottomFormDialogV22 = this.f76163a;
                    com.ss.android.ugc.aweme.commercialize.log.j.y(bottomFormDialogV22, bottomFormDialogV22.f76151a);
                    Aweme aweme2 = this.f76163a.f76151a;
                    if (aweme2 != null) {
                        awemeRawAd = aweme2.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("feed_form", "load_fail", awemeRawAd).c();
                    this.f76163a.f76152b = true;
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, int i2, String str, String str2) {
            Integer a2;
            Integer a3 = this.f76163a.a();
            AwemeRawAd awemeRawAd = null;
            if (a3 != null && a3.intValue() == 8) {
                BottomFormDialogV2 bottomFormDialogV2 = this.f76163a;
                com.ss.android.ugc.aweme.commercialize.log.j.u(bottomFormDialogV2, bottomFormDialogV2.f76151a);
                Aweme aweme = this.f76163a.f76151a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "load_fail", awemeRawAd).c();
                return;
            }
            Integer a4 = this.f76163a.a();
            if ((a4 != null && a4.intValue() == 2) || ((a2 = this.f76163a.a()) != null && a2.intValue() == 10)) {
                BottomFormDialogV2 bottomFormDialogV22 = this.f76163a;
                com.ss.android.ugc.aweme.commercialize.log.j.y(bottomFormDialogV22, bottomFormDialogV22.f76151a);
                Aweme aweme2 = this.f76163a.f76151a;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("feed_form", "load_fail", awemeRawAd).c();
            }
        }
    }

    static final class f extends m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f76164a = new f();

        static {
            Covode.recordClassIndex(46969);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class c extends m implements h.f.a.b<Boolean, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f76161a = new c();

        static {
            Covode.recordClassIndex(46966);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 0;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BottomFormDialogV2 f76162a;

        static {
            Covode.recordClassIndex(46967);
        }

        d(BottomFormDialogV2 bottomFormDialogV2) {
            this.f76162a = bottomFormDialogV2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76162a.finish();
        }
    }

    public final void dismiss(View view) {
        l.d(view, "");
        finish();
    }

    @r
    public final void onEvent(com.ss.android.ugc.aweme.commercialize.event.c cVar) {
        l.d(cVar, "");
        new com.bytedance.tux.g.b(this).a().a(getString(R.string.ga3)).b();
        this.f76158i = true;
        finish();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        Aweme b2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.b2);
        getWindow().setSoftInputMode(19);
        EventBus.a(EventBus.a(), this);
        if (a(getIntent()) != null) {
            if (AwemeService.b().d(b()) != null) {
                b2 = AwemeService.b().d(b());
            } else {
                b2 = AwemeService.b().b(b());
            }
            this.f76151a = b2;
        }
        View findViewById = findViewById(R.id.fm8);
        String str = "";
        l.b(findViewById, str);
        this.f76153d = (CrossPlatformWebView) findViewById;
        View findViewById2 = findViewById(R.id.a7h);
        l.b(findViewById2, str);
        ImageView imageView = (ImageView) findViewById2;
        this.f76154e = imageView;
        if (imageView == null) {
            l.a("mCloseBtn");
        }
        imageView.setOnClickListener(new d(this));
        e eVar = new e(this);
        CrossPlatformWebView crossPlatformWebView = this.f76153d;
        if (crossPlatformWebView == null) {
            l.a("mWebView");
        }
        CommercializeWebViewHelper.a(crossPlatformWebView, eVar, this, this, a(getIntent()));
        CrossPlatformWebView crossPlatformWebView2 = this.f76153d;
        if (crossPlatformWebView2 == null) {
            l.a("mWebView");
        }
        SingleWebView a2 = ((com.ss.android.ugc.aweme.crossplatform.view.j) crossPlatformWebView2.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a();
        l.b(a2, str);
        WebSettings settings = a2.getSettings();
        l.b(settings, str);
        com.a.a(settings, settings.getUserAgentString() + "/RevealType/Dialog");
        a2.setLayerType(1, null);
        CrossPlatformWebView crossPlatformWebView3 = this.f76153d;
        if (crossPlatformWebView3 == null) {
            l.a("mWebView");
        }
        String str2 = (String) this.f76155f.getValue();
        if (str2 != null) {
            str = str2;
        }
        CrossPlatformWebView.a(crossPlatformWebView3, str, false, null, 6);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onCreate", false);
    }
}
