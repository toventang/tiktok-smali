package com.bytedance.jedi.arch;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.h;
import f.a.b.b;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.z;

public interface i extends m, ae<i>, g, h<i>, v {

    public static final class a {
        static {
            Covode.recordClassIndex(24280);
        }

        public static <S extends af> b a(i iVar, JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, z> mVar) {
            l.c(jediViewModel, "");
            l.c(ahVar, "");
            l.c(mVar, "");
            return h.a.a(iVar, jediViewModel, ahVar, mVar);
        }

        public static <S extends af, A> b a(i iVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super i, ? super A, z> mVar) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(ahVar, "");
            l.c(mVar, "");
            return h.a.a(iVar, jediViewModel, kVar, ahVar, mVar);
        }

        public static <S extends af, T> b a(i iVar, JediViewModel<S> jediViewModel, k<S, ? extends a<? extends T>> kVar, ah<ak<a<T>>> ahVar, h.f.a.m<? super i, ? super Throwable, z> mVar, h.f.a.b<? super i, z> bVar, h.f.a.m<? super i, ? super T, z> mVar2) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(ahVar, "");
            return h.a.a(iVar, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
        }

        public static <S extends af, A, B> b a(i iVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super i, ? super A, ? super B, z> qVar) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(ahVar, "");
            l.c(qVar, "");
            return h.a.a(iVar, jediViewModel, kVar, kVar2, ahVar, qVar);
        }

        public static <S extends af, A, B, C> b a(i iVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super i, ? super A, ? super B, ? super C, z> rVar) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(ahVar, "");
            l.c(rVar, "");
            return h.a.a(iVar, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
        }

        public static <S extends af, A, B, C, D> b a(i iVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(kVar4, "");
            l.c(ahVar, "");
            l.c(sVar, "");
            return h.a.a(iVar, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
        }

        public static <VM1 extends JediViewModel<S1>, S1 extends af, R> R a(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
            l.c(vm1, "");
            l.c(bVar, "");
            return (R) h.a.a(vm1, bVar);
        }
    }

    static {
        Covode.recordClassIndex(24279);
    }
}
