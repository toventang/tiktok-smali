package com.ss.android.ugc.gamora.editor.sticker.info;

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

public final class b extends com.bytedance.ui_component.b<EditInfoStickerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f146644a;

    /* renamed from: b  reason: collision with root package name */
    private final h.f.a.a<EditInfoStickerViewModel> f146645b;

    /* renamed from: c  reason: collision with root package name */
    private final h f146646c;

    /* renamed from: d  reason: collision with root package name */
    private final f f146647d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.scene.group.b f146648e;

    /* renamed from: f  reason: collision with root package name */
    private final int f146649f = R.id.boi;

    static {
        Covode.recordClassIndex(96520);
    }

    public final c a() {
        return (c) this.f146646c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditInfoStickerViewModel> b() {
        return this.f146645b;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146648e;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146647d;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.b$b  reason: collision with other inner class name */
    static final class C3926b extends m implements h.f.a.a<EditInfoStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3926b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditInfoStickerViewModel invoke() {
            EditInfoStickerViewModel editInfoStickerViewModel = new EditInfoStickerViewModel();
            c a2 = this.this$0.a();
            l.d(a2, "");
            editInfoStickerViewModel.f146639a = a2;
            return editInfoStickerViewModel;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (!this.f146648e.f(a())) {
            this.f146648e.a(this.f146649f, a(), "EditInfoStickerScene");
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96521);
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
            cVar.f146653c = jVar;
            cVar.E().z = (e) cVar.getDiContainer().a((Type) e.class, (String) null);
            FrameLayout frameLayout = this.this$0.f146644a;
            l.d(frameLayout, "");
            cVar.f146655e = frameLayout;
            return cVar;
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar, FrameLayout frameLayout) {
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(frameLayout, "");
        this.f146647d = fVar;
        this.f146648e = bVar;
        this.f146644a = frameLayout;
        this.f146645b = new C3926b(this);
        this.f146646c = i.a((h.f.a.a) new a(this));
    }
}
