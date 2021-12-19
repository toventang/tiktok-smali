package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSquareInboxRefreshSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSquareInboxRefreshSetting INSTANCE = new LiveSquareInboxRefreshSetting();

    private LiveSquareInboxRefreshSetting() {
    }

    static {
        Covode.recordClassIndex(10858);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSquareInboxRefreshSetting.class);
    }
}
