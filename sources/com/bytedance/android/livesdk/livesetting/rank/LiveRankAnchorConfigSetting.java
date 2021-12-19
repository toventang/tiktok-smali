package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.an;
import com.bytedance.covode.number.Covode;

public final class LiveRankAnchorConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final an DEFAULT = new an();
    public static final LiveRankAnchorConfigSetting INSTANCE = new LiveRankAnchorConfigSetting();

    private LiveRankAnchorConfigSetting() {
    }

    public final an getValue() {
        an anVar = (an) SettingsManager.INSTANCE.getValueSafely(LiveRankAnchorConfigSetting.class);
        if (anVar == null) {
            return DEFAULT;
        }
        return anVar;
    }

    static {
        Covode.recordClassIndex(10953);
    }
}
