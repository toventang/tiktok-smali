package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEventDetailSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveEventDetailSetting INSTANCE = new LiveEventDetailSetting();

    private LiveEventDetailSetting() {
    }

    static {
        Covode.recordClassIndex(10830);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveEventDetailSetting.class);
    }
}
