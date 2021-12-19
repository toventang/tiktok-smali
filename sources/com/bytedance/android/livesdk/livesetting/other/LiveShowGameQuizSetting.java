package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveShowGameQuizSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveShowGameQuizSetting INSTANCE = new LiveShowGameQuizSetting();

    private LiveShowGameQuizSetting() {
    }

    static {
        Covode.recordClassIndex(10855);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveShowGameQuizSetting.class);
    }
}
