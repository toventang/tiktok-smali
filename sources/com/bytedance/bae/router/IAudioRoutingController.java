package com.bytedance.bae.router;

import android.media.AudioManager;
import com.bytedance.covode.number.Covode;

public interface IAudioRoutingController {
    static {
        Covode.recordClassIndex(15371);
    }

    AudioManager getAudioManager();

    String getAudioRouteDesc(int i2);

    RoutingInfo getRoutingInfo();

    boolean isBTHeadsetPlugged();

    boolean isWiredHeadsetPlugged();

    void notifyAudioRoutingChanged(int i2, String str);

    int queryCurrentAudioRouting();

    void resetAudioRouting(boolean z);

    void setAudioRouting(int i2);

    void stopBtSco();

    int updateBluetoothSco(int i2);
}
