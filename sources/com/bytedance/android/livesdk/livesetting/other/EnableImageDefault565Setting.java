package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableImageDefault565Setting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final EnableImageDefault565Setting INSTANCE = new EnableImageDefault565Setting();

    private EnableImageDefault565Setting() {
    }

    static {
        Covode.recordClassIndex(10811);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableImageDefault565Setting.class);
    }
}
