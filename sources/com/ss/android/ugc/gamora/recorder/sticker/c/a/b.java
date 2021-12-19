package com.ss.android.ugc.gamora.recorder.sticker.c.a;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.LegacyGameStickerHandler;
import com.ss.android.ugc.aweme.utils.bi;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.z;

public final class b implements com.bytedance.o.a, com.ss.android.ugc.gamora.recorder.sticker.a.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f148319a = {new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.app.d f148320b = ((androidx.appcompat.app.d) getDiContainer().a(androidx.appcompat.app.d.class, (String) null));

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.b.a.d f148321c = ((com.bytedance.creativex.recorder.b.a.d) getDiContainer().a(com.bytedance.creativex.recorder.b.a.d.class, (String) null));

    /* renamed from: d  reason: collision with root package name */
    private final h.h.d f148322d = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: e  reason: collision with root package name */
    private final f f148323e;

    static {
        Covode.recordClassIndex(97750);
    }

    public final m a() {
        return (m) this.f148322d.a(this, f148319a[0]);
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f148323e;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.b$b  reason: collision with other inner class name */
    static final class C4003b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.creativex.recorder.sticker.a.a $stickerApiComponent;

        static {
            Covode.recordClassIndex(97752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4003b(com.bytedance.creativex.recorder.sticker.a.a aVar) {
            super(0);
            this.$stickerApiComponent = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$stickerApiComponent.b(false);
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.creativex.recorder.sticker.a.a $stickerApiComponent;

        static {
            Covode.recordClassIndex(97754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.creativex.recorder.sticker.a.a aVar) {
            super(0);
            this.$stickerApiComponent = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$stickerApiComponent.b(false);
            return z.f158842a;
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.types.game.m> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.game.a.a $listener;
        final /* synthetic */ com.bytedance.creativex.recorder.sticker.a.a $stickerApiComponent;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, com.bytedance.creativex.recorder.sticker.a.a aVar, com.ss.android.ugc.aweme.sticker.types.game.a.a aVar2) {
            super(0);
            this.this$0 = bVar;
            this.$stickerApiComponent = aVar;
            this.$listener = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.game.m invoke() {
            androidx.appcompat.app.d dVar = this.this$0.f148320b;
            com.ss.android.ugc.tools.view.a.c a2 = bi.a(this.this$0.f148320b);
            if (a2 != null) {
                return com.ss.android.ugc.aweme.sticker.types.game.a.a(dVar, a2, this.this$0.f148321c, this.this$0.a(), this.$stickerApiComponent, (FrameLayout) this.this$0.f148320b.findViewById(R.id.c5v), this.$listener);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.types.game.m> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.game.a.a $listener;
        final /* synthetic */ com.bytedance.creativex.recorder.sticker.a.a $stickerApiComponent;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, com.bytedance.creativex.recorder.sticker.a.a aVar, com.ss.android.ugc.aweme.sticker.types.game.a.a aVar2) {
            super(0);
            this.this$0 = bVar;
            this.$stickerApiComponent = aVar;
            this.$listener = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.game.m invoke() {
            androidx.appcompat.app.d dVar = this.this$0.f148320b;
            com.ss.android.ugc.tools.view.a.c a2 = bi.a(this.this$0.f148320b);
            if (a2 != null) {
                return com.ss.android.ugc.aweme.sticker.types.game.a.a(dVar, a2, this.this$0.f148321c, this.this$0.a(), this.$stickerApiComponent, (FrameLayout) this.this$0.f148320b.findViewById(R.id.c5v), this.$listener);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public b(f fVar) {
        l.d(fVar, "");
        this.f148323e = fVar;
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.a.b
    public final LegacyGameStickerHandler a(com.bytedance.creativex.recorder.sticker.a.a aVar, com.ss.android.ugc.aweme.sticker.types.game.a.a aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        return new LegacyGameStickerHandler(this.f148320b, h.i.a((h.f.a.a) new c(this, aVar, aVar2)), new d(aVar));
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.a.b
    public final GameStickerHandler b(com.bytedance.creativex.recorder.sticker.a.a aVar, com.ss.android.ugc.aweme.sticker.types.game.a.a aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        return new GameStickerHandler(this.f148320b, h.i.a((h.f.a.a) new a(this, aVar, aVar2)), new C4003b(aVar));
    }
}
