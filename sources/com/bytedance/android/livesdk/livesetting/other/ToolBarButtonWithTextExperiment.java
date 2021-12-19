package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ToolBarButtonWithTextExperiment {
    @Group(isDefault = true, value = "control_group")
    public static final boolean DEFALUT = false;
    @Group("experimental_group")
    public static final boolean HAS_TEXT = true;
    public static final ToolBarButtonWithTextExperiment INSTANCE = new ToolBarButtonWithTextExperiment();

    private ToolBarButtonWithTextExperiment() {
    }

    static {
        Covode.recordClassIndex(10880);
    }

    public static final boolean hasText() {
        if (SettingsManager.INSTANCE.getBooleanValue(ToolBarButtonWithTextExperiment.class)) {
            return true;
        }
        return false;
    }
}
