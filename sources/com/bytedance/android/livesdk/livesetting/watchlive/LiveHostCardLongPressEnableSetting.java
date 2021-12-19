package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveHostCardLongPressEnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveHostCardLongPressEnableSetting INSTANCE = new LiveHostCardLongPressEnableSetting();

    private LiveHostCardLongPressEnableSetting() {
    }

    static {
        Covode.recordClassIndex(11043);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveHostCardLongPressEnableSetting.class);
    }
}
