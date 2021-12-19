package com.ss.android.ugc.aweme.shortvideo.countdown;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.als.g;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.ac;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.o;
import com.bytedance.jedi.arch.JediViewModel;
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
import com.bytedance.scene.c.f;
import com.bytedance.scene.navigation.h;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.z;
import java.util.Objects;

public final class b extends j<a> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f125145a = {new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final d f125146b = ((d) getDiContainer().a(d.class, (String) null));

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.k.a f125147c = ((com.ss.android.ugc.gamora.recorder.k.a) getDiContainer().a(com.ss.android.ugc.gamora.recorder.k.a.class, (String) null));

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.choosemusic.a.a f125148d = ((com.ss.android.ugc.gamora.recorder.choosemusic.a.a) getDiContainer().b(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, null));

    /* renamed from: e  reason: collision with root package name */
    final k<Integer> f125149e;

    /* renamed from: f  reason: collision with root package name */
    public int f125150f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.scene.j f125151g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.f.a f125152h;

    /* renamed from: i  reason: collision with root package name */
    public final com.bytedance.scene.group.b f125153i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f125154j = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.h.a f125155k = ((com.ss.android.ugc.aweme.shortvideo.h.a) getDiContainer().a(com.ss.android.ugc.aweme.shortvideo.h.a.class, (String) null));

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f125156l = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);

    /* renamed from: m  reason: collision with root package name */
    private final g<Integer> f125157m;
    private final f n;

    static {
        Covode.recordClassIndex(82197);
    }

    public final m b() {
        return (m) this.f125154j.a(this, f125145a[0]);
    }

    public final com.ss.android.ugc.gamora.recorder.sticker.c.j c() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f125156l.a(this, f125145a[1]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.countdown.a
    public final g<Integer> a() {
        return this.f125157m;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.n;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b$b  reason: collision with other inner class name */
    public static final class C3265b implements com.ss.android.ugc.gamora.recorder.f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f125159a;

        static {
            Covode.recordClassIndex(82200);
        }

        @Override // com.ss.android.ugc.gamora.recorder.f.a
        public final void a() {
            this.f125159a.a(false);
        }

        @Override // com.ss.android.ugc.gamora.recorder.f.a
        public final void b() {
            if (this.f125159a.f125153i.f42913m != null) {
                this.f125159a.f125147c.c(false);
                this.f125159a.b().e(true);
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.f.a
        public final void c() {
            com.bytedance.scene.navigation.d a2;
            if (this.f125159a.f125153i.f42913m != null) {
                this.f125159a.b().e(false);
                this.f125159a.f125146b.a(new ac(true, false, 6));
                com.bytedance.scene.j jVar = this.f125159a.f125151g;
                if (jVar != null && (a2 = com.bytedance.scene.ktx.b.a(this.f125159a.f125153i)) != null) {
                    a2.b(jVar);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3265b(b bVar) {
            this.f125159a = bVar;
        }

        @Override // com.ss.android.ugc.gamora.recorder.f.a
        public final void a(int i2) {
            b bVar = this.f125159a;
            bVar.f125150f = i2;
            bVar.f125149e.a(Integer.valueOf(i2));
        }

        @Override // com.ss.android.ugc.gamora.recorder.f.a
        public final void a(boolean z) {
            this.f125159a.f125146b.a(new ac(!z, false, 6));
        }

        @Override // com.ss.android.ugc.gamora.recorder.f.a
        public final void a(long j2) {
            if (this.f125159a.f125153i.f42913m != null) {
                this.f125159a.b().a(new o(3, this.f125159a.f125150f, 4));
                this.f125159a.b().a(this.f125159a.f125150f);
                com.ss.android.ugc.gamora.recorder.k.a aVar = (com.ss.android.ugc.gamora.recorder.k.a) this.f125159a.getDiContainer().b(com.ss.android.ugc.gamora.recorder.k.a.class, null);
                if (aVar != null) {
                    aVar.c(true);
                    aVar.a();
                    aVar.d();
                    aVar.c();
                }
                this.f125159a.b().e(false);
                this.f125159a.b().a(j2);
            }
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
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

    public final boolean d() {
        com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this.f125153i);
        if (a2 == null) {
            l.b();
        }
        return com.ss.android.ugc.aweme.scene.a.a(a2, com.ss.android.ugc.gamora.recorder.f.b.class);
    }

    public static final class c implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f125160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.navigation.d f125161b;

        static {
            Covode.recordClassIndex(82201);
        }

        @Override // com.bytedance.scene.navigation.h
        public final boolean a() {
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = this.f125160a.f125148d;
            if (aVar != null) {
                aVar.a(1, false);
            }
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar2 = this.f125160a.f125148d;
            if (aVar2 != null) {
                aVar2.b(this.f125160a.c().t().f());
            }
            this.f125161b.a(this);
            return false;
        }

        c(b bVar, com.bytedance.scene.navigation.d dVar) {
            this.f125160a = bVar;
            this.f125161b = dVar;
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public static final class a extends com.bytedance.scene.a.a.b {
        static {
            Covode.recordClassIndex(82198);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b$a$a  reason: collision with other inner class name */
        static final class C3264a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.bytedance.scene.a.a f125158a;

            static {
                Covode.recordClassIndex(82199);
            }

            C3264a(com.bytedance.scene.a.a aVar) {
                this.f125158a = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.bytedance.scene.a.a aVar = this.f125158a;
                if (aVar == null) {
                    l.b();
                }
                View view = aVar.f42664b;
                l.b(view, "");
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setTranslationY(((Float) animatedValue).floatValue());
            }
        }

        @Override // com.bytedance.scene.a.a.b, com.bytedance.scene.a.e
        public final Animator b(com.bytedance.scene.a.a aVar, com.bytedance.scene.a.a aVar2) {
            if (aVar == null) {
                return new AnimatorSet();
            }
            View view = aVar.f42664b;
            l.b(view, "");
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) view.getMeasuredHeight());
            ofFloat.addUpdateListener(new C3264a(aVar));
            l.b(ofFloat, "");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(250L);
            return ofFloat;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.countdown.a
    public final void a(boolean z) {
        com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this.f125153i);
        if (a2 != null) {
            if (z && !com.ss.android.ugc.aweme.scene.a.a(a2, com.ss.android.ugc.gamora.recorder.f.b.class)) {
                com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = this.f125148d;
                if (aVar != null) {
                    aVar.a(1, true);
                }
                com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar2 = this.f125148d;
                if (aVar2 != null) {
                    aVar2.c(null);
                }
                if (com.ss.android.ugc.aweme.shortvideo.sticker.c.h(c().t().f())) {
                    this.f125146b.D().h();
                }
                com.ss.android.ugc.gamora.recorder.f.b bVar = new com.ss.android.ugc.gamora.recorder.f.b(this.f125152h);
                this.f125151g = bVar;
                f.a aVar3 = new f.a();
                aVar3.f42752a = true;
                aVar3.f42754c = new a();
                a2.b(bVar, aVar3.b());
                a2.a(com.bytedance.scene.ktx.c.b(this.f125153i), new c(this, a2));
            } else if (com.ss.android.ugc.aweme.scene.a.a(a2, com.ss.android.ugc.gamora.recorder.f.b.class)) {
                a2.E();
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    public b(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.f125153i = bVar;
        this.n = fVar;
        k<Integer> kVar = new k<>();
        this.f125149e = kVar;
        this.f125157m = kVar;
        this.f125152h = new C3265b(this);
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
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
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
