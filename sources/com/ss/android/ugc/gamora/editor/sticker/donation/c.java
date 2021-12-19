package com.ss.android.ugc.gamora.editor.sticker.donation;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
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
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerState;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.gamora.editor.EditHashTagStickerViewModel;
import com.ss.android.ugc.gamora.editor.EditMentionStickerViewModel;
import com.ss.android.ugc.gamora.editor.ab;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.vesdk.VESize;
import h.f.b.y;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a, h {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146533a = {new y(c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};
    public static final h t = new h((byte) 0);
    private Runnable A;
    private final h.h B;
    private final h.h C;
    private final com.bytedance.o.f D;

    /* renamed from: b  reason: collision with root package name */
    final h.h f146534b = h.i.a(h.m.NONE, new g(this));

    /* renamed from: c  reason: collision with root package name */
    final h.h f146535c = h.i.a(h.m.NONE, new a(this));

    /* renamed from: d  reason: collision with root package name */
    final h.h f146536d = h.i.a(h.m.NONE, new b(this));

    /* renamed from: e  reason: collision with root package name */
    public EditDonationStickerViewModel f146537e;

    /* renamed from: f  reason: collision with root package name */
    public EditMentionStickerViewModel f146538f;

    /* renamed from: g  reason: collision with root package name */
    public EditHashTagStickerViewModel f146539g;

    /* renamed from: h  reason: collision with root package name */
    final h.h.d f146540h = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.infoSticker.i.class);

    /* renamed from: i  reason: collision with root package name */
    public ToolSafeHandler f146541i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.e.c<View> f146542j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f146543k;

    /* renamed from: l  reason: collision with root package name */
    public ab f146544l;
    private com.bytedance.f.a.a.j u;
    private final h.h v = h.i.a(h.m.NONE, new C3922c(this));
    private final h.h w = h.i.a(h.m.NONE, new d(this));
    private final h.h x = h.i.a(h.m.NONE, new e(this));
    private final h.h.d y = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private final h.h z;

    static {
        Covode.recordClassIndex(96421);
    }

    private final VideoPublishEditModel M() {
        return (VideoPublishEditModel) this.y.a(this, f146533a[0]);
    }

    private final EditStickerViewModel N() {
        return (EditStickerViewModel) this.z.getValue();
    }

    private final com.bytedance.f.a.a.f O() {
        return (com.bytedance.f.a.a.f) this.C.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b C() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b) this.B.getValue();
    }

    public final com.ss.android.ugc.aweme.editSticker.text.als.a a() {
        return (com.ss.android.ugc.aweme.editSticker.text.als.a) this.v.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.info.a b() {
        return (com.ss.android.ugc.gamora.editor.sticker.info.a) this.w.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a d() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.x.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class h {
        static {
            Covode.recordClassIndex(96429);
        }

        private h() {
        }

        public /* synthetic */ h(byte b2) {
            this();
        }
    }

    public static final class j implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146556a;

        static {
            Covode.recordClassIndex(96431);
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
            c cVar = this.f146556a;
            Activity activity = cVar.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            androidx.fragment.app.i supportFragmentManager = ((androidx.fragment.app.e) activity).getSupportFragmentManager();
            h.f.b.l.b(supportFragmentManager, "");
            cVar.a(supportFragmentManager);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void d() {
            c cVar = this.f146556a;
            ((com.ss.android.ugc.aweme.infoSticker.i) cVar.f146540h.a(cVar, c.f146533a[1])).a(this.f146556a.C().f127223b);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(c cVar) {
            this.f146556a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            c.a(this.f146556a).a(true);
            if (this.f146556a.f146542j != null) {
                com.ss.android.ugc.aweme.tools.e.c<View> cVar = this.f146556a.f146542j;
                if (cVar == null) {
                    h.f.b.l.b();
                }
                cVar.a(view);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void a(boolean z) {
            this.f146556a.b().i();
            this.f146556a.a().n();
            if (!z || this.f146556a.L()) {
                this.f146556a.d().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
            } else {
                this.f146556a.d().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a
        public final void b(boolean z) {
            if (z) {
                EditHashTagStickerViewModel editHashTagStickerViewModel = this.f146556a.f146539g;
                if (editHashTagStickerViewModel == null) {
                    h.f.b.l.a("editHashTagStickerViewModel");
                }
                editHashTagStickerViewModel.b();
                EditMentionStickerViewModel editMentionStickerViewModel = this.f146556a.f146538f;
                if (editMentionStickerViewModel == null) {
                    h.f.b.l.a("editMentionStickerViewModel");
                }
                editMentionStickerViewModel.b();
                this.f146556a.b().i();
                ((com.ss.android.ugc.gamora.editor.sticker.poll.a) this.f146556a.f146535c.getValue()).b();
                ((com.ss.android.ugc.gamora.editor.sticker.duet.a) this.f146556a.f146536d.getValue()).b();
                this.f146556a.a().n();
            }
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.D;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void a(String str) {
        h.f.b.l.d(str, "");
        C().a(str);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void a(VESize vESize) {
        h.f.b.l.d(vESize, "");
        C().q = vESize;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void a(boolean z2) {
        C().f127186e = z2;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void a(ab abVar) {
        h.f.b.l.d(abVar, "");
        this.f146544l = abVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final boolean a(View view) {
        h.f.b.l.d(view, "");
        return view instanceof DonationStickerView;
    }

    public static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146561a;

        /* renamed from: b  reason: collision with root package name */
        private int f146562b = -1;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f146563c = new a(this);

        static {
            Covode.recordClassIndex(96438);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f146564a;

            static {
                Covode.recordClassIndex(96439);
            }

            a(p pVar) {
                this.f146564a = pVar;
            }

            public final void run() {
                int i2 = Build.VERSION.SDK_INT;
            }
        }

        public final void run() {
            int k2;
            Runnable runnable = this.f146563c;
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d dVar = null;
            if (runnable != null) {
                runnable.run();
                this.f146563c = null;
            }
            c.b(this.f146561a).postDelayed(this, 16);
            com.ss.android.ugc.asve.editor.g value = this.f146561a.d().C().getValue();
            if (value != null && this.f146561a.D() && (k2 = value.k()) != this.f146562b) {
                this.f146562b = k2;
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b C = this.f146561a.C();
                long j2 = (long) k2;
                com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = C.f127193l;
                if (!(gVar instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d)) {
                    gVar = null;
                }
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d dVar2 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d) gVar;
                if (dVar2 != null) {
                    dVar2.setPlayPosition(j2);
                }
                if (C.f127224c) {
                    com.ss.android.ugc.aweme.editSticker.interact.view.g gVar2 = C.f127193l;
                    if (gVar2 instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d) {
                        dVar = gVar2;
                    }
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d dVar3 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d) dVar;
                    if (dVar3 != null) {
                        dVar3.r();
                        return;
                    }
                    return;
                }
                com.ss.android.ugc.aweme.editSticker.interact.view.g gVar3 = C.f127193l;
                if (gVar3 instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d) {
                    dVar = gVar3;
                }
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d dVar4 = dVar;
                if (dVar4 != null && dVar4.q.b()) {
                    dVar4.post(new d.a(dVar4));
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(c cVar) {
            this.f146561a = cVar;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f146567a = new s();

        static {
            Covode.recordClassIndex(96443);
        }

        s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void H() {
        C().d();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void I() {
        C().k();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void J() {
        C().n();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final com.ss.android.ugc.aweme.editSticker.interact.d K() {
        return C();
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

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.poll.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96422);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.donation.c.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.duet.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.donation.c.b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$c  reason: collision with other inner class name */
    public static final class C3922c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.text.als.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3922c(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.donation.c.C3922c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.info.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.info.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.info.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.info.a> r1 = com.ss.android.ugc.gamora.editor.sticker.info.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.donation.c.d.invoke():com.bytedance.als.b");
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.donation.c.e.invoke():com.bytedance.als.b");
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.panel.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(96428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.panel.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.panel.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.panel.a> r1 = com.ss.android.ugc.gamora.editor.sticker.panel.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.donation.c.g.invoke():com.bytedance.als.b");
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<com.bytedance.f.a.a.f> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.f.a.a.f invoke() {
            return new com.bytedance.f.a.a.f(300, this.this$0.C().r);
        }
    }

    public final boolean D() {
        if (C().f127193l != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final InteractStickerStruct E() {
        return C().c();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final boolean F() {
        return C().b();
    }

    public static final class r implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146566a;

        static {
            Covode.recordClassIndex(96442);
        }

        @Override // com.ss.android.ugc.gamora.editor.sticker.donation.i
        public final void a() {
            c cVar = this.f146566a;
            cVar.d().a(false);
            com.ss.android.ugc.asve.editor.g value = cVar.d().C().getValue();
            if (value != null) {
                value.t();
            }
        }

        @Override // com.ss.android.ugc.gamora.editor.sticker.donation.i
        public final void b() {
            c cVar = this.f146566a;
            cVar.d().a(true);
            com.ss.android.ugc.asve.editor.g value = cVar.d().C().getValue();
            if (value != null) {
                value.u();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(c cVar) {
            this.f146566a = cVar;
        }

        @Override // com.ss.android.ugc.gamora.editor.sticker.donation.i
        public final void a(com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar) {
            String str;
            com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar2;
            h.f.b.l.d(bVar, "");
            com.ss.android.ugc.gamora.editor.sticker.panel.a aVar = (com.ss.android.ugc.gamora.editor.sticker.panel.a) this.f146566a.f146534b.getValue();
            if (aVar != null) {
                aVar.a((com.ss.android.ugc.gamora.editor.sticker.panel.a) false, (boolean) "click_button");
            }
            if (this.f146566a.D()) {
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b C = this.f146566a.C();
                h.f.b.l.d(bVar, "");
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d dVar = null;
                if (bVar.getAddTime() == null) {
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c cVar = C.f127222a;
                    if (cVar == null || (bVar2 = cVar.f127228a) == null) {
                        str = null;
                    } else {
                        str = bVar2.getAddTime();
                    }
                    bVar.setAddTime(str);
                }
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c cVar2 = C.f127222a;
                if (cVar2 != null) {
                    cVar2.f127228a = bVar;
                }
                com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = C.f127193l;
                if (gVar instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d) {
                    dVar = gVar;
                }
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d dVar2 = dVar;
                if (dVar2 != null) {
                    h.f.b.l.d(bVar, "");
                    dVar2.q.a(bVar);
                    return;
                }
                return;
            }
            c cVar3 = this.f146566a;
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c cVar4 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c(bVar, 14);
            cVar3.C().a(cVar3.d().C().getValue(), cVar3.d());
            cVar3.C().a(cVar4, true, false);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final boolean L() {
        EditDonationStickerViewModel editDonationStickerViewModel = this.f146537e;
        if (editDonationStickerViewModel == null) {
            h.f.b.l.a("donationStickerViewModel");
        }
        return ((EditDonationStickerState) editDonationStickerViewModel.a(getLifecycleOwner())).getInTimeEditView();
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        com.bytedance.f.a.a.j jVar = this.u;
        if (jVar == null) {
            h.f.b.l.a("gestureService");
        }
        jVar.b(O());
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        ToolSafeHandler toolSafeHandler = this.f146541i;
        if (toolSafeHandler == null) {
            h.f.b.l.a("safeHandler");
        }
        Runnable runnable = this.A;
        if (runnable == null) {
            h.f.b.l.a("mNonInfoStickerPlayingRefreshTask");
        }
        toolSafeHandler.postDelayed(runnable, 200);
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        ToolSafeHandler toolSafeHandler = this.f146541i;
        if (toolSafeHandler == null) {
            h.f.b.l.a("safeHandler");
        }
        Runnable runnable = this.A;
        if (runnable == null) {
            h.f.b.l.a("mNonInfoStickerPlayingRefreshTask");
        }
        toolSafeHandler.removeCallbacks(runnable);
    }

    public static final class f extends h.f.b.m implements h.f.a.a<EditStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_donation_EditDonationStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_donation_EditDonationStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.donation.c.f.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_sticker_donation_EditDonationStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void G() {
        List<StickerItemModel> list;
        C().a(d().C().getValue(), d());
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c cVar = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c(null, 15);
        List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(M().getMainBusinessContext(), 4, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        InfoStickerModel infoStickerModel = M().infoStickerModel;
        if (!(infoStickerModel == null || (list = infoStickerModel.stickers) == null)) {
            Iterator<StickerItemModel> it = list.iterator();
            while (it.hasNext()) {
                StickerItemModel next = it.next();
                if (next.type == 7) {
                    cVar.f127228a = (com.ss.android.ugc.gamora.editor.sticker.donation.c.b) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(next.extra, com.ss.android.ugc.gamora.editor.sticker.donation.c.c.class);
                    cVar.f127230c = next.startTime;
                    cVar.f127231d = next.endTime;
                    C().a(next.path);
                    C().f127223b = next.stickerId;
                    it.remove();
                }
            }
        }
        if (a2 != null && !a2.isEmpty() && cVar.f127228a != null) {
            cVar.f127229b = a2.get(0);
            C().a(cVar, false, true);
            C().a(a2.get(0));
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void a(com.bytedance.f.a.a.j jVar) {
        h.f.b.l.d(jVar, "");
        this.u = jVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final boolean b(View view) {
        h.f.b.l.d(view, "");
        return view instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d;
    }

    public static final /* synthetic */ EditDonationStickerViewModel a(c cVar) {
        EditDonationStickerViewModel editDonationStickerViewModel = cVar.f146537e;
        if (editDonationStickerViewModel == null) {
            h.f.b.l.a("donationStickerViewModel");
        }
        return editDonationStickerViewModel;
    }

    public static final /* synthetic */ ToolSafeHandler b(c cVar) {
        ToolSafeHandler toolSafeHandler = cVar.f146541i;
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
        final /* synthetic */ c f146557a;

        static {
            Covode.recordClassIndex(96432);
        }

        k(c cVar) {
            this.f146557a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.asve.editor.g gVar = (com.ss.android.ugc.asve.editor.g) obj;
            if (gVar != null) {
                this.f146557a.C().a(gVar, this.f146557a.d());
            }
        }
    }

    static final class m<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146558a;

        static {
            Covode.recordClassIndex(96434);
        }

        m(c cVar) {
            this.f146558a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (f2 != null) {
                this.f146558a.C().a(f2.floatValue());
            }
        }
    }

    static final class n<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146559a;

        static {
            Covode.recordClassIndex(96435);
        }

        n(c cVar) {
            this.f146559a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            EditDonationStickerViewModel a2 = c.a(this.f146559a);
            if (bool == null) {
                h.f.b.l.b();
            }
            a2.a(bool.booleanValue());
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void a(com.ss.android.ugc.aweme.editSticker.interact.e eVar) {
        h.f.b.l.d(eVar, "");
        C().f127187f = eVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void b(String str) {
        h.f.b.l.d(str, "");
        C().f127223b = str;
    }

    static final class i<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.g f146554b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ab f146555c;

        static {
            Covode.recordClassIndex(96430);
        }

        i(c cVar, com.ss.android.ugc.asve.editor.g gVar, ab abVar) {
            this.f146553a = cVar;
            this.f146554b = gVar;
            this.f146555c = abVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            int i2;
            String str = "";
            h.f.b.l.b(iVar, str);
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.a aVar = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.a) iVar.d();
            if (aVar != null) {
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c cVar = aVar.f127221a;
                String b2 = com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(cVar.f127228a);
                int j2 = this.f146554b.j();
                if (cVar.f127231d != 0) {
                    i2 = cVar.f127230c;
                    j2 = cVar.f127231d;
                } else {
                    i2 = 0;
                }
                String str2 = this.f146553a.C().f127223b;
                if (str2 != null) {
                    str = str2;
                }
                StickerItemModel stickerItemModel = new StickerItemModel(str, aVar.stickerPath, b2, aVar.index, false, i2, j2, 7);
                stickerItemModel.isImageStickerLayer = true;
                this.f146555c.a(stickerItemModel);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void b(boolean z2) {
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b C2 = C();
        C2.f127224c = z2;
        if (C2.f127224c) {
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = C2.f127193l;
            if (!(gVar instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d)) {
                gVar = null;
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d dVar = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d) gVar;
            if (dVar != null) {
                dVar.r();
            }
        }
    }

    public c(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.D = fVar;
        h.k.c a2 = h.f.b.ab.a(EditStickerViewModel.class);
        this.z = h.i.a((h.f.a.a) new f(this, a2, a2));
        this.B = h.i.a((h.f.a.a) s.f146567a);
        this.C = h.i.a((h.f.a.a) new q(this));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditDonationStickerViewModel.class);
        h.f.b.l.b(a2, "");
        this.f146537e = (EditDonationStickerViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity2).a(EditMentionStickerViewModel.class);
        h.f.b.l.b(a3, "");
        this.f146538f = (EditMentionStickerViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = t.a((androidx.fragment.app.e) activity3).a(EditHashTagStickerViewModel.class);
        h.f.b.l.b(a4, "");
        this.f146539g = (EditHashTagStickerViewModel) a4;
        d().C().observe(this, new k(this));
        EditDonationStickerViewModel editDonationStickerViewModel = this.f146537e;
        if (editDonationStickerViewModel == null) {
            h.f.b.l.a("donationStickerViewModel");
        }
        b.a.b(this, editDonationStickerViewModel, d.f146568a, new l(this));
        EditDonationStickerViewModel editDonationStickerViewModel2 = this.f146537e;
        if (editDonationStickerViewModel2 == null) {
            h.f.b.l.a("donationStickerViewModel");
        }
        editDonationStickerViewModel2.a().observe(this, new m(this));
        N().n().observe(this, new n(this));
        EditDonationStickerViewModel editDonationStickerViewModel3 = this.f146537e;
        if (editDonationStickerViewModel3 == null) {
            h.f.b.l.a("donationStickerViewModel");
        }
        androidx.lifecycle.t<Boolean> n2 = N().n();
        h.f.b.l.d(n2, "");
        editDonationStickerViewModel3.f127217a = n2;
        selectNonNullSubscribe(N(), e.f146569a, new ah(), new o(this));
        C().n = new j(this);
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f146541i = new ToolSafeHandler((androidx.fragment.app.e) activity4);
        this.A = new p(this);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void a(androidx.fragment.app.i iVar) {
        h.f.b.l.d(iVar, "");
        b bVar = new b(M().mShootWay, M().creationId, bl.b(M()), bl.a(M()));
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(bVar, "");
        Fragment a2 = iVar.a("EditSelectDonationOrganizationDialogFragment");
        if (!(a2 instanceof f)) {
            a2 = null;
        }
        f fVar = (f) a2;
        if (fVar == null) {
            fVar = new f();
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("mob_params", bVar);
        fVar.setArguments(bundle);
        if (!fVar.isAdded()) {
            iVar.a().a(fVar, "EditSelectDonationOrganizationDialogFragment").c();
        }
        fVar.f146571a = new r(this);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void a(com.ss.android.ugc.aweme.tools.e.a<com.ss.android.ugc.aweme.editSticker.interact.view.g, com.ss.android.ugc.aweme.editSticker.interact.view.g> aVar) {
        h.f.b.l.d(aVar, "");
        C().y = aVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.h
    public final void a(com.ss.android.ugc.aweme.tools.e.c<View> cVar) {
        h.f.b.l.d(cVar, "");
        this.f146542j = cVar;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96433);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.C().n();
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(c cVar) {
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
            this.this$0.C().x = !booleanValue;
            if (booleanValue) {
                this.this$0.C().a(new com.ss.android.ugc.aweme.editSticker.c.b(this) {
                    /* class com.ss.android.ugc.gamora.editor.sticker.donation.c.o.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ o f146560a;

                    static {
                        Covode.recordClassIndex(96437);
                    }

                    @Override // com.ss.android.ugc.aweme.editSticker.c.b
                    public final boolean a() {
                        this.f146560a.this$0.C().i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f146560a = r1;
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
        MethodCollector.i(3286);
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        C().s = false;
        com.ss.android.ugc.asve.editor.g value = d().C().getValue();
        if (value != null) {
            C().q = value.b();
            C().a(this.f42913m, frameLayout);
            com.bytedance.f.a.a.j jVar = this.u;
            if (jVar == null) {
                h.f.b.l.a("gestureService");
            }
            jVar.a(O());
        }
        this.f146543k = frameLayout;
        View view = new View(layoutInflater.getContext());
        MethodCollector.o(3286);
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
        if (C().b()) {
            if (bVar == null || (str = bVar.invoke("donation_sticker")) == null) {
                str = C().p();
            }
            h.f.b.l.b(str, "");
            int a2 = abVar.T().a();
            int b2 = abVar.T().b();
            int i2 = gVar.b().width;
            int i3 = gVar.b().height;
            h.f.b.l.d(str, "");
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b C2 = C();
            h.f.b.l.d(str, "");
            b.i<TContinuationResult> c2 = C2.a(str, a2, b2, i2, i3).c(new b.C3303b(C2));
            h.f.b.l.b(c2, "");
            b.i<TContinuationResult> c3 = c2.c(new i(this, gVar, abVar), b.i.f4826c);
            h.f.b.l.b(c3, "");
            return c3;
        }
        b.i<z> a3 = b.i.a(z.f158842a);
        h.f.b.l.b(a3, "");
        return a3;
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
