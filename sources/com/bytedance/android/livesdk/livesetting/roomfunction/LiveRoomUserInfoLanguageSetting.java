package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveRoomUserInfoLanguageSetting {
    @Group(isDefault = true, value = "default group")
    private static final String[] DEFAULT = {"ru-RU"};
    public static final LiveRoomUserInfoLanguageSetting INSTANCE = new LiveRoomUserInfoLanguageSetting();

    private LiveRoomUserInfoLanguageSetting() {
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveRoomUserInfoLanguageSetting.class);
    }

    static {
        Covode.recordClassIndex(10982);
    }
}
