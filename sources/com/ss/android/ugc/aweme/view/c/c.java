package com.ss.android.ugc.aweme.view.c;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.ag;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.view.a.h;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.l;
import h.i;
import h.k.k;
import h.z;

public final class c extends com.google.android.material.bottomsheet.b implements q, h.b {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f144152a = i.a((h.f.a.a) new b(this));

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f144153b;

    static {
        Covode.recordClassIndex(94342);
    }

    private View d() {
        if (this.f144153b == null) {
            this.f144153b = new SparseArray();
        }
        View view = (View) this.f144153b.get(R.id.db2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.db2);
        this.f144153b.put(R.id.db2, findViewById);
        return findViewById;
    }

    public final ProfileNaviSwitcherViewModel b() {
        return (ProfileNaviSwitcherViewModel) this.f144152a.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        b().a();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f144153b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<ProfileNaviSwitcherViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(94344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviSwitcherViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.requireActivity()).a(ProfileNaviSwitcherViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.view.a.h.b
    public final void a() {
        com.ss.android.ugc.aweme.bn.a.a(com.ss.android.ugc.aweme.bn.a.f68735a);
        dismiss();
        ProfileNaviSwitcherViewModel b2 = b();
        b2.d(ProfileNaviSwitcherViewModel.a.f144406a);
        b2.d(ProfileNaviSwitcherViewModel.b.f144407a);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (getDialog() != null) {
            View findViewById = getDialog().findViewById(R.id.akq);
            l.b(findViewById, "");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Context context = getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
            layoutParams.height = (int) ag.a.a(context, 360.0f);
        }
    }

    public final void c() {
        RecyclerView recyclerView = (RecyclerView) d();
        l.b(recyclerView, "");
        if (recyclerView.getAdapter() == null) {
            RecyclerView recyclerView2 = (RecyclerView) d();
            l.b(recyclerView2, "");
            if (getContext() == null) {
                l.b();
            }
            recyclerView2.setLayoutManager(new GridLayoutManager(2));
            RecyclerView recyclerView3 = (RecyclerView) d();
            l.b(recyclerView3, "");
            recyclerView3.setAdapter(new h(((ProfileNaviSwitcherState) b().a(this)).getNaviList(), this));
            ((RecyclerView) d()).a(new C3840c(this));
            return;
        }
        RecyclerView recyclerView4 = (RecyclerView) d();
        l.b(recyclerView4, "");
        RecyclerView.a adapter = recyclerView4.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.c$c  reason: collision with other inner class name */
    public static final class C3840c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f144154a;

        static {
            Covode.recordClassIndex(94345);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3840c(c cVar) {
            this.f144154a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (!recyclerView.canScrollVertically(1)) {
                this.f144154a.b().a(0);
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.appcompat.app.i, com.google.android.material.bottomsheet.b
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        return new com.google.android.material.bottomsheet.a(context, R.style.a0_);
    }

    @Override // com.ss.android.ugc.aweme.view.a.h.b
    public final void a(com.ss.android.ugc.aweme.model.api.a.b bVar) {
        l.d(bVar, "");
        r.a("choose_avatar", new d().a("enter_from", "avatar_switcher_page").a("avatar_id", bVar.getNavi_id()).f66730a);
        dismiss();
        b();
        if (com.ss.android.ugc.aweme.model.r.f110811a != null) {
            b();
            com.ss.android.ugc.aweme.model.q qVar = com.ss.android.ugc.aweme.model.r.f110811a;
            if (qVar == null) {
                l.b();
            }
            if (!(!l.a((Object) qVar.f110805a, (Object) bVar.getNavi_id()))) {
                return;
            }
        }
        ProfileNaviSwitcherViewModel b2 = b();
        l.d(bVar, "");
        com.ss.android.ugc.aweme.model.r.a(bVar);
        b2.d(ProfileNaviSwitcherViewModel.e.f144412a);
        b2.d(ProfileNaviSwitcherViewModel.f.f144413a);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class a extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(94343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(iVar, "");
            if (booleanValue) {
                this.this$0.c();
            }
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        f.a.b.b unused = selectSubscribe(b(), d.f144155a, new ah(), new a(this));
        c();
        b().a(0);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        r.a("enter_avatar_switch", new d().a("enter_from", "avatar_hub").f66730a);
        return com.a.a(layoutInflater, R.layout.aq0, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
