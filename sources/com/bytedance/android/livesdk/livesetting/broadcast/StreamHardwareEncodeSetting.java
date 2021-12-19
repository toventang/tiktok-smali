package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class StreamHardwareEncodeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final StreamHardwareEncodeSetting INSTANCE = new StreamHardwareEncodeSetting();

    private StreamHardwareEncodeSetting() {
    }

    static {
        Covode.recordClassIndex(10592);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(StreamHardwareEncodeSetting.class);
    }
}
