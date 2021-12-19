package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSubscribeAnchorFaqNonGBSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveSubscribeAnchorFaqNonGBSetting INSTANCE = new LiveSubscribeAnchorFaqNonGBSetting();

    private LiveSubscribeAnchorFaqNonGBSetting() {
    }

    static {
        Covode.recordClassIndex(10583);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveSubscribeAnchorFaqNonGBSetting.class);
    }
}
