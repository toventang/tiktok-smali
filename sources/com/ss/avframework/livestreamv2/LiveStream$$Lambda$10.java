package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class LiveStream$$Lambda$10 implements Runnable {
    private final LiveStream arg$1;
    private final boolean arg$2;

    static {
        Covode.recordClassIndex(99876);
    }

    LiveStream$$Lambda$10(LiveStream liveStream, boolean z) {
        this.arg$1 = liveStream;
        this.arg$2 = z;
    }

    public final void run() {
        this.arg$1.lambda$setAudioMute$8$LiveStream(this.arg$2);
    }
}
