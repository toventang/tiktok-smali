package com.ss.android.ugc.gamora.recorder.j;

import android.app.Activity;
import androidx.lifecycle.ad;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.ac;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.t;
import com.bytedance.creativex.recorder.b.a.z;
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
import com.ss.android.ugc.aweme.setting.i.p;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ad;
import com.ss.android.ugc.aweme.shortvideo.ch;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.gamora.recorder.choosemusic.a.a;
import com.ss.android.vesdk.VERecordData;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import java.util.List;
import java.util.Objects;

public final class b extends j<a> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f147821a = {new y(b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new y(b.class, "tiktokCameraApi", "getTiktokCameraApi()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final long f147822g = com.ss.android.ugc.aweme.port.in.g.a().l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: h  reason: collision with root package name */
    public static final a f147823h = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final b f147824b = this;

    /* renamed from: c  reason: collision with root package name */
    public final k<Boolean> f147825c = new k<>();

    /* renamed from: d  reason: collision with root package name */
    final com.ss.android.ugc.gamora.recorder.choosemusic.a.a f147826d = ((com.ss.android.ugc.gamora.recorder.choosemusic.a.a) getDiContainer().b(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, null));

    /* renamed from: e  reason: collision with root package name */
    public boolean f147827e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.scene.group.b f147828f;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f147829i = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f147830j = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f147831k = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f147832l = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);

    /* renamed from: m  reason: collision with root package name */
    private final h.h.d f147833m = com.bytedance.o.b.a.a(getDiContainer(), z.class);
    private final c n = new c(new g(this));
    private final com.bytedance.scene.navigation.h o = new C3982b(this);
    private final com.bytedance.o.f p;

    public final com.bytedance.creativex.recorder.b.a.d b() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f147829i.a(this, f147821a[0]);
    }

    /* access modifiers changed from: package-private */
    public final m c() {
        return (m) this.f147830j.a(this, f147821a[1]);
    }

