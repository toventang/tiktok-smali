package com.ss.android.ugc.aweme.ftc.components.toolbar;

import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.gamora.editor.toolbar.y;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class q implements y {

    /* renamed from: a  reason: collision with root package name */
    final h f98284a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    public final androidx.fragment.app.e f98285b;

    /* renamed from: c  reason: collision with root package name */
    private final h f98286c = i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f98287d = i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f98288e = i.a((h.f.a.a) new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f98289f = i.a((h.f.a.a) new e(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f98290g = i.a((h.f.a.a) new f(this));

    static {
        Covode.recordClassIndex(62503);
    }

    private final FTCEditStickerViewModel b() {
        return (FTCEditStickerViewModel) this.f98286c.getValue();
    }

    private final FTCEditToolbarViewModel c() {
        return (FTCEditToolbarViewModel) this.f98288e.getValue();
    }

    private final FTCEditStickerViewModel d() {
        return (FTCEditStickerViewModel) this.f98289f.getValue();
    }

    private final VideoPublishEditModel e() {
        return (VideoPublishEditModel) this.f98290g.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.y
    public final void a() {
    }

    static final class a extends m implements h.f.a.a<com.bytedance.o.f> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(62504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.o.f invoke() {
            return com.bytedance.als.dsl.c.b(this.this$0.f98285b);
        }
    }

    static final class b extends m implements h.f.a.a<FTCEditStickerViewModel> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(62505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditStickerViewModel invoke() {
            return t.a(this.this$0.f98285b).a(FTCEditStickerViewModel.class);
        }
    }

    static final class c extends m implements h.f.a.a<FTCEditTextStickerViewModel> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(62506);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditTextStickerViewModel invoke() {
            return t.a(this.this$0.f98285b).a(FTCEditTextStickerViewModel.class);
        }
    }

    static final class d extends m implements h.f.a.a<FTCEditToolbarViewModel> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(62507);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditToolbarViewModel invoke() {
            return t.a(this.this$0.f98285b).a(FTCEditToolbarViewModel.class);
        }
    }

    static final class e extends m implements h.f.a.a<FTCEditStickerViewModel> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(62508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditStickerViewModel invoke() {
            return ae.a(this.this$0.f98285b, (ad.b) null).a(FTCEditStickerViewModel.class);
        }
    }

    static final class f extends m implements h.f.a.a<VideoPublishEditModel> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(62509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            com.bytedance.o.f fVar = (com.bytedance.o.f) this.this$0.f98284a.getValue();
            if (fVar == null) {
                l.b();
            }
            Object a2 = fVar.a((Type) VideoPublishEditModel.class, (String) null);
            l.b(a2, "");
            return a2;
        }
    }

    public q(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        this.f98285b = eVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.y
    public final void a(boolean z, boolean z2, boolean z3) {
        boolean z4;
        VideoPublishEditModel e2 = e();
        if (!z2) {
            Boolean value = d().i().getValue();
            if (value == null || !value.booleanValue()) {
                Boolean value2 = d().j().getValue();
                if (value2 == null || !value2.booleanValue()) {
                    b().b().setValue(Boolean.valueOf(z3));
                } else {
                    b().h().setValue(Boolean.valueOf(z3));
                }
            } else {
                b().g().setValue(Boolean.valueOf(z3));
            }
        }
        if (!z) {
            ((FTCEditTextStickerViewModel) this.f98287d.getValue()).k();
        }
        c().l().setValue(Boolean.valueOf(z));
        c().a();
        c().c(new FTCEditToolbarViewModel.e(z));
        if (e2.mIsFromDraft) {
            FTCEditToolbarViewModel c2 = c();
            if (!z || e2.isUploadVideo()) {
                z4 = false;
            } else {
                z4 = true;
            }
            c2.a(z4);
        }
        if (!bp.b()) {
            if (!com.ss.android.ugc.gamora.editor.t.b(e2)) {
                c().b(8, bp.a(e2, e2.mMusicPath));
                if (e().getVideoLength() > e2.mCurMusicLength) {
                    c().d(8, false);
                }
            }
            c().a(8, z);
        }
        if (bp.f(e2)) {
            c().a(6, z);
        }
        if (bp.h(e2)) {
            if (e2.veAudioRecorderParam == null || !e2.veAudioRecorderParam.hasRecord()) {
                c().d(6, false);
            } else {
                c().d(6, true);
            }
        }
        c().b(7, true);
        c().a(7, z);
        c().a(5, z);
        c().g().setValue(Boolean.valueOf(z));
        c().a(1, z);
        c().a(2, z);
        if (!z) {
            c().c(2, false);
        }
        c().a(3, z);
    }
}
