package com.ss.android.ugc.aweme.ftc.k;

import androidx.lifecycle.m;
import com.bytedance.als.d;
import com.bytedance.als.j;
import com.bytedance.als.k;
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
import com.bytedance.jedi.arch.v;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.tools.i;
import com.ss.android.ugc.gamora.recorder.l.e;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.z;

public final class a extends j<d> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, d {

    /* renamed from: a  reason: collision with root package name */
    public final d f98649a = this;

    /* renamed from: b  reason: collision with root package name */
    public final d<Boolean> f98650b = new d<>(Boolean.valueOf(g.a().e().getSpeedPanelOpen(false)));

    /* renamed from: c  reason: collision with root package name */
    public final k<Integer> f98651c;

    /* renamed from: d  reason: collision with root package name */
    final k<i> f98652d;

    /* renamed from: e  reason: collision with root package name */
    public final e f98653e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.scene.group.b f98654f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.h.a f98655g = ((com.ss.android.ugc.aweme.shortvideo.h.a) getDiContainer().a(com.ss.android.ugc.aweme.shortvideo.h.a.class, (String) null));

    /* renamed from: h  reason: collision with root package name */
    private final com.bytedance.als.g<Integer> f98656h;

    /* renamed from: i  reason: collision with root package name */
    private final f f98657i;

    static {
        Covode.recordClassIndex(62724);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ftc.k.d
    public final com.bytedance.als.g<Integer> a() {
        return this.f98656h;
    }

    @Override // com.ss.android.ugc.aweme.ftc.k.d
    public final com.bytedance.als.g<i> b() {
        return this.f98652d;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ d getApiComponent() {
        return this.f98649a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f98657i;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
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
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f98654f.a(R.id.dj5, new b(this.f98655g.c(), this.f98653e), "FTCRecordSpeedGroupScene");
        com.bytedance.scene.ktx.a.b(this.f98654f, "FTCRecordSpeedGroupScene");
        this.f98650b.a(this, new C2394a(this));
        this.f98655g.a().a(this, new b(this));
    }

    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f98660a;

        static {
            Covode.recordClassIndex(62727);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f98660a = aVar;
        }

        @Override // com.ss.android.ugc.gamora.recorder.l.e
        public final void a(i iVar) {
            l.d(iVar, "");
            a aVar = this.f98660a;
            l.d(iVar, "");
            aVar.f98652d.a(iVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.k.d
    public final void a(boolean z) {
        this.f98650b.b(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f98659a;

        static {
            Covode.recordClassIndex(62726);
        }

        b(a aVar) {
            this.f98659a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                T value = this.f98659a.f98650b.f6468a.getValue();
                l.b(value, "");
                if (value.booleanValue()) {
                    com.bytedance.scene.ktx.a.a(this.f98659a.f98654f, "FTCRecordSpeedGroupScene");
                    return;
                }
                return;
            }
            com.bytedance.scene.ktx.a.b(this.f98659a.f98654f, "FTCRecordSpeedGroupScene");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.k.a$a  reason: collision with other inner class name */
    static final class C2394a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f98658a;

        static {
            Covode.recordClassIndex(62725);
        }

        C2394a(a aVar) {
            this.f98658a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                g.a().e().setSpeedPanelOpen(true);
                this.f98658a.f98651c.a((Integer) 0);
                com.bytedance.scene.ktx.a.a(this.f98658a.f98654f, "FTCRecordSpeedGroupScene");
                return;
            }
            g.a().e().setSpeedPanelOpen(false);
            this.f98658a.f98651c.a((Integer) 8);
            com.bytedance.scene.ktx.a.b(this.f98658a.f98654f, "FTCRecordSpeedGroupScene");
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    public a(com.bytedance.scene.group.b bVar, f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.f98654f = bVar;
        this.f98657i = fVar;
        k<Integer> kVar = new k<>();
        this.f98651c = kVar;
        this.f98652d = new k<>();
        this.f98653e = new c(this);
        this.f98656h = kVar;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
