package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class WalletToLiveJsbSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final WalletToLiveJsbSetting INSTANCE = new WalletToLiveJsbSetting();

    private WalletToLiveJsbSetting() {
    }

    static {
        Covode.recordClassIndex(11014);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(WalletToLiveJsbSetting.class);
    }
}
