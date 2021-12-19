package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class SearchLiveCardReusePlayerSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final SearchLiveCardReusePlayerSetting INSTANCE = new SearchLiveCardReusePlayerSetting();

    private SearchLiveCardReusePlayerSetting() {
    }

    static {
        Covode.recordClassIndex(11073);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SearchLiveCardReusePlayerSetting.class);
    }
}
