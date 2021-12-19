package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;

public class RTCAudioDeviceManager implements IRTCAudioDeviceManager {
    private long mAudioDeviceManager = -1;

    static {
        Covode.recordClassIndex(100784);
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioCaptureDeviceTest() {
        MethodCollector.i(7844);
        int nativeStopAudioCaptureDeviceTest = NativeFunctions.nativeStopAudioCaptureDeviceTest(this.mAudioDeviceManager);
        MethodCollector.o(7844);
        return nativeStopAudioCaptureDeviceTest;
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioPlaybackDeviceTest() {
        MethodCollector.i(7837);
        int nativeStopAudioPlaybackDeviceTest = NativeFunctions.nativeStopAudioPlaybackDeviceTest(this.mAudioDeviceManager);
        MethodCollector.o(7837);
        return nativeStopAudioPlaybackDeviceTest;
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public void setEnableSpeakerphone(boolean z) {
        MethodCollector.i(7849);
        NativeFunctions.nativeSetEnableSpeakerphoneForTest(this.mAudioDeviceManager, z);
        MethodCollector.o(7849);
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int startAudioCaptureDeviceTest(int i2) {
        MethodCollector.i(7841);
        int nativeStartAudioCaptureDeviceTest = NativeFunctions.nativeStartAudioCaptureDeviceTest(this.mAudioDeviceManager, i2);
        MethodCollector.o(7841);
        return nativeStartAudioCaptureDeviceTest;
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int startAudioPlaybackDeviceTest(String str) {
        MethodCollector.i(7833);
        int nativeStartAudioPlaybackDeviceTest = NativeFunctions.nativeStartAudioPlaybackDeviceTest(this.mAudioDeviceManager, str);
        MethodCollector.o(7833);
        return nativeStartAudioPlaybackDeviceTest;
    }

    public RTCAudioDeviceManager(RTCAudioDeviceEventHandler rTCAudioDeviceEventHandler) {
        MethodCollector.i(7784);
        this.mAudioDeviceManager = NativeFunctions.nativeCreateAudioDeviceManager(rTCAudioDeviceEventHandler);
        MethodCollector.o(7784);
    }
}
