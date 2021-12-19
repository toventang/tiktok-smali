package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.LiveStreamReport;

final /* synthetic */ class LiveCoreImpl$$Lambda$2 implements Runnable {
    private final LiveCoreImpl arg$1;
    private final LiveStreamReport arg$2;

    static {
        Covode.recordClassIndex(100098);
    }

    LiveCoreImpl$$Lambda$2(LiveCoreImpl liveCoreImpl, LiveStreamReport liveStreamReport) {
        this.arg$1 = liveCoreImpl;
        this.arg$2 = liveStreamReport;
    }

    public final void run() {
        this.arg$1.lambda$getLiveStreamInfo$2$LiveCoreImpl(this.arg$2);
    }
}
