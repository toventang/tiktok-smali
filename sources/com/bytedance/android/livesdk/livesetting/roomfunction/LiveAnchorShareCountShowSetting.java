package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAnchorShareCountShowSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAnchorShareCountShowSetting INSTANCE = new LiveAnchorShareCountShowSetting();

    private LiveAnchorShareCountShowSetting() {
    }

    static {
        Covode.recordClassIndex(10969);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAnchorShareCountShowSetting.class);
    }
}
