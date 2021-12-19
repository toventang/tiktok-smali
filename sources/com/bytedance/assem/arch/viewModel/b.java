package com.bytedance.assem.arch.viewModel;

import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.core.d;
import com.bytedance.assem.arch.core.e;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.vm.ScopeViewModel;
import h.f.a.a;
import h.f.b.l;
import h.h;
import h.k.c;
import java.lang.ref.WeakReference;

public final class b<S extends j, VM extends AssemViewModel<S>> implements h<VM> {

    /* renamed from: a  reason: collision with root package name */
    private VM f25700a;

    /* renamed from: b  reason: collision with root package name */
    private final c<VM> f25701b;

    /* renamed from: c  reason: collision with root package name */
    private final a<String> f25702c;

    /* renamed from: d  reason: collision with root package name */
    private final a<g<S>> f25703d;

    /* renamed from: e  reason: collision with root package name */
    private final a<m> f25704e;

    /* renamed from: f  reason: collision with root package name */
    private final a<af> f25705f;

    /* renamed from: g  reason: collision with root package name */
    private final a<ad.b> f25706g;

    /* renamed from: h  reason: collision with root package name */
    private final h.f.a.b<S, S> f25707h;

    /* renamed from: i  reason: collision with root package name */
    private final a<d> f25708i;

    /* renamed from: j  reason: collision with root package name */
    private final a<e> f25709j;

    static {
        Covode.recordClassIndex(14970);
    }

    @Override // h.h
    public final boolean isInitialized() {
        if (this.f25700a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final VM getValue() {
        ac a2;
        d dVar;
        VM vm = this.f25700a;
        if (vm == null) {
            ad adVar = new ad(this.f25705f.invoke(), this.f25706g.invoke());
            String invoke = this.f25702c.invoke();
            Class a3 = h.f.a.a(this.f25701b);
            if (a3.equals(ScopeViewModel.class)) {
                a2 = adVar.a(invoke, a3);
            } else {
                a2 = adVar.a(invoke, a3);
                ab.a(a2, adVar);
            }
            vm = (VM) ((AssemViewModel) a2);
            this.f25700a = vm;
            vm.a(new WeakReference<>(this.f25704e.invoke().getLifecycle()));
            a<d> aVar = this.f25708i;
            e eVar = null;
            if (aVar != null) {
                dVar = aVar.invoke();
            } else {
                dVar = null;
            }
            vm.f25687d = dVar;
            a<e> aVar2 = this.f25709j;
            if (aVar2 != null) {
                eVar = aVar2.invoke();
            }
            vm.f25688e = eVar;
            vm.a(this.f25703d.invoke(), this.f25707h);
            l.a((Object) vm, "");
        }
        return vm;
    }

    public /* synthetic */ b(c cVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, h.f.a.b bVar) {
        this(cVar, aVar, aVar2, aVar3, aVar4, aVar5, bVar, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.assem.arch.viewModel.g<S extends com.bytedance.assem.arch.viewModel.j>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends androidx.lifecycle.m> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends androidx.lifecycle.af> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(c<VM> cVar, a<String> aVar, a<? extends g<S>> aVar2, a<? extends m> aVar3, a<? extends af> aVar4, a<? extends ad.b> aVar5, h.f.a.b<? super S, ? extends S> bVar, a<d> aVar6, a<e> aVar7) {
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(aVar3, "");
        l.c(aVar4, "");
        l.c(aVar5, "");
        l.c(bVar, "");
        this.f25701b = cVar;
        this.f25702c = aVar;
        this.f25703d = aVar2;
        this.f25704e = aVar3;
        this.f25705f = aVar4;
        this.f25706g = aVar5;
        this.f25707h = bVar;
        this.f25708i = aVar6;
        this.f25709j = aVar7;
    }
}
