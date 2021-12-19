package com.ss.android.ugc.aweme.ecommerce.semipdp;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.e.a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FirstNotice;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ThirdParty;
import com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.semipdp.a.b;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class a extends Fragment implements ar<com.ss.android.ugc.aweme.base.arch.i>, com.bytedance.jedi.arch.q, com.bytedance.tux.sheet.b {

    /* renamed from: d  reason: collision with root package name */
    public static final float f87261d = ((((float) com.ss.android.ugc.aweme.ecommerce.util.h.f87568b) - com.ss.android.ugc.aweme.ecommerce.util.h.a()) + 100.0f);

    /* renamed from: e  reason: collision with root package name */
    public static final d f87262e = new d((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.i f87263a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommerce.semipdp.a.a f87264b;

    /* renamed from: c  reason: collision with root package name */
    public b f87265c;

    /* renamed from: f  reason: collision with root package name */
    private final lifecycleAwareLazy f87266f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f87267g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f87268h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f87269i;

    public static final class b extends h.f.b.m implements h.f.a.m<SemiPdpState, Bundle, SemiPdpState> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(54758);
        }

        public b() {
            super(2);
        }

        public final SemiPdpState invoke(SemiPdpState semiPdpState, Bundle bundle) {
            h.f.b.l.c(semiPdpState, "");
            return semiPdpState;
        }
    }

    public final View a(int i2) {
        if (this.f87269i == null) {
            this.f87269i = new SparseArray();
        }
        View view = (View) this.f87269i.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f87269i.put(i2, findViewById);
        return findViewById;
    }

    public final SemiPdpViewModel a() {
        return (SemiPdpViewModel) this.f87266f.getValue();
    }

    public final k b() {
        return (k) this.f87267g.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(54761);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f87263a;
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

    static final class e extends h.f.b.m implements h.f.a.a<k> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54762);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            return new k(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final s f87296a = new s();

        static {
            Covode.recordClassIndex(54779);
        }

        s() {
        }

        public final void run() {
            com.ss.android.ugc.aweme.video.v.O().B();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$h$a  reason: collision with other inner class name */
        static final class C2107a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ Integer $state$inlined;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(54766);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2107a(h hVar, Integer num) {
                super(0);
                this.this$0 = hVar;
                this.$state$inlined = num;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.this$0.a().b();
                return z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ Integer $state$inlined;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(54767);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(h hVar, Integer num) {
                super(0);
                this.this$0 = hVar;
                this.$state$inlined = num;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.this$0.a().b();
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            String str;
            Integer num2 = num;
            h.f.b.l.d(iVar, "");
            View view = this.this$0.getView();
            if (view != null) {
                if (num2 != null) {
                    if (num2.intValue() == -1) {
                        j a2 = this.this$0.a().a();
                        if (a2 != null) {
                            if (this.this$0.a().f87249d) {
                                str = "full_screen";
                            } else {
                                str = "half_screen";
                            }
                            HashMap<String, Object> h2 = this.this$0.a().h();
                            h.f.b.l.d(str, "");
                            h.f.b.l.d(h2, "");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("precise_exp", Integer.valueOf(com.ss.android.ugc.aweme.ecommerce.ab.f.a()));
                            linkedHashMap.put("page_show_type", str);
                            linkedHashMap.putAll(h2);
                            a2.b("tiktokec_enter_product_detail", linkedHashMap);
                        }
                        TuxStatusView tuxStatusView = (TuxStatusView) this.this$0.a(R.id.e_o);
                        if (tuxStatusView != null) {
                            tuxStatusView.setVisibility(8);
                        }
                        com.ss.android.ugc.aweme.ecommerce.semipdp.a.b b2 = a.b(this.this$0);
                        if (b2 != null) {
                            b2.setSpecialIllegalState(false);
                        }
                    } else if (num2.intValue() == 0) {
                        TuxStatusView tuxStatusView2 = (TuxStatusView) this.this$0.a(R.id.e_o);
                        if (tuxStatusView2 != null) {
                            tuxStatusView2.setVisibility(0);
                        }
                        TuxStatusView tuxStatusView3 = (TuxStatusView) this.this$0.a(R.id.e_o);
                        if (tuxStatusView3 != null) {
                            tuxStatusView3.a();
                        }
                    }
                }
                if (num2 != null) {
                    if (num2.intValue() == 3) {
                        TuxStatusView tuxStatusView4 = (TuxStatusView) this.this$0.a(R.id.e_o);
                        if (tuxStatusView4 != null) {
                            tuxStatusView4.setVisibility(0);
                        }
                        TuxStatusView tuxStatusView5 = (TuxStatusView) this.this$0.a(R.id.e_o);
                        if (tuxStatusView5 != null) {
                            tuxStatusView5.setStatus(com.ss.android.ugc.aweme.ecommerce.util.j.b(true, new C2107a(this, num2)));
                        }
                    } else if (num2.intValue() == 4) {
                        TuxStatusView tuxStatusView6 = (TuxStatusView) this.this$0.a(R.id.e_o);
                        if (tuxStatusView6 != null) {
                            tuxStatusView6.setVisibility(0);
                        }
                        TuxStatusView tuxStatusView7 = (TuxStatusView) this.this$0.a(R.id.e_o);
                        if (tuxStatusView7 != null) {
                            TuxStatusView.c cVar = new TuxStatusView.c();
                            String string = view.getResources().getString(R.string.bhf);
                            h.f.b.l.b(string, "");
                            cVar.a(string);
                            String string2 = view.getResources().getString(R.string.bhe);
                            h.f.b.l.b(string2, "");
                            cVar.a((CharSequence) string2);
                            cVar.a(0, R.drawable.z6);
                            tuxStatusView7.setStatus(cVar);
                        }
                    } else if (num2.intValue() == 5) {
                        TuxStatusView tuxStatusView8 = (TuxStatusView) this.this$0.a(R.id.e_o);
                        if (tuxStatusView8 != null) {
                            tuxStatusView8.setVisibility(0);
                        }
                        TuxStatusView tuxStatusView9 = (TuxStatusView) this.this$0.a(R.id.e_o);
                        if (tuxStatusView9 != null) {
                            TuxStatusView.c cVar2 = new TuxStatusView.c();
                            String string3 = view.getResources().getString(R.string.bhd);
                            h.f.b.l.b(string3, "");
                            cVar2.a(string3);
                            String string4 = view.getResources().getString(R.string.bhc);
                            h.f.b.l.b(string4, "");
                            cVar2.a((CharSequence) string4);
                            cVar2.a(0, R.drawable.yx);
                            tuxStatusView9.setStatus(cVar2);
                        }
                    }
                }
                TuxStatusView tuxStatusView10 = (TuxStatusView) this.this$0.a(R.id.e_o);
                if (tuxStatusView10 != null) {
                    tuxStatusView10.setVisibility(0);
                }
                TuxStatusView tuxStatusView11 = (TuxStatusView) this.this$0.a(R.id.e_o);
                if (tuxStatusView11 != null) {
                    tuxStatusView11.setStatus(com.ss.android.ugc.aweme.ecommerce.util.j.b(true, new b(this, num2)));
                }
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$a  reason: collision with other inner class name */
    public static final class C2104a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(54757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2104a(h.k.c cVar) {
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

    static final class u extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ View $contentView;

        static {
            Covode.recordClassIndex(54781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(View view) {
            super(0);
            this.$contentView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            /*
                r2 = this;
                android.view.View r1 = r2.$contentView
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                com.bytedance.tux.sheet.sheet.a.b.a(r1)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.semipdp.a.u.invoke():java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f87269i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a().a("return");
            this.this$0.a().c(SemiPdpViewModel.a.f87256a);
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(54756);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (a().f87249d) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommerce.a.a(false, getContext()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommerce.a.a(true, getContext()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        a().a().f87314b = SystemClock.elapsedRealtime();
    }

    public static final class c extends h.f.b.m implements h.f.a.a<SemiPdpViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(54759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_semipdp_SemiPdpFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.semipdp.a$c$1 r0 = new com.ss.android.ugc.aweme.ecommerce.semipdp.a$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.semipdp.a.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_semipdp_SemiPdpFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            SellerInfo sellerInfo;
            String str;
            ProductPackStruct productPackStruct = this.this$0.a().f87246a;
            if (!(productPackStruct == null || (sellerInfo = productPackStruct.f86640d) == null || (str = sellerInfo.f86662f) == null)) {
                SemiPdpViewModel a2 = this.this$0.a();
                Context context = this.this$0.getContext();
                if (context == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(context, "");
                a2.a(context, str);
            }
            j a3 = this.this$0.a().a();
            if (a3 != null) {
                a3.a("show_window", (String) null);
            }
            return z.f158842a;
        }
    }

    public a() {
        h.k.c a2 = h.f.b.ab.a(SemiPdpViewModel.class);
        C2104a aVar = new C2104a(a2);
        this.f87266f = new lifecycleAwareLazy(this, aVar, new c(this, aVar, a2, b.INSTANCE));
        this.f87267g = h.i.a((h.f.a.a) new e(this));
    }

    static final class r extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Context $contextT;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(a aVar, Context context) {
            super(0);
            this.this$0 = aVar;
            this.$contextT = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            HashMap<String, Object> hashMap;
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            ProductBase productBase;
            List<Image> list;
            Image image;
            List<String> urls;
            Object h2;
            SellerInfo sellerInfo;
            ProductBase productBase2;
            SellerInfo sellerInfo2;
            Context context = this.$contextT;
            androidx.fragment.app.i fragmentManager = this.this$0.getFragmentManager();
            SemiPdpViewModel a2 = this.this$0.a();
            h.p[] pVarArr = new h.p[6];
            SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = a2.f87247b;
            Object obj5 = "";
            if (semiPdpEnterParams == null || (hashMap = semiPdpEnterParams.getTrackParams()) == null) {
                hashMap = obj5;
            }
            pVarArr[0] = new h.p("trackParams", hashMap);
            ProductPackStruct productPackStruct = a2.f87246a;
            if (productPackStruct == null || (sellerInfo2 = productPackStruct.f86640d) == null || (obj = sellerInfo2.f86658b) == null) {
                obj = obj5;
            }
            pVarArr[1] = new h.p("store_name", obj);
            ProductPackStruct productPackStruct2 = a2.f87246a;
            if (productPackStruct2 == null || (productBase2 = productPackStruct2.f86641e) == null || (obj2 = productBase2.f86623a) == null) {
                obj2 = obj5;
            }
            pVarArr[2] = new h.p("product_name", obj2);
            ProductPackStruct productPackStruct3 = a2.f87246a;
            if (productPackStruct3 == null || (obj3 = productPackStruct3.f86638b) == null) {
                obj3 = obj5;
            }
            pVarArr[3] = new h.p("product_id", obj3);
            ProductPackStruct productPackStruct4 = a2.f87246a;
            if (productPackStruct4 == null || (sellerInfo = productPackStruct4.f86640d) == null || (obj4 = sellerInfo.f86657a) == null) {
                obj4 = obj5;
            }
            pVarArr[4] = new h.p("shop_id", obj4);
            ProductPackStruct productPackStruct5 = a2.f87246a;
            if (!(productPackStruct5 == null || (productBase = productPackStruct5.f86641e) == null || (list = productBase.f86626d) == null || (image = (Image) h.a.n.h((List) list)) == null || (urls = image.getUrls()) == null || (h2 = h.a.n.h((List) urls)) == null)) {
                obj5 = h2;
            }
            pVarArr[5] = new h.p("product_image_url", obj5);
            IPdpStarter.a.a(context, fragmentManager, ag.c(pVarArr), null);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        int i2;
        super.onStop();
        if (ActivityStack.isAppBackGround()) {
            a().a("close");
        }
        SemiPdpViewModel a2 = a();
        j jVar = a2.n;
        if (jVar == null) {
            h.f.b.l.a("logger");
            return;
        }
        if (a2.f87249d) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        int size = a2.f87255m.size();
        boolean z = a2.f87253k;
        if (a2.f87246a != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        String str2 = a2.f87252g;
        HashMap<String, Object> h2 = a2.h();
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(h2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_show_type", str);
        linkedHashMap.put("main_photo_view_cnt", Integer.valueOf(size));
        linkedHashMap.put("is_image_clicked", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("is_load_data", Integer.valueOf(i2));
        linkedHashMap.put("quit_type", str2);
        linkedHashMap.put("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - jVar.f87314b));
        linkedHashMap.putAll(h2);
        jVar.b("tiktokec_stay_product_detail", linkedHashMap);
    }

    static final class p extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Context $contextT;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(a aVar, Context context) {
            super(0);
            this.this$0 = aVar;
            this.$contextT = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            FirstNotice firstNotice;
            androidx.fragment.app.i iVar;
            ThirdParty thirdParty;
            ThirdParty thirdParty2;
            j a2 = this.this$0.a().a();
            String str = null;
            if (a2 != null) {
                a2.a("open_3rd_party_buy", (String) null);
            }
            if (this.this$0.a().g()) {
                a aVar = this.this$0;
                View a3 = com.a.a(LayoutInflater.from(aVar.getContext()), R.layout.qr, null, false);
                ProductPackStruct productPackStruct = aVar.a().f87246a;
                if (productPackStruct == null || (thirdParty2 = productPackStruct.p) == null) {
                    firstNotice = null;
                } else {
                    firstNotice = thirdParty2.f86674f;
                }
                if (firstNotice == null) {
                    aVar.a();
                    SemiPdpViewModel.b(aVar.getContext());
                } else {
                    if (a3 != null) {
                        TuxButton tuxButton = (TuxButton) a3.findViewById(R.id.e2i);
                        h.f.b.l.b(tuxButton, "");
                        tuxButton.setOnClickListener(new t(a3, aVar, firstNotice));
                        com.bytedance.lighten.a.v a4 = com.ss.android.ugc.aweme.ecommerce.util.g.a((Object) firstNotice.f86601a);
                        a4.E = (SmartImageView) a3.findViewById(R.id.d5f);
                        a4.c();
                        TuxTextView tuxTextView = (TuxTextView) a3.findViewById(R.id.e2w);
                        h.f.b.l.b(tuxTextView, "");
                        tuxTextView.setText(firstNotice.f86602b);
                        TuxTextView tuxTextView2 = (TuxTextView) a3.findViewById(R.id.e2n);
                        h.f.b.l.b(tuxTextView2, "");
                        tuxTextView2.setText(firstNotice.f86603c);
                        TuxButton tuxButton2 = (TuxButton) a3.findViewById(R.id.e2i);
                        h.f.b.l.b(tuxButton2, "");
                        tuxButton2.setText(firstNotice.f86604d);
                    }
                    j a5 = aVar.a().a();
                    if (a5 != null) {
                        h.f.b.l.d("3rd_party_notice", "");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("actionsheet_name", "3rd_party_notice");
                        a5.b("tiktokec_enter_actionsheet", linkedHashMap);
                    }
                    a.C1112a aVar2 = new a.C1112a();
                    h.f.b.l.b(a3, "");
                    a.C1112a a6 = aVar2.a(a3).a(0);
                    TuxNavBar.a aVar3 = new TuxNavBar.a();
                    com.bytedance.tux.navigation.a.b a7 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small);
                    a7.f45194b = true;
                    com.bytedance.tux.sheet.sheet.a aVar4 = a6.a(aVar3.b(a7.a((h.f.a.a<z>) new u(a3)))).c().f45299a;
                    Context context = aVar.getContext();
                    if (!(context instanceof androidx.fragment.app.e)) {
                        context = null;
                    }
                    androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
                    if (eVar != null) {
                        iVar = eVar.getSupportFragmentManager();
                    } else {
                        iVar = null;
                    }
                    aVar4.show(iVar, "semi_pdp_first_notice_sheet");
                    SemiPdpViewModel a8 = aVar.a();
                    try {
                        Keva keva = a8.f87248c;
                        if (keva != null) {
                            StringBuilder sb = new StringBuilder("notice_sheet_");
                            ProductPackStruct productPackStruct2 = a8.f87246a;
                            if (!(productPackStruct2 == null || (thirdParty = productPackStruct2.p) == null)) {
                                str = thirdParty.f86669a;
                            }
                            keva.storeBoolean(sb.append(str).toString(), true);
                        }
                    } catch (Throwable unused) {
                        com.bytedance.services.apm.api.a.a("Keva Write Notice Sheet Shown Fail");
                    }
                }
            } else {
                this.this$0.a().a(this.$contextT);
            }
            return z.f158842a;
        }
    }

    public static final class n extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public boolean f87292a;

        /* renamed from: b  reason: collision with root package name */
        public int f87293b;

        /* renamed from: c  reason: collision with root package name */
        public int f87294c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f87295d;

        static {
            Covode.recordClassIndex(54774);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(a aVar) {
            this.f87295d = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 != this.f87294c && i2 == 0 && this.f87292a) {
                j a2 = this.f87295d.a().a();
                if (a2 != null) {
                    a2.a("fulltodetail");
                }
                this.f87292a = false;
            }
            this.f87294c = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            this.f87292a = true;
            this.f87293b += i3;
            this.f87295d.a().c(new SemiPdpViewModel.h(this.f87293b));
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.semipdp.a.a a(a aVar) {
        com.ss.android.ugc.aweme.ecommerce.semipdp.a.a aVar2 = aVar.f87264b;
        if (aVar2 == null) {
            h.f.b.l.a("bottomView");
        }
        return aVar2;
    }

    public static final /* synthetic */ b b(a aVar) {
        b bVar = aVar.f87265c;
        if (bVar == null) {
            h.f.b.l.a("headerView");
        }
        return bVar;
    }

    private final void a(float f2) {
        com.ss.android.ugc.aweme.ecommerce.semipdp.a.a aVar = this.f87264b;
        if (aVar == null) {
            h.f.b.l.a("bottomView");
        } else {
            aVar.setTranslationY(f2);
        }
    }

    public static final class t extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87297a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f87298b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f87299c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FirstNotice f87300d;

        static {
            Covode.recordClassIndex(54780);
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(android.view.View r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x0029
                com.ss.android.ugc.aweme.ecommerce.semipdp.a r0 = r3.f87299c
                com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel r0 = r0.a()
                com.ss.android.ugc.aweme.ecommerce.semipdp.j r2 = r0.a()
                if (r2 == 0) goto L_0x0015
                java.lang.String r1 = "buy_now"
                java.lang.String r0 = "3rd_party_notice"
                r2.a(r1, r0)
            L_0x0015:
                com.ss.android.ugc.aweme.ecommerce.semipdp.a r0 = r3.f87299c
                com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel r1 = r0.a()
                com.ss.android.ugc.aweme.ecommerce.semipdp.a r0 = r3.f87299c
                android.content.Context r0 = r0.getContext()
                r1.a(r0)
                android.view.View r0 = r3.f87298b
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.semipdp.a.t.a(android.view.View):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(View view, a aVar, FirstNotice firstNotice) {
            super(700);
            this.f87298b = view;
            this.f87299c = aVar;
            this.f87300d = firstNotice;
        }
    }

    private final void a(boolean z) {
        if (isResumed() && this.f87268h) {
            if (z) {
                View view = getView();
                if (view != null) {
                    view.post(s.f87296a);
                }
                com.ss.android.ugc.aweme.video.v.O().F();
                return;
            }
            com.ss.android.ugc.aweme.video.v.O().G();
            com.ss.android.ugc.aweme.video.v.O().y();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        View view2;
        View rootView;
        ViewGroup viewGroup;
        MethodCollector.i(3866);
        super.onActivityCreated(bundle);
        if (getContext() != null) {
            FrameLayout frameLayout = null;
            if (a().f87251f) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                layoutParams2.gravity = 48;
                View view3 = getView();
                if (view3 instanceof FrameLayout) {
                    frameLayout = view3;
                }
                FrameLayout frameLayout2 = frameLayout;
                if (frameLayout2 != null) {
                    com.ss.android.ugc.aweme.ecommerce.semipdp.a.a aVar = this.f87264b;
                    if (aVar == null) {
                        h.f.b.l.a("bottomView");
                    }
                    frameLayout2.addView(aVar, layoutParams);
                    b bVar = this.f87265c;
                    if (bVar == null) {
                        h.f.b.l.a("headerView");
                    }
                    frameLayout2.addView(bVar, layoutParams2);
                }
                b bVar2 = this.f87265c;
                if (bVar2 == null) {
                    h.f.b.l.a("headerView");
                    MethodCollector.o(3866);
                    return;
                }
                ((TuxIconView) bVar2.a(R.id.a7u)).setIconRes(R.raw.icon_arrow_left_ltr);
                MethodCollector.o(3866);
                return;
            }
            if (!(Build.VERSION.SDK_INT < 21 || (view2 = getView()) == null || (rootView = view2.getRootView()) == null || (viewGroup = (ViewGroup) rootView.findViewById(R.id.akq)) == null)) {
                viewGroup.setElevation(0.0f);
            }
            View view4 = getView();
            if (view4 != null) {
                view = com.ss.android.ugc.aweme.ecommerce.util.n.a(view4);
            } else {
                view = null;
            }
            CoordinatorLayout.e eVar = new CoordinatorLayout.e(-1, -2);
            CoordinatorLayout.e eVar2 = new CoordinatorLayout.e(-1, -2);
            eVar.f2102c = 80;
            eVar2.f2102c = 48;
            if (view instanceof CoordinatorLayout) {
                frameLayout = view;
            }
            CoordinatorLayout coordinatorLayout = frameLayout;
            if (coordinatorLayout != null) {
                com.ss.android.ugc.aweme.ecommerce.semipdp.a.a aVar2 = this.f87264b;
                if (aVar2 == null) {
                    h.f.b.l.a("bottomView");
                }
                coordinatorLayout.addView(aVar2, eVar);
                b bVar3 = this.f87265c;
                if (bVar3 == null) {
                    h.f.b.l.a("headerView");
                }
                coordinatorLayout.addView(bVar3, eVar2);
            }
            b bVar4 = this.f87265c;
            if (bVar4 == null) {
                h.f.b.l.a("headerView");
            } else {
                bVar4.setVisibility(8);
                MethodCollector.o(3866);
                return;
            }
        }
        MethodCollector.o(3866);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        boolean z;
        boolean z2;
        HashMap<String, Object> hashMap;
        Integer num;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        ProductPackStruct productPackStruct = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("ENTER_PARAMS");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof SemiPdpStarter.SemiPdpEnterParams)) {
            serializable = null;
        }
        SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = (SemiPdpStarter.SemiPdpEnterParams) serializable;
        a().f87247b = semiPdpEnterParams;
        SemiPdpViewModel a2 = a();
        if (semiPdpEnterParams != null) {
            z = semiPdpEnterParams.getFullScreen();
        } else {
            z = false;
        }
        a2.a(z);
        SemiPdpViewModel a3 = a();
        if (semiPdpEnterParams != null) {
            z2 = semiPdpEnterParams.getFullScreen();
        } else {
            z2 = false;
        }
        a3.f87251f = z2;
        SemiPdpViewModel a4 = a();
        if (semiPdpEnterParams != null) {
            hashMap = semiPdpEnterParams.getTrackParams();
        } else {
            hashMap = null;
        }
        j jVar = new j(hashMap);
        LinkedHashMap<String, Object> linkedHashMap = jVar.f87313a;
        HashMap<String, Object> hashMap2 = jVar.f87315c;
        if (hashMap2 != null) {
            linkedHashMap.putAll(hashMap2);
        }
        linkedHashMap.put("page_name", "semi_product_detail");
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        h.f.b.l.d(jVar, "");
        a4.n = jVar;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            num = Integer.valueOf(arguments2.getInt("ERROR_CODE"));
        } else {
            num = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            productPackStruct = (ProductPackStruct) arguments3.getParcelable("product_info");
        }
        if (num != null) {
            if (num.intValue() == 0 && productPackStruct != null) {
                a().a(productPackStruct);
                a().a(0);
                return;
            } else if (num.intValue() != 0) {
                a().a(num.intValue());
                return;
            }
        }
        a().a(-99999);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list) {
            List<? extends Object> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            this.this$0.b().a(list2);
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i r3, java.lang.Boolean r4) {
            /*
                r2 = this;
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r1 = r4.booleanValue()
                java.lang.String r0 = ""
                h.f.b.l.d(r3, r0)
                if (r1 == 0) goto L_0x0022
                com.ss.android.ugc.aweme.ecommerce.semipdp.a r0 = r2.this$0
                com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel r0 = r0.a()
                boolean r0 = r0.f87251f
                if (r0 == 0) goto L_0x0025
                com.ss.android.ugc.aweme.ecommerce.semipdp.a r0 = r2.this$0
                androidx.fragment.app.e r0 = r0.getActivity()
                if (r0 == 0) goto L_0x0022
                r0.finish()
            L_0x0022:
                h.z r0 = h.z.f158842a
                return r0
            L_0x0025:
                com.ss.android.ugc.aweme.ecommerce.semipdp.a r0 = r2.this$0
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                goto L_0x0022
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.semipdp.a.j.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            String str;
            int i2;
            ThirdParty thirdParty;
            int intValue = num.intValue();
            h.f.b.l.d(iVar, "");
            if (intValue != 1) {
                com.ss.android.ugc.aweme.ecommerce.semipdp.a.a a2 = a.a(this.this$0);
                ProductPackStruct productPackStruct = this.this$0.a().f87246a;
                if (productPackStruct == null || (thirdParty = productPackStruct.p) == null) {
                    str = null;
                } else {
                    str = thirdParty.f86672d;
                }
                TuxButton tuxButton = (TuxButton) a2.a(R.id.a1d);
                h.f.b.l.b(tuxButton, "");
                tuxButton.setEnabled(false);
                TuxButton tuxButton2 = (TuxButton) a2.a(R.id.a1d);
                h.f.b.l.b(tuxButton2, "");
                if (str == null) {
                    Context context = a2.getContext();
                    h.f.b.l.b(context, "");
                    Resources resources = context.getResources();
                    if (intValue == 2) {
                        i2 = R.string.bgm;
                    } else {
                        i2 = R.string.bgs;
                    }
                    str = resources.getString(i2);
                }
                tuxButton2.setText(str);
            }
            return z.f158842a;
        }
    }

    private final void b(com.bytedance.tux.sheet.sheet.a aVar, int i2) {
        if (i2 == 3) {
            androidx.fragment.app.e activity = aVar.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            Dialog dialog = aVar.getDialog();
            h.f.b.l.b(dialog, "");
            a.C1099a.a(activity, dialog).b(true).a().e(-16777216).c(true).a(false).f44923a.d();
            a(true);
        } else if (i2 == 4 || i2 == 5) {
            androidx.fragment.app.e activity2 = aVar.getActivity();
            if (activity2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity2, "");
            Dialog dialog2 = aVar.getDialog();
            h.f.b.l.b(dialog2, "");
            a.C1099a.a(activity2, dialog2).b(false).a().e(-16777216).c(true).a(false).f44923a.d();
            a(false);
        }
        a().f87254l = i2;
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, CartEntry, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, CartEntry cartEntry) {
            HashMap<String, Object> hashMap;
            CartEntry cartEntry2 = cartEntry;
            h.f.b.l.d(iVar, "");
            b b2 = a.b(this.this$0);
            if (b2 != null) {
                SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.this$0.a().f87247b;
                AnonymousClass1 r5 = new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.semipdp.a.i.AnonymousClass1 */
                    final /* synthetic */ i this$0;

                    static {
                        Covode.recordClassIndex(54769);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        HashMap<String, Object> hashMap;
                        HashMap<String, Object> hashMap2;
                        Object obj;
                        CartEntry cartEntry;
                        HashMap<String, Object> requestParams;
                        Context context = this.this$0.this$0.getContext();
                        SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.this$0.this$0.a().f87247b;
                        String str = null;
                        if (semiPdpEnterParams != null) {
                            hashMap = semiPdpEnterParams.getTrackParams();
                        } else {
                            hashMap = null;
                        }
                        SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams2 = this.this$0.this$0.a().f87247b;
                        if (semiPdpEnterParams2 != null) {
                            hashMap2 = semiPdpEnterParams2.getRequestParams();
                        } else {
                            hashMap2 = null;
                        }
                        SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams3 = this.this$0.this$0.a().f87247b;
                        if (semiPdpEnterParams3 == null || (requestParams = semiPdpEnterParams3.getRequestParams()) == null) {
                            obj = null;
                        } else {
                            obj = requestParams.get("chain_key");
                        }
                        String str2 = (String) obj;
                        ProductPackStruct productPackStruct = this.this$0.this$0.a().f87246a;
                        if (!(productPackStruct == null || (cartEntry = productPackStruct.r) == null)) {
                            str = cartEntry.f86599a;
                        }
                        com.ss.android.ugc.aweme.ecommerce.cart.a.a(context, hashMap, hashMap2, str2, "semi_product_detail", str);
                        return z.f158842a;
                    }
                };
                if (cartEntry2 != null) {
                    if (!b2.f87280d) {
                        b2.f87280d = true;
                        HashMap hashMap2 = new HashMap();
                        if (semiPdpEnterParams == null || (hashMap = semiPdpEnterParams.getTrackParams()) == null) {
                            hashMap = new HashMap<>();
                        }
                        hashMap2.putAll(hashMap);
                        hashMap2.put("page_name", "semi_product_detail");
                        com.ss.android.ugc.aweme.ecommerce.track.d.a("tiktokec_cart_entrance_show", hashMap2);
                    }
                    TuxIconView tuxIconView = (TuxIconView) b2.a(R.id.e3_);
                    h.f.b.l.b(tuxIconView, "");
                    tuxIconView.setVisibility(0);
                    Integer num = cartEntry2.f86600b;
                    if (num != null) {
                        int intValue = num.intValue();
                        if (intValue > 0) {
                            TuxAlertBadge tuxAlertBadge = (TuxAlertBadge) b2.a(R.id.e3b);
                            h.f.b.l.b(tuxAlertBadge, "");
                            tuxAlertBadge.setVisibility(0);
                            ((TuxAlertBadge) b2.a(R.id.e3b)).setCount(intValue);
                        }
                    }
                    TuxIconView tuxIconView2 = (TuxIconView) b2.a(R.id.e3_);
                    h.f.b.l.b(tuxIconView2, "");
                    tuxIconView2.setOnClickListener(new b.c(semiPdpEnterParams, r5));
                }
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(iVar, "");
            b b2 = a.b(this.this$0);
            if (b2 != null && !b2.f87278b) {
                float f2 = (float) intValue;
                if (f2 > b2.f87277a) {
                    ((TuxIconView) b2.a(R.id.a7u)).setTintColor(androidx.core.content.b.c(b2.getContext(), R.color.bx));
                    ((TuxIconView) b2.a(R.id.co2)).setTintColor(androidx.core.content.b.c(b2.getContext(), R.color.bx));
                    ((TuxIconView) b2.a(R.id.e3_)).setTintColor(androidx.core.content.b.c(b2.getContext(), R.color.bx));
                } else {
                    ((TuxIconView) b2.a(R.id.a7u)).setTintColor(androidx.core.content.b.c(b2.getContext(), R.color.a9));
                    ((TuxIconView) b2.a(R.id.co2)).setTintColor(androidx.core.content.b.c(b2.getContext(), R.color.a9));
                    ((TuxIconView) b2.a(R.id.e3_)).setTintColor(androidx.core.content.b.c(b2.getContext(), R.color.a9));
                }
                View a2 = b2.a(R.id.bf9);
                h.f.b.l.b(a2, "");
                a2.setAlpha(h.j.h.c(f2 / b2.f87277a, 1.0f));
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.tux.sheet.b
    public final void a(com.bytedance.tux.sheet.sheet.a aVar, float f2) {
        TuxStatusView tuxStatusView;
        h.f.b.l.d(aVar, "");
        if (f2 == 1.0f) {
            a().a(true);
        } else {
            a().a(false);
        }
        if (f2 <= 0.0f) {
            a((-f2) * com.ss.android.ugc.aweme.ecommerce.util.h.f87569c);
        } else {
            a(0.0f);
        }
        if (f2 >= 0.0f && (tuxStatusView = (TuxStatusView) a(R.id.e_o)) != null) {
            com.bytedance.tux.h.i.a((View) tuxStatusView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf((int) (f87261d * (1.0f - f2))), false, 23);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        String str;
        ThirdParty thirdParty;
        TuxStatusView tuxStatusView;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        ((RecyclerView) a(R.id.d2v)).a(new com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a(androidx.core.content.b.c(requireContext(), R.color.b7), 0, 0.0f, 6));
        b().d(false);
        RecyclerView recyclerView = (RecyclerView) a(R.id.d2v);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setAdapter(b());
        ((RecyclerView) a(R.id.d2v)).a(new n(this));
        Context context = getContext();
        if (context != null) {
            this.f87264b = new com.ss.android.ugc.aweme.ecommerce.semipdp.a.a(context, new o(this), new p(this, context));
            b bVar = new b(context, new q(this), new r(this, context));
            this.f87265c = bVar;
            boolean a2 = SettingsManager.a().a("ecom_semi_pdp_show_report", false);
            bVar.f87279c = a2;
            TuxIconView tuxIconView = (TuxIconView) bVar.a(R.id.co2);
            h.f.b.l.b(tuxIconView, "");
            if (a2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxIconView.setVisibility(i2);
            TuxStatusView tuxStatusView2 = (TuxStatusView) a(R.id.e_o);
            if (tuxStatusView2 != null) {
                View a3 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(context, R.layout.pl, null, false);
                h.f.b.l.b(a3, "");
                tuxStatusView2.a(a3);
            }
            if (!a().f87251f && (tuxStatusView = (TuxStatusView) a(R.id.e_o)) != null) {
                com.bytedance.tux.h.i.a((View) tuxStatusView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf((int) f87261d), false, 23);
            }
            com.ss.android.ugc.aweme.ecommerce.semipdp.a.a aVar = this.f87264b;
            if (aVar == null) {
                h.f.b.l.a("bottomView");
            }
            ProductPackStruct productPackStruct = a().f87246a;
            if (productPackStruct == null || (thirdParty = productPackStruct.p) == null || (str = thirdParty.f86672d) == null) {
                str = "";
            }
            aVar.setBottomText(str);
        }
        f.a.b.b unused = selectSubscribe(a(), b.f87301a, new ah(), new j(this));
        f.a.b.b unused2 = selectSubscribe(a(), f.f87309a, new ah(), new k(this));
        f.a.b.b unused3 = selectSubscribe(a(), g.f87310a, new ah(), new l(this));
        f.a.b.b unused4 = selectSubscribe(a(), h.f87311a, new ah(), new m(this));
        f.a.b.b unused5 = selectSubscribe(a(), i.f87312a, c.f87306a, new ah(), new g(this));
        f.a.b.b unused6 = selectSubscribe(a(), d.f87307a, new ah(), new h(this));
        f.a.b.b unused7 = selectSubscribe(a(), e.f87308a, new ah(), new i(this));
        View view2 = getView();
        if (view2 != null) {
            view2.setFocusableInTouchMode(true);
        }
        View view3 = getView();
        if (view3 != null) {
            view3.requestFocus();
        }
        View view4 = getView();
        if (view4 != null) {
            view4.setOnKeyListener(new f(this));
        }
        com.ss.android.ugc.aweme.video.i O = com.ss.android.ugc.aweme.video.v.O();
        h.f.b.l.b(O, "");
        this.f87268h = O.o();
    }

    @Override // com.bytedance.tux.sheet.b
    public final void a(com.bytedance.tux.sheet.sheet.a aVar, int i2) {
        j a2;
        j a3;
        j a4;
        h.f.b.l.d(aVar, "");
        if (i2 == 3) {
            if (a().f87254l == 4 && (a2 = a().a()) != null) {
                a2.a("halftofull");
            }
            b(aVar, i2);
        } else if (i2 == 4) {
            if (a().f87254l == 3 && (a3 = a().a()) != null) {
                a3.a("fulltohalf");
            }
            b(aVar, i2);
        } else if (i2 == 5) {
            if (a().f87254l == 4 && (a4 = a().a()) != null) {
                a4.a("halftoquit");
            }
            b(aVar, i2);
        }
    }

    static final class f implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f87291a;

        static {
            Covode.recordClassIndex(54763);
        }

        f(a aVar) {
            this.f87291a = aVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            this.f87291a.a().a("return");
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.qq, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    static final class g extends h.f.b.m implements h.f.a.q<com.bytedance.jedi.arch.i, Boolean, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(3);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool, Integer num) {
            ThirdParty thirdParty;
            String str;
            boolean booleanValue = bool.booleanValue();
            Integer num2 = num;
            String str2 = "";
            h.f.b.l.d(iVar, str2);
            int i2 = 8;
            if (num2 != null && num2.intValue() == -1) {
                a.a(this.this$0).setVisibility(0);
                b b2 = a.b(this.this$0);
                if (b2 != null) {
                    b2.setSpecialIllegalState(false);
                }
                com.ss.android.ugc.aweme.ecommerce.semipdp.a.a a2 = a.a(this.this$0);
                if (a2 != null) {
                    ProductPackStruct productPackStruct = this.this$0.a().f87246a;
                    if (!(productPackStruct == null || (thirdParty = productPackStruct.p) == null || (str = thirdParty.f86672d) == null)) {
                        str2 = str;
                    }
                    a2.setBottomText(str2);
                }
            } else {
                com.ss.android.ugc.aweme.ecommerce.semipdp.a.a a3 = a.a(this.this$0);
                if (a3 != null) {
                    a3.setVisibility(8);
                }
                b b3 = a.b(this.this$0);
                if (b3 != null) {
                    b3.setSpecialIllegalState(true);
                }
            }
            b b4 = a.b(this.this$0);
            if (b4 != null) {
                if (booleanValue && (num2 == null || num2.intValue() != 0)) {
                    i2 = 0;
                }
                b4.setVisibility(i2);
            }
            return z.f158842a;
        }
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
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
