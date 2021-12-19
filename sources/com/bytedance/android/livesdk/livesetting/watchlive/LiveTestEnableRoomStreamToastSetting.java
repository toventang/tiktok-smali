package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveTestEnableRoomStreamToastSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveTestEnableRoomStreamToastSetting INSTANCE = new LiveTestEnableRoomStreamToastSetting();

    private LiveTestEnableRoomStreamToastSetting() {
    }

    static {
        Covode.recordClassIndex(11064);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveTestEnableRoomStreamToastSetting.class);
    }
}
