package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtEnableCjBoeEnvSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveMtEnableCjBoeEnvSetting INSTANCE = new LiveMtEnableCjBoeEnvSetting();

    private LiveMtEnableCjBoeEnvSetting() {
    }

    static {
        Covode.recordClassIndex(10840);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtEnableCjBoeEnvSetting.class);
    }
}
