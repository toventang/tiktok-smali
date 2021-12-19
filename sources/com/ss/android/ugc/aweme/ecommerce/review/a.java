package com.ss.android.ugc.aweme.ecommerce.review;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.extension.b;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.status.TuxStatusView;
import com.google.android.material.appbar.AppBarLayout;
import com.ss.android.ugc.aweme.ecommerce.review.a.a;
import com.ss.android.ugc.aweme.ecommerce.review.f;
import com.ss.android.ugc.aweme.ecommerce.review.repo.a;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.review.view.RatingNumber;
import com.ss.android.ugc.aweme.ecommerce.review.view.RatingStar;
import com.ss.android.ugc.aweme.ecommerce.review.view.ReviewFilterGroup;
import com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder;
import com.ss.android.ugc.aweme.ecommerce.util.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.base.arch.b {

    /* renamed from: j  reason: collision with root package name */
    public static final c f86977j = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final Handler f86978b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public boolean f86979c;

    /* renamed from: d  reason: collision with root package name */
    final Runnable f86980d;

    /* renamed from: e  reason: collision with root package name */
    long f86981e;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f86982k = h.i.a((h.f.a.a) new t(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f86983l = h.i.a((h.f.a.a) new q(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f86984m = h.i.a((h.f.a.a) new s(this));
    private final lifecycleAwareLazy n;
    private SparseArray o;

    static {
        Covode.recordClassIndex(54545);
    }

    private float e() {
        return ((Number) this.f86982k.getValue()).floatValue();
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final View a(int i2) {
        if (this.o == null) {
            this.o = new SparseArray();
        }
        View view = (View) this.o.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.o.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final ProductReviewViewModel b() {
        return (ProductReviewViewModel) this.n.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(54549);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class u extends RecyclerView.n {
        static {
            Covode.recordClassIndex(54572);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
        }

        u() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
        }
    }

    public static final class e implements TuxStatusView.b {

        /* renamed from: a  reason: collision with root package name */
        public final FrameLayout f86993a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f86994b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f86995c;

        /* renamed from: d  reason: collision with root package name */
        private final View f86996d;

        /* renamed from: e  reason: collision with root package name */
        private final DmtLoadingLayout f86997e;

        static {
            Covode.recordClassIndex(54553);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.b
        public final void b() {
            this.f86993a.setVisibility(8);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.b
        public final void a() {
            this.f86993a.setVisibility(0);
            if (this.f86994b) {
                this.f86997e.setVisibility(0);
                View view = this.f86996d;
                h.f.b.l.b(view, "");
                view.setVisibility(8);
                return;
            }
            this.f86997e.setVisibility(8);
            View view2 = this.f86996d;
            h.f.b.l.b(view2, "");
            view2.setVisibility(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f86995c = aVar;
            MethodCollector.i(3844);
            View a2 = com.a.a(LayoutInflater.from(aVar.requireContext()), R.layout.qo, null, false);
            this.f86996d = a2;
            DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(aVar.requireContext());
            this.f86997e = dmtLoadingLayout;
            FrameLayout frameLayout = new FrameLayout(aVar.requireContext());
            h.f.b.l.b(a2, "");
            a2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            dmtLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(a2);
            frameLayout.addView(dmtLoadingLayout);
            this.f86993a = frameLayout;
            MethodCollector.o(3844);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$a  reason: collision with other inner class name */
    public static final class C2095a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(54546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2095a(h.k.c cVar) {
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

    static final class q extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            Bundle arguments = this.this$0.getArguments();
            int i2 = 0;
            if (arguments != null) {
                i2 = arguments.getInt("review_count", 0);
            }
            return Integer.valueOf(i2);
        }
    }

    static final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f87004a;

        static {
            Covode.recordClassIndex(54569);
        }

        r(a aVar) {
            this.f87004a = aVar;
        }

        public final void run() {
            this.f87004a.a(true);
            TuxStatusView tuxStatusView = (TuxStatusView) this.f87004a.a(R.id.dmu);
            if (tuxStatusView != null) {
                tuxStatusView.setVisibility(8);
            }
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("product_id", "")) == null) {
                return "";
            }
            return string;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54571);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            Bundle arguments = this.this$0.getArguments();
            float f2 = -1.0f;
            if (arguments != null) {
                f2 = arguments.getFloat("review_score", -1.0f);
            }
            return Float.valueOf(f2);
        }
    }

    public final void c() {
        this.f86981e = SystemClock.elapsedRealtime();
        this.f86978b.removeCallbacks(this.f86980d);
        a(false);
        TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.dmu);
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f fVar = b().f86969b;
        if (fVar != null) {
            fVar.f87016g = SystemClock.elapsedRealtime();
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<ProductReviewViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(54547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_review_ProductReviewFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.review.a$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.review.a$b$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.review.a.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_review_ProductReviewFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        f fVar = b().f86969b;
        if (fVar != null) {
            if (ActivityStack.isAppBackGround()) {
                fVar.f87013d = "close";
            }
            com.ss.android.ugc.aweme.ecommerce.track.c.a(fVar.f87019j, "tiktokec_stay_page", new f.n(fVar));
            fVar.f87013d = "return";
        }
    }

    public a() {
        v vVar = new v(this);
        h.k.c a2 = h.f.b.ab.a(ProductReviewViewModel.class);
        C2095a aVar = new C2095a(a2);
        this.n = new lifecycleAwareLazy(this, aVar, new b(this, aVar, a2, vVar));
        this.f86980d = new r(this);
    }

    public static final class o extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public int f87001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f87002b;

        static {
            Covode.recordClassIndex(54566);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(a aVar) {
            this.f87002b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            int i4 = this.f87001a + i3;
            this.f87001a = i4;
            int i5 = com.ss.android.ugc.aweme.ecommerce.util.h.f87568b;
            AppBarLayout appBarLayout = (AppBarLayout) this.f87002b.a(R.id.dmq);
            h.f.b.l.b(appBarLayout, "");
            if (i4 < (i5 - appBarLayout.getHeight()) - com.ss.android.ugc.aweme.ecommerce.util.h.f87573g) {
                CardView cardView = (CardView) this.f87002b.a(R.id.eo8);
                if (cardView != null) {
                    cardView.setVisibility(8);
                    return;
                }
                return;
            }
            CardView cardView2 = (CardView) this.f87002b.a(R.id.eo8);
            if (cardView2 != null) {
                cardView2.setVisibility(0);
            }
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, com.ss.android.ugc.aweme.ecommerce.review.a.a>> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, com.ss.android.ugc.aweme.ecommerce.review.a.a> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            androidx.fragment.app.i childFragmentManager = this.this$0.getChildFragmentManager();
            h.f.b.l.b(childFragmentManager, "");
            return new ReviewCellViewHolder(childFragmentManager, viewGroup2);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54563);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            this.this$0.c();
            TuxStatusView tuxStatusView = (TuxStatusView) this.this$0.a(R.id.dmu);
            if (tuxStatusView != null) {
                tuxStatusView.a();
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            this.this$0.b().f86970c.f87007a = true;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProductReviewViewModel b2 = b();
        Context requireContext = requireContext();
        h.f.b.l.b(requireContext, "");
        f fVar = new f(requireContext);
        fVar.f87010a = e();
        fVar.f87011b = ((Number) this.f86983l.getValue()).intValue();
        String str = (String) this.f86984m.getValue();
        h.f.b.l.d(str, "");
        fVar.f87012c = str;
        b2.f86969b = fVar;
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f87003a;

        static {
            Covode.recordClassIndex(54567);
        }

        p(a aVar) {
            this.f87003a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((AppBarLayout) this.f87003a.a(R.id.dmq)).a(true, true, true);
            ((RecyclerView) this.f87003a.a(R.id.dmp)).d(0);
            f fVar = this.f87003a.b().f86969b;
            if (fVar != null) {
                h.f.b.l.d("to_top", "");
                com.ss.android.ugc.aweme.ecommerce.track.c.a(fVar.f87019j, "tiktokec_button_click", new f.c("to_top"));
            }
            this.f87003a.a(R.id.dml);
        }
    }

    public final void a(boolean z) {
        AppBarLayout.b bVar = null;
        if (z) {
            View a2 = a(R.id.dmr);
            if (a2 != null) {
                ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                if (layoutParams instanceof AppBarLayout.b) {
                    bVar = layoutParams;
                }
                AppBarLayout.b bVar2 = (AppBarLayout.b) bVar;
                if (bVar2 != null) {
                    bVar2.f52175a = 1;
                    a2.setLayoutParams(bVar2);
                }
            }
            RecyclerView recyclerView = (RecyclerView) a(R.id.dmp);
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
                return;
            }
            return;
        }
        View a3 = a(R.id.dmr);
        if (a3 != null) {
            ViewGroup.LayoutParams layoutParams2 = a3.getLayoutParams();
            if (layoutParams2 instanceof AppBarLayout.b) {
                bVar = layoutParams2;
            }
            AppBarLayout.b bVar3 = bVar;
            if (bVar3 != null) {
                bVar3.f52175a = -1;
                a3.setLayoutParams(bVar3);
            }
        }
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.dmp);
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<ViewGroup, h.f.a.a<? extends z>, com.bytedance.jedi.ext.adapter.a.c> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ com.bytedance.jedi.ext.adapter.a.c invoke(ViewGroup viewGroup, h.f.a.a<? extends z> aVar) {
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(aVar, "");
            return new com.bytedance.jedi.ext.adapter.a.c(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.review.a.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f86998a;

                static {
                    Covode.recordClassIndex(54555);
                }

                @Override // com.bytedance.jedi.ext.adapter.a.c
                public final void a(int i2) {
                }

                @Override // com.bytedance.jedi.ext.adapter.a.c
                public final View a() {
                    MethodCollector.i(3812);
                    View view = new View(this.f86998a.this$0.getContext());
                    MethodCollector.o(3812);
                    return view;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f86998a = r1;
                }
            };
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<Integer, Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f86999a = new h();

        static {
            Covode.recordClassIndex(54557);
        }

        h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(Integer num, Object obj) {
            num.intValue();
            return Boolean.valueOf(obj instanceof a.C2096a);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, String, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            h.f.b.l.d(iVar, "");
            this.this$0.c();
            TuxStatusView tuxStatusView = (TuxStatusView) this.this$0.a(R.id.dmu);
            if (tuxStatusView != null) {
                tuxStatusView.a();
            }
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<ViewGroup, h.f.a.a<? extends z>, com.bytedance.jedi.ext.adapter.a.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f87000a = new j();

        static {
            Covode.recordClassIndex(54559);
        }

        j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ com.bytedance.jedi.ext.adapter.a.e invoke(ViewGroup viewGroup, h.f.a.a<? extends z> aVar) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.a.a<? extends z> aVar2 = aVar;
            h.f.b.l.d(viewGroup2, "");
            h.f.b.l.d(aVar2, "");
            return new com.ss.android.ugc.aweme.ecommerce.common.a.c(viewGroup2, aVar2);
        }
    }

    static final class v extends h.f.b.m implements h.f.a.m<ProductReviewState, Bundle, ProductReviewState> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ ProductReviewState invoke(ProductReviewState productReviewState, Bundle bundle) {
            String str;
            ProductReviewState productReviewState2 = productReviewState;
            h.f.b.l.d(productReviewState2, "");
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                str = arguments.getString("product_id");
            } else {
                str = null;
            }
            return ProductReviewState.copy$default(productReviewState2, 0, null, 0.0f, String.valueOf(str), null, null, 55, null);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            this.this$0.c();
            if (th instanceof a.C2099a) {
                TuxStatusView tuxStatusView = (TuxStatusView) this.this$0.a(R.id.dmu);
                if (tuxStatusView != null) {
                    tuxStatusView.setStatus(com.ss.android.ugc.aweme.ecommerce.util.j.b(!this.this$0.f86979c, new h.f.a.a<z>(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.review.a.k.AnonymousClass1 */
                        final /* synthetic */ k this$0;

                        static {
                            Covode.recordClassIndex(54561);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            this.this$0.this$0.b().k();
                            return z.f158842a;
                        }
                    }));
                }
            } else {
                TuxStatusView tuxStatusView2 = (TuxStatusView) this.this$0.a(R.id.dmu);
                if (tuxStatusView2 != null) {
                    tuxStatusView2.setStatus(com.ss.android.ugc.aweme.ecommerce.util.j.a(!this.this$0.f86979c, new h.f.a.a<z>(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.review.a.k.AnonymousClass2 */
                        final /* synthetic */ k this$0;

                        static {
                            Covode.recordClassIndex(54562);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            this.this$0.this$0.b().k();
                            return z.f158842a;
                        }
                    }));
                }
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.ecommerce.review.a.a>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends com.ss.android.ugc.aweme.ecommerce.review.a.a> list) {
            List<? extends com.ss.android.ugc.aweme.ecommerce.review.a.a> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            if (list2.isEmpty()) {
                this.this$0.c();
                TuxStatusView tuxStatusView = (TuxStatusView) this.this$0.a(R.id.dmu);
                if (tuxStatusView != null) {
                    TuxStatusView.c cVar = new TuxStatusView.c();
                    String string = this.this$0.getString(R.string.bhw);
                    h.f.b.l.b(string, "");
                    cVar.a(string);
                    String string2 = this.this$0.getString(R.string.bhx);
                    h.f.b.l.b(string2, "");
                    cVar.a((CharSequence) string2);
                    tuxStatusView.setStatus(cVar);
                }
            } else {
                a aVar = this.this$0;
                aVar.a(true);
                aVar.f86978b.postDelayed(aVar.f86980d, 100 - (SystemClock.elapsedRealtime() - aVar.f86981e));
                f fVar = aVar.b().f86969b;
                if (fVar != null && !fVar.f87018i) {
                    fVar.f87018i = true;
                    com.ss.android.ugc.aweme.ecommerce.track.c.a(fVar.f87019j, "tiktokec_enter_page", new f.e(fVar));
                }
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, a.b, z> {
        final /* synthetic */ e $delegate;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(54550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, e eVar) {
            super(2);
            this.this$0 = aVar;
            this.$delegate = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, a.b bVar) {
            int i2;
            a.b bVar2 = bVar;
            h.f.b.l.d(iVar, "");
            if (bVar2 != null) {
                this.this$0.f86979c = true;
                this.$delegate.f86994b = true;
                AppBarLayout appBarLayout = (AppBarLayout) this.this$0.a(R.id.dmq);
                h.f.b.l.b(appBarLayout, "");
                int i3 = 0;
                appBarLayout.setVisibility(0);
                ReviewFilterGroup reviewFilterGroup = (ReviewFilterGroup) this.this$0.a(R.id.b2n);
                List<ReviewFilterStruct> list = bVar2.f86991a;
                h.f.b.l.d(list, "");
                if (reviewFilterGroup.f87093a.getChildCount() == 0) {
                    reviewFilterGroup.f87093a.removeAllViews();
                    int i4 = 0;
                    for (T t : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            h.a.n.a();
                        }
                        T t2 = t;
                        Context context = reviewFilterGroup.getContext();
                        h.f.b.l.b(context, "");
                        com.ss.android.ugc.aweme.ecommerce.review.view.c cVar = new com.ss.android.ugc.aweme.ecommerce.review.view.c(context, (byte) 0);
                        TextView pre = cVar.getPre();
                        h.f.b.l.b(pre, "");
                        pre.setText(t2.f87052b);
                        TextView suf = cVar.getSuf();
                        h.f.b.l.b(suf, "");
                        suf.setText(t2.f87053c);
                        View star = cVar.getStar();
                        h.f.b.l.b(star, "");
                        if (t2.f87054d == 2) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        star.setVisibility(i2);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = com.ss.android.ugc.aweme.ecommerce.util.h.f87572f;
                        marginLayoutParams.bottomMargin = com.ss.android.ugc.aweme.ecommerce.util.h.f87572f;
                        int i6 = Build.VERSION.SDK_INT;
                        marginLayoutParams.setMarginEnd(com.ss.android.ugc.aweme.ecommerce.util.h.f87572f);
                        cVar.setLayoutParams(marginLayoutParams);
                        cVar.setTag(t2);
                        cVar.setOnClickListener(new ReviewFilterGroup.a(i4, reviewFilterGroup));
                        reviewFilterGroup.f87093a.addView(cVar);
                        i4 = i5;
                    }
                }
                ((ReviewFilterGroup) this.this$0.a(R.id.b2n)).setOnSelectedChangeListener(new h.f.a.m<Integer, ReviewFilterStruct, z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.review.a.d.AnonymousClass1 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(54551);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
                        r3 = new com.ss.android.ugc.aweme.ecommerce.review.f.b(r2, r1, r0);
                        r4.f87014e = r3;
                        r4.f87015f.clear();
                        r4.f87017h.clear();
                        com.ss.android.ugc.aweme.ecommerce.track.c.a(r4.f87019j, "tiktokec_filter_click", new com.ss.android.ugc.aweme.ecommerce.review.f.C2097f(r4, r3));
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
                        if (r1 == null) goto L_0x0019;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
                        if (r8 != null) goto L_0x001d;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
                        r0 = r8.f87051a;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
                        if (r0 != null) goto L_0x0023;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
                        r0 = "-1";
                     */
                    @Override // h.f.a.m
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ h.z invoke(java.lang.Integer r7, com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct r8) {
                        /*
                            r6 = this;
                            java.lang.Number r7 = (java.lang.Number) r7
                            int r2 = r7.intValue()
                            com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct r8 = (com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct) r8
                            com.ss.android.ugc.aweme.ecommerce.review.a$d r0 = r6.this$0
                            com.ss.android.ugc.aweme.ecommerce.review.a r0 = r0.this$0
                            com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel r5 = r0.b()
                            com.ss.android.ugc.aweme.ecommerce.review.f r4 = r5.f86969b
                            if (r4 == 0) goto L_0x003e
                            com.ss.android.ugc.aweme.ecommerce.review.f$b r3 = new com.ss.android.ugc.aweme.ecommerce.review.f$b
                            if (r8 != 0) goto L_0x0049
                            r2 = -1
                        L_0x0019:
                            java.lang.String r1 = "all"
                            if (r8 == 0) goto L_0x0021
                        L_0x001d:
                            java.lang.String r0 = r8.f87051a
                            if (r0 != 0) goto L_0x0023
                        L_0x0021:
                            java.lang.String r0 = "-1"
                        L_0x0023:
                            r3.<init>(r2, r1, r0)
                            r4.f87014e = r3
                            java.util.Set<java.lang.String> r0 = r4.f87015f
                            r0.clear()
                            java.util.HashSet<java.lang.String> r0 = r4.f87017h
                            r0.clear()
                            android.content.Context r2 = r4.f87019j
                            com.ss.android.ugc.aweme.ecommerce.review.f$f r1 = new com.ss.android.ugc.aweme.ecommerce.review.f$f
                            r1.<init>(r4, r3)
                            java.lang.String r0 = "tiktokec_filter_click"
                            com.ss.android.ugc.aweme.ecommerce.track.c.a(r2, r0, r1)
                        L_0x003e:
                            com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$k r0 = new com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$k
                            r0.<init>(r8)
                            r5.c(r0)
                            h.z r0 = h.z.f158842a
                            return r0
                        L_0x0049:
                            java.lang.String r1 = r8.f87052b
                            if (r1 != 0) goto L_0x001d
                            goto L_0x0019
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.review.a.d.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
                View view = this.this$0.getView();
                if (view != null) {
                    view.post(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.review.a.d.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ d f86992a;

                        static {
                            Covode.recordClassIndex(54552);
                        }

                        {
                            this.f86992a = r1;
                        }

                        public final void run() {
                            TuxStatusView tuxStatusView = (TuxStatusView) this.f86992a.this$0.a(R.id.dmu);
                            if (tuxStatusView != null) {
                                ViewGroup.LayoutParams layoutParams = tuxStatusView.getLayoutParams();
                                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                                    layoutParams = null;
                                }
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (marginLayoutParams != null) {
                                    AppBarLayout appBarLayout = (AppBarLayout) this.f86992a.this$0.a(R.id.dmq);
                                    h.f.b.l.b(appBarLayout, "");
                                    marginLayoutParams.topMargin = appBarLayout.getHeight();
                                    tuxStatusView.setLayoutParams(marginLayoutParams);
                                }
                            }
                        }
                    });
                }
                for (T t3 : bVar2.f86991a) {
                    int i7 = i3 + 1;
                    if (i3 < 0) {
                        h.a.n.a();
                    }
                    T t4 = t3;
                    f fVar = this.this$0.b().f86969b;
                    if (fVar != null) {
                        com.ss.android.ugc.aweme.ecommerce.track.c.a(fVar.f87019j, "tiktokec_filter_name_show", new f.g(fVar, t4, i3));
                    }
                    i3 = i7;
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (e() >= 0.0f) {
            ((RatingNumber) a(R.id.dhd)).getMaxScore().setText("5");
            ((RatingNumber) a(R.id.dhd)).getScore().setText(String.valueOf(e()));
            ((RatingStar) a(R.id.dhe)).setRate(e());
            ((RatingStar) a(R.id.dhe)).setStarSize(16);
            LinearLayout linearLayout = (LinearLayout) a(R.id.dhc);
            h.f.b.l.b(linearLayout, "");
            linearLayout.setVisibility(0);
        } else {
            LinearLayout linearLayout2 = (LinearLayout) a(R.id.dhc);
            h.f.b.l.b(linearLayout2, "");
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = (RecyclerView) a(R.id.dmp);
        h.f.b.l.b(recyclerView, "");
        Context requireContext = requireContext();
        h.f.b.l.b(requireContext, "");
        recyclerView.setLayoutManager(new ScrollTopLinearLayoutManager(requireContext));
        ((RecyclerView) a(R.id.dmp)).a(new com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a(androidx.core.content.b.c(requireContext(), R.color.b6), 0, 0.0f, 6));
        f.a.b.b unused = selectSubscribe(b(), c.f87006a, new ah(), new g(this));
        com.bytedance.jedi.ext.adapter.a.g gVar = (com.bytedance.jedi.ext.adapter.a.g) com.bytedance.jedi.ext.adapter.a.b.a((com.bytedance.jedi.ext.adapter.extension.b) b.a.a(this, b().f86970c).a(h.f86999a, null, new i(this))).a(244).a(j.f87000a);
        gVar.q = b();
        com.bytedance.jedi.ext.adapter.a.g gVar2 = (com.bytedance.jedi.ext.adapter.a.g) gVar.a(new l(this), new k(this), new m(this));
        n nVar = new n(this);
        h.f.b.l.c(nVar, "");
        gVar2.f39583m = nVar;
        com.bytedance.jedi.ext.adapter.a.g gVar3 = gVar2;
        f fVar = new f(this);
        h.f.b.l.c(fVar, "");
        gVar3.f39578h = fVar;
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.dmp);
        h.f.b.l.b(recyclerView2, "");
        gVar3.a(recyclerView2);
        ((RecyclerView) a(R.id.dmp)).a(new u());
        e eVar = new e(this);
        ((TuxStatusView) a(R.id.dmu)).a(eVar.f86993a);
        ((TuxStatusView) a(R.id.dmu)).a(eVar);
        f.a.b.b unused2 = selectSubscribe(b(), b.f87005a, new ah(), new d(this, eVar));
        CardView cardView = (CardView) a(R.id.eo8);
        h.f.b.l.b(cardView, "");
        cardView.setVisibility(8);
        ((RecyclerView) a(R.id.dmp)).a(new o(this));
        CardView cardView2 = (CardView) a(R.id.eo8);
        if (cardView2 != null) {
            cardView2.setOnClickListener(new p(this));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.qf, viewGroup, false);
    }
}
