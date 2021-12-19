package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableVeCamera2Setting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEnableVeCamera2Setting INSTANCE = new LiveEnableVeCamera2Setting();

    private LiveEnableVeCamera2Setting() {
    }

    static {
        Covode.recordClassIndex(10543);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableVeCamera2Setting.class);
    }
}
