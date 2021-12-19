package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class HybridDialogEnableActivityDim {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final HybridDialogEnableActivityDim INSTANCE = new HybridDialogEnableActivityDim();

    private HybridDialogEnableActivityDim() {
    }

    static {
        Covode.recordClassIndex(10687);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(HybridDialogEnableActivityDim.class);
    }
}
