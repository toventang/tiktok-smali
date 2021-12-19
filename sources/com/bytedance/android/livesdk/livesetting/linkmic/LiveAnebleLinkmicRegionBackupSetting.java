package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAnebleLinkmicRegionBackupSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveAnebleLinkmicRegionBackupSetting INSTANCE = new LiveAnebleLinkmicRegionBackupSetting();

    private LiveAnebleLinkmicRegionBackupSetting() {
    }

    static {
        Covode.recordClassIndex(10729);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAnebleLinkmicRegionBackupSetting.class);
    }
}
