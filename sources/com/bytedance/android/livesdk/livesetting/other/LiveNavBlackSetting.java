package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveNavBlackSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveNavBlackSetting INSTANCE = new LiveNavBlackSetting();

    private LiveNavBlackSetting() {
    }

    static {
        Covode.recordClassIndex(10842);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveNavBlackSetting.class);
    }
}
