package com.bytedance.bae.router.controller;

import com.bytedance.bae.router.IAudioRoutingController;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class ControllerErrorState extends ControllerBaseState {
    static {
        Covode.recordClassIndex(15374);
    }

    @Override // com.bytedance.bae.router.controller.ControllerState, com.bytedance.bae.router.controller.ControllerBaseState
    public int getState() {
        return 4;
    }

    ControllerErrorState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
    }
}
