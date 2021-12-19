package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMaxRetainAlogMessageSizeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 500;
    public static final LiveMaxRetainAlogMessageSizeSetting INSTANCE = new LiveMaxRetainAlogMessageSizeSetting();

    private LiveMaxRetainAlogMessageSizeSetting() {
    }

    static {
        Covode.recordClassIndex(10558);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMaxRetainAlogMessageSizeSetting.class);
    }
}
