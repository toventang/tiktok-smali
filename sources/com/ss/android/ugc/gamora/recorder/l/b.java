package com.ss.android.ugc.gamora.recorder.l;

import androidx.lifecycle.m;
import com.bytedance.als.g;
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
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.z;

public final class b extends j<f> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, f {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f148005a = {new y(b.class, "commerceApiComponent", "getCommerceApiComponent()Lcom/ss/android/ugc/gamora/recorder/commerce/CommerceApiComponent;", 0), new y(b.class, "quickUploadApiComponent", "getQuickUploadApiComponent()Lcom/ss/android/ugc/gamora/recorder/quickupload/QuickUploadComponent;", 0), new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final f f148006b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.als.d<Boolean> f148007c;

    /* renamed from: d  reason: collision with root package name */
    public final k<Integer> f148008d;

    /* renamed from: e  reason: collision with root package name */
    final k<com.ss.android.ugc.aweme.tools.i> f148009e;

    /* renamed from: f  reason: collision with root package name */
    final h.h.d f148010f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f148011g;

    /* renamed from: h  reason: collision with root package name */
    public final e f148012h;

    /* renamed from: i  reason: collision with root package name */
    public final com.bytedance.scene.group.b f148013i;

    /* renamed from: j  reason: collision with root package name */
    public final a f148014j;

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.h.a f148015k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f148016l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.als.d<Integer> f148017m;
    private final boolean n;
    private final h.h.d o;
    private final g<Integer> p;
    private final f q;

    static {
        Covode.recordClassIndex(97573);
    }

    private final com.ss.android.ugc.gamora.recorder.quickupload.k e() {
        return (com.ss.android.ugc.gamora.recorder.quickupload.k) this.o.a(this, f148005a[1]);
    }

    public final com.ss.android.ugc.gamora.recorder.d.a a() {
        return (com.ss.android.ugc.gamora.recorder.d.a) this.f148016l.a(this, f148005a[0]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.gamora.recorder.l.f
    public final g<Integer> b() {
        return this.p;
    }

    @Override // com.ss.android.ugc.gamora.recorder.l.f
    public final g<com.ss.android.ugc.aweme.tools.i> c() {
        return this.f148009e;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ f getApiComponent() {
        return this.f148006b;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.q;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.ss.android.ugc.gamora.recorder.l.f
    public final boolean d() {
        return this.f148014j.a();
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

    private final void f() {
        if (this.f148013i.a("RecordSpeedGroupScene") == null) {
            this.f148013i.a(R.id.dj5, new c(this.f148015k.c(), this.f148017m, this.f148012h), "RecordSpeedGroupScene");
            com.bytedance.scene.ktx.a.b(this.f148013i, "RecordSpeedGroupScene");
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        k<Boolean> kVar;
        super.onCreate();
        if (!this.n) {
            f();
        }
        this.f148007c.a(this, new a(this));
        this.f148015k.a().a(this, new C3988b(this));
        com.ss.android.ugc.gamora.recorder.quickupload.k e2 = e();
        if (e2 != null && (kVar = e2.f148218c) != null) {
            kVar.a(this, new c(this));
        }
    }

    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148021a;

        static {
            Covode.recordClassIndex(97577);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(b bVar) {
            this.f148021a = bVar;
        }

        @Override // com.ss.android.ugc.gamora.recorder.l.e
        public final void a(com.ss.android.ugc.aweme.tools.i iVar) {
            l.d(iVar, "");
            b bVar = this.f148021a;
            l.d(iVar, "");
            bVar.f148009e.a(iVar);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.l.f
    public final void b(boolean z) {
        this.f148007c.b(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.ss.android.ugc.gamora.recorder.l.f
    public final void a(int i2) {
        this.f148017m.b(Integer.valueOf(i2));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.b$b  reason: collision with other inner class name */
    static final class C3988b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148019a;

        static {
            Covode.recordClassIndex(97575);
        }

        C3988b(b bVar) {
            this.f148019a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            b bVar = this.f148019a;
            l.b(bool, "");
            bVar.f148011g = bool.booleanValue();
            if (bool.booleanValue()) {
                T value = this.f148019a.f148007c.f6468a.getValue();
                l.b(value, "");
                if (value.booleanValue()) {
                    this.f148019a.a(true);
                    return;
                }
                return;
            }
            this.f148019a.a(false);
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148020a;

        static {
            Covode.recordClassIndex(97576);
        }

        c(b bVar) {
            this.f148020a = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            b bVar = this.f148020a;
            T value = ((com.bytedance.creativex.recorder.b.a.m) bVar.f148010f.a(bVar, b.f148005a[2])).d().f6468a.getValue();
            l.b(value, "");
            if (!value.booleanValue()) {
                this.f148020a.a(!bool.booleanValue());
                if (!this.f148020a.f148011g) {
                    this.f148020a.a(false);
                }
            }
        }
    }

    static final class a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148018a;

        static {
            Covode.recordClassIndex(97574);
        }

        a(b bVar) {
            this.f148018a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                this.f148018a.f148014j.a(true);
                this.f148018a.f148008d.a((Integer) 0);
                this.f148018a.a().a(false);
                this.f148018a.a(true);
                return;
            }
            this.f148018a.f148014j.a(false);
            this.f148018a.f148008d.a((Integer) 8);
            this.f148018a.a().a(true);
            this.f148018a.a(false);
        }
    }

    public final void a(boolean z) {
        Boolean bool;
        k<Boolean> kVar;
        if (z) {
            com.ss.android.ugc.gamora.recorder.quickupload.k e2 = e();
            if (e2 == null || (kVar = e2.f148218c) == null) {
                bool = null;
            } else {
                bool = kVar.a();
            }
            if (!l.a((Object) bool, (Object) true)) {
                T value = this.f148007c.f6468a.getValue();
                l.b(value, "");
                if (value.booleanValue()) {
                    f();
                    com.bytedance.scene.ktx.a.a(this.f148013i, "RecordSpeedGroupScene");
                    return;
                }
                return;
            }
        }
        if (this.f148013i.a("RecordSpeedGroupScene") != null) {
            com.bytedance.scene.ktx.a.b(this.f148013i, "RecordSpeedGroupScene");
        }
    }

    public /* synthetic */ b(com.bytedance.scene.group.b bVar, f fVar) {
        this(bVar, fVar, new g());
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public b(com.bytedance.scene.group.b bVar, f fVar, a aVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        l.d(aVar, "");
        this.f148013i = bVar;
        this.q = fVar;
        this.f148014j = aVar;
        this.f148006b = this;
        this.f148015k = (com.ss.android.ugc.aweme.shortvideo.h.a) getDiContainer().a(com.ss.android.ugc.aweme.shortvideo.h.a.class, (String) null);
        this.f148016l = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.d.a.class);
        this.f148007c = new com.bytedance.als.d<>(Boolean.valueOf(aVar.a()));
        this.f148017m = new com.bytedance.als.d<>(0);
        k<Integer> kVar = new k<>();
        this.f148008d = kVar;
        this.n = com.ss.android.ugc.aweme.setting.i.j.a();
        this.f148009e = new k<>();
        this.o = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.recorder.quickupload.k.class);
        this.f148010f = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);
        this.f148011g = true;
        this.f148012h = new d(this);
        this.p = kVar;
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
