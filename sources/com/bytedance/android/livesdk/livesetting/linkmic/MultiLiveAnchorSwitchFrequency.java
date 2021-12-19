package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class MultiLiveAnchorSwitchFrequency {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 15;
    public static final MultiLiveAnchorSwitchFrequency INSTANCE = new MultiLiveAnchorSwitchFrequency();

    private MultiLiveAnchorSwitchFrequency() {
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiLiveAnchorSwitchFrequency.class);
    }

    static {
        Covode.recordClassIndex(10767);
    }
}
