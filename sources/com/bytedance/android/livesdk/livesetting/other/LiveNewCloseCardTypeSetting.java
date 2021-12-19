package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveNewCloseCardTypeSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveNewCloseCardTypeSetting INSTANCE = new LiveNewCloseCardTypeSetting();

    private LiveNewCloseCardTypeSetting() {
    }

    static {
        Covode.recordClassIndex(10843);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveNewCloseCardTypeSetting.class);
    }
}
