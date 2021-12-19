package com.ss.android.ugc.aweme.ttep.ttepcomponent;

import android.view.MotionEvent;
import androidx.fragment.app.e;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.f.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.ax;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.z;

public final class TTEPPreviewEffectLogicComponent extends j<a> implements com.bytedance.o.a, a {
    static final /* synthetic */ i[] $$delegatedProperties = {new y(TTEPPreviewEffectLogicComponent.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new y(TTEPPreviewEffectLogicComponent.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new y(TTEPPreviewEffectLogicComponent.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new y(TTEPPreviewEffectLogicComponent.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};
    private final e activity = ((e) getDiContainer().a(e.class, (String) null));
    private final d cameraApi$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
    private final f diContainer;
    private final d filterApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.filter.a.a.class);
    private final d gestureApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.gesture.api.b.class);
    private boolean isFirst = true;
    private final d stickerApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);

    static {
        Covode.recordClassIndex(92321);
    }

    private final com.bytedance.creativex.recorder.filter.a.a getFilterApiComponent() {
        return (com.bytedance.creativex.recorder.filter.a.a) this.filterApiComponent$delegate.a(this, $$delegatedProperties[1]);
    }

    private final com.bytedance.creativex.recorder.gesture.api.b getGestureApiComponent() {
        return (com.bytedance.creativex.recorder.gesture.api.b) this.gestureApiComponent$delegate.a(this, $$delegatedProperties[2]);
    }

    private final com.ss.android.ugc.gamora.recorder.sticker.c.j getStickerApiComponent() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.stickerApiComponent$delegate.a(this, $$delegatedProperties[0]);
    }

    public final com.bytedance.creativex.recorder.b.a.d getCameraApi() {
        return (com.bytedance.creativex.recorder.b.a.d) this.cameraApi$delegate.a(this, $$delegatedProperties[3]);
    }

    public static final class b extends com.bytedance.creativex.recorder.gesture.api.d {
        static {
            Covode.recordClassIndex(92324);
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean c(MotionEvent motionEvent) {
            return true;
        }

        b() {
        }
    }

    @Override // com.bytedance.als.j
    public final a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.diContainer;
    }

    public static final class a implements r<Integer, Integer, String, ax, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TTEPPreviewEffectLogicComponent f141355a;

        static {
            Covode.recordClassIndex(92322);
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent$a$a  reason: collision with other inner class name */
        static final class C3747a extends m implements h.f.a.a<z> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(92323);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3747a(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f141355a.applyEffect();
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(TTEPPreviewEffectLogicComponent tTEPPreviewEffectLogicComponent) {
            this.f141355a = tTEPPreviewEffectLogicComponent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(Integer num, Integer num2, String str, ax axVar) {
            int intValue = num.intValue();
            num2.intValue();
            l.d(axVar, "");
            if (intValue == 1050) {
                this.f141355a.getCameraApi().D().b(this);
                g.a(new C3747a(this));
            }
            return z.f158842a;
        }
    }

    private final Effect getPreviewEffect() {
        return (Effect) this.activity.getIntent().getParcelableExtra("extra_ttep_preview_effect");
    }

    public final void applyEffect() {
        if (this.isFirst) {
            this.isFirst = false;
            Effect previewEffect = getPreviewEffect();
            if (previewEffect != null) {
                com.ss.android.ugc.aweme.sticker.f.e.a(getStickerApiComponent(), previewEffect);
            }
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        getCameraApi().D().a(new a(this));
        getFilterApiComponent().setFilterDisable(true, "build_in");
        getGestureApiComponent().a(new b());
        com.ss.android.ugc.aweme.sticker.repository.a.j i2 = getStickerApiComponent().t().c().i();
        Effect previewEffect = getPreviewEffect();
        if (previewEffect != null) {
            i2.a(new com.ss.android.ugc.aweme.ttep.ttepcomponent.c.a(previewEffect, this.activity));
        }
    }

    public TTEPPreviewEffectLogicComponent(f fVar) {
        l.d(fVar, "");
        this.diContainer = fVar;
    }
}
