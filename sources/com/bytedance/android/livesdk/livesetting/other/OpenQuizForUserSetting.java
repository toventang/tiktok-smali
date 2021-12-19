package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class OpenQuizForUserSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final OpenQuizForUserSetting INSTANCE = new OpenQuizForUserSetting();

    private OpenQuizForUserSetting() {
    }

    static {
        Covode.recordClassIndex(10868);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(OpenQuizForUserSetting.class);
    }
}
