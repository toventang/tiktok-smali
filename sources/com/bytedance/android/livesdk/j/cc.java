package com.bytedance.android.livesdk.j;

import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class cc {
    static {
        Covode.recordClassIndex(10208);
    }

    public static final boolean a(DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        Boolean bool2;
        if (dataChannel == null || (bool2 = (Boolean) dataChannel.b(ee.class)) == null) {
            z = false;
        } else {
            z = bool2.booleanValue();
        }
        if (z || EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
            return true;
        }
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(bw.class)) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
