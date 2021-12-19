package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtTikcastSwitcherParamSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMtTikcastSwitcherParamSetting INSTANCE = new LiveMtTikcastSwitcherParamSetting();

    private LiveMtTikcastSwitcherParamSetting() {
    }

    static {
        Covode.recordClassIndex(10841);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMtTikcastSwitcherParamSetting.class);
    }
}
