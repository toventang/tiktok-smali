package com.ss.android.ugc.aweme.discover.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NotificationCountViewManager;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.tabs.TabLayout;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.DiscoveryServiceImpl;
import com.ss.android.ugc.aweme.discover.a.ak;
import com.ss.android.ugc.aweme.discover.helper.l;
import com.ss.android.ugc.aweme.discover.helper.u;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.tooltip.d;
import com.ss.android.ugc.aweme.discover.ui.SearchScanView;
import com.ss.android.ugc.aweme.discover.ui.b;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.discover.viewmodel.SuggestWordsViewModel;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.MainBottomTabView;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.metrics.am;
import com.ss.android.ugc.aweme.search.k.aa;
import com.ss.android.ugc.aweme.search.k.af;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.utils.gs;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

public final class m extends b implements ar<com.ss.android.ugc.aweme.base.arch.i>, com.bytedance.jedi.arch.q, com.ss.android.ugc.aweme.discover.activity.a, com.ss.android.ugc.aweme.discover.tooltip.a, com.ss.android.ugc.aweme.discover.tooltip.b, com.ss.android.ugc.aweme.discover.tooltip.c {
    public static long Q;
    public static final d R = new d((byte) 0);
    public boolean A;
    public r B;
    public com.ss.android.ugc.aweme.base.arch.i C = new com.ss.android.ugc.aweme.base.arch.i();
    public ViewGroup D;
    public FrameLayout E;
    public SearchScanView F;
    public SearchScanView G;
    public ImageView H;
    public View I;
    public RtlViewPager J;
    public TabLayout K;
    public View L;
    public View M;
    public View N;
    public com.ss.android.ugc.aweme.discover.helper.l O;
    public final LogPbBean P;
    private com.ss.android.ugc.aweme.discover.helper.u S;
    private long T = -1;
    private long U = -1;
    private MainBottomTabView V;
    private com.bytedance.tux.tooltip.a.b.a W;
    private com.bytedance.tux.tooltip.a X;
    private final String Y = "tap_anywhere";
    private final lifecycleAwareLazy Z;
    private TuxIconView aa;
    private String ab;
    private BroadcastReceiver ac;
    private SearchEnterViewModel ad;
    private final h.h ae;
    private final h.h af;
    private Context ag;
    private SparseArray ah;
    public bn y;
    public boolean z;

