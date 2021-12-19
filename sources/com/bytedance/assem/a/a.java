package com.bytedance.assem.a;

import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.core.d;
import com.bytedance.assem.arch.core.e;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.g;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.h;
import h.k.c;
import java.lang.ref.WeakReference;

public final class a<S extends j, VM extends AssemViewModel<S>> implements h<VM> {

    /* renamed from: a  reason: collision with root package name */
    public static final C0535a f25403a = new C0535a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private VM f25404b;

    /* renamed from: c  reason: collision with root package name */
    private final c<VM> f25405c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<String> f25406d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<g<S>> f25407e;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.a<m> f25408f;

    /* renamed from: g  reason: collision with root package name */
    private final h.f.a.a<ad.b> f25409g;

    /* renamed from: h  reason: collision with root package name */
    private final b<S, S> f25410h;

    /* renamed from: i  reason: collision with root package name */
    private final h.f.a.a<d> f25411i;

    /* renamed from: j  reason: collision with root package name */
    private final h.f.a.a<e> f25412j;

    static {
        Covode.recordClassIndex(14765);
    }

    /* renamed from: com.bytedance.assem.a.a$a  reason: collision with other inner class name */
    public static final class C0535a {
        static {
            Covode.recordClassIndex(14766);
        }

        private C0535a() {
        }

        public /* synthetic */ C0535a(byte b2) {
            this();
        }

        public static <S extends j> void a(AssemViewModel<S> assemViewModel, h.f.a.a<? extends m> aVar, h.f.a.a<d> aVar2, h.f.a.a<e> aVar3, h.f.a.a<? extends g<S>> aVar4, b<? super S, ? extends S> bVar) {
            d dVar;
            l.c(assemViewModel, "");
            l.c(aVar, "");
            l.c(aVar4, "");
            l.c(bVar, "");
            if (!assemViewModel.f25685b) {
                assemViewModel.a(new WeakReference<>(((m) aVar.invoke()).getLifecycle()));
                e eVar = null;
                if (aVar2 != null) {
                    dVar = aVar2.invoke();
                } else {
                    dVar = null;
                }
                assemViewModel.f25687d = dVar;
                if (aVar3 != null) {
                    eVar = aVar3.invoke();
                }
                assemViewModel.f25688e = eVar;
                assemViewModel.a((g) aVar4.invoke(), bVar);
            }
        }
    }

    @Override // h.h
    public final boolean isInitialized() {
        if (this.f25404b != null) {
            return true;
        }
        return false;
    }

    @Override // h.h
    public final /* synthetic */ Object getValue() {
        VM vm = this.f25404b;
        if (vm == null) {
            ad.b invoke = this.f25409g.invoke();
            if (this.f25406d != null) {
                SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider(invoke);
                i lifecycle = this.f25408f.invoke().getLifecycle();
                l.a((Object) lifecycle, "");
                vm = (VM) ((AssemViewModel) sharedViewModelProvider.a(lifecycle, this.f25406d.invoke(), h.f.a.a(this.f25405c)));
            } else {
                SharedViewModelProvider sharedViewModelProvider2 = new SharedViewModelProvider(invoke);
                i lifecycle2 = this.f25408f.invoke().getLifecycle();
                l.a((Object) lifecycle2, "");
                vm = (VM) ((AssemViewModel) sharedViewModelProvider2.a(lifecycle2, h.f.a.a(this.f25405c)));
            }
            this.f25404b = vm;
            C0535a.a(vm, this.f25408f, this.f25411i, this.f25412j, this.f25407e, this.f25410h);
        }
        return vm;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.assem.arch.viewModel.g<S extends com.bytedance.assem.arch.viewModel.j>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends androidx.lifecycle.m> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(c<VM> cVar, h.f.a.a<String> aVar, h.f.a.a<? extends g<S>> aVar2, h.f.a.a<? extends m> aVar3, h.f.a.a<? extends ad.b> aVar4, b<? super S, ? extends S> bVar, h.f.a.a<d> aVar5, h.f.a.a<e> aVar6) {
        l.c(cVar, "");
        l.c(aVar2, "");
        l.c(aVar3, "");
        l.c(aVar4, "");
        l.c(bVar, "");
        this.f25405c = cVar;
        this.f25406d = aVar;
        this.f25407e = aVar2;
        this.f25408f = aVar3;
        this.f25409g = aVar4;
        this.f25410h = bVar;
        this.f25411i = aVar5;
        this.f25412j = aVar6;
    }
}
