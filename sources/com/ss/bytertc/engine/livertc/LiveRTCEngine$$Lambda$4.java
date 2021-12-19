package com.ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class LiveRTCEngine$$Lambda$4 implements Runnable {
    private final LiveRTCEngine arg$1;

    static {
        Covode.recordClassIndex(100984);
    }

    LiveRTCEngine$$Lambda$4(LiveRTCEngine liveRTCEngine) {
        this.arg$1 = liveRTCEngine;
    }

    public final void run() {
        this.arg$1.lambda$parseRTCExtInfo$4$LiveRTCEngine();
    }
}
