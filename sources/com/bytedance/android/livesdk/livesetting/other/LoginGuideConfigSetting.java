package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LoginGuideConfig;
import com.bytedance.covode.number.Covode;

public final class LoginGuideConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final LoginGuideConfig DEFAULT = new LoginGuideConfig();
    public static final LoginGuideConfigSetting INSTANCE = new LoginGuideConfigSetting();

    private LoginGuideConfigSetting() {
    }

    public final LoginGuideConfig getValue() {
        LoginGuideConfig loginGuideConfig = (LoginGuideConfig) SettingsManager.INSTANCE.getValueSafely(LoginGuideConfigSetting.class);
        if (loginGuideConfig == null) {
            return DEFAULT;
        }
        return loginGuideConfig;
    }

    static {
        Covode.recordClassIndex(10864);
    }
}
