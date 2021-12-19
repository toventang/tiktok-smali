package com.bytedance.bae.router.device;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.bae.router.device.base.BaseAudioDeviceManager;
import com.bytedance.bae.router.device.base.IAudioDeviceManager;
import com.bytedance.covode.number.Covode;

public class EarpieceDeviceManager extends BaseAudioDeviceManager {
    static {
        Covode.recordClassIndex(15383);
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public void inactiveDevice() {
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public void activeDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setSpeakerphoneOn(false);
            audioManager.setBluetoothScoOn(false);
            audioManager.setBluetoothA2dpOn(false);
            audioManager.setWiredHeadsetOn(false);
        }
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public int getActiveState() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && !audioManager.isSpeakerphoneOn() && !audioManager.isBluetoothScoOn() && !audioManager.isBluetoothA2dpOn() && !audioManager.isWiredHeadsetOn()) {
            return 1;
        }
        return 2;
    }

    public EarpieceDeviceManager(Context context, IAudioDeviceManager.OnNotHotPlugableDeviceCallback onNotHotPlugableDeviceCallback) {
        super(context, onNotHotPlugableDeviceCallback);
    }
}
