package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtEnableCjBoeEnvHostUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveMtEnableCjBoeEnvHostUrlSetting INSTANCE = new LiveMtEnableCjBoeEnvHostUrlSetting();

    private LiveMtEnableCjBoeEnvHostUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10839);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveMtEnableCjBoeEnvHostUrlSetting.class);
    }
}
