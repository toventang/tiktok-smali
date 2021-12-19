package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.s;
import com.bytedance.covode.number.Covode;

public final class FirstChargeSetting {
    @Group(isDefault = true, value = "default group")
    private static final s DEFAULT = new s();
    public static final FirstChargeSetting INSTANCE = new FirstChargeSetting();

    private FirstChargeSetting() {
    }

    public final s getDEFAULT() {
        return DEFAULT;
    }

    public final s getValue() {
        s sVar = (s) SettingsManager.INSTANCE.getValueSafely(FirstChargeSetting.class);
        if (sVar == null) {
            return DEFAULT;
        }
        return sVar;
    }

    static {
        Covode.recordClassIndex(10995);
    }
}
