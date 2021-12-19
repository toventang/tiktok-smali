package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveForbidNotifyToolsStartBroadcastSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveForbidNotifyToolsStartBroadcastSetting INSTANCE = new LiveForbidNotifyToolsStartBroadcastSetting();

    private LiveForbidNotifyToolsStartBroadcastSetting() {
    }

    static {
        Covode.recordClassIndex(10548);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveForbidNotifyToolsStartBroadcastSetting.class);
    }
}
