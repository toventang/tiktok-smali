package com.ss.android.ugc.gamora.editor.multiedit;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
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
import com.bytedance.scene.j;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.bu;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.u;
import h.f.a.q;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.k.k;
import h.m;
import h.z;
import java.util.Objects;

public final class c extends com.bytedance.scene.group.b implements com.bytedance.jedi.arch.b, com.bytedance.o.a, bu {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ i[] f146184b = {new y(c.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final C3905c f146185f = new C3905c((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    g f146186c;

    /* renamed from: d  reason: collision with root package name */
    boolean f146187d;

    /* renamed from: e  reason: collision with root package name */
    final com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f f146188e;

    /* renamed from: g  reason: collision with root package name */
    private final h f146189g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f146190h = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: i  reason: collision with root package name */
    private final h f146191i = h.i.a(m.NONE, new a(this));

    /* renamed from: j  reason: collision with root package name */
    private final int f146192j = 52;

    /* renamed from: k  reason: collision with root package name */
    private final int f146193k = 242;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.o.f f146194l;

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f146195a = new f();

        static {
            Covode.recordClassIndex(96076);
        }

        f() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(96070);
    }

    private final MultiEditViewModel K() {
        return (MultiEditViewModel) this.f146189g.getValue();
    }

    public final VideoPublishEditModel E() {
        return (VideoPublishEditModel) this.f146190h.a(this, f146184b[0]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.preview.a F() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f146191i.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.c$c  reason: collision with other inner class name */
    public static final class C3905c {
        static {
            Covode.recordClassIndex(96073);
        }

        private C3905c() {
        }

        public /* synthetic */ C3905c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f146194l;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bu
    public final float G() {
        return this.f146188e.a();
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
            Covode.recordClassIndex(96071);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.multiedit.c.a.invoke():com.bytedance.als.b");
        }
    }

    /* access modifiers changed from: package-private */
    public final int H() {
        return (int) n.b(this.f42913m, (float) this.f146192j);
    }

    /* access modifiers changed from: package-private */
    public final int I() {
        return (int) n.b(this.f42913m, (float) this.f146193k);
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        this.f146188e.c();
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        if (this.f146187d) {
            this.f146188e.b(false);
        }
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        this.f146188e.b(true);
    }

    /* access modifiers changed from: package-private */
    public final int J() {
        return (((dh.e(this.f42913m) - H()) - I()) - dh.c(this.f42913m)) - dh.d(this.f42913m);
    }

    public static final class b extends h.f.b.m implements h.f.a.a<MultiEditViewModel> {
        final /* synthetic */ j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_multiedit_MultiEditVideoScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_multiedit_MultiEditVideoScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.multiedit.c.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_multiedit_MultiEditVideoScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        selectNonNullSubscribe(K(), d.f146196a, new ah(), new d(this));
        selectNonNullSubscribe(K(), e.f146197a, new ah(), new e(this));
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, p, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, p pVar) {
            com.ss.android.ugc.gamora.editor.ac aq;
            l.d(bVar, "");
            l.d(pVar, "");
            j jVar = this.this$0.o;
            if (!(jVar instanceof com.ss.android.ugc.gamora.editor.v)) {
                jVar = null;
            }
            com.ss.android.ugc.gamora.editor.rootscene.d dVar = (com.ss.android.ugc.gamora.editor.rootscene.d) jVar;
            if (!(dVar == null || (aq = dVar.aq()) == null)) {
                aq.a();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.af6, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) a2;
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.dsq);
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f fVar = this.f146188e;
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        l.b(frameLayout2, "");
        fVar.a((androidx.fragment.app.e) activity, frameLayout2);
        frameLayout2.setVisibility(8);
        frameLayout2.setOnClickListener(f.f146195a);
        return frameLayout;
    }

    public c(com.bytedance.o.f fVar, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f fVar2) {
        l.d(fVar, "");
        l.d(fVar2, "");
        this.f146194l = fVar;
        this.f146188e = fVar2;
        h.k.c a2 = h.f.b.ab.a(MultiEditViewModel.class);
        this.f146189g = h.i.a((h.f.a.a) new b(this, a2, a2));
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.p<? extends Boolean, ? extends Boolean>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, h.p<? extends Boolean, ? extends Boolean> pVar) {
            String str;
            String str2;
            h.p<? extends Boolean, ? extends Boolean> pVar2 = pVar;
            l.d(bVar, "");
            l.d(pVar2, "");
            c cVar = this.this$0;
            boolean booleanValue = ((Boolean) pVar2.getFirst()).booleanValue();
            boolean booleanValue2 = ((Boolean) pVar2.getSecond()).booleanValue();
            VideoPublishEditModel E = this.this$0.E();
            if (E != null) {
                E.copyMultiEditMusicInfo();
            }
            cVar.f146187d = booleanValue2;
            VEEditorAutoStartStopArbiter value = cVar.F().D().getValue();
            if (value != null) {
                value.f156726f = !booleanValue2;
            }
            if (booleanValue2) {
                boolean z = cVar.f146188e.t.f127885f;
                com.ss.android.ugc.tools.f.b c2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.c();
                if (booleanValue) {
                    str = "1";
                } else {
                    str = "0";
                }
                com.ss.android.ugc.tools.f.b a2 = c2.a("is_warn_shown", str);
                if (z) {
                    str2 = "single";
                } else {
                    str2 = "multiple";
                }
                r.a("enter_trim_page", a2.a("segment_type", str2).f149193a);
            }
            if (!cVar.f146188e.t.f127885f) {
                if (booleanValue2) {
                    cVar.F().a(u.a.a(com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false), cVar.H() + dh.c(cVar.f42913m), cVar.I(), cVar.J(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d(), false, false, 960));
                } else {
                    com.ss.android.ugc.aweme.shortvideo.preview.a F = cVar.F();
                    Activity activity = cVar.f42913m;
                    if (activity == null) {
                        l.b();
                    }
                    F.a(u.a.a(androidx.core.content.b.c(activity, R.color.a2), cVar.H() + dh.c(cVar.f42913m), cVar.I(), cVar.J(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d()));
                }
            }
            cVar.f146188e.a(booleanValue2);
            return z.f158842a;
        }
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
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
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
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
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
