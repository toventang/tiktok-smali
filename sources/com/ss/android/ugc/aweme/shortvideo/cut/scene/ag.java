package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.z;
import java.util.Objects;

public final class ag extends com.ss.android.ugc.gamora.b.b implements com.bytedance.jedi.arch.b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f125585e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ba f125586a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a f125587b;

    /* renamed from: c  reason: collision with root package name */
    public StickPointModeChangeView f125588c;

    /* renamed from: d  reason: collision with root package name */
    public CutVideoMultiModeViewModel f125589d;

    static {
        Covode.recordClassIndex(82468);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82469);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
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

    public final StickPointModeChangeView a() {
        StickPointModeChangeView stickPointModeChangeView = this.f125588c;
        if (stickPointModeChangeView == null) {
            l.a("modelChangeView");
        }
        return stickPointModeChangeView;
    }

    public static final class b implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ag f125590a;

        static {
            Covode.recordClassIndex(82470);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(ag agVar) {
            this.f125590a = agVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a
        public final void a(int i2) {
            String str;
            if (ag.a(this.f125590a).f125536a != i2) {
                ag.a(this.f125590a).f125536a = i2;
                if (ag.a(this.f125590a).f125536a == 1) {
                    CutVideoMultiModeViewModel a2 = ag.a(this.f125590a);
                    Activity activity = this.f125590a.f42913m;
                    Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    a2.a((e) activity, false);
                } else {
                    CutVideoMultiModeViewModel a3 = ag.a(this.f125590a);
                    Activity activity2 = this.f125590a.f42913m;
                    Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    e eVar = (e) activity2;
                    l.d(eVar, "");
                    bt btVar = a3.f125537b;
                    if (btVar == null) {
                        l.a("stickerPointController");
                    }
                    btVar.d();
                    new com.ss.android.ugc.aweme.tux.a.i.a(eVar).a(eVar.getResources().getString(R.string.g7t)).a();
                    JediViewModel a4 = t.a(eVar).a(CutVideoListViewModel.class);
                    l.b(a4, "");
                    ((CutVideoListViewModel) a4).b(true);
                    JediViewModel a5 = t.a(eVar).a(CutVideoEditViewModel.class);
                    l.b(a5, "");
                    CutVideoEditViewModel cutVideoEditViewModel = (CutVideoEditViewModel) a5;
                    cutVideoEditViewModel.b(false);
                    bt btVar2 = a3.f125537b;
                    if (btVar2 == null) {
                        l.a("stickerPointController");
                    }
                    btVar2.k().a(false);
                    cutVideoEditViewModel.a();
                }
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a aVar = this.f125590a.f125587b;
                if (aVar != null) {
                    aVar.a(i2);
                }
                boolean a6 = ag.a(this.f125590a).a();
                com.ss.android.ugc.tools.f.b a7 = h.a();
                if (a6) {
                    str = "sync_on";
                } else {
                    str = "sync_off";
                }
                r.a("change_sync_mode", a7.a("to_status", str).f149193a);
            }
        }
    }

    public static final /* synthetic */ CutVideoMultiModeViewModel a(ag agVar) {
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = agVar.f125589d;
        if (cutVideoMultiModeViewModel == null) {
            l.a("multiModelViewModel");
        }
        return cutVideoMultiModeViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((e) activity).a(CutVideoMultiModeViewModel.class);
        l.b(a2, "");
        this.f125589d = (CutVideoMultiModeViewModel) a2;
        StickPointModeChangeView stickPointModeChangeView = this.f125588c;
        if (stickPointModeChangeView == null) {
            l.a("modelChangeView");
        }
        stickPointModeChangeView.setStickPointModeChangeListener(new b(this));
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f125589d;
        if (cutVideoMultiModeViewModel == null) {
            l.a("multiModelViewModel");
        }
        b.a.b(this, cutVideoMultiModeViewModel, ah.f125591a, new c(this));
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel2 = this.f125589d;
        if (cutVideoMultiModeViewModel2 == null) {
            l.a("multiModelViewModel");
        }
        b.a.b(this, cutVideoMultiModeViewModel2, ai.f125592a, new d(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.asl, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class c extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ ag this$0;

        static {
            Covode.recordClassIndex(82471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ag agVar) {
            super(2);
            this.this$0 = agVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            if (booleanValue) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b(this.this$0.a());
            } else {
                this.this$0.a().setVisibility(0);
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ ag this$0;

        static {
            Covode.recordClassIndex(82472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ag agVar) {
            super(2);
            this.this$0 = agVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            if (booleanValue) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a(this.this$0.a());
            } else {
                this.this$0.a().setVisibility(8);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.cna);
        l.b(c2, "");
        this.f125588c = (StickPointModeChangeView) c2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
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
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
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
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super i, ? super Throwable, z> mVar, h.f.a.b<? super i, z> bVar, h.f.a.m<? super i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super i, ? super A, ? super B, ? super C, z> rVar) {
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
