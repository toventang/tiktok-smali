package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveTextWidgetShowMsgPerMillisSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1000;
    public static final LiveTextWidgetShowMsgPerMillisSetting INSTANCE = new LiveTextWidgetShowMsgPerMillisSetting();

    private LiveTextWidgetShowMsgPerMillisSetting() {
    }

    static {
        Covode.recordClassIndex(10928);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveTextWidgetShowMsgPerMillisSetting.class);
    }
}
