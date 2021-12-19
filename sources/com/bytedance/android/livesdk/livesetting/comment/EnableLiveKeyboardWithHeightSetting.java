package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableLiveKeyboardWithHeightSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableLiveKeyboardWithHeightSetting INSTANCE = new EnableLiveKeyboardWithHeightSetting();

    private EnableLiveKeyboardWithHeightSetting() {
    }

    static {
        Covode.recordClassIndex(10597);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableLiveKeyboardWithHeightSetting.class);
    }
}
