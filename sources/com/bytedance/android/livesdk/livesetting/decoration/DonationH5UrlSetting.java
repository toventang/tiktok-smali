package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class DonationH5UrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final DonationH5UrlSetting INSTANCE = new DonationH5UrlSetting();

    private DonationH5UrlSetting() {
    }

    static {
        Covode.recordClassIndex(10606);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(DonationH5UrlSetting.class);
    }
}
