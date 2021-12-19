package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class OpenQuizForAnchorSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final OpenQuizForAnchorSetting INSTANCE = new OpenQuizForAnchorSetting();

    private OpenQuizForAnchorSetting() {
    }

    static {
        Covode.recordClassIndex(10867);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(OpenQuizForAnchorSetting.class);
    }
}
