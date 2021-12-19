package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableWebviewGlobalpropsSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveEnableWebviewGlobalpropsSetting INSTANCE = new LiveEnableWebviewGlobalpropsSetting();

    private LiveEnableWebviewGlobalpropsSetting() {
    }

    static {
        Covode.recordClassIndex(10691);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableWebviewGlobalpropsSetting.class);
    }
}
