package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.h;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.ui.scroll.a;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.bullet.module.ad.i;
import com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.ss.android.ugc.aweme.commercialize.business.DownloadBusiness;
import com.ss.android.ugc.aweme.commercialize.business.ReportBusiness;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize.utils.aa;
import com.ss.android.ugc.aweme.commercialize.utils.ab;
import com.ss.android.ugc.aweme.commercialize.utils.ac;
import com.ss.android.ugc.aweme.commercialize.utils.bj;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BottomBanner;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.hh;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

public final class AdPopUpWebPageView extends FrameLayout implements au, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final b p = new b((byte) 0);
    private final h.h A;
    private int B;
    private int C;
    private final com.ss.android.ugc.aweme.bullet.a D;
    private final e E;
    private final View.OnTouchListener F;
    private final v G;
    private final o H;
    private HashMap I;

    /* renamed from: a  reason: collision with root package name */
    public bj f74303a;

    /* renamed from: b  reason: collision with root package name */
    public AdPopUpWebPageContainer f74304b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f74305c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f74306d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f74307e;

    /* renamed from: f  reason: collision with root package name */
    public String f74308f;

    /* renamed from: g  reason: collision with root package name */
    public b f74309g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f74310h;

    /* renamed from: i  reason: collision with root package name */
    public Runnable f74311i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f74312j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f74313k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f74314l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f74315m;
    public final q n;
    public final p o;
    private ac q;
    private d r;
    private a s;
    private c t;
    private h.f.a.a<? extends Object> u;
    private boolean v;
    private boolean w;
    private String x;
    private SingleWebChromeClient y;
    private final h.h z;

    public interface a {
        static {
            Covode.recordClassIndex(45846);
        }

        void a();

        void a(int i2);

        void a(int i2, Boolean bool);

        void a(String str);

        void b(int i2);
    }

    public interface c {
        static {
            Covode.recordClassIndex(45848);
        }

        void a();
    }

    public interface d {
        static {
            Covode.recordClassIndex(45849);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(45845);
    }

    public final View a(int i2) {
        if (this.I == null) {
            this.I = new HashMap();
        }
        View view = (View) this.I.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.I.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final com.ss.android.ugc.aweme.bullet.module.ad.i getBulletLoadListener() {
        return (com.ss.android.ugc.aweme.bullet.module.ad.i) this.A.getValue();
    }

    public final ab getLoadListener() {
        return (ab) this.z.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(145, new org.greenrobot.eventbus.g(AdPopUpWebPageView.class, "onPopUpPageCloseEvent", com.ss.android.ugc.aweme.ad.c.m.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
    }

    public static final class b {
        static {
            Covode.recordClassIndex(45847);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final boolean getFromTitleBarClick() {
        return this.w;
    }

    public final c getKeyDownCallBack() {
        return this.t;
    }

    public final a getMBehaviorCallback() {
        return this.s;
    }

    public final int getMDownX() {
        return this.B;
    }

    public final int getMDownY() {
        return this.C;
    }

    public final ac getParams() {
        return this.q;
    }

    public final String getRenderType() {
        return this.x;
    }

    public final d getTitleBarCallback() {
        return this.r;
    }

    public final void a(boolean z2) {
        if (this.f74305c) {
            SSWebView webView = ((CommonBizWebView) a(R.id.d7_)).getWebView();
            if (webView != null) {
                webView.destroy();
            }
        } else {
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) a(R.id.d79);
            h.f.b.l.b(crossPlatformWebView, "");
            WebView webView2 = (WebView) crossPlatformWebView.findViewById(R.id.fm8);
            if (webView2 != null) {
                webView2.destroy();
            }
        }
        if (!d() || z2) {
            ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().f74263d = true;
            AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer = (AdPopUpWebBottomSheetContainer) a(R.id.d70);
            if (adPopUpWebBottomSheetContainer.d() || adPopUpWebBottomSheetContainer.f74283h.f74265f == 6) {
                adPopUpWebBottomSheetContainer.f74283h.c(5);
            }
        } else {
            if (((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().b() != ((int) com.bytedance.common.utility.n.b(getContext(), 64.0f))) {
                a aVar = this.s;
                if (aVar != null) {
                    aVar.a(this.E.f74316a, false);
                }
                FrameLayout frameLayout = (FrameLayout) a(R.id.d74);
                h.f.b.l.b(frameLayout, "");
                frameLayout.setVisibility(8);
                RelativeLayout relativeLayout = (RelativeLayout) a(R.id.azr);
                h.f.b.l.b(relativeLayout, "");
                relativeLayout.setVisibility(0);
                RelativeLayout relativeLayout2 = (RelativeLayout) a(R.id.azr);
                h.f.b.l.b(relativeLayout2, "");
                relativeLayout2.setAlpha(1.0f);
            }
            ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().b((int) com.bytedance.common.utility.n.b(getContext(), 64.0f));
            ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).c();
        }
        com.ss.android.ugc.aweme.commercialize.utils.l.a(getContext());
        ((ImageView) a(R.id.dg)).removeCallbacks(this.f74311i);
        ((ImageView) a(R.id.dg)).removeCallbacks(this.f74312j);
    }

    public static final class t implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnimatorSet f74340b;

        static {
            Covode.recordClassIndex(45867);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t f74341a;

            static {
                Covode.recordClassIndex(45868);
            }

            a(t tVar) {
                this.f74341a = tVar;
            }

            public final void run() {
                this.f74341a.f74340b.start();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f74339a.f74311i == null) {
                this.f74339a.f74311i = new a(this);
            }
            ((ImageView) this.f74339a.a(R.id.dg)).postDelayed(this.f74339a.f74311i, 400);
        }

        t(AdPopUpWebPageView adPopUpWebPageView, AnimatorSet animatorSet) {
            this.f74339a = adPopUpWebPageView;
            this.f74340b = animatorSet;
        }
    }

    public static final class e implements AdPopUpWebBottomSheetContainer.b {

        /* renamed from: a  reason: collision with root package name */
        public int f74316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74317b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f74318c;

        static {
            Covode.recordClassIndex(45850);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.b
        public final void e() {
            this.f74316a = 6;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.b
        public final void c() {
            if (AdPopUpWebBottomSheetContainer.f74281i) {
                com.ss.android.ugc.aweme.commercialize.utils.l.a(this.f74318c);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.b
        public final void a() {
            String str;
            if (this.f74317b.d()) {
                ((AdPopUpWebBottomSheetContainer) this.f74317b.a(R.id.d70)).getBehavior().b((int) com.bytedance.common.utility.n.b(this.f74318c, 64.0f));
                if (this.f74317b.f74310h) {
                    AdPopUpWebPageView adPopUpWebPageView = this.f74317b;
                    b bVar = adPopUpWebPageView.f74309g;
                    if (bVar != null) {
                        str = bVar.f74376e;
                    } else {
                        str = null;
                    }
                    adPopUpWebPageView.a(str);
                    this.f74317b.f74310h = false;
                }
            }
            int i2 = this.f74316a;
            if (i2 != 3) {
                this.f74316a = 3;
                a mBehaviorCallback = this.f74317b.getMBehaviorCallback();
                if (mBehaviorCallback != null) {
                    mBehaviorCallback.b(i2);
                }
                FrameLayout frameLayout = (FrameLayout) this.f74317b.a(R.id.d74);
                h.f.b.l.b(frameLayout, "");
                frameLayout.setVisibility(0);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.b
        public final void b() {
            a mBehaviorCallback;
            if (this.f74317b.d()) {
                this.f74317b.b();
                this.f74317b.f74310h = true;
            }
            int i2 = this.f74316a;
            if (i2 != 4) {
                this.f74316a = 4;
                if (this.f74317b.d() && ((AdPopUpWebBottomSheetContainer) this.f74317b.a(R.id.d70)).getBehavior().b() == ((int) com.bytedance.common.utility.n.b(this.f74318c, 64.0f))) {
                    FrameLayout frameLayout = (FrameLayout) this.f74317b.a(R.id.d74);
                    h.f.b.l.b(frameLayout, "");
                    frameLayout.setVisibility(8);
                    ((FrameLayout) this.f74317b.a(R.id.d74)).setOnClickListener(null);
                    FrameLayout frameLayout2 = (FrameLayout) this.f74317b.a(R.id.d74);
                    h.f.b.l.b(frameLayout2, "");
                    frameLayout2.setClickable(false);
                    a mBehaviorCallback2 = this.f74317b.getMBehaviorCallback();
                    if (mBehaviorCallback2 != null) {
                        mBehaviorCallback2.a(i2, false);
                    }
                }
            } else if (this.f74317b.d() && (mBehaviorCallback = this.f74317b.getMBehaviorCallback()) != null) {
                mBehaviorCallback.a(i2, true);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.b
        public final void d() {
            AdPopUpWebPageContainer adPopUpWebPageContainer;
            com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness;
            AdWebStatBusiness adWebStatBusiness;
            int i2 = this.f74316a;
            if (i2 != 5) {
                this.f74316a = 5;
                if (this.f74317b.f74305c) {
                    this.f74317b.getBulletLoadListener().a(true);
                } else {
                    this.f74317b.getLoadListener().a(true);
                }
                bj bjVar = this.f74317b.f74303a;
                if (bjVar != null) {
                    bjVar.a(false);
                }
                FrameLayout frameLayout = (FrameLayout) this.f74317b.a(R.id.d74);
                h.f.b.l.b(frameLayout, "");
                frameLayout.setVisibility(8);
                ((FrameLayout) this.f74317b.a(R.id.d74)).setOnClickListener(null);
                FrameLayout frameLayout2 = (FrameLayout) this.f74317b.a(R.id.d74);
                h.f.b.l.b(frameLayout2, "");
                frameLayout2.setClickable(false);
                if (!(this.f74317b.d() || (adPopUpWebPageContainer = this.f74317b.f74304b) == null || (crossPlatformBusiness = adPopUpWebPageContainer.getCrossPlatformBusiness()) == null || (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.a(AdWebStatBusiness.class)) == null)) {
                    adWebStatBusiness.a(true);
                }
                a mBehaviorCallback = this.f74317b.getMBehaviorCallback();
                if (mBehaviorCallback != null) {
                    mBehaviorCallback.a(i2);
                }
                this.f74317b.f74306d = false;
                if (this.f74317b.f74305c) {
                    this.f74317b.getBulletLoadListener().f69376g = true;
                    com.bytedance.ies.bullet.c.c.i iVar = (com.bytedance.ies.bullet.c.c.i) ((BulletContainerView) this.f74317b.a(R.id.d7_)).getProviderFactory().c(com.bytedance.ies.bullet.c.c.i.class);
                    if (iVar != null) {
                        iVar.k();
                    }
                } else {
                    this.f74317b.getLoadListener().f75545f = true;
                    ((CrossPlatformWebView) this.f74317b.a(R.id.d79)).a("onHide", (JSONObject) null, "");
                }
                this.f74317b.b();
                this.f74317b.f74310h = true;
            }
        }

        e(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f74317b = adPopUpWebPageView;
            this.f74318c = context;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer.b
        public final void a(View view, float f2) {
            h.f.b.l.d(view, "");
            if (this.f74317b.d()) {
                float a2 = (float) (com.ss.android.ugc.aweme.base.utils.i.a(this.f74318c) - view.getTop());
                if (a2 > com.bytedance.common.utility.n.b(this.f74318c, 400.0f)) {
                    RelativeLayout relativeLayout = (RelativeLayout) this.f74317b.a(R.id.azr);
                    h.f.b.l.b(relativeLayout, "");
                    relativeLayout.setVisibility(8);
                } else {
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.f74317b.a(R.id.azr);
                    h.f.b.l.b(relativeLayout2, "");
                    relativeLayout2.setVisibility(0);
                }
                if (a2 > com.bytedance.common.utility.n.b(this.f74318c, 400.0f)) {
                    RelativeLayout relativeLayout3 = (RelativeLayout) this.f74317b.a(R.id.azr);
                    h.f.b.l.b(relativeLayout3, "");
                    relativeLayout3.setAlpha(0.0f);
                    RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.f74317b.a(R.id.d73);
                    h.f.b.l.b(roundedFrameLayout, "");
                    roundedFrameLayout.setAlpha(1.0f);
                } else if (a2 >= com.bytedance.common.utility.n.b(this.f74318c, 300.0f) && a2 <= com.bytedance.common.utility.n.b(this.f74318c, 400.0f)) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) this.f74317b.a(R.id.azr);
                    h.f.b.l.b(relativeLayout4, "");
                    relativeLayout4.setAlpha(0.0f);
                    RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) this.f74317b.a(R.id.d73);
                    h.f.b.l.b(roundedFrameLayout2, "");
                    roundedFrameLayout2.setAlpha(((1.0f - ((com.bytedance.common.utility.n.b(this.f74318c, 400.0f) - a2) / com.bytedance.common.utility.n.b(this.f74318c, 100.0f))) * 0.9f) + 0.1f);
                } else if (a2 < com.bytedance.common.utility.n.b(this.f74318c, 200.0f) || a2 >= com.bytedance.common.utility.n.b(this.f74318c, 300.0f)) {
                    RoundedFrameLayout roundedFrameLayout3 = (RoundedFrameLayout) this.f74317b.a(R.id.d73);
                    h.f.b.l.b(roundedFrameLayout3, "");
                    roundedFrameLayout3.setAlpha(0.0f);
                    RelativeLayout relativeLayout5 = (RelativeLayout) this.f74317b.a(R.id.azr);
                    h.f.b.l.b(relativeLayout5, "");
                    relativeLayout5.setAlpha(1.0f);
                } else {
                    RoundedFrameLayout roundedFrameLayout4 = (RoundedFrameLayout) this.f74317b.a(R.id.d73);
                    h.f.b.l.b(roundedFrameLayout4, "");
                    roundedFrameLayout4.setAlpha(0.0f);
                    RelativeLayout relativeLayout6 = (RelativeLayout) this.f74317b.a(R.id.azr);
                    h.f.b.l.b(relativeLayout6, "");
                    relativeLayout6.setAlpha((com.bytedance.common.utility.n.b(this.f74318c, 300.0f) - a2) / com.bytedance.common.utility.n.b(this.f74318c, 100.0f));
                }
                FrameLayout frameLayout = (FrameLayout) this.f74317b.a(R.id.d74);
                h.f.b.l.b(frameLayout, "");
                frameLayout.setVisibility(0);
                FrameLayout frameLayout2 = (FrameLayout) this.f74317b.a(R.id.d74);
                h.f.b.l.b(frameLayout2, "");
                frameLayout2.setAlpha(1.0f - (((float) view.getTop()) / (((float) com.ss.android.ugc.aweme.base.utils.i.a(this.f74318c)) - com.bytedance.common.utility.n.b(this.f74318c, 64.0f))));
                return;
            }
            RelativeLayout relativeLayout7 = (RelativeLayout) this.f74317b.a(R.id.azr);
            h.f.b.l.b(relativeLayout7, "");
            relativeLayout7.setVisibility(8);
            if (Float.isNaN(f2)) {
                FrameLayout frameLayout3 = (FrameLayout) this.f74317b.a(R.id.d74);
                h.f.b.l.b(frameLayout3, "");
                frameLayout3.setAlpha(1.0f);
            } else if (f2 < 0.0f) {
                float abs = Math.abs(f2);
                FrameLayout frameLayout4 = (FrameLayout) this.f74317b.a(R.id.d74);
                h.f.b.l.b(frameLayout4, "");
                frameLayout4.setAlpha(1.0f - abs);
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.bullet.module.ad.i> {
        final /* synthetic */ AdPopUpWebPageView this$0;

        static {
            Covode.recordClassIndex(45851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AdPopUpWebPageView adPopUpWebPageView) {
            super(0);
            this.this$0 = adPopUpWebPageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.bullet.module.ad.i invoke() {
            com.ss.android.ugc.aweme.bullet.module.ad.i iVar = new com.ss.android.ugc.aweme.bullet.module.ad.i();
            iVar.f69375f = this.this$0.o;
            return iVar;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<ab> {
        final /* synthetic */ AdPopUpWebPageView this$0;

        static {
            Covode.recordClassIndex(45861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(AdPopUpWebPageView adPopUpWebPageView) {
            super(0);
            this.this$0 = adPopUpWebPageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ab invoke() {
            ab abVar = new ab();
            abVar.f75544e = this.this$0.n;
            return abVar;
        }
    }

    public final a getActionMode() {
        return ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getActionMode();
    }

    public static final class u implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74342a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f74343b;

        static {
            Covode.recordClassIndex(45869);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ u f74344a;

            static {
                Covode.recordClassIndex(45870);
            }

            a(u uVar) {
                this.f74344a = uVar;
            }

            public final void run() {
                ImageView imageView = (ImageView) this.f74344a.f74342a.a(R.id.dg);
                h.f.b.l.b(imageView, "");
                imageView.setAlpha(1.0f);
                this.f74344a.f74343b.start();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f74342a.f74312j == null) {
                this.f74342a.f74312j = new a(this);
            }
            ((ImageView) this.f74342a.a(R.id.dg)).postDelayed(this.f74342a.f74312j, 400);
        }

        u(AdPopUpWebPageView adPopUpWebPageView, ObjectAnimator objectAnimator) {
            this.f74342a = adPopUpWebPageView;
            this.f74343b = objectAnimator;
        }
    }

    public static final class v implements AdPopUpWebTitleBar.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f74346b;

        static {
            Covode.recordClassIndex(45871);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.b
        public final void a() {
            this.f74345a.f74308f = "button";
            this.f74345a.a(false);
            d titleBarCallback = this.f74345a.getTitleBarCallback();
            if (titleBarCallback != null) {
                titleBarCallback.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.b
        public final void b() {
            if (this.f74345a.f74305c) {
                ((CommonBizWebView) this.f74345a.a(R.id.d7_)).g();
            } else {
                ((CrossPlatformWebView) this.f74345a.a(R.id.d79)).a();
            }
            this.f74345a.getTitleBarCallback();
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.b
        public final void d() {
            if (!this.f74345a.h()) {
                return;
            }
            if (this.f74345a.f74307e) {
                ShareH5Service a2 = ShareH5Service.a.a();
                CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) this.f74345a.a(R.id.d79);
                h.f.b.l.b(crossPlatformWebView, "");
                com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness = crossPlatformWebView.getCrossPlatformBusiness();
                SingleWebView a3 = ((com.ss.android.ugc.aweme.crossplatform.view.j) ((CrossPlatformWebView) this.f74345a.a(R.id.d79)).a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a();
                h.f.b.l.b(a3, "");
                a2.a(crossPlatformBusiness, a3, 2);
                return;
            }
            ShareH5Service a4 = ShareH5Service.a.a();
            CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) this.f74345a.a(R.id.d79);
            h.f.b.l.b(crossPlatformWebView2, "");
            a4.a(crossPlatformWebView2.getCrossPlatformBusiness(), 2);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar.b
        public final void c() {
            com.ss.android.ugc.aweme.crossplatform.d.a aVar;
            ReportBusiness reportBusiness;
            com.bytedance.ies.bullet.service.f.a.b bVar;
            String f2;
            com.ss.android.ugc.aweme.bullet.business.b bVar2;
            Context context = this.f74346b;
            com.ss.android.ugc.aweme.bullet.module.base.e eVar = null;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                if (this.f74345a.f74305c) {
                    com.ss.android.ugc.aweme.bullet.module.base.b rootContainer = ((CommonBizWebView) this.f74345a.a(R.id.d7_)).getRootContainer();
                    if (rootContainer == null || (bVar2 = rootContainer.z) == null) {
                        bVar = null;
                    } else {
                        bVar = bVar2.b();
                    }
                    if (bVar instanceof com.ss.android.ugc.aweme.bullet.module.ad.j) {
                        eVar = bVar;
                    }
                    com.ss.android.ugc.aweme.bullet.module.base.e eVar2 = eVar;
                    if (eVar2 != null && (f2 = eVar2.f()) != null) {
                        com.ss.android.ugc.aweme.bullet.module.base.b rootContainer2 = ((CommonBizWebView) this.f74345a.a(R.id.d7_)).getRootContainer();
                        if (!(rootContainer2 == null || rootContainer2.z.a(com.ss.android.ugc.aweme.bullet.business.ReportBusiness.class) == null)) {
                            com.ss.android.ugc.aweme.bullet.business.ReportBusiness.a(activity, f2);
                        }
                    } else {
                        return;
                    }
                } else {
                    CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) this.f74345a.a(R.id.d79);
                    h.f.b.l.b(crossPlatformWebView, "");
                    com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams = crossPlatformWebView.getCrossPlatformParams();
                    if (crossPlatformParams != null && (aVar = crossPlatformParams.f78741a) != null && aVar.f78737j != null) {
                        CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) this.f74345a.a(R.id.d79);
                        h.f.b.l.b(crossPlatformWebView2, "");
                        com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness = crossPlatformWebView2.getCrossPlatformBusiness();
                        if (!(crossPlatformBusiness == null || (reportBusiness = (ReportBusiness) crossPlatformBusiness.a(ReportBusiness.class)) == null)) {
                            reportBusiness.a(activity);
                        }
                    } else {
                        return;
                    }
                }
                d titleBarCallback = this.f74345a.getTitleBarCallback();
                if (titleBarCallback != null) {
                    titleBarCallback.b();
                }
            }
        }

        v(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f74345a = adPopUpWebPageView;
            this.f74346b = context;
        }
    }

    private final boolean i() {
        ac acVar;
        com.ss.android.ugc.aweme.landpage.b.a aVar = com.ss.android.ugc.aweme.landpage.b.a.f107275a;
        ac acVar2 = this.q;
        AwemeRawAd awemeRawAd = null;
        if (acVar2 != null) {
            awemeRawAd = acVar2.f75551f;
        }
        if ((aVar.a(awemeRawAd) || ((acVar = this.q) != null && acVar.f75553h != null)) && this.f74305c) {
            return true;
        }
        return false;
    }

    private boolean j() {
        if (((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getActionMode().f74371i == 4) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getActionMode().f74371i == 5) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getActionMode().f74371i == 1) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer = (AdPopUpWebBottomSheetContainer) a(R.id.d70);
        if (adPopUpWebBottomSheetContainer == null || !adPopUpWebBottomSheetContainer.d()) {
            return false;
        }
        return true;
    }

    public final WebView getWebView() {
        return ((com.ss.android.ugc.aweme.crossplatform.view.j) ((CrossPlatformWebView) a(R.id.d79)).a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a();
    }

    public final boolean h() {
        ac acVar;
        AwemeRawAd awemeRawAd;
        ac acVar2 = this.q;
        if ((acVar2 == null || !acVar2.f75552g) && ((acVar = this.q) == null || (awemeRawAd = acVar.f75551f) == null || awemeRawAd.getWebviewPannelStyle() != 1)) {
            return false;
        }
        return true;
    }

    public static final class o implements AdPopUpWebNaviBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74332a;

        static {
            Covode.recordClassIndex(45862);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar.a
        public final void a() {
            if (this.f74332a.f74305c) {
                ((CommonBizWebView) this.f74332a.a(R.id.d7_)).g();
            } else {
                ((CrossPlatformWebView) this.f74332a.a(R.id.d79)).a();
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar.a
        public final void b() {
            if (this.f74332a.f74305c) {
                SSWebView sSWebView = ((CommonBizWebView) this.f74332a.a(R.id.d7_)).f69389l;
                if (sSWebView != null && sSWebView.canGoForward()) {
                    sSWebView.goForward();
                    return;
                }
                return;
            }
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) this.f74332a.a(R.id.d79);
            if (crossPlatformWebView.f78938c != 2) {
                SingleWebView singleWebView = crossPlatformWebView.f78936a;
                if (singleWebView == null) {
                    h.f.b.l.a("singleWebView");
                }
                if (singleWebView.canGoForward()) {
                    SingleWebView singleWebView2 = crossPlatformWebView.f78936a;
                    if (singleWebView2 == null) {
                        h.f.b.l.a("singleWebView");
                    }
                    singleWebView2.goForward();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(AdPopUpWebPageView adPopUpWebPageView) {
            this.f74332a = adPopUpWebPageView;
        }
    }

    public static final class p implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f74334b;

        static {
            Covode.recordClassIndex(45863);
        }

        @Override // com.ss.android.ugc.aweme.bullet.module.ad.i.a
        public final void a() {
            FrameLayout frameLayout = (FrameLayout) this.f74333a.a(R.id.d78);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(8);
            View findViewById = ((CrossPlatformWebView) this.f74333a.a(R.id.d79)).findViewById(R.id.axu);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        @Override // com.ss.android.ugc.aweme.bullet.module.ad.i.a
        public final void b() {
            FrameLayout frameLayout = (FrameLayout) this.f74333a.a(R.id.d78);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(0);
            View findViewById = ((CrossPlatformWebView) this.f74333a.a(R.id.d79)).findViewById(R.id.axu);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        @Override // com.ss.android.ugc.aweme.bullet.module.ad.i.a
        public final void c() {
            Context context = this.f74334b;
            String str = null;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null || !activity.isFinishing()) {
                this.f74333a.f74307e = true;
                boolean z = false;
                if (this.f74333a.f74314l) {
                    SSWebView webView = ((CommonBizWebView) this.f74333a.a(R.id.d7_)).getWebView();
                    if (webView != null) {
                        str = webView.getUrl();
                    }
                    if (!h.f.b.l.a((Object) "about:blank", (Object) str)) {
                        this.f74333a.f74314l = false;
                        this.f74333a.c();
                    }
                }
                if (this.f74333a.h()) {
                    ((AdPopUpWebTitleBar) this.f74333a.a(R.id.d7g)).c();
                    ((RoundedFrameLayout) this.f74333a.a(R.id.d7c)).setBackgroundResource(R.drawable.ph);
                    if (!this.f74333a.f74315m && ((CommonBizWebView) this.f74333a.a(R.id.d7_)).h()) {
                        AdPopUpWebNaviBar adPopUpWebNaviBar = (AdPopUpWebNaviBar) this.f74333a.a(R.id.d75);
                        h.f.b.l.b(adPopUpWebNaviBar, "");
                        if (adPopUpWebNaviBar.getVisibility() == 8) {
                            AdPopUpWebNaviBar adPopUpWebNaviBar2 = (AdPopUpWebNaviBar) this.f74333a.a(R.id.d75);
                            h.f.b.l.b(adPopUpWebNaviBar2, "");
                            adPopUpWebNaviBar2.setVisibility(0);
                        }
                    }
                    ((AdPopUpWebNaviBar) this.f74333a.a(R.id.d75)).setGoBackEnable(((CommonBizWebView) this.f74333a.a(R.id.d7_)).h());
                    AdPopUpWebNaviBar adPopUpWebNaviBar3 = (AdPopUpWebNaviBar) this.f74333a.a(R.id.d75);
                    SSWebView sSWebView = ((CommonBizWebView) this.f74333a.a(R.id.d7_)).f69389l;
                    if (sSWebView != null) {
                        z = sSWebView.canGoForward();
                    }
                    adPopUpWebNaviBar3.setGoForwardEnable(z);
                    return;
                }
                WebView webView2 = this.f74333a.getWebView();
                if (webView2 == null) {
                    return;
                }
                if (webView2.canGoBack()) {
                    ((AdPopUpWebTitleBar) this.f74333a.a(R.id.d7g)).b();
                } else {
                    ((AdPopUpWebTitleBar) this.f74333a.a(R.id.d7g)).c();
                }
            }
        }

        p(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f74333a = adPopUpWebPageView;
            this.f74334b = context;
        }
    }

    public static final class q implements ab.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f74336b;

        static {
            Covode.recordClassIndex(45864);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.ab.a
        public final void a() {
            FrameLayout frameLayout = (FrameLayout) this.f74335a.a(R.id.d78);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(8);
            View findViewById = ((CrossPlatformWebView) this.f74335a.a(R.id.d79)).findViewById(R.id.axu);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.ab.a
        public final void b() {
            FrameLayout frameLayout = (FrameLayout) this.f74335a.a(R.id.d78);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(0);
            View findViewById = ((CrossPlatformWebView) this.f74335a.a(R.id.d79)).findViewById(R.id.axu);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
            if (r1.canGoForward() != false) goto L_0x00e8;
         */
        @Override // com.ss.android.ugc.aweme.commercialize.utils.ab.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c() {
            /*
            // Method dump skipped, instructions count: 282
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.q.c():void");
        }

        q(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f74335a = adPopUpWebPageView;
            this.f74336b = context;
        }
    }

    public final void c() {
        if (this.f74305c) {
            SSWebView webView = ((CommonBizWebView) a(R.id.d7_)).getWebView();
            if (webView != null) {
                webView.clearHistory();
                return;
            }
            return;
        }
        SingleWebView singleWebView = ((CrossPlatformWebView) a(R.id.d79)).f78936a;
        if (singleWebView == null) {
            h.f.b.l.a("singleWebView");
        }
        singleWebView.clearHistory();
    }

    public final boolean d() {
        if (((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getActionMode().f74371i == 4 || ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getActionMode().f74371i == 5 || ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getActionMode().f74371i == 6) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.f74314l = true;
        if (this.f74305c) {
            SSWebView webView = ((CommonBizWebView) a(R.id.d7_)).getWebView();
            if (webView != null) {
                webView.loadUrl("about:blank");
                return;
            }
            return;
        }
        CrossPlatformWebView.a((CrossPlatformWebView) a(R.id.d79), "about:blank", false, null, 6);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        com.ss.android.ugc.aweme.bullet.business.b bVar;
        DownloadBusiness downloadBusiness;
        if (this.f74305c) {
            com.ss.android.ugc.aweme.bullet.module.base.b rootContainer = ((CommonBizWebView) a(R.id.d7_)).getRootContainer();
            if (!(rootContainer == null || (bVar = rootContainer.z) == null || (downloadBusiness = (DownloadBusiness) bVar.a(DownloadBusiness.class)) == null)) {
                downloadBusiness.a();
            }
            ((BulletContainerView) a(R.id.d7_)).a();
        } else {
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.f74304b;
            if (adPopUpWebPageContainer != null) {
                adPopUpWebPageContainer.a();
            }
        }
        cg.b(this);
        super.onDetachedFromWindow();
        bj bjVar = this.f74303a;
        if (bjVar != null) {
            bjVar.a(false);
        }
        this.f74303a = null;
    }

    private final void k() {
        if (this.v) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a(R.id.dg), "translationY", com.bytedance.common.utility.n.b(getContext(), 6.0f), com.bytedance.common.utility.n.b(getContext(), -4.0f));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a(R.id.dg), "translationY", com.bytedance.common.utility.n.b(getContext(), -4.0f), com.bytedance.common.utility.n.b(getContext(), -6.0f));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a(R.id.dg), "translationY", com.bytedance.common.utility.n.b(getContext(), 6.0f), 0.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a(R.id.dg), "translationY", 0.0f, com.bytedance.common.utility.n.b(getContext(), -4.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(a(R.id.dg), "alpha", 1.0f, 0.0f);
            h.f.b.l.b(ofFloat, "");
            ofFloat.setDuration(500L);
            h.f.b.l.b(ofFloat2, "");
            ofFloat2.setDuration(100L);
            h.f.b.l.b(ofFloat3, "");
            ofFloat3.setDuration(300L);
            h.f.b.l.b(ofFloat4, "");
            ofFloat4.setDuration(300L);
            h.f.b.l.b(ofFloat5, "");
            ofFloat5.setDuration(100L);
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet.play(ofFloat4).before(ofFloat2);
            animatorSet.play(ofFloat2).with(ofFloat5);
            animatorSet2.play(ofFloat).before(ofFloat2).with(ofFloat5);
            animatorSet2.play(ofFloat2).with(ofFloat5);
            animatorSet.addListener(new t(this, animatorSet2));
            animatorSet2.addListener(new u(this, ofFloat3));
            animatorSet.start();
        }
    }

    public final void a() {
        com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness;
        AdWebStatBusiness adWebStatBusiness;
        AdPopUpWebPageContainer adPopUpWebPageContainer = this.f74304b;
        if (adPopUpWebPageContainer != null && (crossPlatformBusiness = adPopUpWebPageContainer.getCrossPlatformBusiness()) != null && (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.a(AdWebStatBusiness.class)) != null) {
            adWebStatBusiness.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        Bundle bundle;
        AnchorLynxModel anchorLynxModel;
        int i2;
        androidx.lifecycle.m mVar;
        androidx.lifecycle.m mVar2;
        com.ss.android.ugc.aweme.bullet.business.b bVar;
        DownloadBusiness downloadBusiness;
        String str;
        MethodCollector.i(9520);
        super.onAttachedToWindow();
        ac acVar = this.q;
        if (acVar == null || (bundle = acVar.f75550e) == null) {
            MethodCollector.o(9520);
            return;
        }
        ac acVar2 = this.q;
        if (acVar2 != null) {
            anchorLynxModel = acVar2.f75553h;
        } else {
            anchorLynxModel = null;
        }
        if (anchorLynxModel != null) {
            this.f74305c = true;
        }
        cg.a(this);
        View.inflate(getContext(), R.layout.a99, this);
        FrameLayout frameLayout = (FrameLayout) a(R.id.d19);
        h.f.b.l.b(frameLayout, "");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ac acVar3 = this.q;
            if (acVar3 != null) {
                i2 = acVar3.f75548c;
            } else {
                i2 = 0;
            }
            marginLayoutParams.topMargin = i2;
            frameLayout.requestLayout();
            int b2 = com.ss.android.ugc.aweme.base.utils.i.b(getContext());
            int a2 = com.ss.android.ugc.aweme.base.utils.i.a(getContext());
            aa.f75537h = (a2 - com.ss.android.ugc.aweme.base.utils.i.b()) / b2;
            aa.f75535f = b2;
            aa.f75536g = a2;
            AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer = (AdPopUpWebBottomSheetContainer) a(R.id.d70);
            RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) a(R.id.d7c);
            h.f.b.l.b(roundedFrameLayout, "");
            h.f.b.l.d(roundedFrameLayout, "");
            ViewGroup.LayoutParams layoutParams2 = roundedFrameLayout.getLayoutParams();
            if (layoutParams2 != null) {
                ((CoordinatorLayout.e) layoutParams2).a(adPopUpWebBottomSheetContainer.f74283h);
                String string = bundle.getString("title");
                if (TextUtils.isEmpty(string)) {
                    string = bundle.getString("bundle_web_title");
                }
                if (TextUtils.isEmpty(string)) {
                    ac acVar4 = this.q;
                    if (acVar4 != null) {
                        str = acVar4.f75546a;
                    } else {
                        str = null;
                    }
                    string = Uri.parse(str).getQueryParameter("title");
                }
                AdPopUpWebTitleBar adPopUpWebTitleBar = (AdPopUpWebTitleBar) a(R.id.d7g);
                adPopUpWebTitleBar.a(string);
                com.bytedance.ies.dmt.ui.f.c.a(adPopUpWebTitleBar.a(R.id.d71), 0.5f);
                com.bytedance.ies.dmt.ui.f.c.a(adPopUpWebTitleBar.a(R.id.d72), 0.5f);
                com.bytedance.ies.dmt.ui.f.c.a(adPopUpWebTitleBar.a(R.id.d7a), 0.5f);
                com.bytedance.ies.dmt.ui.f.c.a(adPopUpWebTitleBar.a(R.id.d7d), 0.5f);
                com.bytedance.ies.dmt.ui.f.c.a(adPopUpWebTitleBar.a(R.id.a49), 0.5f);
                ((AutoRTLImageView) adPopUpWebTitleBar.a(R.id.d72)).setOnClickListener(new AdPopUpWebTitleBar.c(adPopUpWebTitleBar));
                ((TuxIconView) adPopUpWebTitleBar.a(R.id.a49)).setOnClickListener(new AdPopUpWebTitleBar.d(adPopUpWebTitleBar));
                ((TuxIconView) adPopUpWebTitleBar.a(R.id.d7a)).setOnClickListener(new AdPopUpWebTitleBar.e(adPopUpWebTitleBar));
                ((TuxIconView) adPopUpWebTitleBar.a(R.id.d71)).setOnClickListener(new AdPopUpWebTitleBar.f(adPopUpWebTitleBar));
                ((AutoRTLImageView) adPopUpWebTitleBar.a(R.id.d7d)).setOnClickListener(new AdPopUpWebTitleBar.g(adPopUpWebTitleBar));
                if (bundle.getBoolean("isFromChallenge")) {
                    AdPopUpWebTitleBar adPopUpWebTitleBar2 = (AdPopUpWebTitleBar) a(R.id.d7g);
                    AutoRTLImageView autoRTLImageView = (AutoRTLImageView) adPopUpWebTitleBar2.a(R.id.d72);
                    h.f.b.l.b(autoRTLImageView, "");
                    autoRTLImageView.setVisibility(8);
                    TuxIconView tuxIconView = (TuxIconView) adPopUpWebTitleBar2.a(R.id.a49);
                    h.f.b.l.b(tuxIconView, "");
                    tuxIconView.setVisibility(0);
                    TuxIconView tuxIconView2 = (TuxIconView) adPopUpWebTitleBar2.a(R.id.d7a);
                    h.f.b.l.b(tuxIconView2, "");
                    tuxIconView2.setVisibility(8);
                    TuxIconView tuxIconView3 = (TuxIconView) adPopUpWebTitleBar2.a(R.id.d71);
                    h.f.b.l.b(tuxIconView3, "");
                    tuxIconView3.setVisibility(8);
                    AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) adPopUpWebTitleBar2.a(R.id.d7d);
                    h.f.b.l.b(autoRTLImageView2, "");
                    autoRTLImageView2.setVisibility(8);
                    TuxTextView tuxTextView = (TuxTextView) adPopUpWebTitleBar2.a(R.id.d7f);
                    h.f.b.l.b(tuxTextView, "");
                    tuxTextView.setVisibility(8);
                }
                if (this.f74305c) {
                    CommonBizWebView commonBizWebView = (CommonBizWebView) a(R.id.d7_);
                    h.f.b.l.b(commonBizWebView, "");
                    commonBizWebView.setVisibility(0);
                    CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) a(R.id.d79);
                    h.f.b.l.b(crossPlatformWebView, "");
                    crossPlatformWebView.setVisibility(8);
                    ((CommonBizWebView) a(R.id.d7_)).setScrollListener(new k(this, bundle));
                } else {
                    ((com.ss.android.ugc.aweme.crossplatform.view.j) ((CrossPlatformWebView) a(R.id.d79)).a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a().setWebScrollListener(new l(this, bundle));
                }
                if (h()) {
                    ((RoundedFrameLayout) a(R.id.d7c)).setBackgroundResource(R.drawable.pi);
                    ((RoundedFrameLayout) a(R.id.d7c)).setRadius(0);
                    ((CrossPlatformWebView) a(R.id.d79)).setShouldShowProgressBarBg(true);
                }
                com.bytedance.ies.dmt.ui.f.c.a(a(R.id.d7b), 0.5f);
                TuxTextView tuxTextView2 = (TuxTextView) a(R.id.aiq);
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                } else if (d()) {
                    RelativeLayout relativeLayout = (RelativeLayout) a(R.id.azr);
                    h.f.b.l.b(relativeLayout, "");
                    relativeLayout.setVisibility(0);
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().t = true;
                } else {
                    RelativeLayout relativeLayout2 = (RelativeLayout) a(R.id.azr);
                    h.f.b.l.b(relativeLayout2, "");
                    relativeLayout2.setVisibility(8);
                }
                Context context = getContext();
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    WebView webView = getWebView();
                    if (webView != null) {
                        g gVar = new g(webView, webView, this);
                        this.y = gVar;
                        webView.setWebChromeClient(gVar);
                    }
                    this.f74303a = new h(this, activity, activity);
                    if (this.f74305c) {
                        ac acVar5 = this.q;
                        if (!(acVar5 == null || (mVar2 = acVar5.f75547b) == null)) {
                            ((CommonBizWebView) a(R.id.d7_)).a(com.ss.android.ugc.aweme.bullet.b.a().a(), getBulletLoadListener(), new BulletActivityWrapper(activity), mVar2, "ad_commerce");
                            com.ss.android.ugc.aweme.bullet.module.base.b rootContainer = ((CommonBizWebView) a(R.id.d7_)).getRootContainer();
                            if (!(rootContainer == null || (bVar = rootContainer.z) == null || (downloadBusiness = (DownloadBusiness) bVar.a(DownloadBusiness.class)) == null)) {
                                downloadBusiness.f73743b = R.id.g2;
                                downloadBusiness.f73744c = R.id.g1;
                            }
                        }
                    } else {
                        ac acVar6 = this.q;
                        if (!(acVar6 == null || (mVar = acVar6.f75547b) == null)) {
                            CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) a(R.id.d79);
                            h.f.b.l.b(crossPlatformWebView2, "");
                            AdPopUpWebPageContainer a3 = AdPopUpWebPageContainer.a.a(activity, crossPlatformWebView2, getLoadListener(), bundle, mVar);
                            this.f74304b = a3;
                            SingleWebChromeClient singleWebChromeClient = this.y;
                            if (singleWebChromeClient != null) {
                                singleWebChromeClient.f78858f = a3;
                            }
                        }
                    }
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).setCallback(this.E);
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().n = true;
                    ((TuxTextView) a(R.id.d7b)).setOnClickListener(new i(this));
                    ((AdPopUpWebTitleBar) a(R.id.d7g)).setTitleBarListener(this.G);
                    ((AdPopUpWebNaviBar) a(R.id.d75)).setNaviBarListener(this.H);
                    ((AdPopUpWebTitleBar) a(R.id.d7g)).setOnTouchListener(new j(this));
                    if (this.f74305c) {
                        ((CommonBizWebView) a(R.id.d7_)).setOutTouchDelegate(this.F);
                    } else {
                        ((CrossPlatformWebView) a(R.id.d79)).setWebViewTouchListener(this.F);
                        if (h()) {
                            ShareH5Service a4 = ShareH5Service.a.a();
                            CrossPlatformWebView crossPlatformWebView3 = (CrossPlatformWebView) a(R.id.d79);
                            h.f.b.l.b(crossPlatformWebView3, "");
                            com.ss.android.ugc.aweme.crossplatform.business.g crossPlatformBusiness = crossPlatformWebView3.getCrossPlatformBusiness();
                            SingleWebView a5 = ((com.ss.android.ugc.aweme.crossplatform.view.j) ((CrossPlatformWebView) a(R.id.d79)).a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a();
                            h.f.b.l.b(a5, "");
                            a4.b(crossPlatformBusiness, a5, 2);
                        }
                    }
                    if (h()) {
                        ((AdPopUpWebTitleBar) a(R.id.d7g)).a();
                        int a6 = com.ss.android.ugc.aweme.base.utils.n.a(52.5d);
                        CrossPlatformWebView crossPlatformWebView4 = (CrossPlatformWebView) a(R.id.d79);
                        h.f.b.l.b(crossPlatformWebView4, "");
                        a(crossPlatformWebView4, a6);
                        CommonBizWebView commonBizWebView2 = (CommonBizWebView) a(R.id.d7_);
                        h.f.b.l.b(commonBizWebView2, "");
                        a(commonBizWebView2, a6);
                        FrameLayout frameLayout2 = (FrameLayout) a(R.id.d78);
                        h.f.b.l.b(frameLayout2, "");
                        a(frameLayout2, a6);
                    }
                }
                h.f.a.a<? extends Object> aVar = this.u;
                if (aVar != null) {
                    aVar.invoke();
                    MethodCollector.o(9520);
                    return;
                }
                MethodCollector.o(9520);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            MethodCollector.o(9520);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        MethodCollector.o(9520);
        throw nullPointerException2;
    }

    public final void setFromAdButtonClick(boolean z2) {
        this.f74313k = z2;
    }

    public final void setFromTitleBarClick(boolean z2) {
        this.w = z2;
    }

    public final void setKeyDownCallBack(c cVar) {
        this.t = cVar;
    }

    public final void setMBehaviorCallback(a aVar) {
        this.s = aVar;
    }

    public final void setMDownX(int i2) {
        this.B = i2;
    }

    public final void setMDownY(int i2) {
        this.C = i2;
    }

    public final void setParams(ac acVar) {
        this.q = acVar;
    }

    public final void setShouldStartAnimation(boolean z2) {
        this.v = z2;
    }

    public final void setTitleBarCallback(d dVar) {
        this.r = dVar;
    }

    public final void setUseBullet(boolean z2) {
        this.f74305c = z2;
    }

    public static final class m extends com.ss.android.ugc.aweme.bullet.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74329a;

        static {
            Covode.recordClassIndex(45858);
        }

        public static final class a implements a.AbstractC1263a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.lynx.tasm.behavior.ui.scroll.a f74330a;

            static {
                Covode.recordClassIndex(45859);
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.a.AbstractC1263a
            public final void a() {
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.a.AbstractC1263a
            public final void a(int i2) {
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.a.AbstractC1263a
            public final void b() {
            }

            a(com.lynx.tasm.behavior.ui.scroll.a aVar) {
                this.f74330a = aVar;
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.a.AbstractC1263a
            public final void a(int i2, int i3, int i4, int i5) {
                boolean z;
                if (this.f74330a.getScrollY() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                AdPopUpWebBottomSheetContainer.f74281i = z;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(AdPopUpWebPageView adPopUpWebPageView) {
            this.f74329a = adPopUpWebPageView;
        }

        static final class b implements View.OnTouchListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f74331a;

            static {
                Covode.recordClassIndex(45860);
            }

            b(m mVar) {
                this.f74331a = mVar;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent == null) {
                    return false;
                }
                this.f74331a.f74329a.getActionMode().a(motionEvent);
                return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
            h.f.b.l.d(view, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(iVar, "");
            super.a(view, uri, iVar);
            if (view instanceof LynxView) {
                View findViewByName = ((LynxView) view).findViewByName("lynx-landing-page-scroll-view-container");
                if (!(findViewByName instanceof com.lynx.tasm.behavior.ui.scroll.a)) {
                    findViewByName = null;
                }
                com.lynx.tasm.behavior.ui.scroll.a aVar = (com.lynx.tasm.behavior.ui.scroll.a) findViewByName;
                if (aVar != null) {
                    aVar.setOnScrollListener(new a(aVar));
                }
                view.setOnTouchListener(new b(this));
            }
        }
    }

    public final void setRenderType(String str) {
        h.f.b.l.d(str, "");
        this.x = str;
    }

    /* access modifiers changed from: package-private */
    public static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74337a;

        static {
            Covode.recordClassIndex(45865);
        }

        r(AdPopUpWebPageView adPopUpWebPageView) {
            this.f74337a = adPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f74337a.a(false);
        }
    }

    public final void a(h.f.a.a<? extends Object> aVar) {
        if (a(R.id.d19) == null) {
            this.u = aVar;
        } else {
            aVar.invoke();
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74323a;

        static {
            Covode.recordClassIndex(45854);
        }

        i(AdPopUpWebPageView adPopUpWebPageView) {
            this.f74323a = adPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AdPopUpWebPageView adPopUpWebPageView = this.f74323a;
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) adPopUpWebPageView.a(R.id.d79);
            h.f.b.l.b(crossPlatformWebView, "");
            adPopUpWebPageView.a(crossPlatformWebView.getCurrentUrl());
        }
    }

    private final void setShouldHideBottomNavBar(String str) {
        this.f74315m = TextUtils.equals(Uri.parse(str).getQueryParameter("hide_bottom_nav_bar"), "1");
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onPopUpPageCloseEvent(com.ss.android.ugc.aweme.ad.c.m mVar) {
        h.f.b.l.d(mVar, "");
        if (mVar.f65604a == ((CommonBizWebView) a(R.id.d7_)).hashCode()) {
            a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74338a;

        static {
            Covode.recordClassIndex(45866);
        }

        s(AdPopUpWebPageView adPopUpWebPageView) {
            this.f74338a = adPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f74338a.setFromAdButtonClick(true);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.assem.popup.b.c());
            ((AdPopUpWebBottomSheetContainer) this.f74338a.a(R.id.d70)).a();
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.f74338a.f74304b;
            if (adPopUpWebPageContainer != null) {
                adPopUpWebPageContainer.b();
            }
        }
    }

    private static com.bytedance.lighten.a.a.a a(User user) {
        UrlModel avatarLarger;
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            avatarLarger = user.getAvatarMedium();
        } else if (user.getAvatarThumb() != null) {
            avatarLarger = user.getAvatarThumb();
        } else {
            if (user.getAvatarLarger() != null) {
                avatarLarger = user.getAvatarLarger();
            }
            return null;
        }
        if (avatarLarger != null) {
            return new com.bytedance.lighten.a.a.a(avatarLarger.getUrlList());
        }
        return null;
    }

    private final boolean b(String str) {
        String str2;
        AnchorLynxModel anchorLynxModel;
        ac acVar = this.q;
        if (acVar == null || (anchorLynxModel = acVar.f75553h) == null) {
            str2 = null;
        } else {
            str2 = anchorLynxModel.lynxSchema;
        }
        if (str2 != null && str2.length() != 0) {
            return true;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdPopUpWebPageView(Context context) {
        super(context, null, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(10365);
        this.f74305c = com.ss.android.ugc.aweme.commercialize.abtest.c.b();
        this.x = "";
        this.z = h.i.a((h.f.a.a) new n(this));
        this.A = h.i.a((h.f.a.a) new f(this));
        this.D = new m(this);
        this.E = new e(this, context);
        this.n = new q(this, context);
        this.o = new p(this, context);
        this.F = new w(this);
        this.G = new v(this, context);
        this.H = new o(this);
        MethodCollector.o(10365);
    }

    private final String a(AwemeRawAd awemeRawAd) {
        String str;
        ag nativeSiteConfig;
        String str2 = null;
        if (!com.ss.android.ugc.aweme.landpage.b.a.f107275a.a(awemeRawAd)) {
            return null;
        }
        if (awemeRawAd == null || (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) == null || (str = nativeSiteConfig.getLynxScheme()) == null) {
            str = "";
        }
        Bundle bundle = new Bundle();
        bundle.putString("landPageShowType", String.valueOf(com.ss.android.ugc.aweme.ad.utils.a.a(awemeRawAd)));
        Uri.Builder buildUpon = Uri.parse(com.ss.android.ugc.aweme.commercialize.util.d.a(str, bundle)).buildUpon();
        buildUpon.appendQueryParameter("lynx_landing_page_data", com.ss.android.ugc.aweme.profile.service.a.f116616a.getAdLynxLandPageUtil().a(awemeRawAd, getContext()));
        if (awemeRawAd != null) {
            str2 = awemeRawAd.getWebTitle();
        }
        buildUpon.appendQueryParameter("lynx_landing_page_title", str2);
        String builder = buildUpon.toString();
        h.f.b.l.b(builder, "");
        return builder;
    }

    private final boolean c(String str) {
        AnchorLynxModel anchorLynxModel;
        if (!i()) {
            return TextUtils.equals(Uri.parse(str).getQueryParameter("hide_title_bar"), "1");
        }
        ac acVar = this.q;
        AwemeRawAd awemeRawAd = null;
        r1 = null;
        String a2 = null;
        if (acVar == null || acVar.f75553h == null) {
            ac acVar2 = this.q;
            if (acVar2 != null) {
                awemeRawAd = acVar2.f75551f;
            }
            a2 = a(awemeRawAd);
        } else {
            ac acVar3 = this.q;
            if (!(acVar3 == null || (anchorLynxModel = acVar3.f75553h) == null)) {
                a2 = anchorLynxModel.lynxSchema;
            }
        }
        return TextUtils.equals(Uri.parse(a2).getQueryParameter("hide_title_bar"), "1");
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getActionMode().f74371i == 3 && ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().f74265f != 3) {
                getActionMode().a(motionEvent);
            }
            Integer valueOf = Integer.valueOf(motionEvent.getAction());
            if (valueOf != null) {
                if (valueOf.intValue() == 0) {
                    this.B = (int) motionEvent.getX();
                    this.C = (int) motionEvent.getY();
                    if (d() && ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().f74265f != 4) {
                        requestDisallowInterceptTouchEvent(true);
                    }
                } else if (valueOf.intValue() == 2) {
                    if (Math.abs(motionEvent.getX() - ((float) this.B)) <= Math.abs(motionEvent.getY() - ((float) this.C))) {
                        requestDisallowInterceptTouchEvent(false);
                    } else if (d() && ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().f74265f != 4) {
                        requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void a(b bVar) {
        String str;
        User user;
        com.ss.android.ugc.aweme.commercialize.model.aa fakeAuthor;
        String str2;
        String str3;
        String str4;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        Aweme aweme;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar2;
        h.f.b.l.d(bVar, "");
        String str5 = bVar.f74376e;
        String str6 = null;
        User user2 = null;
        str6 = null;
        if (str5 == null) {
            ac acVar = this.q;
            if (acVar != null) {
                str5 = acVar.f75546a;
            } else {
                str5 = null;
            }
        }
        if (b(str5)) {
            this.f74309g = bVar;
            ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).b(bVar.f74374c);
            switch (bVar.f74374c) {
                case 1:
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).b();
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().f74263d = true;
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().f74264e = true;
                    break;
                case 2:
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).a();
                    break;
                case 3:
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).c();
                    break;
                case 4:
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).c();
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().f74263d = false;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).b();
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().f74263d = false;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).a();
                    ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).getBehavior().f74263d = false;
                    break;
                default:
                    return;
            }
            if (j()) {
                FrameLayout frameLayout = (FrameLayout) a(R.id.d74);
                h.f.b.l.b(frameLayout, "");
                frameLayout.setVisibility(8);
            } else {
                FrameLayout frameLayout2 = (FrameLayout) a(R.id.d74);
                h.f.b.l.b(frameLayout2, "");
                frameLayout2.setVisibility(0);
                if (e()) {
                    FrameLayout frameLayout3 = (FrameLayout) a(R.id.d74);
                    h.f.b.l.b(frameLayout3, "");
                    frameLayout3.setAlpha(0.7316342f);
                }
            }
            String str7 = bVar.f74376e;
            if (str7 == null) {
                str7 = "";
            }
            if (c(str7)) {
                AdPopUpWebTitleBar adPopUpWebTitleBar = (AdPopUpWebTitleBar) a(R.id.d7g);
                h.f.b.l.b(adPopUpWebTitleBar, "");
                adPopUpWebTitleBar.setVisibility(8);
                CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) a(R.id.d79);
                h.f.b.l.b(crossPlatformWebView, "");
                a(crossPlatformWebView, 0);
                CommonBizWebView commonBizWebView = (CommonBizWebView) a(R.id.d7_);
                h.f.b.l.b(commonBizWebView, "");
                a(commonBizWebView, 0);
            }
            String str8 = bVar.f74376e;
            if (str8 == null) {
                str8 = "";
            }
            setShouldHideBottomNavBar(str8);
            bj bjVar = this.f74303a;
            if (bjVar != null) {
                bjVar.a(true);
            }
            ((AdPopUpWebTitleBar) a(R.id.d7g)).b(bVar.f74377f);
            ((FrameLayout) a(R.id.d74)).setOnClickListener(new r(this));
            aa.f75532c = false;
            WebView webView = getWebView();
            if (webView != null) {
                ((AdPopUpWebBottomSheetContainer) a(R.id.d70)).setWebViewForDragBehavior(webView);
            }
            this.f74306d = true;
            if (i()) {
                str = "lynx";
            } else {
                str = "";
            }
            this.x = str;
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.f74304b;
            if (adPopUpWebPageContainer != null) {
                adPopUpWebPageContainer.b();
            }
            a aVar = this.s;
            if (aVar != null) {
                aVar.a();
            }
            if (bVar.f74375d == 25 && (aweme = bVar.f74380i) != null && aweme.isLive()) {
                CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) a(R.id.d79);
                h.f.b.l.b(crossPlatformWebView2, "");
                com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams = crossPlatformWebView2.getCrossPlatformParams();
                if (!(crossPlatformParams == null || (bVar2 = crossPlatformParams.f78742b) == null)) {
                    bVar2.H = "live_ad_card";
                }
            }
            if (bVar.f74374c != 4) {
                a(bVar.f74376e);
            }
            this.f74310h = false;
            if (d()) {
                RelativeLayout relativeLayout = (RelativeLayout) a(R.id.azr);
                h.f.b.l.b(relativeLayout, "");
                relativeLayout.setVisibility(0);
                if (e()) {
                    RelativeLayout relativeLayout2 = (RelativeLayout) a(R.id.azr);
                    h.f.b.l.b(relativeLayout2, "");
                    relativeLayout2.setAlpha(0.0f);
                    RelativeLayout relativeLayout3 = (RelativeLayout) a(R.id.azr);
                    h.f.b.l.b(relativeLayout3, "");
                    relativeLayout3.setVisibility(8);
                }
                RelativeLayout relativeLayout4 = (RelativeLayout) a(R.id.azr);
                if (relativeLayout4 != null) {
                    relativeLayout4.setOnClickListener(new s(this));
                }
                LinearLayout linearLayout = (LinearLayout) a(R.id.d_);
                h.f.b.l.b(linearLayout, "");
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.aB(bVar.f74380i)) {
                    TuxTextView tuxTextView = (TuxTextView) a(R.id.dc);
                    if (tuxTextView != null) {
                        tuxTextView.setTextSize(14.0f);
                    }
                    TuxTextView tuxTextView2 = (TuxTextView) a(R.id.dc);
                    if (tuxTextView2 != null) {
                        AwemeRawAd awemeRawAd = bVar.f74373b;
                        if (awemeRawAd == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.getBottomBanner()) == null) {
                            str4 = null;
                        } else {
                            str4 = bottomBanner.getRecommendText();
                        }
                        tuxTextView2.setText(str4);
                    }
                    TuxTextView tuxTextView3 = (TuxTextView) a(R.id.d9);
                    if (tuxTextView3 != null) {
                        AwemeRawAd awemeRawAd2 = bVar.f74373b;
                        if (awemeRawAd2 != null) {
                            str3 = awemeRawAd2.getHomepageBottomTextual();
                        } else {
                            str3 = null;
                        }
                        tuxTextView3.setText(str3);
                    }
                    SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) a(R.id.gw);
                    h.f.b.l.b(smartAvatarImageView, "");
                    smartAvatarImageView.setVisibility(0);
                    SmartRoundImageView smartRoundImageView = (SmartRoundImageView) a(R.id.de);
                    h.f.b.l.b(smartRoundImageView, "");
                    smartRoundImageView.setVisibility(8);
                    int i2 = Build.VERSION.SDK_INT;
                    layoutParams2.addRule(17, R.id.gw);
                    LinearLayout linearLayout2 = (LinearLayout) a(R.id.d_);
                    h.f.b.l.b(linearLayout2, "");
                    linearLayout2.setLayoutParams(layoutParams2);
                    Aweme aweme2 = bVar.f74380i;
                    if (aweme2 != null) {
                        user2 = aweme2.getAuthor();
                    }
                    com.bytedance.lighten.a.a.a a2 = a(user2);
                    if (a2 != null) {
                        com.bytedance.lighten.a.v a3 = com.bytedance.lighten.a.r.a(a2);
                        a3.E = (SmartImageView) a(R.id.gw);
                        a3.c();
                    }
                    if (this.v) {
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "button_show", bVar.f74373b).b();
                    }
                    k();
                    return;
                }
                SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) a(R.id.gw);
                h.f.b.l.b(smartAvatarImageView2, "");
                smartAvatarImageView2.setVisibility(8);
                SmartRoundImageView smartRoundImageView2 = (SmartRoundImageView) a(R.id.de);
                h.f.b.l.b(smartRoundImageView2, "");
                smartRoundImageView2.setVisibility(0);
                int i3 = Build.VERSION.SDK_INT;
                layoutParams2.addRule(17, R.id.de);
                LinearLayout linearLayout3 = (LinearLayout) a(R.id.d_);
                h.f.b.l.b(linearLayout3, "");
                linearLayout3.setLayoutParams(layoutParams2);
                Aweme aweme3 = bVar.f74380i;
                if (aweme3 != null) {
                    user = aweme3.getAuthor();
                } else {
                    user = null;
                }
                com.bytedance.lighten.a.a.a a4 = a(user);
                if (a4 != null) {
                    com.bytedance.lighten.a.v a5 = com.bytedance.lighten.a.r.a(a4);
                    a5.E = (SmartImageView) a(R.id.de);
                    a5.c();
                }
                TuxTextView tuxTextView4 = (TuxTextView) a(R.id.dc);
                if (tuxTextView4 != null) {
                    AwemeRawAd awemeRawAd3 = bVar.f74373b;
                    if (awemeRawAd3 != null) {
                        str2 = awemeRawAd3.getButtonText();
                    } else {
                        str2 = null;
                    }
                    tuxTextView4.setText(str2);
                }
                TuxTextView tuxTextView5 = (TuxTextView) a(R.id.d9);
                if (tuxTextView5 != null) {
                    AwemeRawAd awemeRawAd4 = bVar.f74373b;
                    if (!(awemeRawAd4 == null || (fakeAuthor = awemeRawAd4.getFakeAuthor()) == null)) {
                        str6 = fakeAuthor.getButtonText();
                    }
                    tuxTextView5.setText(str6);
                }
            }
        }
    }

    public final void a(String str) {
        Bundle bundle;
        AwemeRawAd awemeRawAd;
        String str2;
        AwemeRawAd awemeRawAd2;
        String a2;
        AnchorLynxModel anchorLynxModel;
        Bundle bundle2;
        AnchorLynxModel anchorLynxModel2;
        String str3;
        Bundle bundle3;
        com.ss.android.ugc.aweme.bullet.business.b bVar;
        DownloadBusiness downloadBusiness;
        String str4 = null;
        if (i()) {
            ((AdPopUpWebTitleBar) a(R.id.d7g)).c();
            ac acVar = this.q;
            if (!(acVar == null || (bundle = acVar.f75550e) == null)) {
                Object clone = bundle.clone();
                if (!(clone instanceof Bundle)) {
                    clone = null;
                }
                Bundle bundle4 = (Bundle) clone;
                if (bundle4 != null) {
                    ac acVar2 = this.q;
                    if (acVar2 == null || acVar2.f75553h == null) {
                        ac acVar3 = this.q;
                        if (acVar3 != null) {
                            awemeRawAd = acVar3.f75551f;
                        } else {
                            awemeRawAd = null;
                        }
                        Context context = getContext();
                        if (com.ss.android.ugc.aweme.landpage.b.a.f107275a.a(awemeRawAd)) {
                            bundle4.putBoolean("is_lynx_landing_page", true);
                            bundle4.putBoolean("hide_nav_bar", true);
                            bundle4.putBoolean("hide_status_bar", false);
                            bundle4.putBoolean("bundle_nav_bar_status_padding", true);
                            bundle4.putBoolean("need_bottom_out", true);
                            List<String> geckoChannel = awemeRawAd.getNativeSiteConfig().getGeckoChannel();
                            if (!com.bytedance.common.utility.collection.b.a((Collection) geckoChannel)) {
                                str2 = geckoChannel.get(0);
                            } else {
                                str2 = "";
                            }
                            bundle4.putString("lynx_channel_name", str2);
                            bundle4.putString("bundle_native_site_custom_data", awemeRawAd.getNativeSiteCustomData());
                            bundle4.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(com.bytedance.common.utility.n.a(context), 1073741824));
                            bundle4.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(com.bytedance.common.utility.n.b(context) - hh.b(), 1073741824));
                            Uri parse = Uri.parse(awemeRawAd.getNativeSiteConfig().getLynxScheme());
                            if (parse.isHierarchical()) {
                                bundle4.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                                if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                                    bundle4.putBoolean("preset_safe_point", true);
                                    bundle4.putInt("thread_strategy", com.lynx.tasm.r.PART_ON_LAYOUT.id());
                                }
                            }
                        }
                    } else {
                        ac acVar4 = this.q;
                        if (acVar4 == null || (anchorLynxModel2 = acVar4.f75553h) == null) {
                            bundle2 = null;
                        } else {
                            bundle2 = anchorLynxModel2.bundle;
                        }
                        bundle4.putAll(bundle2);
                    }
                    ac acVar5 = this.q;
                    if (acVar5 == null || acVar5.f75553h == null) {
                        ac acVar6 = this.q;
                        if (acVar6 != null) {
                            awemeRawAd2 = acVar6.f75551f;
                        } else {
                            awemeRawAd2 = null;
                        }
                        a2 = a(awemeRawAd2);
                    } else {
                        ac acVar7 = this.q;
                        if (!(acVar7 == null || (anchorLynxModel = acVar7.f75553h) == null)) {
                            a2 = anchorLynxModel.lynxSchema;
                        }
                    }
                    if (a2 != null) {
                        CommonBizWebView commonBizWebView = (CommonBizWebView) a(R.id.d7_);
                        h.f.b.l.b(commonBizWebView, "");
                        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                        if (f2 != null) {
                            str4 = f2.g("lynx_feed");
                        }
                        new com.ss.android.ugc.aweme.commercialize.feed.a(commonBizWebView, str4, this.D).a(a2, bundle4);
                        a aVar = this.s;
                        if (aVar != null) {
                            aVar.a("lynx");
                            return;
                        }
                        return;
                    }
                }
            }
        }
        if (str == null) {
            ac acVar8 = this.q;
            if (acVar8 == null || (str3 = acVar8.f75546a) == null) {
                return;
            }
        } else {
            str3 = str;
        }
        ((AdPopUpWebTitleBar) a(R.id.d7g)).c();
        AdPopUpWebNaviBar adPopUpWebNaviBar = (AdPopUpWebNaviBar) a(R.id.d75);
        h.f.b.l.b(adPopUpWebNaviBar, "");
        adPopUpWebNaviBar.setVisibility(8);
        if (this.f74305c) {
            ac acVar9 = this.q;
            if (acVar9 != null && (bundle3 = acVar9.f75550e) != null) {
                BulletContainerView bulletContainerView = (BulletContainerView) a(R.id.d7_);
                if (str == null) {
                    ac acVar10 = this.q;
                    if (acVar10 == null) {
                        h.f.b.l.b();
                    }
                    str = acVar10.f75546a;
                }
                h.a.a(bulletContainerView, com.ss.android.ugc.aweme.bullet.utils.c.a(str, h.a.n.a("ad_commerce"), bundle3, new com.ss.android.ugc.aweme.bullet.module.base.g(com.bytedance.ies.ugc.appcontext.d.a())), bundle3, null, 4);
                com.ss.android.ugc.aweme.bullet.module.base.b rootContainer = ((CommonBizWebView) a(R.id.d7_)).getRootContainer();
                if (rootContainer != null && (bVar = rootContainer.z) != null && (downloadBusiness = (DownloadBusiness) bVar.a(DownloadBusiness.class)) != null) {
                    downloadBusiness.a(((CommonBizWebView) a(R.id.d7_)).getWebView());
                    return;
                }
                return;
            }
            return;
        }
        if (h()) {
            ShareH5Service a3 = ShareH5Service.a.a();
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) a(R.id.d79);
            h.f.b.l.b(crossPlatformWebView, "");
            a3.a(crossPlatformWebView.getCrossPlatformBusiness(), str3, 2);
        }
        CrossPlatformWebView.a((CrossPlatformWebView) a(R.id.d79), str3, false, null, 6);
    }

    public /* synthetic */ AdPopUpWebPageView(Context context, byte b2) {
        this(context);
    }

    public static final class k implements CommonBizWebView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f74326b;

        static {
            Covode.recordClassIndex(45856);
        }

        k(AdPopUpWebPageView adPopUpWebPageView, Bundle bundle) {
            this.f74325a = adPopUpWebPageView;
            this.f74326b = bundle;
        }

        @Override // com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView.b
        public final void a(int i2, int i3) {
            boolean z;
            SSWebView webView = ((CommonBizWebView) this.f74325a.a(R.id.d7_)).getWebView();
            if (webView != null) {
                if (webView.getScrollY() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                AdPopUpWebBottomSheetContainer.f74281i = z;
                ((AdPopUpWebNaviBar) this.f74325a.a(R.id.d75)).a(i2, i3);
                this.f74325a.a(this.f74326b, webView.getScrollY());
            }
        }
    }

    public static final class l implements com.ss.android.ugc.aweme.crossplatform.view.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f74328b;

        static {
            Covode.recordClassIndex(45857);
        }

        l(AdPopUpWebPageView adPopUpWebPageView, Bundle bundle) {
            this.f74327a = adPopUpWebPageView;
            this.f74328b = bundle;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.b
        public final void a(int i2, int i3) {
            boolean z;
            WebView webView = this.f74327a.getWebView();
            if (webView != null) {
                if (webView.getScrollY() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                AdPopUpWebBottomSheetContainer.f74281i = z;
                ((AdPopUpWebNaviBar) this.f74327a.a(R.id.d75)).a(i2, i3);
                this.f74327a.a(this.f74328b, webView.getScrollY());
            }
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

    public static final class g extends SingleWebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebView f74319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74320b;

        static {
            Covode.recordClassIndex(45852);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            Bundle bundle;
            ac params = this.f74320b.getParams();
            if (params != null && (bundle = params.f75550e) != null && bundle.getBoolean("isFromChallenge")) {
                ((AdPopUpWebTitleBar) this.f74320b.a(R.id.d7g)).a(str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(WebView webView, WebView webView2, AdPopUpWebPageView adPopUpWebPageView) {
            super(webView2);
            this.f74319a = webView;
            this.f74320b = adPopUpWebPageView;
        }
    }

    static final class j implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74324a;

        static {
            Covode.recordClassIndex(45855);
        }

        j(AdPopUpWebPageView adPopUpWebPageView) {
            this.f74324a = adPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            WebView webView;
            if (this.f74324a.getActionMode().f74371i == 5) {
                this.f74324a.setFromTitleBarClick(true);
            }
            a actionMode = this.f74324a.getActionMode();
            h.f.b.l.b(motionEvent, "");
            actionMode.a(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                AdPopUpWebBottomSheetContainer.f74281i = true;
            } else if ((action == 1 || action == 3) && (webView = this.f74324a.getWebView()) != null && webView.getScrollY() > 0) {
                AdPopUpWebBottomSheetContainer.f74281i = false;
            }
            return true;
        }
    }

    static final class w implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74347a;

        static {
            Covode.recordClassIndex(45872);
        }

        w(AdPopUpWebPageView adPopUpWebPageView) {
            this.f74347a = adPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            this.f74347a.getActionMode().a(motionEvent);
            AdPopUpWebNaviBar adPopUpWebNaviBar = (AdPopUpWebNaviBar) this.f74347a.a(R.id.d75);
            h.f.b.l.d(motionEvent, "");
            if (adPopUpWebNaviBar.getVisibility() != 8 && motionEvent.getAction() == 0) {
                adPopUpWebNaviBar.f74289a = false;
            }
            return false;
        }
    }

    public static final class h extends bj {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageView f74321a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f74322b;

        static {
            Covode.recordClassIndex(45853);
        }

        @Override // com.ss.android.ugc.aweme.base.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || ((!this.f74321a.g() && !this.f74321a.f74306d) || (this.f74321a.d() && ((AdPopUpWebBottomSheetContainer) this.f74321a.a(R.id.d70)).getBehavior().b() == ((int) com.bytedance.common.utility.n.b(this.f74321a.getContext(), 64.0f)) && ((AdPopUpWebBottomSheetContainer) this.f74321a.a(R.id.d70)).getBehavior().f74265f == 4))) {
                return false;
            }
            c keyDownCallBack = this.f74321a.getKeyDownCallBack();
            if (keyDownCallBack != null) {
                keyDownCallBack.a();
            }
            this.f74321a.a(false);
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(AdPopUpWebPageView adPopUpWebPageView, Activity activity, Activity activity2) {
            super(activity2);
            this.f74321a = adPopUpWebPageView;
            this.f74322b = activity;
        }
    }

    public final void a(Bundle bundle, int i2) {
        if (!bundle.getBoolean("isFromChallenge")) {
            return;
        }
        if (i2 > com.ss.android.ugc.aweme.base.utils.n.a(32.0d)) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.d7f);
            h.f.b.l.b(tuxTextView, "");
            if (tuxTextView.getVisibility() == 8) {
                TuxTextView tuxTextView2 = (TuxTextView) a(R.id.d7f);
                h.f.b.l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) a(R.id.d7f);
        h.f.b.l.b(tuxTextView3, "");
        if (tuxTextView3.getVisibility() == 0) {
            TuxTextView tuxTextView4 = (TuxTextView) a(R.id.d7f);
            h.f.b.l.b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
        }
    }
}
