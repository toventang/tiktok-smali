package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveTestSkipQuicBundleCheckSettings {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveTestSkipQuicBundleCheckSettings INSTANCE = new LiveTestSkipQuicBundleCheckSettings();

    private LiveTestSkipQuicBundleCheckSettings() {
    }

    static {
        Covode.recordClassIndex(10861);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveTestSkipQuicBundleCheckSettings.class);
    }
}
