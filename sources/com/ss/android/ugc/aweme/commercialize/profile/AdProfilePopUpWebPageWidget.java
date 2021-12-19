package com.ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.ss.android.ugc.aweme.commercialize.utils.aa;
import com.ss.android.ugc.aweme.commercialize.utils.ac;
import com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class AdProfilePopUpWebPageWidget extends AbsAdFeedWidget implements au {

    /* renamed from: m  reason: collision with root package name */
    public static final Map<String, WeakReference<Runnable>> f75121m = new HashMap();
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    AdPopUpWebPageView f75122a;

    /* renamed from: h  reason: collision with root package name */
    long f75123h;

    /* renamed from: i  reason: collision with root package name */
    public String f75124i;

    /* renamed from: j  reason: collision with root package name */
    final c f75125j = new c(this);

    /* renamed from: k  reason: collision with root package name */
    final e f75126k = new e(this);

    /* renamed from: l  reason: collision with root package name */
    final d f75127l = new d(this);
    private final Runnable s = new b(this);

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46334);
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget$a$a  reason: collision with other inner class name */
        public static final class C1711a extends h.f.b.m implements h.f.a.a<Object> {
            final /* synthetic */ com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b $openParams;
            final /* synthetic */ AdPopUpWebPageView $popUpWebPageView;

            static {
                Covode.recordClassIndex(46335);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1711a(AdPopUpWebPageView adPopUpWebPageView, com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b bVar) {
                super(0);
                this.$popUpWebPageView = adPopUpWebPageView;
                this.$openParams = bVar;
            }

            @Override // h.f.a.a
            public final Object invoke() {
                return Boolean.valueOf(this.$popUpWebPageView.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget.a.C1711a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C1711a f75128a;

                    static {
                        Covode.recordClassIndex(46336);
                    }

                    {
                        this.f75128a = r1;
                    }

                    public final void run() {
                        this.f75128a.$popUpWebPageView.a(this.f75128a.$openParams);
                    }
                }));
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static AdPopUpWebPageView b(Activity activity) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout a2 = a(activity);
            if (a2 != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) a2.findViewById(R.id.g3);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        public static FrameLayout a(Activity activity) {
            View inflate;
            MethodCollector.i(9660);
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.g7);
            if (viewStub == null) {
                inflate = activity.findViewById(R.id.g6);
            } else {
                viewStub.setLayoutResource(R.layout.aq9);
                inflate = viewStub.inflate();
                if (inflate == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    MethodCollector.o(9660);
                    throw nullPointerException;
                }
            }
            FrameLayout frameLayout = (FrameLayout) inflate;
            MethodCollector.o(9660);
            return frameLayout;
        }
    }

    public static final class d implements AdPopUpWebPageView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdProfilePopUpWebPageWidget f75131a;

        static {
            Covode.recordClassIndex(46339);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.c
        public final void a() {
            this.f75131a.f75124i = "back";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget) {
            this.f75131a = adProfilePopUpWebPageWidget;
        }
    }

    public static final class e implements AdPopUpWebPageView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdProfilePopUpWebPageWidget f75132a;

        static {
            Covode.recordClassIndex(46340);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void a() {
            this.f75132a.f75124i = "button";
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void b() {
            AwemeRawAd awemeRawAd;
            Aweme aweme = this.f75132a.o;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_landing_ad", "report", awemeRawAd).b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget) {
            this.f75132a = adProfilePopUpWebPageWidget;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        a(System.currentTimeMillis() - this.f75123h);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        this.f75123h = System.currentTimeMillis();
        super.onResume();
    }

    static {
        Covode.recordClassIndex(46333);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a() {
        super.a();
        DataCenter dataCenter = this.f67010e;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_feed_on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
    }

    public static final class c implements AdPopUpWebPageView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdProfilePopUpWebPageWidget f75130a;

        static {
            Covode.recordClassIndex(46338);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(String str) {
            l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a() {
            AwemeRawAd awemeRawAd;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.f75130a;
            adProfilePopUpWebPageWidget.f75123h = System.currentTimeMillis();
            AdPopUpWebPageView adPopUpWebPageView = adProfilePopUpWebPageWidget.f75122a;
            if (adPopUpWebPageView == null) {
                return;
            }
            if (adPopUpWebPageView.e() || adPopUpWebPageView.f()) {
                Aweme aweme = adProfilePopUpWebPageWidget.o;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click", awemeRawAd).b("refer", "halfscreen_page").b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget) {
            this.f75130a = adProfilePopUpWebPageWidget;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2) {
            String str;
            AwemeRawAd awemeRawAd;
            a.C0791a a2;
            AwemeRawAd awemeRawAd2;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.f75130a;
            AdPopUpWebPageView adPopUpWebPageView = adProfilePopUpWebPageWidget.f75122a;
            if (adPopUpWebPageView != null && adPopUpWebPageView.f() && i2 == 6) {
                Aweme aweme = adProfilePopUpWebPageWidget.o;
                if (aweme != null) {
                    awemeRawAd2 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "close", awemeRawAd2);
                str = "halfscreen_page";
            } else {
                if (aa.f75533d == 1) {
                    str = "slide";
                } else {
                    str = "slide_down";
                }
                Aweme aweme2 = adProfilePopUpWebPageWidget.o;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "close", awemeRawAd);
                String str2 = adProfilePopUpWebPageWidget.f75124i;
                if (str2 != null) {
                    str = str2;
                }
            }
            a2.b("refer", str).b();
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aC(adProfilePopUpWebPageWidget.o)) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.profile.widgets.a.a());
            }
            adProfilePopUpWebPageWidget.a(System.currentTimeMillis() - adProfilePopUpWebPageWidget.f75123h);
            this.f75130a.f75124i = null;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void b(int i2) {
            AdPopUpWebPageView adPopUpWebPageView;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.f75130a;
            AdPopUpWebPageView adPopUpWebPageView2 = adProfilePopUpWebPageWidget.f75122a;
            AwemeRawAd awemeRawAd = null;
            if (((adPopUpWebPageView2 == null || !adPopUpWebPageView2.e()) && ((adPopUpWebPageView = adProfilePopUpWebPageWidget.f75122a) == null || !adPopUpWebPageView.f())) || i2 != 6) {
                AdPopUpWebPageView adPopUpWebPageView3 = adProfilePopUpWebPageWidget.f75122a;
                if (adPopUpWebPageView3 != null && ((AdPopUpWebBottomSheetContainer) adPopUpWebPageView3.a(R.id.d70)).getActionMode().f74371i == 6 && (i2 == 0 || i2 == 5)) {
                    Aweme aweme = adProfilePopUpWebPageWidget.o;
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click", awemeRawAd).b("refer", "all_screen_page").b();
                } else {
                    AdPopUpWebPageView adPopUpWebPageView4 = adProfilePopUpWebPageWidget.f75122a;
                    if (adPopUpWebPageView4 != null && adPopUpWebPageView4.d()) {
                        Aweme aweme2 = adProfilePopUpWebPageWidget.o;
                        if (aweme2 != null) {
                            awemeRawAd = aweme2.getAwemeRawAd();
                        }
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click", awemeRawAd).b("refer", "button").b();
                    }
                }
            } else {
                Aweme aweme3 = adProfilePopUpWebPageWidget.o;
                if (aweme3 != null) {
                    awemeRawAd = aweme3.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", awemeRawAd).b("refer", "halfscreen_page").b();
            }
            adProfilePopUpWebPageWidget.f75123h = System.currentTimeMillis();
            AdPopUpWebPageView adPopUpWebPageView5 = adProfilePopUpWebPageWidget.f75122a;
            if (adPopUpWebPageView5 != null) {
                adPopUpWebPageView5.setFromTitleBarClick(false);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2, Boolean bool) {
            String str;
            a.C0791a a2;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.f75130a;
            AwemeRawAd awemeRawAd = null;
            if (l.a((Object) bool, (Object) true)) {
                Aweme aweme = adProfilePopUpWebPageWidget.o;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "othershow_fail", awemeRawAd).b("refer", "button").b();
                return;
            }
            AdPopUpWebPageView adPopUpWebPageView = adProfilePopUpWebPageWidget.f75122a;
            if (adPopUpWebPageView != null && adPopUpWebPageView.e() && i2 == 6) {
                Aweme aweme2 = adProfilePopUpWebPageWidget.o;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "close", awemeRawAd);
                str = "halfscreen_page";
            } else {
                if (aa.f75533d == 1) {
                    str = "slide";
                } else {
                    str = "slide_down";
                }
                AdPopUpWebPageView adPopUpWebPageView2 = adProfilePopUpWebPageWidget.f75122a;
                if (adPopUpWebPageView2 != null) {
                    adPopUpWebPageView2.a();
                }
                Aweme aweme3 = adProfilePopUpWebPageWidget.o;
                if (aweme3 != null) {
                    awemeRawAd = aweme3.getAwemeRawAd();
                }
                a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "close", awemeRawAd);
                String str2 = adProfilePopUpWebPageWidget.f75124i;
                if (str2 != null) {
                    str = str2;
                }
            }
            a2.b("refer", str).b();
            adProfilePopUpWebPageWidget.a(System.currentTimeMillis() - adProfilePopUpWebPageWidget.f75123h);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdProfilePopUpWebPageWidget f75129a;

        static {
            Covode.recordClassIndex(46337);
        }

        b(AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget) {
            this.f75129a = adProfilePopUpWebPageWidget;
        }

        public final void run() {
            androidx.fragment.app.e activity;
            Fragment fragment;
            String str;
            String str2;
            AwemeRawAd awemeRawAd;
            String str3;
            Context context;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AwemeRawAd awemeRawAd4;
            MethodCollector.i(9920);
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.f75129a;
            Fragment fragment2 = adProfilePopUpWebPageWidget.p;
            AwemeRawAd awemeRawAd5 = null;
            if (!(fragment2 == null || (activity = fragment2.getActivity()) == null || (fragment = adProfilePopUpWebPageWidget.p) == null || fragment.getContext() == null)) {
                Aweme aweme = adProfilePopUpWebPageWidget.o;
                if (aweme == null || (awemeRawAd4 = aweme.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd4.getSource();
                }
                if (!TextUtils.isEmpty(str)) {
                    Aweme aweme2 = adProfilePopUpWebPageWidget.o;
                    if (aweme2 == null || (awemeRawAd3 = aweme2.getAwemeRawAd()) == null) {
                        str2 = null;
                    } else {
                        str2 = awemeRawAd3.getSource();
                    }
                } else {
                    Aweme aweme3 = adProfilePopUpWebPageWidget.o;
                    if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (str2 = awemeRawAd.getWebTitle()) == null) {
                        str2 = "";
                    }
                }
                ac.a aVar = new ac.a();
                Aweme aweme4 = adProfilePopUpWebPageWidget.o;
                if (aweme4 == null || (awemeRawAd2 = aweme4.getAwemeRawAd()) == null || (str3 = awemeRawAd2.getWebUrl()) == null) {
                    str3 = "";
                }
                ac.a a2 = aVar.a(str3).a(adProfilePopUpWebPageWidget.p).a(hh.b());
                if (str2 == null) {
                    str2 = "";
                }
                ac.a b2 = a2.b(str2);
                Aweme aweme5 = adProfilePopUpWebPageWidget.o;
                Bundle bundle = new Bundle();
                Fragment fragment3 = adProfilePopUpWebPageWidget.p;
                if (!(fragment3 == null || (context = fragment3.getContext()) == null)) {
                    l.b(context, "");
                    if (!(aweme5 == null || aweme5.getAwemeRawAd() == null)) {
                        com.ss.android.ugc.aweme.commercialize.utils.a.a(bundle, aweme5, context);
                        com.ss.android.ugc.aweme.commercialize.utils.a.b(bundle, aweme5, context);
                        com.ss.android.ugc.aweme.commercialize.utils.a.c(bundle, aweme5, context);
                        com.ss.android.ugc.aweme.commercialize.utils.a.a(bundle, context);
                    }
                }
                ac.a a3 = b2.a(bundle);
                Aweme aweme6 = adProfilePopUpWebPageWidget.o;
                if (aweme6 != null) {
                    awemeRawAd5 = aweme6.getAwemeRawAd();
                }
                ac a4 = a3.a(awemeRawAd5).a();
                c cVar = adProfilePopUpWebPageWidget.f75125j;
                d dVar = adProfilePopUpWebPageWidget.f75127l;
                l.d(activity, "");
                l.d(a4, "");
                AdPopUpWebPageView b3 = a.b(activity);
                if (b3 == null) {
                    b3 = new AdPopUpWebPageView(activity, (byte) 0);
                    b3.setUseBullet(com.ss.android.ugc.aweme.landpage.b.a.f107275a.a(a4.f75551f));
                    b3.setId(R.id.g3);
                    b3.setParams(a4);
                    b3.setMBehaviorCallback(cVar);
                    b3.setKeyDownCallBack(dVar);
                    FrameLayout a5 = a.a(activity);
                    if (a5 != null) {
                        a5.addView(b3);
                    }
                }
                adProfilePopUpWebPageWidget.f75122a = b3;
                AdPopUpWebPageView adPopUpWebPageView = adProfilePopUpWebPageWidget.f75122a;
                if (adPopUpWebPageView != null) {
                    adPopUpWebPageView.setTitleBarCallback(adProfilePopUpWebPageWidget.f75126k);
                }
                adProfilePopUpWebPageWidget.hashCode();
            }
            MethodCollector.o(9920);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u, com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        if (this.f75122a != null) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a("duration", j2);
            r.a("h5_stay_time", dVar.f66730a);
        }
    }

    public static final boolean a(com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b bVar) {
        WeakReference<Runnable> weakReference;
        Runnable runnable;
        if (bVar == null) {
            return false;
        }
        Context context = bVar.f74372a;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            String str = bVar.f74379h;
            if (!(str == null || (weakReference = f75121m.get(str)) == null || (runnable = weakReference.get()) == null)) {
                runnable.run();
            }
            AdPopUpWebPageView b2 = a.b(activity);
            if (b2 != null && !b2.g()) {
                FrameLayout a2 = a.a(activity);
                if (a2 != null) {
                    a2.setVisibility(0);
                }
                b2.setShouldStartAnimation(bVar.f74382k);
                b2.getActionMode().f74368f = bVar.f74375d;
                b2.a(new a.C1711a(b2, bVar));
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        androidx.fragment.app.e activity;
        String aid;
        String aid2;
        AwemeRawAd awemeRawAd;
        MethodCollector.i(9671);
        super.onChanged(bVar);
        if (bVar == null || (str = bVar.f67014a) == null) {
            MethodCollector.o(9671);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1540531799) {
            if (hashCode == -1132409520 && str.equals("ad_feed_on_page_selected")) {
                Aweme aweme = this.o;
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.aB(aweme) || com.ss.android.ugc.aweme.commercialize.e.a.b.ay(aweme) || !(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getWebviewType() != 1)) {
                    Aweme aweme2 = this.o;
                    if (aweme2 == null || (aid2 = aweme2.getAid()) == null) {
                        MethodCollector.o(9671);
                        return;
                    }
                    f75121m.put(aid2, new WeakReference<>(this.s));
                    MethodCollector.o(9671);
                    return;
                }
                MethodCollector.o(9671);
                return;
            }
        } else if (str.equals("ad_feed_on_page_unselected")) {
            Aweme aweme3 = this.o;
            if (!(aweme3 == null || (aid = aweme3.getAid()) == null)) {
                f75121m.remove(aid);
            }
            if (this.f75122a == null) {
                MethodCollector.o(9671);
                return;
            }
            Fragment fragment = this.p;
            if (fragment == null || (activity = fragment.getActivity()) == null) {
                MethodCollector.o(9671);
                return;
            }
            l.d(activity, "");
            AdPopUpWebPageView b2 = a.b(activity);
            if (b2 != null) {
                b2.b();
                FrameLayout a2 = a.a(activity);
                if (a2 != null) {
                    a2.removeView(b2);
                }
            }
            this.f75122a = null;
            hashCode();
        }
        MethodCollector.o(9671);
    }
}
