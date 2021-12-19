package org.webrtc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SurfaceTextureHelper$$Lambda$2 implements Runnable {
    private final SurfaceTextureHelper arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(106668);
    }

    SurfaceTextureHelper$$Lambda$2(SurfaceTextureHelper surfaceTextureHelper, int i2, int i3) {
        this.arg$1 = surfaceTextureHelper;
        this.arg$2 = i2;
        this.arg$3 = i3;
    }

    public final void run() {
        this.arg$1.lambda$setTextureSize$2$SurfaceTextureHelper(this.arg$2, this.arg$3);
    }
}
