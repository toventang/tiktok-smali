package com.ss.bytertc.engine.ui;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class VideoFrameRender$$Lambda$1 implements Runnable {
    private final VideoFrameRender arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(101024);
    }

    VideoFrameRender$$Lambda$1(VideoFrameRender videoFrameRender, int i2, int i3) {
        this.arg$1 = videoFrameRender;
        this.arg$2 = i2;
        this.arg$3 = i3;
    }

    public final void run() {
        this.arg$1.lambda$onFrameResolutionChanged$1$VideoFrameRender(this.arg$2, this.arg$3);
    }
}
