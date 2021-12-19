package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGameCategoryEntranceSetting {
    @Group(isDefault = true, value = "default_group")
    public static final int HIDE = 0;
    public static final LiveGameCategoryEntranceSetting INSTANCE = new LiveGameCategoryEntranceSetting();
    @Group("experiment_group")
    public static final int SHOW = 1;

    private LiveGameCategoryEntranceSetting() {
    }

    static {
        Covode.recordClassIndex(10549);
    }

    public final boolean shouldShow() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGameCategoryEntranceSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
