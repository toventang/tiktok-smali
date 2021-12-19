package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.p;
import com.bytedance.covode.number.Covode;

public final class LiveFeedPreloadSetting {
    @Group(isDefault = true, value = "default group")
    private static final p DEFAULT = new p();
    public static final LiveFeedPreloadSetting INSTANCE = new LiveFeedPreloadSetting();

    private LiveFeedPreloadSetting() {
    }

    public final p getValue() {
        p pVar = (p) SettingsManager.INSTANCE.getValueSafely(LiveFeedPreloadSetting.class);
        if (pVar == null) {
            return DEFAULT;
        }
        return pVar;
    }

    static {
        Covode.recordClassIndex(10833);
    }
}
