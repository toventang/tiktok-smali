package com.bytedance.bae.router.controller;

import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.router.IAudioRoutingController;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class ControllerStartState extends ControllerBaseState {
    static {
        Covode.recordClassIndex(15375);
    }

    @Override // com.bytedance.bae.router.controller.ControllerState, com.bytedance.bae.router.controller.ControllerBaseState
    public int getState() {
        return 1;
    }

    ControllerStartState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
        if (iAudioRoutingController.getRoutingInfo().getDefaultRouting() == 0) {
            if (isAudioOnlyCall()) {
                iAudioRoutingController.getRoutingInfo().setDefaultRouting(2);
            } else {
                iAudioRoutingController.getRoutingInfo().setDefaultRouting(3);
            }
        }
        this.mAudioRoutingController.resetAudioRouting(false);
        BaeLogging.w("ControllerBaseState", "Monitor start ctor: default routing: " + this.mAudioRoutingController.getAudioRouteDesc(iAudioRoutingController.getRoutingInfo().getDefaultRouting()) + ", current routing: " + this.mAudioRoutingController.getAudioRouteDesc(this.mAudioRoutingController.queryCurrentAudioRouting()));
    }

    @Override // com.bytedance.bae.router.controller.ControllerState, com.bytedance.bae.router.controller.ControllerBaseState
    public void onEvent(int i2, int i3) {
        BaeLogging.w("ControllerBaseState", "Monitor startState: onEvent: " + i2 + ", info: " + i3);
        boolean z = false;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 10) {
                    this.mAudioRoutingController.getRoutingInfo().setDefaultRouting(i3);
                    this.mAudioRoutingController.resetAudioRouting(true);
                    BaeLogging.w("ControllerBaseState", "User set default routing to:" + this.mAudioRoutingController.getAudioRouteDesc(this.mAudioRoutingController.getRoutingInfo().getDefaultRouting()));
                } else if (i2 == 11) {
                    this.mAudioRoutingController.getRoutingInfo().setForceSpeakerphone(i3);
                    if (!sPhoneInCall) {
                        this.mAudioRoutingController.resetAudioRouting(true);
                    }
                } else if (i2 == 15) {
                    if (i3 == 1) {
                        z = true;
                    }
                    boolean bTScoEnabled = this.mAudioRoutingController.getRoutingInfo().getBTScoEnabled();
                    BaeLogging.w("ControllerBaseState", "CMD_ENABLE_BT_SCO old_enable:" + bTScoEnabled + ", new_enable:" + z);
                    if (bTScoEnabled != z) {
                        this.mAudioRoutingController.getRoutingInfo().setBTScoEnabled(z);
                        this.mAudioRoutingController.resetAudioRouting(true);
                    }
                } else if (i2 == 21) {
                    sEngineRole = i3;
                    if (!sPhoneInCall) {
                        this.mAudioRoutingController.updateBluetoothSco(this.mAudioRoutingController.queryCurrentAudioRouting());
                    }
                } else if (i2 != 22) {
                    super.onEvent(i2, i3);
                } else {
                    BaeLogging.i("ControllerBaseState", "phone state changed: ".concat(String.valueOf(i3)));
                    if (i3 > 0) {
                        z = true;
                    }
                    sPhoneInCall = z;
                    if (i3 == 0) {
                        this.mAudioRoutingController.resetAudioRouting(true);
                    }
                }
            } else if (!sPhoneInCall) {
                this.mAudioRoutingController.resetAudioRouting(false);
            }
        } else if (!sPhoneInCall && !this.mAudioRoutingController.isBTHeadsetPlugged()) {
            this.mAudioRoutingController.resetAudioRouting(false);
        }
    }
}
