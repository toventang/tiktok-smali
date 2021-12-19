package com.bytedance.assem.arch.b;

import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.extensions.j;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.bytedance.tiktok.proxy.h;
import h.a.n;
import h.f.b.l;
import h.i;
import h.w;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public abstract class v<RECEIVER extends com.bytedance.tiktok.proxy.d> extends com.bytedance.assem.arch.core.a implements f<RECEIVER>, com.bytedance.tiktok.proxy.d, com.bytedance.tiktok.proxy.f, h<RECEIVER>, kotlinx.a.a.a {

    /* renamed from: g  reason: collision with root package name */
    public View f25470g;

    /* renamed from: h  reason: collision with root package name */
    public final CopyOnWriteArraySet<k<?, ?>> f25471h = new CopyOnWriteArraySet<>();

    /* renamed from: i  reason: collision with root package name */
    public boolean f25472i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f25473j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f25474k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f25475l = true;

    /* renamed from: m  reason: collision with root package name */
    public boolean f25476m;
    public j n;
    private final h.h o = i.a((h.f.a.a) new a(this));
    private final h.h p = i.a((h.f.a.a) d.f25479a);
    private final h.h q = i.a((h.f.a.a) b.f25477a);
    private final h.h r = i.a((h.f.a.a) c.f25478a);
    private final CopyOnWriteArrayList<h.f.a.a<z>> s = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(14816);
    }

    private final com.bytedance.assem.arch.c.a A() {
        return (com.bytedance.assem.arch.c.a) this.p.getValue();
    }

    private final ReentrantLock B() {
        return (ReentrantLock) this.q.getValue();
    }

    private final long C() {
        return ((Number) this.r.getValue()).longValue();
    }

    public abstract void c(View view);

    @Override // com.bytedance.assem.arch.viewModel.f
    public m getHostLifecycleOwner() {
        return (m) this.o.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    public abstract void v();

    public void x() {
    }

    public abstract void z();

    @Override // com.bytedance.tiktok.proxy.f
    public m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public RECEIVER getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public boolean getHasSubscribedForReused() {
        return this.f25476m;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public RECEIVER getReceiverForHostVM() {
        return this;
    }

    static final class b extends h.f.b.m implements h.f.a.a<ReentrantLock> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25477a = new b();

        static {
            Covode.recordClassIndex(14818);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ReentrantLock invoke() {
            return new ReentrantLock();
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public void p() {
        super.p();
        this.f25472i = false;
    }

    static final class c extends h.f.b.m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f25478a = new c();

        static {
            Covode.recordClassIndex(14819);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f25479a = new d();

        static {
            Covode.recordClassIndex(14820);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.c.a invoke() {
            Executor a2 = j.a(true);
            if (a2 != null) {
                return a2;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void bP_() {
        this.f25546d.a(i.a.ON_RESUME);
        j();
    }

    @Override // com.bytedance.assem.arch.core.a
    public void f() {
        super.f();
        v();
        this.f25472i = true;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        j jVar = this.n;
        if (jVar != null) {
            return (com.bytedance.tiktok.proxy.f) jVar;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public h<RECEIVER> getActualReceiverHolder() {
        j jVar = this.n;
        if (jVar != null) {
            return (h) jVar;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // kotlinx.a.a.a
    public final View s() {
        View view = this.f25470g;
        if (view == null) {
            l.a("containerView");
        }
        return view;
    }

    public final List<com.bytedance.assem.arch.core.a> t() {
        AssemSupervisor a2 = com.bytedance.assem.arch.extensions.b.a((com.bytedance.assem.arch.core.a) this);
        if (a2 != null) {
            return a2.f25528a;
        }
        return null;
    }

    public final boolean w() {
        if (this.f25470g != null) {
            return true;
        }
        return false;
    }

    static final class a extends h.f.b.m implements h.f.a.a<m> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(14817);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(v vVar) {
            super(0);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ m invoke() {
            Object a2 = com.bytedance.assem.arch.extensions.b.a((m) this.this$0);
            if (a2 == null && (a2 = com.bytedance.assem.arch.extensions.b.b(this.this$0)) == null) {
                l.a();
            }
            return a2;
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public void j() {
        f.a.l.b<b> b2;
        super.j();
        j jVar = this.n;
        if (jVar != null && (b2 = jVar.b()) != null) {
            b2.onNext(new b(a.HostResume, this));
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public void n() {
        f.a.l.b<b> b2;
        super.n();
        j jVar = this.n;
        if (jVar != null && (b2 = jVar.b()) != null) {
            b2.onNext(new b(a.HostStop, this));
        }
    }

    public final boolean u() {
        CopyOnWriteArrayList<com.bytedance.assem.arch.core.a> copyOnWriteArrayList;
        AssemSupervisor a2 = com.bytedance.assem.arch.extensions.b.a((com.bytedance.assem.arch.core.a) this);
        if (a2 == null || (copyOnWriteArrayList = a2.f25528a) == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void y() {
        CopyOnWriteArraySet<k<?, ?>> copyOnWriteArraySet = this.f25471h;
        if (copyOnWriteArraySet != null) {
            Iterator<T> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void a(View view) {
        l.c(view, "");
        this.f25470g = view;
    }

    public final void b(View view) {
        l.c(view, "");
        c(view);
        if (j.f25649d) {
            ReentrantLock B = B();
            B.lock();
            try {
                this.f25473j = true;
                A().a(this.s, C());
            } finally {
                B.unlock();
            }
        } else {
            this.f25473j = true;
            Iterator<T> it = this.s.iterator();
            while (it.hasNext()) {
                it.next().invoke();
            }
            this.s.clear();
        }
    }

    public final void a(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        if (j.f25649d) {
            ReentrantLock B = B();
            B.lock();
            try {
                if (this.f25473j) {
                    A().a(n.a(aVar), C());
                } else {
                    Boolean.valueOf(this.s.add(aVar));
                }
            } finally {
                B.unlock();
            }
        } else if (this.f25473j) {
            aVar.invoke();
        } else {
            this.s.add(aVar);
        }
    }

    public static <VM1 extends AssemViewModel<S1>, S1 extends com.bytedance.assem.arch.viewModel.j, R> R a(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.c(vm1, "");
        l.c(bVar, "");
        return (R) f.a.a(vm1, bVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super RECEIVER, ? super S, z> mVar) {
        l.c(assemViewModel, "");
        l.c(kVar, "");
        l.c(mVar, "");
        f.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super RECEIVER, ? super A, z> mVar) {
        l.c(assemViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(mVar, "");
        f.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super RECEIVER, ? super A, z> mVar) {
        l.c(assemViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(mVar, "");
        f.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super RECEIVER, ? super A, ? super B, z> qVar) {
        l.c(assemViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(kVar3, "");
        l.c(qVar, "");
        f.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super RECEIVER, ? super A, ? super B, ? super C, z> rVar) {
        l.c(assemViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(kVar3, "");
        l.c(kVar4, "");
        l.c(rVar, "");
        f.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.c(assemViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(kVar3, "");
        l.c(kVar4, "");
        l.c(kVar5, "");
        l.c(sVar, "");
        f.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
