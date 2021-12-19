package com.bytedance.ext_power_list;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.g;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.vm.ScopeViewModel;
import h.f.a.b;
import h.f.b.l;
import h.h;
import h.k.c;
import java.lang.ref.WeakReference;

public final class f<S extends j, VM extends AssemViewModel<S>> implements h<VM> {

    /* renamed from: a  reason: collision with root package name */
    private VM f28683a;

    /* renamed from: b  reason: collision with root package name */
    private final c<VM> f28684b;

    /* renamed from: c  reason: collision with root package name */
    private final h.f.a.a<String> f28685c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<g<S>> f28686d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<m> f28687e;

    /* renamed from: f  reason: collision with root package name */
    private final m f28688f;

    /* renamed from: g  reason: collision with root package name */
    private final h.f.a.a<ad.b> f28689g;

    /* renamed from: h  reason: collision with root package name */
    private final b<S, S> f28690h;

    static {
        Covode.recordClassIndex(16876);
    }

    @Override // h.h
    public final boolean isInitialized() {
        if (this.f28683a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VM getValue() {
        af afVar;
        ac a2;
        VM vm = this.f28683a;
        if (vm != null) {
            return vm;
        }
        ad.b invoke = this.f28689g.invoke();
        Fragment a3 = com.bytedance.assem.arch.extensions.b.a(this.f28688f);
        if (a3 != null) {
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
            String invoke2 = this.f28685c.invoke();
            Class a4 = h.f.a.a(this.f28684b);
            if (a4.equals(ScopeViewModel.class)) {
                a2 = adVar.a(invoke2, a4);
            } else {
                a2 = adVar.a(invoke2, a4);
                ab.a(a2, adVar);
            }
            VM vm2 = (VM) ((AssemViewModel) a2);
            this.f28683a = vm2;
            vm2.a(new WeakReference<>(this.f28687e.invoke().getLifecycle()));
            vm2.a(this.f28686d.invoke(), this.f28690h);
            l.a((Object) vm2, "");
            return vm2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final class a extends i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f28691a;

        static {
            Covode.recordClassIndex(16877);
        }

        a(af afVar) {
            this.f28691a = afVar;
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentDestroyed(i iVar, Fragment fragment) {
            l.c(iVar, "");
            l.c(fragment, "");
            super.onFragmentDestroyed(iVar, fragment);
            this.f28691a.a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.assem.arch.viewModel.g<S extends com.bytedance.assem.arch.viewModel.j>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends androidx.lifecycle.m> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(c<VM> cVar, h.f.a.a<String> aVar, h.f.a.a<? extends g<S>> aVar2, h.f.a.a<? extends m> aVar3, m mVar, h.f.a.a<? extends ad.b> aVar4, b<? super S, ? extends S> bVar) {
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(aVar3, "");
        l.c(mVar, "");
        l.c(aVar4, "");
        l.c(bVar, "");
        this.f28684b = cVar;
        this.f28685c = aVar;
        this.f28686d = aVar2;
        this.f28687e = aVar3;
        this.f28688f = mVar;
        this.f28689g = aVar4;
        this.f28690h = bVar;
    }
}
