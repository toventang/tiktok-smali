package com.ss.android.ugc.gamora.editor.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.bytedance.ui_component.b<EditStickerPanelViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f146706a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    private final h.f.a.a<EditStickerPanelViewModel> f146707b = new C3931b(this);

    /* renamed from: c  reason: collision with root package name */
    private final f f146708c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.scene.group.b f146709d;

    /* renamed from: e  reason: collision with root package name */
    private final int f146710e = R.id.c9b;

    static {
        Covode.recordClassIndex(96591);
    }

    public final c a() {
        return (c) this.f146706a.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditStickerPanelViewModel> b() {
        return this.f146707b;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146709d;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146708c;
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c(this.this$0.getDiContainer());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.b$b  reason: collision with other inner class name */
    static final class C3931b extends m implements h.f.a.a<EditStickerPanelViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3931b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditStickerPanelViewModel invoke() {
            return new EditStickerPanelViewModel(this.this$0.a());
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (!this.f146709d.f(a())) {
            this.f146709d.a(this.f146710e, a(), "EditStickerPanelScene");
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f146708c = fVar;
        this.f146709d = bVar;
    }
}
