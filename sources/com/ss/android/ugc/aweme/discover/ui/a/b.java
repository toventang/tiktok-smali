package com.ss.android.ugc.aweme.discover.ui.a;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.ui.Dialog.d;
import com.ss.android.ugc.aweme.search.g.c;
import com.ss.android.ugc.aweme.search.g.e;
import com.ss.android.ugc.aweme.search.g.f;
import com.ss.android.ugc.aweme.search.g.g;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.n.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

public final class b extends com.ss.android.ugc.aweme.base.f.a implements com.ss.android.ugc.aweme.discover.ui.a.b.b {

    /* renamed from: a  reason: collision with root package name */
    public e f82203a;

    /* renamed from: b  reason: collision with root package name */
    public d f82204b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.g.b f82205c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f82206d;

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f82207e;

    /* renamed from: j  reason: collision with root package name */
    public a f82208j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f82209k;

    /* renamed from: l  reason: collision with root package name */
    public SearchStateViewModel f82210l;

    /* renamed from: m  reason: collision with root package name */
    private final h f82211m = i.a((h.f.a.a) a.f82212a);
    private SparseArray n;

    static {
        Covode.recordClassIndex(51161);
    }

    public final com.ss.android.ugc.aweme.discover.ui.a.a.a.a a() {
        return (com.ss.android.ugc.aweme.discover.ui.a.a.a.a) this.f82211m.getValue();
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.discover.ui.a.a.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f82212a = new a();

        static {
            Covode.recordClassIndex(51162);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.ui.a.a.a.a invoke() {
            return new com.ss.android.ugc.aweme.discover.ui.a.a.a.a();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        c();
        super.onDestroy();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final void d() {
        a aVar = this.f82208j;
        if (aVar != null) {
            aVar.a(a().a(), this.f82206d);
            aVar.notifyDataSetChanged();
        }
    }

    public final void c() {
        c cVar;
        c cVar2;
        com.ss.android.ugc.aweme.search.g.a aVar;
        RecyclerView.i layoutManager;
        a aVar2 = this.f82208j;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
        RecyclerView recyclerView = this.f82207e;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            layoutManager.e(0);
        }
        d dVar = this.f82204b;
        if (dVar != null) {
            dVar.a(false);
        }
        com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar3 = a().f82192a;
        if (!(aVar3 == null || (aVar = aVar3.f82218d) == null)) {
            aVar.reset();
        }
        com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar4 = a().f82192a;
        if (!(aVar4 == null || (cVar2 = aVar4.f82217c) == null)) {
            cVar2.reset();
        }
        com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar5 = a().f82192a;
        if (!(aVar5 == null || (cVar = aVar5.f82216b) == null)) {
            cVar.reset();
        }
        this.f82205c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.discover.ui.a.b.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.a.b.b():void");
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a.b.b
    public final void a(f fVar) {
        ad adVar;
        int i2;
        String str;
        String str2;
        String str3;
        c cVar;
        l.d(fVar, "");
        com.ss.android.ugc.aweme.discover.ui.a.a.a.a a2 = a();
        l.d(fVar, "");
        com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar = a2.f82192a;
        String str4 = null;
        if (!(aVar == null || (cVar = aVar.f82216b) == null)) {
            cVar.setCollapsed(null);
        }
        a2.f82194c = true;
        String str5 = com.ss.android.ugc.aweme.search.k.f.q;
        l.d(str5, "");
        q a3 = am.a();
        if (a3 != null) {
            adVar = a3.c();
        } else {
            adVar = null;
        }
        com.ss.android.ugc.aweme.search.k.f fVar2 = new com.ss.android.ugc.aweme.search.k.f();
        q a4 = am.a();
        if (a4 != null) {
            i2 = a4.a();
        } else {
            i2 = 0;
        }
        com.ss.android.ugc.aweme.search.k.c f2 = fVar2.f(j.a(i2));
        if (adVar != null) {
            str = adVar.f121173b;
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.search.k.c b2 = f2.b(str);
        if (adVar != null) {
            str2 = adVar.f121172a;
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.metrics.c a5 = ((com.ss.android.ugc.aweme.search.k.f) b2.a(str2)).r("by_all").a("button_type", str5);
        com.ss.android.ugc.aweme.search.n.h b3 = d.a.b();
        if (b3 != null) {
            str3 = b3.getSearchKeyword();
        } else {
            str3 = null;
        }
        com.ss.android.ugc.aweme.metrics.c a6 = a5.a("search_keyword_x", str3);
        com.ss.android.ugc.aweme.search.n.h b4 = d.a.b();
        if (b4 != null) {
            str4 = b4.getSearchId();
        }
        a6.a("search_id_x", str4).f();
        this.f82209k = true;
        d();
        if (getActivity() != null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            com.ss.android.ugc.aweme.discover.ui.Dialog.d b5 = d.a.b(activity);
            if (b5 != null) {
                d.b bVar = b5.o;
                if (bVar != null) {
                    double b6 = (double) com.bytedance.ies.dmt.ui.f.b.b(b5.getActivity());
                    Double.isNaN(b6);
                    bVar.f82120b = (int) (b6 * 0.9d);
                }
                b5.c();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        RecyclerView.i layoutManager;
        WeakReference<b.d> weakReference;
        b.d dVar;
        com.ss.android.ugc.aweme.search.g.a aVar;
        WeakReference<b.d> weakReference2;
        b.d dVar2;
        com.ss.android.ugc.aweme.search.g.a aVar2;
        c cVar;
        g gVar;
        c cVar2;
        c cVar3;
        g gVar2;
        c cVar4;
        e eVar;
        super.onHiddenChanged(z);
        com.ss.android.ugc.aweme.discover.ui.Dialog.d dVar3 = this.f82204b;
        if (dVar3 != null) {
            dVar3.a(false);
        }
        List<com.ss.android.ugc.aweme.search.g.h> list = null;
        if (z) {
            com.ss.android.ugc.aweme.search.g.b bVar = this.f82205c;
            if (!(bVar == null || (eVar = this.f82203a) == null)) {
                eVar.a(bVar);
            }
            com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar3 = a().f82192a;
            if (!(aVar3 == null || (cVar3 = aVar3.f82217c) == null)) {
                com.ss.android.ugc.aweme.search.g.b bVar2 = this.f82205c;
                if (bVar2 == null || (gVar2 = bVar2.getSortTypeStruct()) == null) {
                    com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar4 = a().f82192a;
                    if (aVar4 == null || (cVar4 = aVar4.f82217c) == null) {
                        gVar2 = null;
                    } else {
                        gVar2 = cVar4.getDefaultOption();
                    }
                }
                cVar3.selectOption(gVar2);
            }
            com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar5 = a().f82192a;
            if (!(aVar5 == null || (cVar = aVar5.f82216b) == null)) {
                com.ss.android.ugc.aweme.search.g.b bVar3 = this.f82205c;
                if (bVar3 == null || (gVar = bVar3.getFilterByStruct()) == null) {
                    com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar6 = a().f82192a;
                    if (aVar6 == null || (cVar2 = aVar6.f82216b) == null) {
                        gVar = null;
                    } else {
                        gVar = cVar2.getDefaultOption();
                    }
                }
                cVar.selectOption(gVar);
            }
            if (this.f82205c == null) {
                com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar7 = a().f82192a;
                if (!(aVar7 == null || (aVar2 = aVar7.f82218d) == null)) {
                    aVar2.reset();
                }
            } else {
                com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar8 = a().f82192a;
                if (!(aVar8 == null || (aVar = aVar8.f82218d) == null)) {
                    com.ss.android.ugc.aweme.search.g.b bVar4 = this.f82205c;
                    if (bVar4 != null) {
                        list = bVar4.getActivitySwitchOption();
                    }
                    aVar.setLastOptionData(list);
                }
            }
            if (!(this.f82210l != null || (weakReference2 = com.ss.android.ugc.aweme.autoplay.e.a.f67463a) == null || (dVar2 = weakReference2.get()) == null)) {
                dVar2.x();
            }
            SearchStateViewModel searchStateViewModel = this.f82210l;
            if (searchStateViewModel != null) {
                searchStateViewModel.setShowingFilters(false);
                return;
            }
            return;
        }
        if (!(this.f82210l != null || (weakReference = com.ss.android.ugc.aweme.autoplay.e.a.f67463a) == null || (dVar = weakReference.get()) == null)) {
            dVar.y();
        }
        SearchStateViewModel searchStateViewModel2 = this.f82210l;
        if (searchStateViewModel2 != null) {
            searchStateViewModel2.setShowingFilters(true);
        }
        RecyclerView recyclerView = this.f82207e;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            layoutManager.e(0);
        }
        a aVar9 = this.f82208j;
        if (aVar9 != null) {
            aVar9.a(a().a(), this.f82206d);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f82207e = (RecyclerView) view.findViewById(R.id.djj);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(1);
        RecyclerView recyclerView = this.f82207e;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        a aVar = new a(this);
        this.f82208j = aVar;
        RecyclerView recyclerView2 = this.f82207e;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(aVar);
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ae.a(activity, (ad.b) null).a(SearchStateViewModel.class);
            this.f82210l = searchStateViewModel;
            if (searchStateViewModel != null) {
                searchStateViewModel.setShowingFilters(true);
            }
        }
        a aVar2 = this.f82208j;
        if (aVar2 != null) {
            aVar2.a(a().a(), this.f82206d);
        }
        c();
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.auz, viewGroup, false);
    }
}
