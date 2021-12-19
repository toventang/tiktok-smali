package com.ss.android.ugc.gamora.editor.sticker.qa;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class b extends com.bytedance.ui_component.b<EditPageQaStickerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.qasticker.a f146785a;

    /* renamed from: b  reason: collision with root package name */
    public final int f146786b = R.id.deg;

    /* renamed from: c  reason: collision with root package name */
    public final QaStickerEditLayout f146787c;

    /* renamed from: d  reason: collision with root package name */
    private final h f146788d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<EditPageQaStickerViewModel> f146789e;

    /* renamed from: f  reason: collision with root package name */
    private final f f146790f;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.scene.group.b f146791k;

    static {
        Covode.recordClassIndex(96672);
    }

    public final c a() {
        return (c) this.f146788d.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditPageQaStickerViewModel> b() {
        return this.f146789e;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146791k;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146790f;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.b$b  reason: collision with other inner class name */
    static final class C3936b extends m implements h.f.a.a<EditPageQaStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3936b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditPageQaStickerViewModel invoke() {
            b bVar = this.this$0;
            return new EditPageQaStickerViewModel(bVar, bVar.f146785a);
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (!this.f146791k.f(a())) {
            this.f146791k.a(this.f146786b, a(), "EditPageQaStickerScene");
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            this.this$0.f146787c.setMobHelper(this.this$0.f146785a);
            c cVar = new c(this.this$0.f146787c, this.this$0.getDiContainer(), this.this$0.f146785a);
            Object a2 = cVar.getDiContainer().a((Type) e.class, (String) null);
            l.b(a2, "");
            e eVar = (e) a2;
            l.d(eVar, "");
            cVar.d().f127187f = eVar;
            return cVar;
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar, QaStickerEditLayout qaStickerEditLayout, VideoPublishEditModel videoPublishEditModel) {
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(qaStickerEditLayout, "");
        l.d(videoPublishEditModel, "");
        this.f146790f = fVar;
        this.f146791k = bVar;
        this.f146787c = qaStickerEditLayout;
        this.f146785a = new com.ss.android.ugc.aweme.qasticker.a(videoPublishEditModel, 1);
        this.f146788d = i.a((h.f.a.a) new a(this));
        this.f146789e = new C3936b(this);
    }
}
