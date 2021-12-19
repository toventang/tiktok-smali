package com.ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.t;
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
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.vesdk.VESize;
import h.f.b.y;
import h.z;
import java.io.File;
import java.util.List;
import java.util.Objects;

public final class h extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a, aa {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f145976a = {new y(h.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(h.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0), new y(h.class, "lighteningBottomComponent", "getLighteningBottomComponent()Lcom/ss/android/ugc/gamora/editor/lightening/bottom/LighteningBottomComponent;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final f f145977j = new f((byte) 0);
    private final h.h A;
    private final com.bytedance.o.f B;

    /* renamed from: b  reason: collision with root package name */
    final h.h f145978b = h.i.a(h.m.NONE, new b(this));

    /* renamed from: c  reason: collision with root package name */
    final h.h f145979c = h.i.a(h.m.NONE, new c(this));

    /* renamed from: d  reason: collision with root package name */
    public EditCommentStickerViewModel f145980d;

    /* renamed from: e  reason: collision with root package name */
    final h.h.d f145981e = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.infoSticker.i.class);

    /* renamed from: f  reason: collision with root package name */
    public ToolSafeHandler f145982f;

    /* renamed from: g  reason: collision with root package name */
    public FrameLayout f145983g;

    /* renamed from: h  reason: collision with root package name */
    public t<Boolean> f145984h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.e.c<View> f145985i;

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.f.a.a.j f145986k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f145987l = h.i.a((h.f.a.a) new g(this));
    private final h.h t = h.i.a(h.m.NONE, new a(this));
    private final h.h u = h.i.a(h.m.NONE, new d(this));
    private final h.h.d v = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private final h.h.d w = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.lightening.a.a.class);
    private final h.h x;
    private Runnable y;
    private final h.h z;

    static {
        Covode.recordClassIndex(95930);
    }

    private final EditStickerViewModel O() {
        return (EditStickerViewModel) this.x.getValue();
    }

    private final com.bytedance.f.a.a.f P() {
        return (com.bytedance.f.a.a.f) this.A.getValue();
    }

    public final VideoPublishEditModel C() {
        return (VideoPublishEditModel) this.v.a(this, f145976a[0]);
    }

    public final com.ss.android.ugc.gamora.editor.lightening.a.a D() {
        return (com.ss.android.ugc.gamora.editor.lightening.a.a) this.w.a(this, f145976a[2]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a E() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a) this.z.getValue();
    }

    public final EditInfoStickerViewModel a() {
        return (EditInfoStickerViewModel) this.f145987l.getValue();
    }

