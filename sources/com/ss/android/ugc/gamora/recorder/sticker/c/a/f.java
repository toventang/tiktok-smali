package com.ss.android.ugc.gamora.recorder.sticker.c.a;

import android.widget.FrameLayout;
import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.LegacyGameStickerHandler;
import com.ss.android.ugc.tools.view.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import java.lang.reflect.Type;

public final class f implements com.bytedance.o.a, com.ss.android.ugc.gamora.recorder.sticker.a.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f148355a = {new y(f.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(f.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final d f148356b = ((d) getDiContainer().a(d.class, (String) null));

    /* renamed from: c  reason: collision with root package name */
    private final h.h.d f148357c = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);

    /* renamed from: d  reason: collision with root package name */
    private final h.h.d f148358d = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.o.f f148359e;

    static {
        Covode.recordClassIndex(97765);
    }

    public final com.bytedance.creativex.recorder.b.a.d a() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f148357c.a(this, f148355a[0]);
    }

    public final m b() {
        return (m) this.f148358d.a(this, f148355a[1]);
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f148359e;
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.types.game.m> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.game.a.a $listener;
        final /* synthetic */ com.bytedance.creativex.recorder.sticker.a.a $stickerApiComponent;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(97766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, com.bytedance.creativex.recorder.sticker.a.a aVar, com.ss.android.ugc.aweme.sticker.types.game.a.a aVar2) {
            super(0);
            this.this$0 = fVar;
            this.$stickerApiComponent = aVar;
            this.$listener = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.game.m invoke() {
            return com.ss.android.ugc.aweme.sticker.types.game.a.a(this.this$0.f148356b, (c) this.this$0.getDiContainer().a((Type) c.class, (String) null), this.this$0.a(), this.this$0.b(), this.$stickerApiComponent, (FrameLayout) this.this$0.f148356b.findViewById(R.id.c5v), this.$listener);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.types.game.m> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.game.a.a $listener;
        final /* synthetic */ com.bytedance.creativex.recorder.sticker.a.a $stickerApiComponent;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(97767);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, com.bytedance.creativex.recorder.sticker.a.a aVar, com.ss.android.ugc.aweme.sticker.types.game.a.a aVar2) {
            super(0);
            this.this$0 = fVar;
            this.$stickerApiComponent = aVar;
            this.$listener = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.game.m invoke() {
            return com.ss.android.ugc.aweme.sticker.types.game.a.a(this.this$0.f148356b, (c) this.this$0.getDiContainer().a((Type) c.class, (String) null), this.this$0.a(), this.this$0.b(), this.$stickerApiComponent, (FrameLayout) this.this$0.f148356b.findViewById(R.id.c5v), this.$listener);
        }
    }

    public f(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f148359e = fVar;
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.a.b
    public final LegacyGameStickerHandler a(com.bytedance.creativex.recorder.sticker.a.a aVar, com.ss.android.ugc.aweme.sticker.types.game.a.a aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        return new LegacyGameStickerHandler(this.f148356b, h.i.a((h.f.a.a) new b(this, aVar, aVar2)));
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.a.b
    public final GameStickerHandler b(com.bytedance.creativex.recorder.sticker.a.a aVar, com.ss.android.ugc.aweme.sticker.types.game.a.a aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        return new GameStickerHandler(this.f148356b, h.i.a((h.f.a.a) new a(this, aVar, aVar2)));
    }
}
