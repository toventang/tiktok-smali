package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class LiveStream$$Lambda$9 implements Runnable {
    private final LiveStream arg$1;
    private final int arg$2;

    static {
        Covode.recordClassIndex(99888);
    }

    LiveStream$$Lambda$9(LiveStream liveStream, int i2) {
        this.arg$1 = liveStream;
        this.arg$2 = i2;
    }

    public final void run() {
        this.arg$1.lambda$switchVideoCapture$7$LiveStream(this.arg$2);
    }
}
