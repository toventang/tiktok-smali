package com.bytedance.bae.router.device;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager;
import com.bytedance.bae.router.device.base.IAudioDeviceManager;
import com.bytedance.bae.router.receiver.WiredHeadsetBroadcastReceiver;
import com.bytedance.bae.router.receiver.base.BaseAudioDeviceBroadcastReceiver;
import com.bytedance.covode.number.Covode;

public class WiredHeadsetDeviceManager extends BaseHotplugAudioDeviceManager {

    public interface OnDeviceCallback extends IAudioDeviceManager.OnHotPlugDeviceCallback {
        static {
            Covode.recordClassIndex(15386);
        }

        void reportHeadsetType(int i2);
    }

    static {
        Covode.recordClassIndex(15385);
    }

    @Override // com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager
    public void onStickyIntentFoundWhenRegister(Intent intent) {
    }

    @Override // com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager
    public BaseAudioDeviceBroadcastReceiver getBroadcastReceiver() {
        return new WiredHeadsetBroadcastReceiver(this);
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public void inactiveDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setWiredHeadsetOn(false);
        }
    }

    public boolean isDevicePlugged() {
        if (2 == getOnlineState()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public void activeDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(false);
            audioManager.setWiredHeadsetOn(true);
        }
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public int getActiveState() {
        AudioManager audioManager;
        if (getOnlineState() == 2 && (audioManager = getAudioManager()) != null && audioManager.isWiredHeadsetOn()) {
            return 1;
        }
        return 2;
    }

    @Override // com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager
    public IntentFilter getBroadcastIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        return intentFilter;
    }

    public void reportHeadsetType(int i2) {
        if (this.mCallback instanceof OnDeviceCallback) {
            ((OnDeviceCallback) this.mCallback).reportHeadsetType(i2);
        }
    }

    public WiredHeadsetDeviceManager(Context context, OnDeviceCallback onDeviceCallback) {
        super(context, onDeviceCallback, true);
    }
}
