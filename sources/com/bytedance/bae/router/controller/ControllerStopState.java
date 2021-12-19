package com.bytedance.bae.router.controller;

import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.router.IAudioRoutingController;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class ControllerStopState extends ControllerBaseState {
    static {
        Covode.recordClassIndex(15377);
    }

    @Override // com.bytedance.bae.router.controller.ControllerState, com.bytedance.bae.router.controller.ControllerBaseState
    public int getState() {
        return 2;
    }

    ControllerStopState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
        iAudioRoutingController.stopBtSco();
        iAudioRoutingController.getRoutingInfo().setForceSpeakerphone(-1);
        iAudioRoutingController.getRoutingInfo().setDefaultRouting(0);
        BaeLogging.w("ControllerBaseState", "Monitor stop ctor");
    }

    @Override // com.bytedance.bae.router.controller.ControllerState, com.bytedance.bae.router.controller.ControllerBaseState
    public void onEvent(int i2, int i3) {
        BaeLogging.w("ControllerBaseState", "Monitor stopState: onEvent: " + i2 + ", info: " + i3);
    }
}
