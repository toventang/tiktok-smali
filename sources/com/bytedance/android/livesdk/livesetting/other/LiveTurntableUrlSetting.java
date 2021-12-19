package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveTurntableUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveTurntableUrlSetting INSTANCE = new LiveTurntableUrlSetting();

    private LiveTurntableUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10863);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveTurntableUrlSetting.class);
    }
}
