package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveExchangeEntranceSchema {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveExchangeEntranceSchema INSTANCE = new LiveExchangeEntranceSchema();

    private LiveExchangeEntranceSchema() {
    }

    static {
        Covode.recordClassIndex(10640);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveExchangeEntranceSchema.class);
    }
}
