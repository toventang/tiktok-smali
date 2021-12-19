package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableToastNetworkChangedSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final EnableToastNetworkChangedSetting INSTANCE = new EnableToastNetworkChangedSetting();

    private EnableToastNetworkChangedSetting() {
    }

    static {
        Covode.recordClassIndex(10814);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableToastNetworkChangedSetting.class);
    }
}
