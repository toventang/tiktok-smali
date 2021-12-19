package com.ss.android.ugc.gamora.recorder.choosemusic.recommend;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.cz.a.d;
import com.ss.android.ugc.aweme.experiment.fw;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.z;
import java.util.Objects;

public final class c extends com.bytedance.als.j<a> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f147637a = {new y(c.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final c f147638b = this;

    /* renamed from: c  reason: collision with root package name */
    final h.h f147639c = h.i.a((h.f.a.a) f.f147650a);

    /* renamed from: d  reason: collision with root package name */
    public boolean f147640d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f147641e;

    /* renamed from: f  reason: collision with root package name */
    public int f147642f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.gamora.recorder.choosemusic.a.d f147643g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.t<Boolean> f147644h = new androidx.lifecycle.t<>();

    /* renamed from: i  reason: collision with root package name */
    private final h.h f147645i = h.i.a((h.f.a.a) i.f147651a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f147646j = h.i.a(h.m.NONE, new a(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f147647k = h.i.a(h.m.NONE, new b(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f147648l = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f147649m = h.i.a(h.m.NONE, new C3969c(this));
    private final h.h n = h.i.a(h.m.NONE, new d(this));
    private final h.h o = h.i.a((h.f.a.a) new v(this));
    private final h.h p = h.i.a((h.f.a.a) w.f147660a);
    private final com.bytedance.o.f q;

    static {
        Covode.recordClassIndex(97302);
    }

    public final LruCache<String, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a> b() {
        return (LruCache) this.f147645i.getValue();
    }

    public final com.ss.android.ugc.gamora.recorder.choosemusic.a c() {
        return (com.ss.android.ugc.gamora.recorder.choosemusic.a) this.f147646j.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.recorder.sticker.c.j d() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f147647k.getValue();
    }

    public final ShortVideoContext e() {
        return (ShortVideoContext) this.f147648l.a(this, f147637a[0]);
    }

    public final b f() {
        return (b) this.o.getValue();
    }

    /* renamed from: g */
    public final androidx.lifecycle.t<com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a> a() {
        return (androidx.lifecycle.t) this.p.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f147638b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.q;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class i extends h.f.b.m implements h.f.a.a<LruCache<String, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f147651a = new i();

        static {
            Covode.recordClassIndex(97311);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LruCache<String, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a> invoke() {
            return new LruCache(10);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.i();
            return z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f147660a = new w();

        static {
            Covode.recordClassIndex(97328);
        }

        w() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.recorder.choosemusic.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.recorder.choosemusic.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.recorder.choosemusic.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.recorder.choosemusic.a> r1 = com.ss.android.ugc.gamora.recorder.choosemusic.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.recorder.sticker.c.j> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.recorder.sticker.c.j, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.recorder.sticker.c.j invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.recorder.sticker.c.j> r1 = com.ss.android.ugc.gamora.recorder.sticker.c.j.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$c  reason: collision with other inner class name */
    public static final class C3969c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.recorder.b.b> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3969c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.recorder.b.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.recorder.b.b invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.recorder.b.b> r1 = com.ss.android.ugc.gamora.recorder.b.b.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.C3969c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.creativex.recorder.b.a.m> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.bytedance.creativex.recorder.b.a.m] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.creativex.recorder.b.a.m invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.bytedance.creativex.recorder.b.a.m> r1 = com.bytedance.creativex.recorder.b.a.m.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.d.invoke():com.bytedance.als.b");
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f147650a = new f();

        static {
            Covode.recordClassIndex(97308);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public final boolean j() {
        if (e().Z == 14) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.als.j
    public final void onPause() {
        super.onPause();
        com.ss.android.ugc.gamora.recorder.choosemusic.a.d dVar = this.f147643g;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.bytedance.als.j
    public final void onStop() {
        super.onStop();
        com.ss.android.ugc.gamora.recorder.choosemusic.a.d dVar = this.f147643g;
        if (dVar != null) {
            dVar.a();
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b(com.bytedance.als.dsl.g.b(this.this$0), this.this$0.c().getChooseMusicAnchorViewPosition(), new h.f.a.b<Boolean, z>(this) {
                /* class com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.v.AnonymousClass1 */
                final /* synthetic */ v this$0;

                static {
                    Covode.recordClassIndex(97327);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Boolean bool) {
                    this.this$0.this$0.f147644h.setValue(Boolean.valueOf(bool.booleanValue()));
                    return z.f158842a;
                }
            });
        }
    }

    public final MusicModel k() {
        h.p<MusicModel, Long> a2;
        com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a value = a().getValue();
        if (value == null || (a2 = value.a(j())) == null) {
            return null;
        }
        return a2.getFirst();
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.gamora.recorder.choosemusic.a.d dVar = this.f147643g;
        if (dVar != null) {
            dVar.f147523a.c();
        }
        com.ss.android.ugc.gamora.recorder.choosemusic.a.d dVar2 = this.f147643g;
        if (dVar2 != null) {
            dVar2.f147523a.d();
        }
    }

    public final void i() {
        com.ss.android.ugc.gamora.recorder.choosemusic.a.d dVar = this.f147643g;
        if (dVar != null) {
            dVar.a(null, true, "");
        }
        this.f147640d = true;
        if (fw.c()) {
            c().setUiLoadingMusic(false);
        }
        f().g();
    }

    static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String musicId;
            String musicId2;
            if (this.this$0.f147642f == 2) {
                MusicModel k2 = this.this$0.k();
                if (!(k2 == null || (musicId2 = k2.getMusicId()) == null)) {
                    String str = this.this$0.e().q;
                    h.f.b.l.b(str, "");
                    d.a(musicId2, str, "pause");
                }
                this.this$0.a(3);
            } else if (this.this$0.f147642f == 3) {
                MusicModel k3 = this.this$0.k();
                if (!(k3 == null || (musicId = k3.getMusicId()) == null)) {
                    String str2 = this.this$0.e().q;
                    h.f.b.l.b(str2, "");
                    d.a(musicId, str2, "continue");
                }
                this.this$0.a(2);
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String musicId;
            MusicModel k2 = this.this$0.k();
            if (!(k2 == null || (musicId = k2.getMusicId()) == null)) {
                String str = this.this$0.e().q;
                h.f.b.l.b(str, "");
                h.f.b.l.d(musicId, "");
                h.f.b.l.d(str, "");
                com.ss.android.ugc.aweme.common.r.a("click_music_popup_use", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_shoot_page").a("music_id", musicId).a("creation_id", str).f149193a);
            }
            this.this$0.h();
            return z.f158842a;
        }
    }

    public final void h() {
        MusicModel musicModel;
        h.p<MusicModel, Long> a2;
        com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a value = a().getValue();
        if (value == null || (a2 = value.a(j())) == null) {
            musicModel = null;
        } else {
            musicModel = a2.getFirst();
        }
        f().g();
        this.f147640d = false;
        boolean z = !fw.c();
        com.ss.android.ugc.gamora.recorder.choosemusic.a.d dVar = this.f147643g;
        if (dVar != null) {
            dVar.a(musicModel, z, "");
        }
        if (fw.c()) {
            c().setUiLoadingMusic(true);
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        if (fw.b()) {
            IInternalCommerceService h2 = AVCommerceServiceImpl.h();
            h.f.b.l.b(h2, "");
            if (!h2.b() && !e().i()) {
                if (fw.b() && !e().c() && !e().f124757b.b()) {
                    d().a(new e(new j(this)));
                }
                b f2 = f();
                g gVar = new g(this);
                h.f.b.l.d(gVar, "");
                f2.a().setOnClickListener(new b.j(f2, gVar));
                b f3 = f();
                h hVar = new h(this);
                h.f.b.l.d(hVar, "");
                ((View) f3.f147622b.getValue()).setOnClickListener(new b.k(f3, hVar));
                Activity b2 = com.bytedance.als.dsl.g.b(this);
                Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                this.f147643g = new com.ss.android.ugc.gamora.recorder.choosemusic.a.d((androidx.fragment.app.e) b2, new n(this), new o(this), new p(this), new q(this));
                a().observe(this, new r(this));
                d().d().a(this, new s(this));
                d().t().n().b().observe(this, new t(this));
                d().t().n().d().observe(this, new u(this));
                this.f147644h.observe(this, new k(this));
                ((com.ss.android.ugc.gamora.recorder.b.b) this.f147649m.getValue()).getBottomTabIndexChangeEvent().a(this, new l(this));
                ((com.bytedance.creativex.recorder.b.a.m) this.n.getValue()).i().a(this, new m(this));
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a
    public final void a(boolean z) {
        this.f147641e = z;
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147655a;

        static {
            Covode.recordClassIndex(97316);
        }

        m(c cVar) {
            this.f147655a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147655a.i();
        }
    }

    static final class t<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147658a;

        static {
            Covode.recordClassIndex(97324);
        }

        t(c cVar) {
            this.f147658a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147658a.i();
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a, z> {
        final /* synthetic */ Effect $effect;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, Effect effect) {
            super(1);
            this.this$0 = cVar;
            this.$effect = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a aVar) {
            h.f.b.l.d(aVar, "");
            if (!h.f.b.l.a(aVar, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a.f147663e)) {
                this.this$0.a().setValue(aVar);
                this.this$0.b().put(this.$effect.getEffectId(), aVar);
            }
            return z.f158842a;
        }
    }

    static final class r<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147656a;

        static {
            Covode.recordClassIndex(97322);
        }

        r(c cVar) {
            this.f147656a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a aVar = (com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a) obj;
            if (!h.f.b.l.a(aVar, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a.f147663e)) {
                Boolean a2 = this.f147656a.d().d().a();
                if (a2 == null || !a2.booleanValue()) {
                    c cVar = this.f147656a;
                    cVar.a(aVar.a(cVar.j()));
                }
            }
        }
    }

    static final class u<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147659a;

        static {
            Covode.recordClassIndex(97325);
        }

        u(c cVar) {
            this.f147659a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.sticker.presenter.n nVar = (com.ss.android.ugc.aweme.sticker.presenter.n) obj;
            if ((!h.f.b.l.a(nVar.f135422a, nVar.f135423b)) && !this.f147659a.f147641e && h.f.b.l.a((Object) this.f147659a.e().f124765j, (Object) "prop_music_recommended")) {
                this.f147659a.c().clearMusic();
            }
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147652a;

        static {
            Covode.recordClassIndex(97313);
        }

        k(c cVar) {
            this.f147652a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.p<MusicModel, Long> a2;
            MusicModel first;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a value = this.f147652a.a().getValue();
                if (value != null && (a2 = value.a(this.f147652a.j())) != null && (first = a2.getFirst()) != null) {
                    com.ss.android.ugc.gamora.recorder.choosemusic.a.d dVar = this.f147652a.f147643g;
                    if (dVar != null) {
                        h.f.b.l.d(first, "");
                        dVar.f147523a.a(first);
                    }
                    this.f147652a.a(1);
                    return;
                }
                return;
            }
            this.f147652a.a(3);
        }
    }

    static final class s<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147657a;

        static {
            Covode.recordClassIndex(97323);
        }

        s(c cVar) {
            this.f147657a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.p<MusicModel, Long> pVar;
            Boolean bool = (Boolean) obj;
            if (!h.f.b.l.a(this.f147657a.a().getValue(), com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a.f147663e) && !bool.booleanValue()) {
                c cVar = this.f147657a;
                com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a value = cVar.a().getValue();
                if (value == null || (pVar = value.a(this.f147657a.j())) == null) {
                    pVar = h.v.a(null, 0L);
                }
                cVar.a(pVar);
            }
        }
    }

    public c(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.q = fVar;
    }

    public final void a(int i2) {
        if (this.f147642f != i2) {
            if (i2 == 1) {
                this.f147642f = 1;
            } else if (i2 == 2) {
                com.ss.android.ugc.gamora.recorder.choosemusic.a.d dVar = this.f147643g;
                if (dVar != null) {
                    dVar.f147523a.b();
                }
                this.f147642f = 2;
            } else if (i2 == 3) {
                com.ss.android.ugc.gamora.recorder.choosemusic.a.d dVar2 = this.f147643g;
                if (dVar2 != null) {
                    dVar2.a();
                }
                this.f147642f = 3;
            }
            if (this.f147642f == i2) {
                b f2 = f();
                int i3 = this.f147642f;
                if (i3 == 1) {
                    ObjectAnimator e2 = f2.e();
                    h.f.b.l.b(e2, "");
                    if (!e2.isRunning()) {
                        f2.e().start();
                    }
                } else {
                    f2.e().end();
                    if (i3 != 1) {
                        if (i3 == 2) {
                            ImageView d2 = f2.d();
                            h.f.b.l.b(d2, "");
                            d2.setVisibility(0);
                            f2.d().setImageResource(2131230990);
                            f2.e().cancel();
                            return;
                        } else if (i3 == 3) {
                            ImageView d3 = f2.d();
                            h.f.b.l.b(d3, "");
                            d3.setVisibility(0);
                            f2.d().setImageResource(2131230857);
                            f2.e().cancel();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                f2.d().setImageResource(2131230989);
            }
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147653a;

        static {
            Covode.recordClassIndex(97314);
        }

        l(c cVar) {
            this.f147653a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            long j2;
            com.ss.android.ugc.gamora.recorder.b.c cVar = (com.ss.android.ugc.gamora.recorder.b.c) obj;
            if (this.f147653a.a().getValue() != null && (!h.f.b.l.a(this.f147653a.a().getValue(), com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a.f147663e))) {
                c cVar2 = this.f147653a;
                h.f.b.l.b(cVar, "");
                if ((h.f.b.l.a(cVar.f147371c, (Object) com.bytedance.als.dsl.g.b(cVar2).getString(R.string.f_2)) || h.f.b.l.a(cVar.f147371c, (Object) com.bytedance.als.dsl.g.b(cVar2).getString(R.string.f_2)) || h.f.b.l.a(cVar.f147371c, (Object) com.bytedance.als.dsl.g.b(cVar2).getString(R.string.f_4)) || h.f.b.l.a(cVar.f147371c, (Object) com.bytedance.als.dsl.g.b(cVar2).getString(R.string.f_3)) || h.f.b.l.a(cVar.f147371c, (Object) com.bytedance.als.dsl.g.b(cVar2).getString(R.string.f_1)) || h.f.b.l.a(cVar.f147371c, (Object) com.bytedance.als.dsl.g.b(cVar2).getString(R.string.f_9)) || h.f.b.l.a(cVar.f147371c, (Object) com.bytedance.als.dsl.g.b(cVar2).getString(R.string.f__)) || h.f.b.l.a(cVar.f147371c, (Object) com.bytedance.als.dsl.g.b(cVar2).getString(R.string.f_8)) || h.f.b.l.a(cVar.f147371c, (Object) com.bytedance.als.dsl.g.b(cVar2).getString(R.string.f_g))) && !this.f147653a.c().recordHasMusic()) {
                    this.f147653a.f().g();
                    if (fw.a() == 1) {
                        j2 = 300;
                    } else {
                        j2 = 0;
                    }
                    ((Handler) this.f147653a.f147639c.getValue()).postDelayed(new Runnable(this) {
                        /* class com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.l.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ l f147654a;

                        static {
                            Covode.recordClassIndex(97315);
                        }

                        {
                            this.f147654a = r1;
                        }

                        public final void run() {
                            this.f147654a.f147653a.a().setValue(this.f147654a.f147653a.a().getValue());
                        }
                    }, j2);
                }
            }
        }
    }

    public final void a(h.p<? extends MusicModel, Long> pVar) {
        String a2;
        String musicId;
        if (pVar != null && pVar.getFirst() != null && e().f124757b.d().size() <= 0 && !this.f147641e) {
            if (fw.c()) {
                MusicModel musicModel = (MusicModel) pVar.getFirst();
                if (!(musicModel == null || (musicId = musicModel.getMusicId()) == null)) {
                    String str = e().q;
                    h.f.b.l.b(str, "");
                    d.a(musicId, str);
                }
                h();
                return;
            }
            MusicModel musicModel2 = (MusicModel) pVar.component1();
            long longValue = pVar.component2().longValue();
            if (musicModel2 != null) {
                String musicId2 = musicModel2.getMusicId();
                h.f.b.l.b(musicId2, "");
                String str2 = e().q;
                h.f.b.l.b(str2, "");
                d.a(musicId2, str2);
                b f2 = f();
                h.p<Integer, Integer> chooseMusicAnchorViewPosition = c().getChooseMusicAnchorViewPosition();
                h.f.b.l.d(musicModel2, "");
                h.f.b.l.d(chooseMusicAnchorViewPosition, "");
                com.bytedance.lighten.a.v a3 = com.bytedance.lighten.a.r.a(musicModel2.getPicSmall());
                a3.E = (SmartImageView) f2.f147621a.getValue();
                a3.c();
                if (longValue != 0) {
                    if (longValue < 0) {
                        a2 = "0";
                    } else if (longValue < 10000) {
                        a2 = String.valueOf(longValue);
                    } else if (longValue < 1000000) {
                        a2 = com.ss.android.ugc.aweme.df.i.a(longValue, 1000, "K", "1000.0", "1.0M");
                    } else if (longValue < 1000000000) {
                        a2 = com.ss.android.ugc.aweme.df.i.a(longValue, 1000000, "M", "1000.0", "1.0B");
                    } else {
                        a2 = com.ss.android.ugc.aweme.df.i.a(longValue, 1000000000, "B");
                    }
                    TextView c2 = f2.c();
                    h.f.b.l.b(c2, "");
                    c2.setText(com.ss.android.ugc.aweme.port.in.i.f115645a.getString(R.string.blp, new Object[]{a2}));
                } else {
                    TextView c3 = f2.c();
                    h.f.b.l.b(c3, "");
                    c3.setText(com.ss.android.ugc.aweme.port.in.i.f115645a.getText(R.string.f9e));
                }
                TextView b2 = f2.b();
                h.f.b.l.b(b2, "");
                b2.setText(musicModel2.getName() + " - " + musicModel2.getSinger());
                TextView b3 = f2.b();
                h.f.b.l.b(b3, "");
                b3.setFocusable(true);
                f2.b().setSingleLine();
                TextView b4 = f2.b();
                h.f.b.l.b(b4, "");
                b4.setSelected(true);
                TextView b5 = f2.b();
                h.f.b.l.b(b5, "");
                b5.setFocusableInTouchMode(true);
                f2.d().setImageResource(2131230989);
                f2.e().start();
                com.bytedance.tux.tooltip.a f3 = f2.f();
                com.bytedance.tux.tooltip.d b6 = f2.f().b();
                b6.f45539i = -1001;
                b6.r = chooseMusicAnchorViewPosition.getFirst().intValue();
                b6.s = chooseMusicAnchorViewPosition.getSecond().intValue();
                f3.a(b6);
                f2.f147624d = true;
                f2.f147623c.removeMessages(1);
                f2.f147623c.sendEmptyMessageDelayed(1, 5000);
                f2.f().a();
            }
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<MusicModel, Exception, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(MusicModel musicModel, Exception exc) {
            this.this$0.i();
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<MusicModel, Long, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(MusicModel musicModel, Long l2) {
            l2.longValue();
            com.ss.android.ugc.asve.f.g.a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.n.AnonymousClass1 */
                final /* synthetic */ n this$0;

                static {
                    Covode.recordClassIndex(97318);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.a(2);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class j extends h.f.b.m implements h.f.a.m<Effect, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
            if (r5 == null) goto L_0x00a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
            if (r0.isEmpty() == false) goto L_0x00b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
            r3 = r10.getMusic();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b9, code lost:
            if (r3 != null) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
            r3 = h.a.z.INSTANCE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
            r4 = new com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.e(r7, r10);
            h.f.b.l.d(r3, "");
            h.f.b.l.d(r4, "");
            h.f.b.l.d(r3, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
            if (r3.isEmpty() == false) goto L_0x0135;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
            r0 = f.a.ab.a((f.a.af) com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a.d.f147615a);
            h.f.b.l.b(r0, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
            r3 = r0.d();
            r0 = (com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendMusicApi) com.ss.android.ugc.aweme.port.in.g.a().C().createRetrofit(com.ss.android.ugc.aweme.port.in.g.a().C().getApiHost(), true, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendMusicApi.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fc, code lost:
            if (r5 != null) goto L_0x0130;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fe, code lost:
            r1 = f.a.t.b(com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic.EMPTY);
            h.f.b.l.b(r1, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
            r3.a(r1, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a.C3967a.f147612a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a.b(r4), new com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a.c(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0130, code lost:
            r1 = r0.getRecommendMusic(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0135, code lost:
            r8 = f.a.t.b((java.lang.Iterable) r3);
            r3 = new com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a.e((com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendMusicApi) com.ss.android.ugc.aweme.port.in.g.a().C().createRetrofit(com.ss.android.ugc.aweme.port.in.g.a().C().getApiHost(), true, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendMusicApi.class));
            f.a.e.b.b.a((java.lang.Object) r3, "mapper is null");
            f.a.e.b.b.a(2, "prefetch");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0167, code lost:
            if ((r8 instanceof f.a.e.c.g) == false) goto L_0x019e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0169, code lost:
            r0 = ((f.a.e.c.g) r8).call();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x016f, code lost:
            if (r0 != null) goto L_0x0199;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0171, code lost:
            r3 = f.a.h.a.a(f.a.e.e.e.v.f157740a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0177, code lost:
            r2 = com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a.f.f147617a;
            r1 = com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a.g.f147618a;
            f.a.e.b.b.a((java.lang.Object) r2, "initialValueSupplier is null");
            f.a.e.b.b.a((java.lang.Object) r1, "collector is null");
            r0 = f.a.h.a.a(new f.a.e.e.e.f(r3, r2, r1)).c(com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a.h.f147619a);
            h.f.b.l.b(r0, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0199, code lost:
            r3 = f.a.e.e.e.ay.a(r0, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x019e, code lost:
            r3 = f.a.h.a.a(new f.a.e.e.e.g(r8, r3, 2, f.a.e.j.g.IMMEDIATE));
         */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.effectmanager.effect.model.Effect r10, java.lang.Boolean r11) {
            /*
            // Method dump skipped, instructions count: 426
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.j.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    static final class o extends h.f.b.m implements h.f.a.q<String, MusicModel, String, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(c cVar) {
            super(3);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(String str, MusicModel musicModel, String str2) {
            String str3 = str;
            MusicModel musicModel2 = musicModel;
            if (!this.this$0.f147640d && musicModel2 != null) {
                c cVar = this.this$0;
                com.ss.android.ugc.aweme.shortvideo.c b2 = com.ss.android.ugc.aweme.port.in.c.f115629h.b(musicModel2);
                if (fw.c()) {
                    cVar.c().changeCancelMusicBtnVisible(true);
                    cVar.c().setUiLoadingMusic(false);
                }
                cVar.c().onChooseMusicDone(false, "", b2, str3);
                cVar.c().handleChooseMusic(d.a.a(false, "", b2, str3));
                cr.a().a(com.ss.android.ugc.aweme.port.in.c.f115629h.a((Object) musicModel2));
                cVar.e().f124765j = "prop_music_recommended";
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
