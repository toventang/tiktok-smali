package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveTextWidgetShowMsgPerSizeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 100;
    public static final LiveTextWidgetShowMsgPerSizeSetting INSTANCE = new LiveTextWidgetShowMsgPerSizeSetting();

    private LiveTextWidgetShowMsgPerSizeSetting() {
    }

    static {
        Covode.recordClassIndex(10929);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveTextWidgetShowMsgPerSizeSetting.class);
    }
}
