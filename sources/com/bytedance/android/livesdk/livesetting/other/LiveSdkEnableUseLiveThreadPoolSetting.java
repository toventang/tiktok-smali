package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSdkEnableUseLiveThreadPoolSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSdkEnableUseLiveThreadPoolSetting INSTANCE = new LiveSdkEnableUseLiveThreadPoolSetting();

    private LiveSdkEnableUseLiveThreadPoolSetting() {
    }

    static {
        Covode.recordClassIndex(10850);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkEnableUseLiveThreadPoolSetting.class);
    }
}
