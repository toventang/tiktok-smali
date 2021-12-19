package com.bytedance.creativex.recorder.filter.panel;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.ac;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.a.ag;
import h.p;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class FilterPanelViewModel extends LifecycleAwareViewModel<FilterPanelState> implements com.bytedance.creativex.recorder.filter.a.d {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.creativex.recorder.filter.a.a f28280a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f28281b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final t<com.bytedance.creativex.recorder.filter.a.k> f28282c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    final f.a.l.c<com.ss.android.ugc.aweme.filter.view.a.c> f28283d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.o.f f28284e;

    /* renamed from: f  reason: collision with root package name */
    public final o f28285f;

    /* renamed from: g  reason: collision with root package name */
    final h.f.a.b<Activity, Boolean> f28286g;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f28287l = h.i.a((h.f.a.a) new a(this));

    /* renamed from: m  reason: collision with root package name */
    private final f.a.t<com.ss.android.ugc.aweme.filter.view.a.c> f28288m;
    private final boolean n;

    static {
        Covode.recordClassIndex(16595);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.d
    public final f.a.t<com.ss.android.ugc.aweme.filter.view.a.c> b() {
        return this.f28288m;
    }

    @Override // com.bytedance.creativex.recorder.filter.a.d
    public final LiveData<com.bytedance.creativex.recorder.filter.a.k> a() {
        return com.bytedance.k.a.a(this.f28282c);
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.bytedance.creativex.recorder.b.a.d> {
        final /* synthetic */ FilterPanelViewModel this$0;

        static {
            Covode.recordClassIndex(16596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FilterPanelViewModel filterPanelViewModel) {
            super(0);
            this.this$0 = filterPanelViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.creativex.recorder.b.a.d invoke() {
            Object a2 = this.this$0.f28284e.a(com.bytedance.creativex.recorder.b.a.d.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new FilterPanelState(new a.C1131a(), null, this.n, ag.a(), null, 0, 48, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        this.f28280a.getCurSelectedFilter().a(this, new b(this));
        this.f28285f.f().c().observe(this, new c(this));
        this.f28285f.f().b().observe(this, new d(this));
        a(Integer.MIN_VALUE);
        this.f28285f.a();
    }

    static final class b<T> implements com.bytedance.als.m<FilterBean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FilterPanelViewModel f28289a;

        static {
            Covode.recordClassIndex(16597);
        }

        b(FilterPanelViewModel filterPanelViewModel) {
            this.f28289a = filterPanelViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(FilterBean filterBean) {
            final FilterBean filterBean2 = filterBean;
            this.f28289a.d(new h.f.a.b<FilterPanelState, FilterPanelState>() {
                /* class com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(16598);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
                    FilterPanelState filterPanelState2 = filterPanelState;
                    h.f.b.l.d(filterPanelState2, "");
                    return FilterPanelState.copy$default(filterPanelState2, null, filterBean2, false, null, null, 0, 61, null);
                }
            });
        }
    }

    static final class c<T> implements com.bytedance.als.m<List<? extends p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FilterPanelViewModel f28290a;

        static {
            Covode.recordClassIndex(16599);
        }

        c(FilterPanelViewModel filterPanelViewModel) {
            this.f28290a = filterPanelViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(List<? extends p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>> list) {
            final List<? extends p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>> list2 = list;
            this.f28290a.d(new h.f.a.b<FilterPanelState, FilterPanelState>() {
                /* class com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(16600);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
                    FilterPanelState filterPanelState2 = filterPanelState;
                    h.f.b.l.d(filterPanelState2, "");
                    return FilterPanelState.copy$default(filterPanelState2, null, null, false, com.ss.android.ugc.aweme.filter.repository.a.a.a.b(list2), null, 0, 55, null);
                }
            });
        }
    }

    static final class d<T> implements com.bytedance.als.m<List<? extends FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FilterPanelViewModel f28291a;

        static {
            Covode.recordClassIndex(16601);
        }

        d(FilterPanelViewModel filterPanelViewModel) {
            this.f28291a = filterPanelViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(List<? extends FilterBean> list) {
            List<? extends FilterBean> list2 = list;
            if (list2 != null) {
                FilterPanelViewModel filterPanelViewModel = this.f28291a;
                filterPanelViewModel.b_(new m(filterPanelViewModel, list2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        c(new i(i2));
    }

    static final class f extends h.f.b.m implements h.f.a.b<FilterPanelState, FilterPanelState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f28294a = new f();

        static {
            Covode.recordClassIndex(16604);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            h.f.b.l.d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, null, false, null, new com.bytedance.jedi.arch.p(), 0, 47, null);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<FilterPanelState, FilterPanelState> {
        final /* synthetic */ boolean $disable;

        static {
            Covode.recordClassIndex(16605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(boolean z) {
            super(1);
            this.$disable = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            h.f.b.l.d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, null, this.$disable, null, null, 0, 59, null);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<FilterPanelState, FilterPanelState> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f28295a = new h();

        static {
            Covode.recordClassIndex(16606);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            h.f.b.l.d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, null, false, null, null, 0, 61, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.b<FilterPanelState, FilterPanelState> {
        final /* synthetic */ int $filterId;

        static {
            Covode.recordClassIndex(16607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(int i2) {
            super(1);
            this.$filterId = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            h.f.b.l.d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, null, false, null, null, this.$filterId, 31, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<FilterPanelState, FilterPanelState> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f28296a = new j();

        static {
            Covode.recordClassIndex(16608);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            h.f.b.l.d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, null, false, null, null, 0, 59, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<FilterPanelState, FilterPanelState> {
        final /* synthetic */ FilterBean $filter;

        static {
            Covode.recordClassIndex(16609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(FilterBean filterBean) {
            super(1);
            this.$filter = filterBean;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            h.f.b.l.d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, this.$filter, false, null, null, 0, 61, null);
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.a.d
    public final void a(boolean z) {
        d(new l(this, z));
        ((com.bytedance.creativex.recorder.b.a.d) this.f28287l.getValue()).a(new ac(!z, false, 6));
    }

    static final class l extends h.f.b.m implements h.f.a.b<FilterPanelState, FilterPanelState> {
        final /* synthetic */ boolean $show;
        final /* synthetic */ FilterPanelViewModel this$0;

        static {
            Covode.recordClassIndex(16610);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(FilterPanelViewModel filterPanelViewModel, boolean z) {
            super(1);
            this.this$0 = filterPanelViewModel;
            this.$show = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            com.bytedance.ui_component.a aVar;
            FilterPanelState filterPanelState2 = filterPanelState;
            h.f.b.l.d(filterPanelState2, "");
            if (this.$show) {
                aVar = new a.b();
                this.this$0.f28282c.setValue(com.bytedance.creativex.recorder.filter.a.k.ON_SHOWN);
            } else {
                aVar = new a.C1131a();
                this.this$0.f28282c.setValue(com.bytedance.creativex.recorder.filter.a.k.ON_DISMISSED);
            }
            return FilterPanelState.copy$default(filterPanelState2, aVar, null, false, null, null, 0, 62, null);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<FilterPanelState, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.filter.view.a.a $event;
        final /* synthetic */ FilterPanelViewModel this$0;

        static {
            Covode.recordClassIndex(16602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FilterPanelViewModel filterPanelViewModel, com.ss.android.ugc.aweme.filter.view.a.a aVar) {
            super(1);
            this.this$0 = filterPanelViewModel;
            this.$event = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FilterPanelState filterPanelState) {
            final FilterBean filterBean;
            FilterPanelState filterPanelState2 = filterPanelState;
            h.f.b.l.d(filterPanelState2, "");
            FilterBean selectedFilter = filterPanelState2.getSelectedFilter();
            if (selectedFilter != null && selectedFilter.getId() == this.$event.f95754b.f95539a.f95550a) {
                List<FilterBean> value = this.this$0.f28285f.f().b().getValue();
                if (value == null || value.isEmpty()) {
                    filterBean = com.ss.android.ugc.aweme.filter.repository.a.a.a.b();
                } else {
                    filterBean = value.get(0);
                }
                this.this$0.f28281b.post(new Runnable(this) {
                    /* class com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f28292a;

                    static {
                        Covode.recordClassIndex(16603);
                    }

                    {
                        this.f28292a = r1;
                    }

                    public final void run() {
                        this.f28292a.this$0.a(filterBean, true);
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<FilterPanelState, z> {
        final /* synthetic */ List $availableFilters;
        final /* synthetic */ FilterPanelViewModel this$0;

        static {
            Covode.recordClassIndex(16611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(FilterPanelViewModel filterPanelViewModel, List list) {
            super(1);
            this.this$0 = filterPanelViewModel;
            this.$availableFilters = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FilterPanelState filterPanelState) {
            Object obj;
            FilterPanelState filterPanelState2 = filterPanelState;
            h.f.b.l.d(filterPanelState2, "");
            Iterator it = this.$availableFilters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((FilterBean) obj).getId() == filterPanelState2.getPendingSelected()) {
                    break;
                }
            }
            final FilterBean filterBean = (FilterBean) obj;
            if (!(filterPanelState2.getPendingSelected() == Integer.MIN_VALUE || filterBean == null)) {
                this.this$0.a(Integer.MIN_VALUE);
                this.this$0.f28281b.post(new Runnable(this) {
                    /* class com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel.m.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ m f28297a;

                    static {
                        Covode.recordClassIndex(16612);
                    }

                    {
                        this.f28297a = r1;
                    }

                    public final void run() {
                        this.f28297a.this$0.a(filterBean, true);
                    }
                });
            }
            return z.f158842a;
        }
    }

    public final void a(FilterBean filterBean, boolean z) {
        String str;
        if (com.ss.android.ugc.aweme.filter.repository.a.a.c.a(this.f28285f, filterBean)) {
            if (filterBean != null) {
                com.bytedance.creativex.recorder.filter.a.a aVar = this.f28280a;
                if (z) {
                    str = "filter_box";
                } else {
                    str = null;
                }
                aVar.setFilterChosen(filterBean, str, true, true, false);
                this.f28280a.setFilterDisable(false, "build_in");
                c(j.f28296a);
            }
            d(new k(filterBean));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super android.app.Activity, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public FilterPanelViewModel(com.bytedance.o.f fVar, o oVar, boolean z, h.f.a.b<? super Activity, Boolean> bVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(oVar, "");
        this.f28284e = fVar;
        this.f28285f = oVar;
        this.n = z;
        this.f28286g = bVar;
        Object a2 = fVar.a(com.bytedance.creativex.recorder.filter.a.a.class);
        h.f.b.l.b(a2, "");
        this.f28280a = (com.bytedance.creativex.recorder.filter.a.a) a2;
        f.a.l.c<com.ss.android.ugc.aweme.filter.view.a.c> cVar = new f.a.l.c<>();
        h.f.b.l.b(cVar, "");
        this.f28283d = cVar;
        f.a.t<com.ss.android.ugc.aweme.filter.view.a.c> c2 = cVar.c();
        h.f.b.l.b(c2, "");
        this.f28288m = c2;
    }
}
