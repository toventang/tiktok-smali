package org.webrtc;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class RXScreenCaptureService$$Lambda$2 implements Runnable {
    private final int arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(106640);
    }

    RXScreenCaptureService$$Lambda$2(int i2, int i3, int i4) {
        this.arg$1 = i2;
        this.arg$2 = i3;
        this.arg$3 = i4;
    }

    public final void run() {
        RXScreenCaptureService.lambda$changeCaptureFormat$2$RXScreenCaptureService(this.arg$1, this.arg$2, this.arg$3);
    }
}
