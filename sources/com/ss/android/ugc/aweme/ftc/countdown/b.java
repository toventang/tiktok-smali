package com.ss.android.ugc.aweme.ftc.countdown;

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
    static final /* synthetic */ i[] f98320a = {new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final d f98321b = ((d) getDiContainer().a(d.class, (String) null));

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.ftc.h.a f98322c = ((com.ss.android.ugc.aweme.ftc.h.a) getDiContainer().a(com.ss.android.ugc.aweme.ftc.h.a.class, (String) null));

    /* renamed from: d  reason: collision with root package name */
    final k<Integer> f98323d;

    /* renamed from: e  reason: collision with root package name */
    public int f98324e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.scene.j f98325f;

    /* renamed from: g  reason: collision with root package name */
    public final i f98326g;

    /* renamed from: h  reason: collision with root package name */
    public final com.bytedance.scene.group.b f98327h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f98328i = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: j  reason: collision with root package name */
    private final g<Integer> f98329j;

    /* renamed from: k  reason: collision with root package name */
    private final f f98330k;

    static {
        Covode.recordClassIndex(62535);
    }

    public final m b() {
        return (m) this.f98328i.a(this, f98320a[0]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ftc.countdown.a
    public final g<Integer> a() {
        return this.f98329j;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f98330k;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.b$b  reason: collision with other inner class name */
    public static final class C2379b implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98332a;

        static {
            Covode.recordClassIndex(62538);
        }

        @Override // com.ss.android.ugc.aweme.ftc.countdown.i
        public final void a() {
            this.f98332a.a(false);
        }

        @Override // com.ss.android.ugc.aweme.ftc.countdown.i
        public final void b() {
            if (this.f98332a.f98327h.f42913m != null) {
                this.f98332a.f98322c.b(false);
                this.f98332a.b().e(true);
            }
        }

        @Override // com.ss.android.ugc.aweme.ftc.countdown.i
        public final void c() {
            com.bytedance.scene.navigation.d a2;
            if (this.f98332a.f98327h.f42913m != null) {
                this.f98332a.b().e(false);
                this.f98332a.f98321b.a(new ac(true, false, 6));
                com.bytedance.scene.j jVar = this.f98332a.f98325f;
                if (jVar != null && (a2 = com.bytedance.scene.ktx.b.a(this.f98332a.f98327h)) != null) {
                    a2.b(jVar);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2379b(b bVar) {
            this.f98332a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.ftc.countdown.i
        public final void a(int i2) {
            b bVar = this.f98332a;
            bVar.f98324e = i2;
            bVar.f98323d.a(Integer.valueOf(i2));
        }

        @Override // com.ss.android.ugc.aweme.ftc.countdown.i
        public final void a(boolean z) {
            this.f98332a.f98321b.a(new ac(!z, false, 6));
        }

        @Override // com.ss.android.ugc.aweme.ftc.countdown.i
        public final void a(long j2) {
            if (this.f98332a.f98327h.f42913m != null) {
                this.f98332a.b().a(new o(3, this.f98332a.f98324e, 4));
                this.f98332a.b().a(this.f98332a.f98324e);
                com.ss.android.ugc.aweme.ftc.h.a aVar = (com.ss.android.ugc.aweme.ftc.h.a) this.f98332a.getDiContainer().b(com.ss.android.ugc.aweme.ftc.h.a.class, null);
                if (aVar != null) {
                    aVar.b(true);
                    aVar.b();
                    aVar.e();
                    aVar.d();
                }
                this.f98332a.b().e(false);
                this.f98332a.b().a(j2);
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

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public static final class a extends com.bytedance.scene.a.a.b {
        static {
            Covode.recordClassIndex(62536);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.b$a$a  reason: collision with other inner class name */
        static final class C2378a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.bytedance.scene.a.a f98331a;

            static {
                Covode.recordClassIndex(62537);
            }

            C2378a(com.bytedance.scene.a.a aVar) {
                this.f98331a = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.bytedance.scene.a.a aVar = this.f98331a;
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
            ofFloat.addUpdateListener(new C2378a(aVar));
            l.b(ofFloat, "");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(250L);
            return ofFloat;
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.countdown.a
    public final void a(boolean z) {
        com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this.f98327h);
        if (a2 != null) {
            if (z && !com.ss.android.ugc.aweme.scene.a.a(a2, j.class)) {
                j jVar = new j(this.f98326g);
                this.f98325f = jVar;
                f.a aVar = new f.a();
                aVar.f42752a = true;
                aVar.f42754c = new a();
                a2.b(jVar, aVar.b());
            } else if (com.ss.android.ugc.aweme.scene.a.a(a2, j.class)) {
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
        this.f98327h = bVar;
        this.f98330k = fVar;
        k<Integer> kVar = new k<>();
        this.f98323d = kVar;
        this.f98329j = kVar;
        this.f98326g = new C2379b(this);
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
