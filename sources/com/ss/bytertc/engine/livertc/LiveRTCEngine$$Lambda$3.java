package com.ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;

/* access modifiers changed from: package-private */
public final /* synthetic */ class LiveRTCEngine$$Lambda$3 implements Runnable {
    private final IRTCEngineEventHandler arg$1;

    static {
        Covode.recordClassIndex(100983);
    }

    LiveRTCEngine$$Lambda$3(IRTCEngineEventHandler iRTCEngineEventHandler) {
        this.arg$1 = iRTCEngineEventHandler;
    }

    public final void run() {
        this.arg$1.onError(1214);
    }
}
