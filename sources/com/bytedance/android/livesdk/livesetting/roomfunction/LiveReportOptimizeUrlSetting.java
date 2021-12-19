package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveReportOptimizeUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveReportOptimizeUrlSetting INSTANCE = new LiveReportOptimizeUrlSetting();

    private LiveReportOptimizeUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10980);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveReportOptimizeUrlSetting.class);
    }
}
