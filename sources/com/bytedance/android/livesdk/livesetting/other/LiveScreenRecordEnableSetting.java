package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveScreenRecordEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveScreenRecordEnableSetting INSTANCE = new LiveScreenRecordEnableSetting();

    private LiveScreenRecordEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10849);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveScreenRecordEnableSetting.class);
    }
}
