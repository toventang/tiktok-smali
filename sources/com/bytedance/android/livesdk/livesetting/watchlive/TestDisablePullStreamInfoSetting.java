package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.covode.number.Covode;

public final class TestDisablePullStreamInfoSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TestDisablePullStreamInfoSetting INSTANCE = new TestDisablePullStreamInfoSetting();

    private TestDisablePullStreamInfoSetting() {
    }

    static {
        Covode.recordClassIndex(11082);
    }

    public final boolean getValue() {
        if (e.f13999c) {
            return SettingsManager.INSTANCE.getBooleanValue(TestDisablePullStreamInfoSetting.class);
        }
        return false;
    }
}
