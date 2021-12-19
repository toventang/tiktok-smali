package com.ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.Space;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.service.base.o;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.bullet.business.ReportBusiness;
import com.ss.android.ugc.aweme.bullet.business.WalletBusiness;
import com.ss.android.ugc.aweme.bullet.module.base.a.c;
import com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar;
import com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.av;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

public abstract class a extends com.ss.android.ugc.aweme.bullet.b.a implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final C1567a A = new C1567a((byte) 0);
    private final f.a.b.a B = new f.a.b.a();

    /* renamed from: a  reason: collision with root package name */
    private DmtStatusView f69394a;

    /* renamed from: b  reason: collision with root package name */
    private Callable<e> f69395b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.bullet.module.base.a.a f69396c;

    /* renamed from: d  reason: collision with root package name */
    protected View f69397d;

    /* renamed from: e  reason: collision with root package name */
    public BulletCommonTitleBar f69398e;

    /* renamed from: f  reason: collision with root package name */
    public View f69399f;

    /* renamed from: g  reason: collision with root package name */
    public Space f69400g;

    /* renamed from: h  reason: collision with root package name */
    public OpenURLHintLayout f69401h;

    /* renamed from: i  reason: collision with root package name */
    public SSWebView f69402i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.c.i f69403j;

    /* renamed from: k  reason: collision with root package name */
    public e f69404k;

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.ies.bullet.service.f.a.f f69405l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.bullet.module.ad.c f69406m;
    public String n;
    public c o;
    public View.OnClickListener p;
    public Runnable q = new b(this);
    public Activity r;
    public boolean s;
    public List<String> t;
    public long u;
    public String v;
    public String w = "";
    public com.bytedance.ies.bullet.kit.web.a.e x;
    public final com.bytedance.ies.bullet.c.e.a.b y;
    public final com.ss.android.ugc.aweme.bullet.business.b z;

    static {
        Covode.recordClassIndex(42786);
    }

    /* access modifiers changed from: protected */
    public abstract void a(e eVar);

    /* access modifiers changed from: protected */
    public int e() {
        return R.layout.ro;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(40, new org.greenrobot.eventbus.g(a.class, "onEvent", com.ss.android.ugc.aweme.crossplatform.b.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new org.greenrobot.eventbus.g(a.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(41, new org.greenrobot.eventbus.g(a.class, "onEvent", com.ss.android.ugc.aweme.ad.c.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(42, new org.greenrobot.eventbus.g(a.class, "onJsBroadcast", com.ss.android.ugc.aweme.ad.c.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$a  reason: collision with other inner class name */
    public static final class C1567a {
        static {
            Covode.recordClassIndex(42787);
        }

        private C1567a() {
        }

        public /* synthetic */ C1567a(byte b2) {
            this();
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f69428a;

        static {
            Covode.recordClassIndex(42789);
        }

        c(q qVar) {
            this.f69428a = qVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ Object call() {
            return this.f69428a;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.b.a, com.bytedance.ies.bullet.ui.common.b.c
    public final void a(q qVar) {
        l.d(qVar, "");
        if (qVar instanceof e) {
            e eVar = (e) qVar;
            if (TextUtils.isEmpty(eVar.f32691g.b())) {
                eVar.f32691g.a(eVar.aJ.b());
            }
            this.f69395b = new c(qVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.b.a, com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.b.c
    public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z2) {
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
        if (iVar instanceof com.bytedance.ies.bullet.kit.web.c) {
            com.bytedance.ies.bullet.kit.web.c cVar = (com.bytedance.ies.bullet.kit.web.c) iVar;
            WebView n2 = cVar.n();
            SSWebView sSWebView = this.f69402i;
            if ((sSWebView == null || (!l.a(sSWebView, n2))) && (n2 instanceof SSWebView)) {
                boolean z3 = false;
                n2.setBackgroundColor(0);
                SSWebView sSWebView2 = (SSWebView) n2;
                this.f69402i = sSWebView2;
                if (sSWebView2 != null) {
                    sSWebView2.resumeTimers();
                }
                SSWebView sSWebView3 = this.f69402i;
                if (sSWebView3 != null) {
                    com.ss.android.ugc.aweme.bullet.module.base.a.a aVar = new com.ss.android.ugc.aweme.bullet.module.base.a.a(sSWebView3, (byte) 0);
                    this.f69396c = aVar;
                    sSWebView3.setWebViewEventDelegate(aVar);
                }
                l.b(b.a.f65586a, "");
                com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
                if (a2 != null) {
                    a2.a(this, this.f69402i);
                }
                l.b(b.a.f65586a, "");
                com.ss.android.ugc.aweme.ad.b.c a3 = com.ss.android.ugc.aweme.ad.b.b.a();
                if (a3 != null) {
                    a3.c(this, this.f69402i);
                }
                SSWebView sSWebView4 = this.f69402i;
                if (sSWebView4 != null) {
                    com.ss.android.ugc.aweme.ad.utils.a.a(new g(sSWebView4, this));
                    e eVar = this.f69404k;
                    if (eVar != null) {
                        Boolean b2 = eVar.w.b();
                        if (b2 != null && b2.booleanValue()) {
                            sSWebView4.setLayerType(1, null);
                        }
                        Boolean bool = (Boolean) eVar.aH.b();
                        if (bool != null && bool.booleanValue()) {
                            int i2 = Build.VERSION.SDK_INT;
                            try {
                                WebSettings settings = sSWebView4.getSettings();
                                l.b(settings, "");
                                l.b(b.a.f65586a, "");
                                if (!com.ss.android.ugc.aweme.ad.b.b.b().o()) {
                                    z3 = true;
                                }
                                settings.setMediaPlaybackRequiresUserGesture(z3);
                            } catch (Exception unused) {
                                WebSettings settings2 = sSWebView4.getSettings();
                                l.b(settings2, "");
                                settings2.setMediaPlaybackRequiresUserGesture(true);
                            }
                        }
                    }
                }
            }
            this.z.a(n2);
            this.z.a(cVar.m());
            this.z.a((o) iVar.b(o.class));
        }
    }

    public static final class e implements BulletCommonTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f69430a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.service.f.a.b f69431b;

        static {
            Covode.recordClassIndex(42791);
        }

        @Override // com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.a
        public final void d() {
            this.f69430a.q.run();
        }

        @Override // com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.a
        public final void a() {
            this.f69430a.v = "click_button";
            a aVar = this.f69430a;
            SSWebView sSWebView = aVar.f69402i;
            if (sSWebView == null || !sSWebView.b()) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                dVar.a("method", aVar.v);
                r.a("h5_leave_detail", dVar.f66730a);
                aVar.q.run();
                return;
            }
            SSWebView sSWebView2 = aVar.f69402i;
            if (sSWebView2 != null) {
                sSWebView2.goBack();
            }
        }

        @Override // com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.a
        public final void b() {
            if ((this.f69431b instanceof e) && this.f69430a.z.a(ReportBusiness.class) != null) {
                ReportBusiness.a(this.f69430a.r, ((e) this.f69431b).f());
            }
        }

        @Override // com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.a
        public final void c() {
            if (this.f69430a.s) {
                l.b(b.a.f65586a, "");
                com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
                if (a2 != null) {
                    a aVar = this.f69430a;
                    a2.b(aVar, aVar.f69402i);
                    return;
                }
                return;
            }
            l.b(b.a.f65586a, "");
            com.ss.android.ugc.aweme.ad.b.c a3 = com.ss.android.ugc.aweme.ad.b.b.a();
            if (a3 != null) {
                a3.b(this.f69430a);
            }
        }

        @Override // com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.a
        public final void a(View view) {
            PopupWindow a2;
            boolean z;
            l.d(view, "");
            c cVar = this.f69430a.o;
            if (cVar != null) {
                if (cVar.f69426e == null || cVar.f69426e.isEmpty()) {
                    cVar.f69423b.setVisibility(0);
                    cVar.f69424c.setVisibility(0);
                    cVar.f69425d.setVisibility(0);
                } else {
                    if (cVar.f69426e.contains(Integer.valueOf(com.ss.android.ugc.aweme.bullet.module.base.a.b.refresh.id))) {
                        com.ss.android.ugc.aweme.base.utils.o.a(cVar.f69423b, 8);
                        z = false;
                    } else {
                        com.ss.android.ugc.aweme.base.utils.o.a(cVar.f69423b, 0);
                        z = true;
                    }
                    if (cVar.f69426e.contains(Integer.valueOf(com.ss.android.ugc.aweme.bullet.module.base.a.b.copylink.id))) {
                        cVar.f69424c.setVisibility(8);
                    } else {
                        cVar.f69424c.setVisibility(0);
                        z = true;
                    }
                    if (cVar.f69426e.contains(Integer.valueOf(com.ss.android.ugc.aweme.bullet.module.base.a.b.openwithbrowser.id))) {
                        cVar.f69425d.setVisibility(8);
                        if (!z) {
                            return;
                        }
                    } else {
                        cVar.f69425d.setVisibility(0);
                    }
                }
                c cVar2 = this.f69430a.o;
                if (cVar2 != null && (a2 = cVar2.a(this.f69430a.p)) != null) {
                    a2.showAsDropDown(view, 0, -12);
                }
            }
        }

        e(a aVar, com.bytedance.ies.bullet.service.f.a.b bVar) {
            this.f69430a = aVar;
            this.f69431b = bVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.b.a, com.bytedance.ies.bullet.ui.common.b.c
    public final com.bytedance.ies.bullet.ui.common.b.a b() {
        return new BaseCommonBizRootContainer$provideActivityDelegate$1(this);
    }

    @Override // com.ss.android.ugc.aweme.bullet.b.a
    public final com.bytedance.ies.bullet.kit.web.a.d c() {
        return new j(this);
    }

    @Override // com.ss.android.ugc.aweme.bullet.b.a
    public final com.bytedance.ies.bullet.kit.web.a.e d() {
        return new k(this);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f69421a;

        static {
            Covode.recordClassIndex(42788);
        }

        b(a aVar) {
            this.f69421a = aVar;
        }

        public final void run() {
            Activity activity = this.f69421a.r;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final View k() {
        View view = this.f69397d;
        if (view == null) {
            l.a("rootView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    public final void n() {
        n.a(this.f69398e, 8);
        n.a(this.f69400g, 8);
    }

    protected static boolean m() {
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.e b2 = com.ss.android.ugc.aweme.ad.b.b.b();
        if (b2 != null) {
            return b2.d();
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.c
    public final ViewGroup a() {
        View view = this.f69397d;
        if (view == null) {
            l.a("rootView");
        }
        View findViewById = view.findViewById(R.id.a0h);
        l.b(findViewById, "");
        return (ViewGroup) findViewById;
    }

    public boolean f() {
        String str;
        g();
        e eVar = this.f69404k;
        if (eVar != null) {
            str = eVar.m();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    public void g() {
        e eVar = this.f69404k;
        if (eVar != null) {
            Boolean bool = (Boolean) eVar.aG.b();
            if (bool != null && bool.booleanValue()) {
                com.ss.android.ugc.aweme.common.q.a(com.bytedance.ies.ugc.appcontext.d.a(), "open_url", "push");
            }
            if (p.c(eVar.m(), "pay", false)) {
                this.z.a(WalletBusiness.class);
            }
        }
    }

    public final BulletContainerView l() {
        ViewGroup a2 = a();
        int childCount = a2.getChildCount();
        BulletContainerView bulletContainerView = null;
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = a2.getChildAt(i2);
                if ((childAt != null && (childAt instanceof BulletContainerView) && (bulletContainerView = (BulletContainerView) childAt) != null) || i2 == childCount) {
                    break;
                }
                i2++;
            }
        }
        return bulletContainerView;
    }

    public static final class j extends com.bytedance.ies.bullet.kit.web.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f69439a;

        /* renamed from: c  reason: collision with root package name */
        private View f69440c;

        static {
            Covode.recordClassIndex(42797);
        }

        public final void onHideCustomView() {
            Object obj;
            Integer num;
            com.bytedance.ies.bullet.service.f.a.b.d<Boolean> dVar;
            com.bytedance.ies.bullet.service.f.a.b.h hVar;
            com.bytedance.ies.bullet.service.f.a.b.a aVar;
            MethodCollector.i(9392);
            ((ViewGroup) this.f69439a.k().findViewById(R.id.a0h)).removeView(this.f69440c);
            Boolean bool = null;
            this.f69440c = null;
            a aVar2 = this.f69439a;
            e eVar = aVar2.f69404k;
            if (eVar == null || (aVar = eVar.J) == null) {
                obj = null;
            } else {
                obj = aVar.b();
            }
            if (!l.a(obj, (Object) true)) {
                aVar2.j();
                MethodCollector.o(9392);
                return;
            }
            e eVar2 = aVar2.f69404k;
            if (eVar2 == null || (hVar = eVar2.v) == null) {
                num = null;
            } else {
                num = (Integer) hVar.b();
            }
            if (num != null && num.intValue() == 1) {
                aVar2.w = "1";
                n.a(aVar2.f69400g, 8);
                n.a(aVar2.f69399f, 0);
                n.a(aVar2.f69398e, 0);
                BulletCommonTitleBar bulletCommonTitleBar = aVar2.f69398e;
                if (bulletCommonTitleBar != null) {
                    bulletCommonTitleBar.setBackgroundColor(0);
                    View a2 = bulletCommonTitleBar.a(R.id.so);
                    l.b(a2, "");
                    a2.setVisibility(8);
                    TuxTextView tuxTextView = (TuxTextView) bulletCommonTitleBar.a(R.id.title);
                    l.b(tuxTextView, "");
                    tuxTextView.setVisibility(0);
                    ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.zo)).setImageResource(2131231532);
                    ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.a7s)).setImageResource(2131231522);
                    ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.dll)).setImageResource(2131231529);
                    MethodCollector.o(9392);
                    return;
                }
                MethodCollector.o(9392);
                return;
            }
            e eVar3 = aVar2.f69404k;
            if (!(eVar3 == null || (dVar = eVar3.f32686b) == null)) {
                bool = dVar.b();
            }
            if (!l.a((Object) bool, (Object) true)) {
                n.a(aVar2.f69398e, 0);
                n.a(aVar2.f69400g, 0);
            }
            MethodCollector.o(9392);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(a aVar) {
            this.f69439a = aVar;
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            MethodCollector.i(9195);
            this.f69440c = view;
            ((ViewGroup) this.f69439a.k().findViewById(R.id.a0h)).addView(this.f69440c);
            this.f69439a.n();
            MethodCollector.o(9195);
        }

        public final void onReceivedTitle(WebView webView, String str) {
            String str2;
            e eVar;
            Boolean bool;
            BulletCommonTitleBar bulletCommonTitleBar;
            a aVar = this.f69439a;
            if (str == null || (str2 = str.toString()) == null) {
                str2 = "";
            }
            if (!p.b(str2, "http", false) && !p.b(str2, "https", false) && !p.b(str2, "about:", false) && (eVar = aVar.f69404k) != null && (bool = (Boolean) eVar.aI.b()) != null && bool.booleanValue() && !TextUtils.isEmpty(str) && (bulletCommonTitleBar = aVar.f69398e) != null) {
                if (str == null) {
                    l.b();
                }
                bulletCommonTitleBar.setTitle(str);
            }
        }
    }

    public void j() {
        this.w = "1";
        n.a(this.f69400g, 8);
        n.a(this.f69399f, 8);
        BulletCommonTitleBar bulletCommonTitleBar = this.f69398e;
        if (bulletCommonTitleBar != null) {
            bulletCommonTitleBar.setBackgroundColor(0);
            View a2 = bulletCommonTitleBar.a(R.id.so);
            l.b(a2, "");
            a2.setVisibility(0);
            TuxTextView tuxTextView = (TuxTextView) bulletCommonTitleBar.a(R.id.title);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.a7s)).setImageResource(2131231521);
            ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.a7m)).setImageResource(2131231524);
            ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.zo)).setImageResource(2131231531);
            ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.dll)).setImageResource(2131231528);
            ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.dng)).setImageResource(2131231526);
        }
    }

    public static final class k extends com.bytedance.ies.bullet.kit.web.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f69441a;

        static {
            Covode.recordClassIndex(42798);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(a aVar) {
            this.f69441a = aVar;
        }

        public final void onPageFinished(WebView webView, String str) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69441a.x;
            if (eVar != null) {
                eVar.onPageFinished(webView, str);
            }
            a aVar = this.f69441a;
            l.b(b.a.f65586a, "");
            com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
            if (a2 != null) {
                a2.a((com.bytedance.ies.bullet.ui.common.b.c) aVar, true);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.o
        public final void a(WebView webView, com.bytedance.ies.bullet.service.base.web.h hVar, WebResourceResponse webResourceResponse) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69441a.x;
            if (eVar != null) {
                eVar.a(webView, hVar, webResourceResponse);
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69441a.x;
            if (eVar != null) {
                eVar.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.o
        public final void a(WebView webView, com.bytedance.ies.bullet.service.base.web.h hVar, com.bytedance.ies.bullet.service.base.web.g gVar) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69441a.x;
            if (eVar != null) {
                eVar.a(webView, hVar, gVar);
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69441a.x;
            if (eVar != null) {
                eVar.onPageStarted(webView, str, bitmap);
            }
            a aVar = this.f69441a;
            l.b(b.a.f65586a, "");
            com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
            if (a2 != null) {
                a2.a((com.bytedance.ies.bullet.ui.common.b.c) aVar, false);
            }
        }

        public final void onReceivedError(WebView webView, int i2, String str, String str2) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69441a.x;
            if (eVar != null) {
                eVar.onReceivedError(webView, i2, str, str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        l.d(str, "");
        this.w = str;
    }

    @org.greenrobot.eventbus.r
    public final void onJsBroadcast(com.ss.android.ugc.aweme.ad.c.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.bullet.module.base.a.a aVar2 = this.f69396c;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f69429a;

        static {
            Covode.recordClassIndex(42790);
        }

        d(a aVar) {
            this.f69429a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BulletContainerView l2 = this.f69429a.l();
            if (l2 != null) {
                l2.b();
                return;
            }
            SSWebView sSWebView = this.f69429a.f69402i;
            if (sSWebView != null) {
                sSWebView.reload();
            }
        }
    }

    static final class g extends m implements h.f.a.b<com.ss.android.ugc.aweme.ad.e.a, z> {
        final /* synthetic */ SSWebView $this_apply;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(42793);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SSWebView sSWebView, a aVar) {
            super(1);
            this.$this_apply = sSWebView;
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ad.e.a aVar) {
            com.ss.android.ugc.aweme.ad.e.a aVar2 = aVar;
            l.d(aVar2, "");
            this.$this_apply.setTimeInterval(aVar2.getAutoJumpInterval());
            this.this$0.t = aVar2.getPauseList();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.c.c.i f69434a;

        static {
            Covode.recordClassIndex(42794);
        }

        h(com.bytedance.ies.bullet.c.c.i iVar) {
            this.f69434a = iVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                str = "appEnterBackgroundEvent";
            } else {
                str = "appEnterForegroundEvent";
            }
            this.f69434a.onEvent(new com.bytedance.ies.bullet.c.c.a.p(str) {
                /* class com.ss.android.ugc.aweme.bullet.module.base.a.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f69435a;

                /* renamed from: b  reason: collision with root package name */
                private final String f69436b;

                /* renamed from: c  reason: collision with root package name */
                private final Object f69437c;

                static {
                    Covode.recordClassIndex(42795);
                }

                @Override // com.bytedance.ies.bullet.c.c.a.p
                public final String a() {
                    return this.f69436b;
                }

                @Override // com.bytedance.ies.bullet.c.c.a.p
                public final Object b() {
                    return this.f69437c;
                }

                {
                    this.f69435a = r1;
                    this.f69436b = r1;
                }
            });
        }
    }

    public void b(Activity activity) {
        l.d(activity, "");
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a2 != null) {
            a2.c(this);
        }
    }

    public void c(Activity activity) {
        l.d(activity, "");
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a2 != null) {
            a2.c(this, this.f69402i);
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.crossplatform.b.c cVar) {
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a2 != null) {
            a2.g();
        }
    }

    private final void a(com.bytedance.ies.bullet.service.f.a.b bVar) {
        OpenURLHintLayout openURLHintLayout;
        com.ss.android.ugc.aweme.bullet.module.ad.c cVar;
        BulletCommonTitleBar bulletCommonTitleBar = this.f69398e;
        if (bulletCommonTitleBar != null) {
            bulletCommonTitleBar.a(bVar);
        }
        BulletCommonTitleBar bulletCommonTitleBar2 = this.f69398e;
        if (bulletCommonTitleBar2 != null) {
            bulletCommonTitleBar2.setTitleWrap(new e(this, bVar));
        }
        if (!(bVar instanceof e)) {
            bVar = null;
        }
        e eVar = (e) bVar;
        if (((eVar != null && eVar.n()) || ((cVar = this.f69406m) != null && cVar.h())) && (openURLHintLayout = this.f69401h) != null) {
            openURLHintLayout.setPadding(0, hh.b(), 0, 0);
        }
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.ad.c.b bVar) {
        com.bytedance.ies.bullet.service.f.a.b.b bVar2;
        SSWebView sSWebView;
        com.bytedance.ies.bullet.c.c.i iVar;
        com.bytedance.ies.bullet.c.c.i iVar2 = this.f69403j;
        if (iVar2 != null) {
            bVar2 = iVar2.b();
        } else {
            bVar2 = null;
        }
        if (bVar2 == com.bytedance.ies.bullet.service.f.a.b.b.LYNX) {
            if (bVar != null && bVar.f65589a != 0 && (iVar = this.f69403j) != null && iVar.hashCode() == bVar.f65589a) {
                this.q.run();
            }
        } else if (bVar != null && bVar.f65589a != 0 && (sSWebView = this.f69402i) != null && sSWebView.hashCode() == bVar.f65589a) {
            this.q.run();
        }
    }

    public void a(Activity activity) {
        l.d(activity, "");
        this.B.a();
        e eVar = this.f69404k;
        if (eVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", eVar.m());
            hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
            com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("ad_webview_close", System.currentTimeMillis(), com.bytedance.ies.xbridge.platform.b.b.a(hashMap)));
        }
    }

    public final void b(String str) {
        String str2;
        String str3;
        com.bytedance.ies.bullet.service.f.a.b.d<String> dVar;
        StringBuilder sb = new StringBuilder();
        String[] strArr = new String[2];
        strArr[0] = "platform = ";
        if (this.f69404k != null) {
            str2 = "webview";
        } else if (this.f69405l != null) {
            str2 = "react-native";
        } else {
            str2 = "unknown";
        }
        strArr[1] = str2;
        StringBuilder a2 = p.a(p.a(sb, strArr), "status = ", str);
        String[] strArr2 = new String[2];
        strArr2[0] = "module_name = ";
        com.bytedance.ies.bullet.service.f.a.f fVar = this.f69405l;
        if (fVar == null || (dVar = fVar.S) == null) {
            str3 = null;
        } else {
            str3 = dVar.b();
        }
        strArr2[1] = str3;
        p.a(p.a(a2, strArr2), "url = ", this.n);
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        String str;
        if (jVar != null) {
            str = jVar.f103916d;
        } else {
            str = null;
        }
        if (TextUtils.equals("web", str)) {
            l.b(b.a.f65586a, "");
            com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
            if (a2 != null) {
                a2.a(this.r, this.f69398e, jVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f69432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f69433b;

        static {
            Covode.recordClassIndex(42792);
        }

        f(a aVar, Activity activity) {
            this.f69432a = aVar;
            this.f69433b = activity;
        }

        public final void onClick(View view) {
            Integer num;
            SSWebView sSWebView;
            ClickAgent.onClick(view);
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            c cVar = this.f69432a.o;
            if (!(cVar == null || cVar.f69422a == null)) {
                cVar.f69422a.dismiss();
            }
            if (!TextUtils.isEmpty(this.f69432a.n) && num != null) {
                if (num.intValue() == R.id.czk) {
                    Activity activity = this.f69433b;
                    String str = this.f69432a.n;
                    if (!com.bytedance.common.utility.m.a(str)) {
                        try {
                            Intent intent = new Intent();
                            intent.setData(Uri.parse(str));
                            intent.setAction("android.intent.action.VIEW");
                            if (activity != null) {
                                com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
                                activity.startActivity(intent);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } else if (num.intValue() == R.id.af9) {
                    Activity activity2 = this.f69433b;
                    String str2 = this.f69432a.n;
                    PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-215").usage("").tag("BaseCommonBizRootContainer_copyLink").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build();
                    if (!com.bytedance.common.utility.m.a(str2)) {
                        try {
                            av.a("", str2, activity2, build);
                        } catch (Exception e3) {
                            com.ss.android.ugc.aweme.framework.a.a.a(e3);
                        }
                        if (activity2 != null) {
                            new com.bytedance.tux.g.b(activity2).e(R.string.gin).b(2131231922).b();
                        }
                    }
                } else if (num.intValue() == R.id.dk5 && (sSWebView = this.f69432a.f69402i) != null) {
                    sSWebView.reload();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.b.a, com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.b.c
    public final void a(Uri uri) {
        l.d(uri, "");
        this.s = false;
        this.n = uri.toString();
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a2 != null) {
            a2.f();
        }
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a3 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a3 != null) {
            a3.a(this, this.n);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.c
    public ViewGroup a(Context context) {
        e eVar;
        l.d(context, "");
        Activity activity = (Activity) context;
        this.r = activity;
        View inflate = View.inflate(context, e(), null);
        l.b(inflate, "");
        this.f69397d = inflate;
        if (inflate == null) {
            l.a("rootView");
        }
        this.f69394a = (DmtStatusView) inflate.findViewById(R.id.axu);
        com.bytedance.ies.dmt.ui.widget.d dVar = new d.a(activity).a(2131232886).b(R.string.h2z).c(R.string.h2y).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, R.string.h35, new d(this)).f33648a;
        com.bytedance.ies.dmt.ui.widget.e eVar2 = new com.bytedance.ies.dmt.ui.widget.e(activity);
        eVar2.setStatus(dVar);
        if (com.bytedance.ies.dmt.ui.common.b.b(activity)) {
            eVar2.setBackgroundColor(androidx.core.content.b.c(activity, R.color.t));
        } else {
            eVar2.setBackgroundColor(androidx.core.content.b.c(activity, R.color.c0));
        }
        DmtStatusView dmtStatusView = this.f69394a;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(DmtStatusView.a.a(activity).c(eVar2));
        }
        View view = this.f69397d;
        if (view == null) {
            l.a("rootView");
        }
        this.f69398e = (BulletCommonTitleBar) view.findViewById(R.id.a0m);
        View view2 = this.f69397d;
        if (view2 == null) {
            l.a("rootView");
        }
        this.f69399f = view2.findViewById(R.id.emr);
        View view3 = this.f69397d;
        if (view3 == null) {
            l.a("rootView");
        }
        this.f69400g = (Space) view3.findViewById(R.id.csm);
        View view4 = this.f69397d;
        if (view4 == null) {
            l.a("rootView");
        }
        this.f69401h = (OpenURLHintLayout) view4.findViewById(R.id.a0l);
        try {
            Callable<e> callable = this.f69395b;
            if (callable != null) {
                eVar = callable.call();
            } else {
                eVar = null;
            }
            if (eVar == null) {
                l.b();
            }
            a((com.bytedance.ies.bullet.service.f.a.b) eVar);
            if (l.a((Object) eVar.f32686b.b(), (Object) true)) {
                n.a(this.f69398e, 8);
                n.a(this.f69400g, 8);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f69395b = null;
            throw th;
        }
        this.f69395b = null;
        View view5 = this.f69397d;
        if (view5 == null) {
            l.a("rootView");
        }
        Objects.requireNonNull(view5, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) view5;
    }

    /* access modifiers changed from: package-private */
    public static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final i f69438a = new i();

        static {
            Covode.recordClassIndex(42796);
        }

        i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public a(com.bytedance.ies.bullet.c.e.a.b bVar, com.ss.android.ugc.aweme.bullet.business.b bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        this.y = bVar;
        this.z = bVar2;
    }

    @Override // com.ss.android.ugc.aweme.bullet.b.a, com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.b.c
    public final void a(Uri uri, Throwable th) {
        l.d(uri, "");
        l.d(th, "");
        DmtStatusView dmtStatusView = this.f69394a;
        if (dmtStatusView != null) {
            dmtStatusView.h();
        }
        DmtStatusView dmtStatusView2 = this.f69394a;
        if (dmtStatusView2 != null) {
            dmtStatusView2.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.b.a, com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.b.c
    public void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
        this.s = true;
        this.n = uri.toString();
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a2 != null) {
            a2.f();
        }
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a3 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a3 != null) {
            a3.b(this, this.n);
        }
        SSWebView sSWebView = this.f69402i;
        if (sSWebView == null || !sSWebView.canGoBack()) {
            BulletCommonTitleBar bulletCommonTitleBar = this.f69398e;
            if (bulletCommonTitleBar != null) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) bulletCommonTitleBar.a(R.id.a7m);
                l.b(autoRTLImageView, "");
                autoRTLImageView.setVisibility(8);
            }
        } else {
            BulletCommonTitleBar bulletCommonTitleBar2 = this.f69398e;
            if (bulletCommonTitleBar2 != null) {
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) bulletCommonTitleBar2.a(R.id.a7m);
                l.b(autoRTLImageView2, "");
                autoRTLImageView2.setVisibility(0);
            }
        }
        DmtStatusView dmtStatusView = this.f69394a;
        if (dmtStatusView != null) {
            dmtStatusView.g();
        }
        DmtStatusView dmtStatusView2 = this.f69394a;
        if (dmtStatusView2 != null) {
            dmtStatusView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
        com.bytedance.ies.bullet.service.f.a.b.d<Boolean> dVar;
        String str;
        com.bytedance.ies.bullet.service.f.a.b.d<String> dVar2;
        l.d(iVar, "");
        l.d(uri, "");
        l.d(qVar, "");
        this.f69403j = iVar;
        if (qVar instanceof com.bytedance.ies.bullet.service.f.a.b) {
            if (qVar instanceof com.bytedance.ies.bullet.service.f.a.d) {
                this.B.a(com.bytedance.ies.ugc.appcontext.f.g().d(new h(iVar)));
            }
            if (qVar instanceof e) {
                this.f69404k = (e) qVar;
            } else if (qVar instanceof com.bytedance.ies.bullet.service.f.a.f) {
                this.f69405l = (com.bytedance.ies.bullet.service.f.a.f) qVar;
            }
            this.f69406m = (com.ss.android.ugc.aweme.bullet.module.ad.c) iVar.a(com.ss.android.ugc.aweme.bullet.module.ad.c.class);
            if (!(this instanceof com.ss.android.ugc.aweme.bullet.module.ad.b) || this.f69404k == null || f()) {
                com.bytedance.ies.bullet.service.f.a.b bVar = (com.bytedance.ies.bullet.service.f.a.b) qVar;
                this.z.a(bVar);
                this.z.a(this.f69406m);
                Activity activity = this.r;
                if (activity != null) {
                    if (this.p == null) {
                        this.p = new f(this, activity);
                    }
                    this.o = new c(activity, this.p);
                }
                Boolean bool = null;
                if (TextUtils.isEmpty(bVar.f32691g.b())) {
                    com.bytedance.ies.bullet.service.f.a.b.d<String> dVar3 = bVar.f32691g;
                    e eVar = this.f69404k;
                    if (eVar == null || (dVar2 = eVar.aJ) == null) {
                        str = null;
                    } else {
                        str = dVar2.b();
                    }
                    dVar3.a(str);
                }
                e eVar2 = this.f69404k;
                if (!(eVar2 == null || (dVar = eVar2.Q) == null)) {
                    bool = dVar.b();
                }
                if (l.a((Object) bool, (Object) true)) {
                    bVar.J.a((Object) false);
                }
                a(bVar);
                e eVar3 = this.f69404k;
                if (eVar3 != null) {
                    l.b(b.a.f65586a, "");
                    com.ss.android.ugc.aweme.ad.b.b.a();
                    if (!TextUtils.isEmpty(eVar3.m())) {
                        l.b(b.a.f65586a, "");
                        com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
                        if (a2 != null) {
                            a2.f();
                        }
                    }
                    Boolean bool2 = (Boolean) eVar3.aF.b();
                    if (bool2 != null && bool2.booleanValue()) {
                        a.C0731a aVar = new a.C0731a(this.r);
                        aVar.b(R.string.dj4).b(R.string.asm, (DialogInterface.OnClickListener) i.f69438a, false);
                        aVar.a().b();
                    }
                    a(eVar3);
                }
                if (l.a((Object) bVar.f32686b.b(), (Object) true)) {
                    n.a(this.f69398e, 8);
                    n.a(this.f69400g, 8);
                }
            }
        }
    }
}
