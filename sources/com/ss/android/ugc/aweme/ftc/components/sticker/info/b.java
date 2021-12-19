package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class b extends com.bytedance.ui_component.b<FTCEditInfoStickerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f98029a;

    /* renamed from: b  reason: collision with root package name */
    private final h.f.a.a<FTCEditInfoStickerViewModel> f98030b;

    /* renamed from: c  reason: collision with root package name */
    private final h f98031c;

    /* renamed from: d  reason: collision with root package name */
    private final f f98032d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.scene.group.b f98033e;

    /* renamed from: f  reason: collision with root package name */
    private final int f98034f = R.id.boi;

    static {
        Covode.recordClassIndex(62313);
    }

    public final c a() {
        return (c) this.f98031c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<FTCEditInfoStickerViewModel> b() {
        return this.f98030b;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f98033e;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f98032d;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.b$b  reason: collision with other inner class name */
    static final class C2370b extends m implements h.f.a.a<FTCEditInfoStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2370b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditInfoStickerViewModel invoke() {
            FTCEditInfoStickerViewModel fTCEditInfoStickerViewModel = new FTCEditInfoStickerViewModel();
            c a2 = this.this$0.a();
            l.d(a2, "");
            fTCEditInfoStickerViewModel.f97990a = a2;
            return fTCEditInfoStickerViewModel;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (!this.f98033e.f(a())) {
            this.f98033e.a(this.f98034f, a(), "FTCEditInfoStickerScene");
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c(this.this$0.getDiContainer());
            j jVar = (j) cVar.getDiContainer().a((Type) j.class, (String) null);
            l.d(jVar, "");
            cVar.f98037b = jVar;
            cVar.C().y = (e) cVar.getDiContainer().a((Type) e.class, (String) null);
            FrameLayout frameLayout = this.this$0.f98029a;
            l.d(frameLayout, "");
            cVar.f98039d = frameLayout;
            return cVar;
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar, FrameLayout frameLayout) {
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(frameLayout, "");
        this.f98032d = fVar;
        this.f98033e = bVar;
        this.f98029a = frameLayout;
        this.f98030b = new C2370b(this);
        this.f98031c = i.a((h.f.a.a) new a(this));
    }
}
