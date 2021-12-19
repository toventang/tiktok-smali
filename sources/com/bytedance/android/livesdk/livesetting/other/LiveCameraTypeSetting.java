package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCameraTypeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final LiveCameraTypeSetting INSTANCE = new LiveCameraTypeSetting();

    private LiveCameraTypeSetting() {
    }

    static {
        Covode.recordClassIndex(10821);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCameraTypeSetting.class);
    }
}
