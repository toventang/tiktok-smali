package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFansGroupUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveFansGroupUrlSetting INSTANCE = new LiveFansGroupUrlSetting();

    private LiveFansGroupUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10832);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveFansGroupUrlSetting.class);
    }
}
