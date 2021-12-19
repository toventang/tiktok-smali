package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.utils.AppMonitor;

/* access modifiers changed from: package-private */
public final /* synthetic */ class GameRTCEngineImpl$$Lambda$0 implements AppMonitor.Callback {
    private final GameRTCEngineImpl arg$1;

    static {
        Covode.recordClassIndex(100744);
    }

    GameRTCEngineImpl$$Lambda$0(GameRTCEngineImpl gameRTCEngineImpl) {
        this.arg$1 = gameRTCEngineImpl;
    }

    @Override // com.ss.bytertc.engine.utils.AppMonitor.Callback
    public final void callback(int i2) {
        this.arg$1.lambda$new$0$GameRTCEngineImpl(i2);
    }
}
