package com.ss.android.ugc.aweme.ftc.components.sticker.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.gamora.editor.ab;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.bytedance.ui_component.b<FTCEditStickerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<FTCEditStickerViewModel> f97934a = C2367b.f97938a;

    /* renamed from: b  reason: collision with root package name */
    private final h f97935b;

    /* renamed from: c  reason: collision with root package name */
    private final f f97936c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.scene.group.b f97937d;

    static {
        Covode.recordClassIndex(62241);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<FTCEditStickerViewModel> b() {
        return this.f97934a;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f97937d;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f97936c;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.b$b  reason: collision with other inner class name */
    static final class C2367b extends m implements h.f.a.a<FTCEditStickerViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2367b f97938a = new C2367b();

        static {
            Covode.recordClassIndex(62243);
        }

        C2367b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditStickerViewModel invoke() {
            return new FTCEditStickerViewModel();
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62242);
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

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f97936c = fVar;
        this.f97937d = bVar;
        h a2 = i.a((h.f.a.a) new a(this));
        this.f97935b = a2;
        c cVar = (c) a2.getValue();
        j jVar = (j) getDiContainer().a(j.class, (String) null);
        l.d(jVar, "");
        cVar.f97939b = jVar;
        e eVar = (e) getDiContainer().a(e.class, (String) null);
        l.d(eVar, "");
        cVar.f97940c = eVar;
        ab abVar = (ab) getDiContainer().a(ab.class, (String) null);
        l.d(abVar, "");
        cVar.f97945h = abVar;
        bVar.a(R.id.ata, cVar, "FTCEditStickerScene");
    }
}
