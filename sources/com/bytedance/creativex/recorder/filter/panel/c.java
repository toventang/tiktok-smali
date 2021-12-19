package com.bytedance.creativex.recorder.filter.panel;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxViewModel;
import com.ss.android.ugc.aweme.filter.view.internal.main.l;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b {

    /* renamed from: l  reason: collision with root package name */
    public static final b f28312l = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.filter.view.a.j f28313a;

    /* renamed from: b  reason: collision with root package name */
    com.ss.android.ugc.aweme.filter.view.a.f f28314b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.filter.view.internal.e f28315c;

    /* renamed from: d  reason: collision with root package name */
    boolean f28316d;

    /* renamed from: e  reason: collision with root package name */
    final f.a.b.a f28317e = new f.a.b.a();

    /* renamed from: f  reason: collision with root package name */
    final C0605c f28318f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.o.f f28319g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.filter.repository.a.m f28320h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.filter.repository.a.o f28321i;

    /* renamed from: j  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.filter.repository.a.i f28322j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.filter.view.internal.d f28323k;
    private final h.h t;
    private final h.h u;

    static {
        Covode.recordClassIndex(16619);
    }

    public final FilterPanelViewModel a() {
        return (FilterPanelViewModel) this.t.getValue();
    }

    public final androidx.appcompat.app.d b() {
        return (androidx.appcompat.app.d) this.u.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(16621);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.filter.view.a.f> {
        final /* synthetic */ com.ss.android.ugc.aweme.filter.view.a.f $view;

        static {
            Covode.recordClassIndex(16639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(com.ss.android.ugc.aweme.filter.view.a.f fVar) {
            super(0);
            this.$view = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.filter.view.a.f invoke() {
            return this.$view;
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    static final class p extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.filter.view.a.j> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.filter.view.a.j invoke() {
            return c.a(this.this$0);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<androidx.appcompat.app.d> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16623);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.appcompat.app.d invoke() {
            Activity t = this.this$0.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            return t;
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        com.ss.android.ugc.aweme.filter.repository.internal.utils.a.f95749a.clear();
        com.ss.android.ugc.aweme.filter.repository.internal.utils.a.f95750b.clear();
        com.ss.android.ugc.aweme.filter.repository.internal.utils.a.f95751c = null;
    }

    static final class r extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            FilterPanelViewModel a2 = this.this$0.a();
            androidx.appcompat.app.d b2 = this.this$0.b();
            if (a2.f28286g == null || a2.f28286g.invoke(b2).booleanValue()) {
                a2.f28285f.a();
                a2.c(FilterPanelViewModel.f.f28294a);
            }
            return z.f158842a;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<FilterPanelViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(16620);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_bytedance_creativex_recorder_filter_panel_RecordFilterPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_bytedance_creativex_recorder_filter_panel_RecordFilterPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.creativex.recorder.filter.panel.c.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_bytedance_creativex_recorder_filter_panel_RecordFilterPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final void a(h.f.a.b<? super androidx.appcompat.app.d, z> bVar) {
        bVar.invoke(b());
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$c  reason: collision with other inner class name */
    public class C0605c {

        /* renamed from: a  reason: collision with root package name */
        public com.ss.android.ugc.tools.view.a.d f28324a;

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.b<? super l.c, z> f28325b;

        /* renamed from: c  reason: collision with root package name */
        public com.ss.android.ugc.aweme.filter.view.internal.filterbox.e f28326c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f28327d;

        static {
            Covode.recordClassIndex(16622);
        }

        public /* synthetic */ C0605c(c cVar) {
            this(cVar, new com.ss.android.ugc.tools.view.a.e(), new com.ss.android.ugc.aweme.filter.view.internal.filterbox.e());
        }

        private C0605c(c cVar, com.ss.android.ugc.tools.view.a.d dVar, com.ss.android.ugc.aweme.filter.view.internal.filterbox.e eVar) {
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(eVar, "");
            this.f28327d = cVar;
            this.f28324a = dVar;
            this.f28325b = null;
            this.f28326c = eVar;
        }
    }

    static final class f<T> implements f.a.d.f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28329a;

        static {
            Covode.recordClassIndex(16625);
        }

        f(c cVar) {
            this.f28329a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Boolean bool) {
            this.f28329a.a().a(Integer.MIN_VALUE);
        }
    }

    static final class j<T> implements f.a.d.f<am<com.ss.android.ugc.aweme.filter.view.a.e, Integer, FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28331a;

        static {
            Covode.recordClassIndex(16629);
        }

        j(c cVar) {
            this.f28331a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(am<com.ss.android.ugc.aweme.filter.view.a.e, Integer, FilterBean> amVar) {
            final am<com.ss.android.ugc.aweme.filter.view.a.e, Integer, FilterBean> amVar2 = amVar;
            this.f28331a.a(new h.f.a.b<androidx.appcompat.app.d, z>(this) {
                /* class com.bytedance.creativex.recorder.filter.panel.c.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(16630);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(androidx.appcompat.app.d dVar) {
                    h.f.b.l.d(dVar, "");
                    FilterPanelViewModel a2 = this.this$0.f28331a.a();
                    C c2 = amVar2.f39389c;
                    int intValue = amVar2.f39388b.intValue();
                    h.f.b.l.d(c2, "");
                    a2.f28280a.setFilterProgress(c2, intValue);
                    return z.f158842a;
                }
            });
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.filter.view.a.j a(c cVar) {
        com.ss.android.ugc.aweme.filter.view.a.j jVar = cVar.f28313a;
        if (jVar == null) {
            h.f.b.l.a("filterView");
        }
        return jVar;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.filter.view.internal.e b(c cVar) {
        com.ss.android.ugc.aweme.filter.view.internal.e eVar = cVar.f28315c;
        if (eVar == null) {
            h.f.b.l.a("combiner");
        }
        return eVar;
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class g<T> implements f.a.d.f<com.bytedance.jedi.a.c.f<? extends FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28330a;

        static {
            Covode.recordClassIndex(16626);
        }

        g(c cVar) {
            this.f28330a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.bytedance.jedi.a.c.f<? extends FilterBean> fVar) {
            this.f28330a.a().a((FilterBean) fVar.a(), false);
        }
    }

    static final class k<T> implements f.a.d.f<com.ss.android.ugc.aweme.filter.view.a.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28332a;

        static {
            Covode.recordClassIndex(16631);
        }

        k(c cVar) {
            this.f28332a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.filter.view.a.c cVar) {
            FilterPanelViewModel a2 = this.f28332a.a();
            h.f.b.l.b(cVar, "");
            h.f.b.l.d(cVar, "");
            a2.f28283d.onNext(cVar);
        }
    }

    static final class m<T> implements f.a.d.f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28334a;

        static {
            Covode.recordClassIndex(16633);
        }

        m(c cVar) {
            this.f28334a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f28334a.a(new h.f.a.b<androidx.appcompat.app.d, z>(this) {
                    /* class com.bytedance.creativex.recorder.filter.panel.c.m.AnonymousClass1 */
                    final /* synthetic */ m this$0;

                    static {
                        Covode.recordClassIndex(16634);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(androidx.appcompat.app.d dVar) {
                        h.f.b.l.d(dVar, "");
                        this.this$0.f28334a.withState(this.this$0.f28334a.a(), new h.f.a.b<FilterPanelState, z>(this) {
                            /* class com.bytedance.creativex.recorder.filter.panel.c.m.AnonymousClass1.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(16635);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(FilterPanelState filterPanelState) {
                                FilterPanelState filterPanelState2 = filterPanelState;
                                h.f.b.l.d(filterPanelState2, "");
                                if (filterPanelState2.getUi() instanceof a.b) {
                                    this.this$0.this$0.f28334a.a().a(false);
                                }
                                return z.f158842a;
                            }
                        });
                        return z.f158842a;
                    }
                });
            }
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<FilterPanelState, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            h.f.b.l.d(filterPanelState2, "");
            if (filterPanelState2.getDisableFilter()) {
                c.a(this.this$0).d();
            }
            return z.f158842a;
        }
    }

    static final class l<T> implements f.a.d.f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28333a;

        static {
            Covode.recordClassIndex(16632);
        }

        l(c cVar) {
            this.f28333a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Boolean bool) {
            Boolean bool2 = bool;
            FilterPanelViewModel a2 = this.f28333a.a();
            h.f.b.l.b(bool2, "");
            boolean booleanValue = bool2.booleanValue();
            a2.f28280a.setFilterDisable(booleanValue, "build_in");
            a2.c(new FilterPanelViewModel.g(booleanValue));
            if (booleanValue) {
                a2.d(FilterPanelViewModel.h.f28295a);
            }
        }
    }

    static final class e<T> implements f.a.d.f<com.ss.android.ugc.aweme.filter.view.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28328a;

        static {
            Covode.recordClassIndex(16624);
        }

        e(c cVar) {
            this.f28328a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.filter.view.a.a aVar) {
            com.ss.android.ugc.aweme.filter.view.a.a aVar2 = aVar;
            FilterPanelViewModel a2 = this.f28328a.a();
            h.f.b.l.b(aVar2, "");
            h.f.b.l.d(aVar2, "");
            int i2 = b.f28311a[aVar2.f95753a.ordinal()];
            if (i2 == 1 || i2 == 2) {
                List<FilterBean> value = a2.f28285f.f().b().getValue();
                T t = null;
                if (value != null) {
                    Iterator<T> it = value.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (next.getId() == aVar2.f95754b.f95539a.f95550a) {
                            t = next;
                            break;
                        }
                    }
                    T t2 = t;
                    if (t2 != null) {
                        a2.a((FilterBean) t2, true);
                        return;
                    }
                }
                a2.a(aVar2.f95754b.f95539a.f95550a);
            } else if (i2 == 3) {
                a2.a(Integer.MIN_VALUE);
                a2.b_(new FilterPanelViewModel.e(a2, aVar2));
            }
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<androidx.appcompat.app.d, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(androidx.appcompat.app.d dVar) {
            com.ss.android.ugc.aweme.filter.view.internal.filterbox.c cVar;
            com.ss.android.ugc.tools.view.a.c cVar2;
            h.f.b.l.d(dVar, "");
            c cVar3 = this.this$0;
            if (!cVar3.f28316d) {
                View findViewById = cVar3.n.findViewById(R.id.dix);
                h.f.b.l.b(findViewById, "");
                cVar3.f28313a = new com.ss.android.ugc.aweme.filter.view.internal.main.l((ViewGroup) findViewById, cVar3, cVar3.f28321i, cVar3.f28320h, cVar3.f28323k, cVar3.f28318f.f28325b);
                cVar3.withState(cVar3.a(), new o(cVar3));
                q qVar = null;
                if (cVar3.f28322j == null) {
                    cVar = null;
                } else {
                    View findViewById2 = cVar3.n.findViewById(R.id.diy);
                    h.f.b.l.b(findViewById2, "");
                    ViewGroup viewGroup = (ViewGroup) findViewById2;
                    com.ss.android.ugc.aweme.filter.repository.a.i iVar = cVar3.f28322j;
                    com.ss.android.ugc.aweme.filter.view.internal.filterbox.e eVar = cVar3.f28318f.f28326c;
                    h.f.b.l.d(viewGroup, "");
                    h.f.b.l.d(cVar3, "");
                    h.f.b.l.d(iVar, "");
                    h.f.b.l.d(eVar, "");
                    cVar = new com.ss.android.ugc.aweme.filter.view.internal.filterbox.c(viewGroup, cVar3, new FilterBoxViewModel(cVar3, iVar), eVar);
                }
                cVar3.f28314b = cVar;
                p pVar = new p(cVar3);
                com.ss.android.ugc.aweme.filter.view.a.f fVar = cVar3.f28314b;
                if (fVar != null) {
                    qVar = new q(fVar);
                }
                if (cVar3.b() instanceof com.ss.android.ugc.tools.view.a.c) {
                    androidx.appcompat.app.d b2 = cVar3.b();
                    Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                    cVar2 = (com.ss.android.ugc.tools.view.a.c) b2;
                } else {
                    Object a2 = cVar3.f28319g.a(com.bytedance.creativex.recorder.b.a.ab.class);
                    Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                    cVar2 = (com.ss.android.ugc.tools.view.a.c) a2;
                }
                cVar3.f28315c = new com.ss.android.ugc.aweme.filter.view.internal.main.m(pVar, qVar, cVar2, new r(cVar3));
                f.a.b.a aVar = cVar3.f28317e;
                com.ss.android.ugc.aweme.filter.view.a.j jVar = cVar3.f28313a;
                if (jVar == null) {
                    h.f.b.l.a("filterView");
                }
                aVar.a(jVar.f().a(new g(cVar3), com.ss.android.ugc.tools.utils.p.f150012a));
                f.a.b.a aVar2 = cVar3.f28317e;
                com.ss.android.ugc.aweme.filter.view.a.j jVar2 = cVar3.f28313a;
                if (jVar2 == null) {
                    h.f.b.l.a("filterView");
                }
                aVar2.a(jVar2.e().a(new j(cVar3), com.ss.android.ugc.tools.utils.p.f150012a));
                f.a.b.a aVar3 = cVar3.f28317e;
                com.ss.android.ugc.aweme.filter.view.a.j jVar3 = cVar3.f28313a;
                if (jVar3 == null) {
                    h.f.b.l.a("filterView");
                }
                aVar3.a(jVar3.h().a(new k(cVar3), com.ss.android.ugc.tools.utils.p.f150012a));
                f.a.b.a aVar4 = cVar3.f28317e;
                com.ss.android.ugc.aweme.filter.view.a.j jVar4 = cVar3.f28313a;
                if (jVar4 == null) {
                    h.f.b.l.a("filterView");
                }
                aVar4.a(jVar4.g().a(new l(cVar3), com.ss.android.ugc.tools.utils.p.f150012a));
                com.ss.android.ugc.aweme.filter.view.a.f fVar2 = cVar3.f28314b;
                if (fVar2 != null) {
                    cVar3.f28317e.a(fVar2.c().a(new e(cVar3), com.ss.android.ugc.tools.utils.p.f150012a));
                    cVar3.f28317e.a(fVar2.d().a(new f(cVar3), com.ss.android.ugc.tools.utils.p.f150012a));
                }
                f.a.b.a aVar5 = cVar3.f28317e;
                com.ss.android.ugc.aweme.filter.view.internal.e eVar2 = cVar3.f28315c;
                if (eVar2 == null) {
                    h.f.b.l.a("combiner");
                }
                aVar5.a(eVar2.d().a(new m(cVar3), com.ss.android.ugc.tools.utils.p.f150012a));
                h.a.a(cVar3, cVar3.a(), e.f28336a, new n(cVar3));
                h.a.a(cVar3, cVar3.a(), f.f28337a, new h(cVar3));
                b.a.b(cVar3, cVar3.a(), d.f28335a, new i(cVar3));
                cVar3.f28316d = true;
            }
            c.b(this.this$0).a();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            c.b(this.this$0).b();
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
            Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map2 = map;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(map2, "");
            c.a(this.this$0).a(map2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.biv, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, FilterBean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            h.f.b.l.d(iVar, "");
            if (!com.ss.android.ugc.aweme.filter.repository.a.a.a.a(filterBean2, c.a(this.this$0).a())) {
                c.a(this.this$0).a(filterBean2);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    public c(com.bytedance.o.f fVar, com.ss.android.ugc.aweme.filter.repository.a.m mVar, com.ss.android.ugc.aweme.filter.repository.a.o oVar, com.ss.android.ugc.aweme.filter.repository.a.i iVar, com.ss.android.ugc.aweme.filter.view.internal.d dVar, h.f.a.b<? super C0605c, z> bVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(oVar, "");
        this.f28319g = fVar;
        this.f28320h = mVar;
        this.f28321i = oVar;
        this.f28322j = iVar;
        this.f28323k = dVar;
        h.k.c a2 = h.f.b.ab.a(FilterPanelViewModel.class);
        this.t = h.i.a((h.f.a.a) new a(this, a2, a2));
        C0605c cVar = new C0605c(this);
        this.f28318f = cVar;
        if (bVar != null) {
            bVar.invoke(cVar);
        }
        this.u = h.i.a((h.f.a.a) new d(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
