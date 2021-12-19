package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class WebViewUseBoeHeaderSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final WebViewUseBoeHeaderSetting INSTANCE = new WebViewUseBoeHeaderSetting();

    private WebViewUseBoeHeaderSetting() {
    }

    static {
        Covode.recordClassIndex(10711);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(WebViewUseBoeHeaderSetting.class);
    }
}
