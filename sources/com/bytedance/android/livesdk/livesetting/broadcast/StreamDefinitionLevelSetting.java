package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class StreamDefinitionLevelSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final StreamDefinitionLevelSetting INSTANCE = new StreamDefinitionLevelSetting();

    private StreamDefinitionLevelSetting() {
    }

    static {
        Covode.recordClassIndex(10591);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(StreamDefinitionLevelSetting.class);
    }
}
