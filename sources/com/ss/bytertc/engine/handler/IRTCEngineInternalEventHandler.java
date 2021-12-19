package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;

public abstract class IRTCEngineInternalEventHandler {
    static {
        Covode.recordClassIndex(100949);
    }

    public void onChannelTypeChanged(boolean z) {
    }

    public void onConfigAddrChanged(String str) {
    }

    public void onPeerConnectionICEMux(boolean z) {
    }

    public void onSignalingAddrChanged(String str) {
    }

    public void onSystemInfoLog(double d2, double d3, double d4) {
    }
}
