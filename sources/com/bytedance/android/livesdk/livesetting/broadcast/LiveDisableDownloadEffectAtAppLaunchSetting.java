package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveDisableDownloadEffectAtAppLaunchSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveDisableDownloadEffectAtAppLaunchSetting INSTANCE = new LiveDisableDownloadEffectAtAppLaunchSetting();

    private LiveDisableDownloadEffectAtAppLaunchSetting() {
    }

    static {
        Covode.recordClassIndex(10537);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveDisableDownloadEffectAtAppLaunchSetting.class);
    }
}
