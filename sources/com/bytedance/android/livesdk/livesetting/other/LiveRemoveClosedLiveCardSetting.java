package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveRemoveClosedLiveCardSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRemoveClosedLiveCardSetting INSTANCE = new LiveRemoveClosedLiveCardSetting();

    private LiveRemoveClosedLiveCardSetting() {
    }

    static {
        Covode.recordClassIndex(10848);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveRemoveClosedLiveCardSetting.class);
    }
}
