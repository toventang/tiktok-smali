package com.bytedance.android.livesdk.livesetting.recharge;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveWebRechargeDialog {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "sslocal://webcast_lynxview?type=popup&url=https%3A%2F%2Ftosv.byted.org%2Fobj%2Fgecko-internal-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fguide%2Flarge-sum-entrance.js&height=390&width_percent=80&hide_nav_bar=1&mask_alpha=0.8&show_dim=1&radius=8&web_bg_color=FFFFFF";
    public static final LiveWebRechargeDialog INSTANCE = new LiveWebRechargeDialog();

    private LiveWebRechargeDialog() {
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveWebRechargeDialog.class);
    }

    static {
        Covode.recordClassIndex(10962);
    }
}
