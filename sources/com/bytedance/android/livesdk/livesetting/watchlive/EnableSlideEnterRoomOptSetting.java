package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableSlideEnterRoomOptSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableSlideEnterRoomOptSetting INSTANCE = new EnableSlideEnterRoomOptSetting();

    private EnableSlideEnterRoomOptSetting() {
    }

    static {
        Covode.recordClassIndex(11022);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableSlideEnterRoomOptSetting.class);
    }
}
