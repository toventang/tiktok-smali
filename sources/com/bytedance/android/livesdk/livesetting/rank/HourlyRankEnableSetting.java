package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class HourlyRankEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final HourlyRankEnableSetting INSTANCE = new HourlyRankEnableSetting();

    private HourlyRankEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10948);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(HourlyRankEnableSetting.class);
    }
}
