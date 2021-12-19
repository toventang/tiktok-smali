package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.l;
import com.bytedance.covode.number.Covode;

public final class LivePublicScreenConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final l DEFAULT;
    public static final LivePublicScreenConfigSetting INSTANCE = new LivePublicScreenConfigSetting();

    private LivePublicScreenConfigSetting() {
    }

    public static final l getValue() {
        l lVar = (l) SettingsManager.INSTANCE.getValueSafely(LivePublicScreenConfigSetting.class);
        if (lVar == null) {
            return DEFAULT;
        }
        return lVar;
    }

    static {
        Covode.recordClassIndex(10925);
        l lVar = new l();
        h.f.b.l.b(lVar, "");
        DEFAULT = lVar;
    }
}
