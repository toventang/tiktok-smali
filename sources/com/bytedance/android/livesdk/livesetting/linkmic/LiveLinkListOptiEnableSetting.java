package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveLinkListOptiEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveLinkListOptiEnableSetting INSTANCE = new LiveLinkListOptiEnableSetting();

    private LiveLinkListOptiEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10749);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveLinkListOptiEnableSetting.class);
    }
}
