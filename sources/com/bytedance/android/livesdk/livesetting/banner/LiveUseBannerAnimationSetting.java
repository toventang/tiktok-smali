package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveUseBannerAnimationSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final LiveUseBannerAnimationSetting INSTANCE = new LiveUseBannerAnimationSetting();

    private LiveUseBannerAnimationSetting() {
    }

    static {
        Covode.recordClassIndex(10500);
    }

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveUseBannerAnimationSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
