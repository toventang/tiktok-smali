package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TiktokLiveWatchResourceGeckoBaseUrlSetting {
    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://lf77-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource";
    public static final TiktokLiveWatchResourceGeckoBaseUrlSetting INSTANCE = new TiktokLiveWatchResourceGeckoBaseUrlSetting();

    private TiktokLiveWatchResourceGeckoBaseUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10879);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(TiktokLiveWatchResourceGeckoBaseUrlSetting.class);
    }
}
