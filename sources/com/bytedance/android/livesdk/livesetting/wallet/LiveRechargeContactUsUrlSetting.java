package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveRechargeContactUsUrlSetting {
    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview?type=fullscreen&url=https%3A%2F%2Ftosv.byted.org%2Fobj%2Fgecko-internal-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fguide%2Ffeedback-and-guide.js&web_bg_color=FFFFFF&hide_nav_bar=1";
    public static final LiveRechargeContactUsUrlSetting INSTANCE = new LiveRechargeContactUsUrlSetting();

    private LiveRechargeContactUsUrlSetting() {
    }

    static {
        Covode.recordClassIndex(11003);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveRechargeContactUsUrlSetting.class);
    }
}