    public final ShortVideoContext d() {
        return (ShortVideoContext) this.f147831k.a(this, f147821a[2]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.recorder.sticker.c.j e() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f147832l.a(this, f147821a[3]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97451);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.j.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g a() {
        return this.f147825c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f147824b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.p;
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
    public final void g() {
        com.bytedance.scene.ktx.b.b(this.f147828f).a(this.o);
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            Objects.requireNonNull(this.this$0.f147828f.f42913m, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            this.this$0.b().a(new ac(true, false, 6));
            return h.z.f158842a;
        }
    }

    public final boolean f() {
        com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this.f147828f);
        if (a2 == null) {
            l.b();
        }
        return com.ss.android.ugc.aweme.scene.a.a(a2, c.class);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.b$b  reason: collision with other inner class name */
    static final class C3982b implements com.bytedance.scene.navigation.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147834a;

        static {
            Covode.recordClassIndex(97452);
        }

        C3982b(b bVar) {
            this.f147834a = bVar;
        }

        @Override // com.bytedance.scene.navigation.h
        public final boolean a() {
            b bVar = this.f147834a;
            bVar.c(true);
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = bVar.f147826d;
            if (aVar != null) {
                aVar.a(0, false);
            }
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar2 = bVar.f147826d;
            if (aVar2 != null) {
                aVar2.a(bVar.d().f124757b.e(), (long) bVar.d().f124757b.q, Long.valueOf(bVar.d().f124757b.k()), bVar.e().t().f(), a.C3962a.C3963a.f147504a);
            }
            bVar.g();
            return false;
        }
    }

    static {
        Covode.recordClassIndex(97450);
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        if (d().f124757b.b() || d().f124757b.c()) {
            a(false);
        }
        b().r().a(com.bytedance.scene.ktx.c.b(this.f147828f), new c(this));
        c().o().b(this, new d(this));
        c().w().a(this, new e(this));
        c().s().a(this, new f(this));
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147835a;

        static {
            Covode.recordClassIndex(97453);
        }

        c(b bVar) {
            this.f147835a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147835a.b(false);
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147837a;

        static {
            Covode.recordClassIndex(97455);
        }

        e(b bVar) {
            this.f147837a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147837a.a(false);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.j.a
    public final void a(boolean z) {
        this.f147825c.a(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public final void c(boolean z) {
        if (!com.ss.android.ugc.aweme.shortvideo.sticker.c.h(e().t().f())) {
            return;
        }
        if (z) {
            b().D().g();
        } else {
            b().D().h();
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147836a;

        static {
            Covode.recordClassIndex(97454);
        }

        d(b bVar) {
            this.f147836a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            long j2;
            boolean z;
            t tVar = (t) obj;
            if (tVar != null) {
                com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                if (this.f147836a.d().f124757b.t) {
                    j2 = b.f147822g;
                } else {
                    j2 = 15000;
                }
                if (tVar.f28206b != 0 || !tVar.f28205a.isEmpty() || this.f147836a.d().f124757b.f124714i || cVar == null || (((long) cVar.shootDuration) <= j2 && Math.abs(cVar.shootDuration - cVar.duration) < 1000)) {
                    z = false;
                } else {
                    z = true;
                }
                this.f147836a.d();
                if (p.a() != 2) {
                    this.f147836a.a(z);
                } else if (z != this.f147836a.f147827e) {
                    this.f147836a.a(z);
                    this.f147836a.f147827e = z;
                }
            }
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147838a;

        static {
            Covode.recordClassIndex(97456);
        }

        f(b bVar) {
            this.f147838a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            long j2;
            VERecordData vERecordData;
            List<VERecordData.VERecordSegmentData> list;
            RetakeVideoContext n = this.f147838a.d().n();
            if ((n == null || (vERecordData = n.f124750d) == null || (list = vERecordData.f150790b) == null || list.size() <= 1) && this.f147838a.d().f124757b.d().isEmpty()) {
                if (!this.f147838a.d().f124757b.b()) {
                    b bVar = this.f147838a;
                    bVar.a(true ^ bVar.d().f124757b.f124714i);
                }
                b bVar2 = this.f147838a;
                if (cr.a().f125295a != null) {
                    com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                    if (cVar != null) {
                        l.b(cVar, "");
                        if (bVar2.d().f124757b.t) {
                            j2 = ad.f124874b;
                        } else {
                            j2 = 15000;
                        }
                        bVar2.a(j2, cVar);
                        return;
                    }
                    return;
                }
                bVar2.a(false);
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.j.a
    public final void b(boolean z) {
        if (com.bytedance.scene.ktx.b.a(this.f147828f) != null) {
            com.bytedance.scene.navigation.d b2 = com.bytedance.scene.ktx.b.b(this.f147828f);
            if (z && !com.ss.android.ugc.aweme.scene.a.a(b2, c.class)) {
                com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = this.f147826d;
                if (aVar != null) {
                    aVar.a(0, true);
                }
                com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar2 = this.f147826d;
                if (aVar2 != null) {
                    aVar2.c(null);
                }
                c(false);
                b2.b(this.n, (com.bytedance.scene.c.f) null);
                com.ss.android.ugc.aweme.scene.a.a(b2, c.class, new h(this));
                b2.a(com.bytedance.scene.ktx.c.b(this.f147828f), this.o);
            } else if (f()) {
                b2.b(this.n);
                g();
            }
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Integer, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            int intValue = num.intValue();
            b bVar = this.this$0;
            bVar.b(false);
            androidx.lifecycle.ac a2 = androidx.lifecycle.ae.a(com.bytedance.scene.ktx.c.b(bVar.f147828f), (ad.b) null).a(ShortVideoContextViewModel.class);
            l.b(a2, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
            Activity activity = bVar.f147828f.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            ch chVar = ((VideoRecordNewActivity) activity).u;
            ASCameraView D = bVar.b().D();
            String str = shortVideoContext.f124757b.y;
            long j2 = (long) intValue;
            l.b(shortVideoContext, "");
            D.a((ASCameraView) str, (String) j2, shortVideoContext.f124757b.h(), 0L);
            if (intValue != shortVideoContext.f124757b.q) {
                bVar.c().a(shortVideoContext.f124757b.t, true);
            }
            shortVideoContext.d(intValue);
            com.ss.android.ugc.aweme.shortvideo.f.a.a(shortVideoContext.f124757b.y, cr.a().f125295a, intValue);
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = bVar.f147826d;
            if (aVar != null) {
                aVar.a(0, false);
            }
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar2 = bVar.f147826d;
            if (aVar2 != null) {
                aVar2.a(shortVideoContext.f124757b.e(), j2, Long.valueOf(shortVideoContext.f124757b.k()), bVar.e().t().f(), a.C3962a.C3963a.f147504a);
            }
            if (chVar != null) {
                bVar.c().a(new com.bytedance.creativex.recorder.b.a.j(shortVideoContext.f124757b.f124707b));
                bVar.b().a(new ac(true, false, 6));
            }
            this.this$0.c(true);
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.ss.android.ugc.gamora.recorder.j.a
    public final void a(long j2, com.ss.android.ugc.aweme.shortvideo.c cVar) {
        l.d(cVar, "");
        if (cVar.musicType == 1) {
            if (((long) cVar.shootDuration) > j2 || Math.abs(cVar.shootDuration - cVar.duration) >= 1000) {
                a(true);
            } else {
                a(false);
            }
        } else if (cVar.musicType != 0) {
        } else {
            if (cVar.getLocalMusicDuration() > j2) {
                a(true);
            } else {
                a(false);
            }
        }
    }

    public b(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.f147828f = bVar;
        this.p = fVar;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
