package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveTestSkipLinkMicBundleCheckSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveTestSkipLinkMicBundleCheckSetting INSTANCE = new LiveTestSkipLinkMicBundleCheckSetting();

    private LiveTestSkipLinkMicBundleCheckSetting() {
    }

    static {
        Covode.recordClassIndex(10761);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveTestSkipLinkMicBundleCheckSetting.class);
    }
}
