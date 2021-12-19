package com.ss.android.ugc.aweme.kids.discovery.list;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.kids.discovery.a.e;
import com.ss.android.ugc.aweme.kids.discovery.list.DiscoverViewModel;
import com.ss.android.ugc.aweme.utils.cg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class e extends Fragment implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f106510c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    DiscoverViewModel f106511a;

    /* renamed from: b  reason: collision with root package name */
    boolean f106512b;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f106513d;

    static final class j implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static final j f106522a = new j();

        static {
            Covode.recordClassIndex(68067);
        }

        j() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(68057);
    }

    public final View a(int i2) {
        if (this.f106513d == null) {
            this.f106513d = new HashMap();
        }
        View view = (View) this.f106513d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f106513d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(90, new org.greenrobot.eventbus.g(e.class, "onReportEvent", com.ss.android.ugc.aweme.kids.common.b.b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68058);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        cg.b(this);
    }

    static final /* synthetic */ class g extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(68064);
        }

        g(e eVar) {
            super(0, eVar, e.class, "refreshList", "refreshList()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((e) this.receiver).a();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class k extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(68068);
        }

        k(e eVar) {
            super(0, eVar, e.class, "refreshList", "refreshList()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((e) this.receiver).a();
            return z.f158842a;
        }
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f106513d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    private static boolean c() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean b2 = b();
        com.ss.android.ugc.aweme.lancet.j.f107226e = b2;
        return b2;
    }

    static final class b implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f106514a;

        static {
            Covode.recordClassIndex(68059);
        }

        b(e eVar) {
            this.f106514a = eVar;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.b
        public final void onRefresh() {
            if (this.f106514a.a(R.id.x3) != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f106514a.a(R.id.x3);
                l.b(swipeRefreshLayout, "");
                if (swipeRefreshLayout.isEnabled()) {
                    this.f106514a.a();
                }
            }
        }
    }

    public static final class h implements e.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f106519a;

        static {
            Covode.recordClassIndex(68065);
        }

        @Override // com.ss.android.ugc.aweme.kids.discovery.a.e.c
        public final void a() {
            DiscoverViewModel discoverViewModel = this.f106519a.f106511a;
            if (discoverViewModel == null) {
                l.a("mDiscoverViewModel");
            }
            long currentTimeMillis = System.currentTimeMillis();
            discoverViewModel.f106477a.getCategoryV2List(discoverViewModel.f106482f, 10, 0).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new DiscoverViewModel.b(discoverViewModel, currentTimeMillis), new DiscoverViewModel.c(discoverViewModel, currentTimeMillis));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(e eVar) {
            this.f106519a = eVar;
        }
    }

    public final void a() {
        getContext();
        if (!c()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.x3);
            l.b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            if (!this.f106512b) {
                ((TuxStatusView) a(R.id.e_o)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new k(this)));
                TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.e_o);
                l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
            }
        } else if (this.f106512b) {
            DiscoverViewModel discoverViewModel = this.f106511a;
            if (discoverViewModel == null) {
                l.a("mDiscoverViewModel");
            }
            discoverViewModel.a();
        } else {
            ((TuxStatusView) a(R.id.e_o)).a();
            TuxStatusView tuxStatusView2 = (TuxStatusView) a(R.id.e_o);
            l.b(tuxStatusView2, "");
            tuxStatusView2.setVisibility(0);
            DiscoverViewModel discoverViewModel2 = this.f106511a;
            if (discoverViewModel2 == null) {
                l.a("mDiscoverViewModel");
            }
            discoverViewModel2.a();
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f106515a;

        static {
            Covode.recordClassIndex(68060);
        }

        c(e eVar) {
            this.f106515a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            RecyclerView recyclerView = (RecyclerView) this.f106515a.a(R.id.cbi);
            l.b(recyclerView, "");
            RecyclerView.a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.base.LoadMoreAdapterWrapper");
            RecyclerView.a<RecyclerView.ViewHolder> aVar = ((com.ss.android.ugc.aweme.kids.discovery.a.c) adapter).f106392f;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.list.CategoryListAdapter");
            b bVar = (b) aVar;
            if (list != null) {
                bVar.f106501a.clear();
                bVar.f106501a.addAll(list);
                bVar.notifyDataSetChanged();
            }
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f106516a;

        static {
            Covode.recordClassIndex(68061);
        }

        d(e eVar) {
            this.f106516a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            e eVar = this.f106516a;
            l.b(bool, "");
            boolean booleanValue = bool.booleanValue();
            RecyclerView recyclerView = (RecyclerView) eVar.a(R.id.cbi);
            l.b(recyclerView, "");
            RecyclerView.a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.base.LoadMoreAdapterWrapper");
            com.ss.android.ugc.aweme.kids.discovery.a.e eVar2 = (com.ss.android.ugc.aweme.kids.discovery.a.e) adapter;
            if (booleanValue) {
                eVar2.a(1);
            } else {
                eVar2.a(2);
            }
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f106518a;

        static {
            Covode.recordClassIndex(68063);
        }

        f(e eVar) {
            this.f106518a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                RecyclerView recyclerView = (RecyclerView) this.f106518a.a(R.id.cbi);
                l.b(recyclerView, "");
                RecyclerView.a adapter = recyclerView.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.base.LoadMoreAdapterWrapper");
                ((com.ss.android.ugc.aweme.kids.discovery.a.e) adapter).a(3);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cg.a(this);
        ac a2 = ae.a(this, (ad.b) null).a(DiscoverViewModel.class);
        l.b(a2, "");
        DiscoverViewModel discoverViewModel = (DiscoverViewModel) a2;
        this.f106511a = discoverViewModel;
        if (discoverViewModel == null) {
            l.a("mDiscoverViewModel");
        }
        discoverViewModel.f106481e.observe(this, new c(this));
        DiscoverViewModel discoverViewModel2 = this.f106511a;
        if (discoverViewModel2 == null) {
            l.a("mDiscoverViewModel");
        }
        discoverViewModel2.f106478b.observe(this, new d(this));
        DiscoverViewModel discoverViewModel3 = this.f106511a;
        if (discoverViewModel3 == null) {
            l.a("mDiscoverViewModel");
        }
        discoverViewModel3.f106479c.observe(this, new C2718e(this));
        DiscoverViewModel discoverViewModel4 = this.f106511a;
        if (discoverViewModel4 == null) {
            l.a("mDiscoverViewModel");
        }
        discoverViewModel4.f106480d.observe(this, new f(this));
    }

    @r(a = ThreadMode.MAIN)
    public final void onReportEvent(com.ss.android.ugc.aweme.kids.common.b.b bVar) {
        l.d(bVar, "");
        DiscoverViewModel discoverViewModel = this.f106511a;
        if (discoverViewModel == null) {
            l.a("mDiscoverViewModel");
        }
        l.d(bVar, "");
        ArrayList arrayList = new ArrayList();
        List<com.ss.android.ugc.aweme.kids.discovery.c.a> value = discoverViewModel.f106481e.getValue();
        if (value == null) {
            value = h.a.z.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t : value) {
            if (!discoverViewModel.a(t)) {
                arrayList2.add(t);
            }
        }
        arrayList.addAll(arrayList2);
        discoverViewModel.f106481e.postValue(arrayList);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$e  reason: collision with other inner class name */
    static final class C2718e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f106517a;

        static {
            Covode.recordClassIndex(68062);
        }

        C2718e(e eVar) {
            this.f106517a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            e eVar = this.f106517a;
            l.b(bool, "");
            boolean booleanValue = bool.booleanValue();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) eVar.a(R.id.x3);
            l.b(swipeRefreshLayout, "");
            if (swipeRefreshLayout.isEnabled()) {
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) eVar.a(R.id.x3);
                l.b(swipeRefreshLayout2, "");
                swipeRefreshLayout2.setRefreshing(false);
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) eVar.a(R.id.x3);
                l.b(swipeRefreshLayout3, "");
                swipeRefreshLayout3.setSelected(false);
            }
            if (eVar.a(R.id.e_o) == null) {
                return;
            }
            if (booleanValue) {
                eVar.f106512b = true;
                TuxStatusView tuxStatusView = (TuxStatusView) eVar.a(R.id.e_o);
                l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(8);
                return;
            }
            new com.bytedance.tux.g.b(eVar).e(R.string.de8).b();
            if (eVar.f106512b) {
                TuxStatusView tuxStatusView2 = (TuxStatusView) eVar.a(R.id.e_o);
                l.b(tuxStatusView2, "");
                tuxStatusView2.setVisibility(8);
                return;
            }
            TuxStatusView tuxStatusView3 = (TuxStatusView) eVar.a(R.id.e_o);
            l.b(tuxStatusView3, "");
            tuxStatusView3.setVisibility(0);
            ((TuxStatusView) eVar.a(R.id.e_o)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new g(eVar)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) a(R.id.cbi);
        l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        b bVar = new b();
        com.ss.android.ugc.aweme.kids.discovery.a.e eVar = new com.ss.android.ugc.aweme.kids.discovery.a.e(bVar);
        com.ss.android.ugc.aweme.kids.discovery.a.d dVar = new com.ss.android.ugc.aweme.kids.discovery.a.d(eVar);
        l.d(dVar, "");
        eVar.f106401g = dVar;
        h hVar = new h(this);
        l.d(hVar, "");
        eVar.f106402h = hVar;
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.cbi);
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(eVar);
        DiscoveryRecyclerView discoveryRecyclerView = (DiscoveryRecyclerView) a(R.id.cbi);
        l.b(discoveryRecyclerView, "");
        ((RecyclerView) a(R.id.cbi)).a(new i(this, bVar, androidx.core.content.b.c(discoveryRecyclerView.getContext(), R.color.b6), (int) n.b(getContext(), 16.0f), (int) n.b(getContext(), 16.0f)));
        ((SwipeRefreshLayout) a(R.id.x3)).setProgressViewOffset(false, (int) n.b(getActivity(), 49.0f), (int) n.b(getActivity(), 113.0f));
        ((SwipeRefreshLayout) a(R.id.x3)).setOnRefreshListener(new b(this));
        a();
        ((TuxStatusView) a(R.id.e_o)).setOnTouchListener(j.f106522a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.acq, viewGroup, false);
    }

    public static final class i extends com.ss.android.ugc.aweme.kids.discovery.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f106520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f106521b;

        static {
            Covode.recordClassIndex(68066);
        }

        @Override // com.ss.android.ugc.aweme.kids.discovery.a.b, androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            int d2 = RecyclerView.d(view);
            if (d2 >= 0 && d2 < this.f106521b.getItemCount() - 1 && this.f106521b.getItemViewType(d2) == 2147483644) {
                super.getItemOffsets(rect, view, recyclerView, sVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar, b bVar, int i2, int i3, int i4) {
            super(i2, 1, 1, i3, i4);
            this.f106520a = eVar;
            this.f106521b = bVar;
        }
    }
}
