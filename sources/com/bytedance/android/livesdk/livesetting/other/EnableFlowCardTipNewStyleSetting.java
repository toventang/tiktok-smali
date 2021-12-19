package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableFlowCardTipNewStyleSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final EnableFlowCardTipNewStyleSetting INSTANCE = new EnableFlowCardTipNewStyleSetting();

    private EnableFlowCardTipNewStyleSetting() {
    }

    static {
        Covode.recordClassIndex(10810);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableFlowCardTipNewStyleSetting.class);
    }
}
