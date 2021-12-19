package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAnchorMessageFoldTypeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveAnchorMessageFoldTypeSetting INSTANCE = new LiveAnchorMessageFoldTypeSetting();

    private LiveAnchorMessageFoldTypeSetting() {
    }

    static {
        Covode.recordClassIndex(10785);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAnchorMessageFoldTypeSetting.class);
    }
}
