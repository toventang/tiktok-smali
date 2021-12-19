package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ShowFansclubRenewalSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final ShowFansclubRenewalSetting INSTANCE = new ShowFansclubRenewalSetting();

    private ShowFansclubRenewalSetting() {
    }

    static {
        Covode.recordClassIndex(10873);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ShowFansclubRenewalSetting.class);
    }
}
