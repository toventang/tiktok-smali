package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class PanelOpenCostTimesSetting {
    @Group(isDefault = true, value = "default group")
    private static final b DEFAULT = new b((byte) 0);
    public static final PanelOpenCostTimesSetting INSTANCE = new PanelOpenCostTimesSetting();

    private PanelOpenCostTimesSetting() {
    }

    public final b getValue() {
        b bVar = (b) SettingsManager.INSTANCE.getValueSafely(PanelOpenCostTimesSetting.class);
        if (bVar == null) {
            return DEFAULT;
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(10915);
    }
}
