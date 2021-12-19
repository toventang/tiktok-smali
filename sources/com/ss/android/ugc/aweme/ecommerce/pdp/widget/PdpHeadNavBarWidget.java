package com.ss.android.ugc.aweme.ecommerce.pdp.widget;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.jedi.arch.ah;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class PdpHeadNavBarWidget extends JediBaseWidget implements au {

    /* renamed from: j  reason: collision with root package name */
    public static final int f86901j = com.ss.android.ugc.aweme.ecommerce.util.h.f87567a;

    /* renamed from: k  reason: collision with root package name */
    public static final b f86902k = new b((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public boolean f86903h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.fragment.app.i f86904i;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f86905l;

    @Override // com.bytedance.widget.Widget
    public final int b() {
        return R.layout.pq;
    }

    public final PdpViewModel l() {
        return (PdpViewModel) this.f86905l.getValue();
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(54463);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(54461);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ Widget $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = widget;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_widget_PdpHeadNavBarWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final void m() {
        View view;
        TuxIconView tuxIconView;
        View view2;
        LinearLayout linearLayout;
        if (!l().q && (view = this.f46127e) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.e3_)) != null && tuxIconView.getVisibility() == 0 && (view2 = this.f46127e) != null && (linearLayout = (LinearLayout) view2.findViewById(R.id.d2x)) != null && linearLayout.getVisibility() == 0) {
            l().q = true;
            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = l().s;
            if (kVar != null) {
                kVar.c();
            }
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void c() {
        super.c();
        View view = this.f46127e;
        if (view != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.d2x);
            if (linearLayout != null) {
                linearLayout.setPadding(linearLayout.getPaddingLeft(), l().b(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.chz);
            if (constraintLayout != null) {
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), l().b(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
            }
            if (l().w) {
                ((TuxIconView) view.findViewById(R.id.a7u)).setIconRes(R.raw.icon_arrow_left_ltr);
            } else {
                ((TuxIconView) view.findViewById(R.id.a7u)).setIconRes(R.raw.icon_x_mark);
            }
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.a7u);
            if (tuxIconView != null) {
                tuxIconView.setOnClickListener(new e(this));
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.a7h);
            h.f.b.l.b(appCompatImageView, "");
            appCompatImageView.setOnClickListener(new f(this));
            if (l().p) {
                TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.uf);
                h.f.b.l.b(tuxIconView2, "");
                tuxIconView2.setVisibility(8);
                TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.uf);
                h.f.b.l.b(tuxIconView3, "");
                tuxIconView3.setOnClickListener(new g(this));
            }
            TuxIconView tuxIconView4 = (TuxIconView) view.findViewById(R.id.co2);
            h.f.b.l.b(tuxIconView4, "");
            tuxIconView4.setOnClickListener(new h(this));
            f.a.b.b unused = selectSubscribe(l(), n.f86931a, new ah(), new i(view, this));
            f.a.b.b unused2 = selectSubscribe(l(), o.f86932a, new ah(), new j(view, this));
        }
        f.a.b.b unused3 = selectSubscribe(l(), p.f86933a, new ah(), new l(this));
        f.a.b.b unused4 = selectSubscribe(l(), q.f86934a, r.f86935a, new ah(), new m(this));
        z.a aVar = new z.a();
        aVar.element = false;
        f.a.b.b unused5 = selectSubscribe(l(), s.f86936a, new ah(), new n(this, aVar));
        f.a.b.b unused6 = selectSubscribe(l(), t.f86937a, new ah(), new k(this));
    }

    public static final class e extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86907a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpHeadNavBarWidget f86908b;

        static {
            Covode.recordClassIndex(54466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(700);
            this.f86908b = pdpHeadNavBarWidget;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f86908b.l().i();
            }
        }
    }

    public static final class f extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86909a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpHeadNavBarWidget f86910b;

        static {
            Covode.recordClassIndex(54467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(700);
            this.f86910b = pdpHeadNavBarWidget;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f86910b.l().i();
            }
        }
    }

    public static final class g extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86911a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpHeadNavBarWidget f86912b;

        static {
            Covode.recordClassIndex(54468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(700);
            this.f86912b = pdpHeadNavBarWidget;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar;
            if (view != null && (kVar = this.f86912b.l().s) != null) {
                kVar.a("collection", (Boolean) null, (Boolean) null);
            }
        }
    }

    public static final class h extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86913a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpHeadNavBarWidget f86914b;

        static {
            Covode.recordClassIndex(54469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(700);
            this.f86914b = pdpHeadNavBarWidget;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            SellerInfo sellerInfo;
            if (view != null) {
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86914b.l().s;
                if (kVar != null) {
                    ProductPackStruct productPackStruct = this.f86914b.l().f86303d;
                    if (productPackStruct == null || (sellerInfo = productPackStruct.f86640d) == null || (str = sellerInfo.f86657a) == null) {
                        str = "";
                    }
                    kVar.e(str);
                }
                Context context = view.getContext();
                h.f.b.l.b(context, "");
                IPdpStarter.a.a(context, this.f86914b.f86904i, this.f86914b.l().l(), new h.f.a.a<h.z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget.h.AnonymousClass1 */
                    final /* synthetic */ h this$0;

                    static {
                        Covode.recordClassIndex(54470);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ h.z invoke() {
                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.this$0.f86914b.l().s;
                        if (kVar != null) {
                            kVar.b();
                        }
                        return h.z.f158842a;
                    }
                });
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar2 = this.f86914b.l().s;
                if (kVar2 != null) {
                    kVar2.a("more_function", (Boolean) null, (Boolean) null);
                }
            }
        }
    }

    public static final class o extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86915a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpHeadNavBarWidget f86916b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CartEntry f86917c;

        static {
            Covode.recordClassIndex(54478);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f86916b.l().a(view.getContext());
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86916b.l().s;
                if (kVar != null) {
                    kVar.d();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(PdpHeadNavBarWidget pdpHeadNavBarWidget, CartEntry cartEntry) {
            super(700);
            this.f86916b = pdpHeadNavBarWidget;
            this.f86917c = cartEntry;
        }
    }

    public PdpHeadNavBarWidget(androidx.fragment.app.i iVar) {
        this.f86904i = iVar;
        h.k.c a2 = h.f.b.ab.a(PdpViewModel.class);
        this.f86905l = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    static final class c implements DmtTabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PdpHeadNavBarWidget f86906a;

        static {
            Covode.recordClassIndex(54464);
        }

        c(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            this.f86906a = pdpHeadNavBarWidget;
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.b
        public final void a(DmtTabLayout.f fVar) {
            this.f86906a.l().x = true;
            PdpViewModel l2 = this.f86906a.l();
            String str = "";
            h.f.b.l.b(fVar, str);
            l2.a(fVar.f33752e, true);
            int i2 = fVar.f33752e;
            if (i2 == 0) {
                str = "overview";
            } else if (i2 == 1) {
                str = "reviews";
            } else if (i2 == 2) {
                str = "description";
            }
            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86906a.l().s;
            if (kVar != null) {
                kVar.b(str, (HashMap<String, Object>) null);
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.pdp.d, h.z> {
        final /* synthetic */ List $tabs;

        static {
            Covode.recordClassIndex(54465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(List list) {
            super(2);
            this.$tabs = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.pdp.d dVar) {
            com.ss.android.ugc.aweme.ecommerce.pdp.d dVar2 = dVar;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(dVar2, "");
            DmtTabLayout.f fVar = (DmtTabLayout.f) h.a.n.b(this.$tabs, dVar2.f86443a);
            if (fVar != null) {
                fVar.a();
            }
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, h.z> {
        final /* synthetic */ z.a $hasTabButtonShow;
        final /* synthetic */ PdpHeadNavBarWidget this$0;

        static {
            Covode.recordClassIndex(54476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(PdpHeadNavBarWidget pdpHeadNavBarWidget, z.a aVar) {
            super(2);
            this.this$0 = pdpHeadNavBarWidget;
            this.$hasTabButtonShow = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            final int intValue = num.intValue();
            h.f.b.l.d(iVar2, "");
            iVar2.withState(this.this$0.l(), new h.f.a.b<PdpMainState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget.n.AnonymousClass1 */
                final /* synthetic */ n this$0;

                static {
                    Covode.recordClassIndex(54477);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(PdpMainState pdpMainState) {
                    LinearLayout linearLayout;
                    LinearLayout linearLayout2;
                    DmtTabLayout dmtTabLayout;
                    LinearLayout linearLayout3;
                    LinearLayout linearLayout4;
                    boolean z;
                    PdpMainState pdpMainState2 = pdpMainState;
                    h.f.b.l.d(pdpMainState2, "");
                    if (pdpMainState2.getLoadingStatus() == -1) {
                        float f2 = (1.0f / ((float) PdpHeadNavBarWidget.f86901j)) * ((float) intValue);
                        View view = this.this$0.this$0.f46127e;
                        if (!(view == null || (linearLayout4 = (LinearLayout) view.findViewById(R.id.d2x)) == null)) {
                            if (f2 > 0.9f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            linearLayout4.setClickable(z);
                        }
                        if (f2 > 0.05f) {
                            View view2 = this.this$0.this$0.f46127e;
                            if (!(view2 == null || (linearLayout3 = (LinearLayout) view2.findViewById(R.id.d2x)) == null)) {
                                linearLayout3.setVisibility(0);
                            }
                            View view3 = this.this$0.this$0.f46127e;
                            if (view3 != null && (dmtTabLayout = (DmtTabLayout) view3.findViewById(R.id.d2y)) != null && dmtTabLayout.getVisibility() == 0 && !this.this$0.$hasTabButtonShow.element) {
                                this.this$0.$hasTabButtonShow.element = true;
                                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.this$0.this$0.l().s;
                                if (kVar != null) {
                                    kVar.a("overview", (HashMap<String, Object>) null);
                                }
                                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar2 = this.this$0.this$0.l().s;
                                if (kVar2 != null) {
                                    kVar2.a("description", (HashMap<String, Object>) null);
                                }
                                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar3 = this.this$0.this$0.l().s;
                                if (kVar3 != null) {
                                    kVar3.a("reviews", (HashMap<String, Object>) null);
                                }
                            }
                        } else {
                            View view4 = this.this$0.this$0.f46127e;
                            if (!(view4 == null || (linearLayout = (LinearLayout) view4.findViewById(R.id.d2x)) == null)) {
                                linearLayout.setVisibility(8);
                            }
                        }
                        View view5 = this.this$0.this$0.f46127e;
                        if (!(view5 == null || (linearLayout2 = (LinearLayout) view5.findViewById(R.id.d2x)) == null)) {
                            linearLayout2.setAlpha(f2);
                        }
                    }
                    this.this$0.this$0.m();
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, h.z> {
        final /* synthetic */ PdpHeadNavBarWidget this$0;

        static {
            Covode.recordClassIndex(54474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(2);
            this.this$0 = pdpHeadNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            View view;
            LinearLayout linearLayout;
            int intValue = num.intValue();
            h.f.b.l.d(iVar, "");
            if (!(intValue == -1 || (view = this.this$0.f46127e) == null || (linearLayout = (LinearLayout) view.findViewById(R.id.d2x)) == null)) {
                linearLayout.setVisibility(8);
            }
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.pdp.a, h.z> {
        final /* synthetic */ View $it;
        final /* synthetic */ PdpHeadNavBarWidget this$0;

        static {
            Covode.recordClassIndex(54472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(View view, PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(2);
            this.$it = view;
            this.this$0 = pdpHeadNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.pdp.a aVar) {
            LinearLayout linearLayout;
            com.ss.android.ugc.aweme.ecommerce.pdp.a aVar2 = aVar;
            h.f.b.l.d(iVar, "");
            View view = this.this$0.f46127e;
            if (!(view == null || (linearLayout = (LinearLayout) view.findViewById(R.id.d2x)) == null || linearLayout.getVisibility() != 0)) {
                TuxIconView tuxIconView = (TuxIconView) this.$it.findViewById(R.id.e3_);
                h.f.b.l.b(tuxIconView, "");
                if (tuxIconView.getVisibility() == 0) {
                    this.this$0.l().a(this.$it.getContext(), aVar2, this.$it.findViewById(R.id.e3_));
                }
            }
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, ProductDetailReview, h.z> {
        final /* synthetic */ View $it;
        final /* synthetic */ PdpHeadNavBarWidget this$0;

        static {
            Covode.recordClassIndex(54471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(View view, PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(2);
            this.$it = view;
            this.this$0 = pdpHeadNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, ProductDetailReview productDetailReview) {
            List<ReviewItemStruct> list;
            boolean z;
            ProductDetailReview productDetailReview2 = productDetailReview;
            h.f.b.l.d(iVar, "");
            if (productDetailReview2 != null) {
                list = productDetailReview2.f86632c;
            } else {
                list = null;
            }
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                DmtTabLayout dmtTabLayout = (DmtTabLayout) this.$it.findViewById(R.id.d2y);
                h.f.b.l.b(dmtTabLayout, "");
                dmtTabLayout.setVisibility(8);
            } else {
                DmtTabLayout dmtTabLayout2 = (DmtTabLayout) this.$it.findViewById(R.id.d2y);
                h.f.b.l.b(dmtTabLayout2, "");
                dmtTabLayout2.setVisibility(0);
                PdpHeadNavBarWidget pdpHeadNavBarWidget = this.this$0;
                View view = pdpHeadNavBarWidget.f46127e;
                if (view != null && !pdpHeadNavBarWidget.f86903h) {
                    pdpHeadNavBarWidget.f86903h = true;
                    DmtTabLayout dmtTabLayout3 = (DmtTabLayout) view.findViewById(R.id.d2y);
                    Integer[] numArr = {Integer.valueOf((int) R.string.bhi), Integer.valueOf((int) R.string.bhj), Integer.valueOf((int) R.string.bhh)};
                    ArrayList arrayList = new ArrayList(3);
                    int i2 = 0;
                    do {
                        int intValue = numArr[i2].intValue();
                        DmtTabLayout.f a2 = dmtTabLayout3.a(0);
                        if (a2.f33755h != null) {
                            a2.a(a2.f33755h.getResources().getText(intValue));
                            h.f.b.l.b(a2, "");
                            DmtTabLayout.h hVar = a2.f33756i;
                            h.f.b.l.b(hVar, "");
                            TextView textView = hVar.getTextView();
                            h.f.b.l.b(textView, "");
                            textView.setAllCaps(false);
                            h.f.b.l.b(a2, "");
                            dmtTabLayout3.a(a2);
                            arrayList.add(a2);
                            i2++;
                        } else {
                            throw new IllegalArgumentException("Tab not attached to a TabLayout");
                        }
                    } while (i2 < 3);
                    dmtTabLayout3.setOnTabClickListener(new c(pdpHeadNavBarWidget));
                    h.f.b.l.b(dmtTabLayout3, "");
                    dmtTabLayout3.setTabMode(0);
                    dmtTabLayout3.setAutoFillWhenScrollable(true);
                    f.a.b.b unused = pdpHeadNavBarWidget.selectSubscribe(pdpHeadNavBarWidget.l(), m.f86930a, new ah(), new d(arrayList));
                }
            }
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, CartEntry, h.z> {
        final /* synthetic */ PdpHeadNavBarWidget this$0;

        static {
            Covode.recordClassIndex(54473);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(2);
            this.this$0 = pdpHeadNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, CartEntry cartEntry) {
            Integer num;
            CartEntry cartEntry2 = cartEntry;
            h.f.b.l.d(iVar, "");
            PdpHeadNavBarWidget pdpHeadNavBarWidget = this.this$0;
            View view = pdpHeadNavBarWidget.f46127e;
            if (view != null) {
                pdpHeadNavBarWidget.l();
                if (PdpViewModel.a(cartEntry2)) {
                    TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e3_);
                    h.f.b.l.b(tuxIconView, "");
                    tuxIconView.setVisibility(0);
                    if (!(cartEntry2 == null || (num = cartEntry2.f86600b) == null)) {
                        int intValue = num.intValue();
                        if (intValue > 0) {
                            TuxAlertBadge tuxAlertBadge = (TuxAlertBadge) view.findViewById(R.id.e3b);
                            h.f.b.l.b(tuxAlertBadge, "");
                            tuxAlertBadge.setVisibility(0);
                            ((TuxAlertBadge) view.findViewById(R.id.e3b)).setCount(intValue);
                        } else {
                            TuxAlertBadge tuxAlertBadge2 = (TuxAlertBadge) view.findViewById(R.id.e3b);
                            h.f.b.l.b(tuxAlertBadge2, "");
                            tuxAlertBadge2.setVisibility(8);
                        }
                    }
                    TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.e3_);
                    h.f.b.l.b(tuxIconView2, "");
                    tuxIconView2.setOnClickListener(new o(pdpHeadNavBarWidget, cartEntry2));
                } else {
                    TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.e3_);
                    h.f.b.l.b(tuxIconView3, "");
                    tuxIconView3.setVisibility(8);
                    TuxAlertBadge tuxAlertBadge3 = (TuxAlertBadge) view.findViewById(R.id.e3b);
                    h.f.b.l.b(tuxAlertBadge3, "");
                    tuxAlertBadge3.setVisibility(8);
                }
                pdpHeadNavBarWidget.m();
            }
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements q<com.bytedance.jedi.arch.i, Float, Integer, h.z> {
        final /* synthetic */ PdpHeadNavBarWidget this$0;

        static {
            Covode.recordClassIndex(54475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(3);
            this.this$0 = pdpHeadNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Float f2, Integer num) {
            ConstraintLayout constraintLayout;
            View view;
            ConstraintLayout constraintLayout2;
            ConstraintLayout constraintLayout3;
            float floatValue = f2.floatValue();
            int intValue = num.intValue();
            h.f.b.l.d(iVar, "");
            if (floatValue >= 1.0f) {
                View view2 = this.this$0.f46127e;
                if (!(view2 == null || (constraintLayout3 = (ConstraintLayout) view2.findViewById(R.id.chz)) == null)) {
                    constraintLayout3.setVisibility(0);
                }
            } else {
                View view3 = this.this$0.f46127e;
                if (!(view3 == null || (constraintLayout = (ConstraintLayout) view3.findViewById(R.id.chz)) == null)) {
                    constraintLayout.setVisibility(8);
                }
            }
            if (!(intValue != -1 || (view = this.this$0.f46127e) == null || (constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.chz)) == null)) {
                constraintLayout2.setVisibility(8);
            }
            return h.z.f158842a;
        }
    }
}
