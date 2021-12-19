package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInteractNtpRetryTimesSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 5;
    public static final LiveInteractNtpRetryTimesSetting INSTANCE = new LiveInteractNtpRetryTimesSetting();

    private LiveInteractNtpRetryTimesSetting() {
    }

    static {
        Covode.recordClassIndex(10743);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveInteractNtpRetryTimesSetting.class);
    }
}
