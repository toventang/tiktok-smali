package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class InteractFirstFrameTimeOutDurationSetting {
    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 2000;
    public static final InteractFirstFrameTimeOutDurationSetting INSTANCE = new InteractFirstFrameTimeOutDurationSetting();

    private InteractFirstFrameTimeOutDurationSetting() {
    }

    static {
        Covode.recordClassIndex(11030);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(InteractFirstFrameTimeOutDurationSetting.class);
    }
}
