package com.ss.android.ugc.aweme.ecommerce.sku.b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.widget.Widget;
import com.bytedance.widget.c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.w;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.a;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.sku.a.a;
import com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget;
import com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.SkuWidget;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public final class c extends a implements q {

    /* renamed from: a  reason: collision with root package name */
    final h.h f87370a = h.i.a((h.f.a.a) o.f87385a);

    /* renamed from: b  reason: collision with root package name */
    final h.h f87371b = h.i.a((h.f.a.a) n.f87384a);

    /* renamed from: c  reason: collision with root package name */
    final h.h f87372c = h.i.a((h.f.a.a) new m(this));

    /* renamed from: d  reason: collision with root package name */
    final h.h f87373d = h.i.a((h.f.a.a) p.f87386a);

    /* renamed from: e  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f87374e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.ecommerce.sku.d f87375f;
    private final lifecycleAwareLazy o;

    public static final class b extends h.f.b.m implements h.f.a.m<SkuState, Bundle, SkuState> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(54859);
        }

        public b() {
            super(2);
        }

        public final SkuState invoke(SkuState skuState, Bundle bundle) {
            h.f.b.l.c(skuState, "");
            return skuState;
        }
    }

    static {
        Covode.recordClassIndex(54857);
    }

    public final SkuPanelViewModel e() {
        return (SkuPanelViewModel) this.o.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
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

    static final class n extends h.f.b.m implements h.f.a.a<SkuPanelCounterWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f87384a = new n();

        static {
            Covode.recordClassIndex(54875);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SkuPanelCounterWidget invoke() {
            return new SkuPanelCounterWidget();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<SkuPanelHeaderWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f87385a = new o();

        static {
            Covode.recordClassIndex(54876);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SkuPanelHeaderWidget invoke() {
            return new SkuPanelHeaderWidget();
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<SkuWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f87386a = new p();

        static {
            Covode.recordClassIndex(54877);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SkuWidget invoke() {
            return new SkuWidget();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(54862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f87376a;

            static {
                Covode.recordClassIndex(54863);
            }

            a(d dVar) {
                this.f87376a = dVar;
            }

            public final void run() {
                this.f87376a.this$0.f87375f.dismissAllowingStateLoss();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            SkuPanelState skuPanelState;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue && (skuPanelState = this.this$0.e().f87502c) != null) {
                if (skuPanelState.getJumpOSP()) {
                    SkuPanelStarter.a(this.this$0.e().f87502c);
                    new Handler(Looper.getMainLooper()).postDelayed(new a(this), 450);
                } else {
                    this.this$0.f87375f.dismissAllowingStateLoss();
                }
            }
            return z.f158842a;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(54858);
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

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.i lifecycle = this.f87375f.getLifecycle();
        h.f.b.l.b(lifecycle, "");
        return lifecycle;
    }

    static final class m extends h.f.b.m implements h.f.a.a<SkuPanelBottomWidget> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(54874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SkuPanelBottomWidget invoke() {
            int i2;
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.this$0.e().f87504e;
            if (skuEnterParams != null) {
                i2 = skuEnterParams.getClickFrom();
            } else {
                i2 = 0;
            }
            return new SkuPanelBottomWidget(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final void b() {
        Dialog dialog = this.f87375f.getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new l(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$c  reason: collision with other inner class name */
    public static final class C2110c extends h.f.b.m implements h.f.a.a<SkuPanelViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(54860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2110c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_sku_strategy_SkuPanelNativeStrategy$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.sku.b.c$c$1 r0 = new com.ss.android.ugc.aweme.ecommerce.sku.b.c$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.sku.b.c.C2110c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_sku_strategy_SkuPanelNativeStrategy$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f87382a;

        static {
            Covode.recordClassIndex(54872);
        }

        public final void onGlobalLayout() {
            this.f87382a.a(true);
            FrameLayout frameLayout = (FrameLayout) this.f87382a.f87375f.a(R.id.e53);
            h.f.b.l.b(frameLayout, "");
            frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(c cVar) {
            this.f87382a = cVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final void c() {
        SkuPanelStarter.a(e().f87502c);
        IEventCenter a2 = EventCenter.a();
        String b2 = com.ss.android.ugc.aweme.account.util.i.a().b(e().f87502c);
        if (b2 == null) {
            b2 = "{}";
        }
        a2.a("ec_sku_panel_close", b2);
        com.ss.android.ugc.aweme.ecommerce.sku.a.a.f87365a.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final void d() {
        int i2;
        String str;
        String str2;
        boolean z;
        List<SaleProp> list;
        SkuInfo skuInfo = e().f87503d;
        if (skuInfo == null || (list = skuInfo.f87416b) == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = e().f87504e;
        Integer num = null;
        if (skuEnterParams != null) {
            str = skuEnterParams.getEnterFrom();
        } else {
            str = null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f87375f.f85712j;
        if (ActivityStack.isAppBackGround()) {
            str2 = "close";
        } else {
            SkuPanelState skuPanelState = e().f87502c;
            if (skuPanelState == null || !skuPanelState.getJumpOSP()) {
                str2 = "return";
            } else {
                str2 = "next";
            }
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = e().f87504e;
        if (skuEnterParams2 != null) {
            num = Integer.valueOf(skuEnterParams2.getClickFrom());
        }
        String a2 = com.ss.android.ugc.aweme.ecommerce.sku.model.a.a(num);
        if (e().f87503d != null) {
            z = true;
        } else {
            z = false;
        }
        h.f.b.l.d(str2, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_stay_page", new a.e(i2, elapsedRealtime, str2, z, str, a2));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final void a() {
        Serializable serializable;
        String productId;
        ProductPackStruct a2;
        SkuPanelStarter.SkuEnterParams skuEnterParams;
        Integer usePrefetch;
        SkuPanelViewModel e2 = e();
        Bundle arguments = this.f87375f.getArguments();
        HashMap<String, Object> hashMap = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("enter_params");
        } else {
            serializable = null;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter.SkuEnterParams");
        e2.f87504e = (SkuPanelStarter.SkuEnterParams) serializable;
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = e().f87504e;
        if (skuEnterParams2 != null && skuEnterParams2.getProductId() != null) {
            f.a.b.b unused = selectSubscribe(e(), d.f87387a, new ah(), new d(this));
            f.a.b.b unused2 = selectSubscribe(e(), e.f87388a, new ah(), new e(this));
            f.a.b.b unused3 = selectSubscribe(e(), f.f87389a, new ah(), new f(this));
            f.a.b.b unused4 = selectSubscribe(e(), g.f87390a, new ah(), new g(this));
            SkuPanelStarter.SkuEnterParams skuEnterParams3 = e().f87504e;
            if (skuEnterParams3 == null || !skuEnterParams3.getNeedRequest()) {
                IEventCenter a3 = EventCenter.a();
                String b2 = com.ss.android.ugc.aweme.account.util.i.a().b(e().f87504e);
                if (b2 == null) {
                    b2 = "{}";
                }
                a3.a("ec_sku_panel_open", b2);
            } else {
                SkuPanelViewModel e3 = e();
                com.ss.android.ugc.aweme.ecommerce.sku.d dVar = this.f87375f;
                h.f.b.l.d(dVar, "");
                SkuPanelStarter.SkuEnterParams skuEnterParams4 = e3.f87504e;
                if (!(skuEnterParams4 == null || (productId = skuEnterParams4.getProductId()) == null || productId.length() == 0 || (a2 = com.ss.android.ugc.aweme.ecommerce.sku.c.f87392b.b(productId)) == null)) {
                    h.f.b.l.d(a2, "");
                    if (SystemClock.elapsedRealtime() - a2.f86637a <= ((long) com.ss.android.ugc.aweme.ecommerce.sku.c.f87391a) && (skuEnterParams = e3.f87504e) != null && (usePrefetch = skuEnterParams.getUsePrefetch()) != null && usePrefetch.intValue() == 1) {
                        e3.a(a2);
                    }
                }
                e3.b(true);
                e3.f87509m = a.C2085a.a().a(SkuPanelStarter.a(e3.f87504e), false, 0, true, true).f86592c.a(new SkuPanelViewModel.h(e3), new SkuPanelViewModel.i(e3, dVar));
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams5 = e().f87504e;
            if (skuEnterParams5 != null) {
                hashMap = skuEnterParams5.getTrackParams();
            }
            LinkedHashMap<String, Object> linkedHashMap = com.ss.android.ugc.aweme.ecommerce.sku.a.a.f87365a;
            if (hashMap != null) {
                linkedHashMap.putAll(hashMap);
            }
            linkedHashMap.put("is_fullscreen", 0);
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            e().f87506g = this.f87375f;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f87379a;

        static {
            Covode.recordClassIndex(54868);
        }

        h(c cVar) {
            this.f87379a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f87379a.f87375f.dismissAllowingStateLoss();
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f87381a;

        static {
            Covode.recordClassIndex(54870);
        }

        j(c cVar) {
            this.f87381a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f87381a;
            cVar.withState(cVar.e(), new h.f.a.b<SkuState, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.sku.b.c.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(54871);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(SkuState skuState) {
                    SkuState skuState2 = skuState;
                    h.f.b.l.d(skuState2, "");
                    if (h.f.b.l.a((Object) skuState2.getKeyBoardVisibility(), (Object) true)) {
                        this.this$0.f87381a.e().a(false);
                    }
                    return z.f158842a;
                }
            });
        }
    }

    static final class l implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f87383a;

        static {
            Covode.recordClassIndex(54873);
        }

        l(c cVar) {
            this.f87383a = cVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
            FrameLayout frameLayout = (FrameLayout) ((com.google.android.material.bottomsheet.a) dialogInterface).findViewById(R.id.akq);
            if (frameLayout != null) {
                c cVar = this.f87383a;
                BottomSheetBehavior<FrameLayout> a2 = BottomSheetBehavior.a(frameLayout);
                a2.f52333i = true;
                cVar.f87374e = a2;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.ecommerce.sku.d dVar) {
        super(dVar);
        h.f.b.l.d(dVar, "");
        this.f87375f = dVar;
        h.k.c a2 = h.f.b.ab.a(SkuPanelViewModel.class);
        a aVar = new a(a2);
        this.o = new lifecycleAwareLazy(dVar, aVar, new C2110c(dVar, aVar, a2, b.INSTANCE));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final void a(View view) {
        int i2;
        String str;
        List<SaleProp> list;
        h.f.b.l.d(view, "");
        SkuInfo skuInfo = e().f87503d;
        if (skuInfo == null || (list = skuInfo.f87416b) == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = e().f87504e;
        Integer num = null;
        if (skuEnterParams != null) {
            str = skuEnterParams.getEnterFrom();
        } else {
            str = null;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = e().f87504e;
        if (skuEnterParams2 != null) {
            num = Integer.valueOf(skuEnterParams2.getClickFrom());
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_enter_page", new a.d(i2, str, com.ss.android.ugc.aweme.ecommerce.sku.model.a.a(num)));
    }

    public final void a(boolean z) {
        Long l2;
        boolean z2;
        Object obj;
        SkuPanelStarter.SkuEnterParams skuEnterParams = e().f87504e;
        if (skuEnterParams != null && (l2 = SkuPanelStarter.f87363b) != null) {
            long longValue = l2.longValue();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HashMap hashMap = new HashMap();
            HashMap<String, Object> orderRequestParams = skuEnterParams.getOrderRequestParams();
            if (orderRequestParams != null) {
                hashMap.putAll(orderRequestParams);
            }
            HashMap<String, Object> visitReportParams = skuEnterParams.getVisitReportParams();
            if (visitReportParams != null) {
                hashMap.putAll(visitReportParams);
            }
            HashMap<String, Object> trackParams = skuEnterParams.getTrackParams();
            if (trackParams != null) {
                hashMap.putAll(trackParams);
            }
            hashMap.put("image_count", Integer.valueOf(e().f87500a.size()));
            hashMap.put("is_success", Boolean.valueOf(z));
            List<Image> list = e().f87500a;
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<String> thumbUrls = it.next().getThumbUrls();
                if (thumbUrls != null) {
                    obj = h.a.n.h((List) thumbUrls);
                } else {
                    obj = null;
                }
                arrayList.add(obj);
            }
            hashMap.put("image_urls", arrayList);
            Boolean pdpFullScreen = skuEnterParams.getPdpFullScreen();
            int i2 = 0;
            if (pdpFullScreen != null) {
                z2 = pdpFullScreen.booleanValue();
            } else {
                z2 = false;
            }
            long j2 = elapsedRealtime - longValue;
            Integer productQuantity = skuEnterParams.getProductQuantity();
            if (productQuantity != null) {
                i2 = productQuantity.intValue();
            }
            new w(z2, j2, i2).c(hashMap);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.qy, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class i implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f87380a;

        static {
            Covode.recordClassIndex(54869);
        }

        i(c cVar) {
            this.f87380a = cVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            h.f.b.l.b(motionEvent, "");
            if (motionEvent.getAction() == 0) {
                this.f87380a.e().a(false);
            }
            return false;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(54867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            DmtLoadingLayout dmtLoadingLayout;
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            View view = this.this$0.f87375f.getView();
            if (!(view == null || (dmtLoadingLayout = (DmtLoadingLayout) view.findViewById(R.id.e5p)) == null)) {
                if (booleanValue) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                dmtLoadingLayout.setVisibility(i2);
            }
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(54864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            final Integer num;
            View childAt;
            Boolean bool2 = bool;
            h.f.b.l.d(iVar, "");
            if (bool2 != null && !bool2.booleanValue()) {
                NestedScrollView nestedScrollView = (NestedScrollView) this.this$0.f87375f.a(R.id.e5q);
                if (nestedScrollView == null || (childAt = nestedScrollView.getChildAt(0)) == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(childAt.getHeight());
                }
                NestedScrollView nestedScrollView2 = (NestedScrollView) this.this$0.f87375f.a(R.id.e5q);
                if (nestedScrollView2 != null) {
                    nestedScrollView2.postDelayed(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.sku.b.c.e.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ e f87377a;

                        static {
                            Covode.recordClassIndex(54865);
                        }

                        {
                            this.f87377a = r1;
                        }

                        public final void run() {
                            int i2;
                            NestedScrollView nestedScrollView = (NestedScrollView) this.f87377a.this$0.f87375f.a(R.id.e5q);
                            if (nestedScrollView != null) {
                                Integer num = num;
                                if (num != null) {
                                    i2 = num.intValue();
                                } else {
                                    i2 = 0;
                                }
                                nestedScrollView.a(0, i2, false);
                            }
                        }
                    }, 100);
                }
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.a, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(54866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.a aVar) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(aVar, "");
            if (aVar == com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.a.SUCCESS) {
                c cVar = this.this$0;
                com.bytedance.widget.c a2 = c.a.a(cVar.f87375f, cVar.f87375f.getView());
                a2.a(R.id.bf9, (Widget) ((SkuPanelHeaderWidget) cVar.f87370a.getValue()), false);
                a2.a(R.id.ag1, (Widget) ((SkuPanelCounterWidget) cVar.f87371b.getValue()), false);
                a2.a(R.id.e53, (Widget) ((SkuWidget) cVar.f87373d.getValue()), false);
                a2.a(R.id.ve, (Widget) ((SkuPanelBottomWidget) cVar.f87372c.getValue()), false);
                ImageView imageView = (ImageView) cVar.f87375f.a(R.id.e5a);
                if (imageView != null) {
                    imageView.setOnClickListener(new h(cVar));
                }
                NestedScrollView nestedScrollView = (NestedScrollView) cVar.f87375f.a(R.id.e5q);
                if (nestedScrollView != null) {
                    nestedScrollView.setOnTouchListener(new i(cVar));
                }
                FrameLayout frameLayout = (FrameLayout) cVar.f87375f.a(R.id.bf9);
                if (frameLayout != null) {
                    frameLayout.setOnClickListener(new j(cVar));
                }
                int i2 = Build.VERSION.SDK_INT;
                FrameLayout frameLayout2 = (FrameLayout) cVar.f87375f.a(R.id.e53);
                h.f.b.l.b(frameLayout2, "");
                frameLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new k(cVar));
            } else if (aVar == com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.a.FAIL) {
                this.this$0.a(false);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
