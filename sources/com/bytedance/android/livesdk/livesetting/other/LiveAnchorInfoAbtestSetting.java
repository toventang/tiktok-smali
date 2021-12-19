package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAnchorInfoAbtestSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveAnchorInfoAbtestSetting INSTANCE = new LiveAnchorInfoAbtestSetting();

    private LiveAnchorInfoAbtestSetting() {
    }

    static {
        Covode.recordClassIndex(10818);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAnchorInfoAbtestSetting.class);
    }
}
