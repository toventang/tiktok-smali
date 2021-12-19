package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class BroadcastLiveCenterSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final BroadcastLiveCenterSetting INSTANCE = new BroadcastLiveCenterSetting();

    private BroadcastLiveCenterSetting() {
    }

    static {
        Covode.recordClassIndex(10506);
    }

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(BroadcastLiveCenterSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
