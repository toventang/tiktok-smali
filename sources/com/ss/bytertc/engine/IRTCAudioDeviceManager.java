package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public interface IRTCAudioDeviceManager {

    public interface IRTCAudioDeviceEventHandler {
        static {
            Covode.recordClassIndex(100752);
        }

        void onRecordingAudioVolumeIndication(int i2);
    }

    static {
        Covode.recordClassIndex(100751);
    }

    void setEnableSpeakerphone(boolean z);

    int startAudioCaptureDeviceTest(int i2);

    int startAudioPlaybackDeviceTest(String str);

    int stopAudioCaptureDeviceTest();

    int stopAudioPlaybackDeviceTest();
}
