package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class StartLiveShareTimeoutSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 5;
    public static final StartLiveShareTimeoutSetting INSTANCE = new StartLiveShareTimeoutSetting();

    private StartLiveShareTimeoutSetting() {
    }

    static {
        Covode.recordClassIndex(10589);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(StartLiveShareTimeoutSetting.class);
    }
}
