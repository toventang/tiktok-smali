package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class RankSupportAreaSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final RankSupportAreaSetting INSTANCE = new RankSupportAreaSetting();

    private RankSupportAreaSetting() {
    }

    static {
        Covode.recordClassIndex(10955);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(RankSupportAreaSetting.class);
    }
}
