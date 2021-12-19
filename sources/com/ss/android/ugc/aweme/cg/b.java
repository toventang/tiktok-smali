package com.ss.android.ugc.aweme.cg;

import com.bytedance.als.j;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.t;
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
import com.ss.android.ugc.aweme.qasticker.view.QaStickerView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.k.k;
import h.z;

public final class b extends j<a> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f69844a = {new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final a f69845b = this;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.scene.group.b f69846c;

    /* renamed from: d  reason: collision with root package name */
    private final l<Boolean> f69847d = new l<>(false);

    /* renamed from: e  reason: collision with root package name */
    private final d f69848e = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: f  reason: collision with root package name */
    private final d f69849f = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: g  reason: collision with root package name */
    private c f69850g;

    /* renamed from: h  reason: collision with root package name */
    private final f f69851h;

    /* renamed from: i  reason: collision with root package name */
    private final QaStruct f69852i;

    static {
        Covode.recordClassIndex(43079);
    }

    public final ShortVideoContext c() {
        return (ShortVideoContext) this.f69849f.a(this, f69844a[1]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f69845b;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f69851h;
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

    @Override // com.ss.android.ugc.aweme.cg.a
    public final void b() {
        a(false);
        c().f124768m = null;
    }

    @Override // com.ss.android.ugc.aweme.cg.a
    public final Boolean a() {
        return Boolean.valueOf(h.f.b.l.a((Object) this.f69847d.f6468a.getValue(), (Object) true));
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        c cVar = new c(this.f69852i, c().y);
        this.f69846c.a(R.id.dj5, cVar, "RecordQaStickerScene");
        this.f69850g = cVar;
        this.f69847d.a(this, new a(this));
        ((m) this.f69848e.a(this, f69844a[0])).o().a(this, new C1580b(this));
    }

    public final void a(boolean z) {
        this.f69847d.b(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f69853a;

        static {
            Covode.recordClassIndex(43080);
        }

        a(b bVar) {
            this.f69853a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                com.bytedance.scene.ktx.a.a(this.f69853a.f69846c, "RecordQaStickerScene");
            } else {
                com.bytedance.scene.ktx.a.b(this.f69853a.f69846c, "RecordQaStickerScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cg.b$b  reason: collision with other inner class name */
    static final class C1580b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f69854a;

        static {
            Covode.recordClassIndex(43081);
        }

        C1580b(b bVar) {
            this.f69854a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            t tVar = (t) obj;
            if (tVar != null && tVar.f28205a.isEmpty() && tVar.f28206b == 0 && !this.f69854a.c().f124757b.f124714i && tVar.f28208d && this.f69854a.c().f124768m != null) {
                this.f69854a.a(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.cg.a
    public final void a(QaStruct qaStruct) {
        h.f.b.l.d(qaStruct, "");
        c cVar = this.f69850g;
        if (cVar != null) {
            h.f.b.l.d(qaStruct, "");
            QaStickerView qaStickerView = cVar.f69856a;
            if (qaStickerView == null) {
                h.f.b.l.a("qaStickerView");
            }
            qaStickerView.setVisibility(0);
            QaStickerView qaStickerView2 = cVar.f69856a;
            if (qaStickerView2 == null) {
                h.f.b.l.a("qaStickerView");
            }
            cVar.a(qaStickerView2, qaStruct);
        }
        c().f124768m = qaStruct;
        a(true);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public b(com.bytedance.scene.group.b bVar, f fVar, QaStruct qaStruct) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        this.f69846c = bVar;
        this.f69851h = fVar;
        this.f69852i = qaStruct;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
