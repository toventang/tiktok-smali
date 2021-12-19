package com.ss.android.ugc.gamora.editor.sticker.qa;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.m;
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
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.qasticker.view.QaStickerView;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.gamora.editor.ab;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.vesdk.VESize;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.y;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a, com.ss.android.ugc.gamora.editor.sticker.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146792a = {new y(c.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new y(c.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0), new y(c.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new y(c.class, "lighteningBottomComponent", "getLighteningBottomComponent()Lcom/ss/android/ugc/gamora/editor/lightening/bottom/LighteningBottomComponent;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final a f146793e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final h.h f146794b = h.i.a((h.f.a.a) new C3937c(this));

    /* renamed from: c  reason: collision with root package name */
    public EditStickerViewModel f146795c;

    /* renamed from: d  reason: collision with root package name */
    final h.h.d f146796d = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.infoSticker.i.class);

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f146797f = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.f.a.a.j.class);

    /* renamed from: g  reason: collision with root package name */
    private EditPageQaStickerViewModel f146798g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f146799h = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f146800i = h.i.a((h.f.a.a) new k(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f146801j = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.preview.a.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f146802k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f146803l;
    private final QaStickerEditLayout t;
    private final com.bytedance.o.f u;

    static {
        Covode.recordClassIndex(96675);
    }

    public final com.ss.android.ugc.gamora.editor.lightening.a.a C() {
        return (com.ss.android.ugc.gamora.editor.lightening.a.a) this.f146803l.a(this, f146792a[4]);
    }

    public final VideoPublishEditModel a() {
        return (VideoPublishEditModel) this.f146799h.a(this, f146792a[1]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f146801j.a(this, f146792a[3]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e d() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e) this.f146802k.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96676);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146807a;

        static {
            Covode.recordClassIndex(96679);
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
            this.f146807a.b().d(false);
            this.f146807a.d().r();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void d() {
            long j2;
            if (this.f146807a.d().b()) {
                c cVar = this.f146807a;
                ((com.ss.android.ugc.aweme.infoSticker.i) cVar.f146796d.a(cVar, c.f146792a[2])).a(this.f146807a.d().f127564c);
            }
            this.f146807a.a().hasQaSticker = false;
            com.ss.android.ugc.gamora.editor.lightening.a.a C = this.f146807a.C();
            if (C != null) {
                C.f();
            }
            String str = this.f146807a.a().mShootWay;
            if (!h.f.b.l.a((Object) str, (Object) "answer")) {
                str = "question";
            }
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("shoot_way", str).a("prop_id", this.f146807a.d().f127564c);
            QaStruct qaStruct = this.f146807a.d().f127562a;
            if (qaStruct != null) {
                j2 = qaStruct.getQuestionId();
            } else {
                j2 = 0;
            }
            com.ss.android.ugc.aweme.utils.d.a("prop_delete", a2.a("question_id", String.valueOf(j2)).f149193a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f146807a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b(boolean z) {
            if (z) {
                EditStickerViewModel editStickerViewModel = this.f146807a.f146795c;
                if (editStickerViewModel == null) {
                    h.f.b.l.a("editStickerViewModel");
                }
                editStickerViewModel.b(0);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(boolean z) {
            ((EditInfoStickerViewModel) this.f146807a.f146794b.getValue()).i();
            if (z) {
                this.f146807a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
            } else {
                this.f146807a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
            }
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.u;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
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

    static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.f.a.a.f> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.f.a.a.f invoke() {
            return new com.bytedance.f.a.a.f(300, this.this$0.d().r);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$c  reason: collision with other inner class name */
    static final class C3937c extends h.f.b.m implements h.f.a.a<EditInfoStickerViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3937c(c cVar) {
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

    static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a().hasQaSticker = true;
            com.ss.android.ugc.gamora.editor.lightening.a.a C = this.this$0.C();
            if (C != null) {
                C.f();
            }
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e> {
        final /* synthetic */ com.ss.android.ugc.aweme.qasticker.a $mobHelper;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar, com.ss.android.ugc.aweme.qasticker.a aVar) {
            super(0);
            this.this$0 = cVar;
            this.$mobHelper = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e(this.this$0.b(), this.this$0.a(), this.$mobHelper);
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146809a;

        static {
            Covode.recordClassIndex(96685);
        }

        i(c cVar) {
            this.f146809a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.asve.editor.g gVar = (com.ss.android.ugc.asve.editor.g) obj;
            if (gVar != null) {
                this.f146809a.d().a(gVar, this.f146809a.b());
            }
        }
    }

    public final void a(VESize vESize) {
        h.f.b.l.d(vESize, "");
        d().q = vESize;
    }

    public final void a(QaStruct qaStruct) {
        h.f.b.l.d(qaStruct, "");
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e d2 = d();
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        h.f.b.l.d(t2, "");
        h.f.b.l.d(qaStruct, "");
        QaStickerView qaStickerView = new QaStickerView(t2, (AttributeSet) null, 6);
        qaStickerView.a(qaStruct);
        qaStickerView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        qaStickerView.b();
        d2.a(qaStickerView);
    }

    /* access modifiers changed from: package-private */
    public static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.g f146805b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ab f146806c;

        static {
            Covode.recordClassIndex(96677);
        }

        b(c cVar, com.ss.android.ugc.asve.editor.g gVar, ab abVar) {
            this.f146804a = cVar;
            this.f146805b = gVar;
            this.f146806c = abVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.b(iVar, "");
            for (com.ss.android.ugc.aweme.editSticker.compile.b bVar : (List) iVar.d()) {
                StickerItemModel stickerItemModel = new StickerItemModel(this.f146804a.d().f127564c, bVar.stickerPath, "", bVar.index, false, 0, this.f146805b.j(), 19);
                stickerItemModel.isImageStickerLayer = true;
                stickerItemModel.viewHash = bVar.viewHash;
                this.f146806c.a(stickerItemModel);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditPageQaStickerViewModel.class);
        h.f.b.l.b(a2, "");
        this.f146798g = (EditPageQaStickerViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity2).a(EditStickerViewModel.class);
        h.f.b.l.b(a3, "");
        this.f146795c = (EditStickerViewModel) a3;
        d().n = new d(this);
        EditPageQaStickerViewModel editPageQaStickerViewModel = this.f146798g;
        if (editPageQaStickerViewModel == null) {
            h.f.b.l.a("qaStickerViewModel");
        }
        b.a.b(this, editPageQaStickerViewModel, d.f146810a, new e(this));
        EditPageQaStickerViewModel editPageQaStickerViewModel2 = this.f146798g;
        if (editPageQaStickerViewModel2 == null) {
            h.f.b.l.a("qaStickerViewModel");
        }
        f.a.b.b unused = selectSubscribe(editPageQaStickerViewModel2, e.f146811a, new ah(), new f(this));
        EditPageQaStickerViewModel editPageQaStickerViewModel3 = this.f146798g;
        if (editPageQaStickerViewModel3 == null) {
            h.f.b.l.a("qaStickerViewModel");
        }
        selectNonNullSubscribe(editPageQaStickerViewModel3, f.f146812a, new ah(), new g(this));
        EditStickerViewModel editStickerViewModel = this.f146795c;
        if (editStickerViewModel == null) {
            h.f.b.l.a("editStickerViewModel");
        }
        selectNonNullSubscribe(editStickerViewModel, g.f146813a, new ah(), new h(this));
        b().C().observe(this, new i(this));
        IEffectPlatformFactory a4 = EffectPlatformFactory.a();
        EffectPlatformBuilder context = new EffectPlatformBuilder().setContext(q());
        h.f.b.l.b(context, "");
        EffectConfiguration build = a4.createEffectConfigurationBuilder(context).build();
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e d2 = d();
        StringBuilder sb = new StringBuilder();
        h.f.b.l.b(build, "");
        File effectDir = build.getEffectDir();
        h.f.b.l.b(effectDir, "");
        d2.a(sb.append(effectDir.getAbsolutePath()).append("/qa_sticker").toString());
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96680);
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
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.d().n();
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Float, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96681);
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
            h.f.b.l.d(iVar, "");
            this.this$0.d().a(floatValue);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96682);
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
            h.f.b.l.d(bVar, "");
            this.this$0.d().f127186e = booleanValue;
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96683);
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
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(kVar2, "");
            boolean booleanValue = kVar2.f39404b.booleanValue();
            this.this$0.d().x = !booleanValue;
            if (booleanValue) {
                this.this$0.d().a(new com.ss.android.ugc.aweme.editSticker.c.b(this) {
                    /* class com.ss.android.ugc.gamora.editor.sticker.qa.c.h.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h f146808a;

                    static {
                        Covode.recordClassIndex(96684);
                    }

                    @Override // com.ss.android.ugc.aweme.editSticker.c.b
                    public final boolean a() {
                        this.f146808a.this$0.d().i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f146808a = r1;
                    }
                });
            } else {
                this.this$0.d().a(com.ss.android.ugc.aweme.editSticker.c.a.f88100a);
            }
            return z.f158842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout$f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.scene.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.LayoutInflater r8, android.view.ViewGroup r9) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.qa.c.a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public c(QaStickerEditLayout qaStickerEditLayout, com.bytedance.o.f fVar, com.ss.android.ugc.aweme.qasticker.a aVar) {
        h.f.b.l.d(qaStickerEditLayout, "");
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(aVar, "");
        this.t = qaStickerEditLayout;
        this.u = fVar;
        this.f146802k = h.i.a((h.f.a.a) new l(this, aVar));
        this.f146803l = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.lightening.a.a.class);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.b
    public final b.i<z> a(com.ss.android.ugc.asve.editor.g gVar, ab abVar, h.f.a.b<? super String, String> bVar) {
        String str;
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(abVar, "");
        if (d().b()) {
            if (bVar == null || (str = bVar.invoke("qa_sticker")) == null) {
                str = d().p();
            }
            h.f.b.l.b(str, "");
            int a2 = abVar.T().a();
            int b2 = abVar.T().b();
            int i2 = gVar.b().width;
            int i3 = gVar.b().height;
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e d2 = d();
            h.f.b.l.d(str, "");
            ArrayList arrayList = new ArrayList();
            b.i<com.ss.android.ugc.aweme.editSticker.compile.b> a3 = d2.a(str, a2, b2, i2, i3);
            h.f.b.l.b(a3, "");
            arrayList.add(a3);
            b.i a4 = b.i.a((Collection) arrayList);
            h.f.b.l.b(a4, "");
            b.i<z> c2 = a4.c(new b(this, gVar, abVar), b.i.f4826c);
            h.f.b.l.b(c2, "");
            return c2;
        }
        b.i<z> a5 = b.i.a(z.f158842a);
        h.f.b.l.b(a5, "");
        return a5;
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
