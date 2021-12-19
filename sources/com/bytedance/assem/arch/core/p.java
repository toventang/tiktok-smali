package com.bytedance.assem.arch.core;

import android.view.View;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.bytedance.tiktok.proxy.h;
import h.f.a.b;
import h.f.b.l;
import h.z;
import kotlinx.a.a.a;

public abstract class p extends a implements f<p>, d, com.bytedance.tiktok.proxy.f, h<p>, a {

    /* renamed from: g  reason: collision with root package name */
    public View f25593g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f25594h;

    static {
        Covode.recordClassIndex(14896);
    }

    public abstract void b(View view);

    @Override // com.bytedance.assem.arch.viewModel.f
    public boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public m getHostLifecycleOwner() {
        return null;
    }

    /* Return type fixed from 'com.bytedance.tiktok.proxy.d' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.f
    public /* bridge */ /* synthetic */ p getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    public abstract void t();

    @Override // com.bytedance.tiktok.proxy.f
    public m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.tiktok.proxy.d' to match base method */
    @Override // com.bytedance.tiktok.proxy.h
    public /* bridge */ /* synthetic */ p getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public h<p> getActualReceiverHolder() {
        return this;
    }

    @Override // com.bytedance.assem.arch.core.a
    public void p() {
        super.p();
        this.f25594h = false;
    }

    @Override // com.bytedance.assem.arch.core.a
    public void f() {
        super.f();
        t();
        this.f25594h = true;
    }

    @Override // kotlinx.a.a.a
    public final View s() {
        View view = this.f25593g;
        if (view == null) {
            l.a("containerView");
        }
        return view;
    }

    public final void a(View view) {
        l.c(view, "");
        this.f25593g = view;
    }

    public static <VM1 extends AssemViewModel<S1>, S1 extends j, R> R a(VM1 vm1, b<? super S1, ? extends R> bVar) {
        l.c(vm1, "");
        l.c(bVar, "");
        return (R) f.a.a(vm1, bVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, b<? super Throwable, z> bVar, h.f.a.m<? super p, ? super S, z> mVar) {
        l.c(assemViewModel, "");
        l.c(kVar, "");
        l.c(mVar, "");
        f.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<com.bytedance.assem.arch.extensions.p<A>> kVar2, b<? super Throwable, z> bVar, h.f.a.m<? super p, ? super A, z> mVar) {
        l.c(assemViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(mVar, "");
        f.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<com.bytedance.assem.arch.extensions.p<A>> kVar2, b<? super Throwable, z> bVar, h.f.a.m<? super p, ? super A, z> mVar) {
        l.c(assemViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(mVar, "");
        f.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<q<A, B>> kVar3, b<? super Throwable, z> bVar, h.f.a.q<? super p, ? super A, ? super B, z> qVar) {
        l.c(assemViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(kVar3, "");
        l.c(qVar, "");
        f.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<r<A, B, C>> kVar4, b<? super Throwable, z> bVar, h.f.a.r<? super p, ? super A, ? super B, ? super C, z> rVar) {
        l.c(assemViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(kVar3, "");
        l.c(kVar4, "");
        l.c(rVar, "");
        f.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, b<? super Throwable, z> bVar, h.f.a.s<? super p, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
