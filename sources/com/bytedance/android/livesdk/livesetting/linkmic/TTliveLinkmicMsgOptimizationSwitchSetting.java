package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TTliveLinkmicMsgOptimizationSwitchSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final TTliveLinkmicMsgOptimizationSwitchSetting INSTANCE = new TTliveLinkmicMsgOptimizationSwitchSetting();

    private TTliveLinkmicMsgOptimizationSwitchSetting() {
    }

    static {
        Covode.recordClassIndex(10777);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(TTliveLinkmicMsgOptimizationSwitchSetting.class);
    }
}
