package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.gyf.barlibrary.ImmersionBar;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.ax.a.q;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.crossplatform.b.c;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.OpenUrlHintBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.WalletBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.g;
import com.ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy;
import com.ss.android.ugc.aweme.crossplatform.c.d;
import com.ss.android.ugc.aweme.crossplatform.d.a.b;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.d;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.e;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar;
import com.ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout;
import com.ss.android.ugc.aweme.crossplatform.view.f;
import com.ss.android.ugc.aweme.fe.method.CloseMethod;
import com.ss.android.ugc.aweme.fe.method.GetWebViewInfo;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ez;
import com.ss.android.ugc.aweme.utils.hg;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import f.a.t;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONException;
import org.json.JSONObject;

public class MixActivityContainer extends AbsActivityContainer implements au, f, i, j {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f78505a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.crossplatform.d.a.a f78506b;

    /* renamed from: c  reason: collision with root package name */
    Bundle f78507c;

    /* renamed from: d  reason: collision with root package name */
    protected final g f78508d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.crossplatform.view.a f78509e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f78510f;

    /* renamed from: g  reason: collision with root package name */
    public e f78511g;

    /* renamed from: h  reason: collision with root package name */
    long f78512h = -1;

    /* renamed from: i  reason: collision with root package name */
    b f78513i = null;

