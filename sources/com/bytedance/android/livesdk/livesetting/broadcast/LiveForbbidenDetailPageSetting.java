package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveForbbidenDetailPageSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveForbbidenDetailPageSetting INSTANCE = new LiveForbbidenDetailPageSetting();

    private LiveForbbidenDetailPageSetting() {
    }

    static {
        Covode.recordClassIndex(10547);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveForbbidenDetailPageSetting.class);
    }
}
