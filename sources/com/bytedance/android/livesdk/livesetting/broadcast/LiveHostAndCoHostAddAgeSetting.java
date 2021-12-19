package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveHostAndCoHostAddAgeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveHostAndCoHostAddAgeSetting INSTANCE = new LiveHostAndCoHostAddAgeSetting();

    private LiveHostAndCoHostAddAgeSetting() {
    }

    static {
        Covode.recordClassIndex(10554);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveHostAndCoHostAddAgeSetting.class);
    }
}
