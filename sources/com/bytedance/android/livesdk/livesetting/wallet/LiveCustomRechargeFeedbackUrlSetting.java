package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCustomRechargeFeedbackUrlSetting {
    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview?type=fullscreen&url=https%3A%2F%2Ftosv.byted.org%2Fobj%2Fgecko-internal-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fguide%2Ffeedback-and-guide.js&web_bg_color=FFFFFF&hide_nav_bar=1";
    public static final LiveCustomRechargeFeedbackUrlSetting INSTANCE = new LiveCustomRechargeFeedbackUrlSetting();

    private LiveCustomRechargeFeedbackUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10997);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveCustomRechargeFeedbackUrlSetting.class);
    }
}
