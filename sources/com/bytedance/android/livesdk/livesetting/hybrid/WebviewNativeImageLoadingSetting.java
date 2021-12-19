package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class WebviewNativeImageLoadingSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final WebviewNativeImageLoadingSetting INSTANCE = new WebviewNativeImageLoadingSetting();

    private WebviewNativeImageLoadingSetting() {
    }

    static {
        Covode.recordClassIndex(10713);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(WebviewNativeImageLoadingSetting.class);
    }
}
