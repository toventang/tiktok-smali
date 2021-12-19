package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class InteractStartFetchingMessageStyleSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 2;
    public static final InteractStartFetchingMessageStyleSetting INSTANCE = new InteractStartFetchingMessageStyleSetting();

    private InteractStartFetchingMessageStyleSetting() {
    }

    static {
        Covode.recordClassIndex(11031);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(InteractStartFetchingMessageStyleSetting.class);
    }
}
