package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSdkAppealWebviewSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveSdkAppealWebviewSetting INSTANCE = new LiveSdkAppealWebviewSetting();

    private LiveSdkAppealWebviewSetting() {
    }

    static {
        Covode.recordClassIndex(10983);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveSdkAppealWebviewSetting.class);
    }
}
