package com.ss.android.ugc.aweme.editSticker.text.als;

import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.editSticker.text.view.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.lang.reflect.Type;

public final class b extends com.bytedance.ui_component.b<EditTextStickerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final d f88340a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f88341b;

    /* renamed from: c  reason: collision with root package name */
    public final int f88342c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f88343d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f88344e;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.a<EditTextStickerViewModel> f88345f;

    /* renamed from: k  reason: collision with root package name */
    private final h f88346k;

    /* renamed from: l  reason: collision with root package name */
    private final f f88347l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.scene.group.b f88348m;
    private final int n = R.id.ek3;

    static {
        Covode.recordClassIndex(55576);
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditTextStickerViewModel> b() {
        return this.f88345f;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f88348m;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f88347l;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.b$b  reason: collision with other inner class name */
    static final class C2143b extends m implements h.f.a.a<EditTextStickerViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2143b f88349a = new C2143b();

        static {
            Covode.recordClassIndex(55578);
        }

        C2143b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditTextStickerViewModel invoke() {
            return new EditTextStickerViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        this.f88348m.a(this.n, (c) this.f88346k.getValue(), "EditTextStickerScene");
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(55577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c(this.this$0.getDiContainer(), this.this$0.f88340a, this.this$0.f88342c, this.this$0.f88341b, this.this$0.f88344e);
            j jVar = (j) cVar.getDiContainer().a((Type) j.class, (String) null);
            l.d(jVar, "");
            cVar.f88351a = jVar;
            e eVar = (e) cVar.getDiContainer().a((Type) e.class, (String) null);
            l.d(eVar, "");
            cVar.f88353c = eVar;
            i iVar = (i) cVar.getDiContainer().a((Type) i.class, (String) null);
            l.d(iVar, "");
            cVar.f88352b = iVar;
            cVar.f88354d = this.this$0.f88343d;
            return cVar;
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar, d dVar, boolean z, int i2, boolean z2, boolean z3) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f88347l = fVar;
        this.f88348m = bVar;
        this.f88340a = dVar;
        this.f88341b = z;
        this.f88342c = i2;
        this.f88343d = z2;
        this.f88344e = z3;
        this.f88345f = C2143b.f88349a;
        this.f88346k = h.i.a((h.f.a.a) new a(this));
    }
}
