package com.ss.android.ugc.gamora.editor.sticker.poll;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.u;
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
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.vesdk.VESize;
import h.f.a.q;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.m;
import h.z;
import java.util.Objects;

public final class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146762a = {new y(c.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new y(c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final b f146763e = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public EditStickerViewModel f146764b;

    /* renamed from: c  reason: collision with root package name */
    final h.h f146765c = h.i.a((h.f.a.a) new C3935c(this));

    /* renamed from: d  reason: collision with root package name */
    final h.h.d f146766d = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.infoSticker.i.class);

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f146767f = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.f.a.a.j.class);

    /* renamed from: g  reason: collision with root package name */
    private EditPollStickerViewModel f146768g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f146769h = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f146770i = h.i.a((h.f.a.a) new j(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f146771j = h.i.a(m.NONE, new a(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f146772k = h.i.a((h.f.a.a) new k(this));

    /* renamed from: l  reason: collision with root package name */
    private final PollingStickerLayout f146773l;
    private final com.bytedance.o.f t;

    static {
        Covode.recordClassIndex(96648);
    }

    private final com.bytedance.f.a.a.j C() {
        return (com.bytedance.f.a.a.j) this.f146767f.a(this, f146762a[0]);
    }

    private final com.bytedance.f.a.a.f D() {
        return (com.bytedance.f.a.a.f) this.f146770i.getValue();
    }

    public final VideoPublishEditModel a() {
        return (VideoPublishEditModel) this.f146769h.a(this, f146762a[1]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f146771j.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b d() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b) this.f146772k.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(96650);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146774a;

        static {
            Covode.recordClassIndex(96652);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(View view) {
            l.d(view, "");
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void e() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void f() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b() {
            a();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void d() {
            if (this.f146774a.d().b()) {
                c cVar = this.f146774a;
                ((com.ss.android.ugc.aweme.infoSticker.i) cVar.f146766d.a(cVar, c.f146762a[2])).a(this.f146774a.d().f127512b);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a() {
            this.f146774a.b().d(false);
            this.f146774a.d().r();
            c cVar = this.f146774a;
            r.a("poll_edit", new com.ss.android.ugc.tools.f.b().a("creation_id", cVar.a().creationId).a("shoot_way", cVar.a().mShootWay).a("content_type", bl.a(cVar.a())).a("content_source", bl.b(cVar.a())).a("enter_from", "video_edit_page").a("prop_id", cVar.d().f127512b).f149193a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f146774a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b(boolean z) {
            if (z) {
                EditStickerViewModel editStickerViewModel = this.f146774a.f146764b;
                if (editStickerViewModel == null) {
                    l.a("editStickerViewModel");
                }
                editStickerViewModel.b(0);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(boolean z) {
            ((EditInfoStickerViewModel) this.f146774a.f146765c.getValue()).i();
            if (z) {
                this.f146774a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
            } else {
                this.f146774a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
            }
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.t;
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

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96649);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.poll.c.a.invoke():com.bytedance.als.b");
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.bytedance.f.a.a.f> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.f.a.a.f invoke() {
            return new com.bytedance.f.a.a.f(400, this.this$0.d().r);
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b d2 = d();
        PollingStickerLayout pollingStickerLayout = d2.A;
        if (pollingStickerLayout != null) {
            pollingStickerLayout.p = d2.B;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$c  reason: collision with other inner class name */
    static final class C3935c extends h.f.b.m implements h.f.a.a<EditInfoStickerViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3935c(c cVar) {
            super(0);
            this.this$0 = cVar;
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

    static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b(this.this$0.b(), this.this$0.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.scene.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n_() {
        /*
            r4 = this;
            super.n_()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b r0 = r4.d()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout r3 = r0.A
            if (r3 == 0) goto L_0x002e
            android.widget.FrameLayout r1 = r3.f127480b
            if (r1 != 0) goto L_0x0014
            java.lang.String r0 = "root"
            h.f.b.l.a(r0)
        L_0x0014:
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            h.f.a.a<h.z> r1 = r3.f127481c
            if (r1 == 0) goto L_0x0022
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$e r0 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$e
            r0.<init>(r1)
            r1 = r0
        L_0x0022:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            r2.removeOnGlobalLayoutListener(r1)
            android.animation.Animator r0 = r3.q
            if (r0 == 0) goto L_0x002e
            r0.cancel()
        L_0x002e:
            com.bytedance.f.a.a.j r1 = r4.C()
            com.bytedance.f.a.a.f r0 = r4.D()
            r1.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.poll.c.n_():void");
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146776a;

        static {
            Covode.recordClassIndex(96658);
        }

        i(c cVar) {
            this.f146776a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.asve.editor.g gVar = (com.ss.android.ugc.asve.editor.g) obj;
            if (gVar != null) {
                this.f146776a.d().a(gVar, this.f146776a.b());
            }
        }
    }

    public final void a(VESize vESize) {
        l.d(vESize, "");
        d().q = vESize;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditPollStickerViewModel.class);
        l.b(a2, "");
        this.f146768g = (EditPollStickerViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity2).a(EditStickerViewModel.class);
        l.b(a3, "");
        this.f146764b = (EditStickerViewModel) a3;
        EditPollStickerViewModel editPollStickerViewModel = this.f146768g;
        if (editPollStickerViewModel == null) {
            l.a("pollStickerViewModel");
        }
        b.a.b(this, editPollStickerViewModel, d.f146777a, new e(this));
        EditPollStickerViewModel editPollStickerViewModel2 = this.f146768g;
        if (editPollStickerViewModel2 == null) {
            l.a("pollStickerViewModel");
        }
        f.a.b.b unused = selectSubscribe(editPollStickerViewModel2, e.f146778a, new ah(), new f(this));
        EditPollStickerViewModel editPollStickerViewModel3 = this.f146768g;
        if (editPollStickerViewModel3 == null) {
            l.a("pollStickerViewModel");
        }
        selectNonNullSubscribe(editPollStickerViewModel3, f.f146779a, new ah(), new g(this));
        EditStickerViewModel editStickerViewModel = this.f146764b;
        if (editStickerViewModel == null) {
            l.a("editStickerViewModel");
        }
        selectNonNullSubscribe(editStickerViewModel, g.f146780a, new ah(), new h(this));
        b().C().observe(this, new i(this));
        d().n = new d(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            l.d(bVar, "");
            l.d(zVar, "");
            this.this$0.d().n();
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Float, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Float f2) {
            float floatValue = f2.floatValue();
            l.d(iVar, "");
            this.this$0.d().a(floatValue);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96655);
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
            this.this$0.d().f127186e = booleanValue;
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.k kVar) {
            com.bytedance.jedi.arch.k kVar2 = kVar;
            l.d(bVar, "");
            l.d(kVar2, "");
            boolean booleanValue = kVar2.f39404b.booleanValue();
            this.this$0.d().x = !booleanValue;
            if (booleanValue) {
                this.this$0.d().a(new com.ss.android.ugc.aweme.editSticker.c.b(this) {
                    /* class com.ss.android.ugc.gamora.editor.sticker.poll.c.h.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h f146775a;

                    static {
                        Covode.recordClassIndex(96657);
                    }

                    @Override // com.ss.android.ugc.aweme.editSticker.c.b
                    public final boolean a() {
                        this.f146775a.this$0.d().i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f146775a = r1;
                    }
                });
            } else {
                this.this$0.d().a(com.ss.android.ugc.aweme.editSticker.c.a.f88100a);
            }
            return z.f158842a;
        }
    }

    public c(PollingStickerLayout pollingStickerLayout, com.bytedance.o.f fVar) {
        l.d(pollingStickerLayout, "");
        l.d(fVar, "");
        this.f146773l = pollingStickerLayout;
        this.t = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.scene.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.LayoutInflater r8, android.view.ViewGroup r9) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.poll.c.a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
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
