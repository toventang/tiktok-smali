package com.ss.bytertc.engine.mediaio;

import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class SurfaceEglRender$$Lambda$0 implements Runnable {
    private final SurfaceEglRender arg$1;
    private final SurfaceView arg$2;

    static {
        Covode.recordClassIndex(101016);
    }

    SurfaceEglRender$$Lambda$0(SurfaceEglRender surfaceEglRender, SurfaceView surfaceView) {
        this.arg$1 = surfaceEglRender;
        this.arg$2 = surfaceView;
    }

    public final void run() {
        this.arg$1.lambda$bind$0$SurfaceEglRender(this.arg$2);
    }
}
