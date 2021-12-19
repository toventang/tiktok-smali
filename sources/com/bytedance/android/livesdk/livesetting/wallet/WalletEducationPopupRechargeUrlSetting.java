package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class WalletEducationPopupRechargeUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final WalletEducationPopupRechargeUrlSetting INSTANCE = new WalletEducationPopupRechargeUrlSetting();

    private WalletEducationPopupRechargeUrlSetting() {
    }

    static {
        Covode.recordClassIndex(11013);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(WalletEducationPopupRechargeUrlSetting.class);
    }
}
