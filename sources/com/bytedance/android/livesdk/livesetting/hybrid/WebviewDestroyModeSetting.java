package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class WebviewDestroyModeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = -1;
    public static final WebviewDestroyModeSetting INSTANCE = new WebviewDestroyModeSetting();

    private WebviewDestroyModeSetting() {
    }

    static {
        Covode.recordClassIndex(10712);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(WebviewDestroyModeSetting.class);
    }
}
