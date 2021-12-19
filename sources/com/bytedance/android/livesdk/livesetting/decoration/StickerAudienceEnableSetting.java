package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class StickerAudienceEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final StickerAudienceEnableSetting INSTANCE = new StickerAudienceEnableSetting();

    private StickerAudienceEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10608);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(StickerAudienceEnableSetting.class);
    }
}
