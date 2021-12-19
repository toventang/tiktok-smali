package com.ss.android.ugc.aweme.discover.ui.suggest;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.k.bj;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.bl;
import com.ss.android.ugc.aweme.utils.by;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class DiscoverySuggestSearchViewHolder extends JediSimpleViewHolder<DiscoverSectionItem> implements al.a, al.a {

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<com.bytedance.ies.powerlist.b.a> f82742f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public SearchEnterViewModel f82743g;

    /* renamed from: j  reason: collision with root package name */
    private PowerList f82744j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f82745k;

    /* renamed from: l  reason: collision with root package name */
    private final h f82746l;

    /* renamed from: m  reason: collision with root package name */
    private final h f82747m;

    static {
        Covode.recordClassIndex(51538);
    }

    private final b m() {
        return (b) this.f82747m.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class c extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f82750a = new c();

        static {
            Covode.recordClassIndex(51541);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(gb.a(GlobalContext.getContext()));
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f82751a = new d();

        static {
            Covode.recordClassIndex(51542);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b(gb.a(GlobalContext.getContext()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f82748a;

        static {
            Covode.recordClassIndex(51539);
        }

        public a(boolean z) {
            this.f82748a = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            super.getItemOffsets(rect, view, recyclerView, sVar);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            if (((GridLayoutManager.b) layoutParams).f3768a % 2 == 0) {
                if (this.f82748a) {
                    rect.left = (int) by.a(8);
                } else {
                    rect.right = (int) by.a(8);
                }
            }
            if (RecyclerView.d(view) < 2) {
                rect.bottom = (int) by.a(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f82749a;

        static {
            Covode.recordClassIndex(51540);
        }

        public b(boolean z) {
            this.f82749a = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            if (this.f82749a) {
                int d2 = RecyclerView.d(view);
                if (d2 == 0) {
                    rect.right = (int) by.a(16);
                } else if (d2 != 3) {
                    rect.right = (int) by.a(8);
                } else {
                    rect.right = (int) by.a(8);
                    rect.left = (int) by.a(16);
                }
            } else {
                int d3 = RecyclerView.d(view);
                if (d3 == 0) {
                    rect.left = (int) by.a(16);
                } else if (d3 != 3) {
                    rect.left = (int) by.a(8);
                } else {
                    rect.left = (int) by.a(8);
                    rect.right = (int) by.a(16);
                }
            }
        }
    }

    private void a(RecyclerView.h hVar) {
        l.d(hVar, "");
        while (this.f82744j.getItemDecorationCount() > 0) {
            this.f82744j.e();
        }
        this.f82744j.a(hVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r0 == null) goto L_0x004b;
     */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem r10) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchViewHolder.a(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoverySuggestSearchViewHolder(View view, e eVar) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.eel);
        l.b(findViewById, "");
        this.f82744j = (PowerList) findViewById;
        View findViewById2 = view.findViewById(R.id.amp);
        l.b(findViewById2, "");
        this.f82745k = (TuxTextView) findViewById2;
        this.f82744j.setItemAnimator(null);
        this.f82744j.a(DiscoverySuggestSearchSingleLineCell.class, DiscoverySuggestSearchBreakLineCell.class);
        this.f82743g = SearchEnterViewModel.a.a(eVar);
        this.f82746l = h.i.a((h.f.a.a) c.f82750a);
        this.f82747m = h.i.a((h.f.a.a) d.f82751a);
    }

    private void a(List<Word> list, boolean z) {
        int i2;
        TuxTextView tuxTextView = this.f82745k;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        o.a(tuxTextView, i2);
        a((RecyclerView.h) m());
        com.bytedance.tux.h.i.b(this.f82744j, 0, 0, 0, Integer.valueOf((int) by.a(8)), false, 16);
        View view = this.itemView;
        l.b(view, "");
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        this.f82744j.setLayoutManager(linearLayoutManager);
        this.f82744j.getState().a();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f82744j.getState().a(new b(it.next(), 0, this));
            }
        }
    }

    private void b(List<Word> list, boolean z) {
        int i2;
        int a2;
        TuxTextView tuxTextView = this.f82745k;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        o.a(tuxTextView, i2);
        a((RecyclerView.h) m());
        PowerList powerList = this.f82744j;
        if (z) {
            a2 = 0;
        } else {
            a2 = (int) by.a(4);
        }
        com.bytedance.tux.h.i.b(powerList, 0, Integer.valueOf(a2), 0, Integer.valueOf((int) by.a(12)), false, 16);
        View view = this.itemView;
        l.b(view, "");
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        this.f82744j.setLayoutManager(linearLayoutManager);
        this.f82744j.getState().a();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f82744j.getState().a(new a(it.next(), this));
            }
        }
    }

    private void c(List<Word> list, boolean z) {
        int i2;
        TuxTextView tuxTextView = this.f82745k;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        o.a(tuxTextView, i2);
        a((RecyclerView.h) ((a) this.f82746l.getValue()));
        com.bytedance.tux.h.i.b(this.f82744j, Integer.valueOf((int) by.a(16)), 0, Integer.valueOf((int) by.a(16)), Integer.valueOf((int) by.a(8)), false, 16);
        View view = this.itemView;
        l.b(view, "");
        view.getContext();
        this.f82744j.setLayoutManager(new GridLayoutManager(2));
        this.f82744j.getState().a();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f82744j.getState().a(new b(it.next(), 1, this));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.a
    public final void a(int i2, Word word) {
        com.ss.android.ugc.aweme.search.model.b bVar;
        if (word != null) {
            com.ss.android.ugc.aweme.search.model.d wordType = new com.ss.android.ugc.aweme.search.model.d().setSearchFrom("recom_search").setKeyword(word.getWord()).setWordType(word.getWordType());
            SearchEnterViewModel searchEnterViewModel = this.f82743g;
            if (searchEnterViewModel != null) {
                bVar = searchEnterViewModel.f82794a;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.setFromDiscoverSuggestSearch(true);
            }
            com.ss.android.ugc.aweme.search.h hVar = com.ss.android.ugc.aweme.search.h.f121133a;
            View view = this.itemView;
            l.b(view, "");
            Context context = view.getContext();
            l.b(wordType, "");
            hVar.a(new com.ss.android.ugc.aweme.search.model.c(context, wordType, bVar, (com.ss.android.ugc.aweme.search.n.d) null, 120));
            l.d(word, "");
            ((com.ss.android.ugc.aweme.search.k.c) ((bk) new bj().v("recom_search").d(Integer.valueOf(i2)).x("").w(word.getWord()).a((Integer) -1)).y("discovery").i(word.getId())).d(word.getImplId()).f();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.a
    public final void b(int i2, Word word) {
        if (word != null) {
            l.d(word, "");
            ((com.ss.android.ugc.aweme.search.k.c) ((bk) new bl().v("recom_search").d(Integer.valueOf(i2)).x("").w(word.getWord()).a((Integer) -1)).y("discovery").i(word.getId())).d(word.getImplId()).f();
        }
    }
}
