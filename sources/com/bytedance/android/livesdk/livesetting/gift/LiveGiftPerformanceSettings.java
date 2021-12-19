package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftPerformanceSettings {
    @Group(isDefault = true, value = "default group")
    private static final b DEFAULT = new b(0, 0, 14);
    public static final LiveGiftPerformanceSettings INSTANCE = new LiveGiftPerformanceSettings();

    private LiveGiftPerformanceSettings() {
    }

    public final int getHotQueueSize() {
        return getConfig().f18712c;
    }

    public final int getSelfHotQueueSize() {
        return getConfig().f18713d;
    }

    public final boolean useNewQueue() {
        return getConfig().f18710a;
    }

    public final boolean useNewSelfQueue() {
        return getConfig().f18711b;
    }

    private final b getConfig() {
        b bVar = (b) SettingsManager.INSTANCE.getValueSafely(LiveGiftPerformanceSettings.class);
        if (bVar == null) {
            return DEFAULT;
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(10658);
    }
}