    public final com.ss.android.ugc.aweme.editSticker.text.als.a b() {
        return (com.ss.android.ugc.aweme.editSticker.text.als.a) this.t.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a d() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.u.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class f {
        static {
            Covode.recordClassIndex(95936);
        }

        private f() {
        }

        public /* synthetic */ f(byte b2) {
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

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void a(String str) {
        h.f.b.l.d(str, "");
        E().a(str);
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void a(VESize vESize) {
        h.f.b.l.d(vESize, "");
        E().q = vESize;
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void a(boolean z2) {
        E().f127186e = z2;
    }

    public static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f145995a;

        /* renamed from: b  reason: collision with root package name */
        private int f145996b = -1;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f145997c = new a(this);

        static {
            Covode.recordClassIndex(95947);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f145998a;

            static {
                Covode.recordClassIndex(95948);
            }

            a(p pVar) {
                this.f145998a = pVar;
            }

            public final void run() {
                int i2 = Build.VERSION.SDK_INT;
            }
        }

        public final void run() {
            int k2;
            Runnable runnable = this.f145997c;
            if (runnable != null) {
                runnable.run();
                this.f145997c = null;
            }
            h.a(this.f145995a).postDelayed(this, 16);
            com.ss.android.ugc.asve.editor.g value = this.f145995a.d().C().getValue();
            if (value != null && this.f145995a.E().f127193l != null && (k2 = value.k()) != this.f145996b) {
                this.f145996b = k2;
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a E = this.f145995a.E();
                long j2 = (long) k2;
                if (E.f127193l instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.d) {
                    ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.d) E.f127193l).setPlayPosition(j2);
                    if (E.f127171c) {
                        ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.d) E.f127193l).s();
                    } else {
                        ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.d) E.f127193l).t();
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(h hVar) {
            this.f145995a = hVar;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void G() {
        E().d();
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void I() {
        E().k();
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void J() {
        E().n();
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final com.ss.android.ugc.aweme.editSticker.interact.d L() {
        return E();
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

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.text.als.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.editSticker.text.als.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.editSticker.text.als.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.editSticker.text.als.a> r1 = com.ss.android.ugc.aweme.editSticker.text.als.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.h.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.poll.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.poll.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.poll.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.poll.a> r1 = com.ss.android.ugc.gamora.editor.sticker.poll.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.h.b.invoke():com.bytedance.als.b");
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.duet.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.duet.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.duet.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.duet.a> r1 = com.ss.android.ugc.gamora.editor.sticker.duet.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.h.c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.h.d.invoke():com.bytedance.als.b");
        }
    }

    public static final class i implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f145990a;

        static {
            Covode.recordClassIndex(95939);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void f() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void e() {
            this.f145990a.C().isCommentDeleted = false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void d() {
            if (this.f145990a.E().b()) {
                if (this.f145990a.C().commentVideoModel.isCommentFromPanel()) {
                    this.f145990a.f145984h.setValue(true);
                }
                h hVar = this.f145990a;
                ((com.ss.android.ugc.aweme.infoSticker.i) hVar.f145981e.a(hVar, h.f145976a[1])).a(this.f145990a.E().f127170b);
                this.f145990a.C().isCommentDeleted = true;
                com.ss.android.ugc.aweme.utils.d.a("prop_delete", new com.ss.android.ugc.tools.f.b().a("shoot_way", "comment_reply").a("sticker_type", "comment_reply").f149193a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(h hVar) {
            this.f145990a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            EditCommentStickerViewModel editCommentStickerViewModel = this.f145990a.f145980d;
            if (editCommentStickerViewModel == null) {
                h.f.b.l.a("editCommentStickerViewModel");
            }
            editCommentStickerViewModel.b(true);
            if (this.f145990a.f145985i != null) {
                com.ss.android.ugc.aweme.tools.e.c<View> cVar = this.f145990a.f145985i;
                if (cVar == null) {
                    h.f.b.l.b();
                }
                cVar.a(view);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b(boolean z) {
            if (z) {
                this.f145990a.a().i();
                ((com.ss.android.ugc.gamora.editor.sticker.poll.a) this.f145990a.f145978b.getValue()).b();
                ((com.ss.android.ugc.gamora.editor.sticker.duet.a) this.f145990a.f145979c.getValue()).b();
                this.f145990a.b().n();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(boolean z) {
            this.f145990a.a().i();
            this.f145990a.b().n();
            if (!z || this.f145990a.M()) {
                this.f145990a.d().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
            } else {
                this.f145990a.d().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
            }
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<com.bytedance.f.a.a.f> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(95950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.f.a.a.f invoke() {
            return new com.bytedance.f.a.a.f(300, this.this$0.E().r);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(95952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(this.this$0.C());
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final InteractStickerStruct H() {
        return E().c();
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final boolean K() {
        return E().b();
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void N() {
        this.f145984h.setValue(false);
    }

    static final class g extends h.f.b.m implements h.f.a.a<EditInfoStickerViewModel> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(95937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditInfoStickerViewModel invoke() {
            Activity activity = this.this$0.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(EditInfoStickerViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final boolean M() {
        EditCommentStickerViewModel editCommentStickerViewModel = this.f145980d;
        if (editCommentStickerViewModel == null) {
            h.f.b.l.a("editCommentStickerViewModel");
        }
        return ((EditCommentStickerState) editCommentStickerViewModel.a(getLifecycleOwner())).getInTimeEditView();
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        com.bytedance.f.a.a.j jVar = this.f145986k;
        if (jVar == null) {
            h.f.b.l.a("gestureService");
        }
        jVar.b(P());
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        if (this.f145982f == null) {
            h.f.b.l.a("safeHandler");
        } else if (this.y == null) {
            h.f.b.l.a("mNonInfoStickerPlayingRefreshTask");
        } else {
            ToolSafeHandler toolSafeHandler = this.f145982f;
            if (toolSafeHandler == null) {
                h.f.b.l.a("safeHandler");
            }
            Runnable runnable = this.y;
            if (runnable == null) {
                h.f.b.l.a("mNonInfoStickerPlayingRefreshTask");
            }
            toolSafeHandler.postDelayed(runnable, 200);
        }
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        if (this.f145982f == null) {
            h.f.b.l.a("safeHandler");
        } else if (this.y == null) {
            h.f.b.l.a("mNonInfoStickerPlayingRefreshTask");
        } else {
            ToolSafeHandler toolSafeHandler = this.f145982f;
            if (toolSafeHandler == null) {
                h.f.b.l.a("safeHandler");
            }
            Runnable runnable = this.y;
            if (runnable == null) {
                h.f.b.l.a("mNonInfoStickerPlayingRefreshTask");
            }
            toolSafeHandler.removeCallbacks(runnable);
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<EditStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(95935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_EditCommentStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_EditCommentStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.h.e.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_EditCommentStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void F() {
        E().a(d().C().getValue(), d());
        List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(C().getMainBusinessContext(), 2, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        if (a2 == null || a2.isEmpty() || C().commentVideoModel == null) {
            List<InteractStickerStruct> a3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(C().getMainBusinessContext(), 5, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
            if (a3 != null && !a3.isEmpty() && C().commentVideoModel != null) {
                E().a(a3.get(0), C().commentVideoModel);
                return;
            }
            return;
        }
        E().a(a2.get(0), C().commentVideoModel);
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void a(com.bytedance.f.a.a.j jVar) {
        h.f.b.l.d(jVar, "");
        this.f145986k = jVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void b(boolean z2) {
        E().f127171c = z2;
    }

    public static final /* synthetic */ ToolSafeHandler a(h hVar) {
        ToolSafeHandler toolSafeHandler = hVar.f145982f;
        if (toolSafeHandler == null) {
            h.f.b.l.a("safeHandler");
        }
        return toolSafeHandler;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f145991a;

        static {
            Covode.recordClassIndex(95941);
        }

        k(h hVar) {
            this.f145991a = hVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (f2 != null) {
                this.f145991a.E().a(f2.floatValue());
            }
        }
    }

    static final class l<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f145992a;

        static {
            Covode.recordClassIndex(95942);
        }

        l(h hVar) {
            this.f145992a = hVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.asve.editor.g gVar = (com.ss.android.ugc.asve.editor.g) obj;
            if (gVar != null) {
                this.f145992a.E().a(gVar, this.f145992a.d());
            }
        }
    }

    static final class r<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f146000a;

        static {
            Covode.recordClassIndex(95951);
        }

        r(h hVar) {
            this.f146000a = hVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            EditCommentStickerViewModel editCommentStickerViewModel = this.f146000a.f145980d;
            if (editCommentStickerViewModel == null) {
                h.f.b.l.a("editCommentStickerViewModel");
            }
            if (bool == null) {
                h.f.b.l.b();
            }
            editCommentStickerViewModel.b(bool.booleanValue());
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void b(String str) {
        h.f.b.l.d(str, "");
        E().f127170b = str;
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void a(com.ss.android.ugc.aweme.editSticker.interact.e eVar) {
        h.f.b.l.d(eVar, "");
        E().f127187f = eVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$h  reason: collision with other inner class name */
    static final class C3896h<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.g f145988a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ab f145989b;

        static {
            Covode.recordClassIndex(95938);
        }

        C3896h(com.ss.android.ugc.asve.editor.g gVar, ab abVar) {
            this.f145988a = gVar;
            this.f145989b = abVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            CommentVideoModel commentVideoModel;
            int i2;
            h.f.b.l.b(iVar, "");
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a aVar = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a) iVar.d();
            if (aVar != null) {
                com.ss.android.ugc.aweme.shortvideo.sticker.d.a aVar2 = aVar.f127181a;
                if (aVar2 != null) {
                    commentVideoModel = aVar2.f130261a;
                } else {
                    commentVideoModel = null;
                }
                int j2 = this.f145988a.j();
                if (commentVideoModel == null || !commentVideoModel.hasTimeData()) {
                    i2 = 0;
                } else {
                    i2 = commentVideoModel.getStartTime();
                    j2 = commentVideoModel.getEndTime();
                }
                StickerItemModel stickerItemModel = new StickerItemModel(UGCMonitor.EVENT_COMMENT, aVar.stickerPath, "", aVar.index, false, i2, j2, 4);
                stickerItemModel.isImageStickerLayer = true;
                this.f145989b.a(stickerItemModel);
            }
            return z.f158842a;
        }
    }

    static final class n<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f145994a;

        static {
            Covode.recordClassIndex(95945);
        }

        n(h hVar) {
            this.f145994a = hVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                com.ss.android.ugc.gamora.editor.lightening.a.a D = this.f145994a.D();
                if (D != null) {
                    com.bytedance.als.l<Boolean> lVar = D.f146017d;
                    if (com.ss.android.ugc.gamora.editor.lightening.a.c(D.b()) || D.b().hasQaSticker.booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    lVar.b(Boolean.valueOf(z));
                    return;
                }
                return;
            }
            com.ss.android.ugc.gamora.editor.lightening.a.a D2 = this.f145994a.D();
            if (D2 != null) {
                D2.f();
            }
        }
    }

    public h(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.B = fVar;
        h.k.c a2 = h.f.b.ab.a(EditStickerViewModel.class);
        this.x = h.i.a((h.f.a.a) new e(this, a2, a2));
        this.f145984h = new t<>();
        this.z = h.i.a((h.f.a.a) new s(this));
        this.A = h.i.a((h.f.a.a) new q(this));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(EditCommentStickerViewModel.class);
        h.f.b.l.b(a2, "");
        EditCommentStickerViewModel editCommentStickerViewModel = (EditCommentStickerViewModel) a2;
        this.f145980d = editCommentStickerViewModel;
        if (editCommentStickerViewModel == null) {
            h.f.b.l.a("editCommentStickerViewModel");
        } else {
            b.a.b(this, editCommentStickerViewModel, i.f146001a, new j(this));
        }
        EditCommentStickerViewModel editCommentStickerViewModel2 = this.f145980d;
        if (editCommentStickerViewModel2 == null) {
            h.f.b.l.a("editCommentStickerViewModel");
        } else {
            t<Float> b2 = editCommentStickerViewModel2.b();
            if (b2 != null) {
                b2.observe(this, new k(this));
            }
        }
        d().C().observe(this, new l(this));
        selectNonNullSubscribe(O(), j.f146002a, new ah(), new m(this));
        this.f145984h.observe(this, new n(this));
        EditCommentStickerViewModel editCommentStickerViewModel3 = this.f145980d;
        if (editCommentStickerViewModel3 == null) {
            h.f.b.l.a("editCommentStickerViewModel");
        }
        b.a.b(this, editCommentStickerViewModel3, k.f146003a, new o(this));
        E().n = new i(this);
        O().n().observe(this, new r(this));
        EditCommentStickerViewModel editCommentStickerViewModel4 = this.f145980d;
        if (editCommentStickerViewModel4 == null) {
            h.f.b.l.a("editCommentStickerViewModel");
        }
        t<Boolean> n2 = O().n();
        h.f.b.l.d(n2, "");
        editCommentStickerViewModel4.f145648a = n2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f145982f = new ToolSafeHandler((androidx.fragment.app.e) activity2);
        this.y = new p(this);
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void a(com.ss.android.ugc.aweme.tools.e.a<com.ss.android.ugc.aweme.editSticker.interact.view.g, com.ss.android.ugc.aweme.editSticker.interact.view.g> aVar) {
        h.f.b.l.d(aVar, "");
        E().y = aVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void a(com.ss.android.ugc.aweme.tools.e.c<View> cVar) {
        h.f.b.l.d(cVar, "");
        this.f145985i = cVar;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(95940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(h hVar) {
            super(2);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.E().n();
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(95946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(h hVar) {
            super(2);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.E().d();
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(95943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(h hVar) {
            super(2);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.k kVar) {
            com.bytedance.jedi.arch.k kVar2 = kVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(kVar2, "");
            boolean booleanValue = kVar2.f39404b.booleanValue();
            this.this$0.E().x = !booleanValue;
            if (booleanValue) {
                this.this$0.E().a(new com.ss.android.ugc.aweme.editSticker.c.b(this) {
                    /* class com.ss.android.ugc.gamora.editor.h.m.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ m f145993a;

                    static {
                        Covode.recordClassIndex(95944);
                    }

                    @Override // com.ss.android.ugc.aweme.editSticker.c.b
                    public final boolean a() {
                        this.f145993a.this$0.E().i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f145993a = r1;
                    }
                });
            } else {
                this.this$0.E().a(com.ss.android.ugc.aweme.editSticker.c.a.f88100a);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.i(3860);
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        E().s = false;
        com.ss.android.ugc.asve.editor.g value = d().C().getValue();
        if (value != null) {
            E().q = value.b();
            E().a(this.f42913m, frameLayout);
            com.bytedance.f.a.a.j jVar = this.f145986k;
            if (jVar == null) {
                h.f.b.l.a("gestureService");
            }
            jVar.a(P());
        }
        this.f145983g = frameLayout;
        View view = new View(frameLayout.getContext());
        MethodCollector.o(3860);
        return view;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.b
    public final b.i<z> a(com.ss.android.ugc.asve.editor.g gVar, ab abVar, h.f.a.b<? super String, String> bVar) {
        String str;
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(abVar, "");
        if (E().b()) {
            if (bVar == null || (str = bVar.invoke("comment_sticker")) == null) {
                str = E().p();
                h.f.b.l.b(str, "");
            }
            int a2 = abVar.T().a();
            int b2 = abVar.T().b();
            int i2 = gVar.b().width;
            int i3 = gVar.b().height;
            h.f.b.l.d(str, "");
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a E = E();
            if (E.f127193l instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.d) {
                ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.d) E.f127193l).s();
            }
            b.i<TContinuationResult> c2 = E.a(str, a2, b2, i2, i3).c(new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.c(E));
            h.f.b.l.b(c2, "");
            b.i<TContinuationResult> c3 = c2.c(new C3896h(gVar, abVar), b.i.f4826c);
            h.f.b.l.b(c3, "");
            return c3;
        }
        b.i<z> a3 = b.i.a((Object) null);
        h.f.b.l.b(a3, "");
        return a3;
    }

    @Override // com.ss.android.ugc.gamora.editor.aa
    public final void a(CommentVideoModel commentVideoModel, boolean z2, boolean z3) {
        h.f.b.l.d(commentVideoModel, "");
        IEffectPlatformFactory a2 = EffectPlatformFactory.a();
        EffectPlatformBuilder context = new EffectPlatformBuilder().setContext(q());
        h.f.b.l.b(context, "");
        EffectConfiguration build = a2.createEffectConfigurationBuilder(context).build();
        E().a(d().C().getValue(), d());
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a E = E();
        StringBuilder sb = new StringBuilder();
        h.f.b.l.b(build, "");
        File effectDir = build.getEffectDir();
        h.f.b.l.b(effectDir, "");
        E.a(sb.append(effectDir.getAbsolutePath()).append("/comment_sticker").toString());
        E().a(commentVideoModel, z2, z3);
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a E2 = E();
        if (E2.f127193l instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.d) {
            ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.d) E2.f127193l).a(E2.f127169a, (com.ss.android.ugc.aweme.z.c) null);
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
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
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
