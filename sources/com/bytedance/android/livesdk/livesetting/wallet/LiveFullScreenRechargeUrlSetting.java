package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFullScreenRechargeUrlSetting {
    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveFullScreenRechargeUrlSetting INSTANCE = new LiveFullScreenRechargeUrlSetting();

    private LiveFullScreenRechargeUrlSetting() {
    }

    static {
        Covode.recordClassIndex(11001);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveFullScreenRechargeUrlSetting.class);
    }
}
