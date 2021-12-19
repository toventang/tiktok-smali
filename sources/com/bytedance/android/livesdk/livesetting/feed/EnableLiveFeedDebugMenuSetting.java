package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableLiveFeedDebugMenuSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableLiveFeedDebugMenuSetting INSTANCE = new EnableLiveFeedDebugMenuSetting();

    private EnableLiveFeedDebugMenuSetting() {
    }

    static {
        Covode.recordClassIndex(10614);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableLiveFeedDebugMenuSetting.class);
    }
}
