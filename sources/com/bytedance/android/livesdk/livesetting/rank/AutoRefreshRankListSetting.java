package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class AutoRefreshRankListSetting {
    @Group(isDefault = true, value = "default group")
    private static final a DEFAULT = new a();
    public static final AutoRefreshRankListSetting INSTANCE = new AutoRefreshRankListSetting();

    private AutoRefreshRankListSetting() {
    }

    public final a getConfig() {
        a aVar = (a) SettingsManager.INSTANCE.getValueSafely(AutoRefreshRankListSetting.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10946);
    }
}
