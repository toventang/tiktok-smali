package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;

public class RTCASREngineEventHandler {
    private IRTCASREngineEventHandler asrEventHandler;

    static {
        Covode.recordClassIndex(100951);
    }

    public void onSuccess() {
        IRTCASREngineEventHandler iRTCASREngineEventHandler = this.asrEventHandler;
        if (iRTCASREngineEventHandler != null) {
            iRTCASREngineEventHandler.onSuccess();
        }
    }

    public void setAsrEventHandler(IRTCASREngineEventHandler iRTCASREngineEventHandler) {
        this.asrEventHandler = iRTCASREngineEventHandler;
    }

    public void onMessage(String str) {
        IRTCASREngineEventHandler iRTCASREngineEventHandler = this.asrEventHandler;
        if (iRTCASREngineEventHandler != null) {
            iRTCASREngineEventHandler.onMessage(str);
        }
    }

    public void onError(int i2, String str) {
        IRTCASREngineEventHandler iRTCASREngineEventHandler = this.asrEventHandler;
        if (iRTCASREngineEventHandler != null) {
            iRTCASREngineEventHandler.onError(i2, str);
        }
    }
}
