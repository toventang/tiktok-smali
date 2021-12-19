package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGroupToolbarReddotSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveGroupToolbarReddotSetting INSTANCE = new LiveGroupToolbarReddotSetting();

    private LiveGroupToolbarReddotSetting() {
    }

    static {
        Covode.recordClassIndex(10551);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveGroupToolbarReddotSetting.class);
    }
}
