package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAudienceAreaListSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveAudienceAreaListSetting INSTANCE = new LiveAudienceAreaListSetting();

    private LiveAudienceAreaListSetting() {
    }

    static {
        Covode.recordClassIndex(10730);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAudienceAreaListSetting.class);
    }
}
