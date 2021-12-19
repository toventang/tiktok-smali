package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class PlayerEnableUploadTimeLineSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final PlayerEnableUploadTimeLineSetting INSTANCE = new PlayerEnableUploadTimeLineSetting();

    private PlayerEnableUploadTimeLineSetting() {
    }

    static {
        Covode.recordClassIndex(10945);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(PlayerEnableUploadTimeLineSetting.class);
    }
}
