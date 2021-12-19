package com.ss.android.ugc.gamora.recorder.choosemusic.a;

import android.text.TextUtils;
import com.bytedance.als.g;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.z;
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
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.choosemusic.a.a;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.aj;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c extends j<a> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f147506a = {new y(c.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new y(c.class, "recordControlCoreComponent", "getRecordControlCoreComponent()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(c.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final c f147507b = this;

    /* renamed from: c  reason: collision with root package name */
    public final ShortVideoContext f147508c = ((ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null));

    /* renamed from: d  reason: collision with root package name */
    public final k<Boolean> f147509d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f147510e;

    /* renamed from: f  reason: collision with root package name */
    public final d f147511f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f147512g = com.bytedance.o.b.a.a(getDiContainer(), z.class);

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f147513h = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f147514i = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);

    /* renamed from: j  reason: collision with root package name */
    private final k<Boolean> f147515j;

    /* renamed from: k  reason: collision with root package name */
    private final g<Boolean> f147516k;

    /* renamed from: l  reason: collision with root package name */
    private final g<Boolean> f147517l;

    /* renamed from: m  reason: collision with root package name */
    private final int f147518m;
    private final boolean n;
    private final Map<Integer, Boolean> o;
    private int p;
    private final C3964c q;
    private final f r;

    static {
        Covode.recordClassIndex(97206);
    }

    public final z d() {
        return (z) this.f147512g.a(this, f147506a[0]);
    }

    public final com.ss.android.ugc.gamora.recorder.sticker.c.j e() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f147514i.a(this, f147506a[2]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a.a
    public final g<Boolean> a() {
        return this.f147516k;
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a.a
    public final g<Boolean> b() {
        return this.f147517l;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f147507b;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.r;
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

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.c$c  reason: collision with other inner class name */
    public static final class C3964c implements com.ss.android.medialib.listener.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147521a;

        static {
            Covode.recordClassIndex(97210);
        }

        @Override // com.ss.android.medialib.listener.b
        public final void a(int i2, int i3) {
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.c$c$a */
        static final class a extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ C3964c this$0;

            static {
                Covode.recordClassIndex(97211);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C3964c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                this.this$0.f147521a.d().D().a(this.this$0.f147521a.f147511f);
                return h.z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3964c(c cVar) {
            this.f147521a = cVar;
        }

        @Override // com.ss.android.medialib.listener.b
        public final void a(int i2) {
            com.ss.android.ugc.asve.f.g.a(new a(this));
        }
    }

    public static final class d implements com.ss.android.ugc.asve.recorder.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147522a;

        static {
            Covode.recordClassIndex(97212);
        }

        static final class a extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(97213);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(0);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                this.this$0.f147522a.c(this.this$0.f147522a.e().t().f());
                this.this$0.f147522a.f147510e = true;
                return h.z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f147522a = cVar;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            if (i2 == aj.J) {
                com.ss.android.ugc.asve.f.g.a(new a(this));
            }
        }
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
        if (e.b()) {
            d().D().b(this.q);
            d().D().b(this.f147511f);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a.a
    public final boolean c() {
        Iterator<Boolean> it = this.o.values().iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                boolean booleanValue = it.next().booleanValue();
                if (!z || booleanValue) {
                    z = false;
                }
            }
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.p = -1;
        if (e.b()) {
            d().D().a(this.q);
            ((m) this.f147513h.a(this, f147506a[1])).g().a(this, new a(this));
            e().k().a(this, new b(this));
        }
    }

    static final class a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147519a;

        static {
            Covode.recordClassIndex(97207);
        }

        a(c cVar) {
            this.f147519a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147519a.a(null);
        }
    }

    private final boolean e(Effect effect) {
        return b.a(this.f147508c, effect);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a.a
    public final void a(Effect effect) {
        int i2;
        if (e(effect) && (i2 = this.p) >= 0) {
            this.p = -1;
            d().c(i2, this.f147518m);
            d().a(this.f147518m, i2);
            this.f147515j.a((Boolean) false);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a.a
    public final void c(Effect effect) {
        if (e(effect) && this.p >= 0) {
            d().c(this.p, this.f147518m);
            this.f147515j.a((Boolean) false);
        }
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147520a;

        static {
            Covode.recordClassIndex(97208);
        }

        b(c cVar) {
            this.f147520a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (!this.f147520a.d().D().i()) {
                l.b(bool, "");
                if (bool.booleanValue()) {
                    c cVar = this.f147520a;
                    cVar.a(cVar.f147508c.f124757b.e(), (long) this.f147520a.f147508c.f124757b.q, Long.valueOf(this.f147520a.f147508c.f124757b.k()), null, new h.f.a.a<h.z>(this) {
                        /* class com.ss.android.ugc.gamora.recorder.choosemusic.a.c.b.AnonymousClass1 */
                        final /* synthetic */ b this$0;

                        static {
                            Covode.recordClassIndex(97209);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ h.z invoke() {
                            this.this$0.f147520a.f147509d.a((Boolean) true);
                            return h.z.f158842a;
                        }
                    });
                    return;
                }
                this.f147520a.a(null);
                this.f147520a.f147509d.a((Boolean) false);
            }
        }
    }

    public c(f fVar) {
        boolean z;
        l.d(fVar, "");
        this.r = fVar;
        k<Boolean> kVar = new k<>();
        this.f147515j = kVar;
        this.f147516k = kVar;
        k<Boolean> kVar2 = new k<>();
        this.f147509d = kVar2;
        this.f147517l = kVar2;
        this.f147518m = 1;
        if (e.a() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.n = z;
        this.o = new LinkedHashMap();
        this.p = -1;
        this.f147510e = true;
        this.f147511f = new d(this);
        this.q = new C3964c(this);
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a.a
    public final void b(Effect effect) {
        if (e(effect)) {
            if (this.p >= 0) {
                d().b(this.p, this.f147518m);
                d().a(this.p, this.f147518m, this.n);
                this.f147510e = false;
                this.f147515j.a((Boolean) true);
                return;
            }
            a(this.f147508c.f124757b.e(), (long) this.f147508c.f124757b.q, Long.valueOf(this.f147508c.f124757b.k()), e().t().f(), a.C3962a.C3963a.f147504a);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a.a
    public final void d(Effect effect) {
        if (e(effect)) {
            if (this.p >= 0) {
                if (!this.n && this.f147510e) {
                    d().b(this.p, this.f147518m);
                    this.f147510e = false;
                }
                d().a(this.p, this.f147518m, this.n);
                this.f147515j.a((Boolean) true);
                return;
            }
            a(this.f147508c.f124757b.e(), (long) this.f147508c.f124757b.q, Long.valueOf(this.f147508c.f124757b.k()), e().t().f(), a.C3962a.C3963a.f147504a);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a.a
    public final void a(int i2, boolean z) {
        this.o.put(Integer.valueOf(i2), Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
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
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
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

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a.a
    public final void a(String str, long j2, Long l2, Effect effect, h.f.a.a<h.z> aVar) {
        Integer num;
        p pVar;
        VEUtils.f audioFileInfo;
        l.d(aVar, "");
        if (TextUtils.isEmpty(str) || !e(effect)) {
            c(effect);
            return;
        }
        if (this.p >= 0) {
            a(effect);
        }
        int i2 = (int) j2;
        Integer num2 = null;
        if (l2 != null) {
            num = Integer.valueOf((int) l2.longValue());
        } else {
            num = null;
        }
        if (!(str == null || (audioFileInfo = VEUtils.getAudioFileInfo(str)) == null)) {
            num2 = Integer.valueOf(audioFileInfo.f150828d);
        }
        if (num == null) {
            if (num2 == null) {
                pVar = new p(-1, -1);
            } else {
                pVar = new p(Integer.valueOf(i2), Integer.valueOf(num2.intValue() - i2));
            }
        } else if (num2 == null) {
            pVar = new p(Integer.valueOf(i2), num);
        } else if (num.intValue() + i2 <= num2.intValue()) {
            pVar = new p(Integer.valueOf(i2), num);
        } else {
            pVar = new p(0, Integer.valueOf(Math.min(num.intValue(), num2.intValue())));
        }
        int intValue = ((Number) pVar.component1()).intValue();
        int intValue2 = ((Number) pVar.component2()).intValue();
        if (intValue2 > 0 && intValue >= 0) {
            VETrackParams.a aVar2 = new VETrackParams.a();
            if (aVar2.f61160a.f61151a == null) {
                aVar2.f61160a.f61151a = new ArrayList();
            }
            aVar2.f61160a.f61151a.add(str);
            if (aVar2.f61160a.f61156f == null) {
                aVar2.f61160a.f61156f = new ArrayList();
            }
            aVar2.f61160a.f61156f.add(Double.valueOf(1.0d));
            if (aVar2.f61160a.f61152b == null) {
                aVar2.f61160a.f61152b = new ArrayList();
            }
            aVar2.f61160a.f61152b.add(Integer.valueOf(intValue));
            int i3 = intValue + intValue2;
            if (aVar2.f61160a.f61153c == null) {
                aVar2.f61160a.f61153c = new ArrayList();
            }
            aVar2.f61160a.f61153c.add(Integer.valueOf(i3));
            aVar2.f61160a.f61158h = VETrackParams.b.External;
            VETrackParams vETrackParams = aVar2.f61160a;
            z d2 = d();
            int i4 = this.f147518m;
            l.b(vETrackParams, "");
            int a2 = d2.a(i4, vETrackParams);
            if (a2 >= 0) {
                this.p = a2;
                d().a(a2, this.f147518m, this.n);
                this.f147510e = false;
                this.f147515j.a((Boolean) true);
                aVar.invoke();
            }
        }
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
