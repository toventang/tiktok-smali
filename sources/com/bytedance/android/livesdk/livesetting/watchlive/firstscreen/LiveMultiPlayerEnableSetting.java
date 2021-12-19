package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMultiPlayerEnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMultiPlayerEnableSetting INSTANCE = new LiveMultiPlayerEnableSetting();

    private LiveMultiPlayerEnableSetting() {
    }

    static {
        Covode.recordClassIndex(11089);
    }

    public final boolean getValue() {
        if (!SettingsManager.INSTANCE.getBooleanValue(LiveMultiPlayerEnableSetting.class) || !LiveMultiPlayerDeviceScore.INSTANCE.isEnable()) {
            return false;
        }
        return true;
    }
}
