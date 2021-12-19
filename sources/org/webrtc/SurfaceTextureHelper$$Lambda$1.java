package org.webrtc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SurfaceTextureHelper$$Lambda$1 implements Runnable {
    private final SurfaceTextureHelper arg$1;

    static {
        Covode.recordClassIndex(106667);
    }

    SurfaceTextureHelper$$Lambda$1(SurfaceTextureHelper surfaceTextureHelper) {
        this.arg$1 = surfaceTextureHelper;
    }

    public final void run() {
        this.arg$1.lambda$stopListening$1$SurfaceTextureHelper();
    }
}
