package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class StickerAnchorEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final StickerAnchorEnableSetting INSTANCE = new StickerAnchorEnableSetting();

    private StickerAnchorEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10607);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(StickerAnchorEnableSetting.class);
    }
}
