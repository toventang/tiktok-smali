package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnablePopupQueueSettings {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveEnablePopupQueueSettings INSTANCE = new LiveEnablePopupQueueSettings();

    private LiveEnablePopupQueueSettings() {
    }

    static {
        Covode.recordClassIndex(10829);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnablePopupQueueSettings.class);
    }
}
