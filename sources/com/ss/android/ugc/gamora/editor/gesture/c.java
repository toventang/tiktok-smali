package com.ss.android.ugc.gamora.editor.gesture;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.sticker.r;
import h.f.a.q;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.k.k;
import h.m;
import h.p;
import h.z;

public final class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f145960a = {new y(c.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0)};

    /* renamed from: c  reason: collision with root package name */
    public static final e f145961c = new e((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.f.a.a.j f145962b;

    /* renamed from: d  reason: collision with root package name */
    private r f145963d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f145964e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f145965f = h.i.a(m.NONE, new a(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f145966g = h.i.a(m.NONE, new b(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f145967h = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.sticker.core.a.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f145968i = h.i.a(m.NONE, new d(this));

    /* renamed from: j  reason: collision with root package name */
    private final j f145969j = new j(this);

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.o.f f145970k;

    static {
        Covode.recordClassIndex(95916);
    }

    private final EditGestureViewModel a() {
        return (EditGestureViewModel) this.f145964e.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class e {
        static {
            Covode.recordClassIndex(95921);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f145970k;
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

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.core.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.filter.core.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.filter.core.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.core.a> r1 = com.ss.android.ugc.gamora.editor.filter.core.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.gesture.c.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.gesture.c.b.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.progress.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(95920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.progress.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.progress.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progress.a> r1 = com.ss.android.ugc.gamora.editor.progress.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.gesture.c.d.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        r rVar = this.f145963d;
        if (rVar == null) {
            l.a("stickerPanelGestureAdapter");
        }
        rVar.f135448b = null;
    }

    public static final class j implements r.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f145972a;

        static {
            Covode.recordClassIndex(95926);
        }

        @Override // com.ss.android.ugc.aweme.sticker.r.a
        public final void a() {
            com.bytedance.scene.j jVar = this.f145972a.o;
            if (!(jVar instanceof com.ss.android.ugc.gamora.editor.v)) {
                jVar = null;
            }
            com.ss.android.ugc.gamora.editor.v vVar = (com.ss.android.ugc.gamora.editor.v) jVar;
            if (vVar != null) {
                vVar.ae();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(c cVar) {
            this.f145972a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.c$c  reason: collision with other inner class name */
    public static final class C3895c extends h.f.b.m implements h.f.a.a<EditGestureViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(95919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3895c(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_gesture_EditGestureScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_gesture_EditGestureScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.gesture.c.C3895c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_gesture_EditGestureScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
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

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f145971a;

        static {
            Covode.recordClassIndex(95922);
        }

        f(c cVar) {
            this.f145971a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            h.u uVar = (h.u) obj;
            if (uVar != null) {
                this.f145971a.a(((Boolean) uVar.getThird()).booleanValue());
            }
        }
    }

    public final void a(boolean z) {
        ((com.ss.android.ugc.gamora.editor.filter.core.a) this.f145965f.getValue()).a(z);
        com.ss.android.ugc.gamora.editor.progress.a aVar = (com.ss.android.ugc.gamora.editor.progress.a) this.f145968i.getValue();
        if (aVar != null) {
            aVar.a(z);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        h.f.a.a<Rect> aVar;
        super.a(bundle);
        ((com.ss.android.ugc.aweme.shortvideo.preview.a) this.f145966g.getValue()).F().observe(this, new f(this));
        selectNonNullSubscribe(a(), d.f145973a, new ah(), new g(this));
        b.a.b(this, a(), e.f145974a, new h(this));
        b.a.b(this, a(), f.f145975a, new i(this));
        com.bytedance.f.a.a.j jVar = this.f145962b;
        com.ss.android.ugc.gamora.editor.sticker.core.a aVar2 = (com.ss.android.ugc.gamora.editor.sticker.core.a) this.f145967h.a(this, f145960a[0]);
        if (aVar2 != null) {
            aVar = aVar2.h();
        } else {
            aVar = null;
        }
        r rVar = new r(jVar, aVar);
        this.f145963d = rVar;
        rVar.f135448b = this.f145969j;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(95923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            this.this$0.a(booleanValue);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.i(4567);
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View view = new View(viewGroup.getContext());
        MethodCollector.o(4567);
        return view;
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, p<? extends Float, ? extends Long>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(95924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, p<? extends Float, ? extends Long> pVar) {
            p<? extends Float, ? extends Long> pVar2 = pVar;
            l.d(bVar, "");
            l.d(pVar2, "");
            com.ss.android.ugc.gamora.editor.u.a(this.this$0.f145962b.a(), ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.u<? extends Float, ? extends Float, ? extends Float>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(95925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, h.u<? extends Float, ? extends Float, ? extends Float> uVar) {
            h.u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            l.d(bVar, "");
            l.d(uVar2, "");
            com.ss.android.ugc.gamora.editor.u.a(this.this$0.f145962b.a(), ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return z.f158842a;
        }
    }

    public c(com.bytedance.f.a.a.j jVar, com.bytedance.o.f fVar) {
        l.d(jVar, "");
        l.d(fVar, "");
        this.f145962b = jVar;
        this.f145970k = fVar;
        h.k.c a2 = h.f.b.ab.a(EditGestureViewModel.class);
        this.f145964e = h.i.a((h.f.a.a) new C3895c(this, a2, a2));
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
