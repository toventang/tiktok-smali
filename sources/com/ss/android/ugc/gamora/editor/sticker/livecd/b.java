package com.ss.android.ugc.gamora.editor.sticker.livecd;

import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class b extends com.bytedance.ui_component.b<EditLiveCDStickerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f146677a = R.id.ek4;

    /* renamed from: b  reason: collision with root package name */
    public final LiveCDEditStickerLayout f146678b;

    /* renamed from: c  reason: collision with root package name */
    private final h f146679c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditLiveCDStickerViewModel> f146680d;

    /* renamed from: e  reason: collision with root package name */
    private final f f146681e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.scene.group.b f146682f;

    static {
        Covode.recordClassIndex(96561);
    }

    public final c a() {
        return (c) this.f146679c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditLiveCDStickerViewModel> b() {
        return this.f146680d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146682f;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146681e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.b$b  reason: collision with other inner class name */
    static final class C3928b extends m implements h.f.a.a<EditLiveCDStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96563);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3928b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditLiveCDStickerViewModel invoke() {
            return new EditLiveCDStickerViewModel(this.this$0);
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (!this.f146682f.f(a())) {
            this.f146682f.a(this.f146677a, a(), "EditLiveCountDownStickerScene");
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            Object a2 = this.this$0.getDiContainer().a(j.class);
            l.b(a2, "");
            c cVar = new c((j) a2, this.this$0.f146678b, this.this$0.getDiContainer());
            Object a3 = cVar.getDiContainer().a((Type) e.class, (String) null);
            l.b(a3, "");
            e eVar = (e) a3;
            l.d(eVar, "");
            cVar.d().f127187f = eVar;
            return cVar;
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar, LiveCDEditStickerLayout liveCDEditStickerLayout) {
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(liveCDEditStickerLayout, "");
        this.f146681e = fVar;
        this.f146682f = bVar;
        this.f146678b = liveCDEditStickerLayout;
        this.f146679c = i.a((h.f.a.a) new a(this));
        this.f146680d = new C3928b(this);
    }
}
