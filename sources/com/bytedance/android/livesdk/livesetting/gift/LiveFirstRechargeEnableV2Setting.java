package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFirstRechargeEnableV2Setting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveFirstRechargeEnableV2Setting INSTANCE = new LiveFirstRechargeEnableV2Setting();

    private LiveFirstRechargeEnableV2Setting() {
    }

    static {
        Covode.recordClassIndex(10642);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFirstRechargeEnableV2Setting.class);
    }
}
