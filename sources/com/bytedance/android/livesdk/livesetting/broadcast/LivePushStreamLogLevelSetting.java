package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePushStreamLogLevelSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 5;
    public static final LivePushStreamLogLevelSetting INSTANCE = new LivePushStreamLogLevelSetting();

    private LivePushStreamLogLevelSetting() {
    }

    static {
        Covode.recordClassIndex(10568);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePushStreamLogLevelSetting.class);
    }
}
