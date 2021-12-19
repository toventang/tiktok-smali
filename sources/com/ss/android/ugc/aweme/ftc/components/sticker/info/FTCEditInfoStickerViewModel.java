package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.o;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import h.f.b.l;
import h.f.b.m;
import h.u;
import java.util.Iterator;

public final class FTCEditInfoStickerViewModel extends LifecycleAwareViewModel<FTCEditInfoStickerState> implements a {

    /* renamed from: a  reason: collision with root package name */
    public c f97990a;

    static {
        Covode.recordClassIndex(62291);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final void a() {
        d(d.f97992a);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final void i() {
        c(c.f97991a);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final Object c() {
        c cVar = this.f97990a;
        if (cVar == null) {
            l.a("scene");
        }
        return cVar.C().J;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new FTCEditInfoStickerState(null, null, null, null, null, null, 63, null);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final com.ss.android.ugc.aweme.editSticker.interact.d h() {
        c cVar = this.f97990a;
        if (cVar == null) {
            l.a("scene");
        }
        return cVar.C();
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final void b() {
        c cVar = this.f97990a;
        if (cVar == null) {
            l.a("scene");
        }
        cVar.C().f();
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final boolean f() {
        c cVar = this.f97990a;
        if (cVar == null) {
            l.a("scene");
        }
        i C = cVar.C();
        if (C.f98069d != null) {
            return C.f98069d.w;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final boolean g() {
        c cVar = this.f97990a;
        if (cVar == null) {
            l.a("scene");
        }
        i C = cVar.C();
        if (C.f98069d != null) {
            return C.f98069d.x;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final void e() {
        c cVar = this.f97990a;
        if (cVar == null) {
            l.a("scene");
        }
        i C = cVar.C();
        if (C.f98069d != null) {
            h hVar = C.f98069d.f98000g;
            if (!h.a(hVar.f98055a)) {
                Iterator<com.ss.android.ugc.aweme.ftc.components.sticker.a> it = hVar.f98055a.iterator();
                while (it.hasNext()) {
                    com.ss.android.ugc.aweme.ftc.components.sticker.a next = it.next();
                    hVar.f98058d.g(next.f97894b.getId());
                    it.remove();
                    if (hVar.f98059e != null) {
                        hVar.f98059e.b(next.f97894b);
                    }
                }
                hVar.f98056b = null;
            }
        }
    }

    static final class b extends m implements h.f.a.b<FTCEditInfoStickerState, FTCEditInfoStickerState> {
        final /* synthetic */ StickerItemModel $item;

        static {
            Covode.recordClassIndex(62293);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StickerItemModel stickerItemModel) {
            super(1);
            this.$item = stickerItemModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
            FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
            l.d(fTCEditInfoStickerState2, "");
            return FTCEditInfoStickerState.copy$default(fTCEditInfoStickerState2, null, null, null, new com.bytedance.jedi.arch.d(this.$item), null, null, 55, null);
        }
    }

    static final class c extends m implements h.f.a.b<FTCEditInfoStickerState, FTCEditInfoStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f97991a = new c();

        static {
            Covode.recordClassIndex(62294);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
            FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
            l.d(fTCEditInfoStickerState2, "");
            return FTCEditInfoStickerState.copy$default(fTCEditInfoStickerState2, null, new p(), null, null, null, null, 61, null);
        }
    }

    static final class d extends m implements h.f.a.b<FTCEditInfoStickerState, FTCEditInfoStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f97992a = new d();

        static {
            Covode.recordClassIndex(62295);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
            FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
            l.d(fTCEditInfoStickerState2, "");
            return FTCEditInfoStickerState.copy$default(fTCEditInfoStickerState2, new a.b(), null, null, null, null, null, 62, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final void a(com.ss.android.ugc.aweme.editSticker.interact.h<?> hVar) {
        c cVar = this.f97990a;
        if (cVar == null) {
            l.a("scene");
        }
        cVar.C().a(true, (com.ss.android.ugc.aweme.editSticker.interact.h) hVar);
    }

    public static final class a extends m implements h.f.a.b<FTCEditInfoStickerState, FTCEditInfoStickerState> {
        final /* synthetic */ long $duration = 300;
        final /* synthetic */ float $toY;

        static {
            Covode.recordClassIndex(62292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(float f2) {
            super(1);
            this.$toY = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
            FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
            l.d(fTCEditInfoStickerState2, "");
            return FTCEditInfoStickerState.copy$default(fTCEditInfoStickerState2, null, null, null, null, new n(new h.p(Float.valueOf(this.$toY), Long.valueOf(this.$duration))), null, 47, null);
        }
    }

    public static final class e extends m implements h.f.a.b<FTCEditInfoStickerState, FTCEditInfoStickerState> {
        final /* synthetic */ float $scale;
        final /* synthetic */ float $x;
        final /* synthetic */ float $y;

        static {
            Covode.recordClassIndex(62296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(float f2, float f3, float f4) {
            super(1);
            this.$scale = f2;
            this.$x = f3;
            this.$y = f4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
            FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
            l.d(fTCEditInfoStickerState2, "");
            return FTCEditInfoStickerState.copy$default(fTCEditInfoStickerState2, null, null, null, null, null, new o(new u(Float.valueOf(this.$scale), Float.valueOf(this.$x), Float.valueOf(this.$y))), 31, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final void b(com.ss.android.ugc.aweme.editSticker.interact.h<?> hVar) {
        c cVar = this.f97990a;
        if (cVar == null) {
            l.a("scene");
        }
        cVar.C().a(hVar, 0);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final void a(boolean z) {
        c cVar = this.f97990a;
        if (cVar == null) {
            l.a("scene");
        }
        i C = cVar.C();
        if (C.f98069d != null) {
            FTCInfoStickerEditView fTCInfoStickerEditView = C.f98069d;
            fTCInfoStickerEditView.f98001h = z;
            if (!z && fTCInfoStickerEditView.f98000g.f98056b != null) {
                fTCInfoStickerEditView.f98000g.b();
                fTCInfoStickerEditView.D.b();
                fTCInfoStickerEditView.f98000g.a();
                fTCInfoStickerEditView.invalidate();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.a
    public final void a(int i2, int i3, int[] iArr) {
        l.d(iArr, "");
        c cVar = this.f97990a;
        if (cVar == null) {
            l.a("scene");
        }
        l.d(iArr, "");
        i C = cVar.C();
        if (C.r != null) {
            C.z.post(new z(C, i2, i3, iArr));
        }
    }
}
