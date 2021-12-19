package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSubscribeFeedbackUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "aweme://webview/?hide_nav_bar=1&url=https%3A%2F%2Fwww.tiktok.com%2Finapp%2Ffeedback%2Fmain%2F%3Fhide_nav_bar%3D1%26id%3D13000%26isfromfaq%3D1";
    public static final LiveSubscribeFeedbackUrlSetting INSTANCE = new LiveSubscribeFeedbackUrlSetting();

    private LiveSubscribeFeedbackUrlSetting() {
    }

    static {
        Covode.recordClassIndex(11008);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveSubscribeFeedbackUrlSetting.class);
    }
}
