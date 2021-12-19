package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveShareShowTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3000;
    public static final LiveShareShowTimeSetting INSTANCE = new LiveShareShowTimeSetting();

    private LiveShareShowTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10986);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveShareShowTimeSetting.class);
    }
}
