package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveStreamProfileSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = -1;
    public static final LiveStreamProfileSetting INSTANCE = new LiveStreamProfileSetting();

    private LiveStreamProfileSetting() {
    }

    static {
        Covode.recordClassIndex(10579);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveStreamProfileSetting.class);
    }
}
