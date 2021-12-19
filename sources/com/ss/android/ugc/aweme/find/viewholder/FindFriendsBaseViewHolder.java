package com.ss.android.ugc.aweme.find.viewholder;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
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
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.utils.in;
import h.f.a.b;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.h;
import h.i;
import h.k.k;
import h.z;
import java.util.Objects;

public class FindFriendsBaseViewHolder extends RecyclerView.ViewHolder implements q, au {

    /* renamed from: a  reason: collision with root package name */
    public final FindFriendsViewModel f96077a;

    /* renamed from: b  reason: collision with root package name */
    public final e f96078b;

    /* renamed from: c  reason: collision with root package name */
    private final h f96079c = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(60864);
    }

    private final n b() {
        return (n) this.f96079c.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    static final class a extends h.f.b.m implements h.f.a.a<n> {
        final /* synthetic */ FindFriendsBaseViewHolder this$0;

        static {
            Covode.recordClassIndex(60865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FindFriendsBaseViewHolder findFriendsBaseViewHolder) {
            super(0);
            this.this$0 = findFriendsBaseViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n(this.this$0);
        }
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.i getLifecycle() {
        return b();
    }

    @androidx.lifecycle.v(a = i.a.ON_CREATE)
    public void onCreate() {
        b().a(i.a.ON_CREATE);
    }

    @androidx.lifecycle.v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        b().a(i.a.ON_DESTROY);
    }

    @androidx.lifecycle.v(a = i.a.ON_PAUSE)
    public void onPause() {
        b().a(i.a.ON_PAUSE);
    }

    @androidx.lifecycle.v(a = i.a.ON_RESUME)
    public void onResume() {
        b().a(i.a.ON_RESUME);
    }

    @androidx.lifecycle.v(a = i.a.ON_START)
    public void onStart() {
        b().a(i.a.ON_START);
    }

    @androidx.lifecycle.v(a = i.a.ON_STOP)
    public void onStop() {
        b().a(i.a.ON_STOP);
    }

    protected static boolean a() {
        c.b bVar = c.b.f141662a;
        User c2 = in.c();
        l.b(c2, "");
        if (bVar.a(c2.getUid()).length() > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FindFriendsBaseViewHolder(View view) {
        super(view);
        ac a2;
        l.d(view, "");
        Context context = view.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ad a3 = androidx.lifecycle.ae.a((e) context, (ad.b) null);
        String name = FindFriendsViewModel.class.getName();
        if (FindFriendsViewModel.class.equals(ScopeViewModel.class)) {
            a2 = a3.a(name, FindFriendsViewModel.class);
        } else {
            a2 = a3.a(name, FindFriendsViewModel.class);
            ab.a(a2, a3);
        }
        l.b(a2, "");
        this.f96077a = (FindFriendsViewModel) a2;
        Context context2 = view.getContext();
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f96078b = (e) context2;
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
