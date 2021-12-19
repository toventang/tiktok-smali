package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.p;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.da.e;
import com.ss.android.ugc.aweme.ftc.components.audioeffect.b;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.m;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.z;
import java.util.Objects;

public final class g extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a, m {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f97651a = {new y(g.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
    public static final c w = new c((byte) 0);
    private final h.h A;
    private final com.bytedance.o.f B;

    /* renamed from: b  reason: collision with root package name */
    public boolean f97652b;

    /* renamed from: c  reason: collision with root package name */
    public View f97653c;

    /* renamed from: d  reason: collision with root package name */
    TextView f97654d;

    /* renamed from: e  reason: collision with root package name */
    View f97655e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f97656f;

    /* renamed from: g  reason: collision with root package name */
    com.ss.android.ugc.aweme.filter.a f97657g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.da.e f97658h;

    /* renamed from: i  reason: collision with root package name */
    public c f97659i;

    /* renamed from: j  reason: collision with root package name */
    public RecyclerView.i f97660j;

    /* renamed from: k  reason: collision with root package name */
    public int f97661k;

    /* renamed from: l  reason: collision with root package name */
    public int f97662l;
    com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.d t;
    public com.ss.android.ugc.asve.editor.g u;
    FrameLayout v;
    private int x = 1;
    private final h.h.d y = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private final h.h z;

    static {
        Covode.recordClassIndex(62046);
    }

    public final VideoPublishEditModel a() {
        return (VideoPublishEditModel) this.y.a(this, f97651a[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.A.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(62049);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.B;
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

    public static final class d implements c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f97663a;

        static {
            Covode.recordClassIndex(62050);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.e
        public final void a(String str) {
            l.d(str, "");
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f97664a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CategoryPageModel f97665b;

            static {
                Covode.recordClassIndex(62051);
            }

            a(d dVar, CategoryPageModel categoryPageModel) {
                this.f97664a = dVar;
                this.f97665b = categoryPageModel;
            }

            public final void run() {
                this.f97664a.f97663a.a(this.f97665b, true);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(g gVar) {
            this.f97663a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.e
        public final void a(CategoryPageModel categoryPageModel) {
            RecyclerView recyclerView = this.f97663a.f97656f;
            if (recyclerView != null) {
                recyclerView.post(new a(this, categoryPageModel));
            }
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(62047);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.audioeffect.g.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class f extends e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f97667a;

        static {
            Covode.recordClassIndex(62053);
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void a() {
            this.f97667a.f97652b = true;
            com.ss.android.ugc.aweme.da.e eVar = this.f97667a.f97658h;
            if (eVar != null) {
                eVar.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void b() {
            com.ss.android.ugc.aweme.da.e eVar = this.f97667a.f97658h;
            if (eVar != null) {
                eVar.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void c() {
            com.ss.android.ugc.aweme.da.e eVar = this.f97667a.f97658h;
            if (eVar != null) {
                eVar.c();
            }
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void d() {
            this.f97667a.f97652b = false;
            com.ss.android.ugc.aweme.da.e eVar = this.f97667a.f97658h;
            if (eVar != null) {
                eVar.d();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(g gVar) {
            this.f97667a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void a(float f2, int i2, int i3) {
            com.ss.android.ugc.aweme.da.e eVar = this.f97667a.f97658h;
            if (eVar != null) {
                eVar.a(f2, i2, i3);
            }
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void b(float f2, int i2, int i3) {
            com.ss.android.ugc.aweme.da.e eVar = this.f97667a.f97658h;
            if (eVar != null) {
                eVar.b(f2, i2, i3);
            }
        }
    }

    public static final class i extends e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f97670a;

        static {
            Covode.recordClassIndex(62056);
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void d() {
            this.f97670a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(g gVar) {
            this.f97670a = gVar;
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.da.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f97666a;

        static {
            Covode.recordClassIndex(62052);
        }

        @Override // com.ss.android.ugc.aweme.da.c, com.ss.android.ugc.aweme.da.b
        public final void d() {
            super.d();
            com.bytedance.scene.group.b bVar = (com.bytedance.scene.group.b) this.f97666a.o;
            if (bVar != null) {
                bVar.d(this.f97666a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(g gVar) {
            this.f97666a = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        a(com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.b(), false);
        c.a.a().a(new d(this));
    }

    public static final class k extends com.ss.android.ugc.aweme.da.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f97671a;

        static {
            Covode.recordClassIndex(62058);
        }

        @Override // com.ss.android.ugc.aweme.da.c, com.ss.android.ugc.aweme.da.b
        public final void a() {
            View view = this.f97671a.f97653c;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.f97671a.f97660j != null) {
                RecyclerView.i iVar = this.f97671a.f97660j;
                Objects.requireNonNull(iVar, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) iVar).a(this.f97671a.f97661k, this.f97671a.f97662l);
            }
            super.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(g gVar) {
            this.f97671a = gVar;
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        b.a.a();
        com.ss.android.ugc.aweme.effectplatform.f b2 = b.a.b();
        if (b2 != null) {
            b2.destroy();
        }
        b.f97611b = null;
        b.a.a();
        b.a.c().a();
        com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.d dVar = this.t;
        if (dVar != null) {
            dVar.a();
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<FTCEditAudioEffectViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(62048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_audioeffect_FTCEditAudioEffectScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_audioeffect_FTCEditAudioEffectScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.audioeffect.g.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ftc_components_audioeffect_FTCEditAudioEffectScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.m
    public final void a(Effect effect) {
        com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.d dVar = this.t;
        if (dVar != null) {
            dVar.a(effect);
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f97669a;

        static {
            Covode.recordClassIndex(62055);
        }

        h(g gVar) {
            this.f97669a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            IAudioEffectParam iAudioEffectParam = (IAudioEffectParam) obj;
            VideoPublishEditModel a2 = this.f97669a.a();
            if (!(iAudioEffectParam instanceof AudioEffectParam)) {
                iAudioEffectParam = null;
            }
            a2.veAudioEffectParam = (AudioEffectParam) iAudioEffectParam;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$g  reason: collision with other inner class name */
    static final class View$OnClickListenerC2354g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f97668a;

        static {
            Covode.recordClassIndex(62054);
        }

        View$OnClickListenerC2354g(g gVar) {
            this.f97668a = gVar;
        }

        public final void onClick(View view) {
            View g2;
            ClickAgent.onClick(view);
            g gVar = this.f97668a;
            RecyclerView.i iVar = gVar.f97660j;
            int i2 = 0;
            if (!(iVar == null || (g2 = iVar.g(0)) == null)) {
                gVar.f97662l = g2.getLeft();
                if (gVar.f97660j != null) {
                    i2 = RecyclerView.i.e(g2);
                }
                gVar.f97661k = i2;
            }
            com.ss.android.ugc.aweme.filter.a aVar = gVar.f97657g;
            if (aVar != null) {
                aVar.b(new e(gVar));
            }
        }
    }

    public g(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.B = fVar;
        h.k.c a2 = h.f.b.ab.a(FTCEditAudioEffectViewModel.class);
        this.z = h.i.a((h.f.a.a) new b(this, a2, a2));
        this.A = h.i.a(h.m.NONE, new a(this));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.x = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a(a());
        b().u().observe(this, new h(this));
        this.f97658h = new i(this);
        selectNonNullSubscribe((FTCEditAudioEffectViewModel) this.z.getValue(), h.f97672a, new ah(), new j(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, p, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(62057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, p pVar) {
            l.d(bVar, "");
            l.d(pVar, "");
            c cVar = this.this$0.f97659i;
            if (cVar != null) {
                cVar.b(0);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(CategoryPageModel categoryPageModel, boolean z2) {
        c cVar;
        if (categoryPageModel != null && (cVar = this.f97659i) != null) {
            cVar.a(categoryPageModel, z2);
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.atk, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) a2;
        this.v = frameLayout;
        if (frameLayout == null) {
            l.a("parentLayout");
        }
        return frameLayout;
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
