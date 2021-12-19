package com.ss.avframework.livestreamv2.core;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.SurfaceTextureHelper;

final /* synthetic */ class ShortVideoPushManager$$Lambda$0 implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
    private final ShortVideoPushManager arg$1;
    private final Surface arg$2;
    private final SurfaceTextureHelper arg$3;

    static {
        Covode.recordClassIndex(100122);
    }

    ShortVideoPushManager$$Lambda$0(ShortVideoPushManager shortVideoPushManager, Surface surface, SurfaceTextureHelper surfaceTextureHelper) {
        this.arg$1 = shortVideoPushManager;
        this.arg$2 = surface;
        this.arg$3 = surfaceTextureHelper;
    }

    @Override // com.ss.avframework.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public final void onTextureFrameAvailable(int i2, float[] fArr, long j2) {
        this.arg$1.lambda$getSurface$0$ShortVideoPushManager(this.arg$2, this.arg$3, i2, fArr, j2);
    }
}
