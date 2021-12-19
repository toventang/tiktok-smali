package com.ss.android.ugc.aweme.shortvideo.duet;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.b;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.ss.android.ugc.tools.utils.p;
import com.ss.android.ugc.tools.view.widget.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import java.util.Objects;
import java.util.Stack;

public final class z extends com.bytedance.ui_component.b<DuetLayoutModeViewModel> implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f126626a = {new y(z.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(z.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(z.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static int f126627f = 3000;

    /* renamed from: k  reason: collision with root package name */
    public static final a f126628k = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final t<com.bytedance.creativex.recorder.sticker.b.a> f126629b;

    /* renamed from: c  reason: collision with root package name */
    public final ShortVideoContext f126630c;

    /* renamed from: d  reason: collision with root package name */
    public final Stack<Integer> f126631d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f126632e;

    /* renamed from: l  reason: collision with root package name */
    private final h.f.a.a<DuetLayoutModeViewModel> f126633l = i.f126641a;

    /* renamed from: m  reason: collision with root package name */
    private final q f126634m;
    private final h.h.d n;
    private final h.h.d o;
    private final h.h.d p;
    private final f.a.b.a q;
    private final androidx.fragment.app.e r;
    private final com.bytedance.scene.group.b s;
    private final com.bytedance.o.f t;

    public final com.bytedance.creativex.recorder.b.a.d a() {
        return (com.bytedance.creativex.recorder.b.a.d) this.n.a(this, f126626a[0]);
    }

    public final m f() {
        return (m) this.o.a(this, f126626a[1]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83058);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<DuetLayoutModeViewModel> b() {
        return this.f126633l;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.s;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.t;
    }

    static final class i extends h.f.b.m implements h.f.a.a<DuetLayoutModeViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f126641a = new i();

        static {
            Covode.recordClassIndex(83068);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DuetLayoutModeViewModel invoke() {
            return new DuetLayoutModeViewModel();
        }
    }

    public static final class g implements com.bytedance.creativex.recorder.b.a.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f126639a;

        static {
            Covode.recordClassIndex(83064);
        }

        static final class a extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(83065);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                this.this$0.f126639a.f().a(new com.ss.android.ugc.aweme.tools.h("duet"));
                return h.z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(83066);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(g gVar) {
                super(0);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                this.this$0.f126639a.f().a(new com.ss.android.ugc.aweme.tools.h("duet"));
                return h.z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(z zVar) {
            this.f126639a = zVar;
        }

        @Override // com.bytedance.creativex.recorder.b.a.i
        public final boolean a(com.ss.android.ugc.aweme.tools.h hVar) {
            l.d(hVar, "");
            if (!this.f126639a.f126630c.Q) {
                return false;
            }
            Keva repo = Keva.getRepo("duet_keva_object");
            l.b(repo, "");
            if (repo.getBoolean("duet_green_screen", true)) {
                repo.storeBoolean("duet_green_screen", false);
                this.f126639a.a(new a(this));
                return true;
            } else if (this.f126639a.f126632e || l.a((Object) "duet", (Object) hVar.f140200a)) {
                return false;
            } else {
                int i2 = 0;
                for (T t : this.f126639a.f126631d) {
                    l.b(t, "");
                    i2 += t.intValue();
                }
                if (i2 >= z.f126627f) {
                    return false;
                }
                this.f126639a.a(new b(this));
                return true;
            }
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        q qVar = this.f126634m;
        if (!qVar.C) {
            qVar.C = true;
            c cVar = qVar.t;
            if (cVar != null) {
                cVar.b(new com.ss.android.ugc.aweme.da.b());
            }
        }
    }

    static {
        Covode.recordClassIndex(83057);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        this.s.e(this.f126634m);
        q qVar = this.f126634m;
        qVar.C = false;
        com.bytedance.scene.navigation.d b2 = com.bytedance.scene.ktx.b.b(qVar);
        Activity activity = qVar.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        b2.a((androidx.fragment.app.e) activity, qVar.v);
        c cVar = qVar.t;
        if (cVar != null) {
            cVar.a(new com.ss.android.ugc.aweme.da.b());
        }
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        com.bytedance.scene.ktx.a.a(this.s, R.id.dj5, this.f126634m, "DuetLayoutModeScene");
        f().h().a(this, new c(this));
        f().t().a(this, new d(this));
        f().s().a(this, new e(this));
        f.a.b.b a2 = ((j) this.p.a(this, f126626a[2])).g().a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this), p.f150012a);
        l.b(a2, "");
        f.a.j.a.a(a2, this.q);
        f().a(com.bytedance.creativex.recorder.b.a.p.class, new g(this));
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f126635a;

        static {
            Covode.recordClassIndex(83060);
        }

        c(z zVar) {
            this.f126635a = zVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ((DuetLayoutModeViewModel) this.f126635a.getApiComponent()).b(true);
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.creativex.recorder.gesture.api.d, h.z> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(83059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z zVar) {
            super(1);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.creativex.recorder.gesture.api.d dVar) {
            com.bytedance.creativex.recorder.gesture.api.d dVar2 = dVar;
            l.d(dVar2, "");
            com.bytedance.creativex.recorder.gesture.api.b bVar = (com.bytedance.creativex.recorder.gesture.api.b) this.this$0.getDiContainer().b(com.bytedance.creativex.recorder.gesture.api.b.class, null);
            if (bVar != null) {
                bVar.a(dVar2, 2);
            }
            return h.z.f158842a;
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f126636a;

        static {
            Covode.recordClassIndex(83061);
        }

        d(z zVar) {
            this.f126636a = zVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ((DuetLayoutModeViewModel) this.f126636a.getApiComponent()).b(false);
            this.f126636a.f126631d.clear();
            this.f126636a.f126632e = false;
            this.f126636a.a().D().a(27561, 0, 0, "");
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f126638a;

        static {
            Covode.recordClassIndex(83063);
        }

        f(z zVar) {
            this.f126638a = zVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.p pVar = (h.p) obj;
            pVar.component1();
            com.bytedance.creativex.recorder.sticker.b.a aVar = (com.bytedance.creativex.recorder.sticker.b.a) pVar.component2();
            this.f126638a.f126629b.postValue(aVar);
            if (aVar != null) {
                if (aVar.f28381a == 60) {
                    this.f126638a.f126631d.push(Integer.valueOf(aVar.f28383c));
                }
                if (aVar.f28381a == 61 && aVar.f28383c == 1) {
                    this.f126638a.f126632e = true;
                }
            }
        }
    }

    public final void a(h.f.a.a<h.z> aVar) {
        k.a(new a.C0731a(this.r).b(R.string.be2).a(R.string.be3, (DialogInterface.OnClickListener) new h(aVar), false).a().c());
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f126637a;

        static {
            Covode.recordClassIndex(83062);
        }

        e(z zVar) {
            this.f126637a = zVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f126637a.f126630c.f124757b.d().isEmpty()) {
                this.f126637a.a().a(new com.ss.android.ugc.aweme.tools.j(3));
                ((DuetLayoutModeViewModel) this.f126637a.getApiComponent()).b(false);
            }
            if (!this.f126637a.f126631d.empty()) {
                this.f126637a.f126631d.pop();
            }
            this.f126637a.f126632e = false;
            this.f126637a.a().D().a(27560, 0, 0, "");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f126640a;

        static {
            Covode.recordClassIndex(83067);
        }

        h(h.f.a.a aVar) {
            this.f126640a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f126640a.invoke();
        }
    }

    public z(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.s = bVar;
        this.t = fVar;
        t<com.bytedance.creativex.recorder.sticker.b.a> tVar = new t<>();
        this.f126629b = tVar;
        this.f126634m = new q(getDiContainer(), tVar, new b(this));
        this.n = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.o = com.bytedance.o.b.a.a(getDiContainer(), m.class);
        this.f126630c = (ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null);
        this.p = com.bytedance.o.b.a.a(getDiContainer(), j.class);
        this.q = new f.a.b.a();
        this.f126631d = new Stack<>();
        this.r = (androidx.fragment.app.e) getDiContainer().a(androidx.fragment.app.e.class, (String) null);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
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
}
