package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class SearchCardReusePlayerSetting {
    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final SearchCardReusePlayerSetting INSTANCE = new SearchCardReusePlayerSetting();
    @Group("v1")
    public static final boolean enableValue = true;

    private SearchCardReusePlayerSetting() {
    }

    static {
        Covode.recordClassIndex(11072);
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(SearchCardReusePlayerSetting.class)) {
            return true;
        }
        return false;
    }
}
