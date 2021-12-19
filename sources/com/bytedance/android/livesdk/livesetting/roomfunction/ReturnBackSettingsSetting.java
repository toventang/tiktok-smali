package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.a.b;
import com.bytedance.covode.number.Covode;

public final class ReturnBackSettingsSetting {
    @Group(isDefault = true, value = "default group")
    private static final b DEFAULT = new b();
    public static final ReturnBackSettingsSetting INSTANCE = new ReturnBackSettingsSetting();

    private ReturnBackSettingsSetting() {
    }

    public final b getDEFAULT() {
        return DEFAULT;
    }

    public final b getValue() {
        b bVar = (b) SettingsManager.INSTANCE.getValueSafely(ReturnBackSettingsSetting.class);
        if (bVar == null) {
            return DEFAULT;
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(10990);
    }
}
