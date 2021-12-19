package com.bytedance.android.livesdk.livesetting.recharge;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveWebRechargeUrl {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "sslocal://webcast_webview?url=https%3A%2F%2Fwww.tiktok.com%2Frecharge&show_title_bar=true&type=popup&gravity=bottom&title=TikTok.com&show_title_close=true&show_title_share=true&inapp=true&large=true";
    public static final LiveWebRechargeUrl INSTANCE = new LiveWebRechargeUrl();

    private LiveWebRechargeUrl() {
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveWebRechargeUrl.class);
    }

    static {
        Covode.recordClassIndex(10963);
    }
}
