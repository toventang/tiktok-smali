package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableTTCaptureSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final EnableTTCaptureSetting INSTANCE = new EnableTTCaptureSetting();

    private EnableTTCaptureSetting() {
    }

    static {
        Covode.recordClassIndex(10514);
    }

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(EnableTTCaptureSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
