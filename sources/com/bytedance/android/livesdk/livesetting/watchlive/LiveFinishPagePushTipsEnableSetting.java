package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFinishPagePushTipsEnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveFinishPagePushTipsEnableSetting INSTANCE = new LiveFinishPagePushTipsEnableSetting();

    private LiveFinishPagePushTipsEnableSetting() {
    }

    static {
        Covode.recordClassIndex(11040);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFinishPagePushTipsEnableSetting.class);
    }
}
