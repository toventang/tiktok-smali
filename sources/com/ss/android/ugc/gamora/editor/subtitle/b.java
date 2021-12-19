package com.ss.android.ugc.gamora.editor.subtitle;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.ugc.gamora.editor.subtitle.d;
import com.ss.android.vesdk.VESize;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.m;
import h.z;
import java.util.List;
import java.util.Objects;

public final class b extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146944a = {new y(b.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final c f146945f = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.f.a.a.j f146946b;

    /* renamed from: c  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.sticker.data.h> f146947c;

    /* renamed from: d  reason: collision with root package name */
    public EditStickerViewModel f146948d;

    /* renamed from: e  reason: collision with root package name */
    final h.h f146949e = h.i.a((h.f.a.a) new d(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f146950g = h.i.a(m.NONE, new C3943b(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f146951h = h.i.a(m.NONE, new a(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f146952i = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f146953j = h.i.a((h.f.a.a) new j(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f146954k = h.i.a((h.f.a.a) new k(this));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.o.f f146955l;

    static {
        Covode.recordClassIndex(96775);
    }

    private final com.bytedance.f.a.a.f E() {
        return (com.bytedance.f.a.a.f) this.f146953j.getValue();
    }

    public final a C() {
        return (a) this.f146954k.getValue();
    }

    public final e a() {
        return (e) this.f146950g.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f146951h.getValue();
    }

    public final VideoPublishEditModel d() {
        return (VideoPublishEditModel) this.f146952i.a(this, f146944a[0]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(96778);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f146955l;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.scene.j
    public final void v() {
        super.v();
    }

    @Override // com.bytedance.scene.j
    public final void y() {
        super.y();
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
            Covode.recordClassIndex(96776);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.subtitle.b.a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$b  reason: collision with other inner class name */
    public static final class C3943b extends h.f.b.m implements h.f.a.a<e> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(96777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3943b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.subtitle.e, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.subtitle.e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.subtitle.e> r1 = com.ss.android.ugc.gamora.editor.subtitle.e.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.subtitle.b.C3943b.invoke():com.bytedance.als.b");
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.bytedance.f.a.a.f> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.f.a.a.f invoke() {
            return new com.bytedance.f.a.a.f(325, this.this$0.C().r);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(this.this$0.b());
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<EditInfoStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditInfoStickerViewModel invoke() {
            Activity activity = this.this$0.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditInfoStickerViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146956a;

        static {
            Covode.recordClassIndex(96780);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(View view) {
            l.d(view, "");
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void d() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void e() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void f() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a() {
            bl.b(this.f146956a.d(), "menu");
            e a2 = this.f146956a.a();
            if (a2 != null) {
                a2.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void c() {
            e a2 = this.f146956a.a();
            if (a2 != null) {
                a2.a(null);
            }
            this.f146956a.C().d();
            this.f146956a.d().captionStruct = null;
            bl.a(this.f146956a.d(), "click_menu", 1, 0, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(b bVar) {
            this.f146956a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b(boolean z) {
            if (z) {
                EditStickerViewModel editStickerViewModel = this.f146956a.f146948d;
                if (editStickerViewModel == null) {
                    l.a("editStickerViewModel");
                }
                editStickerViewModel.b(5);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(boolean z) {
            ((EditInfoStickerViewModel) this.f146956a.f146949e.getValue()).i();
            if (z) {
                this.f146956a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
            } else {
                this.f146956a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        com.bytedance.f.a.a.j jVar = this.f146946b;
        if (jVar == null) {
            l.a("gestureService");
        }
        jVar.b(E());
    }

    public final InteractStickerStruct D() {
        int i2;
        int i3;
        if (d().captionStruct == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setIndex(11);
        interactStickerStruct.setCaptionStruct(d().captionStruct);
        com.ss.android.ugc.aweme.sticker.data.d captionStruct = interactStickerStruct.getCaptionStruct();
        if (captionStruct != null) {
            if (C().f127189h < 0) {
                i3 = d.t - C().f127189h;
            } else {
                i3 = d.t;
            }
            captionStruct.setMarginStart(Integer.valueOf(i3));
        }
        com.ss.android.ugc.aweme.sticker.data.d captionStruct2 = interactStickerStruct.getCaptionStruct();
        if (captionStruct2 != null) {
            captionStruct2.setVideoWidth(Integer.valueOf(dh.b(com.ss.android.ugc.aweme.df.b.a()) - (C().f127189h * 2)));
        }
        com.ss.android.ugc.aweme.sticker.data.d captionStruct3 = interactStickerStruct.getCaptionStruct();
        if (captionStruct3 != null) {
            if (C().f127190i < 0) {
                i2 = d.s - C().f127190i;
            } else {
                i2 = d.s;
            }
            captionStruct3.setMarginTop(Integer.valueOf(i2));
        }
        com.ss.android.ugc.aweme.sticker.data.d captionStruct4 = interactStickerStruct.getCaptionStruct();
        if (captionStruct4 != null) {
            View view = this.n;
            l.b(view, "");
            captionStruct4.setMarginBottom(Integer.valueOf((view.getHeight() - com.ss.android.ugc.aweme.sticker.view.a.a(s())) + com.ss.android.ugc.aweme.sticker.view.a.getTbMargin()));
        }
        interactStickerStruct.setType(11);
        return interactStickerStruct;
    }

    public static final class f implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146957a;

        static {
            Covode.recordClassIndex(96781);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(b bVar) {
            this.f146957a = bVar;
        }

        @Override // com.ss.android.ugc.gamora.editor.subtitle.d.b
        public final void a(int i2) {
            com.ss.android.ugc.aweme.sticker.data.d dVar = this.f146957a.d().captionStruct;
            if (dVar != null) {
                dVar.setLocation(i2);
            }
        }
    }

    public final void a(com.bytedance.f.a.a.j jVar) {
        l.d(jVar, "");
        this.f146946b = jVar;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146958a;

        static {
            Covode.recordClassIndex(96782);
        }

        g(b bVar) {
            this.f146958a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.asve.editor.g gVar = (com.ss.android.ugc.asve.editor.g) obj;
            if (gVar != null) {
                this.f146958a.C().a(gVar, this.f146958a.b());
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.sticker.data.d dVar) {
        if (dVar != null) {
            C().a(dVar.getUtterances());
            C().a(dVar.getLocation());
            this.f146947c = dVar.getUtterances();
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146959a;

        static {
            Covode.recordClassIndex(96783);
        }

        h(b bVar) {
            this.f146959a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            List<com.ss.android.ugc.aweme.sticker.data.h> list = (List) obj;
            this.f146959a.C().a(list);
            if (com.ss.android.ugc.tools.utils.d.a(this.f146959a.f146947c) && !com.ss.android.ugc.tools.utils.d.a(list)) {
                this.f146959a.C().a(com.ss.android.ugc.aweme.sticker.data.a.LEFT_BOTTOM.getValue());
            }
            this.f146959a.f146947c = list;
            this.f146959a.C().q();
        }
    }

    public final void a(VESize vESize) {
        l.d(vESize, "");
        C().q = vESize;
    }

    public b(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f146955l = fVar;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        com.bytedance.als.h<List<com.ss.android.ugc.aweme.sticker.data.h>> a2;
        super.a(bundle);
        b().C().observe(this, new g(this));
        e a3 = a();
        if (!(a3 == null || (a2 = a3.a()) == null)) {
            a2.a(this, new h(this));
        }
        EditStickerViewModel editStickerViewModel = this.f146948d;
        if (editStickerViewModel == null) {
            l.a("editStickerViewModel");
        }
        selectNonNullSubscribe(editStickerViewModel, c.f146961a, new ah(), new i(this));
        C().n = new e(this);
        a C = C();
        f fVar = new f(this);
        l.d(fVar, "");
        d dVar = C.f146937a;
        if (dVar != null) {
            dVar.setOnCaptionStickerListener(fVar);
        }
        C.A = fVar;
    }

    public final void a(boolean z) {
        C().f127186e = z;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.k kVar) {
            com.bytedance.jedi.arch.k kVar2 = kVar;
            l.d(bVar, "");
            l.d(kVar2, "");
            boolean booleanValue = kVar2.f39404b.booleanValue();
            this.this$0.C().x = !booleanValue;
            if (booleanValue) {
                this.this$0.C().a(new com.ss.android.ugc.aweme.editSticker.c.b(this) {
                    /* class com.ss.android.ugc.gamora.editor.subtitle.b.i.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f146960a;

                    static {
                        Covode.recordClassIndex(96785);
                    }

                    @Override // com.ss.android.ugc.aweme.editSticker.c.b
                    public final boolean a() {
                        this.f146960a.this$0.C().i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f146960a = r1;
                    }
                });
            } else {
                this.this$0.C().a(com.ss.android.ugc.aweme.editSticker.c.a.f88100a);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.i(4719);
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        Activity activity = this.f42913m;
        if (activity != null) {
            JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditStickerViewModel.class);
            l.b(a2, "");
            this.f146948d = (EditStickerViewModel) a2;
            if (b().C().getValue() != null) {
                C().b(this.f42913m, (FrameLayout) viewGroup);
                com.bytedance.f.a.a.j jVar = this.f146946b;
                if (jVar == null) {
                    l.a("gestureService");
                }
                jVar.a(E());
            }
            C().f146939c = d();
            C().a(b().C().getValue(), b());
            C().s = false;
            View view = new View(viewGroup.getContext());
            MethodCollector.o(4719);
            return view;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(4719);
        throw nullPointerException;
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
