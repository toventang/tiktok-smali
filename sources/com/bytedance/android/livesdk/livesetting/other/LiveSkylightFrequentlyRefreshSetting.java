package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSkylightFrequentlyRefreshSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSkylightFrequentlyRefreshSetting INSTANCE = new LiveSkylightFrequentlyRefreshSetting();

    private LiveSkylightFrequentlyRefreshSetting() {
    }

    static {
        Covode.recordClassIndex(10856);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSkylightFrequentlyRefreshSetting.class);
    }
}
