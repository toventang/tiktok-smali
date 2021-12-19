package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableNewGestureDialogSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEnableNewGestureDialogSetting INSTANCE = new LiveEnableNewGestureDialogSetting();

    private LiveEnableNewGestureDialogSetting() {
    }

    static {
        Covode.recordClassIndex(10540);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableNewGestureDialogSetting.class);
    }
}
