package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveRandomLinkmicConnectTimeoutIntervalSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 10;
    public static final LiveRandomLinkmicConnectTimeoutIntervalSetting INSTANCE = new LiveRandomLinkmicConnectTimeoutIntervalSetting();

    private LiveRandomLinkmicConnectTimeoutIntervalSetting() {
    }

    static {
        Covode.recordClassIndex(10756);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveRandomLinkmicConnectTimeoutIntervalSetting.class);
    }
}
