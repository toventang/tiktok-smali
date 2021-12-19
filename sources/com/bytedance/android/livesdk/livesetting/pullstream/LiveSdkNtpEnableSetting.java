package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSdkNtpEnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSdkNtpEnableSetting INSTANCE = new LiveSdkNtpEnableSetting();

    private LiveSdkNtpEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10943);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkNtpEnableSetting.class);
    }
}
