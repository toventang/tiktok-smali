package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.i;
import f.a.b.b;
import h.f.a.m;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.z;

public interface q extends i {

    public static final class a {
        static {
            Covode.recordClassIndex(24334);
        }

        public static <S extends af> b a(q qVar, JediViewModel<S> jediViewModel, ah<S> ahVar, m<? super i, ? super S, z> mVar) {
            l.c(jediViewModel, "");
            l.c(ahVar, "");
            l.c(mVar, "");
            return i.a.a(qVar, jediViewModel, ahVar, mVar);
        }

        public static <S extends af, A> b a(q qVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, m<? super i, ? super A, z> mVar) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(ahVar, "");
            l.c(mVar, "");
            return i.a.a(qVar, jediViewModel, kVar, ahVar, mVar);
        }

        public static <S extends af, T> b a(q qVar, JediViewModel<S> jediViewModel, k<S, ? extends a<? extends T>> kVar, ah<ak<a<T>>> ahVar, m<? super i, ? super Throwable, z> mVar, h.f.a.b<? super i, z> bVar, m<? super i, ? super T, z> mVar2) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(ahVar, "");
            return i.a.a(qVar, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
        }

        public static <S extends af, A, B> b a(q qVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super i, ? super A, ? super B, z> qVar2) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(ahVar, "");
            l.c(qVar2, "");
            return i.a.a(qVar, jediViewModel, kVar, kVar2, ahVar, qVar2);
        }

        public static <S extends af, A, B, C> b a(q qVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super i, ? super A, ? super B, ? super C, z> rVar) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(ahVar, "");
            l.c(rVar, "");
            return i.a.a(qVar, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
        }

        public static <S extends af, A, B, C, D> b a(q qVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(kVar4, "");
            l.c(ahVar, "");
            l.c(sVar, "");
            return i.a.a(qVar, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
        }

        public static <VM1 extends JediViewModel<S1>, S1 extends af, R> R a(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
            l.c(vm1, "");
            l.c(bVar, "");
            return (R) i.a.a(vm1, bVar);
        }
    }

    static {
        Covode.recordClassIndex(24333);
    }
}
