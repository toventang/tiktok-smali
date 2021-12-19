package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveStreamEnableSdkParamsSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveStreamEnableSdkParamsSetting INSTANCE = new LiveStreamEnableSdkParamsSetting();

    private LiveStreamEnableSdkParamsSetting() {
    }

    static {
        Covode.recordClassIndex(10576);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveStreamEnableSdkParamsSetting.class);
    }
}
