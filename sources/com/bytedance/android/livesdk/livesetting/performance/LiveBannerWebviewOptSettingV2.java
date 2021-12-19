package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBannerWebviewOptSettingV2 {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveBannerWebviewOptSettingV2 INSTANCE = new LiveBannerWebviewOptSettingV2();

    private LiveBannerWebviewOptSettingV2() {
    }

    static {
        Covode.recordClassIndex(10883);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBannerWebviewOptSettingV2.class);
    }
}
