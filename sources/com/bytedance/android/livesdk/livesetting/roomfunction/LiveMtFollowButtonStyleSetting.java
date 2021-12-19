package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtFollowButtonStyleSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveMtFollowButtonStyleSetting INSTANCE = new LiveMtFollowButtonStyleSetting();

    private LiveMtFollowButtonStyleSetting() {
    }

    static {
        Covode.recordClassIndex(10974);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMtFollowButtonStyleSetting.class);
    }
}
