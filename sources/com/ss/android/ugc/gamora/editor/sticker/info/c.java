package com.ss.android.ugc.gamora.editor.sticker.info;

import android.app.Activity;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
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
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.ss.android.ugc.gamora.editor.EditHashTagStickerViewModel;
import com.ss.android.ugc.gamora.editor.EditMentionStickerViewModel;
import com.ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.ss.android.ugc.gamora.editor.progress.EditProgressViewModel;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.z;
import java.util.List;
import java.util.Objects;

public final class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146650a = {new y(c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final h f146651l = new h((byte) 0);
    private final h.h A;
    private final h.h B;
    private final com.bytedance.o.f C;

    /* renamed from: b  reason: collision with root package name */
    final h.h.d f146652b = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.infoSticker.i.class);

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.f.a.a.j f146653c;

    /* renamed from: d  reason: collision with root package name */
    final h.h f146654d = h.i.a(h.m.NONE, new g(this));

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f146655e;

    /* renamed from: f  reason: collision with root package name */
    public EditCommentStickerViewModel f146656f;

    /* renamed from: g  reason: collision with root package name */
    public EditTextStickerViewModel f146657g;

    /* renamed from: h  reason: collision with root package name */
    public EditDonationStickerViewModel f146658h;

    /* renamed from: i  reason: collision with root package name */
    public EditMentionStickerViewModel f146659i;

    /* renamed from: j  reason: collision with root package name */
    public EditHashTagStickerViewModel f146660j;

    /* renamed from: k  reason: collision with root package name */
    public EditStickerViewModel f146661k;
    private final h.h.d t = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private final h.h u = h.i.a(h.m.NONE, new a(this));
    private final h.h v;
    private final h.h w;
    private final h.h x;
    private final h.h y;
    private final h.h z;

    static {
        Covode.recordClassIndex(96523);
    }

    private final EditInfoStickerViewModel F() {
        return (EditInfoStickerViewModel) this.v.getValue();
    }

    private final com.bytedance.f.a.a.f G() {
        return (com.bytedance.f.a.a.f) this.A.getValue();
    }

    public static float a(boolean z2) {
        return z2 ? 1.0f : 0.3137255f;
    }

