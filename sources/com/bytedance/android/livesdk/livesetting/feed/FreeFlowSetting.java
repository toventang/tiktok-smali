package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.feed.feed.d;
import com.bytedance.covode.number.Covode;

public final class FreeFlowSetting {
    @Group(isDefault = true, value = "default group")
    private static final d DEFAULT = new d();
    public static final FreeFlowSetting INSTANCE = new FreeFlowSetting();

    private FreeFlowSetting() {
    }

    public final d getDEFAULT() {
        return DEFAULT;
    }

    public final d getValue() {
        d dVar = (d) SettingsManager.INSTANCE.getValueSafely(FreeFlowSetting.class);
        if (dVar == null) {
            return DEFAULT;
        }
        return dVar;
    }

    static {
        Covode.recordClassIndex(10619);
    }
}
