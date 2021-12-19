package com.bytedance.ext_power_list;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import com.bytedance.assem.arch.b.v;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.g;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.vm.ScopeViewModel;
import h.f.b.l;
import h.f.b.m;
import h.w;
import java.lang.ref.WeakReference;

public final class k {
    static {
        Covode.recordClassIndex(16884);
    }

    static final class a extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_getDefaultViewModelProviderFactoryProducer;

        static {
            Covode.recordClassIndex(16885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.bytedance.assem.arch.core.a aVar) {
            super(0);
            this.$this_getDefaultViewModelProviderFactoryProducer = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            return this.$this_getDefaultViewModelProviderFactoryProducer.q();
        }
    }

    public static final class b extends m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<S>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f28699a = new b();

        static {
            Covode.recordClassIndex(16886);
        }

        b() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b(true);
        }
    }

    static final class c extends m implements h.f.a.a<com.bytedance.assem.arch.core.d> {
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_getHierarchyDataStoreProducer;

        static {
            Covode.recordClassIndex(16887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.bytedance.assem.arch.core.a aVar) {
            super(0);
            this.$this_getHierarchyDataStoreProducer = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.core.d invoke() {
            return this.$this_getHierarchyDataStoreProducer.bx_().f25533f;
        }
    }

    static final class d extends m implements h.f.a.a<com.bytedance.assem.arch.core.e> {
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_getHierarchyServiceStoreProducer;

        static {
            Covode.recordClassIndex(16888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.assem.arch.core.a aVar) {
            super(0);
            this.$this_getHierarchyServiceStoreProducer = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.core.e invoke() {
            return this.$this_getHierarchyServiceStoreProducer.bx_().f25534g;
        }
    }

    public static final class e implements h.h.d<Object, VM> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f28700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f28701b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f28702c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f28703d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.k.c f28704e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f28705f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f28706g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f28707h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f28708i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ e f28709j;

        static {
            Covode.recordClassIndex(16889);
        }

        public static final class a extends i.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ af f28710a;

            static {
                Covode.recordClassIndex(16890);
            }

            a(af afVar) {
                this.f28710a = afVar;
            }

            @Override // androidx.fragment.app.i.b
            public final void onFragmentDestroyed(androidx.fragment.app.i iVar, Fragment fragment) {
                l.c(iVar, "");
                l.c(fragment, "");
                super.onFragmentDestroyed(iVar, fragment);
                this.f28710a.a();
            }
        }

        private VM a(h.k.i<?> iVar) {
            af afVar;
            ad.b bVar;
            com.bytedance.assem.arch.core.d dVar;
            ad.b bVar2;
            com.bytedance.assem.arch.core.d dVar2;
            l.c(iVar, "");
            com.bytedance.assem.arch.viewModel.i iVar2 = this.f28701b;
            com.bytedance.assem.arch.core.e eVar = null;
            if (l.a(iVar2, i.a.f25718a)) {
                Context ar_ = this.f28700a.ar_();
                if (ar_ != null) {
                    androidx.fragment.app.e eVar2 = (androidx.fragment.app.e) ar_;
                    if (eVar2 != null) {
                        af viewModelStore = eVar2.getViewModelStore();
                        l.a((Object) viewModelStore, "");
                        h.f.a.a aVar = this.f28702c;
                        if (aVar == null || (bVar2 = (ad.b) aVar.invoke()) == null) {
                            bVar2 = this.f28700a.q();
                        }
                        VM vm = (VM) ((AssemViewModel) a(new ad(viewModelStore, bVar2), (String) this.f28703d.invoke(), h.f.a.a(this.f28704e)));
                        if (vm.f25685b) {
                            l.a((Object) vm, "");
                            return vm;
                        }
                        vm.a(new WeakReference<>(this.f28700a.f25546d));
                        h.f.a.a aVar2 = this.f28705f;
                        if (aVar2 != null) {
                            dVar2 = (com.bytedance.assem.arch.core.d) aVar2.invoke();
                        } else {
                            dVar2 = null;
                        }
                        vm.f25687d = dVar2;
                        h.f.a.a aVar3 = this.f28706g;
                        if (aVar3 != null) {
                            eVar = (com.bytedance.assem.arch.core.e) aVar3.invoke();
                        }
                        vm.f25688e = eVar;
                        vm.a((g) this.f28707h.invoke(), this.f28708i);
                        l.a((Object) vm, "");
                        l.a((Object) vm, "");
                        return vm;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new w("null cannot be cast to non-null type");
            } else if (l.a(iVar2, i.d.f25721a)) {
                Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this.f28700a);
                if (a2 != null) {
                    try {
                        afVar = a2.getViewModelStore();
                    } catch (IllegalStateException unused) {
                        afVar = new af();
                        androidx.fragment.app.i fragmentManager = a2.getFragmentManager();
                        if (fragmentManager != null) {
                            fragmentManager.a((i.b) new a(afVar), false);
                        }
                    }
                    h.f.a.a aVar4 = this.f28702c;
                    if (aVar4 == null || (bVar = (ad.b) aVar4.invoke()) == null) {
                        bVar = this.f28700a.q();
                    }
                    VM vm2 = (VM) ((AssemViewModel) a(new ad(afVar, bVar), (String) this.f28703d.invoke(), h.f.a.a(this.f28704e)));
                    if (vm2.f25685b) {
                        l.a((Object) vm2, "");
                        return vm2;
                    }
                    vm2.a(new WeakReference<>(this.f28700a.f25546d));
                    h.f.a.a aVar5 = this.f28705f;
                    if (aVar5 != null) {
                        dVar = (com.bytedance.assem.arch.core.d) aVar5.invoke();
                    } else {
                        dVar = null;
                    }
                    vm2.f25687d = dVar;
                    h.f.a.a aVar6 = this.f28706g;
                    if (aVar6 != null) {
                        eVar = (com.bytedance.assem.arch.core.e) aVar6.invoke();
                    }
                    vm2.f25688e = eVar;
                    vm2.a((g) this.f28707h.invoke(), this.f28708i);
                    l.a((Object) vm2, "");
                    l.a((Object) vm2, "");
                    return vm2;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (l.a(iVar2, i.c.f25720a) || iVar2 == null) {
                return (VM) this.f28709j.a();
            } else {
                throw new IllegalArgumentException("Don't support this VMScope: " + this.f28701b + " there");
            }
        }

        @Override // h.h.d
        public final /* bridge */ /* synthetic */ Object a(Object obj, h.k.i iVar) {
            return a(iVar);
        }

        private static ac a(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }

        e(T t, com.bytedance.assem.arch.viewModel.i iVar, h.f.a.a aVar, h.f.a.a aVar2, h.k.c cVar, h.f.a.a aVar3, h.f.a.a aVar4, h.f.a.a aVar5, h.f.a.b bVar, e eVar) {
            this.f28700a = t;
            this.f28701b = iVar;
            this.f28702c = aVar;
            this.f28703d = aVar2;
            this.f28704e = cVar;
            this.f28705f = aVar3;
            this.f28706g = aVar4;
            this.f28707h = aVar5;
            this.f28708i = bVar;
            this.f28709j = eVar;
        }
    }

    public static final h.f.a.a<ad.b> a(com.bytedance.assem.arch.core.a aVar) {
        l.c(aVar, "");
        return new a(aVar);
    }

    public static final h.f.a.a<com.bytedance.assem.arch.core.d> b(com.bytedance.assem.arch.core.a aVar) {
        l.c(aVar, "");
        return new c(aVar);
    }

    public static final h.f.a.a<com.bytedance.assem.arch.core.e> c(com.bytedance.assem.arch.core.a aVar) {
        l.c(aVar, "");
        return new d(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: T extends com.bytedance.assem.arch.b.v<? extends com.bytedance.tiktok.proxy.d> & com.bytedance.assem.arch.b.i<ITEM> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <VM extends AssemViewModel<S>, S extends j, T extends v<? extends com.bytedance.tiktok.proxy.d> & com.bytedance.assem.arch.b.i<ITEM>, ITEM> h.h.d<Object, VM> a(T t, h.k.c<VM> cVar, com.bytedance.assem.arch.viewModel.i iVar, h.f.a.a<String> aVar, h.f.a.a<? extends g<S>> aVar2, h.f.a.a<? extends ad.b> aVar3, h.f.a.b<? super S, ? extends S> bVar, h.f.a.m<? super S, ? super ITEM, ? extends S> mVar, h.f.a.m<? super ITEM, ? super S, ? extends ITEM> mVar2, h.f.a.a<com.bytedance.assem.arch.core.d> aVar4, h.f.a.a<com.bytedance.assem.arch.core.e> aVar5) {
        l.c(t, "");
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(bVar, "");
        e eVar = new e(t, cVar, aVar, aVar2, aVar3, bVar, mVar, mVar2, aVar4, aVar5);
        if (iVar == null || l.a(iVar, i.c.f25720a)) {
            l.c(eVar, "");
            t.f25471h.add(eVar);
        }
        return new e(t, iVar, aVar3, aVar, cVar, aVar4, aVar5, aVar2, bVar, eVar);
    }
}
