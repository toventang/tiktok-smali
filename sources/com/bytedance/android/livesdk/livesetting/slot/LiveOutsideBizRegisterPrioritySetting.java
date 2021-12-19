package com.bytedance.android.livesdk.livesetting.slot;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveOutsideBizRegisterPrioritySetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final LiveOutsideBizRegisterPrioritySetting INSTANCE = new LiveOutsideBizRegisterPrioritySetting();

    private LiveOutsideBizRegisterPrioritySetting() {
    }

    static {
        Covode.recordClassIndex(10993);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveOutsideBizRegisterPrioritySetting.class);
    }
}
