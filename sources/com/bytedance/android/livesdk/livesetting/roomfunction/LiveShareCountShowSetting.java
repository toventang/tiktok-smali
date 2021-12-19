package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveShareCountShowSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveShareCountShowSetting INSTANCE = new LiveShareCountShowSetting();

    private LiveShareCountShowSetting() {
    }

    static {
        Covode.recordClassIndex(10984);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveShareCountShowSetting.class);
    }
}
