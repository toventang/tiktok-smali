package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class LiveStream$$Lambda$3 implements Runnable {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(99882);
    }

    LiveStream$$Lambda$3(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    public final void run() {
        this.arg$1.lambda$startAudioCapture$3$LiveStream();
    }
}
