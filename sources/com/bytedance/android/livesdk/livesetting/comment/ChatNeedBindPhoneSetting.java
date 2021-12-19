package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ChatNeedBindPhoneSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final ChatNeedBindPhoneSetting INSTANCE = new ChatNeedBindPhoneSetting();

    private ChatNeedBindPhoneSetting() {
    }

    static {
        Covode.recordClassIndex(10596);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ChatNeedBindPhoneSetting.class);
    }
}
