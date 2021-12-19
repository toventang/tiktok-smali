package com.ss.android.ugc.aweme.ftc.f;

import android.app.Activity;
import androidx.lifecycle.ad;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.ac;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.t;
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
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ad;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.vesdk.VERecordData;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.z;
import java.util.List;
import java.util.Objects;

public final class b extends j<a> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f98456a = {new y(b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final long f98457e = com.ss.android.ugc.aweme.port.in.g.a().l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: f  reason: collision with root package name */
    public static final a f98458f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final b f98459b = this;

    /* renamed from: c  reason: collision with root package name */
    public final k<Boolean> f98460c = new k<>();

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.scene.group.b f98461d;

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f98462g = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f98463h = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f98464i = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.o.f f98465j;

    public final com.bytedance.creativex.recorder.b.a.d b() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f98462g.a(this, f98456a[0]);
    }

    /* access modifiers changed from: package-private */
    public final m c() {
        return (m) this.f98463h.a(this, f98456a[1]);
    }

    public final ShortVideoContext d() {
        return (ShortVideoContext) this.f98464i.a(this, f98456a[2]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62617);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.f.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g a() {
        return this.f98460c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f98459b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f98465j;
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

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62623);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b().a(new ac(true, false, 6));
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(62616);
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        if (d().f124757b.b() || d().f124757b.c()) {
            a(false);
        }
        b().r().a(com.bytedance.scene.ktx.c.b(this.f98461d), new C2385b(this));
        c().o().b(this, new c(this));
        c().w().a(this, new d(this));
        c().s().a(this, new e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.f.b$b  reason: collision with other inner class name */
    static final class C2385b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98466a;

        static {
            Covode.recordClassIndex(62618);
        }

        C2385b(b bVar) {
            this.f98466a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f98466a.b(false);
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98468a;

        static {
            Covode.recordClassIndex(62620);
        }

        d(b bVar) {
            this.f98468a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f98468a.a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.f.a
    public final void a(boolean z) {
        this.f98460c.a(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98467a;

        static {
            Covode.recordClassIndex(62619);
        }

        c(b bVar) {
            this.f98467a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            long j2;
            boolean z;
            t tVar = (t) obj;
            if (tVar != null) {
                com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                if (this.f98467a.d().f124757b.t) {
                    j2 = b.f98457e;
                } else {
                    j2 = 15000;
                }
                if (tVar.f28206b != 0 || !tVar.f28205a.isEmpty() || this.f98467a.d().f124757b.f124714i || cVar == null || (((long) cVar.shootDuration) <= j2 && Math.abs(cVar.shootDuration - cVar.duration) < 1000)) {
                    z = false;
                } else {
                    z = true;
                }
                this.f98467a.a(z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.f.a
    public final void b(boolean z) {
        if (com.bytedance.scene.ktx.b.a(this.f98461d) != null) {
            com.bytedance.scene.navigation.d b2 = com.bytedance.scene.ktx.b.b(this.f98461d);
            if (!z || com.ss.android.ugc.aweme.scene.a.a(b2, c.class)) {
                com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this.f98461d);
                if (a2 == null) {
                    l.b();
                }
                if (com.ss.android.ugc.aweme.scene.a.a(a2, c.class)) {
                    b2.E();
                    return;
                }
                return;
            }
            b2.b(new c(new f(this)), (com.bytedance.scene.c.f) null);
            com.ss.android.ugc.aweme.scene.a.a(b2, c.class, new g(this));
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98469a;

        static {
            Covode.recordClassIndex(62621);
        }

        e(b bVar) {
            this.f98469a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            long j2;
            VERecordData vERecordData;
            List<VERecordData.VERecordSegmentData> list;
            RetakeVideoContext n = this.f98469a.d().n();
            if ((n == null || (vERecordData = n.f124750d) == null || (list = vERecordData.f150790b) == null || list.size() <= 1) && this.f98469a.d().f124757b.d().isEmpty()) {
                if (!this.f98469a.d().f124757b.b()) {
                    b bVar = this.f98469a;
                    bVar.a(!bVar.d().f124757b.f124714i);
                }
                b bVar2 = this.f98469a;
                if (cr.a().f125295a != null) {
                    com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                    if (bVar2.d().f124757b.t) {
                        j2 = ad.f124874b;
                    } else {
                        j2 = 15000;
                    }
                    if (cVar == null || (((long) cVar.shootDuration) <= j2 && Math.abs(cVar.shootDuration - cVar.duration) < 1000)) {
                        bVar2.a(false);
                    } else {
                        bVar2.a(true);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            b bVar = this.this$0;
            bVar.b(false);
            androidx.lifecycle.ac a2 = androidx.lifecycle.ae.a(com.bytedance.scene.ktx.c.b(bVar.f98461d), (ad.b) null).a(ShortVideoContextViewModel.class);
            l.b(a2, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
            Activity activity = bVar.f98461d.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity");
            com.ss.android.ugc.aweme.ftc.c cVar = ((FTCVideoRecordNewActivity) activity).t;
            l.b(shortVideoContext, "");
            bVar.b().D().a((ASCameraView) shortVideoContext.f124757b.y, (String) ((long) intValue), shortVideoContext.f124757b.h(), 0L);
            if (intValue != shortVideoContext.f124757b.q) {
                bVar.c().a(shortVideoContext.f124757b.t, true);
            }
            shortVideoContext.d(intValue);
            com.ss.android.ugc.aweme.shortvideo.f.a.a(shortVideoContext.f124757b.y, cr.a().f125295a, intValue);
            if (cVar != null) {
                bVar.c().a(new com.bytedance.creativex.recorder.b.a.j(shortVideoContext.f124757b.f124707b));
                bVar.b().a(new ac(true, false, 6));
            }
            return z.f158842a;
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
        this.f98461d = bVar;
        this.f98465j = fVar;
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
