package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;

public interface IRTCASREngineEventHandler {
    static {
        Covode.recordClassIndex(100909);
    }

    void onError(int i2, String str);

    void onMessage(String str);

    void onSuccess();

    public enum RTCASRErrorCode {
        RTCASRErrorNetworkInterrupted(-1),
        RTCASRErrorAlreadyStarted(-2),
        RTCASRErrorTokenEmpty(-3),
        RTCErrorSignatureKeyEmpty(-4),
        RTCASRErrorUserIdNull(-5),
        RTCASRErrorAPPIDNull(-6),
        RTCASRErrorClusterNull(-7),
        RTCASRErrorOperationDenied(-8);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100910);
        }

        private RTCASRErrorCode(int i2) {
            this.value = i2;
        }
    }
}
