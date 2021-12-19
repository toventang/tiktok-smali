package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.au;
import com.bytedance.covode.number.Covode;

public final class RanklistInfoSetting {
    @Group(isDefault = true, value = "default group")
    private static final au DEFAULT = new au();
    public static final RanklistInfoSetting INSTANCE = new RanklistInfoSetting();

    private RanklistInfoSetting() {
    }

    public final au getValue() {
        au auVar = (au) SettingsManager.INSTANCE.getValueSafely(RanklistInfoSetting.class);
        if (auVar == null) {
            return DEFAULT;
        }
        return auVar;
    }

    static {
        Covode.recordClassIndex(10956);
    }
}
