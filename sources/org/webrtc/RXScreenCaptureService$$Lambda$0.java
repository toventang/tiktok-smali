package org.webrtc;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class RXScreenCaptureService$$Lambda$0 implements Runnable {
    private final int arg$1;
    private final int arg$2;
    private final int arg$3;
    private final int arg$4;

    static {
        Covode.recordClassIndex(106638);
    }

    RXScreenCaptureService$$Lambda$0(int i2, int i3, int i4, int i5) {
        this.arg$1 = i2;
        this.arg$2 = i3;
        this.arg$3 = i4;
        this.arg$4 = i5;
    }

    public final void run() {
        RXScreenCaptureService.lambda$startCapture$0$RXScreenCaptureService(this.arg$1, this.arg$2, this.arg$3, this.arg$4);
    }
}
