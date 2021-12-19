package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class WapLoadTimeLimitWifiSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = -1;
    public static final WapLoadTimeLimitWifiSetting INSTANCE = new WapLoadTimeLimitWifiSetting();

    private WapLoadTimeLimitWifiSetting() {
    }

    static {
        Covode.recordClassIndex(10709);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(WapLoadTimeLimitWifiSetting.class);
    }
}
