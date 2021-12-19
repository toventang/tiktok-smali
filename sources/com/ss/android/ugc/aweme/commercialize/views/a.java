package com.ss.android.ugc.aweme.commercialize.views;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.h;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.bullet.bridge.ad.GetWebViewInfo;
import com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.bullet.module.ad.e;
import com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.commercialize.utils.aj;
import com.ss.android.ugc.aweme.commercialize.utils.k;
import com.ss.android.ugc.aweme.commercialize.utils.m;
import com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer;
import com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.fe.method.GetWebViewInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

public final class a extends FrameLayout {

    /* renamed from: m */
    public static final int f75904m = R.id.fb;
    public static final d n = new d((byte) 0);
    private final com.ss.android.ugc.aweme.bullet.module.ad.e A;
    private f B;
    private SparseArray C;

    /* renamed from: a */
    public View f75905a;

    /* renamed from: b */
    public boolean f75906b;

    /* renamed from: c */
    public Bundle f75907c;

    /* renamed from: d */
    public boolean f75908d;

    /* renamed from: e */
    public aj f75909e;

    /* renamed from: f */
    public com.ss.android.ugc.aweme.ad.feed.h.b f75910f;

    /* renamed from: g */
    public CommercializeWebViewHelper f75911g;

    /* renamed from: h */
    public String f75912h;

    /* renamed from: i */
    public long f75913i;

    /* renamed from: j */
    public boolean f75914j;

    /* renamed from: k */
    public final z f75915k;

    /* renamed from: l */
    public String f75916l;
    private final h.h o;
    private final h.h p;
    private final h.h q;
    private final h.h r;
    private final h.h s;
    private final h.h t;
    private final h.h u;
    private final h.h v;
    private e w;
    private c x;
    private int y;
    private final com.ss.android.ugc.aweme.commercialize.utils.m z;

    public interface c {
        static {
            Covode.recordClassIndex(46809);
        }

        void a();

        void b();

        void c();
    }

    public static final boolean a(Activity activity, String str) {
        return d.a(n, activity, str);
    }

    private View b(int i2) {
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

    private final ImageView getMCloseView() {
        return (ImageView) this.s.getValue();
    }

    private final FrameLayout getMLightWebPage() {
        return (FrameLayout) this.p.getValue();
    }

    private final TextView getMRetryView() {
        return (TextView) this.u.getValue();
    }

    public final AdBottomSheetContainer getMBottomSheet() {
        return (AdBottomSheetContainer) this.o.getValue();
    }

    public final CommonBizWebView getMBulletWebView() {
        return (CommonBizWebView) this.r.getValue();
    }

    public final FrameLayout getMErrorView() {
        return (FrameLayout) this.t.getValue();
    }

    public final AdPopUpWebTitleBar getMFlTitleBar() {
        return (AdPopUpWebTitleBar) this.v.getValue();
    }

    public final CrossPlatformWebView getMWebView() {
        return (CrossPlatformWebView) this.q.getValue();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(46810);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }

        public static FrameLayout a(Activity activity) {
            MethodCollector.i(2845);
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.eg);
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                if (inflate != null) {
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    MethodCollector.o(2845);
                    return frameLayout;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                MethodCollector.o(2845);
                throw nullPointerException;
            }
            FrameLayout frameLayout2 = (FrameLayout) activity.findViewById(R.id.ef);
            MethodCollector.o(2845);
            return frameLayout2;
        }

        public static a b(Activity activity, int i2) {
            a aVar;
            FrameLayout a2 = a(activity);
            if (a2 != null) {
                aVar = (a) a2.findViewById(i2);
            } else {
                aVar = null;
            }
            if (!(aVar instanceof a)) {
                return null;
            }
            return aVar;
        }

        public static boolean a(Activity activity, int i2) {
            h.f.b.l.d(activity, "");
            a b2 = b(activity, i2);
            if (b2 == null || !b2.getMBottomSheet().a()) {
                return false;
            }
            b2.b();
            FrameLayout a2 = a(activity);
            if (a2 != null) {
                a2.setVisibility(8);
            }
            return true;
        }

        public static /* synthetic */ boolean a(d dVar, Activity activity, String str) {
            return a(activity, str, a.f75904m);
        }

        private static boolean a(Activity activity, String str, int i2) {
            h.f.b.l.d(activity, "");
            a b2 = b(activity, i2);
            if (b2 == null || b2.getMBottomSheet().a()) {
                return false;
            }
            FrameLayout a2 = a(activity);
            if (a2 != null) {
                a2.setVisibility(0);
            }
            b2.a(str, (Boolean) false);
            return true;
        }

