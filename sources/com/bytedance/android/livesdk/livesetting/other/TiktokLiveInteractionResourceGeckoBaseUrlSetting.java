package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TiktokLiveInteractionResourceGeckoBaseUrlSetting {
    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource";
    public static final TiktokLiveInteractionResourceGeckoBaseUrlSetting INSTANCE = new TiktokLiveInteractionResourceGeckoBaseUrlSetting();

    private TiktokLiveInteractionResourceGeckoBaseUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10878);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(TiktokLiveInteractionResourceGeckoBaseUrlSetting.class);
    }
}
