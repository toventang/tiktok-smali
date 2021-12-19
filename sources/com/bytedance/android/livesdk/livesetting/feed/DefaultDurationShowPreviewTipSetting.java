package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class DefaultDurationShowPreviewTipSetting {
    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 7.0f;
    public static final DefaultDurationShowPreviewTipSetting INSTANCE = new DefaultDurationShowPreviewTipSetting();

    private DefaultDurationShowPreviewTipSetting() {
    }

    static {
        Covode.recordClassIndex(10612);
    }

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(DefaultDurationShowPreviewTipSetting.class);
    }
}
