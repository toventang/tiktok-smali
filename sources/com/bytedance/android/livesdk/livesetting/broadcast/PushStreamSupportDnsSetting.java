package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class PushStreamSupportDnsSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    @Group("disable group")
    private static final int DISABLE = 0;
    @Group("enable group")
    private static final int ENABLE = 1;
    public static final PushStreamSupportDnsSetting INSTANCE = new PushStreamSupportDnsSetting();

    private PushStreamSupportDnsSetting() {
    }

    static {
        Covode.recordClassIndex(10586);
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(PushStreamSupportDnsSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
