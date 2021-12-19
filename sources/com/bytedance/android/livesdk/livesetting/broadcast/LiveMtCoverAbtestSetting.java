package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtCoverAbtestSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveMtCoverAbtestSetting INSTANCE = new LiveMtCoverAbtestSetting();

    private LiveMtCoverAbtestSetting() {
    }

    static {
        Covode.recordClassIndex(10559);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtCoverAbtestSetting.class);
    }
}
