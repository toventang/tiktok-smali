package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePkConnectTimeoutIntervalSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 20;
    public static final LivePkConnectTimeoutIntervalSetting INSTANCE = new LivePkConnectTimeoutIntervalSetting();

    private LivePkConnectTimeoutIntervalSetting() {
    }

    static {
        Covode.recordClassIndex(10755);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePkConnectTimeoutIntervalSetting.class);
    }
}
