package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveStreamStrategySdkEnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveStreamStrategySdkEnableSetting INSTANCE = new LiveStreamStrategySdkEnableSetting();

    private LiveStreamStrategySdkEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10944);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveStreamStrategySdkEnableSetting.class);
    }
}
