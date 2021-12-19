package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class CreatorToolLiveCenterSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final CreatorToolLiveCenterSetting INSTANCE = new CreatorToolLiveCenterSetting();

    private CreatorToolLiveCenterSetting() {
    }

    static {
        Covode.recordClassIndex(10509);
    }

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(CreatorToolLiveCenterSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
