package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveDrawerRefreshTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 300;
    public static final LiveDrawerRefreshTimeSetting INSTANCE = new LiveDrawerRefreshTimeSetting();

    private LiveDrawerRefreshTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10624);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveDrawerRefreshTimeSetting.class);
    }
}