    public static final class b extends h.f.b.m implements h.f.a.m<TrendsTabState, Bundle, TrendsTabState> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(51429);
        }

        public b() {
            super(2);
        }

        public final TrendsTabState invoke(TrendsTabState trendsTabState, Bundle bundle) {
            h.f.b.l.c(trendsTabState, "");
            return trendsTabState;
        }
    }

    static {
        Covode.recordClassIndex(51427);
    }

    private final TrendsTabViewModel J() {
        return (TrendsTabViewModel) this.Z.getValue();
    }

    private final boolean K() {
        return ((Boolean) this.ae.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b, org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(47, new org.greenrobot.eventbus.g(m.class, "onSearchResultOpenedEvent", com.ss.android.ugc.aweme.discover.e.n.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final int h() {
        return R.layout.y0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final int i() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final String r() {
        return "discovery";
    }

    public static final class d {
        static {
            Covode.recordClassIndex(51432);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.tooltip.a
    public final void aV_() {
        D();
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.C;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.discover.tooltip.b
    public final void l() {
        D();
    }

    /* access modifiers changed from: package-private */
    public static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final g f82605a = new g();

        static {
            Covode.recordClassIndex(51435);
        }

        g() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.ss.android.ugc.aweme.discover.ui.a.b.a.b.f82221b.a();
            return null;
        }
    }

    static final class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final u f82621a = new u();

        static {
            Covode.recordClassIndex(51450);
        }

        u() {
        }

        public final void run() {
            com.ss.android.ugc.aweme.search.h.f121133a.m();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(51428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            h.f.b.l.a((Object) name, "");
            return name;
        }
    }

    static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f82619a;

        static {
            Covode.recordClassIndex(51448);
        }

        s(m mVar) {
            this.f82619a = mVar;
        }

        public final void run() {
            if (this.f82619a.ab_()) {
                this.f82619a.I();
            }
        }
    }

    private final boolean M() {
        if (!K()) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        Context context = this.ag;
        if (context != null) {
            return context;
        }
        return super.getContext();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void k() {
        super.C();
        KeyboardUtils.c(this.f82355b);
        E();
    }

    /* access modifiers changed from: package-private */
    public static final class w<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f82622a;

        static {
            Covode.recordClassIndex(51452);
        }

        w(long j2) {
            this.f82622a = j2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            am a2 = new am().a("discovery");
            a2.f109498a = String.valueOf(this.f82622a);
            a2.f();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f82623a;

        static {
            Covode.recordClassIndex(51453);
        }

        x(long j2) {
            this.f82623a = j2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            am a2 = new am().a("search_empty_page");
            a2.f109498a = String.valueOf(this.f82623a);
            a2.f();
            return null;
        }
    }

    public final void D() {
        if (com.ss.android.ugc.aweme.discover.tooltip.d.f82063b) {
            b();
            d.a.a(this.Y);
            com.ss.android.ugc.aweme.discover.tooltip.d.f82065d = false;
            com.ss.android.ugc.aweme.discover.tooltip.d.f82067f = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.tooltip.c
    public final void b() {
        com.bytedance.tux.tooltip.a aVar;
        if (com.bytedance.ies.abmock.b.a().a("return_fyp_tooltip", ClientExpManager.return_fyp_tooltip()) != 0 && (aVar = this.X) != null) {
            aVar.dismiss();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<TrendsTabViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(51430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_discover_ui_DiscoverAndSearchFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel> r0 = com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.discover.ui.m$c$1 r0 = new com.ss.android.ugc.aweme.discover.ui.m$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.m.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_discover_ui_DiscoverAndSearchFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.search.n.d> {
        final /* synthetic */ com.ss.android.ugc.aweme.search.n.d $this_apply;
        final /* synthetic */ z.e $wordInBox$inlined;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(51451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(com.ss.android.ugc.aweme.search.n.d dVar, m mVar, z.e eVar) {
            super(0);
            this.$this_apply = dVar;
            this.this$0 = mVar;
            this.$wordInBox$inlined = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.search.n.d invoke() {
            Word word;
            com.ss.android.ugc.aweme.search.n.d dVar = this.$this_apply;
            com.ss.android.ugc.aweme.search.n.a searchCommonModel = this.$this_apply.getImmutableData().getSearchCommonModel();
            com.ss.android.ugc.aweme.search.n.i searchVideoModel = this.$this_apply.getImmutableData().getSearchVideoModel();
            T t = this.$wordInBox$inlined.element;
            com.ss.android.ugc.aweme.discover.helper.l lVar = this.this$0.O;
            if (lVar != null) {
                word = lVar.m();
            } else {
                word = null;
            }
            return com.ss.android.ugc.aweme.search.n.d.copy$default(dVar, new com.ss.android.ugc.aweme.search.n.f(searchCommonModel, new com.ss.android.ugc.aweme.search.n.g(t, null, word, 2, null), searchVideoModel), null, 2, null);
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.search.n.d> {
        final /* synthetic */ z.e $aid;
        final /* synthetic */ z.e $authorId;
        final /* synthetic */ com.ss.android.ugc.aweme.search.n.d $contextSource;

        static {
            Covode.recordClassIndex(51454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(com.ss.android.ugc.aweme.search.n.d dVar, z.e eVar, z.e eVar2) {
            super(0);
            this.$contextSource = dVar;
            this.$aid = eVar;
            this.$authorId = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.search.n.d invoke() {
            return com.ss.android.ugc.aweme.search.n.d.copy$default(this.$contextSource, new com.ss.android.ugc.aweme.search.n.f(this.$contextSource.getImmutableData().getSearchCommonModel(), this.$contextSource.getImmutableData().getSearchInputModel(), new com.ss.android.ugc.aweme.search.n.i(this.$authorId.element, this.$aid.element)), null, 2, null);
        }
    }

    private final void N() {
        if (this.f82355b == null) {
            return;
        }
        if (com.ss.android.ugc.aweme.compliance.api.a.p().e()) {
            EditText editText = this.f82355b;
            h.f.b.l.b(editText, "");
            editText.setCursorVisible(false);
            EditText editText2 = this.f82355b;
            h.f.b.l.b(editText2, "");
            editText2.setFocusable(false);
            EditText editText3 = this.f82355b;
            h.f.b.l.b(editText3, "");
            editText3.setFocusableInTouchMode(false);
            return;
        }
        EditText editText4 = this.f82355b;
        h.f.b.l.b(editText4, "");
        editText4.setFocusable(true);
        EditText editText5 = this.f82355b;
        h.f.b.l.b(editText5, "");
        editText5.setFocusableInTouchMode(true);
    }

    private final void P() {
        if (this.T > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.T;
            if (elapsedRealtime > 0) {
                b.i.b(new w(elapsedRealtime), com.ss.android.ugc.aweme.common.r.a());
            }
            this.T = -1;
        }
    }

    private final void Q() {
        if (this.U > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.U;
            if (elapsedRealtime > 0) {
                b.i.b(new x(elapsedRealtime), com.ss.android.ugc.aweme.common.r.a());
            }
            this.U = -1;
        }
    }

    public final void E() {
        if (!a()) {
            if (getActivity() instanceof com.ss.android.ugc.aweme.main.j) {
                androidx.fragment.app.e activity = getActivity();
                if (!(activity instanceof com.ss.android.ugc.aweme.main.j)) {
                    activity = null;
                }
                com.ss.android.ugc.aweme.main.j jVar = (com.ss.android.ugc.aweme.main.j) activity;
                if (jVar != null) {
                    jVar.onKeyBack();
                    return;
                }
                return;
            }
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 == null) {
                h.f.b.l.b();
            }
            activity2.onBackPressed();
        }
    }

    public final void I() {
        com.ss.android.ugc.aweme.discover.helper.u uVar = this.S;
        if (uVar == null) {
            h.f.b.l.b();
        }
        uVar.b();
        b(1);
        this.f82355b.setText("");
        EditText editText = this.f82355b;
        h.f.b.l.b(editText, "");
        editText.setCursorVisible(false);
        a(false);
        bn bnVar = this.y;
        if (bnVar == null) {
            h.f.b.l.b();
        }
        bnVar.f82461c = w();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final void onPause() {
        l a2;
        super.onPause();
        this.f35364f = false;
        if (this.z) {
            if (w() == 1) {
                P();
                r rVar = this.B;
                if (!(rVar == null || (a2 = rVar.a()) == null)) {
                    a2.a(true, true);
                }
            } else if (w() == 3) {
                Q();
            }
        }
        this.A = false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void t() {
        if (w() == 1) {
            com.ss.android.ugc.aweme.discover.helper.u uVar = this.S;
            if (uVar == null) {
                h.f.b.l.b();
            }
            uVar.a();
        }
        this.f82361l.a(false);
        b(3);
        bn bnVar = this.y;
        if (bnVar == null) {
            h.f.b.l.b();
        }
        bnVar.f82461c = w();
        bn bnVar2 = this.y;
        if (bnVar2 == null) {
            h.f.b.l.b();
        }
        bnVar2.a(true, false);
    }

    static final class o extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a $fypAnchorView;

        static {
            Covode.recordClassIndex(51444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar) {
            super(0);
            this.$fypAnchorView = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            com.ss.android.ugc.aweme.discover.tooltip.d.f82069h = System.currentTimeMillis();
            if (com.bytedance.ies.abmock.b.a().a("return_fyp_tooltip", ClientExpManager.return_fyp_tooltip()) == 1) {
                d.a.b("tooltip");
            }
            if (com.bytedance.ies.abmock.b.a().a("return_fyp_tooltip", ClientExpManager.return_fyp_tooltip()) == 2) {
                this.$fypAnchorView.l();
                com.ss.android.ugc.aweme.discover.tooltip.d.f82064c = true;
                d.a.b("tooltip_reddot");
            }
            d.a.a(true);
            NotificationCountViewManager.Companion.NotificationCountViewServiceImpl.d().b();
            com.ss.android.ugc.aweme.discover.tooltip.d.f82066e = true;
            com.ss.android.ugc.aweme.common.r.a("show_fyp_tooltip", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", com.ss.android.ugc.aweme.discover.tooltip.d.f82068g).a(StringSet.type, com.ss.android.ugc.aweme.discover.tooltip.d.f82071j).f66730a);
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f82616a = new p();

        static {
            Covode.recordClassIndex(51445);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            com.ss.android.ugc.aweme.discover.tooltip.d.f82070i = System.currentTimeMillis();
            if (com.ss.android.ugc.aweme.discover.tooltip.d.f82065d) {
                NotificationCountViewManager.Companion.NotificationCountViewServiceImpl.d().a();
                com.ss.android.ugc.aweme.discover.tooltip.d.f82065d = false;
            } else {
                NotificationCountViewManager.Companion.NotificationCountViewServiceImpl.d().c();
            }
            d.a.a(false);
            if (com.ss.android.ugc.aweme.discover.tooltip.d.f82069h > -1 && com.ss.android.ugc.aweme.discover.tooltip.d.f82070i > -1) {
                com.ss.android.ugc.aweme.common.r.a("dismiss_fyp_tooltip", new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, com.ss.android.ugc.aweme.discover.tooltip.d.f82071j).a("duration", com.ss.android.ugc.aweme.discover.tooltip.d.f82070i - com.ss.android.ugc.aweme.discover.tooltip.d.f82069h).a("dismiss_method", com.ss.android.ugc.aweme.discover.tooltip.d.f82072k).f66730a);
            }
            return h.z.f158842a;
        }
    }

    public m() {
        h.k.c a2 = h.f.b.ab.a(TrendsTabViewModel.class);
        a aVar = new a(a2);
        this.Z = new lifecycleAwareLazy(this, aVar, new c(this, aVar, a2, b.INSTANCE));
        this.ae = RouteArgExtension.INSTANCE.optionalArgNotNull(this, q.f82617a, "i18n_tab_mode", Boolean.class);
        this.af = RouteArgExtension.INSTANCE.optionalArg(this, r.f82618a, "search_enter_param", com.ss.android.ugc.aweme.search.model.b.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.android.ugc.aweme.search.n.d L() {
        /*
            r17 = this;
            androidx.fragment.app.e r0 = r17.getActivity()
            r1 = 0
            if (r0 == 0) goto L_0x005e
            androidx.fragment.app.e r0 = r17.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a(r0)
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0019
            java.lang.String r2 = r0.getAid()
            if (r2 != 0) goto L_0x001c
        L_0x0019:
            r2 = r3
            if (r0 == 0) goto L_0x0022
        L_0x001c:
            java.lang.String r0 = r0.getAuthorUid()
            if (r0 != 0) goto L_0x005c
        L_0x0022:
            com.ss.android.ugc.aweme.search.n.i r14 = new com.ss.android.ugc.aweme.search.n.i
            r14.<init>(r3, r2)
            com.ss.android.ugc.aweme.search.n.d r3 = new com.ss.android.ugc.aweme.search.n.d
            com.ss.android.ugc.aweme.search.n.f r11 = new com.ss.android.ugc.aweme.search.n.f
            com.ss.android.ugc.aweme.search.n.a r4 = new com.ss.android.ugc.aweme.search.n.a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 14
            r10 = 0
            java.lang.String r5 = "discovery"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13 = 0
            r15 = 2
            r16 = 0
            r12 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = 2
            r3.<init>(r11, r1, r0, r1)
            androidx.fragment.app.e r0 = r17.getActivity()
            if (r0 == 0) goto L_0x005b
            com.bytedance.track.a r0 = com.bytedance.track.c.a(r0)
            com.bytedance.provider.d r0 = r0.f44410c
            com.bytedance.provider.g r2 = r0.a()
            java.lang.Class<com.ss.android.ugc.aweme.search.n.d> r1 = com.ss.android.ugc.aweme.search.n.d.class
            java.lang.String r0 = "tracker_key"
            r2.a(r0, r3, r1)
        L_0x005b:
            return r3
        L_0x005c:
            r3 = r0
            goto L_0x0022
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.m.L():com.ss.android.ugc.aweme.search.n.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r0 != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.android.ugc.aweme.search.model.b O() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x000c
            androidx.fragment.app.e r0 = r4.getActivity()
            if (r0 != 0) goto L_0x0012
        L_0x000c:
            com.ss.android.ugc.aweme.search.model.b r0 = new com.ss.android.ugc.aweme.search.model.b
            r0.<init>()
            return r0
        L_0x0012:
            androidx.fragment.app.e r0 = r4.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a(r0)
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0024
            java.lang.String r2 = r0.getAid()
            if (r2 != 0) goto L_0x0027
        L_0x0024:
            r2 = r3
            if (r0 == 0) goto L_0x002d
        L_0x0027:
            java.lang.String r0 = r0.getAuthorUid()
            if (r0 != 0) goto L_0x0040
        L_0x002d:
            com.ss.android.ugc.aweme.search.model.b$b r0 = com.ss.android.ugc.aweme.search.model.b.Companion
            com.ss.android.ugc.aweme.search.model.b$a r1 = r0.newBuilder()
            java.lang.String r0 = "discovery"
            r1.f121499a = r0
            r1.f121501c = r2
            r1.f121502d = r3
            com.ss.android.ugc.aweme.search.model.b r0 = r1.a()
            return r0
        L_0x0040:
            r3 = r0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.m.O():com.ss.android.ugc.aweme.search.model.b");
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Context context = getContext();
        if (context == null) {
            h.f.b.l.b();
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(context);
        BroadcastReceiver broadcastReceiver = this.ac;
        if (broadcastReceiver == null) {
            h.f.b.l.b();
        }
        instance.unregisterReceiver(broadcastReceiver);
        if (DiscoveryServiceImpl.g().f()) {
            com.a.b.c.a((int) R.layout.y0);
            com.a.b.c.a((int) R.layout.xp);
        }
        com.bytedance.tux.tooltip.a aVar = this.X;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.X = null;
        this.W = null;
        com.ss.android.ugc.aweme.discover.tooltip.d.f82062a = null;
        SparseArray sparseArray = this.ah;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.activity.a
    public final boolean a() {
        if (!ab_()) {
            return false;
        }
        x();
        int w2 = w();
        if (w2 != 1) {
            if (w2 == 3) {
                Q();
            }
            EditText editText = this.f82355b;
            if (editText != null) {
                editText.setText("");
                editText.setCursorVisible(false);
                editText.clearFocus();
            }
            com.ss.android.ugc.aweme.discover.helper.u uVar = this.S;
            if (uVar != null) {
                uVar.b();
            }
            b(1);
            this.T = SystemClock.elapsedRealtime();
            a(true);
            bn bnVar = this.y;
            if (bnVar != null) {
                bnVar.f82461c = w();
                bnVar.a(false, false);
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.discover.e.d(false));
            J().m();
            return true;
        }
        P();
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void j() {
        b(1);
        Context context = getContext();
        if (context == null) {
            h.f.b.l.b();
        }
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        h.f.b.l.b(childFragmentManager, "");
        this.B = new r(context, childFragmentManager);
        RtlViewPager rtlViewPager = this.J;
        if (rtlViewPager == null) {
            h.f.b.l.b();
        }
        rtlViewPager.setAdapter(this.B);
        r rVar = this.B;
        if (rVar == null) {
            h.f.b.l.b();
        }
        rVar.notifyDataSetChanged();
        RtlViewPager rtlViewPager2 = this.J;
        if (rtlViewPager2 == null) {
            h.f.b.l.b();
        }
        r rVar2 = this.B;
        if (rVar2 == null) {
            h.f.b.l.b();
        }
        rtlViewPager2.setOnPageChangeListener(new q(rVar2));
        RtlViewPager rtlViewPager3 = this.J;
        if (rtlViewPager3 == null) {
            h.f.b.l.b();
        }
        rtlViewPager3.setOffscreenPageLimit(4);
        h.f.b.l.d(this, "");
        h.f.b.l.d(this, "");
        bn bnVar = new bn(this, this);
        bnVar.setArguments(new Bundle(1));
        this.y = bnVar;
        r rVar3 = this.B;
        if (rVar3 == null) {
            h.f.b.l.b();
        }
        bn bnVar2 = this.y;
        if (bnVar2 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.d(bnVar2, "");
        rVar3.f82634a.add(bnVar2);
        rVar3.notifyDataSetChanged();
        f.a.b.b unused = selectSubscribe(J(), n.f82624a, new ah(), new k(this));
        r rVar4 = this.B;
        if (rVar4 != null) {
            rVar4.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final void onResume() {
        Window window;
        View decorView;
        Window window2;
        l a2;
        super.onResume();
        if (this.z) {
            if (w() == 1) {
                this.T = SystemClock.elapsedRealtime();
                r rVar = this.B;
                if (!(rVar == null || (a2 = rVar.a()) == null)) {
                    a2.a(false, true);
                }
            } else if (w() == 3) {
                this.U = SystemClock.elapsedRealtime();
            }
        }
        if (getUserVisibleHint() && !gs.a() && this.z) {
            EditText editText = this.f82355b;
            h.f.b.l.b(editText, "");
            String obj = editText.getHint().toString();
            if (!TextUtils.isEmpty(obj) && !TextUtils.equals(obj, m()) && this.P != null) {
                new af().q("show").b(obj).c(new com.google.gson.f().b(this.P)).f();
            }
            this.A = true;
        }
        androidx.fragment.app.e activity = getActivity();
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            window2.setBackgroundDrawable(null);
        }
        int i2 = Build.VERSION.SDK_INT;
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setBackground(null);
        }
    }

    public static final class i implements u.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f82608a;

        static {
            Covode.recordClassIndex(51437);
        }

        i(m mVar) {
            this.f82608a = mVar;
        }

        @Override // com.ss.android.ugc.aweme.discover.helper.u.a
        public final void a(boolean z) {
            l.b l2;
            com.ss.android.ugc.aweme.discover.helper.l lVar = this.f82608a.O;
            if (lVar != null && (l2 = lVar.l()) != null) {
                l2.b(z);
            }
        }

        @Override // com.ss.android.ugc.aweme.discover.helper.u.a
        public final void b(boolean z) {
            l.b l2;
            if (this.f82608a.O != null) {
                com.ss.android.ugc.aweme.discover.helper.l lVar = this.f82608a.O;
                if (!(lVar == null || (l2 = lVar.l()) == null)) {
                    l2.c(z);
                }
                if (!z) {
                    if (this.f82608a.f82361l.b()) {
                        EditText editText = this.f82608a.f82355b;
                        h.f.b.l.b(editText, "");
                        editText.setVisibility(0);
                        this.f82608a.f82355b.requestFocus();
                        EditText editText2 = this.f82608a.f82355b;
                        h.f.b.l.b(editText2, "");
                        editText2.setCursorVisible(true);
                        KeyboardUtils.b(this.f82608a.f82355b);
                        return;
                    }
                    return;
                }
            } else if (!z) {
                return;
            }
            KeyboardUtils.c(this.f82608a.f82355b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$m  reason: collision with other inner class name */
    public static final class C1942m implements l.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f82614a;

        static {
            Covode.recordClassIndex(51442);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1942m(m mVar) {
            this.f82614a = mVar;
        }

        @Override // com.ss.android.ugc.aweme.discover.helper.l.a
        public final void a(int i2) {
            EditText editText = this.f82614a.f82355b;
            if (editText != null) {
                editText.setVisibility(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.discover.helper.l.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            m mVar = this.f82614a;
            EditText editText = mVar.f82355b;
            h.f.b.l.b(editText, "");
            mVar.b(editText);
            this.f82614a.D();
        }

        @Override // com.ss.android.ugc.aweme.discover.helper.l.a
        public final void a(Word word) {
            h.f.b.l.d(word, "");
            this.f82614a.b(new b.a(word.getWord(), word.getId()));
        }

        @Override // com.ss.android.ugc.aweme.discover.helper.l.a
        public final void a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            this.f82614a.a(new com.ss.android.ugc.aweme.search.model.d().setKeyword(str2).setRealSearchWord(str2).setSearchFrom("default_search_keyword").setOpenNewSearchContainer(false).setEnterMethod("default_search_keyword"));
        }
    }

    public static final class n implements SearchScanView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f82615a;

        static {
            Covode.recordClassIndex(51443);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(m mVar) {
            this.f82615a = mVar;
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.SearchScanView.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            com.ss.android.ugc.aweme.search.model.d searchFrom = new com.ss.android.ugc.aweme.search.model.d().setSearchFrom("normal_search");
            m mVar = this.f82615a;
            h.f.b.l.b(searchFrom, "");
            mVar.c(searchFrom);
            this.f82615a.D();
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.SearchScanView.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
            if (this.f82615a.getActivity() == null || !MSAdaptionService.c().c((Context) this.f82615a.getActivity())) {
                new aa().o("discovery").f();
                Context context = this.f82615a.getContext();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - m.Q >= 1000) {
                    m.Q = elapsedRealtime;
                    SmartRouter.buildRoute(context, "//aweme/scan").withParam("finishAfterScan", false).open();
                }
                this.f82615a.D();
                return;
            }
            new com.bytedance.tux.g.b(this.f82615a).a(this.f82615a.getString(R.string.bey)).b();
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<Boolean, com.ss.android.ugc.aweme.search.model.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f82618a = new r();

        static {
            Covode.recordClassIndex(51447);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.search.model.b invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    public static final class t extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f82620a;

        static {
            Covode.recordClassIndex(51449);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(m mVar) {
            this.f82620a = mVar;
        }

        public final void onReceive(Context context, Intent intent) {
            h.f.b.l.d(context, "");
            h.f.b.l.d(intent, "");
            if (!(!h.f.b.l.a((Object) "android.intent.action.USER_PRESENT", (Object) intent.getAction())) && this.f82620a.getUserVisibleHint() && this.f82620a.f35364f && !this.f82620a.A && this.f82620a.z) {
                EditText editText = this.f82620a.f82355b;
                h.f.b.l.b(editText, "");
                String obj = editText.getHint().toString();
                if (!TextUtils.isEmpty(obj) && !TextUtils.equals(obj, com.ss.android.ugc.aweme.search.b.b.f120981a.a(-1)) && this.f82620a.P != null) {
                    new af().q("show").b(obj).c(new com.google.gson.f().b(this.f82620a.P)).f();
                }
                this.f82620a.A = true;
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchScanView.a f82603a;

        static {
            Covode.recordClassIndex(51433);
        }

        e(SearchScanView.a aVar) {
            this.f82603a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f82603a.b(view);
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f82609a;

        static {
            Covode.recordClassIndex(51438);
        }

        j(m mVar) {
            this.f82609a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.c(this.f82609a.f82361l);
            this.f82609a.E();
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<Boolean, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f82617a = new q();

        static {
            Covode.recordClassIndex(51446);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        h.f.b.l.d(context, "");
        super.onAttach(context);
        this.ag = context;
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f82613a;

        static {
            Covode.recordClassIndex(51441);
        }

        l(m mVar) {
            this.f82613a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new com.bytedance.tux.g.b(this.f82613a).e(R.string.add).b();
            this.f82613a.D();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void a(b.a aVar) {
        h.f.b.l.d(aVar, "");
        if (com.ss.android.ugc.aweme.discover.a.m.a()) {
            b(aVar);
        } else {
            super.a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final boolean e(String str) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.discover.helper.l lVar = this.O;
        if (lVar != null) {
            return lVar.a(str);
        }
        return super.e(str);
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f82606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f82607b;

        static {
            Covode.recordClassIndex(51436);
        }

        h(View view, m mVar) {
            this.f82606a = view;
            this.f82607b = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f82606a.getContext(), "//friends/find").withParam("previous_page", "discover").open();
            com.ss.android.ugc.aweme.common.r.a("click_add_friends", h.v.a("discover", "enter_from"));
            this.f82607b.D();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void b(int i2) {
        super.b(i2);
        if (SearchStateViewModel.isSearchIntermediate(i2)) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.t(8));
        } else {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.t(0));
        }
    }

    @org.greenrobot.eventbus.r
    public final void onSearchResultOpenedEvent(com.ss.android.ugc.aweme.discover.e.n nVar) {
        if (w() != 1) {
            s sVar = new s(this);
            if (com.ss.android.ugc.aweme.search.h.f121133a.h()) {
                View view = getView();
                if (view == null) {
                    h.f.b.l.b();
                }
                view.postDelayed(sVar, 1000);
                return;
            }
            sVar.run();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f82604a = new f();

        static {
            Covode.recordClassIndex(51434);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            aVar2.f44749a = R.raw.icon_scan;
            aVar2.f44752d = Integer.valueOf((int) R.attr.bi);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void a(Bundle bundle) {
        h.f.b.l.d(bundle, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            SearchEnterViewModel a2 = SearchEnterViewModel.a.a(activity);
            this.ad = a2;
            if (a2 == null) {
                h.f.b.l.b();
            }
            a2.a(activity, (com.ss.android.ugc.aweme.search.model.b) this.af.getValue());
            SearchEnterViewModel searchEnterViewModel = this.ad;
            if (searchEnterViewModel == null) {
                h.f.b.l.b();
            }
            if (searchEnterViewModel.f82794a == null) {
                SearchEnterViewModel searchEnterViewModel2 = this.ad;
                if (searchEnterViewModel2 == null) {
                    h.f.b.l.b();
                }
                searchEnterViewModel2.f82794a = O();
            }
            SearchEnterViewModel searchEnterViewModel3 = this.ad;
            if (searchEnterViewModel3 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.search.model.b bVar = searchEnterViewModel3.f82794a;
            if (bVar == null) {
                h.f.b.l.b();
            }
            bVar.setEnterSearchFrom("discovery");
        }
        L();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void b(String str) {
        new com.ss.android.ugc.aweme.search.k.j().p("cancel").o("discovery").f();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void c(com.ss.android.ugc.aweme.search.model.d dVar) {
        Word m2;
        h.f.b.l.d(dVar, "");
        if (!com.ss.android.ugc.aweme.search.s.c.a(dVar.getKeyword()) && getContext() != null && getActivity() != null) {
            com.ss.android.ugc.aweme.search.model.b O2 = O();
            z.e eVar = new z.e();
            com.ss.android.ugc.aweme.discover.helper.l lVar = this.O;
            Word word = null;
            eVar.element = (lVar == null || (m2 = lVar.m()) == null) ? null : (T) m2.getShowWord();
            O2.setSearchHint(eVar.element);
            com.ss.android.ugc.aweme.discover.helper.l lVar2 = this.O;
            if (lVar2 != null) {
                word = lVar2.m();
            }
            O2.setInboxWord(word);
            com.ss.android.ugc.aweme.search.n.d a2 = d.a.a();
            if (!(a2 == null && (a2 = L()) == null)) {
                a2.update(new v(a2, this, eVar));
            }
            com.ss.android.ugc.aweme.search.h.f121133a.a(new com.ss.android.ugc.aweme.search.model.c(getActivity(), dVar, O2, d.a.a(), 112));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void d(String str) {
        h.f.b.l.d(str, "");
        boolean z2 = true;
        if (TextUtils.isEmpty(str)) {
            EditText editText = this.f82355b;
            h.f.b.l.b(editText, "");
            CharSequence hint = editText.getHint();
            if (hint != null && e(hint.toString())) {
                return;
            }
            if (w() == 1 || SearchStateViewModel.isSearchIntermediate(w())) {
                EditText editText2 = this.f82355b;
                h.f.b.l.b(editText2, "");
                String obj = editText2.getHint().toString();
                if (!TextUtils.isEmpty(obj) && !a(obj)) {
                    ((com.ss.android.ugc.aweme.search.k.o) new com.ss.android.ugc.aweme.search.k.o().q("click").o("default_search_keyword")).r(obj).s("general_word").f();
                    str = obj;
                    super.a(str, z2);
                }
            }
        }
        z2 = false;
        super.a(str, z2);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.b
    public final void b(View view) {
        h.f.b.l.d(view, "");
        if (!in.d()) {
            if (com.ss.android.ugc.aweme.compliance.api.a.p().e()) {
                new com.bytedance.tux.g.b(this).e(R.string.brq).b();
            } else if (this.f82355b != null) {
                if (w() == 1) {
                    new com.ss.android.ugc.aweme.search.k.j().o("discovery").p("enter").f();
                    new com.ss.android.ugc.aweme.search.k.k().o("discovery").p("enter").f();
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.discover.e.d(true));
                    new com.ss.android.ugc.aweme.search.k.v("search_sign").f();
                    com.ss.android.ugc.aweme.common.h.d.f76444a = System.currentTimeMillis();
                    P();
                    this.U = SystemClock.elapsedRealtime();
                }
                this.f82355b.requestFocus();
                EditText editText = this.f82355b;
                h.f.b.l.b(editText, "");
                editText.setCursorVisible(true);
                KeyboardUtils.b(this.f82355b);
                EditText editText2 = this.f82355b;
                h.f.b.l.b(editText2, "");
                if (TextUtils.isEmpty(editText2.getText().toString())) {
                    t();
                } else {
                    u();
                }
                if (ak.f80153a) {
                    b.i.b(g.f82605a, b.i.f4824a);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z2) {
        SuggestWordsViewModel j2;
        l a2;
        super.setUserVisibleHint(z2);
        boolean z3 = !z2;
        this.z = !z3;
        if (!(getActivity() == null || this.y == null)) {
            int w2 = w();
            if (w2 == 1) {
                r rVar = this.B;
                if (!(rVar == null || (a2 = rVar.a()) == null)) {
                    a2.a(z3, false);
                }
                if (this.z) {
                    this.T = SystemClock.elapsedRealtime();
                } else {
                    P();
                }
            } else if (w2 == 3) {
                if (this.z) {
                    this.U = SystemClock.elapsedRealtime();
                } else {
                    Q();
                }
            }
        }
        if (this.z) {
            if (!in.d()) {
                N();
            }
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                SearchEnterViewModel a3 = SearchEnterViewModel.a.a(activity);
                this.ad = a3;
                if (a3 != null) {
                    com.ss.android.ugc.aweme.search.model.b bVar = a3.f82794a;
                    if (bVar == null) {
                        bVar = O();
                        SearchEnterViewModel searchEnterViewModel = this.ad;
                        if (searchEnterViewModel == null) {
                            h.f.b.l.b();
                        }
                        searchEnterViewModel.f82794a = bVar;
                    }
                    Aweme a4 = AwemeChangeCallBack.a(getActivity());
                    z.e eVar = new z.e();
                    T t2 = (T) "";
                    eVar.element = t2;
                    z.e eVar2 = new z.e();
                    eVar2.element = t2;
                    if (a4 != null) {
                        T t3 = (T) a4.getAid();
                        h.f.b.l.b(t3, t2);
                        eVar.element = t3;
                        String authorUid = a4.getAuthorUid();
                        if (authorUid != null) {
                            t2 = (T) authorUid;
                        }
                        eVar2.element = t2;
                    }
                    bVar.setGroupId(eVar.element);
                    bVar.setAuthorId(eVar2.element);
                    com.ss.android.ugc.aweme.search.n.d a5 = d.a.a();
                    if (a5 != null) {
                        a5.update(new y(a5, eVar, eVar2));
                    }
                }
                SearchEnterViewModel searchEnterViewModel2 = this.ad;
                if (searchEnterViewModel2 == null) {
                    h.f.b.l.b();
                }
                com.ss.android.ugc.aweme.search.model.b bVar2 = searchEnterViewModel2.f82794a;
                if (bVar2 == null) {
                    h.f.b.l.b();
                }
                bVar2.setEnterSearchFrom("discovery");
            }
        }
        com.ss.android.ugc.aweme.discover.helper.l lVar = this.O;
        if (lVar != null) {
            if (z2 && !com.ss.android.ugc.aweme.search.h.f121133a.q() && (j2 = lVar.j()) != null) {
                j2.a(lVar.k());
            }
            lVar.f81129a = z2;
            l.b l2 = lVar.l();
            if (l2 != null) {
                l2.a(z2);
            }
        }
        if (z2) {
            if (isAdded()) {
                J().m();
            }
            r rVar2 = this.B;
            if (rVar2 != null) {
                rVar2.b();
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(51439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            int i2;
            View view;
            int i3;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            r rVar = this.this$0.B;
            if (rVar != null) {
                i2 = rVar.getCount();
            } else {
                i2 = 0;
            }
            if (1 == i2 && (view = this.this$0.N) != null) {
                if (booleanValue) {
                    i3 = 0;
                } else {
                    i3 = 4;
                }
                view.setVisibility(i3);
            }
            bn bnVar = this.this$0.y;
            if (bnVar == null) {
                h.f.b.l.b();
            }
            bnVar.f82461c = this.this$0.w();
            r rVar2 = this.this$0.B;
            if (rVar2 == null) {
                h.f.b.l.b();
            }
            if (rVar2.getCount() > 1) {
                TabLayout tabLayout = this.this$0.K;
                if (tabLayout == null) {
                    h.f.b.l.b();
                }
                tabLayout.setupWithViewPager(this.this$0.J);
                r rVar3 = this.this$0.B;
                if (rVar3 == null) {
                    h.f.b.l.b();
                }
                int count = rVar3.getCount();
                for (final int i4 = 0; i4 < count; i4++) {
                    TabLayout tabLayout2 = this.this$0.K;
                    if (tabLayout2 == null) {
                        h.f.b.l.b();
                    }
                    final TabLayout.f tabAt = tabLayout2.getTabAt(i4);
                    if (tabAt != null) {
                        tabAt.a(R.layout.xo);
                        View view2 = tabAt.f52655f;
                        if (view2 != null) {
                            view2.setOnClickListener(new View.OnClickListener(this) {
                                /* class com.ss.android.ugc.aweme.discover.ui.m.k.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ k f82610a;

                                static {
                                    Covode.recordClassIndex(51440);
                                }

                                {
                                    this.f82610a = r1;
                                }

                                public final void onClick(View view) {
                                    ClickAgent.onClick(view);
                                    r rVar = this.f82610a.this$0.B;
                                    if (rVar != null) {
                                        rVar.f82635b = i4;
                                    }
                                    tabAt.a();
                                    this.f82610a.this$0.D();
                                }
                            });
                        }
                    }
                }
            } else {
                TabLayout tabLayout3 = this.this$0.K;
                if (tabLayout3 != null) {
                    tabLayout3.setVisibility(8);
                }
                View view3 = this.this$0.L;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z2;
        FrameLayout frameLayout;
        View findViewById;
        View findViewById2;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        this.ac = new t(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        Context context = getContext();
        if (context == null) {
            h.f.b.l.b();
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(context);
        BroadcastReceiver broadcastReceiver = this.ac;
        if (broadcastReceiver == null) {
            h.f.b.l.b();
        }
        instance.registerReceiver(broadcastReceiver, intentFilter);
        String str = this.ab;
        if (!TextUtils.isEmpty(str)) {
            a(str, true);
        }
        ViewGroup viewGroup = this.D;
        if (in.d() || !com.ss.android.ugc.aweme.discover.a.m.a() || com.ss.android.ugc.aweme.search.b.b.a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (viewGroup != null && z2) {
            this.O = new com.ss.android.ugc.aweme.discover.helper.l(new l.e(viewGroup, new C1942m(this)), J().f82807a);
            FrameLayout frameLayout2 = this.E;
            if (!(frameLayout2 == null || (findViewById2 = frameLayout2.findViewById(R.id.eri)) == null)) {
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                com.bytedance.tux.h.i.a(findViewById2, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 33.0f, system.getDisplayMetrics()))), (Integer) null, (Integer) 0, (Integer) null, false, 26);
            }
            TuxIconView tuxIconView = this.aa;
            if (!(tuxIconView == null || (frameLayout = this.E) == null || (findViewById = frameLayout.findViewById(R.id.cfs)) == null)) {
                com.bytedance.tux.h.i.a(findViewById, (Integer) null, (Integer) null, Integer.valueOf(tuxIconView.getLayoutParams().width), (Integer) null, false, 27);
            }
        }
        if (com.ss.android.ugc.aweme.search.h.f121133a.o()) {
            view.post(u.f82621a);
        }
        if (d.a.a().booleanValue() && com.ss.android.ugc.aweme.discover.tooltip.d.f82073l.getBoolean("first_time", true) && com.bytedance.ies.abmock.b.a().a("return_fyp_tooltip", ClientExpManager.return_fyp_tooltip()) != 0) {
            h.f.b.l.d(this, "");
            com.ss.android.ugc.aweme.discover.tooltip.d.f82062a = this;
            com.bytedance.tux.tooltip.a aVar = this.X;
            if (aVar != null) {
                aVar.a();
            }
        }
        com.ss.android.ugc.aweme.discover.tooltip.d.f82073l.storeBoolean("first_time", false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        ImageView imageView;
        MainBottomTabView mainBottomTabView;
        Context context;
        View view2;
        MethodCollector.i(2443);
        h.f.b.l.d(layoutInflater, "");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView != null) {
            this.D = (ViewGroup) onCreateView.findViewById(R.id.ep_);
            this.E = (FrameLayout) onCreateView.findViewById(R.id.do7);
            this.F = (SearchScanView) onCreateView.findViewById(R.id.dvl);
            this.G = (SearchScanView) onCreateView.findViewById(R.id.dvm);
            this.H = (ImageView) onCreateView.findViewById(R.id.qe);
            this.I = onCreateView.findViewById(R.id.dna);
            this.J = (RtlViewPager) onCreateView.findViewById(R.id.fj_);
            this.K = (TabLayout) onCreateView.findViewById(R.id.ehe);
            this.L = onCreateView.findViewById(R.id.eh7);
            this.M = onCreateView.findViewById(R.id.he);
            this.N = onCreateView.findViewById(R.id.cai);
        }
        if (K()) {
            SearchScanView searchScanView = this.F;
            if (searchScanView == null) {
                h.f.b.l.b();
            }
            searchScanView.setVisibility(8);
            SearchScanView searchScanView2 = this.G;
            if (searchScanView2 == null) {
                h.f.b.l.b();
            }
            searchScanView2.setVisibility(0);
            SearchScanView searchScanView3 = this.G;
            if (searchScanView3 == null) {
                h.f.b.l.b();
            }
            searchScanView3.a();
        } else {
            SearchScanView searchScanView4 = this.G;
            if (searchScanView4 == null) {
                h.f.b.l.b();
            }
            searchScanView4.setVisibility(8);
            SearchScanView searchScanView5 = this.F;
            if (searchScanView5 == null) {
                h.f.b.l.b();
            }
            searchScanView5.setVisibility(0);
            SearchScanView searchScanView6 = this.F;
            if (searchScanView6 == null) {
                h.f.b.l.b();
            }
            searchScanView6.a();
        }
        n nVar = new n(this);
        com.bytedance.tux.tooltip.a aVar = null;
        if (com.ss.android.ugc.aweme.discover.f.a.f80972a.b()) {
            SearchScanView searchScanView7 = this.F;
            if (searchScanView7 != null) {
                searchScanView7.setVisibility(8);
            }
            SearchScanView searchScanView8 = this.G;
            if (searchScanView8 != null) {
                searchScanView8.setVisibility(8);
            }
            Context context2 = getContext();
            if (context2 != null) {
                com.bytedance.tux.c.a a2 = com.bytedance.tux.c.c.a(f.f82604a);
                TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6);
                tuxIconView.setTuxIcon(a2);
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                int a3 = h.g.a.a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                h.f.b.l.a((Object) system2, "");
                tuxIconView.setLayoutParams(new FrameLayout.LayoutParams(a3, h.g.a.a(TypedValue.applyDimension(1, 36.0f, system2.getDisplayMetrics())), 8388613));
                com.bytedance.ies.dmt.ui.f.c.a(tuxIconView, 0.5f);
                tuxIconView.setOnClickListener(new e(nVar));
                FrameLayout frameLayout = this.E;
                if (frameLayout != null) {
                    frameLayout.addView(tuxIconView);
                    Resources system3 = Resources.getSystem();
                    h.f.b.l.a((Object) system3, "");
                    com.bytedance.tux.h.i.b(frameLayout, null, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system3.getDisplayMetrics()))), null, false, 27);
                    this.aa = tuxIconView;
                }
            }
        } else {
            SearchScanView searchScanView9 = this.F;
            if (searchScanView9 == null) {
                h.f.b.l.b();
            }
            searchScanView9.setOnInternalClickListener(nVar);
            SearchScanView searchScanView10 = this.G;
            if (searchScanView10 == null) {
                h.f.b.l.b();
            }
            searchScanView10.setOnInternalClickListener(nVar);
        }
        ImageView imageView2 = this.H;
        if (imageView2 == null) {
            h.f.b.l.b();
        }
        imageView2.setOnClickListener(new j(this));
        if (K()) {
            ImageView imageView3 = this.H;
            if (imageView3 == null) {
                h.f.b.l.b();
            }
            imageView3.setVisibility(8);
            ImageView imageView4 = this.f82359j;
            h.f.b.l.b(imageView4, "");
            imageView4.setVisibility(8);
        } else if (M()) {
            ImageView imageView5 = this.H;
            if (imageView5 == null) {
                h.f.b.l.b();
            }
            imageView5.setVisibility(0);
            ImageView imageView6 = this.f82359j;
            h.f.b.l.b(imageView6, "");
            imageView6.setVisibility(8);
        } else {
            ImageView imageView7 = this.H;
            if (imageView7 == null) {
                h.f.b.l.b();
            }
            imageView7.setVisibility(8);
            ImageView imageView8 = this.f82359j;
            h.f.b.l.b(imageView8, "");
            imageView8.setVisibility(0);
        }
        boolean a4 = com.ss.android.ugc.aweme.discover.f.a.a();
        if (K() && !a4) {
            FrameLayout frameLayout2 = this.E;
            if (frameLayout2 == null) {
                h.f.b.l.b();
            }
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int b2 = (int) com.bytedance.common.utility.n.b(getContext(), 16.0f);
                marginLayoutParams.leftMargin = b2;
                int i2 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginStart(b2);
                marginLayoutParams.setMarginEnd(0);
                FrameLayout frameLayout3 = this.E;
                if (frameLayout3 == null) {
                    h.f.b.l.b();
                }
                frameLayout3.setLayoutParams(marginLayoutParams);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                MethodCollector.o(2443);
                throw nullPointerException;
            }
        }
        if (com.ss.android.ugc.aweme.discover.f.a.a() && (view2 = this.M) != null) {
            view2.setVisibility(0);
            com.bytedance.ies.dmt.ui.f.c.a(view2, 0.5f);
            view2.setOnClickListener(new h(view2, this));
        }
        if (!com.ss.android.ugc.aweme.discover.f.a.a()) {
            view = null;
        } else {
            view = this.M;
        }
        View view3 = this.aa;
        if (view3 == null) {
            if (K()) {
                view3 = this.G;
                if (view3 == null) {
                    h.f.b.l.b();
                }
            } else {
                view3 = this.F;
                if (view3 == null) {
                    h.f.b.l.b();
                }
            }
        }
        Context context3 = getContext();
        ViewGroup viewGroup2 = this.D;
        if (viewGroup2 == null) {
            h.f.b.l.b();
        }
        ImageView imageView9 = this.f82359j;
        h.f.b.l.b(imageView9, "");
        if (M()) {
            imageView = this.H;
            if (imageView == null) {
                h.f.b.l.b();
            }
        } else {
            imageView = this.f82359j;
        }
        h.f.b.l.b(imageView, "");
        TextView textView = this.f82358e;
        h.f.b.l.b(textView, "");
        FrameLayout frameLayout4 = this.E;
        if (frameLayout4 == null) {
            h.f.b.l.b();
        }
        com.ss.android.ugc.aweme.discover.helper.u uVar = new com.ss.android.ugc.aweme.discover.helper.u(context3, viewGroup2, view3, imageView9, imageView, textView, frameLayout4);
        uVar.f81178d = !K();
        uVar.f81179e = M();
        uVar.f81180f = true;
        uVar.f81181g = K();
        uVar.f81183i = view;
        i iVar = new i(this);
        h.f.b.l.d(iVar, "");
        uVar.f81182h.add(iVar);
        this.S = uVar;
        if (in.d()) {
            com.ss.android.ugc.aweme.base.utils.o.a(this.I, 8);
            if (this.f82355b != null) {
                EditText editText = this.f82355b;
                h.f.b.l.b(editText, "");
                editText.setCursorVisible(false);
                EditText editText2 = this.f82355b;
                h.f.b.l.b(editText2, "");
                editText2.setFocusable(false);
                EditText editText3 = this.f82355b;
                h.f.b.l.b(editText3, "");
                editText3.setFocusableInTouchMode(false);
                this.f82355b.setOnClickListener(new l(this));
            }
            if (!(this.E == null || getContext() == null)) {
                FrameLayout frameLayout5 = this.E;
                if (frameLayout5 == null) {
                    h.f.b.l.b();
                }
                ViewGroup.LayoutParams layoutParams2 = frameLayout5.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    layoutParams3.rightMargin = (int) com.bytedance.common.utility.n.b(getContext(), 16.0f);
                    layoutParams3.leftMargin = (int) com.bytedance.common.utility.n.b(getContext(), 16.0f);
                    int i3 = Build.VERSION.SDK_INT;
                    int b3 = (int) com.bytedance.common.utility.n.b(getContext(), 16.0f);
                    layoutParams3.setMarginEnd(b3);
                    layoutParams3.setMarginStart(b3);
                    FrameLayout frameLayout6 = this.E;
                    if (frameLayout6 == null) {
                        h.f.b.l.b();
                    }
                    frameLayout6.setLayoutParams(layoutParams2);
                }
            }
        } else {
            N();
        }
        if (onCreateView != null) {
            onCreateView.setBackground(null);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (this.ah == null) {
            this.ah = new SparseArray();
        }
        View view4 = (View) this.ah.get(R.id.fk_);
        if (view4 == null) {
            View view5 = getView();
            if (view5 == null) {
                view4 = null;
            } else {
                view4 = view5.findViewById(R.id.fk_);
                this.ah.put(R.id.fk_, view4);
            }
        }
        BannerViewPager bannerViewPager = (BannerViewPager) view4;
        if (bannerViewPager != null) {
            bannerViewPager.setBackground(null);
        }
        TabLayout tabLayout = this.K;
        if (tabLayout != null) {
            tabLayout.setBackground(null);
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            mainBottomTabView = (MainBottomTabView) activity.findViewById(R.id.ck7);
        } else {
            mainBottomTabView = null;
        }
        this.V = mainBottomTabView;
        if (mainBottomTabView == null || (context = mainBottomTabView.getContext()) == null) {
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.o(2443);
            throw nullPointerException2;
        }
        com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar2 = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) HomeTabViewModel.a.a((androidx.fragment.app.e) context).b("HOME");
        if (!(this.ag == null || aVar2 == null)) {
            Context context4 = this.ag;
            if (context4 == null) {
                h.f.b.l.b();
            }
            com.bytedance.tux.tooltip.a.b.a aVar3 = (com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(context4).b(aVar2);
            Context context5 = this.ag;
            if (context5 == null) {
                h.f.b.l.b();
            }
            String string = context5.getResources().getString(R.string.b88);
            h.f.b.l.b(string, "");
            com.bytedance.tux.tooltip.b a5 = aVar3.a(string).a().a(com.bytedance.tux.tooltip.h.TOP).a(5000L).a(false).a(true, (View.OnClickListener) null);
            Resources system4 = Resources.getSystem();
            h.f.b.l.a((Object) system4, "");
            com.bytedance.tux.tooltip.a.b.a aVar4 = (com.bytedance.tux.tooltip.a.b.a) a5.b(h.g.a.a(TypedValue.applyDimension(1, 3.0f, system4.getDisplayMetrics()))).b(new o(aVar2)).a(p.f82616a);
            this.W = aVar4;
            if (aVar4 != null) {
                aVar = aVar4.d();
            }
            this.X = aVar;
        }
        MethodCollector.o(2443);
        return onCreateView;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<com.bytedance.jedi.arch.am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
