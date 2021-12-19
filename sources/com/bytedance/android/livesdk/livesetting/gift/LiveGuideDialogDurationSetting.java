package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGuideDialogDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 10;
    public static final LiveGuideDialogDurationSetting INSTANCE = new LiveGuideDialogDurationSetting();

    private LiveGuideDialogDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10668);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGuideDialogDurationSetting.class);
    }
}
