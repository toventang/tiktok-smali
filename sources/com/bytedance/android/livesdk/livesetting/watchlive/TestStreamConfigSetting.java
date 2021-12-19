package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.android.livesdk.config.LiveStreamTestConfig;
import com.bytedance.covode.number.Covode;

public final class TestStreamConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final LiveStreamTestConfig DEFAULT = new LiveStreamTestConfig();
    public static final TestStreamConfigSetting INSTANCE = new TestStreamConfigSetting();

    private TestStreamConfigSetting() {
    }

    public final LiveStreamTestConfig getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(11087);
    }

    public final LiveStreamTestConfig getValue() {
        LiveStreamTestConfig liveStreamTestConfig;
        if (!e.f13999c || (liveStreamTestConfig = (LiveStreamTestConfig) SettingsManager.INSTANCE.getValueSafely(TestStreamConfigSetting.class)) == null) {
            return DEFAULT;
        }
        return liveStreamTestConfig;
    }
}
