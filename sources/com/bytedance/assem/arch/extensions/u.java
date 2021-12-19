package com.bytedance.assem.arch.extensions;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.covode.number.Covode;
import h.w;

public final class u {
    static {
        Covode.recordClassIndex(14934);
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f25670a = new c();

        static {
            Covode.recordClassIndex(14937);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_getDefaultViewModelProviderFactoryProducer;

        static {
            Covode.recordClassIndex(14943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(com.bytedance.assem.arch.core.a aVar) {
            super(0);
            this.$this_getDefaultViewModelProviderFactoryProducer = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            return this.$this_getDefaultViewModelProviderFactoryProducer.q();
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<S>> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f25671a = new j();

        static {
            Covode.recordClassIndex(14944);
        }

        j() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.d> {
        final /* synthetic */ androidx.fragment.app.e $this_getActivityAssemDataProducer;

        static {
            Covode.recordClassIndex(14935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(androidx.fragment.app.e eVar) {
            super(0);
            this.$this_getActivityAssemDataProducer = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.core.d invoke() {
            return Assembler.a.a(this.$this_getActivityAssemDataProducer).b(this.$this_getActivityAssemDataProducer);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.e> {
        final /* synthetic */ androidx.fragment.app.e $this_getAssemServiceStoreProducer;

        static {
            Covode.recordClassIndex(14939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(androidx.fragment.app.e eVar) {
            super(0);
            this.$this_getAssemServiceStoreProducer = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.core.e invoke() {
            return Assembler.a.a(this.$this_getAssemServiceStoreProducer).c(this.$this_getAssemServiceStoreProducer);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.d> {
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_getHierarchyDataStoreProducer;

        static {
            Covode.recordClassIndex(14946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(com.bytedance.assem.arch.core.a aVar) {
            super(0);
            this.$this_getHierarchyDataStoreProducer = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.core.d invoke() {
            return this.$this_getHierarchyDataStoreProducer.bx_().f25533f;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.e> {
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_getHierarchyServiceStoreProducer;

        static {
            Covode.recordClassIndex(14947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(com.bytedance.assem.arch.core.a aVar) {
            super(0);
            this.$this_getHierarchyServiceStoreProducer = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.core.e invoke() {
            return this.$this_getHierarchyServiceStoreProducer.bx_().f25534g;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ boolean $requireActivity;
        final /* synthetic */ androidx.lifecycle.m $this_getLifecycleOwnerProducer;

        static {
            Covode.recordClassIndex(14948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(androidx.lifecycle.m mVar, boolean z) {
            super(0);
            this.$this_getLifecycleOwnerProducer = mVar;
            this.$requireActivity = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.m invoke() {
            if (!this.$requireActivity) {
                return this.$this_getLifecycleOwnerProducer;
            }
            androidx.lifecycle.m mVar = this.$this_getLifecycleOwnerProducer;
            if (mVar != null) {
                androidx.fragment.app.e requireActivity = ((Fragment) mVar).requireActivity();
                h.f.b.l.a((Object) requireActivity, "");
                return requireActivity;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_getAssemLifecycleOwner;
        final /* synthetic */ boolean $withActivity;

        static {
            Covode.recordClassIndex(14938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.assem.arch.core.a aVar, boolean z) {
            super(0);
            this.$this_getAssemLifecycleOwner = aVar;
            this.$withActivity = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.m invoke() {
            if (this.$withActivity) {
                androidx.fragment.app.e b2 = b.b(this.$this_getAssemLifecycleOwner);
                if (b2 != null) {
                    return b2;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Fragment a2 = b.a((androidx.lifecycle.m) this.$this_getAssemLifecycleOwner);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.e> {
        final /* synthetic */ Fragment $this_getAssemServiceStoreProducer;
        final /* synthetic */ boolean $withActivity;

        static {
            Covode.recordClassIndex(14940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Fragment fragment, boolean z) {
            super(0);
            this.$this_getAssemServiceStoreProducer = fragment;
            this.$withActivity = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.core.e invoke() {
            androidx.lifecycle.m mVar;
            androidx.fragment.app.e requireActivity = this.$this_getAssemServiceStoreProducer.requireActivity();
            h.f.b.l.a((Object) requireActivity, "");
            Assembler a2 = Assembler.a.a(requireActivity);
            if (this.$withActivity) {
                mVar = this.$this_getAssemServiceStoreProducer.getActivity();
            } else {
                mVar = this.$this_getAssemServiceStoreProducer;
            }
            return a2.c(mVar);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_getAssemViewModelStore;
        final /* synthetic */ boolean $withActivity;

        static {
            Covode.recordClassIndex(14942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(com.bytedance.assem.arch.core.a aVar, boolean z) {
            super(0);
            this.$this_getAssemViewModelStore = aVar;
            this.$withActivity = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ af invoke() {
            af viewModelStore;
            if (this.$withActivity) {
                androidx.fragment.app.e b2 = b.b(this.$this_getAssemViewModelStore);
                if (b2 != null) {
                    viewModelStore = b2.getViewModelStore();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                Fragment a2 = b.a((androidx.lifecycle.m) this.$this_getAssemViewModelStore);
                if (a2 != null) {
                    viewModelStore = a2.getViewModelStore();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            h.f.b.l.a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.d> {
        final /* synthetic */ Fragment $this_getFragmentAssemDataProducer;
        final /* synthetic */ boolean $withActivity;

        static {
            Covode.recordClassIndex(14945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(Fragment fragment, boolean z) {
            super(0);
            this.$this_getFragmentAssemDataProducer = fragment;
            this.$withActivity = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.core.d invoke() {
            androidx.lifecycle.m mVar;
            androidx.fragment.app.e requireActivity = this.$this_getFragmentAssemDataProducer.requireActivity();
            h.f.b.l.a((Object) requireActivity, "");
            Assembler a2 = Assembler.a.a(requireActivity);
            if (this.$withActivity) {
                mVar = this.$this_getFragmentAssemDataProducer.getActivity();
            } else {
                mVar = this.$this_getFragmentAssemDataProducer;
            }
            return a2.b(mVar);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ boolean $requireActivity;
        final /* synthetic */ ag $this_getVMStoreProducer;

        static {
            Covode.recordClassIndex(14949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(ag agVar, boolean z) {
            super(0);
            this.$this_getVMStoreProducer = agVar;
            this.$requireActivity = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ af invoke() {
            af viewModelStore;
            if (this.$requireActivity) {
                ag agVar = this.$this_getVMStoreProducer;
                if (agVar != null) {
                    androidx.fragment.app.e requireActivity = ((Fragment) agVar).requireActivity();
                    h.f.b.l.a((Object) requireActivity, "");
                    viewModelStore = requireActivity.getViewModelStore();
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                viewModelStore = this.$this_getVMStoreProducer.getViewModelStore();
            }
            h.f.b.l.a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.d> {
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_getAssemDataProducer;
        final /* synthetic */ boolean $withActivity;

        static {
            Covode.recordClassIndex(14936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.bytedance.assem.arch.core.a aVar, boolean z) {
            super(0);
            this.$this_getAssemDataProducer = aVar;
            this.$withActivity = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.core.d invoke() {
            if (this.$withActivity) {
                androidx.fragment.app.e b2 = b.b(this.$this_getAssemDataProducer);
                if (b2 != null) {
                    return Assembler.a.a(b2).b(b2);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Fragment a2 = b.a((androidx.lifecycle.m) this.$this_getAssemDataProducer);
            if (a2 != null) {
                androidx.fragment.app.e requireActivity = a2.requireActivity();
                h.f.b.l.a((Object) requireActivity, "");
                return Assembler.a.a(requireActivity).b(a2);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.e> {
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_getAssemServiceStoreProducer;
        final /* synthetic */ boolean $withActivity;

        static {
            Covode.recordClassIndex(14941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(com.bytedance.assem.arch.core.a aVar, boolean z) {
            super(0);
            this.$this_getAssemServiceStoreProducer = aVar;
            this.$withActivity = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.core.e invoke() {
            if (this.$withActivity) {
                androidx.fragment.app.e b2 = b.b(this.$this_getAssemServiceStoreProducer);
                if (b2 != null) {
                    return Assembler.a.a(b2).c(b2);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Fragment a2 = b.a((androidx.lifecycle.m) this.$this_getAssemServiceStoreProducer);
            if (a2 != null) {
                androidx.fragment.app.e requireActivity = a2.requireActivity();
                h.f.b.l.a((Object) requireActivity, "");
                return Assembler.a.a(requireActivity).c(a2);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public static final h.f.a.a<com.bytedance.assem.arch.core.e> c(com.bytedance.assem.arch.core.a aVar) {
        h.f.b.l.c(aVar, "");
        return new m(aVar);
    }

    public static final h.f.a.a<com.bytedance.assem.arch.core.d> a(androidx.fragment.app.e eVar) {
        h.f.b.l.c(eVar, "");
        return new a(eVar);
    }

    public static final h.f.a.a<com.bytedance.assem.arch.core.e> b(androidx.fragment.app.e eVar) {
        h.f.b.l.c(eVar, "");
        return new e(eVar);
    }

    public static final h.f.a.a<com.bytedance.assem.arch.core.d> b(com.bytedance.assem.arch.core.a aVar) {
        h.f.b.l.c(aVar, "");
        return new l(aVar);
    }

    public static final h.f.a.a<ad.b> a(com.bytedance.assem.arch.core.a aVar) {
        h.f.b.l.c(aVar, "");
        return new i(aVar);
    }

    public static final h.f.a.a<com.bytedance.assem.arch.core.d> a(Fragment fragment, boolean z) {
        h.f.b.l.c(fragment, "");
        return new k(fragment, z);
    }

    public static final h.f.a.a<com.bytedance.assem.arch.core.e> b(Fragment fragment, boolean z) {
        h.f.b.l.c(fragment, "");
        return new f(fragment, z);
    }

    public static final h.f.a.a<com.bytedance.assem.arch.core.e> d(com.bytedance.assem.arch.core.a aVar, boolean z) {
        h.f.b.l.c(aVar, "");
        return new g(aVar, z);
    }

    public static final h.f.a.a<af> c(com.bytedance.assem.arch.core.a aVar, boolean z) {
        h.f.b.l.c(aVar, "");
        return new h(aVar, z);
    }

    public static final h.f.a.a<af> a(ag agVar, boolean z) {
        h.f.b.l.c(agVar, "");
        return new o(agVar, z);
    }

    public static final h.f.a.a<androidx.lifecycle.m> a(androidx.lifecycle.m mVar, boolean z) {
        h.f.b.l.c(mVar, "");
        return new n(mVar, z);
    }

    public static final h.f.a.a<androidx.lifecycle.m> b(com.bytedance.assem.arch.core.a aVar, boolean z) {
        h.f.b.l.c(aVar, "");
        return new d(aVar, z);
    }

    public static final h.f.a.a<com.bytedance.assem.arch.core.d> a(com.bytedance.assem.arch.core.a aVar, boolean z) {
        h.f.b.l.c(aVar, "");
        return new b(aVar, z);
    }
}
