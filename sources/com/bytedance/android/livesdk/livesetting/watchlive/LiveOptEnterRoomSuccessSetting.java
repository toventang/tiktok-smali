package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveOptEnterRoomSuccessSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveOptEnterRoomSuccessSetting INSTANCE = new LiveOptEnterRoomSuccessSetting();

    private LiveOptEnterRoomSuccessSetting() {
    }

    static {
        Covode.recordClassIndex(11050);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveOptEnterRoomSuccessSetting.class);
    }
}
