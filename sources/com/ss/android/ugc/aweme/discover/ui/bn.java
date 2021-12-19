package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.a.a;
import com.bytedance.jedi.ext.adapter.extension.b;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.h.c;
import com.ss.android.ugc.aweme.discover.DiscoveryServiceImpl;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import com.ss.android.ugc.aweme.discover.helper.d;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout;
import com.ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.gj;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

public final class bn extends l implements com.ss.android.ugc.aweme.discover.c.b, com.ss.android.ugc.aweme.discover.tooltip.a, com.ss.android.ugc.aweme.discover.tooltip.b, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final b s = new b((byte) 0);
    private final com.ss.android.ugc.aweme.discover.tooltip.b A;
    private final h.h B;
    private final h.h C;
    private SparseArray D;

    /* renamed from: c  reason: collision with root package name */
    int f82461c = 1;

    /* renamed from: d  reason: collision with root package name */
    public int f82462d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<String> f82463e = new LinkedHashSet();

    /* renamed from: j  reason: collision with root package name */
    public boolean f82464j = true;

    /* renamed from: k  reason: collision with root package name */
    public final Map<h.k.c<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> f82465k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f82466l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.k.a f82467m;
    com.ss.android.ugc.aweme.discover.helper.q n;
    public com.ss.android.ugc.aweme.discover.adapter.j o;
    public o p;
    public Boolean q;
    public com.ss.android.ugc.aweme.discover.helper.d r;
    private final int t = R.string.b92;
    private final String u = "top_trends";
    private MainAnimViewModel v;
    private SearchStateViewModel w;
    private final Set<String> y = new LinkedHashSet();
    private final com.ss.android.ugc.aweme.discover.tooltip.a z;

    static {
        Covode.recordClassIndex(51330);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b, com.ss.android.ugc.aweme.discover.ui.l
    public final View a(int i2) {
        if (this.D == null) {
            this.D = new SparseArray();
        }
        View view = (View) this.D.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.D.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b, com.ss.android.ugc.aweme.discover.ui.l
    public final void a() {
        SparseArray sparseArray = this.D;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final TrendsTabViewModel e() {
        return (TrendsTabViewModel) this.B.getValue();
    }

    public final RecyclerView.RecycledViewPool g() {
        return (RecyclerView.RecycledViewPool) this.C.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new org.greenrobot.eventbus.g(bn.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(51332);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.l
    public final int b() {
        return this.t;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.l
    public final String c() {
        return this.u;
    }

    @Override // com.ss.android.ugc.aweme.discover.tooltip.a
    public final void aV_() {
        this.z.aV_();
    }

    @Override // com.ss.android.ugc.aweme.discover.tooltip.b
    public final void l() {
        this.A.l();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        gj.f143017a = "TrendsTabFragment";
    }

    private static boolean i() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<s> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f82489a = new y();

        static {
            Covode.recordClassIndex(51361);
        }

        y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ s invoke() {
            if (!com.ss.android.ugc.aweme.discover.f.e.a()) {
                return null;
            }
            s sVar = new s();
            sVar.setMaxRecycledViews(0, com.ss.android.ugc.aweme.discover.f.e.b());
            return sVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        Analysis labelName = new Analysis().setLabelName("discovery_trends");
        h.f.b.l.b(labelName, "");
        return labelName;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        new Handler(Looper.getMainLooper()).removeCallbacksAndMessages(null);
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f82468a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.adapter.c f82469b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Handler f82470c;

        static {
            Covode.recordClassIndex(51333);
        }

        c(bn bnVar, com.ss.android.ugc.aweme.discover.adapter.c cVar, Handler handler) {
            this.f82468a = bnVar;
            this.f82469b = cVar;
            this.f82470c = handler;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int b2 = com.ss.android.ugc.aweme.discover.f.e.b();
            if (b2 >= 0) {
                int i2 = 0;
                while (true) {
                    final RecyclerView.ViewHolder createViewHolder = this.f82469b.createViewHolder((ViewGroup) this.f82468a.a(R.id.cbi), 0);
                    h.f.b.l.b(createViewHolder, "");
                    this.f82470c.post(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.discover.ui.bn.c.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ c f82471a;

                        static {
                            Covode.recordClassIndex(51334);
                        }

                        {
                            this.f82471a = r1;
                        }

                        public final void run() {
                            RecyclerView.RecycledViewPool g2 = this.f82471a.f82468a.g();
                            if (g2 != null) {
                                g2.putRecycledView(createViewHolder);
                            }
                        }
                    });
                    if (i2 == b2) {
                        break;
                    }
                    i2++;
                }
            }
            return z.f158842a;
        }
    }

    static final class t implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f82485a;

        static {
            Covode.recordClassIndex(51355);
        }

        t(bn bnVar) {
            this.f82485a = bnVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
            if (r1.isEnabled() == false) goto L_0x001e;
         */
        @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.discover.ui.bn r0 = r2.f82485a
                r1 = 2131362673(0x7f0a0371, float:1.8345133E38)
                android.view.View r0 = r0.a(r1)
                if (r0 == 0) goto L_0x001e
                com.ss.android.ugc.aweme.discover.ui.bn r0 = r2.f82485a
                android.view.View r1 = r0.a(r1)
                com.ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout r1 = (com.ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout) r1
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                boolean r0 = r1.isEnabled()
                if (r0 != 0) goto L_0x0034
            L_0x001e:
                com.ss.android.ugc.aweme.discover.ui.bn r0 = r2.f82485a
                com.ss.android.ugc.aweme.commercialize.k.a r0 = r0.f82467m
                if (r0 == 0) goto L_0x0033
                com.ss.android.ugc.aweme.discover.ui.bn r0 = r2.f82485a
                com.ss.android.ugc.aweme.commercialize.k.a r0 = r0.f82467m
                if (r0 != 0) goto L_0x002d
                h.f.b.l.b()
            L_0x002d:
                boolean r0 = r0.isEnabled()
                if (r0 != 0) goto L_0x0034
            L_0x0033:
                return
            L_0x0034:
                com.ss.android.ugc.aweme.discover.ui.bn r0 = r2.f82485a
                r0.h()
                goto L_0x0033
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.bn.t.a():void");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b, com.ss.android.ugc.aweme.discover.ui.l
    public final void onDestroyView() {
        e().b(true);
        RecyclerView recyclerView = (RecyclerView) a(R.id.cbi);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setAdapter(null);
        super.onDestroyView();
        a();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.ss.android.ugc.aweme.app.s sVar = s.a.f66880a;
        h.f.b.l.b(sVar, "");
        if (sVar.f66869c == null) {
            sVar.f66869c = new aj<>("should_show_pull_strong_guide", (Boolean) true);
        }
        aj<Boolean> ajVar = sVar.f66869c;
        h.f.b.l.b(ajVar, "");
        ajVar.b(false);
        gj.f143017a = null;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<TrendsTabViewModel> {
        final /* synthetic */ Fragment $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(51331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = fragment;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel invoke() {
            /*
                r4 = this;
                androidx.fragment.app.Fragment r0 = r4.$this_hostViewModel
                androidx.fragment.app.Fragment r3 = r0.getParentFragment()
                h.k.c r0 = r4.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r2 = r0.getName()
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
            L_0x0015:
                if (r3 == 0) goto L_0x0031
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r3, r0)     // Catch:{ as -> 0x002a }
                h.k.c r0 = r4.$viewModelClass     // Catch:{ as -> 0x002a }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_discover_ui_TrendsTabFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)     // Catch:{ as -> 0x002a }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x002a }
                goto L_0x002f
            L_0x002a:
                androidx.fragment.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0015
            L_0x002f:
                if (r0 != 0) goto L_0x0049
            L_0x0031:
                androidx.fragment.app.Fragment r0 = r4.$this_hostViewModel
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r4.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_discover_ui_TrendsTabFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.bn.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_discover_ui_TrendsTabFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final void h() {
        getContext();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = i();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.x3);
            h.f.b.l.b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            if (!this.f82466l) {
                ((DmtStatusView) a(R.id.e_o)).h();
            }
        } else if (this.f82466l) {
            e().a(false);
        } else {
            ((DmtStatusView) a(R.id.e_o)).f();
            e().a(true);
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f82473a;

        static {
            Covode.recordClassIndex(51335);
        }

        d(bn bnVar) {
            this.f82473a = bnVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            View a2 = com.a.a(LayoutInflater.from(this.f82473a.getContext()), R.layout.xx, (ViewGroup) this.f82473a.a(R.id.cbi), false);
            bn bnVar = this.f82473a;
            if (a2 == null) {
                h.f.b.l.b();
            }
            DiscoverBannerViewHolder discoverBannerViewHolder = new DiscoverBannerViewHolder(bnVar, a2);
            Map<h.k.c<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> map = this.f82473a.f82465k;
            h.k.c<? extends RecyclerView.ViewHolder> a3 = h.f.b.ab.a(DiscoverBannerViewHolder.class);
            LinkedList linkedList = new LinkedList();
            linkedList.offer(discoverBannerViewHolder);
            map.put(a3, linkedList);
            this.f82473a.a(a2);
            this.f82473a.o = discoverBannerViewHolder;
            if (this.f82473a.p == null) {
                this.f82473a.p = new o(this.f82473a.getActivity(), this.f82473a.o);
            }
            int i2 = 0;
            do {
                View a4 = com.a.a(LayoutInflater.from(this.f82473a.getContext()), R.layout.xy, (ViewGroup) this.f82473a.a(R.id.cbi), false);
                if (a4 == null) {
                    h.f.b.l.b();
                }
                TrendingTopicViewHolder trendingTopicViewHolder = new TrendingTopicViewHolder(a4, this.f82473a.g(), this.f82473a);
                trendingTopicViewHolder.a((TrendingTopicViewHolder.d) new a(this));
                bn bnVar2 = this.f82473a;
                if (bnVar2.f82465k.get(h.f.b.ab.a(TrendingTopicViewHolder.class)) == null) {
                    Map<h.k.c<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> map2 = bnVar2.f82465k;
                    h.k.c<? extends RecyclerView.ViewHolder> a5 = h.f.b.ab.a(TrendingTopicViewHolder.class);
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.offer(trendingTopicViewHolder);
                    map2.put(a5, linkedList2);
                } else {
                    Queue<? extends RecyclerView.ViewHolder> queue = bnVar2.f82465k.get(h.f.b.ab.a(TrendingTopicViewHolder.class));
                    if (queue != null) {
                        Objects.requireNonNull(queue, "null cannot be cast to non-null type java.util.LinkedList<com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder>");
                        ((LinkedList) queue).offer(trendingTopicViewHolder);
                    }
                }
                i2++;
            } while (i2 <= 7);
            return z.f158842a;
        }

        public static final class a implements TrendingTopicViewHolder.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f82474a;

            static {
                Covode.recordClassIndex(51336);
            }

            a(d dVar) {
                this.f82474a = dVar;
            }

            @Override // com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.d
            public final void a(String str, String str2, String str3, int i2) {
                h.f.b.l.d(str, "");
                h.f.b.l.d(str2, "");
                h.f.b.l.d(str3, "");
                if (str.length() > 0 && !this.f82474a.f82473a.f82463e.contains(str)) {
                    this.f82474a.f82473a.f82463e.add(str);
                    com.ss.android.ugc.aweme.common.r.a("show_hashtag", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "discovery").a("tag_id", str).a("tag_line", str2).a("order", i2 + 1).f66730a);
                }
            }
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, DiscoverSectionItem>> {
        final /* synthetic */ bn this$0;

        static {
            Covode.recordClassIndex(51352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(bn bnVar) {
            super(1);
            this.this$0 = bnVar;
        }

        public static final class a implements TrendingTopicViewHolder.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f82483a;

            static {
                Covode.recordClassIndex(51353);
            }

            a(r rVar) {
                this.f82483a = rVar;
            }

            @Override // com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.d
            public final void a(String str, String str2, String str3, int i2) {
                h.f.b.l.d(str, "");
                h.f.b.l.d(str2, "");
                h.f.b.l.d(str3, "");
                if (str.length() > 0 && !this.f82483a.this$0.f82463e.contains(str)) {
                    this.f82483a.this$0.f82463e.add(str);
                    com.ss.android.ugc.aweme.common.r.a("show_hashtag", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "discovery").a("tag_id", str).a("tag_line", str2).a("order", i2 + 1).f66730a);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, DiscoverSectionItem> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            TrendingTopicViewHolder trendingTopicViewHolder = (TrendingTopicViewHolder) this.this$0.a(h.f.b.ab.a(TrendingTopicViewHolder.class));
            if (trendingTopicViewHolder != null) {
                return trendingTopicViewHolder;
            }
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.xy, viewGroup2, false);
            h.f.b.l.b(a2, "");
            TrendingTopicViewHolder trendingTopicViewHolder2 = new TrendingTopicViewHolder(a2, this.this$0.g(), this.this$0);
            trendingTopicViewHolder2.a((TrendingTopicViewHolder.d) new a(this));
            return trendingTopicViewHolder2;
        }
    }

    public static final class e extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f82475a;

        static {
            Covode.recordClassIndex(51337);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(bn bnVar) {
            this.f82475a = bnVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            boolean canScrollVertically = recyclerView.canScrollVertically(-1);
            if (!h.f.b.l.a(this.f82475a.q, Boolean.valueOf(canScrollVertically))) {
                this.f82475a.q = Boolean.valueOf(canScrollVertically);
                this.f82475a.e().c(new TrendsTabViewModel.e(canScrollVertically));
            }
        }
    }

    public static final class j extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f82476a;

        static {
            Covode.recordClassIndex(51343);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(bn bnVar) {
            this.f82476a = bnVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 0) {
                com.facebook.imagepipeline.e.h e2 = com.facebook.imagepipeline.e.k.a().e();
                h.f.b.l.b(e2, "");
                if (e2.f47840e.c()) {
                    com.facebook.imagepipeline.e.k.a().e().f47840e.b();
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    com.facebook.imagepipeline.e.k.a().e().f47840e.a();
                }
            } else if (this.f82476a.f82462d == 2) {
                com.facebook.imagepipeline.e.k.a().e().f47840e.a();
            } else {
                com.facebook.imagepipeline.e.h e3 = com.facebook.imagepipeline.e.k.a().e();
                h.f.b.l.b(e3, "");
                if (e3.f47840e.c()) {
                    com.facebook.imagepipeline.e.k.a().e().f47840e.b();
                }
            }
            this.f82476a.f82462d = i2;
        }
    }

    public static final class w implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f82487a;

        static {
            Covode.recordClassIndex(51358);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        w(bn bnVar) {
            this.f82487a = bnVar;
        }

        @Override // com.ss.android.ugc.aweme.common.h.c.b
        public final Object a(int i2) {
            bn bnVar = this.f82487a;
            return bnVar.withState(bnVar.e(), new a(i2));
        }

        static final class a extends h.f.b.m implements h.f.a.b<TrendsTabState, Object> {
            final /* synthetic */ int $pos;

            static {
                Covode.recordClassIndex(51359);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(int i2) {
                super(1);
                this.$pos = i2;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Object invoke(TrendsTabState trendsTabState) {
                TrendsTabState trendsTabState2 = trendsTabState;
                h.f.b.l.d(trendsTabState2, "");
                Iterator<DiscoverSectionItem> it = trendsTabState2.getSubstate().getList().iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (it.next() instanceof DiscoverSectionItem.TrendingTopicOrAdSection) {
                        break;
                    } else {
                        i2++;
                    }
                }
                int i3 = this.$pos;
                if (i3 < 0 || i3 < i2 || i3 >= trendsTabState2.getSubstate().getList().size()) {
                    return Integer.valueOf(this.$pos);
                }
                return h.a.n.b((List) trendsTabState2.getSubstate().getList(), this.$pos);
            }
        }
    }

    static final class u implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f82486a;

        static {
            Covode.recordClassIndex(51356);
        }

        u(bn bnVar) {
            this.f82486a = bnVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f82486a.h();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ bn this$0;

        static {
            Covode.recordClassIndex(51338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(bn bnVar) {
            super(1);
            this.this$0 = bnVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            iVar2.withState(this.this$0.e(), new h.f.a.b<TrendsTabState, z>(this) {
                /* class com.ss.android.ugc.aweme.discover.ui.bn.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(51339);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(TrendsTabState trendsTabState) {
                    TrendsTabState trendsTabState2 = trendsTabState;
                    h.f.b.l.d(trendsTabState2, "");
                    if (!trendsTabState2.isFromSuggestSearch()) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.this$0.this$0.a(R.id.x3);
                        h.f.b.l.b(swipeRefreshLayout, "");
                        swipeRefreshLayout.setRefreshing(true);
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public final <T extends RecyclerView.ViewHolder> T a(h.k.c<? extends T> cVar) {
        h.f.b.l.d(cVar, "");
        Queue<? extends RecyclerView.ViewHolder> queue = this.f82465k.get(cVar);
        T t2 = queue != null ? (T) ((RecyclerView.ViewHolder) queue.poll()) : null;
        if (!(t2 instanceof RecyclerView.ViewHolder)) {
            return null;
        }
        return t2;
    }

    static final class m extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, DiscoverSectionItem>> {
        final /* synthetic */ bn this$0;

        static {
            Covode.recordClassIndex(51346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(bn bnVar) {
            super(1);
            this.this$0 = bnVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, DiscoverSectionItem> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            if (this.this$0.r == null) {
                this.this$0.r = new com.ss.android.ugc.aweme.discover.helper.d(this.this$0.getActivity(), new d.a(this) {
                    /* class com.ss.android.ugc.aweme.discover.ui.bn.m.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ m f82479a;

                    static {
                        Covode.recordClassIndex(51347);
                    }

                    @Override // com.ss.android.ugc.aweme.discover.helper.d.a
                    public final void a() {
                        this.f82479a.this$0.e().m();
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f82479a = r1;
                    }
                });
            }
            JediSimpleViewHolder<?> a2 = com.ss.android.ugc.aweme.search.h.f121133a.a(viewGroup2, this.this$0.getActivity());
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.bytedance.jedi.ext.adapter.JediSimpleViewHolder<com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem>");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        this.w = (SearchStateViewModel) ae.a(activity, (ad.b) null).a(SearchStateViewModel.class);
        e().a(true);
        if (this.f82464j) {
            com.bytedance.ies.watcher.c.b("discovery_trigger_net");
        }
    }

    @org.greenrobot.eventbus.r
    public final void onVideoEvent(ag agVar) {
        h.f.b.l.d(agVar, "");
        if (agVar.f93451b instanceof Aweme) {
            Object obj = agVar.f93451b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            Aweme aweme = (Aweme) obj;
            TrendsTabViewModel e2 = e();
            h.f.b.l.d(aweme, "");
            e2.b_(new TrendsTabViewModel.f(e2, aweme));
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, DiscoverSectionItem>> {
        final /* synthetic */ bn this$0;

        static {
            Covode.recordClassIndex(51349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(bn bnVar) {
            super(1);
            this.this$0 = bnVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, DiscoverSectionItem> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            DiscoverBannerViewHolder discoverBannerViewHolder = (DiscoverBannerViewHolder) this.this$0.a(h.f.b.ab.a(DiscoverBannerViewHolder.class));
            if (discoverBannerViewHolder != null) {
                return discoverBannerViewHolder;
            }
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.xx, viewGroup2, false);
            bn bnVar = this.this$0;
            h.f.b.l.b(a2, "");
            bnVar.a(a2);
            DiscoverBannerViewHolder discoverBannerViewHolder2 = new DiscoverBannerViewHolder(this.this$0, a2);
            this.this$0.o = discoverBannerViewHolder2;
            if (this.this$0.p == null) {
                this.this$0.p = new o(this.this$0.getActivity(), this.this$0.o);
            }
            return discoverBannerViewHolder2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.b<TrendsTabState, z> {
        final /* synthetic */ boolean $isSuccess;
        final /* synthetic */ bn this$0;

        static {
            Covode.recordClassIndex(51357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(bn bnVar, boolean z) {
            super(1);
            this.this$0 = bnVar;
            this.$isSuccess = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TrendsTabState trendsTabState) {
            h.f.b.l.d(trendsTabState, "");
            if (this.$isSuccess) {
                this.this$0.f82466l = true;
                DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.a(R.id.e_o);
                h.f.b.l.b(dmtStatusView, "");
                dmtStatusView.setVisibility(8);
            } else {
                new com.bytedance.tux.g.b(this.this$0).e(R.string.de8).b();
                if (!this.this$0.f82466l) {
                    ((DmtStatusView) this.this$0.a(R.id.e_o)).h();
                }
            }
            return z.f158842a;
        }
    }

    public final void a(View view) {
        if (ab_()) {
            ((BannerSwipeRefreshLayout) a(R.id.x3)).setHeader(view);
        }
    }

    static final class x<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f82488a;

        static {
            Covode.recordClassIndex(51360);
        }

        x(bn bnVar) {
            this.f82488a = bnVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                bn bnVar = this.f82488a;
                if (bnVar.a(R.id.e_o) != null) {
                    DmtStatusView dmtStatusView = (DmtStatusView) bnVar.a(R.id.e_o);
                    if (dmtStatusView == null) {
                        h.f.b.l.b();
                    }
                    if (dmtStatusView.j()) {
                        DmtStatusView dmtStatusView2 = (DmtStatusView) bnVar.a(R.id.e_o);
                        if (dmtStatusView2 == null) {
                            h.f.b.l.b();
                        }
                        dmtStatusView2.setVisibility(0);
                    }
                }
            } else {
                bn bnVar2 = this.f82488a;
                if (bnVar2.a(R.id.e_o) != null) {
                    DmtStatusView dmtStatusView3 = (DmtStatusView) bnVar2.a(R.id.e_o);
                    if (dmtStatusView3 == null) {
                        h.f.b.l.b();
                    }
                    if (dmtStatusView3.j()) {
                        DmtStatusView dmtStatusView4 = (DmtStatusView) bnVar2.a(R.id.e_o);
                        if (dmtStatusView4 == null) {
                            h.f.b.l.b();
                        }
                        dmtStatusView4.setVisibility(4);
                    }
                }
            }
            bn bnVar3 = this.f82488a;
            boolean booleanValue = bool.booleanValue();
            if (bnVar3.a(R.id.cbi) != null) {
                if (bnVar3.n == null) {
                    h.f.b.l.a("onCategoryScrollListener");
                }
                DiscoveryRecyclerView discoveryRecyclerView = (DiscoveryRecyclerView) bnVar3.a(R.id.cbi);
                h.f.b.l.b(discoveryRecyclerView, "");
                com.ss.android.ugc.aweme.discover.helper.q.a(discoveryRecyclerView, booleanValue);
            }
        }
    }

    public final void a(boolean z2) {
        if (ab_()) {
            BannerSwipeRefreshLayout bannerSwipeRefreshLayout = (BannerSwipeRefreshLayout) a(R.id.x3);
            h.f.b.l.b(bannerSwipeRefreshLayout, "");
            if (bannerSwipeRefreshLayout.isEnabled()) {
                BannerSwipeRefreshLayout bannerSwipeRefreshLayout2 = (BannerSwipeRefreshLayout) a(R.id.x3);
                h.f.b.l.b(bannerSwipeRefreshLayout2, "");
                bannerSwipeRefreshLayout2.setSelected(false);
            }
            com.ss.android.ugc.aweme.commercialize.k.a aVar = this.f82467m;
            if (aVar != null && aVar.isEnabled()) {
                com.ss.android.ugc.aweme.commercialize.k.a aVar2 = this.f82467m;
                if (aVar2 == null) {
                    h.f.b.l.b();
                }
                aVar2.setSelected(false);
            }
            BannerSwipeRefreshLayout bannerSwipeRefreshLayout3 = (BannerSwipeRefreshLayout) a(R.id.x3);
            h.f.b.l.b(bannerSwipeRefreshLayout3, "");
            if (bannerSwipeRefreshLayout3.isEnabled()) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.x3);
                h.f.b.l.b(swipeRefreshLayout, "");
                swipeRefreshLayout.setRefreshing(false);
            }
            com.ss.android.ugc.aweme.commercialize.k.a aVar3 = this.f82467m;
            if (aVar3 != null && aVar3.isEnabled() && this.f82467m == null) {
                h.f.b.l.b();
            }
            withState(e(), new v(this, z2));
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<Integer, Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f82478a = new l();

        static {
            Covode.recordClassIndex(51345);
        }

        l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(Integer num, Object obj) {
            num.intValue();
            return Boolean.valueOf(obj instanceof DiscoverSectionItem.SuggestSearchSection);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<Integer, Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f82480a = new n();

        static {
            Covode.recordClassIndex(51348);
        }

        n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(Integer num, Object obj) {
            num.intValue();
            return Boolean.valueOf(obj instanceof DiscoverSectionItem.BannerSection);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<Integer, Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f82481a = new p();

        static {
            Covode.recordClassIndex(51350);
        }

        p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(Integer num, Object obj) {
            num.intValue();
            return Boolean.valueOf(obj instanceof DiscoverSectionItem.TrendingTopicOrAdSection);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<Integer, RecyclerView, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f82482a = new q();

        static {
            Covode.recordClassIndex(51351);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, RecyclerView recyclerView) {
            num.intValue();
            h.f.b.l.d(recyclerView, "");
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends DiscoverSectionItem>, z> {
        final /* synthetic */ bn this$0;

        static {
            Covode.recordClassIndex(51342);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(bn bnVar) {
            super(2);
            this.this$0 = bnVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends DiscoverSectionItem> list) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list, "");
            this.this$0.a(true);
            com.ss.android.ugc.aweme.common.h.c.a((RecyclerView) this.this$0.a(R.id.cbi));
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ bn this$0;

        static {
            Covode.recordClassIndex(51340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(bn bnVar) {
            super(2);
            this.this$0 = bnVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.this$0.a(R.id.x3);
            h.f.b.l.b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            if (!this.this$0.f82466l) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).h();
            }
            this.this$0.a(false);
            return z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<ViewGroup, h.f.a.a<? extends z>, com.bytedance.jedi.ext.adapter.a.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f82484a = new s();

        static {
            Covode.recordClassIndex(51354);
        }

        s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ com.bytedance.jedi.ext.adapter.a.e invoke(ViewGroup viewGroup, h.f.a.a<? extends z> aVar) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            h.f.b.l.d(aVar, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.xz, viewGroup2, false);
            h.f.b.l.b(a2, "");
            return new p(a2);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends DiscoverSectionItem>, z> {
        final /* synthetic */ bn this$0;

        static {
            Covode.recordClassIndex(51341);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(bn bnVar) {
            super(2);
            this.this$0 = bnVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends DiscoverSectionItem> list) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list, "");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.this$0.a(R.id.x3);
            h.f.b.l.b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            bn bnVar = this.this$0;
            if (bnVar.ab_() && !bnVar.f82466l) {
                ((DmtStatusView) bnVar.a(R.id.e_o)).g();
            }
            this.this$0.a(true);
            com.ss.android.ugc.aweme.common.h.c.a((RecyclerView) this.this$0.a(R.id.cbi));
            if (this.this$0.f82464j) {
                com.bytedance.ies.watcher.c.c("discovery_client_show_time");
                com.bytedance.ies.watcher.c.c("discovery_cost_time");
                com.ss.android.ugc.aweme.cc.c.a("discover_page", (com.ss.android.ugc.aweme.cc.b) null, 6);
                this.this$0.f82464j = false;
            }
            return z.f158842a;
        }
    }

    public bn(com.ss.android.ugc.aweme.discover.tooltip.a aVar, com.ss.android.ugc.aweme.discover.tooltip.b bVar) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(bVar, "");
        this.z = aVar;
        this.A = bVar;
        h.k.c a2 = h.f.b.ab.a(TrendsTabViewModel.class);
        this.B = h.i.a((h.f.a.a) new a(this, a2, a2));
        this.f82465k = new LinkedHashMap();
        this.C = h.i.a((h.f.a.a) y.f82489a);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.l
    public final void a(boolean z2, boolean z3) {
        String str;
        androidx.lifecycle.t<Boolean> tVar;
        com.ss.android.ugc.aweme.discover.adapter.j jVar;
        super.a(z2, z3);
        if (z2) {
            str = null;
        } else {
            str = "TrendsTabFragment";
        }
        gj.f143017a = str;
        if (ab_() && a(R.id.cbi) != null) {
            if (z2 || this.f82461c == 1) {
                if (!z3 && (jVar = this.o) != null) {
                    jVar.b(!z2);
                }
                MainAnimViewModel mainAnimViewModel = this.v;
                if (!(mainAnimViewModel == null || (tVar = mainAnimViewModel.f109059a) == null)) {
                    tVar.setValue(Boolean.valueOf(!z2));
                }
                if (!z3) {
                    e().b(z2);
                }
                if (!z2) {
                    com.ss.android.ugc.aweme.feed.s.a(af.DISCOVER);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.ies.dmt.ui.widget.d a2 = com.ss.android.ugc.aweme.views.h.a(getActivity(), new u(this));
        com.bytedance.ies.dmt.ui.widget.e eVar = new com.bytedance.ies.dmt.ui.widget.e(getContext());
        eVar.setSupportDelayVisible(true);
        eVar.setStatus(a2);
        if (a(R.id.e_o) != null) {
            DmtStatusView.a c2 = DmtStatusView.a.a(getActivity()).b().c(eVar);
            if (com.bytedance.ies.abmock.b.a().a(true, "ux_opt_discovery_exp", false)) {
                c2.a(com.a.a(getLayoutInflater(), R.layout.xq, (ViewGroup) a(R.id.e_o), false));
            }
            ((DmtStatusView) a(R.id.e_o)).setBuilder(c2);
            DmtStatusView dmtStatusView = (DmtStatusView) a(R.id.e_o);
            Context context = getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            dmtStatusView.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.n4));
        }
        RecyclerView recyclerView = (RecyclerView) a(R.id.cbi);
        h.f.b.l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(1));
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.cbi);
        h.f.b.l.b(recyclerView2, "");
        RecyclerView.f itemAnimator = recyclerView2.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f3833l = 0;
        }
        ((FpsRecyclerView) a(R.id.cbi)).setLabel("discover_list");
        da.a.a("discover_list").a((RecyclerView) a(R.id.cbi));
        this.n = new com.ss.android.ugc.aweme.discover.helper.q();
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.cbi);
        com.ss.android.ugc.aweme.discover.helper.q qVar = this.n;
        if (qVar == null) {
            h.f.b.l.a("onCategoryScrollListener");
        }
        recyclerView3.a(qVar);
        ((RecyclerView) a(R.id.cbi)).a(new e(this));
        com.bytedance.jedi.ext.adapter.a.g gVar = (com.bytedance.jedi.ext.adapter.a.g) com.bytedance.jedi.ext.adapter.a.b.a((com.bytedance.jedi.ext.adapter.extension.b) b.a.a(this, new com.ss.android.ugc.aweme.discover.adapter.h()).a(l.f82478a, null, new m(this)).a(n.f82480a, null, new o(this)).a(p.f82481a, q.f82482a, new r(this))).a(242).a(s.f82484a);
        gVar.q = e();
        int[] iArr = {0};
        h.f.b.l.c(iArr, "");
        gVar.f39577g = iArr;
        com.bytedance.jedi.ext.adapter.a.a a3 = gVar.a(new f(this), new g(this), new h(this));
        i iVar = new i(this);
        a.e eVar2 = a.e.f39606a;
        a.f fVar = a.f.f39607a;
        h.f.b.l.c(eVar2, "");
        h.f.b.l.c(fVar, "");
        h.f.b.l.c(iVar, "");
        a3.f39580j = new a.d(eVar2, fVar, iVar);
        DiscoveryRecyclerView discoveryRecyclerView = (DiscoveryRecyclerView) a(R.id.cbi);
        h.f.b.l.b(discoveryRecyclerView, "");
        ((com.bytedance.jedi.ext.adapter.a.g) a3).a(discoveryRecyclerView);
        com.ss.android.ugc.aweme.discover.f.c.a();
        if (com.ss.android.ugc.aweme.discover.f.c.a()) {
            ((RecyclerView) a(R.id.cbi)).a(new j(this));
        }
        DiscoveryRecyclerView discoveryRecyclerView2 = (DiscoveryRecyclerView) a(R.id.cbi);
        h.f.b.l.b(discoveryRecyclerView2, "");
        ((RecyclerView) a(R.id.cbi)).a(new k(this, androidx.core.content.b.c(discoveryRecyclerView2.getContext(), R.color.b6), (int) com.bytedance.common.utility.n.b(getContext(), 16.0f), (int) com.bytedance.common.utility.n.b(getContext(), 16.0f)));
        ((SwipeRefreshLayout) a(R.id.x3)).a((int) com.bytedance.common.utility.n.b(getActivity(), 49.0f), (int) com.bytedance.common.utility.n.b(getActivity(), 113.0f));
        ((SwipeRefreshLayout) a(R.id.x3)).setOnRefreshListener(new t(this));
        if (com.bytedance.ies.abmock.b.a().a(true, "discovery_pre_create_viewholder", 0) == 1) {
            b.i.b(new d(this), b.i.f4824a);
        }
        if (com.ss.android.ugc.aweme.discover.f.e.a()) {
            b.i.b(new c(this, new com.ss.android.ugc.aweme.discover.adapter.c(this), new Handler()), b.i.f4824a);
        }
        com.ss.android.ugc.aweme.common.h.c.a((RecyclerView) a(R.id.cbi), new w(this));
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        MainAnimViewModel mainAnimViewModel = (MainAnimViewModel) ae.a(activity, (ad.b) null).a(MainAnimViewModel.class);
        this.v = mainAnimViewModel;
        if (mainAnimViewModel == null) {
            h.f.b.l.b();
        }
        mainAnimViewModel.f109059a.observe(this, new x(this));
        DiscoveryRecyclerView discoveryRecyclerView3 = (DiscoveryRecyclerView) a(R.id.cbi);
        if (discoveryRecyclerView3 != null) {
            discoveryRecyclerView3.setBackground(null);
        }
        BannerSwipeRefreshLayout bannerSwipeRefreshLayout = (BannerSwipeRefreshLayout) a(R.id.x3);
        if (bannerSwipeRefreshLayout != null) {
            bannerSwipeRefreshLayout.setBackground(null);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        if (DiscoveryServiceImpl.g().e()) {
            return com.a.b.a.a(getContext(), R.layout.xp, viewGroup, false);
        }
        if (DiscoveryServiceImpl.g().f()) {
            return com.a.b.c.a(getActivity(), R.layout.xp, viewGroup, false);
        }
        return com.a.a(layoutInflater, R.layout.xp, viewGroup, false);
    }

    public static final class k extends com.ss.android.ugc.aweme.friends.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f82477a;

        static {
            Covode.recordClassIndex(51344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(bn bnVar, int i2, int i3, int i4) {
            super(i2, i3, i4);
            this.f82477a = bnVar;
        }

        @Override // com.ss.android.ugc.aweme.friends.a.e, androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            h.f.b.l.d(rect, "");
            h.f.b.l.d(view, "");
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(sVar, "");
            RecyclerView.ViewHolder a2 = recyclerView.a(view);
            int d2 = RecyclerView.d(view);
            if (d2 > 0) {
                RecyclerView recyclerView2 = (RecyclerView) this.f82477a.a(R.id.cbi);
                h.f.b.l.b(recyclerView2, "");
                RecyclerView.a adapter = recyclerView2.getAdapter();
                if (adapter == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(adapter, "");
                if (d2 < adapter.getItemCount() - 1 && (a2 instanceof TrendingTopicViewHolder)) {
                    super.getItemOffsets(rect, view, recyclerView, sVar);
                }
            }
        }
    }
}
