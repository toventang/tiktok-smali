package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class StartLiveStyleV2Setting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final StartLiveStyleV2Setting INSTANCE = new StartLiveStyleV2Setting();

    private StartLiveStyleV2Setting() {
    }

    static {
        Covode.recordClassIndex(10590);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(StartLiveStyleV2Setting.class);
    }
}