    public final com.ss.android.ugc.gamora.editor.sticker.duet.a C() {
        return (com.ss.android.ugc.gamora.editor.sticker.duet.a) this.y.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.livecd.a D() {
        return (com.ss.android.ugc.gamora.editor.sticker.livecd.a) this.z.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i) this.B.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a a() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.u.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.poll.a b() {
        return (com.ss.android.ugc.gamora.editor.sticker.poll.a) this.w.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.qa.a d() {
        return (com.ss.android.ugc.gamora.editor.sticker.qa.a) this.x.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class h {
        static {
            Covode.recordClassIndex(96531);
        }

        private h() {
        }

        public /* synthetic */ h(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.C;
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
            Covode.recordClassIndex(96524);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.info.c.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.poll.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96525);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.info.c.b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$c  reason: collision with other inner class name */
    public static final class C3927c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.qa.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3927c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.qa.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.qa.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.qa.a> r1 = com.ss.android.ugc.gamora.editor.sticker.qa.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.info.c.C3927c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.duet.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.info.c.d.invoke():com.bytedance.als.b");
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.livecd.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.livecd.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.livecd.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.livecd.a> r1 = com.ss.android.ugc.gamora.editor.sticker.livecd.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.info.c.e.invoke():com.bytedance.als.b");
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.progressbar.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(96530);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.progressbar.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.progressbar.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progressbar.a> r1 = com.ss.android.ugc.gamora.editor.progressbar.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.info.c.g.invoke():com.bytedance.als.b");
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.bytedance.f.a.a.f> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96532);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.f.a.a.f invoke() {
            InfoStickerEditView infoStickerEditView = this.this$0.E().f127155d;
            h.f.b.l.b(infoStickerEditView, "");
            return new com.bytedance.f.a.a.f(100, infoStickerEditView.getGestureListener());
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96545);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i(this.this$0.a(), (com.ss.android.ugc.gamora.editor.progressbar.a) this.this$0.f146654d.getValue());
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        com.bytedance.f.a.a.j jVar = this.f146653c;
        if (jVar == null) {
            h.f.b.l.a("gestureService");
        }
        jVar.b(G());
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = E();
        if (E.z != null) {
            E.z.b();
        }
    }

    static final class m implements com.ss.android.ugc.aweme.editSticker.interact.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146665a;

        static {
            Covode.recordClassIndex(96536);
        }

        m(c cVar) {
            this.f146665a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.interact.a.b
        public final void a() {
            this.f146665a.b().b();
            this.f146665a.C().b();
            c.b(this.f146665a).n();
            c.c(this.f146665a).a();
            c.d(this.f146665a).b();
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<EditInfoStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_info_EditInfoStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_info_EditInfoStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.info.c.f.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_sticker_info_EditInfoStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class j implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146662a;

        static {
            Covode.recordClassIndex(96533);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(c cVar) {
            this.f146662a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a
        public final void b(StickerItemModel stickerItemModel) {
            h.f.b.l.d(stickerItemModel, "");
            this.f146662a.E().u.infoStickerModel.removeSticker(stickerItemModel);
            c cVar = this.f146662a;
            ((com.ss.android.ugc.aweme.infoSticker.i) cVar.f146652b.a(cVar, c.f146650a[1])).a(stickerItemModel.stickerId);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a
        public final void a(StickerItemModel stickerItemModel) {
            h.f.b.l.d(stickerItemModel, "");
            if (this.f146662a.E().u.infoStickerModel == null) {
                this.f146662a.E().u.infoStickerModel = new InfoStickerModel(this.f146662a.E().u.draftDir());
            }
            com.ss.android.ugc.tools.utils.q.d("add infoSticker " + stickerItemModel.getId());
            this.f146662a.E().u.infoStickerModel.addSticker(stickerItemModel);
        }
    }

    public static final class k implements i.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146663a;

        static {
            Covode.recordClassIndex(96534);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.c
        public final int a(aj ajVar, boolean z, boolean z2) {
            h.f.b.l.d(ajVar, "");
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(c cVar) {
            this.f146663a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.c
        public final Float a(float f2) {
            return Float.valueOf(f2);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.c
        public final PointF a(aj ajVar, float f2, float f3) {
            h.f.b.l.d(ajVar, "");
            return new PointF();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.c
        public final void a(aj ajVar, int i2, int i3, boolean z, boolean z2) {
            h.f.b.l.d(ajVar, "");
            if (h.f.b.l.a((Object) c.a(this.f146663a).n().getValue(), (Object) true) || h.f.b.l.a((Object) c.a(this.f146663a).o().getValue(), (Object) true)) {
                if (this.f146663a.E().K != null) {
                    this.f146663a.E().g();
                }
            } else if (z) {
                this.f146663a.a().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
            } else {
                this.f146663a.a().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
                this.f146663a.E().j();
                this.f146663a.b().b();
                this.f146663a.C().b();
                c.b(this.f146663a).n();
                c.c(this.f146663a).a();
                c.d(this.f146663a).b();
                c.e(this.f146663a).b();
                c.f(this.f146663a).b();
            }
        }
    }

    public static final class l implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146664a;

        static {
            Covode.recordClassIndex(96535);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(c cVar) {
            this.f146664a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.a
        public final void b(boolean z) {
            this.f146664a.b().a(c.a(z));
            this.f146664a.C().a(c.a(z));
            this.f146664a.d().a(c.a(z));
            this.f146664a.D().a(c.a(z));
            c.b(this.f146664a).a(c.a(z));
            c.c(this.f146664a).a(c.a(z));
            c.d(this.f146664a).a(c.a(z));
            c.f(this.f146664a).a(c.a(z));
            c.e(this.f146664a).a(c.a(z));
            if (!z) {
                com.ss.android.ugc.aweme.editSticker.interact.c cVar = this.f146664a.E().K;
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e eVar = null;
                if (!(cVar instanceof com.ss.android.ugc.aweme.editSticker.text.view.q)) {
                    cVar = null;
                }
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar = (com.ss.android.ugc.aweme.editSticker.text.view.q) cVar;
                if (qVar != null) {
                    qVar.a(c.a(true), false);
                }
                com.ss.android.ugc.aweme.editSticker.interact.c cVar2 = this.f146664a.E().K;
                if (!(cVar2 instanceof CommentStickerView)) {
                    cVar2 = null;
                }
                CommentStickerView commentStickerView = (CommentStickerView) cVar2;
                if (commentStickerView != null) {
                    commentStickerView.setAlpha(c.a(true));
                }
                com.ss.android.ugc.aweme.editSticker.interact.c cVar3 = this.f146664a.E().K;
                if (cVar3 instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e) {
                    eVar = cVar3;
                }
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.a(c.a(true));
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.a
        public final void a(boolean z) {
            this.f146664a.b().a(c.a(!z));
            this.f146664a.b().a(!z);
            this.f146664a.C().a(c.a(!z));
            this.f146664a.C().a(!z);
            this.f146664a.d().a(c.a(!z));
            this.f146664a.d().a(!z);
            this.f146664a.D().a(c.a(!z));
            this.f146664a.D().a(!z);
            c.b(this.f146664a).a(c.a(!z));
            c.c(this.f146664a).a(c.a(!z));
            c.d(this.f146664a).a(c.a(!z));
            c.e(this.f146664a).a(c.a(!z));
            c.e(this.f146664a).c(new EditHashTagStickerViewModel.a(!z));
            c.f(this.f146664a).a(c.a(!z));
            c.f(this.f146664a).c(new EditMentionStickerViewModel.a(!z));
            if (z) {
                com.ss.android.ugc.aweme.editSticker.interact.c cVar = this.f146664a.E().K;
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e eVar = null;
                if (!(cVar instanceof com.ss.android.ugc.aweme.editSticker.text.view.q)) {
                    cVar = null;
                }
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar = (com.ss.android.ugc.aweme.editSticker.text.view.q) cVar;
                if (qVar != null) {
                    qVar.a(c.a(true), false);
                }
                com.ss.android.ugc.aweme.editSticker.interact.c cVar2 = this.f146664a.E().K;
                if (!(cVar2 instanceof CommentStickerView)) {
                    cVar2 = null;
                }
                CommentStickerView commentStickerView = (CommentStickerView) cVar2;
                if (commentStickerView != null) {
                    commentStickerView.setAlpha(c.a(true));
                }
                com.ss.android.ugc.aweme.editSticker.interact.c cVar3 = this.f146664a.E().K;
                if (cVar3 instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e) {
                    eVar = cVar3;
                }
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.a(c.a(true));
                }
            }
        }
    }

    public static final /* synthetic */ EditTextStickerViewModel b(c cVar) {
        EditTextStickerViewModel editTextStickerViewModel = cVar.f146657g;
        if (editTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    public static final /* synthetic */ EditCommentStickerViewModel c(c cVar) {
        EditCommentStickerViewModel editCommentStickerViewModel = cVar.f146656f;
        if (editCommentStickerViewModel == null) {
            h.f.b.l.a("commentStickerViewModel");
        }
        return editCommentStickerViewModel;
    }

    public static final /* synthetic */ EditDonationStickerViewModel d(c cVar) {
        EditDonationStickerViewModel editDonationStickerViewModel = cVar.f146658h;
        if (editDonationStickerViewModel == null) {
            h.f.b.l.a("donationStickerViewModel");
        }
        return editDonationStickerViewModel;
    }

    public static final /* synthetic */ EditHashTagStickerViewModel e(c cVar) {
        EditHashTagStickerViewModel editHashTagStickerViewModel = cVar.f146660j;
        if (editHashTagStickerViewModel == null) {
            h.f.b.l.a("hashTagStickerViewModel");
        }
        return editHashTagStickerViewModel;
    }

    public static final /* synthetic */ EditMentionStickerViewModel f(c cVar) {
        EditMentionStickerViewModel editMentionStickerViewModel = cVar.f146659i;
        if (editMentionStickerViewModel == null) {
            h.f.b.l.a("mentionStickerViewModel");
        }
        return editMentionStickerViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public static final /* synthetic */ EditStickerViewModel a(c cVar) {
        EditStickerViewModel editStickerViewModel = cVar.f146661k;
        if (editStickerViewModel == null) {
            h.f.b.l.a("stickerViewModel");
        }
        return editStickerViewModel;
    }

    public c(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.C = fVar;
        h.k.c a2 = h.f.b.ab.a(EditInfoStickerViewModel.class);
        this.v = h.i.a((h.f.a.a) new f(this, a2, a2));
        this.w = h.i.a(h.m.NONE, new b(this));
        this.x = h.i.a(h.m.NONE, new C3927c(this));
        this.y = h.i.a(h.m.NONE, new d(this));
        this.z = h.i.a(h.m.NONE, new e(this));
        this.A = h.i.a((h.f.a.a) new i(this));
        this.B = h.i.a((h.f.a.a) new u(this));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
        JediViewModel a2 = com.bytedance.jedi.arch.t.a(eVar).a(EditTextStickerViewModel.class);
        h.f.b.l.b(a2, "");
        this.f146657g = (EditTextStickerViewModel) a2;
        JediViewModel a3 = com.bytedance.jedi.arch.t.a(eVar).a(EditCommentStickerViewModel.class);
        h.f.b.l.b(a3, "");
        this.f146656f = (EditCommentStickerViewModel) a3;
        JediViewModel a4 = com.bytedance.jedi.arch.t.a(eVar).a(EditDonationStickerViewModel.class);
        h.f.b.l.b(a4, "");
        this.f146658h = (EditDonationStickerViewModel) a4;
        JediViewModel a5 = com.bytedance.jedi.arch.t.a(eVar).a(EditMentionStickerViewModel.class);
        h.f.b.l.b(a5, "");
        this.f146659i = (EditMentionStickerViewModel) a5;
        JediViewModel a6 = com.bytedance.jedi.arch.t.a(eVar).a(EditHashTagStickerViewModel.class);
        h.f.b.l.b(a6, "");
        this.f146660j = (EditHashTagStickerViewModel) a6;
        JediViewModel a7 = com.bytedance.jedi.arch.t.a(eVar).a(EditStickerViewModel.class);
        h.f.b.l.b(a7, "");
        this.f146661k = (EditStickerViewModel) a7;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = E();
        com.ss.android.ugc.asve.editor.g value = a().C().getValue();
        if (value == null) {
            h.f.b.l.b();
        }
        E.s = value;
        E.u = (VideoPublishEditModel) this.t.a(this, f146650a[0]);
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E2 = E();
        Integer a8 = com.ss.android.ugc.aweme.port.in.l.f115658a.s().e().a();
        h.f.b.l.b(a8, "");
        E2.r = a8.intValue();
        if (E2.r == 0) {
            E2.r = 30;
        }
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E3 = E();
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.fragment.app.e eVar2 = (androidx.fragment.app.e) activity2;
        View view = this.n;
        VideoPublishEditModel videoPublishEditModel = E().u;
        h.f.b.l.b(videoPublishEditModel, "");
        List<MediaModel> mediaModelList = videoPublishEditModel.getMediaModelList();
        E3.f127154c = eVar2;
        E3.x = mediaModelList;
        E3.f127153b = false;
        E3.y = new SafeHandler(eVar2);
        com.bytedance.f.a.a.h hVar = null;
        E3.t = (InfoStickerViewModel) androidx.lifecycle.ae.a(eVar2, (ad.b) null).a(InfoStickerViewModel.class);
        E3.v = view;
        E3.A = (FrameLayout) E3.v.findViewById(R.id.dqn);
        E3.f127155d = (InfoStickerEditView) E3.v.findViewById(R.id.bp2);
        E3.f127156e = E3.v.findViewById(R.id.bzv);
        E3.f127157f = E3.v.findViewById(R.id.ae6);
        E3.f127158g = (AVDmtTextView) E3.v.findViewById(R.id.ejz);
        E3.f127159h = (VideoEditView) E3.v.findViewById(R.id.fg1);
        E3.f127160i = (ImageView) E3.v.findViewById(R.id.a1p);
        E3.f127161j = (ImageView) E3.v.findViewById(R.id.ds0);
        E3.f127162k = (ImageView) E3.v.findViewById(R.id.zc);
        E3.f127164m = E3.v.findViewById(R.id.d4s);
        E3.n = (TextView) E3.v.findViewById(R.id.d4r);
        E3.o = (TextView) E3.v.findViewById(R.id.d4v);
        E3.p = (SeekBar) E3.v.findViewById(R.id.d4t);
        E3.q = (ViewGroup) E3.v.findViewById(R.id.d4u);
        E3.P = (EditCornerViewModel) com.bytedance.jedi.arch.t.a(E3.f127154c).a(EditCornerViewModel.class);
        if (com.ss.android.ugc.aweme.shortvideo.edit.p.a()) {
            E3.Q = (EditProgressViewModel) com.bytedance.jedi.arch.t.a(E3.f127154c).a(EditProgressViewModel.class);
        }
        E3.O = new com.ss.android.ugc.aweme.shortvideo.edit.d.a(E3.s, E3.f127154c, E3.R);
        E3.O.f127005e = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01e3: IPUT  
              (wrap: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$4 : 0x01e0: CONSTRUCTOR  (r0v83 com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$4) = (r2v4 'E3' com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i) call: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.4.<init>(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i):void type: CONSTRUCTOR)
              (wrap: com.ss.android.ugc.aweme.shortvideo.edit.d.a : 0x01dc: IGET  (r1v27 com.ss.android.ugc.aweme.shortvideo.edit.d.a) = (r2v4 'E3' com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i) com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.O com.ss.android.ugc.aweme.shortvideo.edit.d.a)
             com.ss.android.ugc.aweme.shortvideo.edit.d.a.e com.ss.android.ugc.aweme.shortvideo.edit.d.a$a in method: com.ss.android.ugc.gamora.editor.sticker.info.c.a(android.os.Bundle):void, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01e0: CONSTRUCTOR  (r0v83 com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$4) = (r2v4 'E3' com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i) call: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.4.<init>(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i):void type: CONSTRUCTOR in method: com.ss.android.ugc.gamora.editor.sticker.info.c.a(android.os.Bundle):void, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
        // Method dump skipped, instructions count: 1058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.info.c.a(android.os.Bundle):void");
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.E().j();
            return z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            this.this$0.E().S = true;
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.u<? extends Float, ? extends Float, ? extends Float>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, h.u<? extends Float, ? extends Float, ? extends Float> uVar) {
            h.u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(uVar2, "");
            InfoStickerEditView infoStickerEditView = this.this$0.E().f127155d;
            h.f.b.l.b(infoStickerEditView, "");
            com.ss.android.ugc.gamora.editor.u.a(infoStickerEditView, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96538);
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
            if (kVar2.f39404b.booleanValue()) {
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = this.this$0.E();
                E.f127155d.a(this.this$0.E().u.infoStickerModel, false);
            }
            return z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.p<? extends Float, ? extends Long>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, h.p<? extends Float, ? extends Long> pVar) {
            h.p<? extends Float, ? extends Long> pVar2 = pVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar2, "");
            InfoStickerEditView infoStickerEditView = this.this$0.E().f127155d;
            h.f.b.l.b(infoStickerEditView, "");
            com.ss.android.ugc.gamora.editor.u.a(infoStickerEditView, ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.ag2, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c cVar) {
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
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = this.this$0.E();
            boolean z = !booleanValue;
            if (E.f127155d != null) {
                E.f127155d.setStickerHintEnable(z);
            }
            if (booleanValue) {
                this.this$0.E().a(new com.ss.android.ugc.aweme.editSticker.c.b() {
                    /* class com.ss.android.ugc.gamora.editor.sticker.info.c.p.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(96540);
                    }

                    @Override // com.ss.android.ugc.aweme.editSticker.c.b
                    public final boolean a() {
                        return true;
                    }
                });
            } else {
                this.this$0.E().a(com.ss.android.ugc.aweme.editSticker.c.a.f88100a);
            }
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.p<? extends Integer, ? extends Integer>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, h.p<? extends Integer, ? extends Integer> pVar) {
            h.p<? extends Integer, ? extends Integer> pVar2 = pVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar2, "");
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = this.this$0.E();
            Integer num = (Integer) pVar2.getFirst();
            Integer num2 = (Integer) pVar2.getSecond();
            if (E.f127155d != null) {
                E.f127155d.f127073g.f127133c = num2.intValue();
            }
            if (E.w) {
                if (E.f127163l != null) {
                    E.f127163l.f125337l = num.intValue();
                }
                E.f127159h.a(num.intValue());
            } else if (!(E.x == null || E.x.size() != 1 || E.x.get(0).f109396h == ((long) num.intValue()))) {
                E.x.get(0).f109396h = (long) num.intValue();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
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
