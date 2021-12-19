package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class AutoRefreshWeeklyRankListSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final AutoRefreshWeeklyRankListSetting INSTANCE = new AutoRefreshWeeklyRankListSetting();

    private AutoRefreshWeeklyRankListSetting() {
    }

    static {
        Covode.recordClassIndex(10947);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(AutoRefreshWeeklyRankListSetting.class);
    }
}
