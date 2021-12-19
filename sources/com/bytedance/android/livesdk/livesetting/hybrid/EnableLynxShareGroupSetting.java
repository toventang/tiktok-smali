package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableLynxShareGroupSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final EnableLynxShareGroupSetting INSTANCE = new EnableLynxShareGroupSetting();

    private EnableLynxShareGroupSetting() {
    }

    static {
        Covode.recordClassIndex(10684);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableLynxShareGroupSetting.class);
    }
}
