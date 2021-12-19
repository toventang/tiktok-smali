package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class LiveStream$$Lambda$4 implements Runnable {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(99883);
    }

    LiveStream$$Lambda$4(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    public final void run() {
        this.arg$1.lambda$stopVideoCapture$4$LiveStream();
    }
}
