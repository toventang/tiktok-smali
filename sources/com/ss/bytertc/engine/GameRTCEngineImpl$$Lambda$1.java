package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.base.utils.NetworkConnectChangeReceiver;

/* access modifiers changed from: package-private */
public final /* synthetic */ class GameRTCEngineImpl$$Lambda$1 implements NetworkConnectChangeReceiver.Callback {
    private final GameRTCEngineImpl arg$1;

    static {
        Covode.recordClassIndex(100745);
    }

    GameRTCEngineImpl$$Lambda$1(GameRTCEngineImpl gameRTCEngineImpl) {
        this.arg$1 = gameRTCEngineImpl;
    }

    @Override // com.ss.bytertc.base.utils.NetworkConnectChangeReceiver.Callback
    public final void call(int i2) {
        this.arg$1.lambda$new$3$GameRTCEngineImpl(i2);
    }
}
