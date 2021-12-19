package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGuideBubbleDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 10;
    public static final LiveGuideBubbleDurationSetting INSTANCE = new LiveGuideBubbleDurationSetting();

    private LiveGuideBubbleDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10667);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGuideBubbleDurationSetting.class);
    }
}
