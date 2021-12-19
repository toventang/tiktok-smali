package org.webrtc;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class SurfaceViewRenderer$$Lambda$0 implements Runnable {
    private final SurfaceViewRenderer arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(106677);
    }

    SurfaceViewRenderer$$Lambda$0(SurfaceViewRenderer surfaceViewRenderer, int i2, int i3) {
        this.arg$1 = surfaceViewRenderer;
        this.arg$2 = i2;
        this.arg$3 = i3;
    }

    public final void run() {
        this.arg$1.lambda$onFrameResolutionChanged$0$SurfaceViewRenderer(this.arg$2, this.arg$3);
    }
}
