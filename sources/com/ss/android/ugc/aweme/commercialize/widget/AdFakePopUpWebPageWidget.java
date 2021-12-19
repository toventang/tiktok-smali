package com.ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.commercialize.utils.aa;
import com.ss.android.ugc.aweme.commercialize.utils.ac;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AdFakePopUpWebPageWidget extends AbsAdProfileWidget implements au {
    public static final a o = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public AdPopUpWebPageView f76258j;

    /* renamed from: k  reason: collision with root package name */
    public String f76259k;

    /* renamed from: l  reason: collision with root package name */
    long f76260l;

    /* renamed from: m  reason: collision with root package name */
    Handler f76261m = new Handler(Looper.getMainLooper());
    boolean n;
    private final c p = new c(this);
    private final g q = new g(this);
    private final b r = new b(this);

    static {
        Covode.recordClassIndex(47019);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47020);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget$a$a  reason: collision with other inner class name */
        static final class C1736a extends h.f.b.m implements h.f.a.a<Object> {
            final /* synthetic */ com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b $openParams;
            final /* synthetic */ AdPopUpWebPageView $popUpWebPageView;

            static {
                Covode.recordClassIndex(47021);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1736a(AdPopUpWebPageView adPopUpWebPageView, com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b bVar) {
                super(0);
                this.$popUpWebPageView = adPopUpWebPageView;
                this.$openParams = bVar;
            }

            @Override // h.f.a.a
            public final Object invoke() {
                return Boolean.valueOf(this.$popUpWebPageView.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget.a.C1736a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C1736a f76262a;

                    static {
                        Covode.recordClassIndex(47022);
                    }

                    {
                        this.f76262a = r1;
                    }

                    public final void run() {
                        this.f76262a.$popUpWebPageView.a(this.f76262a.$openParams);
                    }
                }));
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static AdPopUpWebPageView b(androidx.fragment.app.e eVar) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout a2 = a(eVar);
            if (a2 != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) a2.findViewById(R.id.e_);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        public static FrameLayout a(androidx.fragment.app.e eVar) {
            View view;
            MethodCollector.i(5053);
            if (eVar != null) {
                ViewStub viewStub = (ViewStub) eVar.findViewById(R.id.e9);
                if (viewStub != null && viewStub.getParent() != null) {
                    view = viewStub.inflate();
                    if (view == null) {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                        MethodCollector.o(5053);
                        throw nullPointerException;
                    }
                } else if (eVar != null) {
                    view = eVar.findViewById(R.id.e8);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                MethodCollector.o(5053);
                return frameLayout;
            }
            MethodCollector.o(5053);
            return null;
        }

        public static void c(androidx.fragment.app.e eVar) {
            AdPopUpWebPageView b2;
            AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer;
            AdPopUpWebPageView b3 = b(eVar);
            if (b3 != null && b3.g() && (b2 = b(eVar)) != null && b2.g() && (adPopUpWebBottomSheetContainer = (AdPopUpWebBottomSheetContainer) b2.a(R.id.d70)) != null) {
                adPopUpWebBottomSheetContainer.a();
            }
        }
    }

    public static final class c implements AdPopUpWebPageView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakePopUpWebPageWidget f76264a;

        static {
            Covode.recordClassIndex(47024);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.c
        public final void a() {
            this.f76264a.f76259k = "back";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(AdFakePopUpWebPageWidget adFakePopUpWebPageWidget) {
            this.f76264a = adFakePopUpWebPageWidget;
        }
    }

    public static final class g implements AdPopUpWebPageView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakePopUpWebPageWidget f76268a;

        static {
            Covode.recordClassIndex(47028);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void a() {
            this.f76268a.f76259k = "button";
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void b() {
            AwemeRawAd awemeRawAd;
            AdPopUpWebPageView adPopUpWebPageView = this.f76268a.f76258j;
            if (adPopUpWebPageView != null) {
                com.ss.android.ugc.aweme.commercialize.feed.popupwebview.a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = ((AbsAdProfileWidget) this.f76268a).f75063a;
                AwemeRawAd awemeRawAd2 = null;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.b(awemeRawAd)) {
                    Aweme aweme2 = ((AbsAdProfileWidget) this.f76268a).f75063a;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_landing_ad", "report", awemeRawAd2).b();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(AdFakePopUpWebPageWidget adFakePopUpWebPageWidget) {
            this.f76268a = adFakePopUpWebPageWidget;
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final d f76265a = new d();

        static {
            Covode.recordClassIndex(47025);
        }

        d() {
        }

        public final void run() {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.popupwebview.d(false));
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final e f76266a = new e();

        static {
            Covode.recordClassIndex(47026);
        }

        e() {
        }

        public final void run() {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.popupwebview.d(true));
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final f f76267a = new f();

        static {
            Covode.recordClassIndex(47027);
        }

        f() {
        }

        public final void run() {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.popupwebview.d(true));
        }
    }

    public static final class b implements AdPopUpWebPageView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakePopUpWebPageWidget f76263a;

        static {
            Covode.recordClassIndex(47023);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2) {
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(String str) {
            l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a() {
            AwemeRawAd awemeRawAd;
            AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.f76263a;
            AdPopUpWebPageView adPopUpWebPageView = adFakePopUpWebPageWidget.f76258j;
            if (adPopUpWebPageView != null && adPopUpWebPageView.e()) {
                adFakePopUpWebPageWidget.f76261m.post(f.f76267a);
            }
            adFakePopUpWebPageWidget.f76260l = System.currentTimeMillis();
            AdPopUpWebPageView adPopUpWebPageView2 = adFakePopUpWebPageWidget.f76258j;
            if (adPopUpWebPageView2 != null && adPopUpWebPageView2.e()) {
                Aweme aweme = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f75063a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "othershow", awemeRawAd).b("refer", "halfscreen_page").b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AdFakePopUpWebPageWidget adFakePopUpWebPageWidget) {
            this.f76263a = adFakePopUpWebPageWidget;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void b(int i2) {
            AwemeRawAd awemeRawAd;
            AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.f76263a;
            adFakePopUpWebPageWidget.f76261m.post(e.f76266a);
            AdPopUpWebPageView adPopUpWebPageView = adFakePopUpWebPageWidget.f76258j;
            if (adPopUpWebPageView != null) {
                AwemeRawAd awemeRawAd2 = null;
                if (!adPopUpWebPageView.e() || adFakePopUpWebPageWidget.n) {
                    String str = "landing_page";
                    if (!adPopUpWebPageView.f74313k) {
                        Aweme aweme = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f75063a;
                        if (aweme != null) {
                            awemeRawAd = aweme.getAwemeRawAd();
                        } else {
                            awemeRawAd = null;
                        }
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "othershow", awemeRawAd).b("refer", str).b();
                    }
                    Aweme aweme2 = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f75063a;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    }
                    a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click", awemeRawAd2);
                    if (adPopUpWebPageView.f74313k) {
                        str = "button";
                    }
                    a2.b("refer", str).b();
                    adFakePopUpWebPageWidget.f76260l = System.currentTimeMillis();
                    adPopUpWebPageView.setFromAdButtonClick(false);
                    return;
                }
                Aweme aweme3 = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f75063a;
                if (aweme3 != null) {
                    awemeRawAd2 = aweme3.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click", awemeRawAd2).b("refer", "halfscreen_page").b();
                adFakePopUpWebPageWidget.n = true;
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2, Boolean bool) {
            String str;
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.f76263a;
            if (l.a((Object) bool, (Object) true)) {
                Aweme aweme = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f75063a;
                if (aweme != null) {
                    awemeRawAd3 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd3 = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "othershow_fail", awemeRawAd3).b("refer", "landing_page").b();
            } else {
                if (!(i2 == 5 || i2 == 0)) {
                    adFakePopUpWebPageWidget.f76261m.post(d.f76265a);
                }
                AdPopUpWebPageView adPopUpWebPageView = adFakePopUpWebPageWidget.f76258j;
                if (adPopUpWebPageView != null) {
                    if (!adPopUpWebPageView.e() || adFakePopUpWebPageWidget.n) {
                        if (aa.f75533d == 1) {
                            str = "slide";
                        } else {
                            str = "slide_down";
                        }
                        if (!(i2 == 5 || i2 == 0)) {
                            Aweme aweme2 = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f75063a;
                            if (aweme2 != null) {
                                awemeRawAd = aweme2.getAwemeRawAd();
                            } else {
                                awemeRawAd = null;
                            }
                            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "close", awemeRawAd);
                            String str2 = adFakePopUpWebPageWidget.f76259k;
                            if (str2 != null) {
                                str = str2;
                            }
                            a2.b("refer", str).b();
                        }
                    } else {
                        Aweme aweme3 = ((AbsAdProfileWidget) adFakePopUpWebPageWidget).f75063a;
                        if (aweme3 != null) {
                            awemeRawAd2 = aweme3.getAwemeRawAd();
                        } else {
                            awemeRawAd2 = null;
                        }
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "close", awemeRawAd2).b("refer", "halfscreen_page").b();
                        adFakePopUpWebPageWidget.n = true;
                    }
                }
                long currentTimeMillis = System.currentTimeMillis() - adFakePopUpWebPageWidget.f76260l;
                if (adFakePopUpWebPageWidget.f76258j != null) {
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    dVar.a("duration", currentTimeMillis);
                    r.a("h5_stay_time", dVar.f66730a);
                }
            }
            this.f76263a.f76259k = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void a(boolean z) {
        androidx.fragment.app.e eVar;
        androidx.fragment.app.e eVar2;
        Context context;
        AwemeRawAd awemeRawAd;
        int i2;
        AdPopUpWebPageView b2;
        String aid;
        AwemeRawAd awemeRawAd2;
        com.ss.android.ugc.aweme.commercialize.model.aa fakeAuthor;
        String str;
        String str2;
        AwemeRawAd awemeRawAd3;
        String str3;
        AwemeRawAd awemeRawAd4;
        Context context2;
        AwemeRawAd awemeRawAd5;
        AwemeRawAd awemeRawAd6;
        AwemeRawAd awemeRawAd7;
        MethodCollector.i(2967);
        androidx.fragment.app.e eVar3 = null;
        r3 = null;
        r3 = null;
        Boolean bool = null;
        if (z) {
            Fragment fragment = ((AbsAdProfileWidget) this).f75064h;
            if (fragment != null) {
                eVar = fragment.getActivity();
            } else {
                eVar = null;
            }
            String str4 = "";
            if (eVar != null) {
                Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
                if (aweme == null || (awemeRawAd7 = aweme.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd7.getSource();
                }
                if (!TextUtils.isEmpty(str)) {
                    Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
                    if (aweme2 == null || (awemeRawAd6 = aweme2.getAwemeRawAd()) == null) {
                        str2 = null;
                    } else {
                        str2 = awemeRawAd6.getSource();
                    }
                } else {
                    Aweme aweme3 = ((AbsAdProfileWidget) this).f75063a;
                    if (aweme3 == null || (awemeRawAd3 = aweme3.getAwemeRawAd()) == null || (str2 = awemeRawAd3.getWebTitle()) == null) {
                        str2 = str4;
                    }
                }
                ac.a aVar = new ac.a();
                Aweme aweme4 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme4 == null || (awemeRawAd5 = aweme4.getAwemeRawAd()) == null || (str3 = awemeRawAd5.getWebUrl()) == null) {
                    str3 = str4;
                }
                ac.a a2 = aVar.a(str3).a(((AbsAdProfileWidget) this).f75064h).a(hh.b());
                if (str2 == null) {
                    str2 = str4;
                }
                ac.a b3 = a2.b(str2);
                Aweme aweme5 = ((AbsAdProfileWidget) this).f75063a;
                Bundle bundle = new Bundle();
                Fragment fragment2 = ((AbsAdProfileWidget) this).f75064h;
                if (!(fragment2 == null || (context2 = fragment2.getContext()) == null)) {
                    l.b(context2, str4);
                    if (!(aweme5 == null || aweme5.getAwemeRawAd() == null)) {
                        com.ss.android.ugc.aweme.commercialize.utils.d.a(bundle, aweme5, context2);
                        com.ss.android.ugc.aweme.commercialize.utils.d.b(bundle, aweme5, context2);
                        com.ss.android.ugc.aweme.commercialize.utils.d.c(bundle, aweme5, context2);
                        com.ss.android.ugc.aweme.commercialize.utils.d.a(bundle, context2);
                    }
                }
                ac.a a3 = b3.a(bundle);
                Aweme aweme6 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme6 != null) {
                    awemeRawAd4 = aweme6.getAwemeRawAd();
                } else {
                    awemeRawAd4 = null;
                }
                ac a4 = a3.a(awemeRawAd4).a();
                b bVar = this.r;
                c cVar = this.p;
                l.d(eVar, str4);
                l.d(a4, str4);
                AdPopUpWebPageView b4 = a.b(eVar);
                if (b4 == null) {
                    b4 = new AdPopUpWebPageView(eVar, (byte) 0);
                    b4.setId(R.id.e_);
                    b4.setParams(a4);
                    b4.setMBehaviorCallback(bVar);
                    b4.setKeyDownCallBack(cVar);
                    FrameLayout a5 = a.a(eVar);
                    if (a5 != null) {
                        a5.addView(b4);
                    }
                }
                this.f76258j = b4;
                b4.setTitleBarCallback(this.q);
                hashCode();
            }
            this.n = false;
            this.f76260l = 0;
            Fragment fragment3 = ((AbsAdProfileWidget) this).f75064h;
            if (fragment3 != null) {
                eVar2 = fragment3.getActivity();
            } else {
                eVar2 = null;
            }
            b.a aVar2 = new b.a();
            Fragment fragment4 = ((AbsAdProfileWidget) this).f75064h;
            if (fragment4 != null) {
                context = fragment4.getContext();
            } else {
                context = null;
            }
            b.a a6 = aVar2.a(context).a(((AbsAdProfileWidget) this).f75063a);
            Aweme aweme7 = ((AbsAdProfileWidget) this).f75063a;
            if (aweme7 != null) {
                awemeRawAd = aweme7.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            b.a b5 = a6.a(awemeRawAd).b(8);
            Aweme aweme8 = ((AbsAdProfileWidget) this).f75063a;
            if (!(aweme8 == null || (awemeRawAd2 = aweme8.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd2.getFakeAuthor()) == null)) {
                bool = fakeAuthor.getAutoShowWebview();
            }
            if (l.a((Object) bool, (Object) true)) {
                i2 = 5;
            } else {
                i2 = 4;
            }
            b.a a7 = b5.a(i2);
            Aweme aweme9 = ((AbsAdProfileWidget) this).f75063a;
            if (!(aweme9 == null || (aid = aweme9.getAid()) == null)) {
                str4 = aid;
            }
            com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b a8 = a7.c(str4).a();
            Context context3 = a8.f74372a;
            if ((context3 instanceof Activity) && context3 != null && (b2 = a.b(eVar2)) != null && !b2.g()) {
                FrameLayout a9 = a.a(eVar2);
                if (a9 != null) {
                    a9.setVisibility(0);
                }
                b2.getActionMode().f74368f = a8.f74375d;
                b2.a(new a.C1736a(b2, a8));
            }
            MethodCollector.o(2967);
            return;
        }
        Fragment fragment5 = ((AbsAdProfileWidget) this).f75064h;
        if (fragment5 != null) {
            eVar3 = fragment5.getActivity();
        }
        AdPopUpWebPageView b6 = a.b(eVar3);
        if (b6 != null) {
            if (b6.g()) {
                b6.a(true);
                FrameLayout a10 = a.a(eVar3);
                if (a10 != null) {
                    a10.setVisibility(8);
                    MethodCollector.o(2967);
                    return;
                }
            }
            MethodCollector.o(2967);
            return;
        }
        MethodCollector.o(2967);
    }
}
