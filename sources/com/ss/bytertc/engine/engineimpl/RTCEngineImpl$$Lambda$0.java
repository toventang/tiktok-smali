package com.ss.bytertc.engine.engineimpl;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.utils.LogUtil;

/* access modifiers changed from: package-private */
public final /* synthetic */ class RTCEngineImpl$$Lambda$0 implements LogUtil.LoggerSink {
    private final RTCEngineImpl arg$1;

    static {
        Covode.recordClassIndex(100883);
    }

    RTCEngineImpl$$Lambda$0(RTCEngineImpl rTCEngineImpl) {
        this.arg$1 = rTCEngineImpl;
    }

    @Override // com.ss.bytertc.engine.utils.LogUtil.LoggerSink
    public final void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th) {
        this.arg$1.lambda$new$0$RTCEngineImpl(logLevel, str, th);
    }
}
