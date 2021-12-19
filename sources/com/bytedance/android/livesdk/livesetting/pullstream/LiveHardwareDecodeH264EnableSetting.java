package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveHardwareDecodeH264EnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveHardwareDecodeH264EnableSetting INSTANCE = new LiveHardwareDecodeH264EnableSetting();

    private LiveHardwareDecodeH264EnableSetting() {
    }

    static {
        Covode.recordClassIndex(10934);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveHardwareDecodeH264EnableSetting.class);
    }
}
