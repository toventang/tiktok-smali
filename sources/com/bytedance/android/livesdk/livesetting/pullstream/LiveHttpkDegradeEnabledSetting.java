package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveHttpkDegradeEnabledSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveHttpkDegradeEnabledSetting INSTANCE = new LiveHttpkDegradeEnabledSetting();

    private LiveHttpkDegradeEnabledSetting() {
    }

    static {
        Covode.recordClassIndex(10935);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveHttpkDegradeEnabledSetting.class);
    }
}
