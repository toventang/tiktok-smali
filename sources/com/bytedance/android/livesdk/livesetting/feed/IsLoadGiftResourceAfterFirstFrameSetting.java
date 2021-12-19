package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class IsLoadGiftResourceAfterFirstFrameSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final IsLoadGiftResourceAfterFirstFrameSetting INSTANCE = new IsLoadGiftResourceAfterFirstFrameSetting();

    private IsLoadGiftResourceAfterFirstFrameSetting() {
    }

    static {
        Covode.recordClassIndex(10622);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(IsLoadGiftResourceAfterFirstFrameSetting.class);
    }
}
