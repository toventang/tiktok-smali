package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.a.a;
import com.bytedance.covode.number.Covode;

public final class BackRoomListSettingConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final a DEFAULT = new a();
    public static final BackRoomListSettingConfigSetting INSTANCE = new BackRoomListSettingConfigSetting();

    private BackRoomListSettingConfigSetting() {
    }

    public final a getDEFAULT() {
        return DEFAULT;
    }

    public final a getValue() {
        a aVar = (a) SettingsManager.INSTANCE.getValueSafely(BackRoomListSettingConfigSetting.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(11016);
    }
}
