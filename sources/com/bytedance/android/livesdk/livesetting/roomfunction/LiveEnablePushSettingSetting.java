package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnablePushSettingSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEnablePushSettingSetting INSTANCE = new LiveEnablePushSettingSetting();

    private LiveEnablePushSettingSetting() {
    }

    static {
        Covode.recordClassIndex(10971);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnablePushSettingSetting.class);
    }
}
