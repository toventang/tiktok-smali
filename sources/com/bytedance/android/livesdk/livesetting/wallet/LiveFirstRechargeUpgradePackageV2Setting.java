package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.r;
import com.bytedance.covode.number.Covode;

public final class LiveFirstRechargeUpgradePackageV2Setting {
    @Group(isDefault = true, value = "default group")
    private static final r DEFAULT = new r();
    public static final LiveFirstRechargeUpgradePackageV2Setting INSTANCE = new LiveFirstRechargeUpgradePackageV2Setting();

    private LiveFirstRechargeUpgradePackageV2Setting() {
    }

    public final r getDEFAULT() {
        return DEFAULT;
    }

    public final r getValue() {
        r rVar = (r) SettingsManager.INSTANCE.getValueSafely(LiveFirstRechargeUpgradePackageV2Setting.class);
        if (rVar == null) {
            return DEFAULT;
        }
        return rVar;
    }

    static {
        Covode.recordClassIndex(11000);
    }
}
