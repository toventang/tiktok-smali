package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMessageQueueMaxLengthSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 200;
    public static final LiveMessageQueueMaxLengthSetting INSTANCE = new LiveMessageQueueMaxLengthSetting();

    private LiveMessageQueueMaxLengthSetting() {
    }

    static {
        Covode.recordClassIndex(10790);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMessageQueueMaxLengthSetting.class);
    }
}
