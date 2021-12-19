package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBannerWebviewOptSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveBannerWebviewOptSetting INSTANCE = new LiveBannerWebviewOptSetting();

    private LiveBannerWebviewOptSetting() {
    }

    static {
        Covode.recordClassIndex(10882);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBannerWebviewOptSetting.class);
    }
}
