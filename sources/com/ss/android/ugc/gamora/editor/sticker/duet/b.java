package com.ss.android.ugc.gamora.editor.sticker.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class b extends com.bytedance.ui_component.b<EditDuetStickerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f146616a = R.id.aqu;

    /* renamed from: b  reason: collision with root package name */
    public final DuetEditStickerLayout f146617b;

    /* renamed from: c  reason: collision with root package name */
    private final h f146618c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditDuetStickerViewModel> f146619d;

    /* renamed from: e  reason: collision with root package name */
    private final f f146620e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.scene.group.b f146621f;

    static {
        Covode.recordClassIndex(96493);
    }

    public final c a() {
        return (c) this.f146618c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditDuetStickerViewModel> b() {
        return this.f146619d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146621f;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146620e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.b$b  reason: collision with other inner class name */
    static final class C3924b extends m implements h.f.a.a<EditDuetStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3924b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditDuetStickerViewModel invoke() {
            return new EditDuetStickerViewModel(this.this$0);
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (!this.f146621f.f(a())) {
            this.f146621f.a(this.f146616a, a(), "EditDuetStickerScene");
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c(this.this$0.f146617b, this.this$0.getDiContainer());
            Object a2 = cVar.getDiContainer().a((Type) e.class, (String) null);
            l.b(a2, "");
            e eVar = (e) a2;
            l.d(eVar, "");
            cVar.d().f127187f = eVar;
            return cVar;
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar, DuetEditStickerLayout duetEditStickerLayout) {
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(duetEditStickerLayout, "");
        this.f146620e = fVar;
        this.f146621f = bVar;
        this.f146617b = duetEditStickerLayout;
        this.f146618c = i.a((h.f.a.a) new a(this));
        this.f146619d = new C3924b(this);
    }
}