    /* renamed from: j  reason: collision with root package name */
    f.a.g.b f78514j = new f.a.g.b<Boolean>() {
        /* class com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer.AnonymousClass1 */

        static {
            Covode.recordClassIndex(48764);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
        }

        @Override // f.a.z
        public final /* synthetic */ void onNext(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("appEnterBackgroundEvent", System.currentTimeMillis(), null));
            } else {
                com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("appEnterForegroundEvent", System.currentTimeMillis(), null));
            }
        }
    };

    /* renamed from: k  reason: collision with root package name */
    OpenURLHintLayout f78515k;

    /* renamed from: l  reason: collision with root package name */
    public String f78516l;

    /* renamed from: m  reason: collision with root package name */
    public s f78517m;
    public CrossPlatformTitleBar n;
    public Space o;
    boolean p = false;
    private k q;
    private e r;
    private String s;
    private long t;
    private boolean u;
    private f.a.b.a v = new f.a.b.a();
    private ImmersionBar w;
    private GradualChangeLinearLayout x;
    private long y;
    private final Set<com.ss.android.ugc.aweme.base.a.b> z = new HashSet();

    static {
        Covode.recordClassIndex(48763);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(40, new org.greenrobot.eventbus.g(MixActivityContainer.class, "onEvent", c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new org.greenrobot.eventbus.g(MixActivityContainer.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(207, new org.greenrobot.eventbus.g(MixActivityContainer.class, "onEvent", CloseMethod.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(208, new org.greenrobot.eventbus.g(MixActivityContainer.class, "onEvent", GetWebViewInfo.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(209, new org.greenrobot.eventbus.g(MixActivityContainer.class, "invokeRenderTimeEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(27, new org.greenrobot.eventbus.g(MixActivityContainer.class, "onEvent", com.bytedance.android.livesdkapi.n.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(210, new org.greenrobot.eventbus.g(MixActivityContainer.class, "onEvent", com.ss.android.ugc.aweme.crossplatform.b.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void n() {
    }

    /* access modifiers changed from: protected */
    public void o() {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
        this.u = false;
    }

    /* access modifiers changed from: protected */
    public void p() {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.f
    public void q() {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final e e() {
        return this.r;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final com.ss.android.ugc.aweme.crossplatform.view.a f() {
        return this.f78509e;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public /* bridge */ /* synthetic */ Context getContext() {
        return this.f78505a;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final g getCrossPlatformBusiness() {
        return this.f78508d;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final com.ss.android.ugc.aweme.crossplatform.d.a.a getCrossPlatformParams() {
        return this.f78506b;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final void g() {
        this.f78509e.g();
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final boolean h() {
        return this.f78509e.h();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void i() {
        this.f78509e.c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void j() {
        com.ss.android.ugc.aweme.push.a.a(this.f78505a);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void l() {
        this.f78505a.finish();
    }

    private void E() {
        this.q = new k(this.f78505a, this);
    }

    private void I() {
        this.f78509e.setFullScreen(new d() {
            /* class com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer.AnonymousClass4 */

            /* renamed from: b  reason: collision with root package name */
            private int f78522b = 1;

            static {
                Covode.recordClassIndex(48767);
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.d
            public final void a() {
                MethodCollector.i(12645);
                MixActivityContainer mixActivityContainer = MixActivityContainer.this;
                if (!mixActivityContainer.f78506b.f78744d.p) {
                    mixActivityContainer.n.setVisibility(0);
                    mixActivityContainer.x();
                } else if (!mixActivityContainer.getCrossPlatformParams().f78744d.t) {
                    mixActivityContainer.n.setVisibility(0);
                    mixActivityContainer.o.setVisibility(0);
                }
                if (MixActivityContainer.this.f78505a != null) {
                    if (MixActivityContainer.this.f78505a.getRequestedOrientation() != this.f78522b) {
                        MixActivityContainer.this.f78505a.setRequestedOrientation(this.f78522b);
                        if (!com.ss.android.ugc.aweme.crossplatform.a.a.a(MixActivityContainer.this.f78506b, MixActivityContainer.this.f78505a)) {
                            MixActivityContainer.this.f78505a.getWindow().clearFlags(1024);
                        } else {
                            MixActivityContainer.this.c();
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) MixActivityContainer.this.f78505a.findViewById(R.id.fm_);
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                        viewGroup.setVisibility(8);
                    }
                }
                MethodCollector.o(12645);
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.d
            public final boolean a(View view) {
                MethodCollector.i(12548);
                MixActivityContainer.this.d();
                if (MixActivityContainer.this.f78505a == null || view == null || !MixActivityContainer.this.f78506b.f78744d.F) {
                    MethodCollector.o(12548);
                    return false;
                }
                this.f78522b = MixActivityContainer.this.f78505a.getRequestedOrientation();
                int i2 = Build.VERSION.SDK_INT;
                MixActivityContainer.this.f78505a.setRequestedOrientation(11);
                hh.a(MixActivityContainer.this.f78505a);
                ViewGroup viewGroup = (ViewGroup) MixActivityContainer.this.f78505a.findViewById(R.id.fm_);
                if (viewGroup == null) {
                    viewGroup = new FrameLayout(MixActivityContainer.this.f78505a);
                    viewGroup.setId(R.id.fm_);
                    MixActivityContainer.this.f78505a.addContentView(viewGroup, new ViewGroup.LayoutParams(-1, -1));
                }
                viewGroup.setVisibility(0);
                viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
                MethodCollector.o(12548);
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void d() {
        this.n.setVisibility(8);
        this.o.setVisibility(8);
    }

    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        this.t = System.currentTimeMillis();
        EventBus.a(EventBus.a(), this);
    }

    public final boolean s() {
        if (!TextUtils.isEmpty(this.f78506b.f78741a.o)) {
            return true;
        }
        return false;
    }

    public final ReportBusinessProxy t() {
        return (ReportBusinessProxy) this.f78508d.a(ReportBusinessProxy.class);
    }

    public final void y() {
        if (!this.f78509e.a()) {
            K();
        }
    }

    private void G() {
        if (getCrossPlatformParams().f78744d.f78805m) {
            this.f78517m.a("copylink");
        }
    }

    private void K() {
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        dVar.a("method", this.f78516l);
        r.a("h5_leave_detail", dVar.f66730a);
        Runnable runnable = this.f78510f;
        if (runnable != null) {
            runnable.run();
        }
    }

    private static boolean L() {
        try {
            return com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getAdLandingPageConfig().getEnableDynamicNavbar().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    public final int r() {
        WebBackForwardList copyBackForwardList;
        WebView w2 = w();
        if (w2 == null || (copyBackForwardList = w2.copyBackForwardList()) == null) {
            return 1;
        }
        return 1 + copyBackForwardList.getCurrentIndex();
    }

    public final WebView w() {
        com.ss.android.ugc.aweme.crossplatform.view.j jVar;
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = this.f78509e;
        if (aVar == null || (jVar = (com.ss.android.ugc.aweme.crossplatform.view.j) aVar.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)) == null) {
            return null;
        }
        return jVar.a();
    }

    private void C() {
        this.r = new e() {
            /* class com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer.AnonymousClass2 */

            static {
                Covode.recordClassIndex(48765);
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
            public final void c(WebView webView, String str) {
                if (MixActivityContainer.this.f78511g != null) {
                    MixActivityContainer.this.f78511g.c(webView, str);
                }
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
            public final boolean b(WebView webView, String str) {
                if (MixActivityContainer.this.f78511g != null) {
                    return MixActivityContainer.this.f78511g.b(webView, str);
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
            public final void a(WebView webView, String str) {
                if (MixActivityContainer.this.f78511g != null) {
                    MixActivityContainer.this.f78511g.a(webView, str);
                }
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                if (MixActivityContainer.this.f78511g != null) {
                    MixActivityContainer.this.f78511g.a(webView, sslErrorHandler, sslError);
                }
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
            public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (MixActivityContainer.this.f78511g != null) {
                    MixActivityContainer.this.f78511g.a(webView, webResourceRequest, webResourceResponse);
                }
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
            public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame() && MixActivityContainer.this.getCrossPlatformParams().f78744d.t) {
                    if (!MixActivityContainer.this.f78506b.f78744d.p) {
                        MixActivityContainer.this.x();
                        return;
                    } else {
                        MixActivityContainer.this.n.setVisibility(0);
                        MixActivityContainer.this.o.setVisibility(0);
                    }
                }
                if (MixActivityContainer.this.f78511g != null) {
                    MixActivityContainer.this.f78511g.a(webView, webResourceRequest, webResourceError);
                }
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
            public final void a(WebView webView, String str, Bitmap bitmap) {
                if (MixActivityContainer.this.f78511g != null) {
                    MixActivityContainer.this.f78511g.a(webView, str, bitmap);
                }
                if (MixActivityContainer.this.s()) {
                    ReportBusinessProxy t = MixActivityContainer.this.t();
                    if (t.f78682b.longValue() == -1) {
                        t.f78682b = Long.valueOf(System.currentTimeMillis());
                    }
                    int i2 = MixActivityContainer.this.f78506b.f78741a.p;
                    if (i2 <= 0) {
                        return;
                    }
                    if (MixActivityContainer.this.r() <= i2) {
                        MixActivityContainer.this.n.a(true);
                    } else {
                        MixActivityContainer.this.n.a(false);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
            public final void a(WebView webView, int i2, String str, String str2) {
                if (MixActivityContainer.this.getCrossPlatformParams().f78744d.t) {
                    if (!MixActivityContainer.this.f78506b.f78744d.p) {
                        MixActivityContainer.this.x();
                        return;
                    } else {
                        MixActivityContainer.this.n.setVisibility(0);
                        MixActivityContainer.this.o.setVisibility(0);
                    }
                }
                if (MixActivityContainer.this.f78511g != null) {
                    MixActivityContainer.this.f78511g.a(webView, i2, str, str2);
                }
            }
        };
        if (TextUtils.equals("1", this.f78506b.f78745e.f78806a)) {
            ((com.ss.android.ugc.aweme.crossplatform.view.j) this.f78509e.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a().setLoadNoCache();
        }
    }

    private void F() {
        this.n = (CrossPlatformTitleBar) a(R.id.ahd);
        this.o = (Space) a(R.id.csm);
        this.n.setCrossPlatformParams(getCrossPlatformParams());
        this.n.setTitleWrap(new CrossPlatformTitleBar.a() {
            /* class com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer.AnonymousClass3 */

            static {
                Covode.recordClassIndex(48766);
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
            public final void d() {
                MixActivityContainer.this.n();
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
            public final void a() {
                MixActivityContainer.this.f78516l = "click_button";
                MixActivityContainer.this.y();
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
            public final void e() {
                if (MixActivityContainer.this.f78510f != null) {
                    MixActivityContainer.this.f78510f.run();
                }
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
            public final void b() {
                ((ReportBusinessProxy) MixActivityContainer.this.f78508d.a(ReportBusinessProxy.class)).a(MixActivityContainer.this.f78505a);
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
            public final void c() {
                WebView w = MixActivityContainer.this.w();
                if (w != null) {
                    ((ReportBusinessProxy) MixActivityContainer.this.f78508d.a(ReportBusinessProxy.class)).a(MixActivityContainer.this.f78505a, w.getUrl(), MixActivityContainer.this.r());
                }
            }

            @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.a
            public final void a(View view) {
                boolean z;
                s sVar = MixActivityContainer.this.f78517m;
                if (sVar.f78566d == null || sVar.f78566d.isEmpty()) {
                    sVar.f78563a.setVisibility(0);
                    sVar.f78564b.setVisibility(0);
                    sVar.f78565c.setVisibility(0);
                } else {
                    if (sVar.f78566d.contains(Integer.valueOf(com.ss.android.ugc.aweme.crossplatform.d.a.c.refresh.id))) {
                        o.a(sVar.f78563a, 8);
                        z = false;
                    } else {
                        o.a(sVar.f78563a, 0);
                        z = true;
                    }
                    if (sVar.f78566d.contains(Integer.valueOf(com.ss.android.ugc.aweme.crossplatform.d.a.c.copylink.id))) {
                        sVar.f78564b.setVisibility(8);
                    } else {
                        sVar.f78564b.setVisibility(0);
                        z = true;
                    }
                    if (sVar.f78566d.contains(Integer.valueOf(com.ss.android.ugc.aweme.crossplatform.d.a.c.openwithbrowser.id))) {
                        sVar.f78565c.setVisibility(8);
                        if (!z) {
                            return;
                        }
                    } else {
                        sVar.f78565c.setVisibility(0);
                    }
                }
                MixActivityContainer.this.f78517m.a().showAsDropDown(view, 0, -12);
            }
        });
        this.n.post(new o(this));
    }

    private void J() {
        this.s = "3";
        if (getCrossPlatformParams().f78744d.t) {
            d();
            return;
        }
        ((GradualChangeLinearLayout) a(R.id.cfg)).setGradualChangeMode(false);
        this.o.setVisibility(0);
        this.n.b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void b() {
        Runnable runnable;
        if (getCrossPlatformParams().f78741a.f78728a.intValue() == 1) {
            this.f78516l = "phone_press";
            y();
        } else if (!this.f78509e.a() && (runnable = this.f78510f) != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void k() {
        B();
        this.f78509e.a(this.f78505a);
        H();
        Bundle bundle = this.f78507c;
        if (bundle != null && bundle.getBoolean("bundle_from_referral")) {
            this.p = true;
        }
        com.bytedance.ies.ugc.appcontext.f.g().b(this.f78514j);
    }

    public final void u() {
        if (w() != null) {
            w().onResume();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f78508d.a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.f78644a = false;
            playableBusiness.a(false, true);
        }
        PreRenderWebViewBusiness a2 = PreRenderWebViewBusiness.a.a(this);
        if (a2 != null) {
            a2.a(null);
        }
        Activity activity = this.f78505a;
        if (activity != null) {
            o.b(activity);
        }
    }

    public final void x() {
        this.s = "1";
        this.o.setVisibility(8);
        ((GradualChangeLinearLayout) a(R.id.cfg)).setGradualChangeMode(false);
        this.n.a();
        this.n.setVisibility(0);
    }

    private void H() {
        if (!getCrossPlatformParams().f78741a.f78738k) {
            if (getCrossPlatformParams().f78741a.f78728a.intValue() == 2) {
                ((com.ss.android.ugc.aweme.crossplatform.view.e) this.f78509e.a(com.ss.android.ugc.aweme.crossplatform.view.e.class)).a(getCrossPlatformParams());
                return;
            }
            String a2 = com.ss.android.ugc.aweme.crossplatform.a.b.a(getCrossPlatformParams().f78741a.f78730c, com.ss.android.ugc.aweme.crossplatform.a.b.b(this.f78505a));
            v.a();
            if (!v.b(getCrossPlatformParams())) {
                ((com.ss.android.ugc.aweme.crossplatform.view.j) this.f78509e.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a(a2);
            }
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        this.f78514j.dispose();
        ImmersionBar immersionBar = this.w;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = this.f78509e;
        if (aVar != null) {
            aVar.d(this.f78505a);
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f78508d.a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            if (passBackWebInfoBusiness.d()) {
                b.i.b(new PassBackWebInfoBusiness.a(passBackWebInfoBusiness), b.i.f4824a);
            }
            passBackWebInfoBusiness.a().removeCallbacksAndMessages(null);
        }
        if (s()) {
            ReportBusinessProxy t2 = t();
            if (TextUtils.equals(t2.f78681a, "bio_link")) {
                r.a("biolink_session_duration", new com.ss.android.ugc.aweme.app.f.d().a("duration", System.currentTimeMillis() - t2.f78682b.longValue()).f66730a);
            }
        }
        com.ss.android.ugc.aweme.crossplatform.business.a.a.b();
        EventBus.a().b(this);
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        this.f78509e.b(this.f78505a);
        this.f78508d.a();
        this.y = System.currentTimeMillis();
        p();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f78508d.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.b();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f78508d.a(PlayableBusiness.class);
        boolean z2 = false;
        if (playableBusiness != null && !playableBusiness.f78644a) {
            playableBusiness.a(false, true);
        }
        Bundle bundle = this.f78507c;
        if (bundle != null && bundle.getBoolean("skip_consent", false)) {
            z2 = true;
        }
        this.f78513i = t.b(com.ss.android.ugc.aweme.compliance.api.a.r()).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new r(this, z2));
        this.u = true;
    }

    public final void v() {
        if (w() != null) {
            w().onPause();
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f78508d.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a(true);
        }
        com.ss.android.ugc.aweme.crossplatform.business.a.a.b();
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f78508d.a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.f78644a = true;
            playableBusiness.a(true, false);
        }
        PreRenderWebViewBusiness a2 = PreRenderWebViewBusiness.a.a(this);
        if (a2 != null) {
            a2.a();
        }
        if (this.f78505a != null && Build.VERSION.SDK_INT >= 23) {
            this.f78505a.getWindow().getDecorView().setSystemUiVisibility(1024);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.f
    public final void z() {
        if (!this.f78505a.isFinishing()) {
            this.x.setBackgroundColor(this.f78506b.f78744d.B);
            if (TextUtils.equals(this.f78506b.f78744d.f78803k, "1")) {
                this.n.c();
            } else if (TextUtils.equals(this.f78506b.f78744d.f78803k, "0") || !((com.ss.android.ugc.aweme.crossplatform.view.j) this.f78509e.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a().canGoBack()) {
                this.n.d();
            } else {
                this.n.c();
            }
        }
    }

    private boolean A() {
        if (getCrossPlatformParams().f78741a.f78728a.intValue() == 1) {
            if (getCrossPlatformParams().f78741a.f78736i) {
                com.ss.android.common.c.c.a(this.f78505a, "open_url", "push");
            }
            if (!com.bytedance.common.utility.m.a(getCrossPlatformParams().f78742b.f78768j)) {
                JSONObject jSONObject = null;
                if (!com.bytedance.common.utility.m.a(getCrossPlatformParams().f78742b.f78769k)) {
                    try {
                        jSONObject = new JSONObject(getCrossPlatformParams().f78742b.f78769k);
                    } catch (Exception unused) {
                    }
                }
                Context applicationContext = this.f78505a.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                com.ss.android.common.c.c.a(applicationContext, "wap_stat", "wap_enter", getCrossPlatformParams().f78742b.f78768j, 0, 0, jSONObject);
            }
            if (TextUtils.isEmpty(getCrossPlatformParams().f78741a.f78730c)) {
                return false;
            }
            return com.ss.android.newmedia.d.a(getCrossPlatformParams().f78741a.f78730c);
        } else if (getCrossPlatformParams().f78743c.f78789j != null) {
            return true;
        } else {
            return false;
        }
    }

    private void B() {
        boolean z2;
        Activity activity;
        com.ss.android.ugc.aweme.crossplatform.view.a aVar = (com.ss.android.ugc.aweme.crossplatform.view.a) a(R.id.ah_);
        this.f78509e = aVar;
        aVar.setCrossPlatformActivityContainer(this);
        C();
        D();
        this.f78509e.getViewStatusRegistry().a(this);
        E();
        if (getCrossPlatformParams().f78741a.f78730c.contains("terms-of-use") || getCrossPlatformParams().f78741a.f78730c.contains("privacy-policy") || getCrossPlatformParams().f78741a.f78730c.contains("cookie-policy-eu")) {
            z2 = true;
        } else {
            z2 = false;
        }
        Bundle bundle = this.f78507c;
        if ((bundle == null || !bundle.getBoolean("skip_consent", false)) && com.ss.android.ugc.aweme.compliance.api.a.r().a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null) && (activity = this.f78505a) != null && !activity.isFinishing() && !z2) {
            com.ss.android.ugc.aweme.compliance.api.a.r().a(this.f78505a, "deeplink");
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void c() {
        ImmersionBar immersionBar = this.w;
        ImmersionBar immersionBar2 = null;
        if (immersionBar != null) {
            immersionBar.destroy();
            this.w = null;
        }
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams = getCrossPlatformParams();
        Activity activity = this.f78505a;
        if (hh.a()) {
            if (crossPlatformParams.f78741a.f78728a.intValue() != 2) {
                activity.findViewById(R.id.ahc).setPadding(0, hh.b(), 0, 0);
            }
            Window window = activity.getWindow();
            boolean z2 = true;
            if (window != null && Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            immersionBar2 = ImmersionBar.with(activity).keyboardEnable(true, 32);
            immersionBar2.init();
            if (crossPlatformParams.f78744d.s) {
                com.ss.android.ugc.aweme.crossplatform.a.a.a(activity);
                if (!crossPlatformParams.f78744d.G) {
                    crossPlatformParams.f78744d.t = true;
                }
            } else {
                z2 = false;
            }
            if (crossPlatformParams.f78744d.t) {
                hh.a(activity, 0);
            }
            hg.a(activity, activity.getWindow(), crossPlatformParams.f78744d.f78794b);
            if (com.ss.android.ugc.aweme.crossplatform.a.a.a(crossPlatformParams, activity)) {
                if (!z2) {
                    com.ss.android.ugc.aweme.crossplatform.a.a.a(activity);
                }
                hh.a(activity);
                if (Build.VERSION.SDK_INT >= 21) {
                    crossPlatformParams.f78744d.v = activity.getWindow().getStatusBarColor();
                }
            } else if (!crossPlatformParams.f78744d.s) {
                if (crossPlatformParams.f78744d.v != -2) {
                    hh.a(activity, crossPlatformParams.f78744d.v);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    crossPlatformParams.f78744d.v = activity.getWindow().getStatusBarColor();
                }
            }
        }
        this.w = immersionBar2;
        Activity activity2 = this.f78505a;
        ez.a(activity2, androidx.core.content.b.c(activity2, R.color.nw));
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f78508d.a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.a((WebView) ((com.ss.android.ugc.aweme.crossplatform.view.j) this.f78509e.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a(), false);
        }
        this.f78509e.c(this.f78505a);
        this.f78512h = System.currentTimeMillis() - this.y;
        this.y = 0;
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        dVar.a("duration", this.f78512h);
        r.a("h5_stay_time", dVar.f66730a);
        o();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f78508d.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a(false);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f78508d.a(PlayableBusiness.class);
        if (playableBusiness != null && !playableBusiness.f78644a) {
            playableBusiness.a(true, false);
        }
        this.f78513i = t.a(t.b(com.ss.android.ugc.aweme.compliance.api.a.r()), com.bytedance.ies.ugc.appcontext.f.e(), p.f78559a).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new q(this));
    }

    private void D() {
        this.f78515k = (OpenURLHintLayout) a(R.id.ahc);
        this.x = (GradualChangeLinearLayout) a(R.id.cfg);
        if (this.f78506b.f78744d.f78799g != -2) {
            this.x.setBackgroundColor(this.f78506b.f78744d.f78799g);
        } else {
            this.x.setBackgroundColor(androidx.core.content.b.c(this.f78505a, R.color.f159928l));
        }
        if (this.f78506b.f78744d.o != -2) {
            this.f78515k.setBackgroundColor(this.f78506b.f78744d.o);
            this.f78505a.getWindow().setBackgroundDrawableResource(R.color.c9);
            com.ss.android.ugc.aweme.base.a.i.a(this.f78505a);
        }
        F();
        this.f78517m = new s(this.f78505a, this);
        m();
        if (this.f78506b.f78744d.x) {
            a.C0731a aVar = new a.C0731a(this.f78505a);
            aVar.b(R.string.dj4).b(R.string.asm, n.f78557a, false);
            aVar.a().b();
        }
        G();
        this.f78508d.a(OpenUrlHintBusiness.class);
        OpenUrlHintBusiness.a(this.f78515k, this.f78506b.f78741a.f78737j);
        I();
        if (getCrossPlatformParams().f78744d.t) {
            d();
        }
        if (!this.f78506b.f78744d.p) {
            x();
        } else {
            J();
        }
        if (getCrossPlatformParams().f78744d.r) {
            a(R.id.ahc).setPadding(0, hh.b(), 0, 0);
        }
        if (getCrossPlatformParams().f78744d.G) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.n.getLayoutParams();
            int i2 = getCrossPlatformParams().f78744d.H;
            if (i2 < 0) {
                i2 = hh.b();
            }
            layoutParams.setMargins(0, i2, 0, 0);
            this.n.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final boolean a() {
        if (TextUtils.isEmpty(this.f78506b.f78741a.f78730c)) {
            return false;
        }
        boolean A = A();
        this.f78508d.a(this.f78506b);
        return A;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void a(Bundle bundle) {
        this.f78507c = bundle;
    }

    private <T extends View> T a(int i2) {
        return (T) this.f78505a.findViewById(i2);
    }

    @org.greenrobot.eventbus.r
    public void onEvent(c cVar) {
        k kVar = this.q;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void a(Intent intent) {
        this.f78505a.setResult(50000, intent);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void a(com.ss.android.ugc.aweme.base.a.b bVar) {
        MethodCollector.i(11866);
        synchronized (this.z) {
            try {
                this.z.add(bVar);
            } finally {
                MethodCollector.o(11866);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void b(com.ss.android.ugc.aweme.base.a.b bVar) {
        MethodCollector.i(12021);
        synchronized (this.z) {
            try {
                this.z.remove(bVar);
            } finally {
                MethodCollector.o(12021);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        if (TextUtils.equals("web", jVar.f103916d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(this.f78505a, this.n, jVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void a(Configuration configuration) {
        if (!this.f78506b.f78744d.F) {
            this.f78515k.setLayoutParams(new FrameLayout.LayoutParams(Double.valueOf((double) n.b(this.f78505a, (float) configuration.screenWidthDp)).intValue(), Double.valueOf((double) n.b(this.f78505a, (float) configuration.screenHeightDp)).intValue()));
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(final com.bytedance.android.livesdkapi.n.a aVar) {
        Activity activity = this.f78505a;
        if (activity instanceof androidx.fragment.app.e) {
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
            com.bytedance.android.livesdkapi.depend.d.b.d dVar = new com.bytedance.android.livesdkapi.depend.d.b.d();
            dVar.a(aVar.f23295c);
            LiveOuterService.s().d().a(eVar, new com.bytedance.android.livesdkapi.depend.d.b.b() {
                /* class com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(48768);
                }

                @Override // com.bytedance.android.livesdkapi.depend.d.b.b
                public final void a(long j2) {
                    aVar.f23293a.a();
                }

                @Override // com.bytedance.android.livesdkapi.depend.d.b.b
                public final void a(Exception exc, String str) {
                    aVar.f23293a.b();
                }

                @Override // com.bytedance.android.livesdkapi.depend.d.b.b
                public final void a(int i2, int i3, String str) {
                    if (i2 == 1) {
                        com.bytedance.apm.b.a("promote_iap_charge_show", 0, (JSONObject) null);
                        r.a("promote_iap_recharge_panel_show", new com.ss.android.ugc.aweme.app.f.d().a("user_account_type", com.ss.android.ugc.aweme.account.b.g().getCurUser().getAccountType()).f66730a);
                    } else if (i2 == 0) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("error_status_code ", i3);
                            jSONObject.put("error_message", str);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        com.bytedance.apm.b.a("promote_iap_charge_show", 1, jSONObject);
                    }
                }
            }, aVar.f23294b, dVar).showNow(eVar.getSupportFragmentManager(), getClass().getSimpleName());
        }
    }

    public final void b(String str) {
        Bundle bundle = this.f78507c;
        if (bundle != null && !TextUtils.equals(str, bundle.getString("url"))) {
            this.f78507c.putString("url", str);
            this.f78506b = b.C1830b.a(this.f78507c);
            D();
        }
        ((com.ss.android.ugc.aweme.crossplatform.view.j) this.f78509e.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a(str);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f78508d.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.b();
        }
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.crossplatform.b.a aVar) {
        if (aVar != null && aVar.f78591a != null && L()) {
            String str = aVar.f78591a;
            str.hashCode();
            if (str.equals("3") && "1".equals(this.s)) {
                J();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void a(Runnable runnable) {
        this.f78510f = runnable;
    }

    @org.greenrobot.eventbus.r
    public final void invokeRenderTimeEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        q qVar;
        if (this.u && jVar.f91311b != null) {
            if (TextUtils.equals("goods_rn_page_monitor", jVar.f91311b.optString("eventName"))) {
                try {
                    JSONObject jSONObject = jVar.f91311b.getJSONObject("data");
                    com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
                    aVar.n = Long.valueOf(Long.valueOf(jSONObject.optString("interact_render_ts")).longValue() - this.t);
                    aVar.p = jSONObject.optString("page_id");
                    aVar.f73508m = Long.valueOf(Long.valueOf(jSONObject.optString("ender_render_ts")).longValue() - this.t);
                    aVar.o = jSONObject.optString("session_id");
                    com.ss.android.ugc.aweme.commerce.service.a.a().logCommerceEvents("commerce_page_render_time", aVar);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else if (TextUtils.equals("hybrid_prefetch_duration_monitor", jVar.f91311b.optString("eventName"))) {
                com.ss.android.ugc.aweme.crossplatform.e.c cVar = new com.ss.android.ugc.aweme.crossplatform.e.c();
                try {
                    JSONObject jSONObject2 = jVar.f91311b.getJSONObject("data");
                    cVar.f78837b.put("duration", Long.valueOf(jSONObject2.optString("duration")).longValue());
                    cVar.f78836a.put("duration_type", jSONObject2.optString("duration_type"));
                    cVar.f78836a.put("is_cache", jSONObject2.optString("is_cache"));
                    cVar.f78836a.put("page_id", jSONObject2.optString("page_id"));
                    com.ss.android.ugc.aweme.crossplatform.view.a aVar2 = this.f78509e;
                    if (aVar2 != null) {
                        cVar.f78839d = aVar2.getMonitorSession();
                    }
                    d.a.a();
                    k kVar = cVar.f78839d;
                    if (kVar != null) {
                        qVar = (q) kVar.a(q.class);
                    } else {
                        qVar = null;
                    }
                    com.ss.android.ugc.aweme.crossplatform.c.d.a(qVar, "hybrid_prefetch_duration_monitor", "invoke_render_event", cVar.f78836a, cVar.f78837b, cVar.f78838c);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(CloseMethod.b bVar) {
        com.ss.android.ugc.aweme.crossplatform.view.a aVar;
        com.ss.android.ugc.aweme.crossplatform.view.j jVar;
        SingleWebView a2;
        if (bVar != null && bVar.f91030a != 0 && (aVar = this.f78509e) != null && (jVar = (com.ss.android.ugc.aweme.crossplatform.view.j) aVar.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)) != null && (a2 = jVar.a()) != null && this.f78510f != null && a2.hashCode() == bVar.f91030a) {
            this.f78510f.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.web.g
    public final void a(String str) {
        a((CharSequence) str, true);
    }

    @org.greenrobot.eventbus.r
    public void onEvent(GetWebViewInfo.b bVar) {
        SingleWebView a2;
        PreRenderWebViewBusiness a3 = PreRenderWebViewBusiness.a.a(this);
        if (a3 != null) {
            a3.a(this.f78509e, bVar);
        } else if (bVar != null && bVar.f91058b != null && bVar.f91057a != 0 && (a2 = ((com.ss.android.ugc.aweme.crossplatform.view.j) this.f78509e.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a()) != null && a2.hashCode() == bVar.f91057a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("preloadType", 0);
                String str = this.f78506b.f78742b.H;
                if ("splash".equals(str)) {
                    jSONObject.put("scene", 2);
                } else if ("feedad".equals(str)) {
                    jSONObject.put("scene", 1);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            bVar.f91058b.a(jSONObject);
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        ITpcConsentService f78525a;

        /* renamed from: b  reason: collision with root package name */
        boolean f78526b;

        /* renamed from: c  reason: collision with root package name */
        WeakReference<Activity> f78527c;

        static {
            Covode.recordClassIndex(48769);
        }

        public a(ITpcConsentService iTpcConsentService, Activity activity) {
            this.f78525a = iTpcConsentService;
            this.f78526b = iTpcConsentService.a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null);
            this.f78527c = new WeakReference<>(activity);
        }
    }

    MixActivityContainer(Activity activity, com.ss.android.ugc.aweme.crossplatform.d.a.a aVar) {
        this.f78505a = activity;
        this.f78506b = aVar;
        this.f78508d = g.a.a(this);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void a(CharSequence charSequence, boolean z2) {
        if (this.n != null) {
            if ((!TextUtils.isEmpty(charSequence) && com.ss.android.ugc.aweme.crossplatform.a.b.a(charSequence)) || this.f78506b.f78741a.f78728a == null || this.f78506b.f78741a.f78728a.intValue() != 1) {
                return;
            }
            if (this.f78506b.f78744d.y || z2) {
                this.n.setTitle(charSequence);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final boolean a(String str, int i2) {
        return com.ss.android.ugc.aweme.ck.t.a(com.ss.android.ugc.aweme.ck.t.a(), this.f78505a, str, i2);
    }

    @Override // com.ss.android.ugc.aweme.base.a.b
    public final boolean a(int i2, int i3, Intent intent) {
        MethodCollector.i(12192);
        this.f78508d.a(WalletBusiness.class);
        String currentUrl = this.f78509e.getCurrentUrl();
        if (currentUrl != null && currentUrl.contains("wallet/home")) {
            com.ss.android.sdk.a.a aVar = new com.ss.android.sdk.a.a();
            aVar.f60128a = i2;
            aVar.f60129b = i3;
            aVar.f60130c = intent;
            com.ss.android.ugc.d.a.c.a(aVar);
        }
        HashSet<com.ss.android.ugc.aweme.base.a.b> hashSet = new HashSet();
        synchronized (this.z) {
            try {
                hashSet.addAll(this.z);
            } catch (Throwable th) {
                MethodCollector.o(12192);
                throw th;
            }
        }
        if (!hashSet.isEmpty()) {
            for (com.ss.android.ugc.aweme.base.a.b bVar : hashSet) {
                bVar.a(i2, i3, intent);
            }
        }
        MethodCollector.o(12192);
        return false;
    }
}
