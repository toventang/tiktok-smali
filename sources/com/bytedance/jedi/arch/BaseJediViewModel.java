package com.bytedance.jedi.arch;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.b;
import f.a.e.e.e.v;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.z;

public abstract class BaseJediViewModel<S extends af> extends JediViewModel<S> {
    static {
        Covode.recordClassIndex(24140);
    }

    public static final class b implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f39359a;

        static {
            Covode.recordClassIndex(24142);
        }

        @Override // com.bytedance.jedi.arch.h
        public final boolean getUniqueOnlyGlobal() {
            return true;
        }

        /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
        @Override // com.bytedance.jedi.arch.ae
        public final /* bridge */ /* synthetic */ i getReceiver() {
            return this;
        }

        @Override // com.bytedance.jedi.arch.v
        public final m getLifecycleOwner() {
            return b.a.a(this);
        }

        @Override // com.bytedance.jedi.arch.h
        public final v getLifecycleOwnerHolder() {
            return b.a.b(this);
        }

        @Override // com.bytedance.jedi.arch.h
        public final ae<i> getReceiverHolder() {
            return b.a.c(this);
        }

        @Override // androidx.lifecycle.m
        public final i getLifecycle() {
            i lifecycle = this.f39359a.getLifecycle();
            l.b(lifecycle, "");
            return lifecycle;
        }

        b(m mVar) {
            this.f39359a = mVar;
        }

        @Override // com.bytedance.jedi.arch.b
        public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
            l.d(vm1, "");
            return (S1) b.a.a(this, vm1);
        }

        @Override // com.bytedance.jedi.arch.h
        public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
            l.d(vm1, "");
            l.d(bVar, "");
            return (R) b.a.a(this, vm1, bVar);
        }

        @Override // com.bytedance.jedi.arch.h
        public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, z> mVar) {
            l.d(jediViewModel, "");
            l.d(ahVar, "");
            l.d(mVar, "");
            return b.a.a(this, jediViewModel, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.b
        public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super b, ? super A, z> mVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(ahVar, "");
            l.d(mVar, "");
            b.a.a(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.h
        public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super i, ? super A, z> mVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(ahVar, "");
            l.d(mVar, "");
            return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.b
        public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends d<? extends A>> kVar, ah<ak<d<A>>> ahVar, h.f.a.m<? super b, ? super A, z> mVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(ahVar, "");
            l.d(mVar, "");
            b.a.b(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.b
        public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super b, ? super A, z> mVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(ahVar, "");
            l.d(mVar, "");
            b.a.c(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.h
        public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super i, ? super A, ? super B, z> qVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(kVar2, "");
            l.d(ahVar, "");
            l.d(qVar, "");
            return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
        }

        @Override // com.bytedance.jedi.arch.h
        public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends a<? extends T>> kVar, ah<ak<a<T>>> ahVar, h.f.a.m<? super i, ? super Throwable, z> mVar, h.f.a.b<? super i, z> bVar, h.f.a.m<? super i, ? super T, z> mVar2) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(ahVar, "");
            return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
        }

        @Override // com.bytedance.jedi.arch.h
        public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super i, ? super A, ? super B, ? super C, z> rVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(kVar2, "");
            l.d(kVar3, "");
            l.d(ahVar, "");
            l.d(rVar, "");
            return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
        }

        @Override // com.bytedance.jedi.arch.h
        public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(kVar2, "");
            l.d(kVar3, "");
            l.d(kVar4, "");
            l.d(ahVar, "");
            l.d(sVar, "");
            return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<S, S> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39358a = new a();

        static {
            Covode.recordClassIndex(24141);
        }

        a() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            l.d(obj, "");
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<A, z> {
        final /* synthetic */ h.f.a.b $subscriber;

        static {
            Covode.recordClassIndex(24143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h.f.a.b bVar) {
            super(1);
            this.$subscriber = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(Object obj) {
            if (obj != null) {
                this.$subscriber.invoke(obj);
            }
            return z.f158842a;
        }
    }

    public final S a(m mVar) {
        l.d(mVar, "");
        return (S) ((af) new b(mVar).withState(this, a.f39358a));
    }

    /* access modifiers changed from: private */
    public <A> f.a.b.b b(m mVar, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.b<? super A, z> bVar) {
        l.d(mVar, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(bVar, "");
        i lifecycle = mVar.getLifecycle();
        l.b(lifecycle, "");
        if (lifecycle.a() == i.b.DESTROYED) {
            f.a.b.b g2 = f.a.h.a.a(v.f157740a).g();
            l.b(g2, "");
            return g2;
        }
        f.a.b.b a2 = a(kVar, ahVar, bVar);
        mVar.getLifecycle().a(new BaseJediViewModel$selectSubscribe$2(a2));
        return a2;
    }

    public final <A> f.a.b.b a(m mVar, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.b<? super A, z> bVar) {
        l.d(mVar, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(bVar, "");
        return b(mVar, kVar, ahVar, new c(bVar));
    }
}
