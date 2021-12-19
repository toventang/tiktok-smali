package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMessageSetting {
    @Group(isDefault = true, value = "default group")
    private static final LiveMessageConfig DEFAULT;
    public static final LiveMessageSetting INSTANCE = new LiveMessageSetting();
    private static LiveMessageConfig liveMessageConfig;

    private LiveMessageSetting() {
    }

    public final int duplicateSize() {
        return liveMessageConfig.getDuplicateSize();
    }

    public final boolean enhanceWebsocket() {
        return liveMessageConfig.getEnhanceWebsocket();
    }

    static {
        Covode.recordClassIndex(10791);
        LiveMessageConfig liveMessageConfig2 = new LiveMessageConfig(0, false, 3, null);
        DEFAULT = liveMessageConfig2;
        LiveMessageConfig liveMessageConfig3 = (LiveMessageConfig) SettingsManager.INSTANCE.getValueSafely(LiveMessageSetting.class);
        if (liveMessageConfig3 != null) {
            liveMessageConfig2 = liveMessageConfig3;
        }
        liveMessageConfig = liveMessageConfig2;
    }
}
