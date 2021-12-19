package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ShowAudienceDefinitionSelectionSetting {
    @Group(isDefault = true, value = "default_group")
    public static final int DISABLE = 0;
    @Group("experiment_group")
    public static final int ENABLE = 1;
    public static final ShowAudienceDefinitionSelectionSetting INSTANCE = new ShowAudienceDefinitionSelectionSetting();

    private ShowAudienceDefinitionSelectionSetting() {
    }

    static {
        Covode.recordClassIndex(11074);
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(ShowAudienceDefinitionSelectionSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
