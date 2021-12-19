package org.webrtc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SurfaceTextureHelper$$Lambda$5 implements Runnable {
    private final SurfaceTextureHelper arg$1;

    static {
        Covode.recordClassIndex(106671);
    }

    SurfaceTextureHelper$$Lambda$5(SurfaceTextureHelper surfaceTextureHelper) {
        this.arg$1 = surfaceTextureHelper;
    }

    public final void run() {
        this.arg$1.lambda$dispose$5$SurfaceTextureHelper();
    }
}
