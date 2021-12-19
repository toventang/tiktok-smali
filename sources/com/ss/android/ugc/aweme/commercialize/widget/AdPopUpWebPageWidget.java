package com.ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.utils.aa;
import com.ss.android.ugc.aweme.commercialize.utils.ac;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class AdPopUpWebPageWidget extends AbsAdFeedWidget implements au {
    public static final Map<String, WeakReference<Runnable>> n = new HashMap();
    public static final a s = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AdPopUpWebPageView f76313a;

    /* renamed from: h  reason: collision with root package name */
    public String f76314h;

    /* renamed from: i  reason: collision with root package name */
    long f76315i;

    /* renamed from: j  reason: collision with root package name */
    final c f76316j = new c(this);

    /* renamed from: k  reason: collision with root package name */
    final f f76317k = new f(this);

    /* renamed from: l  reason: collision with root package name */
    final d f76318l = new d(this);

    /* renamed from: m  reason: collision with root package name */
    public FeedAdViewModel f76319m;
    private final Runnable t = new b(this);

    public static final class a {
        static {
            Covode.recordClassIndex(47071);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$a$a  reason: collision with other inner class name */
        public static final class C1737a extends com.google.gson.b.a<List<? extends String>> {
            static {
                Covode.recordClassIndex(47072);
            }

            C1737a() {
            }
        }

        public static final class b extends com.google.gson.b.a<Boolean> {
            static {
                Covode.recordClassIndex(47073);
            }

            b() {
            }
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        public static final class c extends m implements h.f.a.a<Object> {
            final /* synthetic */ com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b $openParams;
            final /* synthetic */ AdPopUpWebPageView $popUpWebPageView;

            static {
                Covode.recordClassIndex(47074);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(AdPopUpWebPageView adPopUpWebPageView, com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b bVar) {
                super(0);
                this.$popUpWebPageView = adPopUpWebPageView;
                this.$openParams = bVar;
            }

            @Override // h.f.a.a
            public final Object invoke() {
                return Boolean.valueOf(this.$popUpWebPageView.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.a.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f76320a;

                    static {
                        Covode.recordClassIndex(47075);
                    }

                    {
                        this.f76320a = r1;
                    }

                    public final void run() {
                        this.f76320a.$popUpWebPageView.a(this.f76320a.$openParams);
                    }
                }));
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static FrameLayout b(Activity activity) {
            FrameLayout d2 = d(activity);
            if (d2 == null) {
                return e(activity);
            }
            return d2;
        }

        private static void b(com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b bVar) {
            String str;
            WeakReference<Runnable> weakReference;
            Runnable runnable;
            if (bVar != null && (str = bVar.f74379h) != null && (weakReference = AdPopUpWebPageWidget.n.get(str)) != null && (runnable = weakReference.get()) != null) {
                runnable.run();
            }
        }

        static AdPopUpWebPageView c(Activity activity) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout b2 = b(activity);
            if (b2 != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) b2.findViewById(R.id.g3);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        private static FrameLayout d(Activity activity) {
            View inflate;
            MethodCollector.i(3957);
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.eg);
            if (viewStub == null) {
                inflate = activity.findViewById(R.id.ef);
            } else {
                viewStub.setLayoutResource(R.layout.a3f);
                inflate = viewStub.inflate();
                if (inflate == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    MethodCollector.o(3957);
                    throw nullPointerException;
                }
            }
            FrameLayout frameLayout = (FrameLayout) inflate;
            MethodCollector.o(3957);
            return frameLayout;
        }

        private static FrameLayout e(Activity activity) {
            View inflate;
            MethodCollector.i(3972);
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.dm);
            if (viewStub == null) {
                inflate = activity.findViewById(R.id.dl);
            } else {
                viewStub.setLayoutResource(R.layout.cl);
                inflate = viewStub.inflate();
                if (inflate == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    MethodCollector.o(3972);
                    throw nullPointerException;
                }
            }
            FrameLayout frameLayout = (FrameLayout) inflate;
            MethodCollector.o(3972);
            return frameLayout;
        }

        public final void a(Activity activity) {
            MethodCollector.i(3209);
            l.d(activity, "");
            AdPopUpWebPageView c2 = c(activity);
            if (c2 != null) {
                c2.b();
                FrameLayout b2 = b(activity);
                if (b2 != null) {
                    b2.removeView(c2);
                    MethodCollector.o(3209);
                    return;
                }
                MethodCollector.o(3209);
                return;
            }
            MethodCollector.o(3209);
        }

        public final boolean a(com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b bVar) {
            if (bVar == null) {
                return false;
            }
            Context context = bVar.f74372a;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null) {
                return false;
            }
            b(bVar);
            AdPopUpWebPageView c2 = c(activity);
            if (c2 == null || c2.g()) {
                return false;
            }
            FrameLayout b2 = b(activity);
            if (b2 != null) {
                b2.setVisibility(0);
            }
            c2.getActionMode().f74368f = bVar.f74375d;
            c2.a(new c(c2, bVar));
            return true;
        }

        public final AdPopUpWebPageView a(Activity activity, ac acVar, AdPopUpWebPageView.a aVar, AdPopUpWebPageView.c cVar) {
            MethodCollector.i(3204);
            l.d(activity, "");
            l.d(acVar, "");
            AdPopUpWebPageView c2 = c(activity);
            if (c2 == null) {
                c2 = new AdPopUpWebPageView(activity, (byte) 0);
                c2.setId(R.id.g3);
                c2.setParams(acVar);
                c2.setMBehaviorCallback(aVar);
                c2.setKeyDownCallBack(cVar);
                FrameLayout b2 = b(activity);
                if (b2 != null) {
                    b2.addView(c2);
                }
            }
            MethodCollector.o(3204);
            return c2;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class e extends com.google.gson.b.a<Boolean> {
        static {
            Covode.recordClassIndex(47079);
        }

        e() {
        }
    }

    public static final class d implements AdPopUpWebPageView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageWidget f76323a;

        static {
            Covode.recordClassIndex(47078);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.c
        public final void a() {
            this.f76323a.f76314h = "back";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f76323a = adPopUpWebPageWidget;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        a(System.currentTimeMillis() - this.f76315i);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        this.f76315i = System.currentTimeMillis();
        super.onResume();
    }

    public static final class f implements AdPopUpWebPageView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageWidget f76324a;

        static {
            Covode.recordClassIndex(47080);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void a() {
            this.f76324a.f76314h = "button";
            DataCenter dataCenter = this.f76324a.f67010e;
            if (dataCenter != null) {
                dataCenter.a("action_ad_pop_up_web_resume_video", (Object) null);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void b() {
            AwemeRawAd awemeRawAd;
            AdPopUpWebPageView adPopUpWebPageView = this.f76324a.f76313a;
            if (adPopUpWebPageView != null) {
                com.ss.android.ugc.aweme.commercialize.feed.popupwebview.a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = this.f76324a.o;
                AwemeRawAd awemeRawAd2 = null;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.b(awemeRawAd)) {
                    f.b a2 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                    a2.f74804a = "homepage_landing_ad";
                    a2.f74805b = "report";
                    a2.b(this.f76324a.o).a((Context) null);
                    Aweme aweme2 = this.f76324a.o;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_landing_ad", "report", awemeRawAd2).c();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f76324a = adPopUpWebPageWidget;
        }
    }

    static {
        Covode.recordClassIndex(47070);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a() {
        super.a();
        DataCenter dataCenter = this.f67010e;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_feed_on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_video_on_resume_play", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
    }

    /* access modifiers changed from: package-private */
    public final String f() {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.o;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getWebviewPannelStyle() != 1) {
            return "landing_page";
        }
        return "close";
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        String str;
        AwemeRawAd awemeRawAd;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme aweme = this.o;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (str = awemeRawAd.getWebUrl()) == null) {
            str = "";
        }
        linkedHashMap.put("url", str);
        linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("ad_webview_close", System.currentTimeMillis(), com.bytedance.ies.xbridge.platform.b.b.a(linkedHashMap)));
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageWidget f76321a;

        static {
            Covode.recordClassIndex(47076);
        }

        b(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f76321a = adPopUpWebPageWidget;
        }

        public final void run() {
            androidx.fragment.app.e activity;
            Fragment fragment;
            Context context;
            String str;
            String str2;
            AwemeRawAd awemeRawAd;
            String str3;
            Context context2;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AwemeRawAd awemeRawAd4;
            AdPopUpWebPageWidget adPopUpWebPageWidget = this.f76321a;
            Fragment fragment2 = adPopUpWebPageWidget.p;
            AwemeRawAd awemeRawAd5 = null;
            if (fragment2 != null && (activity = fragment2.getActivity()) != null && (fragment = adPopUpWebPageWidget.p) != null && (context = fragment.getContext()) != null) {
                Aweme aweme = adPopUpWebPageWidget.o;
                if (aweme == null || (awemeRawAd4 = aweme.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd4.getSource();
                }
                if (!TextUtils.isEmpty(str)) {
                    Aweme aweme2 = adPopUpWebPageWidget.o;
                    if (aweme2 == null || (awemeRawAd3 = aweme2.getAwemeRawAd()) == null) {
                        str2 = null;
                    } else {
                        str2 = awemeRawAd3.getSource();
                    }
                } else {
                    Aweme aweme3 = adPopUpWebPageWidget.o;
                    if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (str2 = awemeRawAd.getWebTitle()) == null) {
                        str2 = "";
                    }
                }
                a aVar = AdPopUpWebPageWidget.s;
                ac.a aVar2 = new ac.a();
                Aweme aweme4 = adPopUpWebPageWidget.o;
                if (aweme4 == null || (awemeRawAd2 = aweme4.getAwemeRawAd()) == null || (str3 = awemeRawAd2.getWebUrl()) == null) {
                    str3 = "";
                }
                ac.a a2 = aVar2.a(str3).a(adPopUpWebPageWidget.p).a(hh.b());
                if (str2 == null) {
                    str2 = "";
                }
                ac.a b2 = a2.b(str2);
                Aweme aweme5 = adPopUpWebPageWidget.o;
                Bundle bundle = new Bundle();
                Fragment fragment3 = adPopUpWebPageWidget.p;
                if (!(fragment3 == null || (context2 = fragment3.getContext()) == null)) {
                    l.b(context2, "");
                    if (!(aweme5 == null || aweme5.getAwemeRawAd() == null)) {
                        com.ss.android.ugc.aweme.commercialize.utils.d.a(bundle, aweme5, context2);
                        com.ss.android.ugc.aweme.commercialize.utils.d.b(bundle, aweme5, context2);
                        com.ss.android.ugc.aweme.commercialize.utils.d.c(bundle, aweme5, context2);
                        com.ss.android.ugc.aweme.commercialize.utils.d.a(bundle, context2);
                    }
                }
                ac.a a3 = b2.a(bundle);
                Aweme aweme6 = adPopUpWebPageWidget.o;
                if (aweme6 != null) {
                    awemeRawAd5 = aweme6.getAwemeRawAd();
                }
                adPopUpWebPageWidget.f76313a = aVar.a(activity, a3.a(awemeRawAd5).a(adPopUpWebPageWidget.a(context, adPopUpWebPageWidget.o)).a(), adPopUpWebPageWidget.f76316j, adPopUpWebPageWidget.f76318l);
                AdPopUpWebPageView adPopUpWebPageView = adPopUpWebPageWidget.f76313a;
                if (adPopUpWebPageView != null) {
                    adPopUpWebPageView.setTitleBarCallback(adPopUpWebPageWidget.f76317k);
                }
                adPopUpWebPageWidget.hashCode();
            }
        }
    }

    public static final class c implements AdPopUpWebPageView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageWidget f76322a;

        static {
            Covode.recordClassIndex(47077);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(String str) {
            l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a() {
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            Integer num;
            com.ss.android.ugc.aweme.commercialize.feed.popupwebview.a actionMode;
            AdPopUpWebPageWidget adPopUpWebPageWidget = this.f76322a;
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.popupwebview.d(true));
            adPopUpWebPageWidget.f76319m.a(true);
            DataCenter dataCenter = adPopUpWebPageWidget.f67010e;
            AwemeRawAd awemeRawAd4 = null;
            if (dataCenter != null) {
                AdPopUpWebPageView adPopUpWebPageView = adPopUpWebPageWidget.f76313a;
                if (adPopUpWebPageView == null || (actionMode = adPopUpWebPageView.getActionMode()) == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(actionMode.f74368f);
                }
                dataCenter.a("action_ad_pop_up_web_pause_video", num);
            }
            adPopUpWebPageWidget.f76315i = System.currentTimeMillis();
            AdPopUpWebPageView adPopUpWebPageView2 = adPopUpWebPageWidget.f76313a;
            if (adPopUpWebPageView2 != null) {
                com.ss.android.ugc.aweme.commercialize.feed.popupwebview.a actionMode2 = adPopUpWebPageView2.getActionMode();
                Aweme aweme = adPopUpWebPageWidget.o;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode2.a(awemeRawAd)) {
                    f.b a2 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                    a2.f74804a = "landing_ad";
                    a2.f74805b = "detail_show";
                    a2.b(adPopUpWebPageWidget.o).a((Context) null);
                    Aweme aweme2 = adPopUpWebPageWidget.o;
                    if (aweme2 != null) {
                        awemeRawAd3 = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd3 = null;
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "detail_show", awemeRawAd3).c();
                }
                com.ss.android.ugc.aweme.commercialize.feed.popupwebview.a actionMode3 = adPopUpWebPageView2.getActionMode();
                Aweme aweme3 = adPopUpWebPageWidget.o;
                if (aweme3 != null) {
                    awemeRawAd2 = aweme3.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                if (actionMode3.b(awemeRawAd2)) {
                    f.b a3 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                    a3.f74804a = "homepage_landing_ad";
                    a3.f74805b = "detail_show";
                    a3.b(adPopUpWebPageWidget.o).a((Context) null);
                    Aweme aweme4 = adPopUpWebPageWidget.o;
                    if (aweme4 != null) {
                        awemeRawAd4 = aweme4.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_landing_ad", "detail_show", awemeRawAd4).c();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f76322a = adPopUpWebPageWidget;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void b(int i2) {
            DataCenter dataCenter = this.f76322a.f67010e;
            if (dataCenter != null) {
                dataCenter.a("action_ad_pop_up_web_pause_video", (Object) null);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2) {
            String str;
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AwemeRawAd awemeRawAd4;
            AdPopUpWebPageWidget adPopUpWebPageWidget = this.f76322a;
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.popupwebview.d(false));
            adPopUpWebPageWidget.f76319m.a(false);
            DataCenter dataCenter = adPopUpWebPageWidget.f67010e;
            if (dataCenter != null) {
                dataCenter.a("action_ad_pop_up_web_resume_video", (Object) null);
            }
            AdPopUpWebPageView adPopUpWebPageView = adPopUpWebPageWidget.f76313a;
            if (adPopUpWebPageView != null) {
                String str2 = "slide";
                if (aa.f75533d == 1) {
                    str = str2;
                } else {
                    str = "slide_down";
                }
                com.ss.android.ugc.aweme.commercialize.feed.popupwebview.a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = adPopUpWebPageWidget.o;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.a(awemeRawAd)) {
                    f.b a2 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                    a2.f74804a = "landing_ad";
                    a2.f74805b = adPopUpWebPageWidget.f();
                    String str3 = adPopUpWebPageWidget.f76314h;
                    if (str3 == null) {
                        str3 = str;
                    }
                    a2.c(str3).b(adPopUpWebPageWidget.o).a((Context) null);
                    String f2 = adPopUpWebPageWidget.f();
                    Aweme aweme2 = adPopUpWebPageWidget.o;
                    if (aweme2 != null) {
                        awemeRawAd4 = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd4 = null;
                    }
                    a.C0791a a3 = com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", f2, awemeRawAd4);
                    String str4 = adPopUpWebPageWidget.f76314h;
                    if (str4 != null) {
                        str = str4;
                    }
                    a3.b("refer", str).c();
                }
                com.ss.android.ugc.aweme.commercialize.feed.popupwebview.a actionMode2 = adPopUpWebPageView.getActionMode();
                Aweme aweme3 = adPopUpWebPageWidget.o;
                if (aweme3 != null) {
                    awemeRawAd2 = aweme3.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                if (actionMode2.b(awemeRawAd2)) {
                    f.b a4 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                    a4.f74804a = "homepage_landing_ad";
                    a4.f74805b = adPopUpWebPageWidget.f();
                    String str5 = adPopUpWebPageWidget.f76314h;
                    if (str5 == null) {
                        str5 = str2;
                    }
                    a4.c(str5).b(adPopUpWebPageWidget.o).a((Context) null);
                    String f3 = adPopUpWebPageWidget.f();
                    Aweme aweme4 = adPopUpWebPageWidget.o;
                    if (aweme4 != null) {
                        awemeRawAd3 = aweme4.getAwemeRawAd();
                    } else {
                        awemeRawAd3 = null;
                    }
                    a.C0791a a5 = com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_landing_ad", f3, awemeRawAd3);
                    String str6 = adPopUpWebPageWidget.f76314h;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    a5.b("refer", str2).c();
                }
            }
            adPopUpWebPageWidget.a(System.currentTimeMillis() - adPopUpWebPageWidget.f76315i);
            adPopUpWebPageWidget.e();
            this.f76322a.f76314h = null;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2, Boolean bool) {
            this.f76322a.e();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u, com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    public AdPopUpWebPageWidget(FeedAdViewModel feedAdViewModel) {
        l.d(feedAdViewModel, "");
        this.f76319m = feedAdViewModel;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        if (this.f76313a != null) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a("duration", j2);
            r.a("h5_stay_time", dVar.f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        Fragment fragment;
        androidx.fragment.app.e activity;
        String aid;
        Aweme aweme;
        String aid2;
        String extra;
        boolean z;
        boolean z2;
        Fragment fragment2;
        androidx.fragment.app.e activity2;
        super.onChanged(bVar);
        if (bVar != null && (str = bVar.f67014a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode != -1132409520) {
                    if (hashCode == 2040441990 && str.equals("ad_video_on_resume_play") && this.f76313a != null && (fragment2 = this.p) != null && (activity2 = fragment2.getActivity()) != null) {
                        l.b(activity2, "");
                        l.d(activity2, "");
                        AdPopUpWebPageView c2 = a.c(activity2);
                        if (c2 != null && c2.g()) {
                            this.f67010e.a("action_ad_pop_up_web_pause_video", (Object) null);
                        }
                    }
                } else if (str.equals("ad_feed_on_page_selected") && (aweme = this.o) != null) {
                    List<AnchorCommonStruct> anchors = aweme.getAnchors();
                    if (anchors != null) {
                        Iterator<AnchorCommonStruct> it = anchors.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            AnchorCommonStruct next = it.next();
                            if (next.getType() == 24 && (extra = next.getExtra()) != null && extra.length() != 0) {
                                com.google.gson.l a2 = q.a(next.getExtra());
                                l.b(a2, "");
                                Boolean bool = (Boolean) new com.google.gson.f().a(a2.j().c("is_schema_lynx"), new a.b().type);
                                if (bool != null) {
                                    if (!bool.booleanValue()) {
                                        if (aweme == null) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (aweme.getAwemeRawAd() != null) {
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        if (awemeRawAd == null || awemeRawAd.getWebviewType() != 1) {
                            z = false;
                        } else {
                            z = true;
                        }
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 == null || awemeRawAd2.getProfileWithWebview() != 1) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z && !z2) {
                            return;
                        }
                        Aweme aweme2 = this.o;
                        if (aweme2 != null && (aid2 = aweme2.getAid()) != null) {
                            n.put(aid2, new WeakReference<>(this.t));
                        }
                    }
                }
            } else if (str.equals("ad_feed_on_page_unselected")) {
                Aweme aweme3 = this.o;
                if (!(aweme3 == null || (aid = aweme3.getAid()) == null)) {
                    n.remove(aid);
                }
                if (this.f76313a != null && (fragment = this.p) != null && (activity = fragment.getActivity()) != null) {
                    s.a(activity);
                    this.f76313a = null;
                    hashCode();
                }
            }
        }
    }

    public final AnchorLynxModel a(Context context, Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        String str;
        l.d(context, "");
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        boolean z = false;
        int i2 = 0;
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            i2++;
            if (anchorCommonStruct.getType() == 24) {
                com.google.gson.l a2 = q.a(anchorCommonStruct.getExtra());
                l.b(a2, "");
                if (l.a(new com.google.gson.f().a(a2.j().c("is_schema_lynx"), new e().type), (Object) true)) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_lynx_landing_page", true);
                    bundle.putBoolean("hide_nav_bar", true);
                    bundle.putBoolean("hide_status_bar", false);
                    bundle.putBoolean("bundle_nav_bar_status_padding", true);
                    bundle.putBoolean("need_bottom_out", true);
                    com.google.gson.l a3 = q.a(anchorCommonStruct.getExtra());
                    l.b(a3, "");
                    List list = (List) new com.google.gson.f().a(a3.j().c("gecko_channel"), new a.C1737a().type);
                    if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                        str = (String) list.get(0);
                    } else {
                        str = "";
                    }
                    bundle.putString("lynx_channel_name", str);
                    bundle.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(n.a(context), 1073741824));
                    bundle.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(n.b(context) - hh.b(), 1073741824));
                    String schema = anchorCommonStruct.getSchema();
                    if (schema == null) {
                        schema = "";
                    }
                    Uri parse = Uri.parse(schema);
                    l.b(parse, "");
                    String str2 = "1";
                    if (parse.isHierarchical()) {
                        bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                        if (TextUtils.equals(parse.getQueryParameter("async_layout"), str2)) {
                            bundle.putBoolean("preset_safe_point", true);
                            bundle.putInt("thread_strategy", com.lynx.tasm.r.PART_ON_LAYOUT.id());
                        }
                    }
                    if (anchors.size() == 1) {
                        str2 = "0";
                    } else if (i2 != 0) {
                        str2 = "2";
                    }
                    String schema2 = anchorCommonStruct.getSchema();
                    if (schema2 == null) {
                        schema2 = "";
                    }
                    Uri.Builder buildUpon = Uri.parse(schema2).buildUpon();
                    String id = anchorCommonStruct.getId();
                    if (anchors.size() == 1) {
                        z = true;
                    }
                    String uri = buildUpon.appendQueryParameter("extra", a(aweme, id, z, str2)).build().toString();
                    l.b(uri, "");
                    return new AnchorLynxModel(uri, bundle);
                }
            }
        }
        return null;
    }

    private String a(Aweme aweme, String str, boolean z, String str2) {
        String str3;
        String str4;
        l.d(str, "");
        l.d(str2, "");
        o oVar = new o();
        try {
            oVar.a("enter_from", this.q);
            oVar.a("from_source", "item_anchor");
            String str5 = null;
            if (aweme != null) {
                str3 = aweme.getAid();
            } else {
                str3 = null;
            }
            oVar.a("from_group_id", str3);
            if (aweme != null) {
                str5 = aweme.getAuthorUid();
            }
            oVar.a("from_author_id", str5);
            oVar.a("scene_id", str);
            if (z) {
                str4 = "item_play";
            } else {
                str4 = "anchor_list";
            }
            oVar.a("position", str4);
            oVar.a("anchor_type", str2);
        } catch (Exception unused) {
        }
        String oVar2 = oVar.toString();
        l.b(oVar2, "");
        return oVar2;
    }
}
