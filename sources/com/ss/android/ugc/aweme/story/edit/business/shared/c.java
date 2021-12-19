package com.ss.android.ugc.aweme.story.edit.business.shared;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.o.n;
import com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.story.edit.b;
import com.ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelViewModel;
import com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel;
import com.ss.android.ugc.aweme.story.edit.canvas.EditPhotoCanvasViewModel;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.ss.android.ugc.gamora.editor.cutmusic.EditMusicCutViewModel;
import com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorViewModel;
import com.ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Objects;

public final class c extends com.bytedance.scene.group.b implements com.bytedance.o.a, com.ss.android.ugc.aweme.story.edit.clip.impl.b, com.ss.android.ugc.gamora.editor.s {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f137214b = {new h.f.b.y(c.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new h.f.b.y(c.class, "filterService", "getFilterService()Lcom/ss/android/ugc/aweme/filter/services/IFilterComponentService;", 0), new h.f.b.y(c.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new h.f.b.y(c.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0), new h.f.b.y(c.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0), new h.f.b.y(c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: i  reason: collision with root package name */
    public static final l f137215i = new l((byte) 0);
    private final h.h A;
    private final com.bytedance.o.f B;

    /* renamed from: c  reason: collision with root package name */
    final h.h f137216c = h.i.a(h.m.NONE, new b(this));

    /* renamed from: d  reason: collision with root package name */
    final h.h f137217d = h.i.a(h.m.NONE, new C3598c(this));

    /* renamed from: e  reason: collision with root package name */
    final h.h f137218e = h.i.a(h.m.NONE, new f(this));

    /* renamed from: f  reason: collision with root package name */
    final h.h f137219f = h.i.a(h.m.NONE, new h(this));

    /* renamed from: g  reason: collision with root package name */
    final h.h f137220g = h.i.a((h.f.a.a) new aj(this));

    /* renamed from: h  reason: collision with root package name */
    final h.h f137221h;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f137222j = h.i.a(h.m.NONE, new a(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f137223k = h.i.a(h.m.NONE, new d(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f137224l = new k(this);
    private final h.h t = h.i.a(h.m.NONE, new e(this));
    private final h.h u = h.i.a(h.m.NONE, new g(this));
    private final h.h.d v;
    private final h.h.d w;
    private final h.h.d x;
    private final h.h.d y;
    private final h.h.d z;

    /* access modifiers changed from: package-private */
    public static final class s implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final s f137299a = new s();

        static {
            Covode.recordClassIndex(89759);
        }

        s() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final u f137301a = new u();

        static {
            Covode.recordClassIndex(89761);
        }

        u() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    static {
        Covode.recordClassIndex(89728);
    }

    public final com.ss.android.ugc.aweme.story.edit.b.e F() {
        return (com.ss.android.ugc.aweme.story.edit.b.e) this.f137222j.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d G() {
        return (com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d) this.f137223k.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.sticker.core.a H() {
        return (com.ss.android.ugc.gamora.editor.sticker.core.a) this.f137224l.a(this, f137214b[0]);
    }

    public final com.ss.android.ugc.gamora.editor.sticker.panel.a I() {
        return (com.ss.android.ugc.gamora.editor.sticker.panel.a) this.t.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.music.a J() {
        return (com.ss.android.ugc.gamora.editor.music.a) this.u.getValue();
    }

    public final com.ss.android.ugc.aweme.filter.d.a K() {
        return (com.ss.android.ugc.aweme.filter.d.a) this.v.a(this, f137214b[1]);
    }

    public final com.bytedance.f.a.a.j L() {
        return (com.bytedance.f.a.a.j) this.w.a(this, f137214b[2]);
    }

    /* access modifiers changed from: package-private */
    public final StoryEditModel M() {
        return (StoryEditModel) this.y.a(this, f137214b[4]);
    }

    public final VideoPublishEditModel N() {
        return (VideoPublishEditModel) this.z.a(this, f137214b[5]);
    }

    public final com.ss.android.ugc.gamora.editor.w O() {
        return (com.ss.android.ugc.gamora.editor.w) this.A.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.s
    public final void a(String str, int i2, int i3, int i4, boolean z2) {
        h.f.b.l.d(str, "");
    }

    public static final class l {
        static {
            Covode.recordClassIndex(89752);
        }

        private l() {
        }

        public /* synthetic */ l(byte b2) {
            this();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.b.e> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.b.e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.ss.android.ugc.aweme.story.edit.b.e.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.a.invoke():com.bytedance.als.b");
        }
    }

    static final class ai extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.w> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.w invoke() {
            com.ss.android.ugc.gamora.editor.w wVar = new com.ss.android.ugc.gamora.editor.w();
            this.this$0.a(R.id.atb, wVar, "EditStickerDeleteScene");
            return wVar;
        }
    }

    static final class aj extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.d> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.d invoke() {
            return new com.ss.android.ugc.aweme.story.edit.d(this.this$0.getDiContainer());
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.indicator.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.filter.indicator.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.filter.indicator.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.indicator.a> r1 = com.ss.android.ugc.gamora.editor.filter.indicator.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$c  reason: collision with other inner class name */
    public static final class C3598c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.business.shared.b.b.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3598c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.b.b.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.b.b.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.b.b.a> r1 = com.ss.android.ugc.aweme.story.edit.business.shared.b.b.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.C3598c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> r1 = com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.d.invoke():com.bytedance.als.b");
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.panel.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.panel.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.panel.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.panel.a> r1 = com.ss.android.ugc.gamora.editor.sticker.panel.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.e.invoke():com.bytedance.als.b");
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.business.shared.f.e> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.f.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.f.e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.f.e> r1 = com.ss.android.ugc.aweme.story.edit.business.shared.f.e.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.f.invoke():com.bytedance.als.b");
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.music.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.music.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.music.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.music.a> r1 = com.ss.android.ugc.gamora.editor.music.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.g.invoke():com.bytedance.als.b");
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.business.shared.effect.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.effect.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.effect.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.effect.a> r1 = com.ss.android.ugc.aweme.story.edit.business.shared.effect.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.h.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.s
    public final void X() {
        J().b(false);
        F().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.a
    public final /* synthetic */ VEEditClipCluster cy_() {
        return (VEEditClipCluster) this.x.a(this, f137214b[3]);
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        com.bytedance.o.f b2 = com.bytedance.als.dsl.c.b(this);
        if (b2 == null) {
            h.f.b.l.b();
        }
        return b2;
    }

    static final class n extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.filter.repository.a.k> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.filter.repository.a.k invoke() {
            com.ss.android.ugc.aweme.filter.repository.a.k value = this.this$0.F().l().getValue();
            if (value == null) {
                h.f.b.l.b();
            }
            return value;
        }
    }

    public final void Q() {
        com.ss.android.ugc.aweme.shortvideo.p.d.a(com.ss.android.ugc.aweme.shortvideo.p.c.f129554a).d();
        Activity activity = this.f42913m;
        if (activity != null) {
            activity.finish();
        }
        com.ss.android.ugc.aweme.story.edit.model.a.c(M());
    }

    public final void P() {
        ArrayList<EffectPointModel> arrayList;
        if (M().getOrigin() == 1) {
            new a.C0731a(t()).a(R.string.g8o).b(R.string.g8n).b(R.string.bcn, (DialogInterface.OnClickListener) s.f137299a, false).a(R.string.b0t, (DialogInterface.OnClickListener) new t(this), false).a().c();
            return;
        }
        com.ss.android.ugc.gamora.editor.sticker.core.a H = H();
        if ((H == null || !H.f()) && !N().hasInfoStickers() && (((arrayList = N().mEffectList) == null || arrayList.isEmpty()) && !com.ss.android.ugc.aweme.story.edit.model.a.b(M()) && !com.ss.android.ugc.aweme.story.edit.model.a.a(M()))) {
            Q();
        } else {
            new a.C0731a(t()).b(R.string.hat).b(R.string.a9e, (DialogInterface.OnClickListener) u.f137301a, false).a(R.string.asg, (DialogInterface.OnClickListener) new v(this), false).a().c();
        }
    }

    static final class ah extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        public static final class a extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ah f137250a;

            static {
                Covode.recordClassIndex(89738);
            }

            public a(ah ahVar) {
                this.f137250a = ahVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.gamora.editor.w get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f137250a.this$0.O();
            }
        }

        public static final class b extends com.bytedance.o.p<c> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ah f137251a;

            static {
                Covode.recordClassIndex(89739);
            }

            public b(ah ahVar) {
                this.f137251a = ahVar;
            }

            @Override // com.bytedance.o.p
            public final c get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f137251a.this$0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.o.n nVar) {
            com.bytedance.o.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            n.a a2 = nVar2.a(com.ss.android.ugc.gamora.editor.w.class, (String) null, (com.bytedance.o.p) new a(this));
            h.f.b.l.b(a2, "");
            a2.a(com.ss.android.ugc.aweme.editSticker.interact.e.class);
            n.a a3 = nVar2.a(c.class, (String) null, (com.bytedance.o.p) new b(this));
            h.f.b.l.b(a3, "");
            a3.a(com.ss.android.ugc.gamora.editor.s.class);
            return h.z.f158842a;
        }
    }

    public static final class i extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.business.shared.b.a.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137291a;

        static {
            Covode.recordClassIndex(89749);
        }

        public i(com.bytedance.als.dsl.d dVar) {
            this.f137291a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.shared.b.a.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.shared.b.a.b(fVar);
        }
    }

    public static final class j extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.business.shared.f.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137292a;

        static {
            Covode.recordClassIndex(89750);
        }

        public j(com.bytedance.als.dsl.d dVar) {
            this.f137292a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.shared.f.f get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.shared.f.f(fVar);
        }
    }

    public static final class k implements h.h.d<Object, com.ss.android.ugc.gamora.editor.sticker.core.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.a f137293a;

        static {
            Covode.recordClassIndex(89751);
        }

        public k(com.bytedance.o.a aVar) {
            this.f137293a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.gamora.editor.sticker.core.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.h.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.a a(java.lang.Object r3, h.k.i<?> r4) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r3, r0)
                h.f.b.l.d(r4, r0)
                com.bytedance.o.a r0 = r2.f137293a
                com.ss.android.ugc.aweme.story.edit.business.a.b r1 = com.ss.android.ugc.aweme.story.edit.business.a.a.a(r0)
                if (r1 == 0) goto L_0x0017
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r0 = com.ss.android.ugc.gamora.editor.sticker.core.a.class
                java.lang.Object r0 = r1.a(r0)
                return r0
            L_0x0017:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.c.k.a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    public static final class m implements com.ss.android.ugc.gamora.editor.filter.core.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f137294a;

        static {
            Covode.recordClassIndex(89753);
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.b
        public final void a(float f2) {
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.b
        public final void a(String str) {
            h.f.b.l.d(str, "");
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.b
        public final void a(boolean z, FilterBean filterBean) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(c cVar) {
            this.f137294a = cVar;
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.b
        public final void a(FilterBean filterBean, boolean z, Context context) {
            StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this.f137294a);
            if (d2 == null) {
                return;
            }
            if (filterBean != null) {
                d2.setMSelectedFilterIntensity(((com.ss.android.ugc.aweme.filter.repository.a.k) this.f137294a.f137221h.getValue()).a(filterBean));
                d2.setSelectFilterIndex(com.ss.android.ugc.aweme.filter.repository.a.a.c.a(this.f137294a.K().d().f(), filterBean));
                d2.setMCurFilterLabels(filterBean.getEnName());
                d2.setMSelectedFilterId(String.valueOf(filterBean.getId()));
                d2.setMSelectedFilterLabel(filterBean.getEnName());
                d2.setMSelectedFilterResId(filterBean.getResId());
                bl.a(this.f137294a.N(), "slide", filterBean.getEnName(), filterBean.getId());
                return;
            }
            d2.setSelectFilterIndex(0);
            d2.setMSelectedFilterId("");
            d2.setMSelectedFilterLabel("");
            d2.setMSelectedFilterResId("");
        }
    }

    public static final class ac extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.business.shared.b.b.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137240a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137241b;

        static {
            Covode.recordClassIndex(89732);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.shared.b.b.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.shared.b.b.b(fVar, this.f137241b);
        }

        public ac(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137240a = dVar;
            this.f137241b = cVar;
        }
    }

    public static final class ad extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.cutmusic.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137242a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137243b;

        static {
            Covode.recordClassIndex(89733);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.cutmusic.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.cutmusic.b(fVar, this.f137243b);
        }

        public ad(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137242a = dVar;
            this.f137243b = cVar;
        }
    }

    public static final class ae extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.business.shared.c.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137244a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137245b;

        static {
            Covode.recordClassIndex(89734);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.shared.c.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.shared.c.a(fVar, this.f137245b);
        }

        public ae(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137244a = dVar;
            this.f137245b = cVar;
        }
    }

    public static final class af extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.business.shared.effect.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137247b;

        static {
            Covode.recordClassIndex(89735);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.shared.effect.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.shared.effect.b(fVar, this.f137247b);
        }

        public af(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137246a = dVar;
            this.f137247b = cVar;
        }
    }

    public static final class ag extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137248a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137249b;

        static {
            Covode.recordClassIndex(89736);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a(fVar, this.f137249b);
        }

        public ag(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137248a = dVar;
            this.f137249b = cVar;
        }
    }

    public static final class w extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.business.a.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137304b;

        static {
            Covode.recordClassIndex(89763);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.a.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.a.c(fVar, this.f137304b);
        }

        public w(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137303a = dVar;
            this.f137304b = cVar;
        }
    }

    public static final class z extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137309a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137310b;

        static {
            Covode.recordClassIndex(89767);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.e get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.e(fVar, this.f137310b);
        }

        public z(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137309a = dVar;
            this.f137310b = cVar;
        }
    }

    static final class r<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f137298a;

        static {
            Covode.recordClassIndex(89758);
        }

        r(c cVar) {
            this.f137298a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            c cVar = this.f137298a;
            cVar.e(cVar.O());
            ((com.ss.android.ugc.gamora.editor.filter.indicator.a) cVar.f137216c.getValue()).a();
            ((com.ss.android.ugc.aweme.story.edit.business.shared.b.b.a) cVar.f137217d.getValue()).a();
        }
    }

