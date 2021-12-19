package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveUseLinkWithNewArchSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveUseLinkWithNewArchSetting INSTANCE = new LiveUseLinkWithNewArchSetting();

    private LiveUseLinkWithNewArchSetting() {
    }

    static {
        Covode.recordClassIndex(10763);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveUseLinkWithNewArchSetting.class);
    }
}
