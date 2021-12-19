package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveObsBroadcastGuideStrategySetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveObsBroadcastGuideStrategySetting INSTANCE = new LiveObsBroadcastGuideStrategySetting();

    private LiveObsBroadcastGuideStrategySetting() {
    }

    static {
        Covode.recordClassIndex(10562);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveObsBroadcastGuideStrategySetting.class);
    }
}
