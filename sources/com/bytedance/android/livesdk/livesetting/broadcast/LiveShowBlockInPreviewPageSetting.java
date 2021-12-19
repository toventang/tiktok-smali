package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveShowBlockInPreviewPageSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveShowBlockInPreviewPageSetting INSTANCE = new LiveShowBlockInPreviewPageSetting();

    private LiveShowBlockInPreviewPageSetting() {
    }

    static {
        Covode.recordClassIndex(10572);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveShowBlockInPreviewPageSetting.class);
    }
}
