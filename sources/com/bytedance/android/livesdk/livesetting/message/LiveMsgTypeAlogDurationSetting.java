package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMsgTypeAlogDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 3;
    public static final LiveMsgTypeAlogDurationSetting INSTANCE = new LiveMsgTypeAlogDurationSetting();

    private LiveMsgTypeAlogDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10794);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMsgTypeAlogDurationSetting.class);
    }
}
