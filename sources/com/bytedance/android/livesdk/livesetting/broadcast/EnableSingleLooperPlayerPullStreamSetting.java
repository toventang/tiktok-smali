package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableSingleLooperPlayerPullStreamSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final EnableSingleLooperPlayerPullStreamSetting INSTANCE = new EnableSingleLooperPlayerPullStreamSetting();

    private EnableSingleLooperPlayerPullStreamSetting() {
    }

    static {
        Covode.recordClassIndex(10513);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableSingleLooperPlayerPullStreamSetting.class);
    }
}
