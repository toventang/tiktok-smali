package com.ss.android.ugc.aweme.following.ui.controller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.ui.viewmodel.TopRecommendVM;
import com.ss.android.ugc.aweme.social.widget.card.j;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.h;
import h.i;
import h.v;
import h.z;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public final class RecommendController implements ViewTreeObserver.OnGlobalLayoutListener, k, m {

    /* renamed from: k  reason: collision with root package name */
    public static final h f96469k = i.a((h.f.a.a) b.f96482a);

    /* renamed from: l  reason: collision with root package name */
    public static final a f96470l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f96471a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.social.widget.a f96472b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f96473c;

    /* renamed from: d  reason: collision with root package name */
    public PowerList f96474d;

    /* renamed from: e  reason: collision with root package name */
    public j f96475e;

    /* renamed from: f  reason: collision with root package name */
    public View f96476f;

    /* renamed from: g  reason: collision with root package name */
    public h.f.a.a<z> f96477g;

    /* renamed from: h  reason: collision with root package name */
    public DmtStatusView f96478h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f96479i;

    /* renamed from: j  reason: collision with root package name */
    public final Fragment f96480j;

    public static final class a {
        static {
            Covode.recordClassIndex(61100);
        }

        private static int a() {
            return ((Number) RecommendController.f96469k.getValue()).intValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.controller.RecommendController$a$a  reason: collision with other inner class name */
        public static final class C2325a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.social.widget.card.view.a, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2325a f96481a = new C2325a();

            static {
                Covode.recordClassIndex(61101);
            }

            C2325a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.social.widget.card.view.a aVar) {
                com.ss.android.ugc.aweme.social.widget.card.view.a aVar2 = aVar;
                l.d(aVar2, "");
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                com.bytedance.tux.h.i.b(aVar2, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()))), null, null, false, 29);
                return z.f158842a;
            }
        }

        public static com.ss.android.ugc.aweme.social.widget.card.a.g a(com.ss.android.ugc.aweme.social.widget.card.a.a aVar, boolean z) {
            return new com.ss.android.ugc.aweme.social.widget.card.a.g(ag.a(v.a(com.ss.android.ugc.aweme.social.widget.card.a.f.CONTACT, aVar), v.a(com.ss.android.ugc.aweme.social.widget.card.a.f.FACEBOOK, aVar)), true, z, a());
        }

        public static com.ss.android.ugc.aweme.social.widget.card.a.h a(com.ss.android.ugc.aweme.social.widget.card.a.a aVar, int i2, int i3, RecyclerView recyclerView) {
            WeakReference weakReference;
            if (recyclerView != null) {
                weakReference = new WeakReference(recyclerView);
            } else {
                weakReference = null;
            }
            return new com.ss.android.ugc.aweme.social.widget.card.a.h(aVar, i2, i3, weakReference);
        }
    }

    public static final class c implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f96483a;

        static {
            Covode.recordClassIndex(61103);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.following.ui.controller.RecommendController.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f96484a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f96485b;

                static {
                    Covode.recordClassIndex(61104);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f96484a < this.f96485b.f96483a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f96485b.f96483a;
                    int i2 = this.f96484a;
                    this.f96484a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f96485b = r1;
                }
            };
        }

        public c(ViewGroup viewGroup) {
            this.f96483a = viewGroup;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f96482a = new b();

        static {
            Covode.recordClassIndex(61102);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            if (com.ss.android.ugc.aweme.social.a.b.b()) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            return Integer.valueOf(i2);
        }
    }

    public final void a() {
        View view = this.f96476f;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f96471a = true;
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.i lifecycle = this.f96480j.getLifecycle();
        l.b(lifecycle, "");
        return lifecycle;
    }

    static {
        Covode.recordClassIndex(61099);
    }

    public final TopRecommendVM b() {
        if (a(this.f96480j)) {
            return (TopRecommendVM) ae.a(this.f96480j.requireActivity(), (ad.b) null).a(TopRecommendVM.class);
        }
        return null;
    }

    public final void onGlobalLayout() {
        Integer num;
        LinearLayout linearLayout = this.f96473c;
        if (linearLayout == null) {
            l.a("container");
        }
        if (linearLayout.getGlobalVisibleRect(new Rect())) {
            if (!com.ss.android.ugc.aweme.social.a.b.c() && (num = com.ss.android.ugc.aweme.social.a.c.f133647a.f133630b) != null) {
                int intValue = num.intValue();
                int i2 = com.ss.android.ugc.aweme.social.a.c.a().getInt("following_exp_ff_c", 0) + 1;
                if (i2 >= intValue) {
                    com.ss.android.ugc.aweme.social.a.c.a().storeLong("following_h_ff_t", System.currentTimeMillis());
                } else {
                    com.ss.android.ugc.aweme.social.a.c.a().storeInt("following_exp_ff_c", i2);
                }
            }
            LinearLayout linearLayout2 = this.f96473c;
            if (linearLayout2 == null) {
                l.a("container");
            }
            linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendController f96488a;

        static {
            Covode.recordClassIndex(61108);
        }

        public e(RecommendController recommendController) {
            this.f96488a = recommendController;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            h.f.a.a<z> aVar = this.f96488a.f96477g;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public RecommendController(Fragment fragment) {
        l.d(fragment, "");
        this.f96480j = fragment;
    }

    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f96490a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f96491b;

        static {
            Covode.recordClassIndex(61110);
        }

        public final void onAnimationCancel(Animator animator) {
            int i2;
            View view = (View) this.f96491b.get();
            if (view != null) {
                if (this.f96490a) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            int i2;
            View view = (View) this.f96491b.get();
            if (view != null) {
                if (this.f96490a) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }

        g(boolean z, WeakReference weakReference) {
            this.f96490a = z;
            this.f96491b = weakReference;
        }
    }

    private static boolean a(Fragment fragment) {
        if (fragment.getActivity() == null || fragment.isDetached() || !fragment.isAdded()) {
            return false;
        }
        return true;
    }

    public static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendController f96489a;

        static {
            Covode.recordClassIndex(61109);
        }

        public f(RecommendController recommendController) {
            this.f96489a = recommendController;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            float f2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                RecommendController recommendController = this.f96489a;
                LinearLayout linearLayout = recommendController.f96473c;
                if (linearLayout == null) {
                    l.a("container");
                }
                for (T t : new c(linearLayout)) {
                    if (!(t instanceof TuxStatusView) && ((!l.a((Object) t, (Object) recommendController.f96476f) || !recommendController.f96471a) && (!booleanValue || t.getVisibility() != 0))) {
                        int i2 = 8;
                        if (booleanValue) {
                            f2 = 1.0f;
                        } else if (t.getVisibility() != 8) {
                            f2 = 0.0f;
                        }
                        WeakReference weakReference = new WeakReference(t);
                        if (!booleanValue) {
                            i2 = 0;
                        }
                        t.setVisibility(i2);
                        t.animate().alpha(f2).setDuration(100).setListener(new g(booleanValue, weakReference));
                    }
                }
            }
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.social.widget.card.view.a, z> {
        final /* synthetic */ TopRecommendVM $viewModel;
        final /* synthetic */ RecommendController this$0;

        static {
            Covode.recordClassIndex(61105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(RecommendController recommendController, TopRecommendVM topRecommendVM) {
            super(1);
            this.this$0 = recommendController;
            this.$viewModel = topRecommendVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.social.widget.card.view.a aVar) {
            com.ss.android.ugc.aweme.social.widget.card.view.a aVar2 = aVar;
            l.d(aVar2, "");
            if (com.ss.android.ugc.aweme.social.a.b.c()) {
                ((TuxTextView) com.a.a(LayoutInflater.from(aVar2.getContext()), R.layout.anu, aVar2, true).findViewById(R.id.bg2)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.following.ui.controller.RecommendController.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f96486a;

                    static {
                        Covode.recordClassIndex(61106);
                    }

                    {
                        this.f96486a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        this.f96486a.this$0.f96479i = true;
                        com.ss.android.ugc.aweme.social.a.c.f133648b = false;
                        com.ss.android.ugc.aweme.social.a.c.a().storeLong("following_h_t_k", System.currentTimeMillis());
                        r.a("hide_recommend_cell", ag.a(v.a("enter_from", "following_list")));
                        TopRecommendVM topRecommendVM = this.f96486a.$viewModel;
                        topRecommendVM.a(false);
                        topRecommendVM.f96649b = true;
                    }
                });
            } else if (com.ss.android.ugc.aweme.social.a.b.d()) {
                ((LinearLayout) com.a.a(LayoutInflater.from(aVar2.getContext()), R.layout.anv, aVar2, true).findViewById(R.id.dws)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.following.ui.controller.RecommendController.d.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f96487a;

                    static {
                        Covode.recordClassIndex(61107);
                    }

                    {
                        this.f96487a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        this.f96487a.$viewModel.f96651d.setValue(z.f158842a);
                    }
                });
            }
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            com.bytedance.tux.h.i.b(aVar2, null, valueOf, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 0.0f, system2.getDisplayMetrics()))), false, 21);
            aVar2.setVisibility(8);
            return z.f158842a;
        }
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            mVar.getLifecycle().b(this);
        }
    }
}
