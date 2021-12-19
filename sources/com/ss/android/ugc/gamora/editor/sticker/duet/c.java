package com.ss.android.ugc.gamora.editor.sticker.duet;

import android.animation.Animator;
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
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.vesdk.VESize;
import h.f.a.q;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.k.k;
import h.m;
import h.z;
import java.util.Objects;

public final class c extends j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146622a = {new y(c.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new y(c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final b f146623e = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public EditStickerViewModel f146624b;

    /* renamed from: c  reason: collision with root package name */
    final h.h f146625c = h.i.a((h.f.a.a) new C3925c(this));

    /* renamed from: d  reason: collision with root package name */
    final h.h.d f146626d = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.infoSticker.i.class);

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f146627f = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.f.a.a.j.class);

    /* renamed from: g  reason: collision with root package name */
    private EditDuetStickerViewModel f146628g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f146629h = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f146630i = h.i.a(m.NONE, new a(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f146631j = h.i.a((h.f.a.a) new i(this));

    /* renamed from: k  reason: collision with root package name */
    private final DuetEditStickerLayout f146632k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.o.f f146633l;

    static {
        Covode.recordClassIndex(96496);
    }

    public final VideoPublishEditModel a() {
        return (VideoPublishEditModel) this.f146629h.a(this, f146622a[1]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f146630i.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c d() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c) this.f146631j.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(96498);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146634a;

        static {
            Covode.recordClassIndex(96500);
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
        public final void a() {
            this.f146634a.b().d(false);
            this.f146634a.d().r();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void d() {
            if (this.f146634a.d().b()) {
                c cVar = this.f146634a;
                ((com.ss.android.ugc.aweme.infoSticker.i) cVar.f146626d.a(cVar, c.f146622a[2])).a(this.f146634a.d().f127309b);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f146634a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(boolean z) {
            ((EditInfoStickerViewModel) this.f146634a.f146625c.getValue()).i();
            if (z) {
                this.f146634a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
            } else {
                this.f146634a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b(boolean z) {
            String str;
            if (z) {
                EditStickerViewModel editStickerViewModel = this.f146634a.f146624b;
                if (editStickerViewModel == null) {
                    l.a("editStickerViewModel");
                }
                editStickerViewModel.b(8);
                c cVar = this.f146634a;
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("group_id", "");
                com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.g.a().A().e();
                if (e2 != null) {
                    str = e2.c();
                } else {
                    str = null;
                }
                r.a("click_duet_sticker_popup", a2.a("user_id", str).a("creation_id", cVar.a().creationId).a("enter_from", "video_edit_page").a("content", "set duration or settings").f149193a);
            }
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f146633l;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
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
            Covode.recordClassIndex(96497);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.duet.c.a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.c$c  reason: collision with other inner class name */
    static final class C3925c extends h.f.b.m implements h.f.a.a<EditInfoStickerViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3925c(c cVar) {
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

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c(this.this$0.b(), this.this$0.a());
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        Animator animator;
        super.n_();
        DuetEditStickerLayout duetEditStickerLayout = d().A;
        if (duetEditStickerLayout != null && (animator = duetEditStickerLayout.f127242i) != null) {
            animator.cancel();
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146635a;

        static {
            Covode.recordClassIndex(96504);
        }

        h(c cVar) {
            this.f146635a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.asve.editor.g gVar = (com.ss.android.ugc.asve.editor.g) obj;
            if (gVar != null) {
                this.f146635a.d().a(gVar, this.f146635a.b());
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
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditDuetStickerViewModel.class);
        l.b(a2, "");
        this.f146628g = (EditDuetStickerViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity2).a(EditStickerViewModel.class);
        l.b(a3, "");
        this.f146624b = (EditStickerViewModel) a3;
        EditDuetStickerViewModel editDuetStickerViewModel = this.f146628g;
        if (editDuetStickerViewModel == null) {
            l.a("duetStickerViewModel");
        }
        b.a.b(this, editDuetStickerViewModel, d.f146636a, new e(this));
        EditDuetStickerViewModel editDuetStickerViewModel2 = this.f146628g;
        if (editDuetStickerViewModel2 == null) {
            l.a("duetStickerViewModel");
        }
        f.a.b.b unused = selectSubscribe(editDuetStickerViewModel2, e.f146637a, new ah(), new f(this));
        EditDuetStickerViewModel editDuetStickerViewModel3 = this.f146628g;
        if (editDuetStickerViewModel3 == null) {
            l.a("duetStickerViewModel");
        }
        selectNonNullSubscribe(editDuetStickerViewModel3, f.f146638a, new ah(), new g(this));
        b().C().observe(this, new h(this));
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
            Covode.recordClassIndex(96501);
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
            Covode.recordClassIndex(96502);
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
            Covode.recordClassIndex(96503);
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

    public c(DuetEditStickerLayout duetEditStickerLayout, com.bytedance.o.f fVar) {
        l.d(duetEditStickerLayout, "");
        l.d(fVar, "");
        this.f146632k = duetEditStickerLayout;
        this.f146633l = fVar;
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.i(3074);
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        com.ss.android.ugc.asve.editor.g value = b().C().getValue();
        if (value != null) {
            a(value.b());
            d().b(this.f42913m, frameLayout);
            ((com.bytedance.f.a.a.j) this.f146627f.a(this, f146622a[0])).a(new com.bytedance.f.a.a.f(300, d().r));
        }
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c d2 = d();
        Activity activity = this.f42913m;
        if (activity == null) {
            l.b();
        }
        l.b(activity, "");
        DuetEditStickerLayout duetEditStickerLayout = this.f146632k;
        l.d(activity, "");
        l.d(duetEditStickerLayout, "");
        d2.A = duetEditStickerLayout;
        DuetEditStickerLayout duetEditStickerLayout2 = d2.A;
        if (duetEditStickerLayout2 != null) {
            duetEditStickerLayout2.setEditModel(d2.D);
        }
        DuetEditStickerLayout duetEditStickerLayout3 = d2.A;
        if (duetEditStickerLayout3 != null) {
            duetEditStickerLayout3.setOnCompleteListener(new c.b(d2));
        }
        d().a(b().C().getValue(), b());
        d().s = false;
        View view = new View(frameLayout.getContext());
        MethodCollector.o(3074);
        return view;
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
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
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
