package org.webrtc;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class RXScreenCaptureService$$Lambda$3 implements Runnable {
    private final VideoFrame arg$1;

    static {
        Covode.recordClassIndex(106641);
    }

    RXScreenCaptureService$$Lambda$3(VideoFrame videoFrame) {
        this.arg$1 = videoFrame;
    }

    public final void run() {
        RXScreenCaptureService.lambda$onFrame$3$RXScreenCaptureService(this.arg$1);
    }
}
