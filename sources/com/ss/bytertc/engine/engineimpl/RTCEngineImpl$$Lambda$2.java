package com.ss.bytertc.engine.engineimpl;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.base.utils.NetworkConnectChangeReceiver;

/* access modifiers changed from: package-private */
public final /* synthetic */ class RTCEngineImpl$$Lambda$2 implements NetworkConnectChangeReceiver.Callback {
    private final RTCEngineImpl arg$1;

    static {
        Covode.recordClassIndex(100885);
    }

    RTCEngineImpl$$Lambda$2(RTCEngineImpl rTCEngineImpl) {
        this.arg$1 = rTCEngineImpl;
    }

    @Override // com.ss.bytertc.base.utils.NetworkConnectChangeReceiver.Callback
    public final void call(int i2) {
        this.arg$1.lambda$new$5$RTCEngineImpl(i2);
    }
}
