package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class LiveStream$$Lambda$8 implements Runnable {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(99887);
    }

    LiveStream$$Lambda$8(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    public final void run() {
        this.arg$1.lambda$release$6$LiveStream();
    }
}
