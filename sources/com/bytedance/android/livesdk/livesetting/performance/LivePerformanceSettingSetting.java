package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.at;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class LivePerformanceSettingSetting {
    @Group(isDefault = true, value = "default group")
    private static final at DEFAULT;
    public static final LivePerformanceSettingSetting INSTANCE = new LivePerformanceSettingSetting();

    private LivePerformanceSettingSetting() {
    }

    public final at getDEFAULT() {
        return DEFAULT;
    }

    public final at getValue() {
        at atVar = (at) SettingsManager.INSTANCE.getValueSafely(LivePerformanceSettingSetting.class);
        if (atVar == null) {
            return DEFAULT;
        }
        return atVar;
    }

    static {
        Covode.recordClassIndex(10905);
        at atVar = new at();
        atVar.f18993a = true;
        l.b(atVar, "");
        DEFAULT = atVar;
    }
}
