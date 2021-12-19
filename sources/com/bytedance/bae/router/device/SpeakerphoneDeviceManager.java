package com.bytedance.bae.router.device;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.bae.router.device.base.BaseAudioDeviceManager;
import com.bytedance.bae.router.device.base.IAudioDeviceManager;
import com.bytedance.covode.number.Covode;

public class SpeakerphoneDeviceManager extends BaseAudioDeviceManager {
    static {
        Covode.recordClassIndex(15384);
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public void activeDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.stopBluetoothSco();
            audioManager.setSpeakerphoneOn(true);
        }
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public void inactiveDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setSpeakerphoneOn(false);
        }
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public int getActiveState() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && audioManager.isSpeakerphoneOn()) {
            return 1;
        }
        return 2;
    }

    public SpeakerphoneDeviceManager(Context context, IAudioDeviceManager.OnNotHotPlugableDeviceCallback onNotHotPlugableDeviceCallback) {
        super(context, onNotHotPlugableDeviceCallback);
    }
}
