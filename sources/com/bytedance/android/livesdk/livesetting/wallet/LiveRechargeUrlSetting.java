package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveRechargeUrlSetting {
    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveRechargeUrlSetting INSTANCE = new LiveRechargeUrlSetting();

    private LiveRechargeUrlSetting() {
    }

    static {
        Covode.recordClassIndex(11006);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveRechargeUrlSetting.class);
    }
}
