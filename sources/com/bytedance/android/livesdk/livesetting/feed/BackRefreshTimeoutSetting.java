package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class BackRefreshTimeoutSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1800000;
    public static final BackRefreshTimeoutSetting INSTANCE = new BackRefreshTimeoutSetting();

    private BackRefreshTimeoutSetting() {
    }

    static {
        Covode.recordClassIndex(10610);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(BackRefreshTimeoutSetting.class);
    }
}
