package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveNewEffectPanelSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveNewEffectPanelSetting INSTANCE = new LiveNewEffectPanelSetting();
    @Group("new panel")
    private static final int USE_NEW_PANEL = 1;
    @Group("old panel")
    private static final int USE_OLD_PANEL = 0;

    private LiveNewEffectPanelSetting() {
    }

    static {
        Covode.recordClassIndex(10609);
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveNewEffectPanelSetting.class);
    }

    public final boolean useNewPanel() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean useOldPanel() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }
}
