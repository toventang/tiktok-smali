package com.ss.android.ugc.aweme.inbox;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.e.a;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.inbox.f.a;
import com.ss.android.ugc.aweme.inbox.k;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.multi.f;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notification.utils.q;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class InboxFollowerFragment extends com.ss.android.ugc.aweme.base.f.a implements SwipeRefreshLayout.b, h.a, com.ss.android.ugc.aweme.common.e.c<FollowPageData> {

    /* renamed from: a  reason: collision with root package name */
    public final t<InboxAdapterWidget.b> f103961a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    f.e f103962b = f.e.UNKNOWN;

    /* renamed from: c  reason: collision with root package name */
    boolean f103963c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f103964d = h.i.a((h.f.a.a) h.f103974a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f103965e = h.i.a((h.f.a.a) g.f103973a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f103966j = h.i.a((h.f.a.a) new f(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f103967k = h.i.a((h.f.a.a) new i(this));

    /* renamed from: l  reason: collision with root package name */
    private List<FollowPageData> f103968l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f103969m;
    private boolean n;
    private LinearLayoutManager o;
    private final h.h p = h.i.a((h.f.a.a) new e(this));
    private SparseArray q;

    static {
        Covode.recordClassIndex(66586);
    }

    private final com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.inbox.widget.multi.h> c() {
        return (com.ss.android.ugc.aweme.common.e.b) this.f103964d.getValue();
    }

    private final InboxAdapterWidget d() {
        return (InboxAdapterWidget) this.f103967k.getValue();
    }

    private final androidx.recyclerview.widget.g h() {
        return (androidx.recyclerview.widget.g) this.p.getValue();
    }

    public final View a(int i2) {
        if (this.q == null) {
            this.q = new SparseArray();
        }
        View view = (View) this.q.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.q.put(i2, findViewById);
        return findViewById;
    }

    public final com.ss.android.ugc.aweme.inbox.widget.multi.f a() {
        return (com.ss.android.ugc.aweme.inbox.widget.multi.f) this.f103966j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<FollowPageData> list, boolean z) {
    }

    public static final class c extends RecyclerView.h {
        static {
            Covode.recordClassIndex(66589);
        }

        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, int i2, RecyclerView recyclerView) {
            int a2;
            l.d(rect, "");
            l.d(recyclerView, "");
            if (i2 == 0) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                a2 = h.g.a.a(TypedValue.applyDimension(1, 10.0f, system.getDisplayMetrics()));
            } else {
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                a2 = h.g.a.a(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
            }
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            rect.set(0, a2, 0, h.g.a.a(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics())));
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        j();
    }

    public static final class a implements ad.b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f103970a;

        static {
            Covode.recordClassIndex(66587);
        }

        private /* synthetic */ a() {
            this(false);
        }

        public a(boolean z) {
            this.f103970a = z;
        }

        @Override // androidx.lifecycle.ad.b
        public final <T extends ac> T a(Class<T> cls) {
            l.d(cls, "");
            return cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(this.f103970a));
        }
    }

    static final class f extends m implements h.f.a.a<com.ss.android.ugc.aweme.inbox.widget.multi.f> {
        final /* synthetic */ InboxFollowerFragment this$0;

        static {
            Covode.recordClassIndex(66592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(InboxFollowerFragment inboxFollowerFragment) {
            super(0);
            this.this$0 = inboxFollowerFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.inbox.widget.multi.f invoke() {
            return new com.ss.android.ugc.aweme.inbox.widget.multi.f(this.this$0);
        }
    }

    static final class g extends m implements h.f.a.a<com.ss.android.ugc.aweme.inbox.widget.multi.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f103973a = new g();

        static {
            Covode.recordClassIndex(66593);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.inbox.widget.multi.h invoke() {
            return new com.ss.android.ugc.aweme.inbox.widget.multi.h();
        }
    }

    static final class h extends m implements h.f.a.a<com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.inbox.widget.multi.h>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f103974a = new h();

        static {
            Covode.recordClassIndex(66594);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.inbox.widget.multi.h> invoke() {
            return new com.ss.android.ugc.aweme.common.e.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        a().ag_();
    }

    private static boolean i() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean k() {
        if (this.f103962b != f.e.UNKNOWN) {
            return true;
        }
        return false;
    }

    private final boolean m() {
        if (this.f103962b == f.e.EMPTY) {
            return true;
        }
        return false;
    }

    private final void n() {
        h().a((RecyclerView.a<? extends RecyclerView.ViewHolder>) d().g());
    }

    static final class i extends m implements h.f.a.a<InboxAdapterWidget> {
        final /* synthetic */ InboxFollowerFragment this$0;

        static {
            Covode.recordClassIndex(66595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(InboxFollowerFragment inboxFollowerFragment) {
            super(0);
            this.this$0 = inboxFollowerFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InboxAdapterWidget invoke() {
            RecommendUserService b2 = RecommendUserServiceImpl.b();
            InboxFollowerFragment inboxFollowerFragment = this.this$0;
            InboxAdapterWidget a2 = b2.a(inboxFollowerFragment, inboxFollowerFragment.f103961a);
            a2.a(new a(true));
            a2.f104369d.put("position", "new_followers");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        if (!c().j()) {
            c().a(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        c().h();
        c().cd_();
        SparseArray sparseArray = this.q;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class e extends m implements h.f.a.a<androidx.recyclerview.widget.g> {
        final /* synthetic */ InboxFollowerFragment this$0;

        static {
            Covode.recordClassIndex(66591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(InboxFollowerFragment inboxFollowerFragment) {
            super(0);
            this.this$0 = inboxFollowerFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.recyclerview.widget.g invoke() {
            g.a.C0060a aVar = new g.a.C0060a();
            aVar.f4029a = true;
            aVar.f4030b = g.a.b.NO_STABLE_IDS;
            g.a a2 = aVar.a();
            l.b(a2, "");
            return new androidx.recyclerview.widget.g(a2, n.a(this.this$0.a()));
        }
    }

    private final void j() {
        ((DmtStatusView) a(R.id.e_c)).d();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.b85);
        l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        this.f103963c = true;
        if (k()) {
            a(true);
        } else if (this.f103968l != null) {
            a().a(this.f103968l, this.f103969m, this.f103962b);
        }
    }

    public InboxFollowerFragment() {
        b.i.b(k.c.f104308a, b.i.f4824a);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.b
    public final void onRefresh() {
        int i2;
        getActivity();
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107226e = i();
        }
        if (com.ss.android.ugc.aweme.lancet.j.f107226e) {
            if (h().getItemCount() == 0) {
                ((DmtStatusView) a(R.id.e_c)).f();
            }
            this.f103968l = null;
            this.f103969m = false;
            this.n = false;
            this.f103963c = false;
            c().a(1);
            this.f103962b = f.e.UNKNOWN;
            d().h();
            if (com.ss.android.ugc.aweme.inbox.b.c.i()) {
                i2 = 534;
            } else {
                i2 = 7;
            }
            com.ss.android.ugc.aweme.notice.api.b.a(com.ss.android.ugc.aweme.notice.api.bean.c.Normal, i2);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.bean.m(6, com.ss.android.ugc.aweme.notice.api.b.a(6)));
            return;
        }
        if (h().getItemCount() <= 0) {
            b.i.a(100).a(new k(this), b.i.f4826c, null);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.b85);
        l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        new com.bytedance.tux.g.b(this).e(R.string.de8).b();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        this.n = true;
        j();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        a().j();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InboxFollowerFragment f103971a;

        static {
            Covode.recordClassIndex(66588);
        }

        b(InboxFollowerFragment inboxFollowerFragment) {
            this.f103971a = inboxFollowerFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f103971a.requireActivity().finish();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InboxFollowerFragment f103972a;

        static {
            Covode.recordClassIndex(66590);
        }

        d(InboxFollowerFragment inboxFollowerFragment) {
            this.f103972a = inboxFollowerFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f103972a.onRefresh();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InboxFollowerFragment f103976a;

        static {
            Covode.recordClassIndex(66597);
        }

        k(InboxFollowerFragment inboxFollowerFragment) {
            this.f103976a = inboxFollowerFragment;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            if (!this.f103976a.f35366h) {
                ((DmtStatusView) this.f103976a.a(R.id.e_c)).h();
            }
            return z.f158842a;
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InboxFollowerFragment f103975a;

        static {
            Covode.recordClassIndex(66596);
        }

        j(InboxFollowerFragment inboxFollowerFragment) {
            this.f103975a = inboxFollowerFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            f.e eVar;
            if (InboxAdapterWidget.f104365g.contains(obj)) {
                InboxFollowerFragment inboxFollowerFragment = this.f103975a;
                l.b(obj, "");
                if (inboxFollowerFragment.f103962b == f.e.UNKNOWN) {
                    if (obj == InboxAdapterWidget.b.SUCCESS) {
                        eVar = f.e.SOME;
                    } else {
                        eVar = f.e.EMPTY;
                    }
                    inboxFollowerFragment.f103962b = eVar;
                    if (inboxFollowerFragment.f103963c) {
                        inboxFollowerFragment.a(false);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d().f().observe(this, new j(this));
        d().g().setHasStableIds(false);
        d().bq_().postValue(true);
        getLifecycle().a(d());
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (!this.n) {
            List<FollowPageData> list = this.f103968l;
            if ((list == null || list.isEmpty()) && m()) {
                ((DmtStatusView) a(R.id.e_c)).g();
                return;
            }
            List<FollowPageData> list2 = this.f103968l;
            if (list2 == null || list2.isEmpty()) {
                a().l();
                n();
                return;
            }
            n();
            if (z) {
                a().a(this.f103968l, this.f103969m, this.f103962b);
                d().h();
                return;
            }
            a().a(this.f103962b);
        } else if (a().getItemCount() == 0) {
            ((DmtStatusView) a(R.id.e_c)).h();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<FollowPageData> list, boolean z) {
        this.f103968l = a.e.a(list);
        this.f103969m = z;
        j();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<FollowPageData> list, boolean z) {
        a().ai_();
        a().b(a.e.a(list));
        a().d(z);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.i(1346);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        a.C1099a.a(this).a(R.color.a2r).a(true).f44923a.d();
        c().a((com.ss.android.ugc.aweme.common.b) ((com.ss.android.ugc.aweme.inbox.widget.multi.h) this.f103965e.getValue()));
        c().a_(this);
        ((TuxIconView) a(R.id.qa)).setOnClickListener(new b(this));
        getContext();
        this.o = new FixedLinearlayoutManager();
        RecyclerView recyclerView = (RecyclerView) a(R.id.b84);
        l.b(recyclerView, "");
        LinearLayoutManager linearLayoutManager = this.o;
        if (linearLayoutManager == null) {
            l.a("mLinearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.b84);
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(h());
        ((RecyclerView) a(R.id.b84)).a(new com.ss.android.ugc.aweme.framework.b.a(getContext()));
        q.a((RecyclerView) a(R.id.b84), (SwipeRefreshLayout) a(R.id.b85));
        ((RecyclerView) a(R.id.b84)).a(new com.ss.android.ugc.aweme.framework.b.a(getContext()));
        ((RecyclerView) a(R.id.b84)).a(new c());
        ((SwipeRefreshLayout) a(R.id.b85)).setOnRefreshListener(this);
        a().d(false);
        a().a((h.a) this);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.k7, (ViewGroup) null);
        TuxIconView tuxIconView = (TuxIconView) inflate.findViewById(R.id.eud);
        l.b(tuxIconView, "");
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            marginLayoutParams2.topMargin = h.g.a.a(TypedValue.applyDimension(1, 162.0f, system.getDisplayMetrics()));
        }
        ((DmtStatusView) a(R.id.e_c)).setBuilder(DmtStatusView.a.a(getActivity()).a().b(inflate).a(R.string.h2z, R.string.h2y, R.string.h35, new d(this)));
        onRefresh();
        MethodCollector.o(1346);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.k4, viewGroup, false);
    }
}
