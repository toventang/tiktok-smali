package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ShouldSyncClearLinkInRoomWindowSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final ShouldSyncClearLinkInRoomWindowSetting INSTANCE = new ShouldSyncClearLinkInRoomWindowSetting();

    private ShouldSyncClearLinkInRoomWindowSetting() {
    }

    static {
        Covode.recordClassIndex(10771);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ShouldSyncClearLinkInRoomWindowSetting.class);
    }
}
