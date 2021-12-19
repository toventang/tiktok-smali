package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveUseEmojiCompatSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveUseEmojiCompatSetting INSTANCE = new LiveUseEmojiCompatSetting();

    private LiveUseEmojiCompatSetting() {
    }

    static {
        Covode.recordClassIndex(10987);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveUseEmojiCompatSetting.class);
    }
}
