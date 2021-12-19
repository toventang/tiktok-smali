package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class DecoTextModifyFrequencySetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final DecoTextModifyFrequencySetting INSTANCE = new DecoTextModifyFrequencySetting();

    private DecoTextModifyFrequencySetting() {
    }

    static {
        Covode.recordClassIndex(10807);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(DecoTextModifyFrequencySetting.class);
    }
}
