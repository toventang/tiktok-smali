package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveChatShowDelayForHotLiveSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 400;
    public static final LiveChatShowDelayForHotLiveSetting INSTANCE = new LiveChatShowDelayForHotLiveSetting();

    private LiveChatShowDelayForHotLiveSetting() {
    }

    static {
        Covode.recordClassIndex(10920);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveChatShowDelayForHotLiveSetting.class);
    }
}
