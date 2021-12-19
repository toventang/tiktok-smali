package com.bytedance.ext_power_list;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.b.v;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.vm.ScopeViewModel;
import h.f.a.b;
import h.f.b.l;
import h.h;
import h.k.c;
import h.w;
import java.lang.ref.WeakReference;

public final class g<S extends j, VM extends AssemViewModel<S>> implements h<VM> {

    /* renamed from: a  reason: collision with root package name */
    private VM f28692a;

    /* renamed from: b  reason: collision with root package name */
    private final c<VM> f28693b;

    /* renamed from: c  reason: collision with root package name */
    private final v<?> f28694c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<com.bytedance.assem.arch.viewModel.g<S>> f28695d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<ad.b> f28696e;

    /* renamed from: f  reason: collision with root package name */
    private final b<S, S> f28697f;

    static {
        Covode.recordClassIndex(16878);
    }

    @Override // h.h
    public final boolean isInitialized() {
        if (this.f28692a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VM getValue() {
        af afVar;
        ac a2;
        VM vm = this.f28692a;
        if (vm != null) {
            return vm;
        }
        com.bytedance.assem.arch.core.a aVar = this.f28694c;
        while (!(aVar.by_() instanceof com.bytedance.assem.arch.b.g)) {
            m by_ = aVar.by_();
            if (by_ != null) {
                aVar = (com.bytedance.assem.arch.core.a) by_;
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        m by_2 = aVar.by_();
        Fragment a3 = com.bytedance.assem.arch.extensions.b.a(by_2);
        if (a3 != null) {
            ad.b invoke = this.f28696e.invoke();
            try {
                afVar = a3.getViewModelStore();
            } catch (IllegalStateException unused) {
                afVar = new af();
                i fragmentManager = a3.getFragmentManager();
                if (fragmentManager != null) {
                    fragmentManager.a((i.b) new a(afVar), false);
                }
            }
            ad adVar = new ad(afVar, invoke);
            String a4 = l.a(this.f28693b.b(), (Object) String.valueOf(by_2.hashCode()));
            Class a5 = h.f.a.a(this.f28693b);
            if (a5.equals(ScopeViewModel.class)) {
                a2 = adVar.a(a4, a5);
            } else {
                a2 = adVar.a(a4, a5);
                ab.a(a2, adVar);
            }
            VM vm2 = (VM) ((AssemViewModel) a2);
            this.f28692a = vm2;
            vm2.a(new WeakReference<>(by_2.getLifecycle()));
            vm2.a(this.f28695d.invoke(), this.f28697f);
            l.a((Object) vm2, "");
            return vm2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final class a extends i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f28698a;

        static {
            Covode.recordClassIndex(16879);
        }

        a(af afVar) {
            this.f28698a = afVar;
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentDestroyed(i iVar, Fragment fragment) {
            l.c(iVar, "");
            l.c(fragment, "");
            super.onFragmentDestroyed(iVar, fragment);
            this.f28698a.a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.assem.arch.viewModel.g<S extends com.bytedance.assem.arch.viewModel.j>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(c<VM> cVar, v<?> vVar, h.f.a.a<? extends com.bytedance.assem.arch.viewModel.g<S>> aVar, h.f.a.a<? extends ad.b> aVar2, b<? super S, ? extends S> bVar) {
        l.c(cVar, "");
        l.c(vVar, "");
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(bVar, "");
        this.f28693b = cVar;
        this.f28694c = vVar;
        this.f28695d = aVar;
        this.f28696e = aVar2;
        this.f28697f = bVar;
    }
}
