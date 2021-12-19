package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveJsbEnableHostSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveJsbEnableHostSetting INSTANCE = new LiveJsbEnableHostSetting();

    private LiveJsbEnableHostSetting() {
    }

    static {
        Covode.recordClassIndex(10699);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveJsbEnableHostSetting.class);
    }
}
