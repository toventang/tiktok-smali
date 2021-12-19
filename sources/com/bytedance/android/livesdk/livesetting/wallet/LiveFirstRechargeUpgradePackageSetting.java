package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.q;
import com.bytedance.covode.number.Covode;

public final class LiveFirstRechargeUpgradePackageSetting {
    @Group(isDefault = true, value = "default group")
    private static final q DEFAULT = new q();
    public static final LiveFirstRechargeUpgradePackageSetting INSTANCE = new LiveFirstRechargeUpgradePackageSetting();

    private LiveFirstRechargeUpgradePackageSetting() {
    }

    public final q getDEFAULT() {
        return DEFAULT;
    }

    public final q getValue() {
        q qVar = (q) SettingsManager.INSTANCE.getValueSafely(LiveFirstRechargeUpgradePackageSetting.class);
        if (qVar == null) {
            return DEFAULT;
        }
        return qVar;
    }

    static {
        Covode.recordClassIndex(10999);
    }
}
