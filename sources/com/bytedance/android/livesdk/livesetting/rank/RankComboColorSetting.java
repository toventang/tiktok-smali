package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class RankComboColorSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "#6DA0FD";
    public static final RankComboColorSetting INSTANCE = new RankComboColorSetting();

    private RankComboColorSetting() {
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(RankComboColorSetting.class);
    }

    static {
        Covode.recordClassIndex(10954);
    }
}
