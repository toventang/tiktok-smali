package com.bytedance.assem.arch.viewModel;

import androidx.lifecycle.m;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.bytedance.tiktok.proxy.f;
import h.f.a.b;
import h.f.b.l;
import h.k.k;
import h.z;

public interface h extends m, f<d>, d, f, com.bytedance.tiktok.proxy.h<d> {

    public static final class a {
        static {
            Covode.recordClassIndex(15003);
        }

        public static <VM1 extends AssemViewModel<S1>, S1 extends j, R> R a(VM1 vm1, b<? super S1, ? extends R> bVar) {
            l.c(vm1, "");
            l.c(bVar, "");
            return (R) f.a.a(vm1, bVar);
        }

        public static <S extends j> void a(h hVar, AssemViewModel<S> assemViewModel, k<S> kVar, b<? super Throwable, z> bVar, h.f.a.m<? super d, ? super S, z> mVar) {
            l.c(assemViewModel, "");
            l.c(kVar, "");
            l.c(mVar, "");
            f.a.a(hVar, assemViewModel, kVar, bVar, mVar);
        }

        public static <S extends j, A> void a(h hVar, AssemViewModel<S> assemViewModel, k<S, ? extends A> kVar, k<p<A>> kVar2, b<? super Throwable, z> bVar, h.f.a.m<? super d, ? super A, z> mVar) {
            l.c(assemViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(mVar, "");
            f.a.a(hVar, assemViewModel, kVar, kVar2, bVar, mVar);
        }

        public static <S extends j, A, B> void a(h hVar, AssemViewModel<S> assemViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<q<A, B>> kVar3, b<? super Throwable, z> bVar, h.f.a.q<? super d, ? super A, ? super B, z> qVar) {
            l.c(assemViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(qVar, "");
            f.a.a(hVar, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
        }

        public static <S extends j, A, B, C> void a(h hVar, AssemViewModel<S> assemViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<r<A, B, C>> kVar4, b<? super Throwable, z> bVar, h.f.a.r<? super d, ? super A, ? super B, ? super C, z> rVar) {
            l.c(assemViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(kVar4, "");
            l.c(rVar, "");
            f.a.a(hVar, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
        }

        public static <S extends j, A, B, C, D> void a(h hVar, AssemViewModel<S> assemViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, b<? super Throwable, z> bVar, h.f.a.s<? super d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
            l.c(assemViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(kVar4, "");
            l.c(kVar5, "");
            l.c(sVar, "");
            f.a.a(hVar, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
        }

        public static <S extends j, A> void b(h hVar, AssemViewModel<S> assemViewModel, k<S, ? extends A> kVar, k<p<A>> kVar2, b<? super Throwable, z> bVar, h.f.a.m<? super d, ? super A, z> mVar) {
            l.c(assemViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(mVar, "");
            f.a.b(hVar, assemViewModel, kVar, kVar2, bVar, mVar);
        }
    }

    static {
        Covode.recordClassIndex(15002);
    }
}
