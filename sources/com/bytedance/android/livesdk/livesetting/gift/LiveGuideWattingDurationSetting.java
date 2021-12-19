package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGuideWattingDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 30;
    public static final LiveGuideWattingDurationSetting INSTANCE = new LiveGuideWattingDurationSetting();

    private LiveGuideWattingDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10669);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGuideWattingDurationSetting.class);
    }
}
