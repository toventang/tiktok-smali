package com.ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class RTCPhoneStateListener$$Lambda$0 implements Runnable {
    private final RTCPhoneStateListener arg$1;
    private final boolean arg$2;

    static {
        Covode.recordClassIndex(100997);
    }

    RTCPhoneStateListener$$Lambda$0(RTCPhoneStateListener rTCPhoneStateListener, boolean z) {
        this.arg$1 = rTCPhoneStateListener;
        this.arg$2 = z;
    }

    public final void run() {
        this.arg$1.lambda$onCallEnd$0$RTCPhoneStateListener(this.arg$2);
    }
}
