package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class RefreshShowSandBoxRoomSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final RefreshShowSandBoxRoomSetting INSTANCE = new RefreshShowSandBoxRoomSetting();

    private RefreshShowSandBoxRoomSetting() {
    }

    static {
        Covode.recordClassIndex(10632);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(RefreshShowSandBoxRoomSetting.class);
    }
}
