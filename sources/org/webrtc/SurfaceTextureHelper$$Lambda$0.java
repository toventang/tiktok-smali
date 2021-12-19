package org.webrtc;

import android.graphics.SurfaceTexture;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SurfaceTextureHelper$$Lambda$0 implements SurfaceTexture.OnFrameAvailableListener {
    private final SurfaceTextureHelper arg$1;

    static {
        Covode.recordClassIndex(106666);
    }

    SurfaceTextureHelper$$Lambda$0(SurfaceTextureHelper surfaceTextureHelper) {
        this.arg$1 = surfaceTextureHelper;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.arg$1.lambda$new$0$SurfaceTextureHelper(surfaceTexture);
    }
}
