package com.ss.bytertc.engine.engineimpl;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.utils.AppMonitor;

/* access modifiers changed from: package-private */
public final /* synthetic */ class RTCEngineImpl$$Lambda$1 implements AppMonitor.Callback {
    private final RTCEngineImpl arg$1;

    static {
        Covode.recordClassIndex(100884);
    }

    RTCEngineImpl$$Lambda$1(RTCEngineImpl rTCEngineImpl) {
        this.arg$1 = rTCEngineImpl;
    }

    @Override // com.ss.bytertc.engine.utils.AppMonitor.Callback
    public final void callback(int i2) {
        this.arg$1.lambda$new$1$RTCEngineImpl(i2);
    }
}
