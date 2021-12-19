package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAnchorPrivacyPageUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveAnchorPrivacyPageUrlSetting INSTANCE = new LiveAnchorPrivacyPageUrlSetting();

    private LiveAnchorPrivacyPageUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10519);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveAnchorPrivacyPageUrlSetting.class);
    }
}
