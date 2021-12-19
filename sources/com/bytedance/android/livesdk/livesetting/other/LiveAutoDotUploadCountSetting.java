package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAutoDotUploadCountSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 50;
    public static final LiveAutoDotUploadCountSetting INSTANCE = new LiveAutoDotUploadCountSetting();

    private LiveAutoDotUploadCountSetting() {
    }

    static {
        Covode.recordClassIndex(10820);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAutoDotUploadCountSetting.class);
    }
}
