package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMsgTypeAlogEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveMsgTypeAlogEnableSetting INSTANCE = new LiveMsgTypeAlogEnableSetting();

    private LiveMsgTypeAlogEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10795);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMsgTypeAlogEnableSetting.class);
    }
}
