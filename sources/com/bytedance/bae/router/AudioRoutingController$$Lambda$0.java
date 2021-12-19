package com.bytedance.bae.router;

import com.bytedance.bae.router.device.base.IAudioDeviceManager;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class AudioRoutingController$$Lambda$0 implements IAudioDeviceManager.OnNotHotPlugableDeviceCallback {
    private final AudioRoutingController arg$1;

    static {
        Covode.recordClassIndex(15361);
    }

    AudioRoutingController$$Lambda$0(AudioRoutingController audioRoutingController) {
        this.arg$1 = audioRoutingController;
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
    public final void onError(int i2, String str) {
        this.arg$1.lambda$initialize$0$AudioRoutingController(i2, str);
    }
}
