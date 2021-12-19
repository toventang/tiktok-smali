package com.ss.android.ugc.aweme.ftc.components.sticker.text;

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

public final class b extends com.bytedance.ui_component.b<FTCEditTextStickerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final s f98132a;

    /* renamed from: b  reason: collision with root package name */
    public final int f98133b;

    /* renamed from: c  reason: collision with root package name */
    private final h.f.a.a<FTCEditTextStickerViewModel> f98134c;

    /* renamed from: d  reason: collision with root package name */
    private final h f98135d;

    /* renamed from: e  reason: collision with root package name */
    private final f f98136e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.scene.group.b f98137f;

    /* renamed from: k  reason: collision with root package name */
    private final int f98138k = R.id.ek3;

    static {
        Covode.recordClassIndex(62385);
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<FTCEditTextStickerViewModel> b() {
        return this.f98134c;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f98137f;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f98136e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.b$b  reason: collision with other inner class name */
    static final class C2372b extends m implements h.f.a.a<FTCEditTextStickerViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2372b f98139a = new C2372b();

        static {
            Covode.recordClassIndex(62387);
        }

        C2372b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditTextStickerViewModel invoke() {
            return new FTCEditTextStickerViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        this.f98137f.a(this.f98138k, (r) this.f98135d.getValue(), "FTCEditTextStickerScene");
    }

    static final class a extends m implements h.f.a.a<r> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ r invoke() {
            r rVar = new r(this.this$0.getDiContainer(), this.this$0.f98132a, this.this$0.f98133b);
            j jVar = (j) rVar.getDiContainer().a((Type) j.class, (String) null);
            l.d(jVar, "");
            rVar.f98186a = jVar;
            e eVar = (e) rVar.getDiContainer().a((Type) e.class, (String) null);
            l.d(eVar, "");
            rVar.f98188c = eVar;
            i iVar = (i) rVar.getDiContainer().a((Type) i.class, (String) null);
            l.d(iVar, "");
            rVar.f98187b = iVar;
            return rVar;
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar, s sVar, int i2) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f98136e = fVar;
        this.f98137f = bVar;
        this.f98132a = sVar;
        this.f98133b = i2;
        this.f98134c = C2372b.f98139a;
        this.f98135d = h.i.a((h.f.a.a) new a(this));
    }
}
