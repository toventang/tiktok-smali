package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSdkEnableTfoPreconnectSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSdkEnableTfoPreconnectSetting INSTANCE = new LiveSdkEnableTfoPreconnectSetting();

    private LiveSdkEnableTfoPreconnectSetting() {
    }

    static {
        Covode.recordClassIndex(10941);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkEnableTfoPreconnectSetting.class);
    }
}
