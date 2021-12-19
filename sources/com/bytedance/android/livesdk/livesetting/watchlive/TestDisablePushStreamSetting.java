package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.covode.number.Covode;

public final class TestDisablePushStreamSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TestDisablePushStreamSetting INSTANCE = new TestDisablePushStreamSetting();

    private TestDisablePushStreamSetting() {
    }

    static {
        Covode.recordClassIndex(11084);
    }

    public final boolean getValue() {
        if (e.f13999c) {
            return SettingsManager.INSTANCE.getBooleanValue(TestDisablePushStreamSetting.class);
        }
        return false;
    }
}
