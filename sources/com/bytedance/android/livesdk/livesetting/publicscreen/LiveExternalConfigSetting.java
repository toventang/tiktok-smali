package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.j;
import com.bytedance.covode.number.Covode;

public final class LiveExternalConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final j DEFAULT = new j();
    public static final LiveExternalConfigSetting INSTANCE = new LiveExternalConfigSetting();

    private LiveExternalConfigSetting() {
    }

    public final j getValue() {
        j jVar = (j) SettingsManager.INSTANCE.getValueSafely(LiveExternalConfigSetting.class);
        if (jVar == null) {
            return DEFAULT;
        }
        return jVar;
    }

    static {
        Covode.recordClassIndex(10922);
    }
}
