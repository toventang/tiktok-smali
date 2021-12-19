package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableBattleEggSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final EnableBattleEggSetting INSTANCE = new EnableBattleEggSetting();

    private EnableBattleEggSetting() {
    }

    static {
        Covode.recordClassIndex(10781);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableBattleEggSetting.class);
    }
}
