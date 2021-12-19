package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableBattleUiNewStyleSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 2;
    public static final EnableBattleUiNewStyleSetting INSTANCE = new EnableBattleUiNewStyleSetting();

    private EnableBattleUiNewStyleSetting() {
    }

    static {
        Covode.recordClassIndex(10715);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnableBattleUiNewStyleSetting.class);
    }
}
