package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.aweme.discover.adapter.ad;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ai extends com.ss.android.ugc.aweme.base.f.a implements ar<com.ss.android.ugc.aweme.base.arch.i>, q {

    /* renamed from: d  reason: collision with root package name */
    public static final a f82262d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    ad f82263a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.i f82264b = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: c  reason: collision with root package name */
    public SearchMusicViewModel f82265c;

    /* renamed from: e  reason: collision with root package name */
    private String f82266e;

    /* renamed from: j  reason: collision with root package name */
    private int f82267j;

    /* renamed from: k  reason: collision with root package name */
    private MusicPlayHelper f82268k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f82269l = h.i.a((h.f.a.a) new f(this));

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f82270m;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f82287a;

        static {
            Covode.recordClassIndex(51211);
        }

        p(h.f.a.a aVar) {
            this.f82287a = aVar;
        }

        public final /* synthetic */ void run() {
            h.f.b.l.b(this.f82287a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(51193);
    }

    private final a.AbstractC2689a e() {
        return (a.AbstractC2689a) this.f82269l.getValue();
    }

    public final View a(int i2) {
        if (this.f82270m == null) {
            this.f82270m = new SparseArray();
        }
        View view = (View) this.f82270m.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f82270m.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51194);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class g implements com.bytedance.jedi.arch.ext.list.c<SearchMusic, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f82275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f82276b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f82277c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f82278d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> f82279e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends SearchMusic>, z> f82280f;

        static {
            Covode.recordClassIndex(51200);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f82278d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f82279e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends SearchMusic>, z> c() {
            return this.f82280f;
        }

        public g(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f82275a = bVar;
            this.f82276b = mVar;
            this.f82277c = mVar2;
            this.f82278d = bVar;
            this.f82279e = mVar;
            this.f82280f = mVar2;
        }
    }

    public static final class h implements com.bytedance.jedi.arch.ext.list.c<SearchMusic, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f82281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f82282b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f82283c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f82284d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> f82285e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends SearchMusic>, z> f82286f;

        static {
            Covode.recordClassIndex(51201);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f82284d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f82285e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends SearchMusic>, z> c() {
            return this.f82286f;
        }

        public h(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f82281a = bVar;
            this.f82282b = mVar;
            this.f82283c = mVar2;
            this.f82284d = bVar;
            this.f82285e = mVar;
            this.f82286f = mVar2;
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f82264b;
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

    static final class e implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f82274a;

        static {
            Covode.recordClassIndex(51198);
        }

        e(ai aiVar) {
            this.f82274a = aiVar;
        }

        @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.b
        public final void a() {
            this.f82274a.a();
        }
    }

    private static boolean g() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f82270m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class d implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f82273a;

        static {
            Covode.recordClassIndex(51197);
        }

        d(ai aiVar) {
            this.f82273a = aiVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            SearchMusicViewModel searchMusicViewModel = this.f82273a.f82265c;
            if (searchMusicViewModel == null) {
                h.f.b.l.a("viewModel");
            }
            h.f.b.l.d(searchMusicViewModel, "");
            searchMusicViewModel.f82798a.loadMore();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<SearchKeywordPresenter> {
        final /* synthetic */ ai this$0;

        static {
            Covode.recordClassIndex(51199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ai aiVar) {
            super(0);
            this.this$0 = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchKeywordPresenter invoke() {
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            return new SearchKeywordPresenter(activity);
        }
    }

    private static boolean h() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean g2 = g();
        com.ss.android.ugc.aweme.lancet.j.f107229h = g2;
        return g2;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.dk6);
        if (ab_() && swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    public final void c() {
        if (ab_()) {
            b();
            ad adVar = this.f82263a;
            if (adVar == null) {
                h.f.b.l.a("adapter");
            }
            adVar.d(false);
            ad adVar2 = this.f82263a;
            if (adVar2 == null) {
                h.f.b.l.a("adapter");
            }
            adVar2.b_(null);
            ((DmtStatusView) a(R.id.e_c)).g();
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class o extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(51210);
        }

        o(ai aiVar) {
            super(0, aiVar, ai.class, "showNetworkError", "showNetworkError()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ai aiVar = (ai) this.receiver;
            if (aiVar.ab_()) {
                aiVar.b();
                ad adVar = aiVar.f82263a;
                if (adVar == null) {
                    h.f.b.l.a("adapter");
                }
                adVar.d(false);
                ad adVar2 = aiVar.f82263a;
                if (adVar2 == null) {
                    h.f.b.l.a("adapter");
                }
                adVar2.b_(null);
                ((DmtStatusView) aiVar.a(R.id.e_c)).h();
                new com.ss.android.ugc.aweme.tux.a.i.a(aiVar.getContext()).a(R.string.de8).a();
            }
            return z.f158842a;
        }
    }

    public final void a() {
        getContext();
        if (!h()) {
            com.ss.android.b.a.a.a.a(new p(new o(this)), 100);
            return;
        }
        SearchMusicViewModel searchMusicViewModel = this.f82265c;
        if (searchMusicViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        String str = this.f82266e;
        if (str == null) {
            h.f.b.l.a("musicAuthor");
        }
        searchMusicViewModel.a(new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f(str, 1, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, 0, null, null, 1048540));
        SearchMusicViewModel searchMusicViewModel2 = this.f82265c;
        if (searchMusicViewModel2 == null) {
            h.f.b.l.a("viewModel");
        }
        com.ss.android.ugc.aweme.discover.jedi.viewmodel.d.a(searchMusicViewModel2);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f82271a;

        static {
            Covode.recordClassIndex(51195);
        }

        b(ai aiVar) {
            this.f82271a = aiVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f82271a.a();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f82272a;

        static {
            Covode.recordClassIndex(51196);
        }

        c(ai aiVar) {
            this.f82272a = aiVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f82272a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public static final /* synthetic */ SearchMusicViewModel a(ai aiVar) {
        SearchMusicViewModel searchMusicViewModel = aiVar.f82265c;
        if (searchMusicViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        return searchMusicViewModel;
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ ai this$0;

        static {
            Covode.recordClassIndex(51208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ai aiVar) {
            super(1);
            this.this$0 = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            ad adVar = this.this$0.f82263a;
            if (adVar == null) {
                h.f.b.l.a("adapter");
            }
            adVar.ag_();
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ ai this$0;

        static {
            Covode.recordClassIndex(51204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ai aiVar) {
            super(1);
            this.this$0 = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            ai aiVar = this.this$0;
            NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) aiVar.a(R.id.djj);
            h.f.b.l.b(nestedScrollingRecyclerView, "");
            if (nestedScrollingRecyclerView.getChildCount() > 0) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) aiVar.a(R.id.dk6);
                h.f.b.l.b(swipeRefreshLayout, "");
                swipeRefreshLayout.setRefreshing(true);
            } else {
                ((DmtStatusView) aiVar.a(R.id.e_c)).f();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("param_music_author")) == null) {
            str = "";
        }
        this.f82266e = str;
        a.AbstractC2689a e2 = e();
        String str2 = this.f82266e;
        if (str2 == null) {
            h.f.b.l.a("musicAuthor");
        }
        e2.a(new com.ss.android.ugc.aweme.keyword.b(str2, null, 2));
        Bundle arguments2 = getArguments();
        int i2 = 0;
        if (arguments2 != null) {
            i2 = arguments2.getInt("param_holder_postion", 0);
        }
        this.f82267j = i2;
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ ai this$0;

        static {
            Covode.recordClassIndex(51205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ai aiVar) {
            super(2);
            this.this$0 = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            this.this$0.c();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends SearchMusic>, z> {
        final /* synthetic */ ai this$0;

        static {
            Covode.recordClassIndex(51202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ai aiVar) {
            super(2);
            this.this$0 = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends SearchMusic> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list, "");
            iVar2.withState(ai.a(this.this$0), new h.f.a.b<SearchMusicListState, z>(this) {
                /* class com.ss.android.ugc.aweme.discover.ui.ai.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(51203);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(SearchMusicListState searchMusicListState) {
                    SearchMusicListState searchMusicListState2 = searchMusicListState;
                    h.f.b.l.d(searchMusicListState2, "");
                    ai aiVar = this.this$0.this$0;
                    List<SearchMusic> list = searchMusicListState2.getListState().getList();
                    boolean z = searchMusicListState2.getListState().getPayload().f39459a.f39447a;
                    if (aiVar.ab_()) {
                        if (list == null || list.isEmpty()) {
                            aiVar.c();
                        } else {
                            aiVar.b();
                            ad adVar = aiVar.f82263a;
                            if (adVar == null) {
                                h.f.b.l.a("adapter");
                            }
                            adVar.d(true);
                            if (z) {
                                adVar.ai_();
                            } else {
                                adVar.ah_();
                            }
                            ((DmtStatusView) aiVar.a(R.id.e_c)).d();
                            ad adVar2 = aiVar.f82263a;
                            if (adVar2 == null) {
                                h.f.b.l.a("adapter");
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(list);
                            adVar2.b_(arrayList);
                        }
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends SearchMusic>, z> {
        final /* synthetic */ ai this$0;

        static {
            Covode.recordClassIndex(51206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(ai aiVar) {
            super(2);
            this.this$0 = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends SearchMusic> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list, "");
            iVar2.withState(ai.a(this.this$0), new h.f.a.b<SearchMusicListState, z>(this) {
                /* class com.ss.android.ugc.aweme.discover.ui.ai.l.AnonymousClass1 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(51207);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(SearchMusicListState searchMusicListState) {
                    SearchMusicListState searchMusicListState2 = searchMusicListState;
                    h.f.b.l.d(searchMusicListState2, "");
                    ai aiVar = this.this$0.this$0;
                    List<SearchMusic> list = searchMusicListState2.getListState().getList();
                    boolean z = searchMusicListState2.getListState().getPayload().f39459a.f39447a;
                    if (aiVar.ab_()) {
                        aiVar.b();
                        ad adVar = aiVar.f82263a;
                        if (adVar == null) {
                            h.f.b.l.a("adapter");
                        }
                        if (z) {
                            adVar.ai_();
                        } else {
                            adVar.ah_();
                        }
                        adVar.b(list);
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ ai this$0;

        static {
            Covode.recordClassIndex(51209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(ai aiVar) {
            super(2);
            this.this$0 = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            ai aiVar = this.this$0;
            if (aiVar.ab_()) {
                aiVar.b();
                ad adVar = aiVar.f82263a;
                if (adVar == null) {
                    h.f.b.l.a("adapter");
                }
                adVar.i();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ac a2;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        h.f.b.l.d(this, "");
        androidx.lifecycle.ad a3 = androidx.lifecycle.ae.a(this, new SearchMusicViewModel.a.C1946a());
        String name = SearchMusicViewModel.class.getName();
        if (SearchMusicViewModel.class.equals(ScopeViewModel.class)) {
            a2 = a3.a(name, SearchMusicViewModel.class);
        } else {
            a2 = a3.a(name, SearchMusicViewModel.class);
            ab.a(a2, a3);
        }
        h.f.b.l.b(a2, "");
        SearchMusicViewModel searchMusicViewModel = (SearchMusicViewModel) a2;
        searchMusicViewModel.a_(SearchMusicViewModel.a.b.f82799a);
        this.f82265c = searchMusicViewModel;
        com.bytedance.ies.dmt.ui.titlebar.a aVar = (com.bytedance.ies.dmt.ui.titlebar.a) a(R.id.elv);
        h.f.b.l.b(aVar, "");
        DmtTextView titleView = aVar.getTitleView();
        h.f.b.l.b(titleView, "");
        Context context = getContext();
        if (context == null) {
            h.f.b.l.b();
        }
        Object[] objArr = new Object[1];
        String str = this.f82266e;
        if (str == null) {
            h.f.b.l.a("musicAuthor");
        }
        objArr[0] = str;
        String string = context.getString(R.string.dc9, objArr);
        h.f.b.l.b(string, "");
        String a4 = com.a.a(string, Arrays.copyOf(new Object[0], 0));
        h.f.b.l.b(a4, "");
        titleView.setText(a4);
        NormalTitleBar normalTitleBar = (NormalTitleBar) a(R.id.elv);
        h.f.b.l.b(normalTitleBar, "");
        normalTitleBar.getStartBtn().setOnClickListener(new c(this));
        ((com.bytedance.ies.dmt.ui.titlebar.a) a(R.id.elv)).a(true);
        ad adVar = new ad(new com.ss.android.ugc.aweme.search.model.d(), e());
        this.f82263a = adVar;
        NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) a(R.id.djj);
        h.f.b.l.b(nestedScrollingRecyclerView, "");
        adVar.g(androidx.core.content.b.c(nestedScrollingRecyclerView.getContext(), R.color.f159928l));
        ad adVar2 = this.f82263a;
        if (adVar2 == null) {
            h.f.b.l.a("adapter");
        }
        adVar2.a((h.a) new d(this));
        ((SwipeRefreshLayout) a(R.id.dk6)).setOnRefreshListener(new e(this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.dk6);
        h.f.b.l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setEnabled(false);
        RecyclerView recyclerView = (RecyclerView) a(R.id.djj);
        h.f.b.l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(1));
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.djj);
        h.f.b.l.b(recyclerView2, "");
        ad adVar3 = this.f82263a;
        if (adVar3 == null) {
            h.f.b.l.a("adapter");
        }
        recyclerView2.setAdapter(adVar3);
        MtEmptyView a5 = MtEmptyView.a(getContext());
        a5.setStatus(new d.a(a5.getContext()).a(2131232660).b(R.string.h36).c(R.string.h37).f33648a);
        ((DmtStatusView) a(R.id.e_c)).setBuilder(DmtStatusView.a.a(getContext()).a(R.string.h2z, new b(this)).b(a5));
        SearchMusicViewModel searchMusicViewModel2 = this.f82265c;
        if (searchMusicViewModel2 == null) {
            h.f.b.l.a("viewModel");
        }
        ad adVar4 = this.f82263a;
        if (adVar4 == null) {
            h.f.b.l.a("adapter");
        }
        g gVar = new g(new j(this), new k(this), new i(this));
        h hVar = new h(new m(this), new n(this), new l(this));
        h.f.b.l.d(searchMusicViewModel2, "");
        h.f.b.l.d(this, "");
        h.f.b.l.d(adVar4, "");
        ListMiddleware.a(searchMusicViewModel2.f82798a, this, adVar4, getUniqueOnlyGlobal(), gVar, hVar, null, null, 896);
        a();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            this.f82268k = (MusicPlayHelper) androidx.lifecycle.ae.a(activity, (ad.b) null).a(MusicPlayHelper.class);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.av0, viewGroup, false);
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
