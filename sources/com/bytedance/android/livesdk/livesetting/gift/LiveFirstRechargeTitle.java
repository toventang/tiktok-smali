package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFirstRechargeTitle {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveFirstRechargeTitle INSTANCE = new LiveFirstRechargeTitle();

    private LiveFirstRechargeTitle() {
    }

    static {
        Covode.recordClassIndex(10647);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFirstRechargeTitle.class);
    }
}
