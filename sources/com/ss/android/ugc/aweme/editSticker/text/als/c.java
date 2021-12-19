package com.ss.android.ugc.aweme.editSticker.text.als;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.v;
import com.bytedance.o.f;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.editSticker.text.view.i;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.h;
import h.k.k;
import h.m;
import h.z;

public final class c extends j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: e  reason: collision with root package name */
    public static final b f88350e = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.f.a.a.j f88351a;

    /* renamed from: b  reason: collision with root package name */
    public i f88352b;

    /* renamed from: c  reason: collision with root package name */
    public e f88353c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f88354d;

    /* renamed from: f  reason: collision with root package name */
    private final h f88355f = h.i.a(m.NONE, new a(this));

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.editSticker.text.a f88356g;

    /* renamed from: h  reason: collision with root package name */
    private final f f88357h;

    /* renamed from: i  reason: collision with root package name */
    private final d f88358i;

    /* renamed from: j  reason: collision with root package name */
    private final int f88359j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f88360k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f88361l;

    static {
        Covode.recordClassIndex(55579);
    }

    private final com.ss.android.ugc.aweme.shortvideo.preview.a a() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f88355f.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(55581);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f88357h;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
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

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(55580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.als.c.a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        com.ss.android.ugc.aweme.editSticker.text.a aVar = this.f88356g;
        if (aVar == null) {
            l.a("textStickerController");
        }
        aVar.g();
        super.n_();
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        com.ss.android.ugc.aweme.editSticker.text.a aVar = this.f88356g;
        if (aVar == null) {
            l.a("textStickerController");
        }
        aVar.o();
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        com.ss.android.ugc.aweme.editSticker.text.a aVar = this.f88356g;
        if (aVar == null) {
            l.a("textStickerController");
        }
        aVar.p();
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        com.ss.android.ugc.aweme.editSticker.text.a aVar = this.f88356g;
        if (aVar == null) {
            l.a("textStickerController");
        }
        aVar.f();
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.i(4053);
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        Activity activity = this.f42913m;
        if (activity != null) {
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
            com.bytedance.f.a.a.j jVar = this.f88351a;
            if (jVar == null) {
                l.a("gestureService");
            }
            com.ss.android.ugc.aweme.shortvideo.preview.a a2 = a();
            boolean z = this.f88360k;
            FrameLayout frameLayout = (FrameLayout) viewGroup;
            i iVar = this.f88352b;
            if (iVar == null) {
                l.a("inputLayout");
            }
            e eVar2 = this.f88353c;
            if (eVar2 == null) {
                l.a("deleteComponent");
            }
            com.ss.android.ugc.aweme.editSticker.text.a aVar = new com.ss.android.ugc.aweme.editSticker.text.a(eVar, jVar, a2, z, frameLayout, iVar, eVar2, a().C(), this.f88358i, this.f88359j, null, this.f88354d, this.f88361l, 3072);
            this.f88356g = aVar;
            aVar.e();
            View view = new View(frameLayout.getContext());
            MethodCollector.o(4053);
            return view;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(4053);
        throw nullPointerException;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
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
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends d<? extends A>> kVar, ah<ak<d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
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

    public c(f fVar, d dVar, int i2, boolean z, boolean z2) {
        l.d(fVar, "");
        this.f88357h = fVar;
        this.f88358i = dVar;
        this.f88359j = i2;
        this.f88360k = z;
        this.f88361l = z2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
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
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
