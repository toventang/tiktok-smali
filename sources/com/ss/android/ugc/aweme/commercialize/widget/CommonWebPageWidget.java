package com.ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.utils.ac;
import com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer;
import com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView;
import com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebTitleBar;
import com.ss.android.ugc.aweme.commercialize.widget.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;

public final class CommonWebPageWidget extends AbsAdFeedWidget implements au {

    /* renamed from: l  reason: collision with root package name */
    public static boolean f76325l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f76326m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    CommonPopUpWebPageView f76327a;

    /* renamed from: h  reason: collision with root package name */
    long f76328h;

    /* renamed from: i  reason: collision with root package name */
    final b f76329i = new b(this);

    /* renamed from: j  reason: collision with root package name */
    final d f76330j = new d();

    /* renamed from: k  reason: collision with root package name */
    final c f76331k = new c();

    static {
        Covode.recordClassIndex(47081);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47082);
        }

        private a() {
        }

        public static void a() {
            if (CommonWebPageWidget.f76325l) {
                v.O().y();
                CommonWebPageWidget.f76325l = false;
            }
        }

        private static boolean b() {
            com.ss.android.ugc.aweme.video.i O = v.O();
            l.b(O, "");
            return O.o();
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget$a$a  reason: collision with other inner class name */
        static final class C1738a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.c $openParams;
            final /* synthetic */ CommonPopUpWebPageView $popUpWebPageView;

            static {
                Covode.recordClassIndex(47083);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1738a(com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.c cVar, CommonPopUpWebPageView commonPopUpWebPageView) {
                super(0);
                this.$openParams = cVar;
                this.$popUpWebPageView = commonPopUpWebPageView;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                Bundle bundle;
                this.$popUpWebPageView.getActionMode().f76238f = this.$openParams.f76253d;
                a.a(this.$openParams.f76253d);
                CommonPopUpWebPageView commonPopUpWebPageView = this.$popUpWebPageView;
                com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.c cVar = this.$openParams;
                l.d(cVar, "");
                String str = cVar.f76251b;
                String str2 = null;
                if (str == null) {
                    ac acVar = commonPopUpWebPageView.f76206e;
                    if (acVar != null) {
                        str = acVar.f75546a;
                    }
                    return z.f158842a;
                }
                if (!(str == null || str.length() == 0)) {
                    commonPopUpWebPageView.f76210i.d().b();
                    commonPopUpWebPageView.f76212k = cVar;
                    CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer = (CommonPopUpWebBottomSheetContainer) commonPopUpWebPageView.a(R.id.d70);
                    commonPopUpWebBottomSheetContainer.getActionMode().a(cVar.f76254e);
                    commonPopUpWebBottomSheetContainer.f76195h.b(commonPopUpWebBottomSheetContainer.getActionMode().f76233a);
                    int i2 = cVar.f76254e;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ((CommonPopUpWebBottomSheetContainer) commonPopUpWebPageView.a(R.id.d70)).a();
                        } else if (i2 == 3) {
                            ((CommonPopUpWebBottomSheetContainer) commonPopUpWebPageView.a(R.id.d70)).f76195h.c(4);
                        }
                    }
                    String str3 = cVar.f76251b;
                    if (str3 == null) {
                        ac acVar2 = commonPopUpWebPageView.f76206e;
                        if (acVar2 != null) {
                            str2 = acVar2.f75546a;
                        }
                    } else {
                        str2 = str3;
                    }
                    ac acVar3 = commonPopUpWebPageView.f76206e;
                    if (!(acVar3 == null || (bundle = acVar3.f75550e) == null)) {
                        String string = bundle.getString("title");
                        if (com.bytedance.x.c.c.a(string)) {
                            string = bundle.getString("bundle_web_title");
                        }
                        if (com.bytedance.x.c.c.a(string)) {
                            string = Uri.parse(str2).getQueryParameter("title");
                        }
                        if (com.bytedance.x.c.c.a(string)) {
                            string = commonPopUpWebPageView.getContext().getString(R.string.g4k);
                        }
                        CommonPopUpWebTitleBar commonPopUpWebTitleBar = (CommonPopUpWebTitleBar) commonPopUpWebPageView.a(R.id.d7g);
                        if (TextUtils.isEmpty(string)) {
                            string = commonPopUpWebTitleBar.getContext().getString(R.string.g4z);
                        }
                        commonPopUpWebTitleBar.f76228a = string;
                        TuxTextView tuxTextView = (TuxTextView) commonPopUpWebTitleBar.a(R.id.d7f);
                        l.b(tuxTextView, "");
                        tuxTextView.setText(commonPopUpWebTitleBar.f76228a);
                        ((TuxIconView) commonPopUpWebTitleBar.a(R.id.d71)).setOnClickListener(new CommonPopUpWebTitleBar.c(commonPopUpWebTitleBar));
                        CommonPopUpWebTitleBar commonPopUpWebTitleBar2 = (CommonPopUpWebTitleBar) commonPopUpWebPageView.a(R.id.d7g);
                        if (str2 == null) {
                            str2 = "";
                        }
                        commonPopUpWebTitleBar2.setSubTitle(str2);
                    }
                    FrameLayout frameLayout = (FrameLayout) commonPopUpWebPageView.a(R.id.d74);
                    l.b(frameLayout, "");
                    frameLayout.setVisibility(0);
                    com.ss.android.ugc.aweme.ad.feed.h.b bVar = commonPopUpWebPageView.f76202a;
                    if (bVar != null) {
                        bVar.a(true);
                    }
                    ((FrameLayout) commonPopUpWebPageView.a(R.id.d74)).setOnClickListener(new CommonPopUpWebPageView.l(commonPopUpWebPageView));
                    com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.b.f76242a = false;
                    WebView webView = commonPopUpWebPageView.getWebView();
                    if (webView != null) {
                        ((CommonPopUpWebBottomSheetContainer) commonPopUpWebPageView.a(R.id.d70)).setWebViewForDragBehavior(webView);
                    }
                    commonPopUpWebPageView.f76204c = true;
                    AdPopUpWebPageContainer adPopUpWebPageContainer = commonPopUpWebPageView.f76203b;
                    if (adPopUpWebPageContainer != null) {
                        adPopUpWebPageContainer.b();
                    }
                    CommonPopUpWebPageView.a aVar = commonPopUpWebPageView.f76207f;
                    if (aVar != null) {
                        aVar.a();
                    }
                    commonPopUpWebPageView.a(cVar.f76251b);
                }
                return z.f158842a;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(int i2) {
            if (b()) {
                v.O().B();
                CommonWebPageWidget.f76325l = true;
            }
            if (i2 == 3) {
                CommonWebPageWidget.f76325l = true;
            }
        }

        static CommonPopUpWebPageView b(Activity activity) {
            CommonPopUpWebPageView commonPopUpWebPageView;
            FrameLayout a2 = a(activity);
            if (a2 != null) {
                commonPopUpWebPageView = (CommonPopUpWebPageView) a2.findViewById(R.id.acc);
            } else {
                commonPopUpWebPageView = null;
            }
            if (!(commonPopUpWebPageView instanceof CommonPopUpWebPageView)) {
                return null;
            }
            return commonPopUpWebPageView;
        }

        static FrameLayout a(Activity activity) {
            View inflate;
            MethodCollector.i(3131);
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.ac_);
            if (viewStub == null) {
                inflate = activity.findViewById(R.id.ac9);
            } else {
                inflate = viewStub.inflate();
                if (inflate == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    MethodCollector.o(3131);
                    throw nullPointerException;
                }
            }
            FrameLayout frameLayout = (FrameLayout) inflate;
            MethodCollector.o(3131);
            return frameLayout;
        }
    }

    public static final class c implements CommonPopUpWebPageView.c {
        static {
            Covode.recordClassIndex(47085);
        }

        c() {
        }
    }

    public static final class d implements CommonPopUpWebPageView.d {
        static {
            Covode.recordClassIndex(47086);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView.d
        public final void a() {
            a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        a(System.currentTimeMillis() - this.f76328h);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        this.f76328h = System.currentTimeMillis();
        super.onResume();
    }

    public static final class b implements CommonPopUpWebPageView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonWebPageWidget f76332a;

        static {
            Covode.recordClassIndex(47084);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView.a
        public final void a() {
            CommonWebPageWidget commonWebPageWidget = this.f76332a;
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.popupwebview.d(true));
            DataCenter dataCenter = commonWebPageWidget.f67010e;
            if (dataCenter != null) {
                dataCenter.a("on_ad_pop_up_web_page_show", (Object) null);
            }
            commonWebPageWidget.f76328h = System.currentTimeMillis();
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView.a
        public final void b() {
            a.a();
            CommonWebPageWidget commonWebPageWidget = this.f76332a;
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.popupwebview.d(false));
            DataCenter dataCenter = commonWebPageWidget.f67010e;
            if (dataCenter != null) {
                dataCenter.a("on_ad_pop_up_web_page_hide", (Object) null);
            }
            commonWebPageWidget.a(System.currentTimeMillis() - commonWebPageWidget.f76328h);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(CommonWebPageWidget commonWebPageWidget) {
            this.f76332a = commonWebPageWidget;
        }
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
            dataCenter.a("video_params", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        l.d(this, "");
        b.f76336a = new WeakReference<>(this);
        if (!b.f76337b) {
            SmartRouter.addInterceptor(new b.a());
            b.f76337b = true;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u, com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        if (this.f76327a != null) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a("duration", j2);
            r.a("h5_stay_time", dVar.f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        Fragment fragment;
        e activity;
        e activity2;
        MethodCollector.i(2486);
        super.onChanged(bVar);
        if (bVar == null || (str = bVar.f67014a) == null) {
            MethodCollector.o(2486);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1540531799) {
            if (hashCode == 2040441990 && str.equals("ad_video_on_resume_play")) {
                if (this.f76327a == null) {
                    MethodCollector.o(2486);
                    return;
                }
                Fragment fragment2 = this.p;
                if (!(fragment2 == null || (activity2 = fragment2.getActivity()) == null)) {
                    l.b(activity2, "");
                    l.d(activity2, "");
                    CommonPopUpWebPageView b2 = a.b(activity2);
                    if (b2 != null && b2.a()) {
                        a.a(-1);
                    }
                    MethodCollector.o(2486);
                    return;
                }
            }
        } else if (!(!str.equals("ad_feed_on_page_unselected") || this.f76327a == null || (fragment = this.p) == null || (activity = fragment.getActivity()) == null)) {
            l.d(activity, "");
            CommonPopUpWebPageView b3 = a.b(activity);
            if (b3 != null) {
                CrossPlatformWebView.a((CrossPlatformWebView) b3.a(R.id.d79), "about:blank", false, null, 6);
                b3.f76210i.d();
                FrameLayout a2 = a.a(activity);
                if (a2 != null) {
                    a2.removeView(b3);
                }
            }
            this.f76327a = null;
            hashCode();
            MethodCollector.o(2486);
            return;
        }
        MethodCollector.o(2486);
    }
}
