package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableRechargeSucceedAnimationSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEnableRechargeSucceedAnimationSetting INSTANCE = new LiveEnableRechargeSucceedAnimationSetting();

    private LiveEnableRechargeSucceedAnimationSetting() {
    }

    static {
        Covode.recordClassIndex(10998);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableRechargeSucceedAnimationSetting.class);
    }
}
