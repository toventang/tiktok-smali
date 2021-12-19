package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class InteractEnsureLazyLoadBannerWebviewSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final InteractEnsureLazyLoadBannerWebviewSetting INSTANCE = new InteractEnsureLazyLoadBannerWebviewSetting();

    private InteractEnsureLazyLoadBannerWebviewSetting() {
    }

    static {
        Covode.recordClassIndex(10499);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(InteractEnsureLazyLoadBannerWebviewSetting.class);
    }
}
