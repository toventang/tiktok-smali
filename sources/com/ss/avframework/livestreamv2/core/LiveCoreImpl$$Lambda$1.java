package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class LiveCoreImpl$$Lambda$1 implements Runnable {
    private final LiveCoreImpl arg$1;

    static {
        Covode.recordClassIndex(100097);
    }

    LiveCoreImpl$$Lambda$1(LiveCoreImpl liveCoreImpl) {
        this.arg$1 = liveCoreImpl;
    }

    public final void run() {
        this.arg$1.lambda$startReportNetworkQuality$1$LiveCoreImpl();
    }
}
