package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.IRTCAudioDeviceManager;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;

public class RTCAudioDeviceEventHandler {
    static {
        Covode.recordClassIndex(100952);
    }

    /* access modifiers changed from: package-private */
    public void OnLoopbackAudioVolumeIndication(int i2) {
    }

    /* access modifiers changed from: package-private */
    public void onRecordingAudioVolumeIndication(int i2) {
        IRTCAudioDeviceManager.IRTCAudioDeviceEventHandler audioDeviceManagerEvent = RTCEngineImpl.getAudioDeviceManagerEvent();
        if (audioDeviceManagerEvent != null) {
            audioDeviceManagerEvent.onRecordingAudioVolumeIndication(i2);
        }
    }
}
