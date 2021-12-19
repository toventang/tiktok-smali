package com.bytedance.bae.router.controller;

import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.router.IAudioRoutingController;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;

public abstract class ControllerBaseState implements ControllerState {
    private static int sChannelProfile;
    static int sEngineRole = -1;
    private static boolean sMuteLocal;
    private static boolean sMuteRemotes;
    static boolean sPhoneInCall;
    private static boolean sVideoDisabled = true;
    IAudioRoutingController mAudioRoutingController;

    @Override // com.bytedance.bae.router.controller.ControllerState
    public int getState() {
        return 0;
    }

    static {
        Covode.recordClassIndex(15373);
    }

    static void init() {
        sVideoDisabled = true;
        sMuteLocal = false;
        sMuteRemotes = false;
        sEngineRole = -1;
        sPhoneInCall = false;
        sChannelProfile = 0;
    }

    /* access modifiers changed from: package-private */
    public boolean isAudioOnlyCall() {
        if (sChannelProfile == 1) {
            return false;
        }
        if (sVideoDisabled || (sMuteLocal && sMuteRemotes)) {
            return true;
        }
        return false;
    }

    ControllerBaseState(IAudioRoutingController iAudioRoutingController) {
        this.mAudioRoutingController = iAudioRoutingController;
        BaeLogging.w("ControllerBaseState", "Monitor base ctor");
    }

    @Override // com.bytedance.bae.router.controller.ControllerState
    public void onEvent(int i2, int i3) {
        BaeLogging.w("ControllerBaseState", "Monitor baseState: onEvent: " + i2 + ", info: " + i3);
        boolean z = true;
        switch (i2) {
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                if (i3 <= 0) {
                    z = false;
                }
                sMuteLocal = z;
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                if (i3 <= 0) {
                    z = false;
                }
                sMuteRemotes = z;
                return;
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                if (i3 <= 0) {
                    z = false;
                }
                sVideoDisabled = z;
                return;
            default:
                switch (i2) {
                    case v.U /*{ENCODED_INT: 20}*/:
                        sChannelProfile = i3;
                        return;
                    case 21:
                        sEngineRole = i3;
                        return;
                    case 22:
                        if (i3 <= 0) {
                            z = false;
                        }
                        sPhoneInCall = z;
                        return;
                    default:
                        return;
                }
        }
    }
}
