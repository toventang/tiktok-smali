package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnablePreviewCardUsePreviewSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnablePreviewCardUsePreviewSetting INSTANCE = new EnablePreviewCardUsePreviewSetting();

    private EnablePreviewCardUsePreviewSetting() {
    }

    static {
        Covode.recordClassIndex(11020);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnablePreviewCardUsePreviewSetting.class);
    }
}
