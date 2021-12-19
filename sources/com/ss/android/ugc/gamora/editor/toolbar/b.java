package com.ss.android.ugc.gamora.editor.toolbar;

import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.experiment.ce;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.be;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class b implements y {

    /* renamed from: a  reason: collision with root package name */
    final h f147067a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    public final androidx.fragment.app.e f147068b;

    /* renamed from: c  reason: collision with root package name */
    private final h f147069c = i.a((h.f.a.a) new C3945b(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f147070d = i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f147071e = i.a((h.f.a.a) new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f147072f = i.a((h.f.a.a) new e(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f147073g = i.a((h.f.a.a) new f(this));

    static {
        Covode.recordClassIndex(96866);
    }

    private final EditStickerViewModel b() {
        return (EditStickerViewModel) this.f147069c.getValue();
    }

    private final EditToolbarViewModel c() {
        return (EditToolbarViewModel) this.f147071e.getValue();
    }

    private final EditStickerViewModel d() {
        return (EditStickerViewModel) this.f147072f.getValue();
    }

    private final VideoPublishEditModel e() {
        return (VideoPublishEditModel) this.f147073g.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.y
    public final void a() {
        c().a();
    }

    static final class a extends m implements h.f.a.a<com.bytedance.o.f> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.o.f invoke() {
            return com.bytedance.als.dsl.c.b(this.this$0.f147068b);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.b$b  reason: collision with other inner class name */
    static final class C3945b extends m implements h.f.a.a<EditStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3945b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditStickerViewModel invoke() {
            return t.a(this.this$0.f147068b).a(EditStickerViewModel.class);
        }
    }

    static final class c extends m implements h.f.a.a<EditTextStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96869);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditTextStickerViewModel invoke() {
            return t.a(this.this$0.f147068b).a(EditTextStickerViewModel.class);
        }
    }

    static final class d extends m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            return t.a(this.this$0.f147068b).a(EditToolbarViewModel.class);
        }
    }

    static final class e extends m implements h.f.a.a<EditStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditStickerViewModel invoke() {
            return t.a(this.this$0.f147068b).a(EditStickerViewModel.class);
        }
    }

    static final class f extends m implements h.f.a.a<VideoPublishEditModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            com.bytedance.o.f fVar = (com.bytedance.o.f) this.this$0.f147067a.getValue();
            if (fVar == null) {
                l.b();
            }
            Object a2 = fVar.a((Type) VideoPublishEditModel.class, (String) null);
            l.b(a2, "");
            return a2;
        }
    }

    public b(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        this.f147068b = eVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.y
    public final void a(boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        VideoPublishEditModel e2 = e();
        if (!z2) {
            Boolean value = d().n().getValue();
            if (value == null || !value.booleanValue()) {
                Boolean value2 = d().o().getValue();
                if (value2 == null || !value2.booleanValue()) {
                    b().g().setValue(Boolean.valueOf(z3));
                } else {
                    b().m().setValue(Boolean.valueOf(z3));
                }
            } else {
                b().l().setValue(Boolean.valueOf(z3));
            }
        }
        if (!z) {
            ((EditTextStickerViewModel) this.f147070d.getValue()).n();
        }
        boolean isDuet = e2.isDuet();
        boolean isReaction = e2.isReaction();
        boolean b2 = bp.b(e2);
        c().j().setValue(Boolean.valueOf(z));
        c().b();
        c().c(new EditToolbarViewModel.h(z));
        if ((!e2.isMvThemeVideoType() || (e().isPhotoMvMode && e().getOriginal() == 1)) && !e2.isStickPointMode && !e2.isCutSameVideoType() && ((!e2.isDuet() || e2.duetFilesExist()) && !e2.isCutSameVideoType())) {
            z4 = false;
        } else {
            z4 = true;
        }
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        be storyService = createIAVServiceProxybyMonsterPlugin.getStoryService();
        if (storyService.b() || storyService.c() || storyService.d()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4) {
            c().b(false);
        } else if (e2.mIsFromDraft && !ce.a()) {
            EditToolbarViewModel c2 = c();
            if (!z || isReaction || b2 || e2.isUploadVideo()) {
                z6 = false;
            } else {
                z6 = true;
            }
            c2.b(z6);
        } else if (e2.draftFromShoot && !z5) {
            c().b(z);
        }
        if (bp.l(e2)) {
            com.ss.android.ugc.gamora.editor.music.a aVar = (com.ss.android.ugc.gamora.editor.music.a) ApiCenter.a.a(this.f147068b).b(com.ss.android.ugc.gamora.editor.music.a.class);
            if (aVar != null) {
                aVar.a(bp.a(e2, e2.mMusicPath));
            }
        } else {
            if (!com.ss.android.ugc.gamora.editor.t.b(e2)) {
                c().b(8, bp.a(e2, e2.mMusicPath));
                if (e().getVideoLength() > e2.mCurMusicLength) {
                    c().d(8, false);
                }
            }
            EditToolbarViewModel c3 = c();
            if (!z || isDuet || isReaction || b2) {
                z7 = false;
            } else {
                z7 = true;
            }
            c3.a(8, z7);
        }
        if (bp.f(e2)) {
            EditToolbarViewModel c4 = c();
            if (!z || b2) {
                z9 = false;
            } else {
                z9 = true;
            }
            c4.a(6, z9);
        }
        if (bp.h(e2)) {
            if (e2.veAudioRecorderParam == null || !e2.veAudioRecorderParam.hasRecord()) {
                c().d(6, false);
            } else {
                c().d(6, true);
            }
        }
        if ((!e2.hasOriginalAudio() || e2.voiceVolume <= 0.0f) && !e2.hasRecord()) {
            c().d(11, false);
        } else {
            c().d(11, true);
        }
        if (e2.isStickPointMode) {
            c().d(1, false);
        } else {
            c().d(1, true);
        }
        c().b(7, !e2.isStickPointMode);
        c().a(7, z);
        c().a(11, z);
        c().a(5, z);
        c().g().setValue(Boolean.valueOf(z));
        EditToolbarViewModel c5 = c();
        if (!z || isDuet || isReaction || b2) {
            z8 = false;
        } else {
            z8 = true;
        }
        c5.a(1, z8);
        c().a(2, z);
        if (!z) {
            c().c(2, false);
        }
        c().a(4, z);
        c().a(3, z);
    }
}
