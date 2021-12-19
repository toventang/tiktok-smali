package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePerformanceMonitorSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LivePerformanceMonitorSetting INSTANCE = new LivePerformanceMonitorSetting();

    private LivePerformanceMonitorSetting() {
    }

    static {
        Covode.recordClassIndex(11054);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePerformanceMonitorSetting.class);
    }

    public final boolean isOpen() {
        if (SettingsManager.INSTANCE.getIntValue(LivePerformanceMonitorSetting.class) != 0) {
            return true;
        }
        return false;
    }
}
