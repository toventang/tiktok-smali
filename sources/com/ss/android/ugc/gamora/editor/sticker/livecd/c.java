package com.ss.android.ugc.gamora.editor.sticker.livecd;

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
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.vesdk.VESize;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.y;
import h.m;
import h.z;
import java.util.List;
import java.util.Objects;

public final class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146683a = {new y(c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final b f146684e = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final h.h.d f146685b = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.infoSticker.i.class);

    /* renamed from: c  reason: collision with root package name */
    public EditStickerViewModel f146686c;

    /* renamed from: d  reason: collision with root package name */
    final h.h f146687d = h.i.a((h.f.a.a) new C3929c(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f146688f = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: g  reason: collision with root package name */
    private EditLiveCDStickerViewModel f146689g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f146690h = h.i.a(m.NONE, new a(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f146691i = h.i.a((h.f.a.a) new l(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f146692j = h.i.a((h.f.a.a) new k(this));

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.f.a.a.j f146693k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveCDEditStickerLayout f146694l;
    private final com.bytedance.o.f t;

    static {
        Covode.recordClassIndex(96564);
    }

    private final com.bytedance.f.a.a.f C() {
        return (com.bytedance.f.a.a.f) this.f146692j.getValue();
    }

    /* access modifiers changed from: package-private */
    public final VideoPublishEditModel a() {
        return (VideoPublishEditModel) this.f146688f.a(this, f146683a[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f146690h.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a d() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a) this.f146691i.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(96566);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146695a;

        static {
            Covode.recordClassIndex(96568);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
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
            this.f146695a.b().d(false);
            this.f146695a.d().r();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void d() {
            if (this.f146695a.d().b()) {
                c cVar = this.f146695a;
                ((com.ss.android.ugc.aweme.infoSticker.i) cVar.f146685b.a(cVar, c.f146683a[1])).a(this.f146695a.d().f127466a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f146695a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b(boolean z) {
            if (z) {
                EditStickerViewModel editStickerViewModel = this.f146695a.f146686c;
                if (editStickerViewModel == null) {
                    h.f.b.l.a("editStickerViewModel");
                }
                editStickerViewModel.b(3);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(boolean z) {
            ((EditInfoStickerViewModel) this.f146695a.f146687d.getValue()).i();
            if (z) {
                this.f146695a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
            } else {
                this.f146695a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
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
            Covode.recordClassIndex(96565);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.livecd.c.a.invoke():com.bytedance.als.b");
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.f.a.a.f> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.f.a.a.f invoke() {
            return new com.bytedance.f.a.a.f(350, this.this$0.d().r);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a(this.this$0.b());
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a d2 = d();
        LiveCDEditStickerLayout liveCDEditStickerLayout = d2.f127468c;
        if (liveCDEditStickerLayout != null) {
            liveCDEditStickerLayout.q = d2.A;
        }
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        this.f146694l.a();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$c  reason: collision with other inner class name */
    static final class C3929c extends h.f.b.m implements h.f.a.a<EditInfoStickerViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96567);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3929c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditInfoStickerViewModel invoke() {
            Activity activity = this.this$0.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditInfoStickerViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$k] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.scene.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n_() {
        /*
            r4 = this;
            super.n_()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a r0 = r4.d()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout r3 = r0.f127468c
            if (r3 == 0) goto L_0x0032
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            android.widget.FrameLayout r1 = r3.f127406a
            if (r1 != 0) goto L_0x0018
            java.lang.String r0 = "root"
            h.f.b.l.a(r0)
        L_0x0018:
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            h.f.a.a<h.z> r1 = r3.f127412g
            if (r1 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$k r0 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$k
            r0.<init>(r1)
            r1 = r0
        L_0x0026:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            r2.removeOnGlobalLayoutListener(r1)
            android.animation.Animator r0 = r3.r
            if (r0 == 0) goto L_0x0032
            r0.cancel()
        L_0x0032:
            com.bytedance.f.a.a.j r1 = r4.f146693k
            com.bytedance.f.a.a.f r0 = r4.C()
            r1.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.livecd.c.n_():void");
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146697a;

        static {
            Covode.recordClassIndex(96575);
        }

        j(c cVar) {
            this.f146697a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.asve.editor.g gVar = (com.ss.android.ugc.asve.editor.g) obj;
            if (gVar != null) {
                this.f146697a.d().a(gVar, this.f146697a.b());
            }
        }
    }

    public final void a(VESize vESize) {
        h.f.b.l.d(vESize, "");
        d().q = vESize;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditLiveCDStickerViewModel.class);
        h.f.b.l.b(a2, "");
        this.f146689g = (EditLiveCDStickerViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity2).a(EditStickerViewModel.class);
        h.f.b.l.b(a3, "");
        this.f146686c = (EditStickerViewModel) a3;
        EditLiveCDStickerViewModel editLiveCDStickerViewModel = this.f146689g;
        if (editLiveCDStickerViewModel == null) {
            h.f.b.l.a("liveCDStickerViewModel");
        }
        b.a.b(this, editLiveCDStickerViewModel, d.f146698a, new f(this));
        EditLiveCDStickerViewModel editLiveCDStickerViewModel2 = this.f146689g;
        if (editLiveCDStickerViewModel2 == null) {
            h.f.b.l.a("liveCDStickerViewModel");
        }
        f.a.b.b unused = selectSubscribe(editLiveCDStickerViewModel2, f.f146700a, new ah(), new g(this));
        EditLiveCDStickerViewModel editLiveCDStickerViewModel3 = this.f146689g;
        if (editLiveCDStickerViewModel3 == null) {
            h.f.b.l.a("liveCDStickerViewModel");
        }
        selectNonNullSubscribe(editLiveCDStickerViewModel3, g.f146701a, new ah(), new h(this));
        EditLiveCDStickerViewModel editLiveCDStickerViewModel4 = this.f146689g;
        if (editLiveCDStickerViewModel4 == null) {
            h.f.b.l.a("liveCDStickerViewModel");
        }
        b.a.b(this, editLiveCDStickerViewModel4, h.f146702a, new i(this));
        b().C().observe(this, new j(this));
        EditStickerViewModel editStickerViewModel = this.f146686c;
        if (editStickerViewModel == null) {
            h.f.b.l.a("editStickerViewModel");
        }
        selectNonNullSubscribe(editStickerViewModel, e.f146699a, new ah(), new e(this));
        d().n = new d(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96571);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.d().n();
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Float, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Float f2) {
            float floatValue = f2.floatValue();
            h.f.b.l.d(iVar, "");
            this.this$0.d().a(floatValue);
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            this.this$0.d().f127186e = booleanValue;
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.k kVar) {
            com.bytedance.jedi.arch.k kVar2 = kVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(kVar2, "");
            boolean booleanValue = kVar2.f39404b.booleanValue();
            this.this$0.d().x = !booleanValue;
            if (booleanValue) {
                this.this$0.d().a(new com.ss.android.ugc.aweme.editSticker.c.b(this) {
                    /* class com.ss.android.ugc.gamora.editor.sticker.livecd.c.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f146696a;

                    static {
                        Covode.recordClassIndex(96570);
                    }

                    @Override // com.ss.android.ugc.aweme.editSticker.c.b
                    public final boolean a() {
                        this.f146696a.this$0.d().i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f146696a = r1;
                    }
                });
            } else {
                this.this$0.d().a(com.ss.android.ugc.aweme.editSticker.c.a.f88100a);
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96574);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            c cVar = this.this$0;
            List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(cVar.a().getMainBusinessContext(), 10, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
            cVar.d().a(cVar.b().C().getValue(), cVar.b());
            if (a2 != null && !a2.isEmpty()) {
                InteractStickerStruct interactStickerStruct = a2.get(0);
                h.f.b.l.b(interactStickerStruct, "");
                if (interactStickerStruct.getCountDownStickerStruct() != null) {
                    cVar.d().a(a2.get(0));
                }
            }
            return z.f158842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$k] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.scene.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.LayoutInflater r9, android.view.ViewGroup r10) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.livecd.c.a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public c(com.bytedance.f.a.a.j jVar, LiveCDEditStickerLayout liveCDEditStickerLayout, com.bytedance.o.f fVar) {
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(liveCDEditStickerLayout, "");
        h.f.b.l.d(fVar, "");
        this.f146693k = jVar;
        this.f146694l = liveCDEditStickerLayout;
        this.t = fVar;
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
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
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
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
