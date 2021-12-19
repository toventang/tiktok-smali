package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFirstRechargeGiftIapidSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveFirstRechargeGiftIapidSetting INSTANCE = new LiveFirstRechargeGiftIapidSetting();

    private LiveFirstRechargeGiftIapidSetting() {
    }

    static {
        Covode.recordClassIndex(10643);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveFirstRechargeGiftIapidSetting.class);
    }
}