    public static final class x extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.canvas.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137306b;

        static {
            Covode.recordClassIndex(89764);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.canvas.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.canvas.b(fVar, this.f137306b, new h.f.a.a<com.bytedance.f.a.a.j>(this) {
                /* class com.ss.android.ugc.aweme.story.edit.business.shared.c.x.AnonymousClass1 */
                final /* synthetic */ x this$0;

                static {
                    Covode.recordClassIndex(89765);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.bytedance.f.a.a.j invoke() {
                    return this.this$0.f137306b.L();
                }
            });
        }

        public x(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137305a = dVar;
            this.f137306b = cVar;
        }
    }

    public static final class y extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.sticker.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137307a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137308b;

        static {
            Covode.recordClassIndex(89766);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.a.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            c cVar = this.f137308b;
            return new com.ss.android.ugc.gamora.editor.sticker.a.a(fVar, cVar, R.id.c9b, cVar.N());
        }

        public y(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137307a = dVar;
            this.f137308b = cVar;
        }
    }

    public static final class aa extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.filter.indicator.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137237b;

        static {
            Covode.recordClassIndex(89730);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.filter.indicator.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            c cVar = this.f137237b;
            com.ss.android.ugc.gamora.editor.filter.indicator.b bVar = new com.ss.android.ugc.gamora.editor.filter.indicator.b(fVar, cVar, cVar.K().c().a(0), this.f137237b.K().d());
            bVar.f145929a = false;
            return bVar;
        }

