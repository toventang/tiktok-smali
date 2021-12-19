package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCaptureVideoRecordDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final float DEFAULT = 0.0f;
    public static final LiveCaptureVideoRecordDurationSetting INSTANCE = new LiveCaptureVideoRecordDurationSetting();

    private LiveCaptureVideoRecordDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10533);
    }

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveCaptureVideoRecordDurationSetting.class);
    }
}
