package com.ss.android.ugc.aweme.detail.ui.b;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.i;
import com.ss.android.ugc.aweme.detail.i.k;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class c implements aa, aa.a {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Aweme> f79930a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends Aweme> f79931b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f79932c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f79933d = true;

    /* renamed from: e  reason: collision with root package name */
    public MixFlowParam f79934e;

    /* renamed from: f  reason: collision with root package name */
    public MixFlowParam f79935f;

    /* renamed from: g  reason: collision with root package name */
    private int f79936g;

    /* renamed from: h  reason: collision with root package name */
    private final aa f79937h;

    /* renamed from: i  reason: collision with root package name */
    private final aa f79938i;

    /* renamed from: j  reason: collision with root package name */
    private final List<Aweme> f79939j;

    static {
        Covode.recordClassIndex(49731);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean deleteItem(String str) {
        l.d(str, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadLatest() {
        return this.f79937h.cannotLoadLatest();
    }

    private final boolean c() {
        aa aaVar = this.f79937h;
        if (!(aaVar instanceof aa.a) || aaVar.cannotLoadLatest()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this.f79933d || this.f79932c) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final Object getViewModel() {
        Object viewModel = this.f79937h.getViewModel();
        if (viewModel == null) {
            return new Object();
        }
        return viewModel;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isDataEmpty() {
        if (!this.f79938i.isDataEmpty() || !this.f79937h.isDataEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isLoading() {
        if (!this.f79938i.isLoading() || !this.f79937h.isLoading()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void unInit() {
        this.f79938i.unInit();
        this.f79937h.unInit();
        List<? extends Aweme> list = this.f79931b;
        if (list != null) {
            for (T t : list) {
                t.mixFlowParam = null;
                t.setSearchFeedType(null);
            }
        }
        List<? extends Aweme> list2 = this.f79930a;
        if (list2 != null) {
            for (T t2 : list2) {
                t2.mixFlowParam = null;
                t2.setSearchFeedType(null);
            }
        }
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public final List<Aweme> a() {
        List<? extends Aweme> list = this.f79930a;
        List<? extends Aweme> list2 = this.f79931b;
        if (this.f79936g < 0 || list2 == null || list2.isEmpty() || this.f79936g > list2.size()) {
            return this.f79930a;
        }
        if (list == null || list.isEmpty()) {
            return this.f79931b;
        }
        ArrayList arrayList = new ArrayList();
        if (c() && !this.f79937h.cannotLoadMore()) {
            arrayList.addAll(list);
        } else if (c() && this.f79937h.cannotLoadMore()) {
            arrayList.addAll(list);
            arrayList.addAll(list2.subList(this.f79936g + 1, list2.size()));
        } else if (c() || this.f79937h.cannotLoadMore()) {
            arrayList.addAll(list2.subList(0, this.f79936g));
            arrayList.addAll(list);
            arrayList.addAll(list2.subList(this.f79936g + 1, list2.size()));
        } else {
            arrayList.addAll(list2.subList(0, this.f79936g));
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final int getPageType(int i2) {
        return this.f79937h.getPageType(i2);
    }

    public final boolean a(int i2) {
        int i3;
        int i4;
        List<? extends Aweme> list = this.f79931b;
        if (list != null) {
            i3 = d.a(list, this.f79936g);
        } else {
            i3 = this.f79936g;
        }
        List<? extends Aweme> list2 = this.f79930a;
        if (list2 != null) {
            i4 = list2.size();
        } else {
            i4 = 0;
        }
        int i5 = i4 + i3;
        if (i2 < i3 || i2 >= i5) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void bindView(ad adVar) {
        l.d(adVar, "");
        this.f79937h.bindView(new a(this, adVar));
        this.f79938i.bindView(new b(this, adVar));
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        l.d(fragment, "");
        if (this.f79936g < 0) {
            this.f79936g = 0;
        }
        Object viewModel = this.f79938i.getViewModel();
        Objects.requireNonNull(viewModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.presenter.IAwemeListProvider");
        List<Aweme> a2 = ((k) viewModel).a();
        this.f79931b = a2;
        if (a2 != null) {
            for (T t : a2) {
                t.mixFlowParam = this.f79935f;
                t.setSearchFeedType("SearchMixFeed");
            }
        }
        List<Aweme> list = this.f79939j;
        this.f79930a = list;
        if (list != null) {
            for (T t2 : list) {
                t2.mixFlowParam = this.f79934e;
                t2.setSearchFeedType("detailFeed");
            }
        }
        if (!this.f79937h.init(fragment) || !this.f79938i.init(fragment)) {
            return false;
        }
        return true;
    }

    public final class a implements ad {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f79940a;

        /* renamed from: b  reason: collision with root package name */
        private final ad f79941b;

        static {
            Covode.recordClassIndex(49732);
        }

        @Override // com.ss.android.ugc.aweme.detail.i.m
        public final void a(Aweme aweme) {
            this.f79941b.a(aweme);
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void a(Exception exc) {
            this.f79941b.a(exc);
        }

        @Override // com.ss.android.ugc.aweme.detail.i.l
        public final void a(List<Aweme> list) {
            this.f79941b.a(list);
        }

        @Override // com.ss.android.ugc.aweme.common.e.d
        public final void a(List<Aweme> list, int i2) {
            this.f79941b.a(list, i2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.common.e.i] */
        @Override // com.ss.android.ugc.aweme.common.e.d
        public final boolean a(i<Aweme> iVar) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void aO_() {
            this.f79941b.aO_();
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ad
        public final Fragment az_() {
            return this.f79941b.az_();
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void b() {
            this.f79941b.b();
        }

        @Override // com.ss.android.ugc.aweme.common.e.d
        public final void b(int i2) {
            this.f79941b.b(i2);
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void b(Exception exc) {
            this.f79941b.b(exc);
        }

        @Override // com.ss.android.ugc.aweme.detail.i.m
        public final void b_(Exception exc) {
            this.f79941b.b_(exc);
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void bh_() {
            this.f79941b.bh_();
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void c(Exception exc) {
            this.f79941b.c(exc);
        }

        @Override // com.ss.android.ugc.aweme.feed.u.x
        public final void c(boolean z) {
            this.f79941b.c(z);
        }

        @Override // com.ss.android.ugc.aweme.detail.i.l
        public final void c_(Exception exc) {
            this.f79941b.c_(exc);
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void f() {
            this.f79941b.f();
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ad
        public final void l() {
            this.f79941b.l();
        }

        public a(c cVar, ad adVar) {
            l.d(adVar, "");
            this.f79940a = cVar;
            this.f79941b = adVar;
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void b(List<Aweme> list, boolean z) {
            this.f79940a.f79930a = list;
            List<? extends Aweme> list2 = this.f79940a.f79930a;
            if (list2 != null) {
                for (T t : list2) {
                    t.mixFlowParam = this.f79940a.f79934e;
                    t.setSearchFeedType("detailFeed");
                }
            }
            this.f79940a.f79933d = z;
            this.f79941b.b(this.f79940a.a(), this.f79940a.b());
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void c(List<Aweme> list, boolean z) {
            this.f79940a.f79930a = list;
            List<? extends Aweme> list2 = this.f79940a.f79930a;
            if (list2 != null) {
                for (T t : list2) {
                    t.mixFlowParam = this.f79940a.f79934e;
                    t.setSearchFeedType("detailFeed");
                }
            }
            this.f79941b.c(this.f79940a.a(), z);
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void a(List<Aweme> list, boolean z) {
            this.f79940a.f79930a = list;
            List<? extends Aweme> list2 = this.f79940a.f79930a;
            if (list2 != null) {
                for (T t : list2) {
                    t.mixFlowParam = this.f79940a.f79934e;
                    t.setSearchFeedType("detailFeed");
                }
            }
            this.f79940a.f79933d = z;
            this.f79941b.a(this.f79940a.a(), this.f79940a.b());
        }
    }

    public final class b implements ad {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f79942a;

        /* renamed from: b  reason: collision with root package name */
        private final ad f79943b;

        static {
            Covode.recordClassIndex(49733);
        }

        @Override // com.ss.android.ugc.aweme.detail.i.m
        public final void a(Aweme aweme) {
            this.f79943b.a(aweme);
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void a(Exception exc) {
            this.f79943b.a(exc);
        }

        @Override // com.ss.android.ugc.aweme.detail.i.l
        public final void a(List<Aweme> list) {
            this.f79943b.a(list);
        }

        @Override // com.ss.android.ugc.aweme.common.e.d
        public final void a(List<Aweme> list, int i2) {
            this.f79943b.a(list, i2);
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void a(List<Aweme> list, boolean z) {
            this.f79943b.a(list, z);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.common.e.i] */
        @Override // com.ss.android.ugc.aweme.common.e.d
        public final boolean a(i<Aweme> iVar) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void aO_() {
            this.f79943b.aO_();
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ad
        public final Fragment az_() {
            return this.f79943b.az_();
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void b() {
            this.f79943b.b();
        }

        @Override // com.ss.android.ugc.aweme.common.e.d
        public final void b(int i2) {
            this.f79943b.b(i2);
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void b(Exception exc) {
            this.f79943b.b(exc);
        }

        @Override // com.ss.android.ugc.aweme.detail.i.m
        public final void b_(Exception exc) {
            this.f79943b.b_(exc);
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void bh_() {
            this.f79943b.bh_();
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void c(Exception exc) {
            this.f79943b.c(exc);
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void c(List<Aweme> list, boolean z) {
            this.f79943b.c(list, z);
        }

        @Override // com.ss.android.ugc.aweme.feed.u.x
        public final void c(boolean z) {
            this.f79943b.c(z);
        }

        @Override // com.ss.android.ugc.aweme.detail.i.l
        public final void c_(Exception exc) {
            this.f79943b.c_(exc);
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void f() {
            this.f79943b.f();
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ad
        public final void l() {
            this.f79943b.l();
        }

        public b(c cVar, ad adVar) {
            l.d(adVar, "");
            this.f79942a = cVar;
            this.f79943b = adVar;
        }

        @Override // com.ss.android.ugc.aweme.common.e.c
        public final void b(List<Aweme> list, boolean z) {
            this.f79942a.f79931b = list;
            List<? extends Aweme> list2 = this.f79942a.f79931b;
            if (list2 != null) {
                for (T t : list2) {
                    t.mixFlowParam = this.f79942a.f79935f;
                    t.setSearchFeedType("SearchMixFeed");
                }
            }
            this.f79942a.f79932c = z;
            this.f79943b.b(this.f79942a.a(), this.f79942a.b());
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 4) {
                if (this.f79937h.cannotLoadMore()) {
                    this.f79938i.request(i2, bVar, i3, z);
                    return;
                }
            } else {
                return;
            }
        }
        this.f79937h.request(i2, bVar, i3, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(MixFlowParam mixFlowParam, MixFlowParam mixFlowParam2, int i2, aa aaVar, aa aaVar2, List<? extends Aweme> list) {
        l.d(mixFlowParam, "");
        l.d(mixFlowParam2, "");
        l.d(aaVar, "");
        l.d(aaVar2, "");
        this.f79934e = mixFlowParam;
        this.f79935f = mixFlowParam2;
        this.f79936g = i2;
        this.f79937h = aaVar;
        this.f79938i = aaVar2;
        this.f79939j = list;
    }
}
