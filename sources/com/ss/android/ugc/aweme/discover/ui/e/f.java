package com.ss.android.ugc.aweme.discover.ui.e;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.discover.mob.o;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.ss.android.ugc.aweme.discover.model.suicide.DialList;
import com.ss.android.ugc.aweme.discover.model.suicide.PleaseNotice;
import com.ss.android.ugc.aweme.discover.model.suicide.SearchSuicideInfo;
import com.ss.android.ugc.aweme.discover.model.suicide.Tools;
import com.ss.android.ugc.aweme.discover.ui.am;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.search.k.v;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.views.m;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class f extends am implements h.a, a, b, i, j {

    /* renamed from: l  reason: collision with root package name */
    public static final String f82571l = "SearchSuicideFragment";

    /* renamed from: m  reason: collision with root package name */
    public static final a f82572m = new a((byte) 0);
    private SearchSuicideInfo K;
    private SparseArray L;

    /* renamed from: a  reason: collision with root package name */
    public SearchPreventSuicide f82573a;

    /* renamed from: b  reason: collision with root package name */
    public d f82574b;

    /* renamed from: c  reason: collision with root package name */
    public String f82575c;

    /* renamed from: d  reason: collision with root package name */
    public GlobalDoodleConfig f82576d;

    /* renamed from: e  reason: collision with root package name */
    public d f82577e;

    /* renamed from: j  reason: collision with root package name */
    public boolean f82578j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f82579k = true;
    private g n;
    private RecyclerView o;

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final View a(int i2) {
        if (this.L == null) {
            this.L = new SparseArray();
        }
        View view = (View) this.L.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.L.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<Aweme> list, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final void aT_() {
        SparseArray sparseArray = this.L;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Aweme> list, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final String c() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<Aweme> list, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new g(f.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51405);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f82580a;

        static {
            Covode.recordClassIndex(51406);
        }

        b(f fVar) {
            this.f82580a = fVar;
        }

        public final void run() {
            f.a(this.f82580a).ah_();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f82581a;

        static {
            Covode.recordClassIndex(51407);
        }

        c(f fVar) {
            this.f82581a = fVar;
        }

        public final void run() {
            f.a(this.f82581a).ah_();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        d dVar = this.f82577e;
        if (dVar == null) {
            l.a("searchSuicideAdapter");
        }
        dVar.ag_();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.am, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus.a().b(this);
        aT_();
    }

    static {
        Covode.recordClassIndex(51404);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        String str;
        g gVar = this.n;
        if (gVar == null) {
            l.a("searchSuicidePresenter");
        }
        com.ss.android.ugc.aweme.discover.j.d dVar = (com.ss.android.ugc.aweme.discover.j.d) gVar.f76396h;
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.suicide.SearchSuicideAwemeModel");
        ((e) dVar).a();
        g gVar2 = this.n;
        if (gVar2 == null) {
            l.a("searchSuicidePresenter");
        }
        Object[] objArr = new Object[5];
        objArr[0] = 4;
        d dVar2 = this.f82574b;
        if (dVar2 != null) {
            str = dVar2.getKeyword();
        } else {
            str = null;
        }
        objArr[1] = str;
        objArr[2] = 1;
        objArr[3] = 1;
        objArr[4] = null;
        gVar2.a(objArr);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.e.b
    public final void d() {
        View view;
        SearchSuicideInfo searchSuicideInfo = this.K;
        if (searchSuicideInfo != null) {
            d dVar = this.f82577e;
            if (dVar == null) {
                l.a("searchSuicideAdapter");
            } else {
                dVar.a(searchSuicideInfo);
            }
        }
        d dVar2 = this.f82577e;
        if (dVar2 == null) {
            l.a("searchSuicideAdapter");
        }
        if (!dVar2.l()) {
            d dVar3 = this.f82577e;
            if (dVar3 == null) {
                l.a("searchSuicideAdapter");
            } else {
                SearchSuicideInfo searchSuicideInfo2 = new SearchSuicideInfo();
                searchSuicideInfo2.type = 5;
                dVar3.b(n.c(searchSuicideInfo2));
            }
        }
        ArrayList arrayList = new ArrayList();
        g gVar = this.n;
        if (gVar == null) {
            l.a("searchSuicidePresenter");
        } else {
            List<Aweme> d2 = gVar.d();
            if (d2 != null) {
                for (T t : d2) {
                    d dVar4 = this.f82577e;
                    if (dVar4 == null) {
                        l.a("searchSuicideAdapter");
                    } else {
                        String aid = t.getAid();
                        l.b(aid, "");
                        if (dVar4.a(aid) == -1) {
                            SearchSuicideInfo searchSuicideInfo3 = new SearchSuicideInfo();
                            searchSuicideInfo3.type = 6;
                            searchSuicideInfo3.aweme = t;
                            arrayList.add(searchSuicideInfo3);
                        }
                    }
                }
            }
        }
        d dVar5 = this.f82577e;
        if (dVar5 == null) {
            l.a("searchSuicideAdapter");
        } else {
            dVar5.b(arrayList);
        }
        this.f82578j = true;
        if (!(this.f82579k || (view = getView()) == null)) {
            view.postDelayed(new b(this), 500);
        }
    }

    public static final /* synthetic */ d a(f fVar) {
        d dVar = fVar.f82577e;
        if (dVar == null) {
            l.a("searchSuicideAdapter");
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        d dVar = this.f82577e;
        if (dVar == null) {
            l.a("searchSuicideAdapter");
        }
        dVar.i();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.e.a
    public final void a(GlobalDoodleConfig globalDoodleConfig) {
        d dVar = this.f82577e;
        if (dVar == null) {
            l.a("searchSuicideAdapter");
        }
        dVar.f82564d = globalDoodleConfig;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.e.a
    public final void a(LogPbBean logPbBean) {
        d dVar = this.f82577e;
        if (dVar == null) {
            l.a("searchSuicideAdapter");
        }
        if (logPbBean == null) {
            logPbBean = new LogPbBean();
        }
        dVar.f82565e = logPbBean;
    }

    @r
    public final void onVideoEvent(ag agVar) {
        l.d(agVar, "");
        if (ab_()) {
            int i2 = agVar.f93450a;
            if (i2 == 13) {
                RecyclerView recyclerView = this.o;
                if (recyclerView == null) {
                    l.a("recyclerView");
                }
                int childCount = recyclerView.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    RecyclerView recyclerView2 = this.o;
                    if (recyclerView2 == null) {
                        l.a("recyclerView");
                    }
                    View childAt = recyclerView2.getChildAt(i3);
                    RecyclerView recyclerView3 = this.o;
                    if (recyclerView3 == null) {
                        l.a("recyclerView");
                    }
                    RecyclerView.ViewHolder a2 = recyclerView3.a(childAt);
                    if (a2 instanceof com.ss.android.ugc.aweme.discover.n.a) {
                        ((com.ss.android.ugc.aweme.discover.n.a) a2).H();
                    }
                }
            } else if (i2 == 21) {
                Object obj = agVar.f93451b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                Aweme aweme = (Aweme) obj;
                if (aweme != null) {
                    d dVar = this.f82577e;
                    if (dVar == null) {
                        l.a("searchSuicideAdapter");
                    }
                    String aid = aweme.getAid();
                    l.b(aid, "");
                    int a3 = dVar.a(aid);
                    if (a3 != -1) {
                        RecyclerView recyclerView4 = this.o;
                        if (recyclerView4 == null) {
                            l.a("recyclerView");
                        }
                        if (recyclerView4.getLayoutManager() instanceof m) {
                            RecyclerView recyclerView5 = this.o;
                            if (recyclerView5 == null) {
                                l.a("recyclerView");
                            }
                            if (recyclerView5.getLayoutManager() instanceof GridLayoutManager) {
                                RecyclerView recyclerView6 = this.o;
                                if (recyclerView6 == null) {
                                    l.a("recyclerView");
                                }
                                RecyclerView.i layoutManager = recyclerView6.getLayoutManager();
                                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                                int k2 = linearLayoutManager.k();
                                int m2 = linearLayoutManager.m();
                                if (a3 < k2 || a3 > m2) {
                                    RecyclerView recyclerView7 = this.o;
                                    if (recyclerView7 == null) {
                                        l.a("recyclerView");
                                    }
                                    RecyclerView.i layoutManager2 = recyclerView7.getLayoutManager();
                                    Objects.requireNonNull(layoutManager2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.views.ILayoutMangerScroll");
                                    ((m) layoutManager2).a(a3, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.e.a
    public final void a(boolean z) {
        PleaseNotice pleaseNotice;
        String str;
        this.f82579k = z;
        d dVar = this.f82577e;
        if (dVar == null) {
            l.a("searchSuicideAdapter");
        }
        List list = dVar.f76354l;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((SearchSuicideInfo) next).pleaseNotice != null) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        new v("selfharm_sign").f();
        SearchPreventSuicide searchPreventSuicide = this.f82573a;
        if (!(searchPreventSuicide == null || (str = searchPreventSuicide.showResultsType) == null)) {
            int hashCode = str.hashCode();
            if (hashCode != -1729769847) {
                if (hashCode != 255172472) {
                    if (hashCode == 1986246200 && str.equals("show_directly")) {
                        d();
                        return;
                    }
                    return;
                } else if (!str.equals("no_results")) {
                    return;
                } else {
                    return;
                }
            } else if (!str.equals("show_with_button")) {
                return;
            }
        }
        SearchPreventSuicide searchPreventSuicide2 = this.f82573a;
        if (searchPreventSuicide2 != null && (pleaseNotice = searchPreventSuicide2.pleaseNotice) != null) {
            SearchSuicideInfo searchSuicideInfo = new SearchSuicideInfo();
            searchSuicideInfo.type = 4;
            searchSuicideInfo.pleaseNotice = pleaseNotice;
            searchSuicideInfo.globalDoodleConfig = this.f82576d;
            this.K = searchSuicideInfo;
            d dVar2 = this.f82577e;
            if (dVar2 == null) {
                l.a("searchSuicideAdapter");
            }
            SearchSuicideInfo[] searchSuicideInfoArr = new SearchSuicideInfo[1];
            SearchSuicideInfo searchSuicideInfo2 = this.K;
            if (searchSuicideInfo2 == null) {
                l.b();
            }
            searchSuicideInfoArr[0] = searchSuicideInfo2;
            dVar2.b(n.c(searchSuicideInfoArr));
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.e.a
    public final void d(List<? extends Aweme> list, boolean z) {
        l.d(list, "");
        if (this.f82578j) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                d dVar = this.f82577e;
                if (dVar == null) {
                    l.a("searchSuicideAdapter");
                } else {
                    String aid = t.getAid();
                    l.b(aid, "");
                    if (dVar.a(aid) == -1) {
                        SearchSuicideInfo searchSuicideInfo = new SearchSuicideInfo();
                        searchSuicideInfo.type = 6;
                        searchSuicideInfo.aweme = t;
                        arrayList.add(searchSuicideInfo);
                    }
                }
            }
            d dVar2 = this.f82577e;
            if (dVar2 == null) {
                l.a("searchSuicideAdapter");
            } else {
                dVar2.b(arrayList);
            }
            if (!z) {
                View view = getView();
                if (view != null) {
                    view.postDelayed(new c(this), 500);
                    return;
                }
                return;
            }
            d dVar3 = this.f82577e;
            if (dVar3 == null) {
                l.a("searchSuicideAdapter");
            }
            dVar3.c(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.e.b
    public final void a(View view, Aweme aweme) {
        String str;
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && view != null && aweme != null && getActivity() != null) {
            g gVar = this.n;
            if (gVar == null) {
                l.a("searchSuicidePresenter");
            }
            com.ss.android.ugc.aweme.discover.j.d dVar = (com.ss.android.ugc.aweme.discover.j.d) gVar.f76396h;
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
            ae.f95296a = dVar;
            Bundle bundle = new Bundle();
            bundle.putString("id", aweme.getAid());
            bundle.putString("refer", "selfharm");
            bundle.putString("video_from", "from_search");
            bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
            bundle.putInt("page_type", 9);
            bundle.putString("search_keyword", u());
            androidx.core.app.b b2 = androidx.core.app.b.b(view, view.getWidth(), view.getHeight());
            l.b(b2, "");
            SmartRouter.buildRoute(getActivity(), "//aweme/detail").withParam(bundle).withBundleAnimation(b2.a()).withParam("activity_has_activity_options", true).open();
            com.ss.android.ugc.aweme.feed.d.b.a(aweme);
            RecyclerView recyclerView = this.o;
            if (recyclerView == null) {
                l.a("recyclerView");
            }
            int i2 = -1;
            if (recyclerView.getLayoutManager() != null) {
                RecyclerView recyclerView2 = this.o;
                if (recyclerView2 == null) {
                    l.a("recyclerView");
                }
                if (recyclerView2.getLayoutManager() != null) {
                    i2 = RecyclerView.i.e(view);
                }
            }
            d dVar2 = this.r;
            if (dVar2 != null) {
                str = dVar2.getKeyword();
            } else {
                str = null;
            }
            o.a(view, "search_result", aweme, str, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<DialList> list;
        int i2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        EventBus.a(EventBus.a(), this);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cbi);
        l.b(recyclerView, "");
        this.o = recyclerView;
        g gVar = new g();
        this.n = gVar;
        gVar.a_(this);
        g gVar2 = this.n;
        if (gVar2 == null) {
            l.a("searchSuicidePresenter");
        } else {
            e eVar = new e();
            l.d("tiktok_ssh", "");
            ((com.ss.android.ugc.aweme.discover.j.d) eVar).f81234a = "tiktok_ssh";
            String str = this.f82575c;
            if (str != null) {
                l.d(str, "");
                ((com.ss.android.ugc.aweme.discover.j.d) eVar).f81235b = str;
            }
            gVar2.a((com.ss.android.ugc.aweme.common.b) eVar);
        }
        this.f82577e = new d(this);
        RecyclerView recyclerView2 = this.o;
        if (recyclerView2 == null) {
            l.a("recyclerView");
        }
        if (recyclerView2 != null) {
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getActivity(), 2);
            wrapGridLayoutManager.b(1);
            recyclerView2.setLayoutManager(wrapGridLayoutManager);
        }
        d dVar = this.f82577e;
        if (dVar == null) {
            l.a("searchSuicideAdapter");
        }
        RecyclerView recyclerView3 = this.o;
        if (recyclerView3 == null) {
            l.a("recyclerView");
        }
        dVar.g(androidx.core.content.b.c(recyclerView3.getContext(), R.color.c5));
        d dVar2 = this.f82577e;
        if (dVar2 == null) {
            l.a("searchSuicideAdapter");
        }
        RecyclerView recyclerView4 = this.o;
        if (recyclerView4 == null) {
            l.a("recyclerView");
        }
        dVar2.g(androidx.core.content.b.c(recyclerView4.getContext(), R.color.nd));
        d dVar3 = this.f82577e;
        if (dVar3 == null) {
            l.a("searchSuicideAdapter");
        }
        dVar3.a((h.a) this);
        RecyclerView recyclerView5 = this.o;
        if (recyclerView5 == null) {
            l.a("recyclerView");
        }
        d dVar4 = this.f82577e;
        if (dVar4 == null) {
            l.a("searchSuicideAdapter");
        }
        recyclerView5.setAdapter(dVar4);
        RecyclerView recyclerView6 = this.o;
        if (recyclerView6 == null) {
            l.a("recyclerView");
        }
        recyclerView6.a(new com.ss.android.ugc.aweme.discover.jedi.a.b((int) com.bytedance.common.utility.n.b(getContext(), 8.0f), true));
        RecyclerView recyclerView7 = this.o;
        if (recyclerView7 == null) {
            l.a("recyclerView");
        }
        recyclerView7.setItemAnimator(new androidx.recyclerview.widget.i());
        d dVar5 = this.f82577e;
        if (dVar5 == null) {
            l.a("searchSuicideAdapter");
        }
        RecyclerView recyclerView8 = this.o;
        if (recyclerView8 == null) {
            l.a("recyclerView");
        }
        dVar5.g(androidx.core.content.b.c(recyclerView8.getContext(), R.color.c4));
        RecyclerView recyclerView9 = this.o;
        if (recyclerView9 == null) {
            l.a("recyclerView");
        }
        recyclerView9.setOverScrollMode(2);
        RecyclerView recyclerView10 = this.o;
        if (recyclerView10 == null) {
            l.a("recyclerView");
        }
        RecyclerView.f itemAnimator = recyclerView10.getItemAnimator();
        if (itemAnimator == null) {
            l.b();
        }
        l.b(itemAnimator, "");
        itemAnimator.f3833l = 0;
        g gVar3 = this.n;
        if (gVar3 == null) {
            l.a("searchSuicidePresenter");
        } else if (gVar3 != null) {
            Object[] objArr = new Object[5];
            objArr[0] = 1;
            d dVar6 = this.f82574b;
            objArr[1] = dVar6 != null ? dVar6.getKeyword() : null;
            objArr[2] = 1;
            objArr[3] = 1;
            objArr[4] = null;
            gVar3.a(objArr);
        }
        SearchPreventSuicide searchPreventSuicide = this.f82573a;
        if (searchPreventSuicide != null) {
            l.d(searchPreventSuicide, "");
            SearchOperation searchOperation = searchPreventSuicide.searchOperation;
            if (searchOperation != null) {
                d dVar7 = this.f82577e;
                if (dVar7 == null) {
                    l.a("searchSuicideAdapter");
                } else {
                    SearchSuicideInfo searchSuicideInfo = new SearchSuicideInfo();
                    searchSuicideInfo.type = 1;
                    searchSuicideInfo.searchOperation = searchOperation;
                    searchSuicideInfo.globalDoodleConfig = this.f82576d;
                    dVar7.a((Object) searchSuicideInfo);
                }
            }
            l.d(searchPreventSuicide, "");
            ArrayList arrayList = new ArrayList();
            Tools tools = searchPreventSuicide.tools;
            if (!(tools == null || (list = tools.searchDialInfos) == null)) {
                for (T t : list) {
                    SearchSuicideInfo searchSuicideInfo2 = new SearchSuicideInfo();
                    String str2 = t.type;
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != 114009) {
                            if (hashCode == 114715 && str2.equals("tel")) {
                                i2 = 2;
                                searchSuicideInfo2.type = i2;
                                searchSuicideInfo2.globalDoodleConfig = this.f82576d;
                                searchSuicideInfo2.searchDialInfo = t.searchDialInfo;
                                arrayList.add(searchSuicideInfo2);
                            }
                        } else if (str2.equals("sms")) {
                            i2 = 3;
                            searchSuicideInfo2.type = i2;
                            searchSuicideInfo2.globalDoodleConfig = this.f82576d;
                            searchSuicideInfo2.searchDialInfo = t.searchDialInfo;
                            arrayList.add(searchSuicideInfo2);
                        }
                    }
                    i2 = -1;
                    searchSuicideInfo2.type = i2;
                    searchSuicideInfo2.globalDoodleConfig = this.f82576d;
                    searchSuicideInfo2.searchDialInfo = t.searchDialInfo;
                    arrayList.add(searchSuicideInfo2);
                }
            }
            d dVar8 = this.f82577e;
            if (dVar8 == null) {
                l.a("searchSuicideAdapter");
            } else {
                dVar8.b(arrayList);
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.av6, viewGroup, false);
    }
}
