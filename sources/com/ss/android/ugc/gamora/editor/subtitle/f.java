package com.ss.android.ugc.gamora.editor.subtitle;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.t;
import com.bytedance.scene.ktx.c;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class f extends com.bytedance.ui_component.b<EditSubtitleViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f146963a;

    /* renamed from: b  reason: collision with root package name */
    public final int f146964b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f146965c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditSubtitleViewModel> f146966d = b.f146968a;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.o.f f146967e;

    static {
        Covode.recordClassIndex(96794);
    }

    private final EditCaptionScene a() {
        return (EditCaptionScene) this.f146965c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditSubtitleViewModel> b() {
        return this.f146966d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146963a;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f146967e;
    }

    static final class b extends m implements h.f.a.a<EditSubtitleViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f146968a = new b();

        static {
            Covode.recordClassIndex(96796);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditSubtitleViewModel invoke() {
            return new EditSubtitleViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        a();
        a().b(true);
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        a().b(false);
    }

    static final class a extends m implements h.f.a.a<EditCaptionScene> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(96795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditCaptionScene invoke() {
            l.b(t.a(c.b(this.this$0.f146963a)).a(EditInfoStickerViewModel.class), "");
            EditCaptionScene editCaptionScene = new EditCaptionScene(this.this$0.getDiContainer());
            this.this$0.f146963a.a(this.this$0.f146964b, editCaptionScene, "EditCaptionScene");
            return editCaptionScene;
        }
    }

    public f(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f146967e = fVar;
        this.f146963a = bVar;
    }
}
