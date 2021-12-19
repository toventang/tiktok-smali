package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.DefaultDonationStickerPosition;
import com.bytedance.covode.number.Covode;

public final class DefaultDonationStickerPositionSetting {
    @Group(isDefault = true, value = "default group")
    private static final DefaultDonationStickerPosition DEFAULT = new DefaultDonationStickerPosition();
    public static final DefaultDonationStickerPositionSetting INSTANCE = new DefaultDonationStickerPositionSetting();

    private DefaultDonationStickerPositionSetting() {
    }

    public final DefaultDonationStickerPosition getValue() {
        DefaultDonationStickerPosition defaultDonationStickerPosition = (DefaultDonationStickerPosition) SettingsManager.INSTANCE.getValueSafely(DefaultDonationStickerPositionSetting.class);
        if (defaultDonationStickerPosition == null) {
            return DEFAULT;
        }
        return defaultDonationStickerPosition;
    }

    static {
        Covode.recordClassIndex(10605);
    }
}
