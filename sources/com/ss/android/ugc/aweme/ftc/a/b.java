package com.ss.android.ugc.aweme.ftc.a;

import android.text.TextUtils;
import android.view.animation.Animation;
import com.bytedance.als.k;
import com.bytedance.bpea.basics.PrivacyCert;
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
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.as;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class b extends com.bytedance.als.j<a> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f97394a = {new y(b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final a f97395b = this;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.b.e f97396c;

    /* renamed from: d  reason: collision with root package name */
    public final c f97397d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.scene.group.b f97398e;

    /* renamed from: f  reason: collision with root package name */
    public final List<com.ss.android.ugc.gamora.recorder.b.a> f97399f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.h.a f97400g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f97401h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f97402i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f97403j;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.gamora.a.a f97404k;

    /* renamed from: l  reason: collision with root package name */
    private final k<com.ss.android.ugc.gamora.recorder.b.c> f97405l;

    /* renamed from: m  reason: collision with root package name */
    private final k<String> f97406m;
    private final com.bytedance.als.g<com.ss.android.ugc.gamora.recorder.b.c> n;
    private final k<Boolean> o;
    private boolean p;
    private final h.h q;
    private final com.bytedance.o.f r;

    static {
        Covode.recordClassIndex(61875);
    }

    private final m d() {
        return (m) this.f97402i.a(this, f97394a[1]);
    }

    public final com.bytedance.creativex.recorder.b.a.d b() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f97401h.a(this, f97394a[0]);
    }

    public final ShortVideoContext c() {
        return (ShortVideoContext) this.f97403j.a(this, f97394a[2]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ftc.a.a
    public final com.bytedance.als.g<com.ss.android.ugc.gamora.recorder.b.c> a() {
        return this.n;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f97395b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
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

    static final class j extends h.f.b.m implements h.f.a.a<as> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(61885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ as invoke() {
            this.this$0.b();
            return new as(this.this$0.c(), this.this$0.getDiContainer());
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        T t;
        super.onCreate();
        T t2 = null;
        if (b().b()) {
            b().a((com.bytedance.creativex.recorder.b.a.d) null, (PrivacyCert) false);
        }
        Object a2 = this.f97398e.B().a("record_env_context");
        if (a2 == null) {
            l.b();
        }
        com.ss.android.ugc.gamora.a.a aVar = (com.ss.android.ugc.gamora.a.a) a2;
        this.f97404k = aVar;
        com.ss.android.ugc.gamora.recorder.b.e eVar = this.f97396c;
        if (aVar == null) {
            l.a("recordEnv");
        }
        eVar.a(aVar, this.f97399f, this.f97405l, this.f97406m);
        List<com.ss.android.ugc.gamora.recorder.b.f> list = this.f97396c.f147382a;
        for (T t3 : list) {
            if (t3.f147394c != null) {
                com.bytedance.scene.ktx.a.a(this.f97398e, R.id.dj5, t3.f147394c, t3.f147394c.a());
            }
        }
        this.f97398e.a(R.id.dj5, this.f97397d, "FTCRecordBottomTabScene");
        com.bytedance.scene.group.b bVar = this.f97398e;
        for (T t4 : list) {
            t4.f147392a.observe(com.bytedance.scene.ktx.b.b(bVar), new C2344b(this, bVar, t4));
        }
        this.o.a(bVar, new a(bVar));
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f147393b.f147379e) {
                break;
            }
        }
        T t5 = t;
        if (t5 != null) {
            a(bVar, t5, true);
        }
        com.bytedance.scene.group.b bVar2 = this.f97398e;
        if (!this.p) {
            this.p = true;
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                if (next.f147393b.f147379e) {
                    t2 = next;
                    break;
                }
            }
            T t6 = t2;
            if (t6 != null) {
                a(bVar2, t6, false);
                this.f97396c.e();
            }
        }
        this.n.a(this, new c(this));
        d().o().b(this, new d(this));
        d().h().a(this, new e(this));
        d().k().a(this, new f(this));
        d().w().a(this, new g(this));
        b().aj().a(this, new h(this));
        b().ai().a(this, new i(this));
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97413a;

        static {
            Covode.recordClassIndex(61880);
        }

        e(b bVar) {
            this.f97413a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97413a.a(false);
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97415a;

        static {
            Covode.recordClassIndex(61882);
        }

        g(b bVar) {
            this.f97415a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97415a.a(false);
        }
    }

    public final void a(boolean z) {
        this.o.a(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f97407a;

        static {
            Covode.recordClassIndex(61876);
        }

        a(com.bytedance.scene.group.b bVar) {
            this.f97407a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                com.bytedance.scene.ktx.a.a(this.f97407a, "FTCRecordBottomTabScene");
            } else {
                com.bytedance.scene.ktx.a.b(this.f97407a, "FTCRecordBottomTabScene");
            }
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97412a;

        static {
            Covode.recordClassIndex(61879);
        }

        d(b bVar) {
            this.f97412a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            t tVar = (t) obj;
            if (tVar == null) {
                return;
            }
            if (!tVar.f28205a.isEmpty() || tVar.f28206b != 0) {
                this.f97412a.a(false);
            } else if (!this.f97412a.c().f124757b.f124714i && tVar.f28208d) {
                this.f97412a.a(true);
            }
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97414a;

        static {
            Covode.recordClassIndex(61881);
        }

        f(b bVar) {
            this.f97414a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f97414a.c().f124757b.h() <= 0 && !this.f97414a.c().f124757b.f124714i) {
                this.f97414a.a(true);
            }
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97416a;

        static {
            Covode.recordClassIndex(61883);
        }

        h(b bVar) {
            this.f97416a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            c cVar = this.f97416a.f97397d;
            Animation animation = ((com.bytedance.creativex.recorder.b.a.k) obj).f28194a;
            l.d(animation, "");
            TabHost tabHost = cVar.f97419a;
            if (tabHost == null) {
                l.a("tabHost");
            }
            tabHost.clearAnimation();
            TabHost tabHost2 = cVar.f97419a;
            if (tabHost2 == null) {
                l.a("tabHost");
            }
            tabHost2.startAnimation(animation);
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97417a;

        static {
            Covode.recordClassIndex(61884);
        }

        i(b bVar) {
            this.f97417a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.l lVar = (com.bytedance.creativex.recorder.b.a.l) obj;
            boolean z = false;
            if (lVar.f28197b) {
                if (this.f97417a.c().f124757b.h() == 0) {
                    z = true;
                }
                if (lVar.f28196a || (z && !this.f97417a.c().f124757b.f124714i)) {
                    this.f97417a.a(true);
                    return;
                }
                return;
            }
            this.f97417a.a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.a.a
    public final void a(com.ss.android.ugc.aweme.tools.l lVar) {
        l.d(lVar, "");
        ((as) this.q.getValue()).onEvent(lVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.a.b$b  reason: collision with other inner class name */
    static final class C2344b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f97409b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.recorder.b.f f97410c;

        static {
            Covode.recordClassIndex(61877);
        }

        C2344b(b bVar, com.bytedance.scene.group.b bVar2, com.ss.android.ugc.gamora.recorder.b.f fVar) {
            this.f97408a = bVar;
            this.f97409b = bVar2;
            this.f97410c = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (this.f97410c.f147394c != null) {
                    if (bool.booleanValue()) {
                        com.ss.android.ugc.gamora.recorder.b.e.a(true, this.f97410c.f147394c.a(), this.f97410c.f147394c.C(), this.f97408a.b());
                        this.f97409b.e(this.f97410c.f147394c);
                        this.f97410c.f147394c.b();
                        return;
                    }
                    this.f97410c.f147394c.d();
                    this.f97409b.d(this.f97410c.f147394c);
                    com.ss.android.ugc.gamora.recorder.b.e.a(false, this.f97410c.f147394c.a(), this.f97410c.f147394c.C(), this.f97408a.b());
                }
            }
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97411a;

        static {
            Covode.recordClassIndex(61878);
        }

        c(b bVar) {
            this.f97411a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.gamora.recorder.b.c cVar = (com.ss.android.ugc.gamora.recorder.b.c) obj;
            b bVar = this.f97411a;
            l.b(cVar, "");
            l.d(cVar, "");
            String str = "";
            for (com.ss.android.ugc.gamora.recorder.b.f fVar : bVar.f97396c.f147382a) {
                Object obj2 = cVar.f147371c;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                if (TextUtils.equals((CharSequence) obj2, fVar.f147393b.f147377c)) {
                    str = fVar.f147393b.f147378d;
                }
            }
            if (!TextUtils.equals(str, "")) {
                r.a("change_record_mode", new com.ss.android.ugc.tools.f.b().a("creation_id", bVar.c().q).a("shoot_way", bVar.c().r).a("draft_id", bVar.c().C).a("enter_from", "video_shoot_page").a("to_status", str).f149193a);
            }
        }
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

    private static void a(com.bytedance.scene.group.b bVar, com.ss.android.ugc.gamora.recorder.b.f fVar, boolean z) {
        com.bytedance.scene.j a2 = bVar.a("FTCRecordBottomTabScene");
        if (a2 == null) {
            l.b();
        }
        l.b(a2, "");
        c cVar = (c) a2;
        int a3 = cVar.a(fVar.f147393b.f147377c);
        if (a3 >= 0) {
            cVar.a(a3, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.ss.android.ugc.gamora.recorder.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar, List<? extends com.ss.android.ugc.gamora.recorder.b.a> list) {
        l.d(bVar, "");
        l.d(fVar, "");
        l.d(list, "");
        this.f97398e = bVar;
        this.r = fVar;
        this.f97399f = list;
        Object a2 = getDiContainer().a(com.ss.android.ugc.aweme.shortvideo.h.a.class, (String) null);
        l.b(a2, "");
        com.ss.android.ugc.aweme.shortvideo.h.a aVar = (com.ss.android.ugc.aweme.shortvideo.h.a) a2;
        this.f97400g = aVar;
        this.f97401h = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.f97402i = com.bytedance.o.b.a.a(getDiContainer(), m.class);
        this.f97403j = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
        k<com.ss.android.ugc.gamora.recorder.b.c> kVar = new k<>();
        this.f97405l = kVar;
        this.f97406m = new k<>();
        this.n = kVar;
        com.ss.android.ugc.gamora.recorder.b.e eVar = new com.ss.android.ugc.gamora.recorder.b.e();
        this.f97396c = eVar;
        this.o = new k<>();
        this.f97397d = new c(c(), eVar, aVar.c());
        this.q = h.i.a(h.m.NONE, new j(this));
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
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
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
