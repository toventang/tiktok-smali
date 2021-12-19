package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveHardwareDecodeBytevc1EnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveHardwareDecodeBytevc1EnableSetting INSTANCE = new LiveHardwareDecodeBytevc1EnableSetting();

    private LiveHardwareDecodeBytevc1EnableSetting() {
    }

    static {
        Covode.recordClassIndex(10933);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveHardwareDecodeBytevc1EnableSetting.class);
    }
}
