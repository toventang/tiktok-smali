package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableWebviewDebuggingSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final EnableWebviewDebuggingSetting INSTANCE = new EnableWebviewDebuggingSetting();

    private EnableWebviewDebuggingSetting() {
    }

    static {
        Covode.recordClassIndex(10685);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableWebviewDebuggingSetting.class);
    }
}
