package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveTestSkipRTSBundleCheckSettings {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveTestSkipRTSBundleCheckSettings INSTANCE = new LiveTestSkipRTSBundleCheckSettings();

    private LiveTestSkipRTSBundleCheckSettings() {
    }

    static {
        Covode.recordClassIndex(10862);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveTestSkipRTSBundleCheckSettings.class);
    }
}
