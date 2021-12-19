package com.bytedance.ext_power_list;

import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import com.bytedance.assem.arch.b.k;
import com.bytedance.assem.arch.b.v;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.g;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tiktok.proxy.d;
import h.f.a.m;
import h.f.b.l;
import h.k.c;
import java.lang.ref.WeakReference;

public final class e<S extends j, VM extends AssemViewModel<S>, T extends v<? extends d>, ITEM> implements k<S, VM> {

    /* renamed from: a  reason: collision with root package name */
    public final T f28673a;

    /* renamed from: b  reason: collision with root package name */
    public final c<VM> f28674b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<String> f28675c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.a<g<S>> f28676d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.a<ad.b> f28677e;

    /* renamed from: f  reason: collision with root package name */
    public final h.f.a.b<S, S> f28678f;

    /* renamed from: g  reason: collision with root package name */
    public final m<S, ITEM, S> f28679g;

    /* renamed from: h  reason: collision with root package name */
    public final m<ITEM, S, ITEM> f28680h;

    /* renamed from: i  reason: collision with root package name */
    public final h.f.a.a<com.bytedance.assem.arch.core.d> f28681i;

    /* renamed from: j  reason: collision with root package name */
    public final h.f.a.a<com.bytedance.assem.arch.core.e> f28682j;

