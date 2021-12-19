package com.ss.android.ugc.gamora.editor.sticker.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.setting.i.k;
import com.ss.android.ugc.gamora.editor.ab;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.bytedance.ui_component.b<EditStickerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f146416a;

    /* renamed from: b  reason: collision with root package name */
    private final h.f.a.a<EditStickerViewModel> f146417b;

    /* renamed from: c  reason: collision with root package name */
    private final h f146418c;

    /* renamed from: d  reason: collision with root package name */
    private final f f146419d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.scene.group.b f146420e;

    /* renamed from: f  reason: collision with root package name */
    private final int f146421f = R.id.ata;

    static {
        Covode.recordClassIndex(96285);
    }

    private final c a() {
        return (c) this.f146418c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditStickerViewModel> b() {
        return this.f146417b;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146420e;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146419d;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.b$b  reason: collision with other inner class name */
    static final class C3918b extends m implements h.f.a.a<EditStickerViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3918b f146422a = new C3918b();

        static {
            Covode.recordClassIndex(96287);
        }

        C3918b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditStickerViewModel invoke() {
            return new EditStickerViewModel();
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96286);
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

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        if (!this.f146416a) {
            ((EditStickerViewModel) j()).a(a());
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (this.f146416a) {
            com.bytedance.scene.group.b bVar = this.f146420e;
            int i2 = this.f146421f;
            c a2 = a();
            a2.a((j) getDiContainer().a(j.class, (String) null));
            a2.a((ab) getDiContainer().a(ab.class, (String) null));
            bVar.a(i2, a2, "EditStickerScene");
            ((EditStickerViewModel) j()).a(a());
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f146419d = fVar;
        this.f146420e = bVar;
        boolean booleanValue = ((Boolean) k.f122226a.getValue()).booleanValue();
        this.f146416a = booleanValue;
        this.f146417b = C3918b.f146422a;
        this.f146418c = i.a((h.f.a.a) new a(this));
        if (!booleanValue) {
            c a2 = a();
            a2.a((j) getDiContainer().a(j.class, (String) null));
            a2.a((e) getDiContainer().a(e.class, (String) null));
            a2.a((ab) getDiContainer().a(ab.class, (String) null));
            bVar.a(R.id.ata, a2, "EditStickerScene");
        }
    }
}
