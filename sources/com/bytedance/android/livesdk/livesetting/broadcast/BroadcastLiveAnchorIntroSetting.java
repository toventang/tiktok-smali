package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class BroadcastLiveAnchorIntroSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final BroadcastLiveAnchorIntroSetting INSTANCE = new BroadcastLiveAnchorIntroSetting();

    private BroadcastLiveAnchorIntroSetting() {
    }

    static {
        Covode.recordClassIndex(10504);
    }

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(BroadcastLiveAnchorIntroSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