    static {
        Covode.recordClassIndex(16873);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f28673a, eVar.f28673a) && l.a(this.f28674b, eVar.f28674b) && l.a(this.f28675c, eVar.f28675c) && l.a(this.f28676d, eVar.f28676d) && l.a(this.f28677e, eVar.f28677e) && l.a(this.f28678f, eVar.f28678f) && l.a(this.f28679g, eVar.f28679g) && l.a(this.f28680h, eVar.f28680h) && l.a(this.f28681i, eVar.f28681i) && l.a(this.f28682j, eVar.f28682j);
    }

    public final int hashCode() {
        T t = this.f28673a;
        int i2 = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        c<VM> cVar = this.f28674b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        h.f.a.a<String> aVar = this.f28675c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        h.f.a.a<g<S>> aVar2 = this.f28676d;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        h.f.a.a<ad.b> aVar3 = this.f28677e;
        int hashCode5 = (hashCode4 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        h.f.a.b<S, S> bVar = this.f28678f;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        m<S, ITEM, S> mVar = this.f28679g;
        int hashCode7 = (hashCode6 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        m<ITEM, S, ITEM> mVar2 = this.f28680h;
        int hashCode8 = (hashCode7 + (mVar2 != null ? mVar2.hashCode() : 0)) * 31;
        h.f.a.a<com.bytedance.assem.arch.core.d> aVar4 = this.f28681i;
        int hashCode9 = (hashCode8 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        h.f.a.a<com.bytedance.assem.arch.core.e> aVar5 = this.f28682j;
        if (aVar5 != null) {
            i2 = aVar5.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "CellScopeViewModelProvideData(host=" + this.f28673a + ", viewModelClass=" + this.f28674b + ", keyFactory=" + this.f28675c + ", dispatcherFactory=" + this.f28676d + ", factoryProducer=" + this.f28677e + ", argumentsAcceptor=" + this.f28678f + ", itemSync2StateAcceptor=" + this.f28679g + ", state2ItemAcceptor=" + this.f28680h + ", hierarchyDataStore=" + this.f28681i + ", hierarchyServiceStore=" + this.f28682j + ")";
    }

    @Override // com.bytedance.assem.arch.b.k
    public final VM a() {
        androidx.lifecycle.m mVar;
        androidx.lifecycle.m mVar2;
        ac a2;
        VM vm;
        VM vm2;
        com.bytedance.assem.arch.core.d dVar;
        com.bytedance.assem.arch.core.e eVar;
        ad.b bVar;
        MethodCollector.i(9411);
        v vVar = this.f28673a;
        while (true) {
            mVar = null;
            if (vVar != null) {
                mVar2 = vVar.by_();
            } else {
                mVar2 = null;
            }
            if (mVar2 instanceof com.bytedance.assem.arch.b.g) {
                break;
            }
            if (vVar != null) {
                mVar = vVar.by_();
            }
            vVar = (v) mVar;
        }
        com.bytedance.assem.arch.b.j jVar = vVar.n;
        if (jVar != null) {
            com.bytedance.assem.arch.b.j jVar2 = this.f28673a.n;
            if (jVar.e() == null) {
                af viewModelStore = jVar.getViewModelStore();
                h.f.a.a<ad.b> aVar = this.f28677e;
                if (aVar == null || (bVar = aVar.invoke()) == null) {
                    bVar = new ad.d();
                }
                jVar.a(new ad(viewModelStore, bVar));
            }
            af viewModelStore2 = jVar.getViewModelStore();
            l.a((Object) viewModelStore2, "");
            synchronized (viewModelStore2) {
                try {
                    ad e2 = jVar.e();
                    if (e2 != null) {
                        String invoke = this.f28675c.invoke();
                        Class a3 = h.f.a.a(this.f28674b);
                        if (a3.equals(ScopeViewModel.class)) {
                            a2 = e2.a(invoke, a3);
                        } else {
                            a2 = e2.a(invoke, a3);
                            ab.a(a2, e2);
                        }
                        l.a((Object) a2, "");
                        vm = (VM) ((AssemViewModel) a2);
                        if (!vm.f25685b) {
                            vm.f25686c = true;
                            vm.a(new WeakReference<>(jVar.getLifecycle()));
                            h.f.a.a<com.bytedance.assem.arch.core.d> aVar2 = this.f28681i;
                            if (aVar2 != null) {
                                dVar = aVar2.invoke();
                            } else {
                                dVar = null;
                            }
                            vm.f25687d = dVar;
                            h.f.a.a<com.bytedance.assem.arch.core.e> aVar3 = this.f28682j;
                            if (aVar3 != null) {
                                eVar = aVar3.invoke();
                            } else {
                                eVar = null;
                            }
                            vm.f25688e = eVar;
                            vm.a(this.f28676d.invoke(), this.f28678f);
                        }
                    } else {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.".toString());
                        MethodCollector.o(9411);
                        throw illegalArgumentException;
                    }
                } finally {
                    MethodCollector.o(9411);
                }
            }
            Object obj = this.f28679g;
            Object obj2 = this.f28680h;
            if (!(vm instanceof j)) {
                vm2 = null;
            } else {
                vm2 = vm;
            }
            j jVar3 = (j) vm2;
            if (jVar3 != null) {
                obj = new a(jVar3);
                obj2 = new b(jVar3);
            }
            if (vm instanceof AssemViewModelWithItem) {
                mVar = vm;
            }
            AssemViewModelWithItem assemViewModelWithItem = (AssemViewModelWithItem) mVar;
            if (assemViewModelWithItem != null) {
                assemViewModelWithItem.f28666j = jVar;
            }
            if (!(obj == null || jVar2 == null)) {
                jVar2.a(vm, (m) h.f.b.ad.b(obj, 2));
            }
            if (!(obj2 == null || jVar.d() == null)) {
                Object a4 = jVar.a();
                Object b2 = h.f.b.ad.b(obj2, 2);
                Object d2 = jVar.d();
                if (d2 == null) {
                    l.a();
                }
                l.c(b2, "");
                l.c(d2, "");
                vm.f25690g = (m) h.f.b.ad.b(b2, 2);
                vm.f25691h = a4;
                vm.f25692i = d2;
            }
            return vm;
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("proxy not bound to Assem yet".toString());
        MethodCollector.o(9411);
        throw illegalArgumentException2;
    }

    static final class a extends h.f.b.m implements m<S, ITEM, S> {
        final /* synthetic */ j $vmAcceptor;

        static {
            Covode.recordClassIndex(16874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(2);
            this.$vmAcceptor = jVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.bytedance.ext_power_list.j */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.m
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            j jVar = (j) obj;
            l.c(jVar, "");
            return this.$vmAcceptor.a(jVar, obj2);
        }
    }

    static final class b extends h.f.b.m implements m<ITEM, S, ITEM> {
        final /* synthetic */ j $vmAcceptor;

        static {
            Covode.recordClassIndex(16875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(2);
            this.$vmAcceptor = jVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.bytedance.ext_power_list.j */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.m
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            j jVar = (j) obj2;
            l.c(jVar, "");
            return this.$vmAcceptor.b(jVar, obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends com.bytedance.assem.arch.viewModel.g<S extends com.bytedance.assem.arch.viewModel.j>> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.m<? super S extends com.bytedance.assem.arch.viewModel.j, ? super ITEM, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.m<? super ITEM, ? super S extends com.bytedance.assem.arch.viewModel.j, ? extends ITEM> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(T t, c<VM> cVar, h.f.a.a<String> aVar, h.f.a.a<? extends g<S>> aVar2, h.f.a.a<? extends ad.b> aVar3, h.f.a.b<? super S, ? extends S> bVar, m<? super S, ? super ITEM, ? extends S> mVar, m<? super ITEM, ? super S, ? extends ITEM> mVar2, h.f.a.a<com.bytedance.assem.arch.core.d> aVar4, h.f.a.a<com.bytedance.assem.arch.core.e> aVar5) {
        l.c(t, "");
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(bVar, "");
        this.f28673a = t;
        this.f28674b = cVar;
        this.f28675c = aVar;
        this.f28676d = aVar2;
        this.f28677e = aVar3;
        this.f28678f = bVar;
        this.f28679g = mVar;
        this.f28680h = mVar2;
        this.f28681i = aVar4;
        this.f28682j = aVar5;
    }
}
