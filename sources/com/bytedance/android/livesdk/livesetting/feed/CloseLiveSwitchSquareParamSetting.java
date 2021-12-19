package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.ax;
import com.bytedance.covode.number.Covode;

public final class CloseLiveSwitchSquareParamSetting {
    @Group(isDefault = true, value = "default group")
    private static final ax DEFAULT = new ax();
    public static final CloseLiveSwitchSquareParamSetting INSTANCE = new CloseLiveSwitchSquareParamSetting();

    private CloseLiveSwitchSquareParamSetting() {
    }

    public final ax getDEFAULT() {
        return DEFAULT;
    }

    public final ax getValue() {
        ax axVar = (ax) SettingsManager.INSTANCE.getValueSafely(CloseLiveSwitchSquareParamSetting.class);
        if (axVar == null) {
            return DEFAULT;
        }
        return axVar;
    }

    static {
        Covode.recordClassIndex(10611);
    }
}
