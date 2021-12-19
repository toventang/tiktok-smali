package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFirstRechargeWebUrlLynxFaq {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "sslocal://webcast_lynxview?type=popup&height=543&radius=8&gravity=bottom&web_bg_color=ffffff&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fcharge%2Fcharge_welcome_faq.js";
    public static final LiveFirstRechargeWebUrlLynxFaq INSTANCE = new LiveFirstRechargeWebUrlLynxFaq();

    private LiveFirstRechargeWebUrlLynxFaq() {
    }

    static {
        Covode.recordClassIndex(10649);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveFirstRechargeWebUrlLynxFaq.class);
    }
}
