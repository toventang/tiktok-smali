package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMessageListPreloadSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveMessageListPreloadSetting INSTANCE = new LiveMessageListPreloadSetting();

    private LiveMessageListPreloadSetting() {
    }

    static {
        Covode.recordClassIndex(10788);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMessageListPreloadSetting.class);
    }
}