        public static boolean a(Activity activity, String str, Boolean bool, int i2) {
            e params;
            h.f.b.l.d(activity, "");
            a b2 = b(activity, i2);
            if (b2 == null || b2.getMBottomSheet().a()) {
                return false;
            }
            FrameLayout a2 = a(activity);
            if (a2 != null) {
                a2.setVisibility(0);
            }
            if (!(str == null || (params = b2.getParams()) == null)) {
                params.a(str);
            }
            b2.a((String) null, bool);
            return true;
        }
    }

    public final c getCallback() {
        return this.x;
    }

    public final e getParams() {
        return this.w;
    }

    public final int getTitleBarState() {
        return this.y;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$a */
    public static final class C1728a implements m.a {

        /* renamed from: a */
        final /* synthetic */ a f75917a;

        static {
            Covode.recordClassIndex(46807);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.m.a
        public final void c() {
            a("preload_break", null);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.m.a
        public final void a() {
            this.f75917a.getMErrorView().setVisibility(8);
            View findViewById = this.f75917a.getMWebView().findViewById(R.id.axu);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            a("preload_start", null);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.m.a
        public final void b() {
            this.f75917a.getMErrorView().setVisibility(0);
            View findViewById = this.f75917a.getMWebView().findViewById(R.id.axu);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            a("preload_fail", null);
        }

        C1728a(a aVar) {
            this.f75917a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.m.a
        public final void a(long j2) {
            a("preload_success", Long.valueOf(j2));
            this.f75917a.f75908d = true;
        }

        private final void a(String str, Long l2) {
            Aweme aweme;
            if (this.f75917a.c()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("light_page", 1);
                if (l2 != null) {
                    linkedHashMap.put("duration", l2);
                }
                f.b a2 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                a2.f74804a = "ad_wap_stat";
                a2.f74805b = str;
                f.b a3 = a2.a(new JSONObject(linkedHashMap));
                e params = this.f75917a.getParams();
                AwemeRawAd awemeRawAd = null;
                a3.b(params != null ? params.f75921c : null).a((Context) null);
                e params2 = this.f75917a.getParams();
                if (!(params2 == null || (aweme = params2.f75921c) == null)) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", str, awemeRawAd);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    a4.a((String) entry.getKey(), entry.getValue());
                }
                a4.c();
            }
        }
    }

    public static final class b implements e.a {

        /* renamed from: a */
        final /* synthetic */ a f75918a;

        static {
            Covode.recordClassIndex(46808);
        }

        @Override // com.ss.android.ugc.aweme.bullet.module.ad.e.a
        public final void c() {
            a("preload_break", null);
        }

        @Override // com.ss.android.ugc.aweme.bullet.module.ad.e.a
        public final void a() {
            this.f75918a.getMErrorView().setVisibility(8);
            a("preload_start", null);
        }

        @Override // com.ss.android.ugc.aweme.bullet.module.ad.e.a
        public final void b() {
            this.f75918a.getMErrorView().setVisibility(0);
            a("preload_fail", null);
        }

        b(a aVar) {
            this.f75918a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.bullet.module.ad.e.a
        public final void a(long j2) {
            a("preload_success", Long.valueOf(j2));
        }

        private final void a(String str, Long l2) {
            Aweme aweme;
            if (this.f75918a.c()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("light_page", 1);
                if (l2 != null) {
                    linkedHashMap.put("duration", l2);
                }
                f.b a2 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                a2.f74804a = "ad_wap_stat";
                a2.f74805b = str;
                f.b a3 = a2.a(new JSONObject(linkedHashMap));
                e params = this.f75918a.getParams();
                AwemeRawAd awemeRawAd = null;
                a3.b(params != null ? params.f75921c : null).a((Context) null);
                e params2 = this.f75918a.getParams();
                if (!(params2 == null || (aweme = params2.f75921c) == null)) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", str, awemeRawAd);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    a4.a((String) entry.getKey(), entry.getValue());
                }
                a4.c();
            }
        }
    }

    public static final class e {

        /* renamed from: a */
        public String f75919a;

        /* renamed from: b */
        public androidx.lifecycle.m f75920b;

        /* renamed from: c */
        public Aweme f75921c;

        /* renamed from: d */
        public Integer f75922d;

        /* renamed from: e */
        public boolean f75923e;

        /* renamed from: f */
        public Bundle f75924f;

        static {
            Covode.recordClassIndex(46811);
        }

        public /* synthetic */ e() {
            this("");
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.views.a$e$a */
        public static final class C1729a extends com.ss.android.ugc.aweme.commercialize.util.f<e> {
            static {
                Covode.recordClassIndex(46812);
            }

            public C1729a() {
                super(new e());
            }
        }

        public final void a(String str) {
            h.f.b.l.d(str, "");
            this.f75919a = str;
        }

        private e(String str) {
            h.f.b.l.d(str, "");
            this.f75919a = str;
            this.f75920b = null;
            this.f75921c = null;
            this.f75922d = null;
            this.f75923e = true;
            this.f75924f = null;
        }
    }

    public static final class j implements AdBottomSheetContainer.b {

        /* renamed from: a */
        final /* synthetic */ a f75931a;

        /* renamed from: b */
        private boolean f75932b;

        static {
            Covode.recordClassIndex(46817);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer.b
        public final void d() {
            this.f75931a.a(7);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer.b
        public final void c() {
            if (this.f75931a.getMBottomSheet().getHideable() && this.f75931a.f75914j) {
                this.f75931a.f75914j = false;
                com.ss.android.ugc.aweme.commercialize.utils.l.a(this.f75931a.getContext());
            }
            this.f75931a.a(1);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer.b
        public final void a() {
            PreRenderWebViewBusiness a2;
            Aweme aweme;
            Aweme aweme2;
            com.ss.android.ugc.aweme.bullet.business.b bVar;
            com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness a3;
            this.f75931a.a(3);
            if (!this.f75932b) {
                this.f75932b = true;
                this.f75931a.f75913i = System.currentTimeMillis();
                aj ajVar = this.f75931a.f75909e;
                if (ajVar != null) {
                    ajVar.f75571b = ajVar.c();
                    ajVar.f75570a = ajVar.f75571b;
                    ajVar.a().getViewTreeObserver().addOnGlobalLayoutListener(ajVar.f75572c);
                }
                if (this.f75931a.f75906b) {
                    this.f75931a.getMBulletWebView().setVisibility(0);
                    this.f75931a.getMWebView().setVisibility(8);
                    SSWebView webView = this.f75931a.getMBulletWebView().getWebView();
                    if (webView != null) {
                        webView.loadUrl("javascript:window.dialogPopUp()");
                    }
                    com.ss.android.ugc.aweme.bullet.module.base.b rootContainer = this.f75931a.getMBulletWebView().getRootContainer();
                    if (!(rootContainer == null || (bVar = rootContainer.z) == null || (a3 = PreRenderWebViewBusiness.a.a(bVar)) == null)) {
                        a3.a(this.f75931a.f75916l);
                    }
                } else {
                    ((com.ss.android.ugc.aweme.crossplatform.view.j) this.f75931a.getMWebView().a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a().loadUrl("javascript:window.dialogPopUp()");
                    CommercializeWebViewHelper commercializeWebViewHelper = this.f75931a.f75911g;
                    if (!(commercializeWebViewHelper == null || (a2 = PreRenderWebViewBusiness.a.a(commercializeWebViewHelper)) == null)) {
                        a2.a(this.f75931a.f75916l);
                    }
                }
                if (this.f75931a.c()) {
                    f.b a4 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                    a4.f74804a = "light_ad";
                    a4.f74805b = "detail_show";
                    e params = this.f75931a.getParams();
                    AwemeRawAd awemeRawAd = null;
                    if (params != null) {
                        aweme = params.f75921c;
                    } else {
                        aweme = null;
                    }
                    a4.b(aweme).a((Context) null);
                    e params2 = this.f75931a.getParams();
                    if (!(params2 == null || (aweme2 = params2.f75921c) == null)) {
                        awemeRawAd = aweme2.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("light_ad", "detail_show", awemeRawAd).c();
                }
                c callback = this.f75931a.getCallback();
                if (callback != null) {
                    callback.a();
                }
                com.ss.android.ugc.aweme.ad.feed.h.b bVar2 = this.f75931a.f75910f;
                if (bVar2 != null) {
                    bVar2.a(true);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer.b
        public final void b() {
            com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness a2;
            Aweme aweme;
            AwemeRawAd awemeRawAd;
            Aweme aweme2;
            Long l2;
            String str;
            Aweme aweme3;
            AwemeRawAd awemeRawAd2;
            Aweme aweme4;
            AwemeRawAd awemeRawAd3;
            Aweme aweme5;
            com.ss.android.ugc.aweme.bullet.business.b bVar;
            com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness a3;
            if (this.f75932b) {
                this.f75932b = false;
                aj ajVar = this.f75931a.f75909e;
                if (ajVar != null) {
                    ajVar.b();
                }
                if (this.f75931a.f75906b) {
                    com.ss.android.ugc.aweme.bullet.module.base.b rootContainer = this.f75931a.getMBulletWebView().getRootContainer();
                    if (!(rootContainer == null || (bVar = rootContainer.z) == null || (a3 = PreRenderWebViewBusiness.a.a(bVar)) == null)) {
                        a3.a();
                    }
                } else {
                    CommercializeWebViewHelper commercializeWebViewHelper = this.f75931a.f75911g;
                    if (!(commercializeWebViewHelper == null || (a2 = PreRenderWebViewBusiness.a.a(commercializeWebViewHelper)) == null)) {
                        a2.a();
                    }
                }
                if (this.f75931a.c()) {
                    f.b a4 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                    a4.f74804a = "light_ad";
                    a4.f74805b = "landing_page";
                    String str2 = this.f75931a.f75912h;
                    String str3 = "slide";
                    if (str2 == null) {
                        str2 = str3;
                    }
                    f.b c2 = a4.c(str2);
                    e params = this.f75931a.getParams();
                    if (params != null) {
                        aweme = params.f75921c;
                    } else {
                        aweme = null;
                    }
                    c2.b(aweme).a((Context) null);
                    e params2 = this.f75931a.getParams();
                    if (params2 == null || (aweme5 = params2.f75921c) == null) {
                        awemeRawAd = null;
                    } else {
                        awemeRawAd = aweme5.getAwemeRawAd();
                    }
                    a.C0791a a5 = com.bytedance.ies.ugc.aweme.rich.a.a.a("light_ad", "landing_page", awemeRawAd);
                    String str4 = this.f75931a.f75912h;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    a5.b("refer", str3).c();
                    f.b a6 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                    a6.f74804a = "ad_wap_stat";
                    a6.f74805b = "stay_page";
                    e params3 = this.f75931a.getParams();
                    if (params3 != null) {
                        aweme2 = params3.f75921c;
                    } else {
                        aweme2 = null;
                    }
                    a6.b(aweme2).b(Long.valueOf(System.currentTimeMillis() - this.f75931a.f75913i)).a(ag.b(new h.p("light_page", 1))).a((Context) null);
                    e params4 = this.f75931a.getParams();
                    if (params4 == null || (aweme4 = params4.f75921c) == null || (awemeRawAd3 = aweme4.getAwemeRawAd()) == null) {
                        l2 = null;
                    } else {
                        l2 = awemeRawAd3.getCreativeId();
                    }
                    String valueOf = String.valueOf(l2);
                    e params5 = this.f75931a.getParams();
                    if (params5 == null || (aweme3 = params5.f75921c) == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null) {
                        str = null;
                    } else {
                        str = awemeRawAd2.getLogExtra();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", "stay_page", valueOf, str, String.valueOf(System.currentTimeMillis() - this.f75931a.f75913i)).a("light_page", 1).c();
                }
                this.f75931a.f75912h = null;
                c callback = this.f75931a.getCallback();
                if (callback != null) {
                    callback.b();
                }
                com.ss.android.ugc.aweme.ad.feed.h.b bVar2 = this.f75931a.f75910f;
                if (bVar2 != null) {
                    bVar2.a(false);
                }
                this.f75931a.a(4);
            }
        }

        j(a aVar) {
            this.f75931a = aVar;
        }
    }

    public static final class z implements AdPopUpWebTitleBar.b {

        /* renamed from: a */
        final /* synthetic */ a f75942a;

        static {
            Covode.recordClassIndex(46833);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.b
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.b
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.b
        public final void a() {
            this.f75942a.b();
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.b
        public final void d() {
            if (this.f75942a.f75908d) {
                ShareH5Service a2 = ShareH5Service.a.a();
                com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness = this.f75942a.getMWebView().getCrossPlatformBusiness();
                SingleWebView a3 = ((com.ss.android.ugc.aweme.crossplatform.view.j) this.f75942a.getMWebView().a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a();
                h.f.b.l.b(a3, "");
                a2.a(crossPlatformBusiness, a3, 2);
                return;
            }
            ShareH5Service.a.a().a(this.f75942a.getMWebView().getCrossPlatformBusiness(), 2);
        }

        z(a aVar) {
            this.f75942a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.a<AdBottomSheetContainer> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.this$0
                android.view.View r1 = r0.f75905a
                r0 = 2131362638(0x7f0a034e, float:1.8345062E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.a.q.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.a<CommonBizWebView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.this$0
                android.view.View r1 = r0.f75905a
                r0 = 2131362806(0x7f0a03f6, float:1.8345403E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.a.r.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.ImageView, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ android.widget.ImageView invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.this$0
                android.view.View r1 = r0.f75905a
                r0 = 2131363059(0x7f0a04f3, float:1.8345916E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.a.s.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ android.widget.FrameLayout invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.this$0
                android.view.View r1 = r0.f75905a
                r0 = 2131366680(0x7f0a1318, float:1.835326E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.a.t.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.f.b.m implements h.f.a.a<AdPopUpWebTitleBar> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.this$0
                android.view.View r1 = r0.f75905a
                r0 = 2131364395(0x7f0a0a2b, float:1.8348626E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.a.u.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ android.widget.FrameLayout invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.this$0
                android.view.View r1 = r0.f75905a
                r0 = 2131365916(0x7f0a101c, float:1.835171E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.a.v.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.TextView, android.view.View] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ android.widget.TextView invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.this$0
                android.view.View r1 = r0.f75905a
                r0 = 2131367760(0x7f0a1750, float:1.835545E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.a.w.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x extends h.f.b.m implements h.f.a.a<CrossPlatformWebView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.commercialize.views.a r0 = r2.this$0
                android.view.View r1 = r0.f75905a
                r0 = 2131370495(0x7f0a21ff, float:1.8360998E38)
                android.view.View r0 = r1.findViewById(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.a.x.invoke():java.lang.Object");
        }
    }

    public static final class y implements c.a {

        /* renamed from: a */
        final /* synthetic */ a f75939a;

        /* renamed from: b */
        final /* synthetic */ com.bytedance.ies.web.a.a f75940b;

        /* renamed from: c */
        final /* synthetic */ String f75941c;

        static {
            Covode.recordClassIndex(46832);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c.a
        public final void a() {
            a.a(this.f75940b, this.f75941c, false, new LinkedHashMap());
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c.a
        public final void a(List<Integer> list) {
            h.f.b.l.d(list, "");
            a.a(this.f75940b, this.f75941c, true, ag.b(new h.p("selected", list)));
        }

        public y(a aVar, com.bytedance.ies.web.a.a aVar2, String str) {
            this.f75939a = aVar;
            this.f75940b = aVar2;
            this.f75941c = str;
        }
    }

    public final boolean c() {
        e eVar = this.w;
        if (eVar != null) {
            return eVar.f75923e;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(46806);
    }

    private final boolean getNeedPreload() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        e eVar = this.w;
        if (eVar == null || (aweme = eVar.f75921c) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isPreloadExtraWeb()) {
            return false;
        }
        return true;
    }

    public final void a() {
        if (this.f75906b) {
            SSWebView webView = getMBulletWebView().getWebView();
            if (webView != null) {
                webView.loadUrl("about:blank");
                return;
            }
            return;
        }
        CrossPlatformWebView.a(getMWebView(), "about:blank", false, null, 6);
    }

    public final void b() {
        if (this.f75914j) {
            this.f75914j = false;
            com.ss.android.ugc.aweme.commercialize.utils.l.a(getContext());
            return;
        }
        AdBottomSheetContainer mBottomSheet = getMBottomSheet();
        if (mBottomSheet.a()) {
            mBottomSheet.f75825h.c(4);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.a().b(this.B);
        aj ajVar = this.f75909e;
        if (ajVar != null) {
            ajVar.b();
        }
        this.f75909e = null;
        com.ss.android.ugc.aweme.ad.feed.h.b bVar = this.f75910f;
        if (bVar != null) {
            bVar.a(false);
        }
        this.f75910f = null;
        if (this.f75906b) {
            this.A.a(true);
            getMBulletWebView().a();
            return;
        }
        this.z.a(true);
        CommercializeWebViewHelper commercializeWebViewHelper = this.f75911g;
        if (commercializeWebViewHelper != null) {
            commercializeWebViewHelper.onPause();
            commercializeWebViewHelper.onDestroy();
        }
        this.f75911g = null;
    }

    private final void d() {
        String str;
        e eVar;
        Aweme aweme;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Bundle bundle;
        Aweme aweme2;
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo;
        Aweme aweme3;
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo2;
        Aweme aweme4;
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo3;
        Aweme aweme5;
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo4;
        getMFlTitleBar().c();
        e eVar2 = this.w;
        if (eVar2 != null && (str = eVar2.f75919a) != null && str.length() > 0) {
            String str7 = null;
            if (!(!(getContext() instanceof Activity) || (eVar = this.w) == null || eVar.f75920b == null)) {
                k.a aVar = new k.a();
                e eVar3 = this.w;
                if (eVar3 != null) {
                    aweme = eVar3.f75921c;
                } else {
                    aweme = null;
                }
                Bundle a2 = com.ss.android.ugc.aweme.commercialize.utils.d.a((com.ss.android.ugc.aweme.commercialize.utils.k) aVar.a(aweme).f75479a);
                e eVar4 = this.w;
                if (eVar4 != null) {
                    str2 = eVar4.f75919a;
                } else {
                    str2 = null;
                }
                a2.putString("url", str2);
                a2.putInt("preload_web_status", 7);
                e eVar5 = this.w;
                if (eVar5 == null || (aweme5 = eVar5.f75921c) == null || (commerceVideoAuthInfo4 = aweme5.getCommerceVideoAuthInfo()) == null) {
                    str3 = null;
                } else {
                    str3 = commerceVideoAuthInfo4.getAdId();
                }
                a2.putString("bundle_ad_id_from_aweme", str3);
                e eVar6 = this.w;
                if (eVar6 == null || (aweme4 = eVar6.f75921c) == null || (commerceVideoAuthInfo3 = aweme4.getCommerceVideoAuthInfo()) == null) {
                    str4 = null;
                } else {
                    str4 = commerceVideoAuthInfo3.getCreativeId();
                }
                a2.putString("bundle_creative_id_from_aweme", str4);
                e eVar7 = this.w;
                if (eVar7 == null || (aweme3 = eVar7.f75921c) == null || (commerceVideoAuthInfo2 = aweme3.getCommerceVideoAuthInfo()) == null) {
                    str5 = null;
                } else {
                    str5 = commerceVideoAuthInfo2.getAdvId();
                }
                a2.putString("bundle_advertiser_id_from_aweme", str5);
                e eVar8 = this.w;
                if (eVar8 == null || (aweme2 = eVar8.f75921c) == null || (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) == null) {
                    str6 = null;
                } else {
                    str6 = commerceVideoAuthInfo.getItemId();
                }
                a2.putString("bundle_item_id_from_aweme", str6);
                e eVar9 = this.w;
                if (eVar9 != null) {
                    bundle = eVar9.f75924f;
                } else {
                    bundle = null;
                }
                a2.putAll(bundle);
                if (this.f75906b) {
                    this.f75907c = a2;
                    CommonBizWebView mBulletWebView = getMBulletWebView();
                    d.b a3 = com.ss.android.ugc.aweme.bullet.b.a().a();
                    com.ss.android.ugc.aweme.bullet.module.ad.e eVar10 = this.A;
                    Context context = getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    BulletActivityWrapper bulletActivityWrapper = new BulletActivityWrapper((Activity) context);
                    e eVar11 = this.w;
                    if (eVar11 == null) {
                        h.f.b.l.b();
                    }
                    androidx.lifecycle.m mVar = eVar11.f75920b;
                    if (mVar == null) {
                        h.f.b.l.b();
                    }
                    mBulletWebView.a(a3, eVar10, bulletActivityWrapper, mVar, "ad_commerce");
                } else {
                    CrossPlatformWebView mWebView = getMWebView();
                    com.ss.android.ugc.aweme.commercialize.utils.m mVar2 = this.z;
                    e eVar12 = this.w;
                    if (eVar12 == null) {
                        h.f.b.l.b();
                    }
                    androidx.lifecycle.m mVar3 = eVar12.f75920b;
                    if (mVar3 == null) {
                        h.f.b.l.b();
                    }
                    Context context2 = getContext();
                    Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                    this.f75911g = CommercializeWebViewHelper.a(mWebView, mVar2, mVar3, (Activity) context2, a2);
                }
            }
            ShareH5Service a4 = ShareH5Service.a.a();
            com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness = getMWebView().getCrossPlatformBusiness();
            SingleWebView a5 = ((com.ss.android.ugc.aweme.crossplatform.view.j) getMWebView().a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a();
            h.f.b.l.b(a5, "");
            a4.b(crossPlatformBusiness, a5, 2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("source", "light_landing_page");
            linkedHashMap2.put("preload", Integer.valueOf(getNeedPreload() ? 1 : 0));
            String jSONObject = new JSONObject(ag.c(linkedHashMap2)).toString();
            h.f.b.l.b(jSONObject, "");
            linkedHashMap.put("X-Extra-Data", jSONObject);
            if (this.f75906b) {
                CommonBizWebView mBulletWebView2 = getMBulletWebView();
                e eVar13 = this.w;
                if (eVar13 == null) {
                    h.f.b.l.b();
                }
                CommonBizWebView.a(mBulletWebView2, com.ss.android.ugc.aweme.bullet.utils.c.a(eVar13.f75919a, h.a.n.a("ad_commerce"), this.f75907c, new com.ss.android.ugc.aweme.bullet.module.base.g(com.bytedance.ies.ugc.appcontext.d.a())), linkedHashMap, this.f75907c);
                return;
            }
            CrossPlatformWebView mWebView2 = getMWebView();
            e eVar14 = this.w;
            if (eVar14 == null) {
                h.f.b.l.b();
            }
            CrossPlatformWebView.a(mWebView2, eVar14.f75919a, false, linkedHashMap, 2);
            ShareH5Service a6 = ShareH5Service.a.a();
            com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness2 = getMWebView().getCrossPlatformBusiness();
            e eVar15 = this.w;
            if (eVar15 != null) {
                str7 = eVar15.f75919a;
            }
            a6.a(crossPlatformBusiness2, str7, 2);
        }
    }

    public final void onAttachedToWindow() {
        Aweme aweme;
        super.onAttachedToWindow();
        EventBus.a(EventBus.a(), this.B);
        AdBottomSheetContainer mBottomSheet = getMBottomSheet();
        FrameLayout mLightWebPage = getMLightWebPage();
        h.f.b.l.d(mLightWebPage, "");
        ViewGroup.LayoutParams layoutParams = mLightWebPage.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((CoordinatorLayout.e) layoutParams).a(mBottomSheet.f75825h);
        e eVar = this.w;
        Activity activity = null;
        if (eVar != null) {
            aweme = eVar.f75921c;
        } else {
            aweme = null;
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.M(aweme)) {
            AdPopUpWebTitleBar adPopUpWebTitleBar = (AdPopUpWebTitleBar) b(R.id.b6m);
            h.f.b.l.b(adPopUpWebTitleBar, "");
            adPopUpWebTitleBar.setVisibility(8);
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) b(R.id.fm8);
            h.f.b.l.b(crossPlatformWebView, "");
            ViewGroup.LayoutParams layoutParams2 = crossPlatformWebView.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.topMargin = 0;
            CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) b(R.id.fm8);
            h.f.b.l.b(crossPlatformWebView2, "");
            crossPlatformWebView2.setLayoutParams(layoutParams3);
        }
        getMBottomSheet().setCallback(new j(this));
        getMLightWebPage().setOnClickListener(new k(this));
        getMFlTitleBar().a();
        getMFlTitleBar().setOnClickListener(null);
        ((ImageView) getMFlTitleBar().findViewById(R.id.d71)).setOnClickListener(new l(this));
        ((ImageView) getMFlTitleBar().findViewById(R.id.d7d)).setOnClickListener(new m(this));
        FrameLayout mLightWebPage2 = getMLightWebPage();
        int paddingLeft = getPaddingLeft();
        double a2 = (double) com.ss.android.ugc.aweme.base.utils.i.a(getContext());
        Double.isNaN(a2);
        mLightWebPage2.setPadding(paddingLeft, (int) (a2 * 0.26836581709145424d), getPaddingRight(), getPaddingBottom());
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f75906b) {
                SSWebView webView = getMBulletWebView().getWebView();
                if (webView != null) {
                    webView.setOnScrollChangeListener(new n(this));
                }
            } else {
                ((com.ss.android.ugc.aweme.crossplatform.view.j) getMWebView().a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a().setOnScrollChangeListener(new o(this));
            }
        }
        getMRetryView().setOnClickListener(new p(this));
        Context context = getContext();
        if (context instanceof Activity) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            aj ajVar = new aj(activity2);
            ajVar.f75573d = new g(this);
            this.f75909e = ajVar;
            this.f75910f = new i(this, activity2, activity2);
            SingleWebView a3 = ((com.ss.android.ugc.aweme.crossplatform.view.j) getMWebView().a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a();
            if (a3 != null) {
                a3.setWebChromeClient(new h(a3, a3, this));
            }
        }
        if (getNeedPreload()) {
            d();
        }
    }

    public final void setCallback(c cVar) {
        this.x = cVar;
    }

    public final void setParams(e eVar) {
        this.w = eVar;
    }

    public final void setTitleBarState(int i2) {
        this.y = i2;
    }

    public static final class f implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

        /* renamed from: a */
        final /* synthetic */ a f75925a;

        static {
            Covode.recordClassIndex(46813);
        }

        @Override // org.greenrobot.eventbus.i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(208, new org.greenrobot.eventbus.g(f.class, "onEvent", GetWebViewInfo.b.class, ThreadMode.POSTING, 0, false));
            hashMap.put(265, new org.greenrobot.eventbus.g(f.class, "onEvent", GetWebViewInfo.a.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        f(a aVar) {
            this.f75925a = aVar;
        }

        public final void onEvent(GetWebViewInfo.b bVar) {
            CommercializeWebViewHelper commercializeWebViewHelper;
            com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness a2;
            if (bVar != null && (commercializeWebViewHelper = this.f75925a.f75911g) != null && (a2 = PreRenderWebViewBusiness.a.a(commercializeWebViewHelper)) != null) {
                a2.a(this.f75925a.getMWebView(), bVar);
            }
        }

        public final void onEvent(GetWebViewInfo.a aVar) {
            com.ss.android.ugc.aweme.bullet.module.base.b rootContainer;
            com.ss.android.ugc.aweme.bullet.business.b bVar;
            com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness a2;
            if (aVar != null && this.f75925a.f75906b && (rootContainer = this.f75925a.getMBulletWebView().getRootContainer()) != null && (bVar = rootContainer.z) != null && (a2 = PreRenderWebViewBusiness.a.a(bVar)) != null) {
                a2.a(aVar);
            }
        }
    }

    public static final class g implements aj.a {

        /* renamed from: a */
        final /* synthetic */ a f75926a;

        static {
            Covode.recordClassIndex(46814);
        }

        g(a aVar) {
            this.f75926a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.aj.a
        public final void a(int i2, int i3, int i4) {
            boolean z;
            String str;
            a aVar = this.f75926a;
            if (i3 < i2) {
                z = true;
            } else {
                z = false;
            }
            aVar.f75914j = z;
            if (this.f75926a.f75914j) {
                str = "keyboardDidShow";
            } else {
                str = "keyboardDidHide";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("height", Integer.valueOf(com.ss.android.ugc.aweme.base.utils.n.b((double) (i4 - i3))));
            if (this.f75926a.f75906b) {
                this.f75926a.getMBulletWebView().a(str, new JSONObject(ag.c(linkedHashMap)));
            } else {
                this.f75926a.getMWebView().a(str, new JSONObject(ag.c(linkedHashMap)));
            }
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ a f75933a;

        static {
            Covode.recordClassIndex(46818);
        }

        k(a aVar) {
            this.f75933a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75933a.f75912h = "blank";
            this.f75933a.b();
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ a f75934a;

        static {
            Covode.recordClassIndex(46819);
        }

        l(a aVar) {
            this.f75934a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75934a.f75915k.f75942a.b();
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ a f75935a;

        static {
            Covode.recordClassIndex(46820);
        }

        m(a aVar) {
            this.f75935a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75935a.f75915k.d();
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ a f75938a;

        static {
            Covode.recordClassIndex(46823);
        }

        p(a aVar) {
            this.f75938a = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            e params = this.f75938a.getParams();
            if (params != null && (str = params.f75919a) != null && str.length() > 0 && 1 != 0) {
                if (this.f75938a.f75906b) {
                    h.a.a(this.f75938a.getMBulletWebView(), com.ss.android.ugc.aweme.bullet.utils.c.a(str, h.a.n.a("ad_commerce"), this.f75938a.f75907c, new com.ss.android.ugc.aweme.bullet.module.base.g(com.bytedance.ies.ugc.appcontext.d.a())), this.f75938a.f75907c, null, 4);
                } else {
                    CrossPlatformWebView.a(this.f75938a.getMWebView(), str, false, null, 6);
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 1) {
            this.y = 1;
        } else if (i2 == 7) {
            int i3 = this.y;
            if (i3 != 7 && i3 != 4) {
                this.y = 7;
            }
        } else if (i2 == 3) {
            this.y = 3;
        } else if (i2 == 4) {
            this.y = 4;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(1678);
        View inflate = View.inflate(context, R.layout.a98, this);
        h.f.b.l.b(inflate, "");
        this.f75905a = inflate;
        this.o = h.i.a((h.f.a.a) new q(this));
        this.p = h.i.a((h.f.a.a) new v(this));
        this.q = h.i.a((h.f.a.a) new x(this));
        this.r = h.i.a((h.f.a.a) new r(this));
        this.s = h.i.a((h.f.a.a) new s(this));
        this.t = h.i.a((h.f.a.a) new t(this));
        this.u = h.i.a((h.f.a.a) new w(this));
        this.f75906b = com.ss.android.ugc.aweme.commercialize.abtest.c.b();
        this.v = h.i.a((h.f.a.a) new u(this));
        this.y = 4;
        com.ss.android.ugc.aweme.commercialize.utils.m mVar = new com.ss.android.ugc.aweme.commercialize.utils.m();
        mVar.f75799e = new C1728a(this);
        this.z = mVar;
        com.ss.android.ugc.aweme.bullet.module.ad.e eVar = new com.ss.android.ugc.aweme.bullet.module.ad.e();
        eVar.f69368f = new b(this);
        this.A = eVar;
        this.B = new f(this);
        this.f75915k = new z(this);
        MethodCollector.o(1678);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }

    public static final class h extends SingleWebChromeClient {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f75927a;

        /* renamed from: b */
        final /* synthetic */ a f75928b;

        static {
            Covode.recordClassIndex(46815);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            this.f75928b.getMFlTitleBar().a(str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SingleWebView singleWebView, WebView webView, a aVar) {
            super(webView);
            this.f75927a = singleWebView;
            this.f75928b = aVar;
        }
    }

    public static final class i extends com.ss.android.ugc.aweme.ad.feed.h.b {

        /* renamed from: a */
        final /* synthetic */ a f75929a;

        /* renamed from: b */
        final /* synthetic */ Activity f75930b;

        static {
            Covode.recordClassIndex(46816);
        }

        @Override // com.ss.android.ugc.aweme.base.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || !this.f75929a.getMBottomSheet().a()) {
                return false;
            }
            this.f75929a.f75912h = "back";
            this.f75929a.b();
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, Activity activity, Activity activity2) {
            super(activity2);
            this.f75929a = aVar;
            this.f75930b = activity;
        }
    }

    public final void a(String str, Boolean bool) {
        c cVar;
        getMBottomSheet().f75825h.c(3);
        getMFlTitleBar().b("");
        if (!getNeedPreload()) {
            d();
        }
        this.f75916l = str;
        if (h.f.b.l.a((Object) bool, (Object) true)) {
            getMBottomSheet().setHideable(false);
        }
        if (h.f.b.l.a((Object) PreRenderWebViewBusiness.a.a(3), (Object) str) && (cVar = this.x) != null) {
            cVar.c();
        }
    }

    public static void a(com.bytedance.ies.web.a.a aVar, String str, boolean z2, Map<String, Object> map) {
        map.put("code", Integer.valueOf(z2 ? 1 : 0));
        if (aVar != null) {
            aVar.a(str, new JSONObject(map));
        }
    }

    static final class n implements View.OnScrollChangeListener {

        /* renamed from: a */
        final /* synthetic */ a f75936a;

        static {
            Covode.recordClassIndex(46821);
        }

        n(a aVar) {
            this.f75936a = aVar;
        }

        public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
            boolean z;
            AdBottomSheetContainer mBottomSheet = this.f75936a.getMBottomSheet();
            if (i3 <= 0) {
                z = true;
            } else {
                z = false;
            }
            mBottomSheet.setHideable(z);
        }
    }

    static final class o implements View.OnScrollChangeListener {

        /* renamed from: a */
        final /* synthetic */ a f75937a;

        static {
            Covode.recordClassIndex(46822);
        }

        o(a aVar) {
            this.f75937a = aVar;
        }

        public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
            boolean z;
            AdBottomSheetContainer mBottomSheet = this.f75937a.getMBottomSheet();
            if (i3 <= 0) {
                z = true;
            } else {
                z = false;
            }
            mBottomSheet.setHideable(z);
        }
    }
}
