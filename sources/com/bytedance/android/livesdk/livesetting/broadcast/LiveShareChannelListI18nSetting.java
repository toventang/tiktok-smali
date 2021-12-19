package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveShareChannelListI18nSetting {
    @Group(isDefault = true, value = "default group")
    private static final String[] DEFAULT = {"facebook", "twitter"};
    public static final LiveShareChannelListI18nSetting INSTANCE = new LiveShareChannelListI18nSetting();

    private LiveShareChannelListI18nSetting() {
    }

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveShareChannelListI18nSetting.class);
    }

    static {
        Covode.recordClassIndex(10571);
    }
}