        public aa(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137236a = dVar;
            this.f137237b = cVar;
        }
    }

    public static final class ab extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.edit.business.shared.a.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137239b;

        static {
            Covode.recordClassIndex(89731);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.shared.a.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.shared.a.b(fVar, this.f137239b.L(), this.f137239b.K().d(), new m(this.f137239b));
        }

        public ab(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f137238a = dVar;
            this.f137239b = cVar;
        }
    }

    static final class o<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f137295a;

        static {
            Covode.recordClassIndex(89755);
        }

        o(c cVar) {
            this.f137295a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            h.u uVar = (h.u) obj;
            ((com.ss.android.ugc.gamora.editor.toolbar.y) this.f137295a.f137220g.getValue()).a(((Boolean) uVar.component1()).booleanValue(), ((Boolean) uVar.component2()).booleanValue(), ((Boolean) uVar.component3()).booleanValue());
        }
    }

    static final class q<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f137297a;

        static {
            Covode.recordClassIndex(89757);
        }

        q(c cVar) {
            this.f137297a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            View c2 = this.f137297a.c(R.id.c9b);
            h.f.b.l.b(c2, "");
            FrameLayout frameLayout = (FrameLayout) c2;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                h.f.b.l.b(num, "");
                marginLayoutParams.topMargin = num.intValue();
                frameLayout.setLayoutParams(marginLayoutParams);
            }
        }
    }

    static final class p<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f137296a;

        static {
            Covode.recordClassIndex(89756);
        }

        p(c cVar) {
            this.f137296a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.n nVar = (com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.n) obj;
            c cVar = this.f137296a;
            h.f.b.l.b(nVar, "");
            int i2 = nVar.f137508a;
            if (i2 == 0) {
                cVar.P();
            } else if (i2 == 1) {
                cVar.J().b(true);
                cVar.F().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
            } else if (i2 == 2) {
                cVar.F().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
                ((com.ss.android.ugc.aweme.story.edit.business.shared.effect.a) cVar.f137219f.getValue()).a();
                bl.a(cVar.N(), false);
            } else if (i2 == 3) {
                com.ss.android.ugc.gamora.editor.sticker.core.a H = cVar.H();
                if (H != null) {
                    H.b();
                }
                bl.a(cVar.N(), nVar.f137509b);
            } else if (i2 == 4) {
                cVar.I().a(true, nVar.f137509b);
                cVar.F().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
            } else if (i2 == 5) {
                VEEditClip vEEditClip = (VEEditClip) com.ss.android.ugc.aweme.story.edit.clip.a.b.a(cVar.cy_());
                if (vEEditClip != null) {
                    boolean f2 = com.ss.android.ugc.aweme.story.edit.model.a.f(vEEditClip.f137559g);
                    if (f2) {
                        vEEditClip.f137559g.setVoiceVolume(1.0f);
                    } else {
                        vEEditClip.f137559g.setVoiceVolume(0.0f);
                    }
                    cVar.G().d(!f2);
                    cVar.J().a(vEEditClip.f137559g.getVoiceVolume());
                    com.ss.android.ugc.aweme.story.edit.b.e F = cVar.F();
                    VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(vEEditClip.f137559g.getVoiceVolume());
                    h.f.b.l.b(ofVoice, "");
                    F.a(ofVoice);
                    StoryEditModel M = cVar.M();
                    h.f.b.l.d(M, "");
                    com.ss.android.ugc.aweme.story.edit.b.a("click_mute", M, new b.e(!f2));
                }
            } else if (i2 == 100) {
                ((com.ss.android.ugc.aweme.story.edit.business.shared.f.e) cVar.f137218e.getValue()).a();
                StoryEditModel M2 = cVar.M();
                String str = nVar.f137509b;
                h.f.b.l.d(M2, "");
                h.f.b.l.d(str, "");
                com.ss.android.ugc.aweme.story.edit.b.a("click_share_to_story", M2, new b.a(M2, !h.f.b.l.a((Object) str, (Object) "click_button")));
            }
        }
    }

    public c(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.B = fVar;
        this.v = com.bytedance.o.b.a.a(fVar, com.ss.android.ugc.aweme.filter.d.a.class);
        this.w = com.bytedance.o.b.a.a(fVar, com.bytedance.f.a.a.j.class);
        this.x = com.bytedance.o.b.a.a(fVar, VEEditClipCluster.class);
        this.y = com.bytedance.o.b.a.a(fVar, StoryEditModel.class);
        this.z = com.bytedance.o.b.a.a(fVar, VideoPublishEditModel.class);
        this.f137221h = h.i.a((h.f.a.a) new n(this));
        this.A = h.i.a((h.f.a.a) new ai(this));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        com.bytedance.als.dsl.g.a(this, new ah(this));
        com.bytedance.als.dsl.b bVar = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.a.c.class, (String) null, (com.bytedance.o.p) new w(dVar, this));
        alsLogicContainer.a(com.ss.android.ugc.aweme.story.edit.business.a.b.class, com.ss.android.ugc.aweme.story.edit.business.a.c.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.e.class, (String) null, (com.bytedance.o.p) new z(dVar2, this));
        alsLogicContainer2.a(StoryEditToolbarViewModel.class, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.e.class);
        com.bytedance.als.dsl.d dVar3 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer3 = bVar.f6461a;
        alsLogicContainer3.f6437d.a(com.ss.android.ugc.gamora.editor.filter.indicator.b.class, (String) null, (com.bytedance.o.p) new aa(dVar3, this));
        alsLogicContainer3.a(EditFilterIndicatorViewModel.class, com.ss.android.ugc.gamora.editor.filter.indicator.b.class);
        com.bytedance.als.dsl.d dVar4 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer4 = bVar.f6461a;
        alsLogicContainer4.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.shared.a.b.class, (String) null, (com.bytedance.o.p) new ab(dVar4, this));
        alsLogicContainer4.a(com.ss.android.ugc.aweme.story.edit.business.shared.a.a.class, com.ss.android.ugc.aweme.story.edit.business.shared.a.b.class);
        com.bytedance.als.dsl.d dVar5 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer5 = bVar.f6461a;
        alsLogicContainer5.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.shared.b.b.b.class, (String) null, (com.bytedance.o.p) new ac(dVar5, this));
        alsLogicContainer5.a(com.ss.android.ugc.aweme.story.edit.business.shared.b.b.a.class, com.ss.android.ugc.aweme.story.edit.business.shared.b.b.b.class);
        com.bytedance.als.dsl.d dVar6 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer6 = bVar.f6461a;
        alsLogicContainer6.f6437d.a(com.ss.android.ugc.gamora.editor.cutmusic.b.class, (String) null, (com.bytedance.o.p) new ad(dVar6, this));
        alsLogicContainer6.a(EditMusicCutViewModel.class, com.ss.android.ugc.gamora.editor.cutmusic.b.class);
        com.bytedance.als.dsl.d dVar7 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer7 = bVar.f6461a;
        alsLogicContainer7.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.shared.c.a.class, (String) null, (com.bytedance.o.p) new ae(dVar7, this));
        alsLogicContainer7.a(EditMusicViewModel.class, com.ss.android.ugc.aweme.story.edit.business.shared.c.a.class);
        com.bytedance.als.dsl.d dVar8 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer8 = bVar.f6461a;
        alsLogicContainer8.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.shared.effect.b.class, (String) null, (com.bytedance.o.p) new af(dVar8, this));
        alsLogicContainer8.a(StoryEditEffectPanelViewModel.class, com.ss.android.ugc.aweme.story.edit.business.shared.effect.b.class);
        com.bytedance.als.dsl.d dVar9 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer9 = bVar.f6461a;
        alsLogicContainer9.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a.class, (String) null, (com.bytedance.o.p) new ag(dVar9, this));
        alsLogicContainer9.a(EditStickerPanelViewModel.class, com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a.class);
        com.bytedance.als.dsl.d dVar10 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer10 = bVar.f6461a;
        alsLogicContainer10.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.shared.b.a.b.class, (String) null, (com.bytedance.o.p) new i(dVar10));
        alsLogicContainer10.a(com.ss.android.ugc.aweme.story.edit.business.shared.b.a.a.class, com.ss.android.ugc.aweme.story.edit.business.shared.b.a.b.class);
        com.bytedance.als.dsl.d dVar11 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer11 = bVar.f6461a;
        alsLogicContainer11.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.shared.f.f.class, (String) null, (com.bytedance.o.p) new j(dVar11));
        alsLogicContainer11.a(com.ss.android.ugc.aweme.story.edit.business.shared.f.e.class, com.ss.android.ugc.aweme.story.edit.business.shared.f.f.class);
        com.bytedance.als.dsl.d dVar12 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer12 = bVar.f6461a;
        alsLogicContainer12.f6437d.a(com.ss.android.ugc.aweme.story.edit.canvas.b.class, (String) null, (com.bytedance.o.p) new x(dVar12, this));
        alsLogicContainer12.a(EditPhotoCanvasViewModel.class, com.ss.android.ugc.aweme.story.edit.canvas.b.class);
        com.bytedance.als.dsl.d dVar13 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer13 = bVar.f6461a;
        alsLogicContainer13.f6437d.a(com.ss.android.ugc.gamora.editor.sticker.a.a.class, (String) null, (com.bytedance.o.p) new y(dVar13, this));
        alsLogicContainer13.a(CommentAndQuestionAndQuestionStickerPanelViewModel.class, com.ss.android.ugc.gamora.editor.sticker.a.a.class);
        bVar.a();
        F().F().observe(this, new o(this));
        G().a().observe(this, new p(this));
        F().Q().observe(this, new q(this));
        F().f().observe(this, new r(this));
    }

    /* access modifiers changed from: package-private */
    public static final class t implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f137300a;

        static {
            Covode.recordClassIndex(89760);
        }

        t(c cVar) {
            this.f137300a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f137300a.Q();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f137302a;

        static {
            Covode.recordClassIndex(89762);
        }

        v(c cVar) {
            this.f137302a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f137302a.Q();
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b2t, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }
}
