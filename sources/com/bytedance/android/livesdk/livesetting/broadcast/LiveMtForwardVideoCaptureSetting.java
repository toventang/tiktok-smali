package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtForwardVideoCaptureSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveMtForwardVideoCaptureSetting INSTANCE = new LiveMtForwardVideoCaptureSetting();

    private LiveMtForwardVideoCaptureSetting() {
    }

    static {
        Covode.recordClassIndex(10561);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtForwardVideoCaptureSetting.class);
    }
}
