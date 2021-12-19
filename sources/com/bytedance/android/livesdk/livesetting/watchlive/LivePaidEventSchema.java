package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePaidEventSchema {
    @Group(isDefault = true, value = "default")
    public static final String DEFAULT = "";
    public static final LivePaidEventSchema INSTANCE = new LivePaidEventSchema();

    private LivePaidEventSchema() {
    }

    static {
        Covode.recordClassIndex(11053);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePaidEventSchema.class);
    }
}
