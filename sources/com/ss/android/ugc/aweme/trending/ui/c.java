package com.ss.android.ugc.aweme.trending.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.ui.z;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.ss.android.ugc.aweme.feed.trending.TrendingCurChangeCallBack;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher;
import com.ss.android.ugc.aweme.trending.ui.list.a;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainState;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel;
import com.ss.android.ugc.aweme.utils.hh;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class c extends z implements View.OnClickListener, ar<com.ss.android.ugc.aweme.base.arch.i>, com.bytedance.jedi.arch.q {
    public static final b z = new b((byte) 0);
    private VerticalViewPager A;
    private final h.h B;
    private final h.h C;
    private final h.h D;
    private final h.h E;
    private final h.h F;
    private final h.h G;
    private SparseArray H;
    public com.ss.android.ugc.aweme.search.l q;
    public TrendingTitleSwitcher r;
    public com.ss.android.ugc.aweme.base.arch.i s = new com.ss.android.ugc.aweme.base.arch.i();
    public h.p<com.ss.android.ugc.aweme.search.l, Integer> t;
    public ArrayList<Aweme> u;
    public boolean v;
    final h.h w;
    public Boolean y;

    static {
        Covode.recordClassIndex(92120);
    }

    private final l.AnonymousClass1 C() {
        return (l.AnonymousClass1) this.D.getValue();
    }

    public final u<Boolean> B() {
        return (u) this.F.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public final View a(int i2) {
        if (this.H == null) {
            this.H = new SparseArray();
        }
        View view = (View) this.H.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.H.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public final void e() {
        SparseArray sparseArray = this.H;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final TrendingMainViewModel i() {
        return (TrendingMainViewModel) this.B.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final com.ss.android.ugc.aweme.trending.ui.list.a v() {
        return (com.ss.android.ugc.aweme.trending.ui.list.a) this.C.getValue();
    }

    public final com.bytedance.tux.sheet.sheet.a w() {
        return (com.bytedance.tux.sheet.sheet.a) this.E.getValue();
    }

    static final class b {
        static {
            Covode.recordClassIndex(92122);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.s;
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

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$c  reason: collision with other inner class name */
    static final class C3738c extends h.f.b.m implements h.f.a.a<u<Boolean>> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(92123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3738c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u<Boolean> invoke() {
            return new u(this) {
                /* class com.ss.android.ugc.aweme.trending.ui.c.C3738c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C3738c f141101a;

                static {
                    Covode.recordClassIndex(92124);
                }

                {
                    this.f141101a = r1;
                }

                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Object obj) {
                    if (h.f.b.l.a(obj, (Object) false) && !com.ss.android.ugc.aweme.trending.a.b()) {
                        new SafeHandler(this.f141101a.this$0).postDelayed(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.trending.ui.c.C3738c.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f141102a;

                            static {
                                Covode.recordClassIndex(92125);
                            }

                            {
                                this.f141102a = r1;
                            }

                            public final void run() {
                                c cVar = this.f141102a.f141101a.this$0;
                                if (cVar.ab_()) {
                                    LinearLayout linearLayout = (LinearLayout) cVar.a(R.id.er5);
                                    h.f.b.l.b(linearLayout, "");
                                    float width = (float) linearLayout.getWidth();
                                    LinearLayout linearLayout2 = (LinearLayout) cVar.a(R.id.er5);
                                    h.f.b.l.b(linearLayout2, "");
                                    float height = (float) linearLayout2.getHeight();
                                    if (width > height) {
                                        TuxTextView tuxTextView = (TuxTextView) cVar.a(R.id.er7);
                                        h.f.b.l.b(tuxTextView, "");
                                        float width2 = (float) tuxTextView.getWidth();
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                        ofFloat.addUpdateListener(new o(cVar, width2, width, height));
                                        ofFloat.addListener(new p(cVar, width2, width, height));
                                        ofFloat.setDuration(300L);
                                        ofFloat.start();
                                    }
                                }
                                com.ss.android.ugc.aweme.trending.a.a().storeInt("ever_next", 1);
                            }
                        }, TimeUnit.SECONDS.toMillis(1));
                    }
                }
            };
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<u<Boolean>> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(92126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u<Boolean> invoke() {
            return new u(this) {
                /* class com.ss.android.ugc.aweme.trending.ui.c.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f141103a;

                static {
                    Covode.recordClassIndex(92127);
                }

                {
                    this.f141103a = r1;
                }

                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Object obj) {
                    if (h.f.b.l.a(obj, (Object) false)) {
                        this.f141103a.this$0.y = true;
                    }
                }
            };
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(92136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new a.AbstractC3739a(this) {
                /* class com.ss.android.ugc.aweme.trending.ui.c.l.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ l f141109a;

                static {
                    Covode.recordClassIndex(92137);
                }

                @Override // com.ss.android.ugc.aweme.trending.ui.list.a.AbstractC3739a
                public final void a() {
                    this.f141109a.this$0.w().dismiss();
                    this.f141109a.this$0.A();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f141109a = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
                    if ((!h.f.b.l.a((java.lang.Object) r1, (java.lang.Object) r0.getTrendingId())) != false) goto L_0x002e;
                 */
                @Override // com.ss.android.ugc.aweme.trending.ui.list.a.AbstractC3739a
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(com.ss.android.ugc.aweme.search.l r10) {
                    /*
                    // Method dump skipped, instructions count: 319
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.ui.c.l.AnonymousClass1.a(com.ss.android.ugc.aweme.search.l):void");
                }

                @Override // com.ss.android.ugc.aweme.trending.ui.list.a.AbstractC3739a
                public final void a(boolean z, com.ss.android.ugc.aweme.search.l lVar) {
                    h.f.b.l.d(lVar, "");
                    if (z) {
                        int c2 = com.ss.android.ugc.aweme.trending.viewmodel.e.c(lVar.getEventId(), this.f141109a.this$0.i().m());
                        String l2 = this.f141109a.this$0.l();
                        Integer valueOf = Integer.valueOf(c2);
                        com.ss.android.ugc.aweme.feed.param.b bVar = this.f141109a.this$0.f79991j;
                        h.f.b.l.b(bVar, "");
                        h.f.b.l.d(bVar, "");
                        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("search_id", bVar.getSearchId()).a("search_keyword", bVar.getSearchKeyword()).a("search_result_id", bVar.getSearchResultId()).a("enter_from", l2).a("trending_topic", lVar.getTrendingName()).a("trending_topic_id", lVar.getEventId()).a("rank", valueOf);
                        if (hk.a(bVar.getIsFromTrendingCard())) {
                            a2.a("is_from_trending_card", bVar.getIsFromTrendingCard());
                        }
                        lVar.getTrendingName();
                        com.ss.android.ugc.aweme.common.r.a("trending_topic_show", a2.f66730a);
                        String str = this.f141109a.this$0.i().f141164c;
                        h.f.b.l.d(str, "");
                        if (h.f.b.l.a((Object) str, (Object) "click_fyp_trending_bar")) {
                            Map<String, String> extraMap = lVar.getExtraMap();
                            com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "trending_inflow_page").a("trending_entrance", "homepage_hot_trending_bar").a("trending_topic", lVar.getTrendingName()).a("trending_topic_id", lVar.getEventId());
                            String str2 = extraMap.get("trending_topic_source");
                            if (str2 == null) {
                                str2 = "";
                            }
                            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("trending_topic_source", str2);
                            String str3 = extraMap.get("topic_rank");
                            if (str3 == null) {
                                str3 = "";
                            }
                            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("topic_rank", str3);
                            String str4 = extraMap.get("topic_group_num");
                            if (str4 == null) {
                                str4 = "";
                            }
                            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("topic_group_num", str4);
                            h.f.b.l.b(a6, "");
                            com.ss.android.ugc.aweme.trending.d.b.a("trending_inflow_panel_topic_show", a6);
                        }
                    }
                }
            };
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<DialogInterface.OnDismissListener> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(92138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DialogInterface.OnDismissListener invoke() {
            return new DialogInterface.OnDismissListener(this) {
                /* class com.ss.android.ugc.aweme.trending.ui.c.m.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f141110a;

                static {
                    Covode.recordClassIndex(92139);
                }

                {
                    this.f141110a = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    if (!h.f.b.l.a((Object) this.f141110a.this$0.i().f141166e.getValue(), (Object) true)) {
                        this.f141110a.this$0.A();
                    }
                }
            };
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.trending.ui.list.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f141111a = new n();

        static {
            Covode.recordClassIndex(92140);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.trending.ui.list.a invoke() {
            return new com.ss.android.ugc.aweme.trending.ui.list.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.z
    public final com.ss.android.ugc.aweme.detail.h.b c() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.z
    public final JediViewModel<?> j() {
        return i();
    }

    private void D() {
        this.f79992k.a(new ag(64));
    }

    public final void A() {
        this.f79992k.a(new ag(65));
    }

    public final String l() {
        com.ss.android.ugc.aweme.detail.h.b bVar = this.f79992k;
        if (bVar != null) {
            return bVar.a_(true);
        }
        return null;
    }

    public final void y() {
        withState(i(), new s(this));
    }

    public final void x() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            h.f.b.l.b(activity, "");
            new com.bytedance.tux.g.b(activity).e(R.string.c6).b();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<TrendingMainViewModel> {
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(92121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_activityViewModel = fragment;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r0 = r3.$this_activityViewModel
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                h.f.b.l.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_trending_ui_TrendingDetailPageFragment$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.ui.c.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_trending_ui_TrendingDetailPageFragment$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<com.bytedance.tux.sheet.sheet.a> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(92144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.sheet.sheet.a invoke() {
            return new a.C1112a().a(this.this$0.v()).a(1).b(false).c().a((DialogInterface.OnDismissListener) this.this$0.w.getValue()).f45299a;
        }
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f141108a;

        static {
            Covode.recordClassIndex(92135);
        }

        k(c cVar) {
            this.f141108a = cVar;
        }

        public final void run() {
            LinearLayout linearLayout = (LinearLayout) this.f141108a.a(R.id.er5);
            h.f.b.l.b(linearLayout, "");
            LinearLayout linearLayout2 = (LinearLayout) this.f141108a.a(R.id.er5);
            h.f.b.l.b(linearLayout2, "");
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            LinearLayout linearLayout3 = (LinearLayout) this.f141108a.a(R.id.er5);
            h.f.b.l.b(linearLayout3, "");
            layoutParams.width = linearLayout3.getHeight();
            linearLayout.setLayoutParams(layoutParams);
            TuxTextView tuxTextView = (TuxTextView) this.f141108a.a(R.id.er7);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        }
    }

    public c() {
        h.k.c a2 = h.f.b.ab.a(TrendingMainViewModel.class);
        this.B = h.i.a((h.f.a.a) new a(this, a2, a2));
        this.u = new ArrayList<>();
        this.v = true;
        this.C = h.i.a((h.f.a.a) n.f141111a);
        this.D = h.i.a((h.f.a.a) new l(this));
        this.w = h.i.a((h.f.a.a) new m(this));
        this.E = h.i.a((h.f.a.a) new r(this));
        this.F = h.i.a((h.f.a.a) new C3738c(this));
        this.G = h.i.a((h.f.a.a) new d(this));
    }

    public final void z() {
        String str;
        androidx.fragment.app.i iVar;
        com.ss.android.ugc.aweme.search.l lVar;
        ArrayList<com.ss.android.ugc.aweme.search.l> m2 = i().m();
        Integer num = null;
        if ((!m2.isEmpty()) && m2 != null) {
            com.ss.android.ugc.aweme.trending.ui.list.a v2 = v();
            Aweme y2 = this.f79992k.y();
            if (y2 != null) {
                str = y2.getTrendingId();
            } else {
                str = null;
            }
            v2.a(m2, str, i().f141164c);
            v().a(C());
            com.bytedance.tux.sheet.sheet.a w2 = w();
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                iVar = activity.getSupportFragmentManager();
            } else {
                iVar = null;
            }
            w2.show(iVar, "TrendingDetailPageFrag");
            com.ss.android.ugc.aweme.trending.d.b.a(i().f141164c, this.q);
            com.ss.android.ugc.aweme.trending.d.b.a(i().f141164c);
            D();
            String l2 = l();
            h.p<com.ss.android.ugc.aweme.search.l, Integer> pVar = this.t;
            if (pVar != null) {
                lVar = pVar.getFirst();
            } else {
                lVar = null;
            }
            h.p<com.ss.android.ugc.aweme.search.l, Integer> pVar2 = this.t;
            if (pVar2 != null) {
                num = pVar2.getSecond();
            }
            com.ss.android.ugc.aweme.feed.param.b bVar = this.f79991j;
            h.f.b.l.b(bVar, "");
            com.ss.android.ugc.aweme.trending.d.b.a(l2, lVar, num, bVar);
        }
    }

    public static final class f implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f141104a;

        static {
            Covode.recordClassIndex(92129);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(c cVar) {
            this.f141104a = cVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            com.ss.android.ugc.aweme.search.l lVar;
            Aweme y = this.f141104a.f79992k.y();
            h.f.b.l.b(y, "");
            y.getTrendingId();
            c cVar = this.f141104a;
            Aweme y2 = cVar.f79992k.y();
            h.f.b.l.b(y2, "");
            cVar.t = com.ss.android.ugc.aweme.trending.viewmodel.e.a(y2.getTrendingId(), this.f141104a.i().m());
            c cVar2 = this.f141104a;
            h.p<com.ss.android.ugc.aweme.search.l, Integer> pVar = cVar2.t;
            if (pVar != null) {
                lVar = pVar.getFirst();
            } else {
                lVar = null;
            }
            cVar2.b(lVar);
            this.f141104a.y();
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            List<Aweme> list;
            String str;
            String str2;
            String str3;
            if (!com.ss.android.ugc.aweme.trending.a.c.a(this.f141104a.i().f141164c) && i2 == 1) {
                androidx.fragment.app.e activity = this.f141104a.getActivity();
                Aweme y = this.f141104a.f79992k.y();
                h.f.b.l.b(y, "");
                com.ss.android.ugc.aweme.detail.h.b bVar = this.f141104a.f79992k;
                h.f.b.l.b(bVar, "");
                String str4 = null;
                if (bVar.W == null || bVar.N == null) {
                    list = null;
                } else {
                    list = bVar.W.d();
                }
                h.f.b.l.b(list, "");
                h.f.b.l.d(y, "");
                h.f.b.l.d(list, "");
                new StringBuilder("checkNextAndPreAweme() called with: aweme = [").append(y.getDesc()).append("], awemeList = [").append(list).append(']');
                int indexOf = list.indexOf(y);
                String trendingId = y.getTrendingId();
                if (indexOf >= 0) {
                    int i3 = indexOf + 1;
                    if (list.size() > i3) {
                        Aweme aweme = list.get(i3);
                        if (aweme != null) {
                            aweme.getAid();
                            aweme.getDesc();
                            aweme.getTrendingId();
                            str2 = aweme.getTrendingId();
                        } else {
                            str2 = null;
                        }
                        TextUtils.equals(str2, trendingId);
                        if (aweme != null) {
                            str3 = aweme.getTrendingId();
                        } else {
                            str3 = null;
                        }
                        if (!TextUtils.equals(str3, trendingId)) {
                            TrendingCurChangeCallBack.a.a(activity, aweme, true);
                        } else {
                            TrendingCurChangeCallBack.a.a(activity, aweme, false);
                        }
                    }
                    if (indexOf > 0) {
                        Aweme aweme2 = list.get(indexOf - 1);
                        if (aweme2 != null) {
                            aweme2.getAid();
                            aweme2.getDesc();
                            aweme2.getTrendingId();
                            str = aweme2.getTrendingId();
                        } else {
                            str = null;
                        }
                        TextUtils.equals(str, trendingId);
                        if (aweme2 != null) {
                            str4 = aweme2.getTrendingId();
                        }
                        if (!TextUtils.equals(str4, trendingId)) {
                            TrendingCurChangeCallBack.a.a(activity, aweme2, true);
                        } else {
                            TrendingCurChangeCallBack.a.a(activity, aweme2, false);
                        }
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            if (f2 == 0.0f && i3 == 0) {
                Aweme y = this.f141104a.f79992k.y();
                h.f.b.l.b(y, "");
                y.getAid();
                Aweme y2 = this.f141104a.f79992k.y();
                h.f.b.l.b(y2, "");
                y2.getDesc();
                if (i2 != 0) {
                    return;
                }
                if (h.f.b.l.a((Object) this.f141104a.y, (Object) true)) {
                    onPageSelected(i2);
                    if (!com.ss.android.ugc.aweme.trending.a.c.a(this.f141104a.i().f141164c)) {
                        com.ss.android.ugc.aweme.detail.h.b bVar = this.f141104a.f79992k;
                        h.f.b.l.b(bVar, "");
                        aj bf = bVar.bf();
                        if (bf != null) {
                            bf.f();
                        }
                        Aweme y3 = this.f141104a.f79992k.y();
                        if (y3 != null) {
                            y3.getAid();
                        }
                        Aweme y4 = this.f141104a.f79992k.y();
                        if (y4 != null) {
                            y4.getDesc();
                        }
                    }
                    this.f141104a.y = null;
                    return;
                }
                c cVar = this.f141104a;
                Aweme y5 = cVar.f79992k.y();
                h.f.b.l.b(y5, "");
                cVar.t = com.ss.android.ugc.aweme.trending.viewmodel.e.a(y5.getTrendingId(), this.f141104a.i().m());
            }
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f141107a;

        static {
            Covode.recordClassIndex(92134);
        }

        j(c cVar) {
            this.f141107a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f141107a.t();
            this.f141107a.i().f141165d = true;
        }
    }

    public static final class p extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f141116a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f141117b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f141118c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f141119d;

        static {
            Covode.recordClassIndex(92142);
        }

        public final void onAnimationEnd(Animator animator) {
            TuxTextView tuxTextView = (TuxTextView) this.f141116a.a(R.id.er7);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        }

        p(c cVar, float f2, float f3, float f4) {
            this.f141116a = cVar;
            this.f141117b = f2;
            this.f141118c = f3;
            this.f141119d = f4;
        }
    }

    public final void a(com.ss.android.ugc.aweme.search.l lVar) {
        i().f141166e.setValue(true);
        i().b(lVar);
        n();
    }

    static final class g implements AwemeChangeCallBack.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f141105a;

        static {
            Covode.recordClassIndex(92130);
        }

        g(c cVar) {
            this.f141105a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
        public final void a(Aweme aweme) {
            com.ss.android.ugc.aweme.search.l lVar;
            Aweme y = this.f141105a.f79992k.y();
            if (y != null) {
                y.getAid();
            }
            Aweme y2 = this.f141105a.f79992k.y();
            if (y2 != null) {
                y2.getDesc();
            }
            c cVar = this.f141105a;
            h.p<com.ss.android.ugc.aweme.search.l, Integer> pVar = cVar.t;
            if (pVar != null) {
                lVar = pVar.getFirst();
            } else {
                lVar = null;
            }
            cVar.b(lVar);
            this.f141105a.y();
        }
    }

    static final class o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f141112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f141113b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f141114c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f141115d;

        static {
            Covode.recordClassIndex(92141);
        }

        o(c cVar, float f2, float f3, float f4) {
            this.f141112a = cVar;
            this.f141113b = f2;
            this.f141114c = f3;
            this.f141115d = f4;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (!(animatedValue instanceof Float)) {
                animatedValue = null;
            }
            Float f2 = (Float) animatedValue;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                TuxTextView tuxTextView = (TuxTextView) this.f141112a.a(R.id.er7);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setAlpha(floatValue);
                TuxTextView tuxTextView2 = (TuxTextView) this.f141112a.a(R.id.er7);
                h.f.b.l.b(tuxTextView2, "");
                TuxTextView tuxTextView3 = (TuxTextView) this.f141112a.a(R.id.er7);
                h.f.b.l.b(tuxTextView3, "");
                ViewGroup.LayoutParams layoutParams = tuxTextView3.getLayoutParams();
                layoutParams.width = (int) (this.f141113b * floatValue);
                tuxTextView2.setLayoutParams(layoutParams);
                float f3 = this.f141114c;
                float f4 = this.f141115d;
                float f5 = ((f3 - f4) * floatValue) + f4;
                LinearLayout linearLayout = (LinearLayout) this.f141112a.a(R.id.er5);
                h.f.b.l.b(linearLayout, "");
                LinearLayout linearLayout2 = (LinearLayout) this.f141112a.a(R.id.er5);
                h.f.b.l.b(linearLayout2, "");
                ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                layoutParams2.width = (int) f5;
                layoutParams2.height = (int) this.f141115d;
                linearLayout.setLayoutParams(layoutParams2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.b<TrendingMainState, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(92145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TrendingMainState trendingMainState) {
            int i2;
            TrendingMainState trendingMainState2 = trendingMainState;
            h.f.b.l.d(trendingMainState2, "");
            ArrayList<com.ss.android.ugc.aweme.search.l> trendingList = trendingMainState2.getTrendingList();
            boolean z = false;
            if (trendingList != null && !trendingList.isEmpty()) {
                Aweme y = this.this$0.f79992k.y();
                h.f.b.l.b(y, "");
                String trendingId = y.getTrendingId();
                if (trendingId == null) {
                    trendingId = "";
                }
                com.ss.android.ugc.aweme.search.l d2 = com.ss.android.ugc.aweme.trending.viewmodel.e.d(trendingId, trendingMainState2.getTrendingList());
                Aweme y2 = this.this$0.f79992k.y();
                h.f.b.l.b(y2, "");
                y2.getTrendingId();
                String.valueOf(d2);
                if (d2 != null) {
                    z = true;
                }
                androidx.fragment.app.e activity = this.this$0.getActivity();
                if (activity != null) {
                    LinearLayout linearLayout = (LinearLayout) this.this$0.a(R.id.er5);
                    h.f.b.l.b(linearLayout, "");
                    linearLayout.setActivated(z);
                    if (z) {
                        i2 = R.color.a9;
                    } else {
                        i2 = R.color.ad;
                    }
                    int c2 = androidx.core.content.b.c(activity, i2);
                    ((TuxIconView) this.this$0.a(R.id.er6)).setTintColor(c2);
                    ((TuxTextView) this.this$0.a(R.id.er7)).setTextColor(c2);
                }
            }
            return h.z.f158842a;
        }
    }

    public final void b(com.ss.android.ugc.aweme.search.l lVar) {
        if (lVar != null) {
            i().a(lVar);
            TuxTextView tuxTextView = (TuxTextView) a(R.id.er4);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setText(lVar.getTrendingName());
            if (TextUtils.isEmpty(lVar.getRankText())) {
                TuxTextView tuxTextView2 = (TuxTextView) a(R.id.er8);
                h.f.b.l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
            } else {
                TuxTextView tuxTextView3 = (TuxTextView) a(R.id.er8);
                h.f.b.l.b(tuxTextView3, "");
                tuxTextView3.setVisibility(0);
                TuxTextView tuxTextView4 = (TuxTextView) a(R.id.er8);
                h.f.b.l.b(tuxTextView4, "");
                tuxTextView4.setText(lVar.getRankText());
            }
        } else {
            TuxTextView tuxTextView5 = (TuxTextView) a(R.id.er8);
            h.f.b.l.b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
            TuxTextView tuxTextView6 = (TuxTextView) a(R.id.er4);
            h.f.b.l.b(tuxTextView6, "");
            com.ss.android.ugc.aweme.feed.param.b bVar = this.f79991j;
            h.f.b.l.b(bVar, "");
            tuxTextView6.setText(bVar.getTrendingName());
        }
        StringBuilder sb = new StringBuilder("bindTrendingTitle trending name ");
        TuxTextView tuxTextView7 = (TuxTextView) a(R.id.er4);
        h.f.b.l.b(tuxTextView7, "");
        sb.append(tuxTextView7.getText()).append(" trending:").append(String.valueOf(lVar));
    }

    static final class e extends h.f.b.m implements h.f.a.b<TrendingMainState, h.z> {
        final /* synthetic */ boolean $isLast;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(92128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, boolean z) {
            super(1);
            this.this$0 = cVar;
            this.$isLast = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TrendingMainState trendingMainState) {
            String str;
            String str2;
            Map<String, String> map;
            String str3;
            String str4;
            TrendingMainState trendingMainState2 = trendingMainState;
            h.f.b.l.d(trendingMainState2, "");
            com.ss.android.ugc.aweme.search.l curTrending = trendingMainState2.getCurTrending();
            if (curTrending == null || (str = curTrending.getEventId()) == null) {
                str = "";
            }
            com.ss.android.ugc.aweme.search.l d2 = com.ss.android.ugc.aweme.trending.viewmodel.e.d(str, trendingMainState2.getTrendingList());
            if (this.$isLast) {
                str2 = "grey";
            } else if (!com.ss.android.ugc.aweme.trending.a.b()) {
                str2 = "instruction";
            } else {
                str2 = "arrow";
            }
            String str5 = this.this$0.i().f141164c;
            Aweme y = this.this$0.f79992k.y();
            h.f.b.l.d(str5, "");
            h.f.b.l.d(str2, "");
            if (!(!h.f.b.l.a((Object) str5, (Object) "click_fyp_trending_bar") || y == null || y.getTrendingBarFYP() == null)) {
                AwemeTrendingBar trendingBarFYP = y.getTrendingBarFYP();
                Map<String, String> trackMap = trendingBarFYP.getTrackMap();
                if (d2 == null || (map = d2.getExtraMap()) == null) {
                    map = new ArrayMap<>();
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "trending_inflow_page").a("button_type", str2).a("trending_entrance", "homepage_hot_trending_bar").a("from_trending_topic", trendingBarFYP.getEventKeyword()).a("from_trending_topic_id", String.valueOf(trendingBarFYP.getEventKeywordId()));
                String str6 = trackMap.get("trending_topic_source");
                if (str6 == null) {
                    str6 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("from_trending_topic_source", str6);
                String str7 = trackMap.get("topic_rank");
                if (str7 == null) {
                    str7 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("from_topic_rank", str7);
                String str8 = trackMap.get("topic_group_num");
                if (str8 == null) {
                    str8 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("from_topic_group_num", str8).a("is_end_topic", h.f.b.l.a(str2, "last") ? 1 : 0);
                if (d2 == null || (str3 = d2.getTrendingName()) == null) {
                    str3 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a6 = a5.a("to_trending_topic", str3);
                if (d2 == null || (str4 = d2.getEventId()) == null) {
                    str4 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a7 = a6.a("to_trending_topic_id", str4);
                String str9 = map.get("trending_topic_source");
                if (str9 == null) {
                    str9 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a8 = a7.a("to_trending_topic_source", str9);
                String str10 = map.get("topic_rank");
                if (str10 == null) {
                    str10 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a9 = a8.a("to_topic_rank", str10);
                String str11 = map.get("topic_group_num");
                if (str11 == null) {
                    str11 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a10 = a9.a("to_topic_group_num", str11);
                h.f.b.l.b(a10, "");
                com.ss.android.ugc.aweme.trending.d.b.a("trending_inflow_change_click", a10);
            }
            if (d2 != null) {
                this.this$0.a(d2);
                if (!com.ss.android.ugc.aweme.trending.a.b()) {
                    com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> cVar = this.this$0.i().f141166e;
                    c cVar2 = this.this$0;
                    cVar.observe(cVar2, cVar2.B());
                } else {
                    this.this$0.i().f141166e.removeObserver(this.this$0.B());
                }
            }
            return h.z.f158842a;
        }
    }

    public final void onClick(View view) {
        Integer valueOf;
        com.ss.android.ugc.aweme.search.l lVar;
        Integer num;
        String str;
        ClickAgent.onClick(view);
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            String str2 = null;
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.eqz) {
                    z();
                } else if (valueOf.intValue() == R.id.er5) {
                    h.p<com.ss.android.ugc.aweme.search.l, Integer> pVar = this.t;
                    boolean z2 = true;
                    if (pVar == null || pVar.getSecond().intValue() != i().m().size() - 1) {
                        z2 = false;
                    }
                    String l2 = l();
                    h.p<com.ss.android.ugc.aweme.search.l, Integer> pVar2 = this.t;
                    if (pVar2 != null) {
                        lVar = pVar2.getFirst();
                    } else {
                        lVar = null;
                    }
                    h.p<com.ss.android.ugc.aweme.search.l, Integer> pVar3 = this.t;
                    if (pVar3 != null) {
                        num = pVar3.getSecond();
                    } else {
                        num = null;
                    }
                    com.ss.android.ugc.aweme.feed.param.b bVar = this.f79991j;
                    h.f.b.l.b(bVar, "");
                    h.f.b.l.d(bVar, "");
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("search_id", bVar.getSearchId()).a("search_keyword", bVar.getSearchKeyword()).a("search_result_id", bVar.getSearchResultId()).a("enter_from", l2);
                    if (lVar != null) {
                        str = lVar.getTrendingName();
                    } else {
                        str = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a("trending_topic", str);
                    if (lVar != null) {
                        str2 = lVar.getEventId();
                    }
                    com.ss.android.ugc.aweme.app.f.d a4 = a3.a("trending_topic_id", str2).a("rank", num);
                    int i2 = z2 ? 1 : 0;
                    int i3 = z2 ? 1 : 0;
                    int i4 = z2 ? 1 : 0;
                    com.ss.android.ugc.aweme.app.f.d a5 = a4.a("is_end_topic", i2);
                    if (hk.a(bVar.getIsFromTrendingCard())) {
                        a5.a("is_from_trending_card", bVar.getIsFromTrendingCard());
                    }
                    com.ss.android.ugc.aweme.common.r.a("trending_change_click", a5.f66730a);
                    LinearLayout linearLayout = (LinearLayout) a(R.id.er5);
                    h.f.b.l.b(linearLayout, "");
                    if (!linearLayout.isActivated()) {
                        new com.bytedance.tux.g.b(this).e(R.string.gkg).b();
                    } else {
                        withState(i(), new e(this, z2));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(92132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.x();
                this.this$0.i().c(TrendingMainViewModel.e.f141176a);
                if (this.this$0.f79992k.y() == null) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.trending.ui.c.i.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ i f141106a;

                        static {
                            Covode.recordClassIndex(92133);
                        }

                        {
                            this.f141106a = r1;
                        }

                        public final void run() {
                            if (this.f141106a.this$0.isVisible() && !this.f141106a.this$0.v().isVisible()) {
                                this.f141106a.this$0.z();
                            }
                        }
                    }, 3100);
                } else {
                    this.this$0.A();
                }
            }
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, ArrayList<com.ss.android.ugc.aweme.search.l>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(92131);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, ArrayList<com.ss.android.ugc.aweme.search.l> arrayList) {
            androidx.lifecycle.i lifecycle;
            com.ss.android.ugc.aweme.search.l lVar;
            MethodCollector.i(11488);
            ArrayList<com.ss.android.ugc.aweme.search.l> arrayList2 = arrayList;
            h.f.b.l.d(iVar, "");
            if (arrayList2 != null) {
                Integer.valueOf(arrayList2.size());
            }
            if (!(arrayList2 == null || this.this$0.f79992k.y() == null || !(!arrayList2.isEmpty()))) {
                Aweme y = this.this$0.f79992k.y();
                h.f.b.l.b(y, "");
                y.getTrendingId();
                if ((!h.f.b.l.a((Object) this.this$0.i().f141164c, (Object) "click_fyp_trending_bar")) && this.this$0.v) {
                    com.ss.android.ugc.aweme.feed.param.b bVar = this.this$0.f79991j;
                    h.f.b.l.b(bVar, "");
                    String trendingEventId = bVar.getTrendingEventId();
                    Aweme y2 = this.this$0.f79992k.y();
                    h.f.b.l.b(y2, "");
                    if (!trendingEventId.equals(y2.getTrendingId()) && this.this$0.u.isEmpty()) {
                        this.this$0.x();
                    }
                    this.this$0.v = false;
                }
                c cVar = this.this$0;
                Aweme y3 = cVar.f79992k.y();
                h.f.b.l.b(y3, "");
                cVar.t = com.ss.android.ugc.aweme.trending.viewmodel.e.a(y3.getTrendingId(), arrayList2);
                c cVar2 = this.this$0;
                h.p<com.ss.android.ugc.aweme.search.l, Integer> pVar = cVar2.t;
                if (pVar != null) {
                    lVar = pVar.getFirst();
                } else {
                    lVar = null;
                }
                cVar2.b(lVar);
                this.this$0.y();
            }
            c cVar3 = this.this$0;
            if (arrayList2 != null && !arrayList2.isEmpty() && cVar3.r == null) {
                TextSwitcher textSwitcher = (TextSwitcher) cVar3.a(R.id.er0);
                h.f.b.l.b(textSwitcher, "");
                cVar3.r = new TrendingTitleSwitcher(textSwitcher, cVar3.getActivity(), arrayList2, new q(cVar3, arrayList2));
                TrendingTitleSwitcher trendingTitleSwitcher = cVar3.r;
                if (trendingTitleSwitcher == null) {
                    h.f.b.l.a("trendingSwitcher");
                }
                if (!trendingTitleSwitcher.f141094d.isEmpty()) {
                    TextSwitcher textSwitcher2 = trendingTitleSwitcher.f141092b;
                    Animation loadAnimation = AnimationUtils.loadAnimation(textSwitcher2.getContext(), R.anim.dm);
                    loadAnimation.setDuration(450);
                    textSwitcher2.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(textSwitcher2.getContext(), R.anim.dz);
                    loadAnimation2.setDuration(450);
                    textSwitcher2.setOutAnimation(loadAnimation2);
                    textSwitcher2.setFactory(new TrendingTitleSwitcher.d(trendingTitleSwitcher));
                    trendingTitleSwitcher.a(0, false);
                    trendingTitleSwitcher.f141091a = 0;
                    androidx.lifecycle.m mVar = trendingTitleSwitcher.f141093c;
                    if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
                        lifecycle.a(trendingTitleSwitcher);
                    }
                    trendingTitleSwitcher.a().a();
                }
            }
            h.z zVar = h.z.f158842a;
            MethodCollector.o(11488);
            return zVar;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<String, Integer, h.z> {
        final /* synthetic */ List $list;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(92143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(c cVar, List list) {
            super(2);
            this.this$0 = cVar;
            this.$list = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, Integer num) {
            String str2 = str;
            int intValue = num.intValue();
            h.f.b.l.d(str2, "");
            String l2 = this.this$0.l();
            com.ss.android.ugc.aweme.feed.param.b bVar = this.this$0.f79991j;
            h.f.b.l.b(bVar, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(bVar, "");
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("search_id", bVar.getSearchId()).a("search_keyword", bVar.getSearchKeyword()).a("search_result_id", bVar.getSearchResultId()).a("search_position", l2).a("words_content", str2).a("words_source", "trending_page_click_more").a("words_position", intValue);
            if (hk.a(bVar.getIsFromTrendingCard())) {
                a2.a("is_from_trending_card", bVar.getIsFromTrendingCard());
            }
            com.ss.android.ugc.aweme.common.r.a("trending_words_show", a2.f66730a);
            if (intValue < this.$list.size() && intValue >= 0) {
                String str3 = this.this$0.i().f141164c;
                com.ss.android.ugc.aweme.search.l lVar = (com.ss.android.ugc.aweme.search.l) this.$list.get(intValue);
                h.f.b.l.d(str3, "");
                h.f.b.l.d(lVar, "");
                if (h.f.b.l.a((Object) str3, (Object) "click_fyp_trending_bar")) {
                    Map<String, String> extraMap = lVar.getExtraMap();
                    com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "trending_inflow_page").a("trending_entrance", "homepage_hot_trending_bar").a("trending_topic", lVar.getTrendingName()).a("trending_topic_id", lVar.getEventId());
                    String str4 = extraMap.get("trending_topic_source");
                    if (str4 == null) {
                        str4 = "";
                    }
                    com.ss.android.ugc.aweme.app.f.d a4 = a3.a("trending_topic_source", str4);
                    String str5 = extraMap.get("topic_rank");
                    if (str5 == null) {
                        str5 = "";
                    }
                    com.ss.android.ugc.aweme.app.f.d a5 = a4.a("topic_rank", str5);
                    String str6 = extraMap.get("topic_group_num");
                    if (str6 == null) {
                        str6 = "";
                    }
                    com.ss.android.ugc.aweme.app.f.d a6 = a5.a("topic_group_num", str6);
                    h.f.b.l.b(a6, "");
                    com.ss.android.ugc.aweme.trending.d.b.a("trending_inflow_topic_show", a6);
                }
                this.this$0.q = (com.ss.android.ugc.aweme.search.l) this.$list.get(intValue);
            }
            return h.z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v54, resolved type: java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z
    public final void onViewCreated(View view, Bundle bundle) {
        List items;
        h.f.b.l.d(view, "");
        TrendingMainViewModel i2 = i();
        com.ss.android.ugc.aweme.feed.param.b bVar = this.f79991j;
        h.f.b.l.b(bVar, "");
        h.f.b.l.d(bVar, "");
        i2.f141170l = bVar;
        com.ss.android.ugc.aweme.search.l lVar = new com.ss.android.ugc.aweme.search.l();
        com.ss.android.ugc.aweme.feed.param.b bVar2 = this.f79991j;
        h.f.b.l.b(bVar2, "");
        lVar.setTrendingName(bVar2.getTrendingName());
        com.ss.android.ugc.aweme.feed.param.b bVar3 = this.f79991j;
        h.f.b.l.b(bVar3, "");
        lVar.setEventId(bVar3.getTrendingEventId());
        TuxTextView tuxTextView = (TuxTextView) a(R.id.er4);
        h.f.b.l.b(tuxTextView, "");
        com.ss.android.ugc.aweme.feed.param.b bVar4 = this.f79991j;
        h.f.b.l.b(bVar4, "");
        tuxTextView.setText(bVar4.getTrendingName());
        i().a(lVar);
        i().b(lVar);
        View findViewById = view.findViewById(R.id.fk_);
        h.f.b.l.b(findViewById, "");
        this.A = (VerticalViewPager) findViewById;
        com.ss.android.ugc.aweme.common.e.a aVar = com.ss.android.ugc.aweme.feed.x.ae.f95296a;
        if (!(aVar == null || (items = aVar.getItems()) == null)) {
            for (Object obj : items) {
                if (obj instanceof Aweme) {
                    Aweme aweme = (Aweme) obj;
                    com.ss.android.ugc.aweme.feed.param.b bVar5 = this.f79991j;
                    h.f.b.l.b(bVar5, "");
                    aweme.setTrendingId(bVar5.getTrendingEventId());
                    com.ss.android.ugc.aweme.feed.param.b bVar6 = this.f79991j;
                    h.f.b.l.b(bVar6, "");
                    aweme.setTrendingName(bVar6.getTrendingName());
                    com.ss.android.ugc.aweme.feed.param.b bVar7 = this.f79991j;
                    h.f.b.l.b(bVar7, "");
                    aweme.setFromTrendingCard(bVar7.getIsFromTrendingCard());
                    this.u.add(obj);
                }
            }
        }
        if (this.u.size() > 0) {
            TrendingMainViewModel i3 = i();
            ArrayList<Aweme> arrayList = this.u;
            h.f.b.l.d(arrayList, "");
            i3.c(new TrendingMainViewModel.g(arrayList));
        }
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.eqx);
        h.f.b.l.b(constraintLayout, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = hh.b();
        if (com.ss.android.ugc.aweme.trending.a.b()) {
            ((LinearLayout) a(R.id.er5)).post(new k(this));
        }
        com.bytedance.ies.dmt.ui.f.c.a(a(R.id.eqz), 0.5f);
        com.bytedance.ies.dmt.ui.f.c.a(a(R.id.er5), 0.5f);
        ((LinearLayout) a(R.id.eqz)).setOnClickListener(this);
        ((LinearLayout) a(R.id.er5)).setOnClickListener(this);
        i().f141166e.observe(this, (u) this.G.getValue());
        n();
        this.u.size();
        VerticalViewPager verticalViewPager = this.A;
        if (verticalViewPager == null) {
            h.f.b.l.a("mViewPager");
        }
        verticalViewPager.a(new f(this));
        AwemeChangeCallBack.a(getActivity(), this, new g(this));
        f.a.b.b unused = selectSubscribe(i(), d.f141120a, new ah(), new h(this));
        if (com.ss.android.ugc.aweme.trending.a.c.a(i().f141164c)) {
            VerticalViewPager verticalViewPager2 = this.A;
            if (verticalViewPager2 == null) {
                h.f.b.l.a("mViewPager");
            }
            com.ss.android.ugc.aweme.trending.b.a aVar2 = new com.ss.android.ugc.aweme.trending.b.a(verticalViewPager2, i(), this);
            VerticalViewPager verticalViewPager3 = this.A;
            if (verticalViewPager3 == null) {
                h.f.b.l.a("mViewPager");
            }
            verticalViewPager3.a(false, (ViewPager.f) aVar2);
        }
        f.a.b.b unused2 = selectSubscribe(i(), e.f141121a, new ah(), new i(this));
        View view2 = this.f79988c;
        if (view2 != null) {
            view2.setOnClickListener(new j(this));
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z, com.ss.android.ugc.b.a.a.a
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b51, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
