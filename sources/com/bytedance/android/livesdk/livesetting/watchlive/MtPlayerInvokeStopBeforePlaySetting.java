package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class MtPlayerInvokeStopBeforePlaySetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MtPlayerInvokeStopBeforePlaySetting INSTANCE = new MtPlayerInvokeStopBeforePlaySetting();

    private MtPlayerInvokeStopBeforePlaySetting() {
    }

    static {
        Covode.recordClassIndex(11069);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MtPlayerInvokeStopBeforePlaySetting.class);
    }
}
