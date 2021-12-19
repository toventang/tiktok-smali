package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePopularityCardUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LivePopularityCardUrlSetting INSTANCE = new LivePopularityCardUrlSetting();

    private LivePopularityCardUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10847);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePopularityCardUrlSetting.class);
    }
}
