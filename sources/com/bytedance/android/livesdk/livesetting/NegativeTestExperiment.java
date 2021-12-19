package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class NegativeTestExperiment {
    public static final NegativeTestExperiment INSTANCE = new NegativeTestExperiment();
    @Group(isDefault = true, value = "default group")
    private static final b close;
    private static final b settingValue;

    private NegativeTestExperiment() {
    }

    public final b getClose() {
        return close;
    }

    public final long getCyclePeriod() {
        return settingValue.f18703b;
    }

    public final long getCpuSleepTime() {
        b bVar = settingValue;
        return (bVar.f18703b * (100 - bVar.f18702a)) / 100;
    }

    static {
        Covode.recordClassIndex(10496);
        b bVar = new b((byte) 0);
        close = bVar;
        b bVar2 = (b) SettingsManager.INSTANCE.getValueSafely(NegativeTestExperiment.class);
        if (bVar2 != null) {
            bVar = bVar2;
        }
        settingValue = bVar;
    }

    public final boolean isEnable(boolean z) {
        b bVar = settingValue;
        if (bVar.f18704c != z || bVar.f18702a <= close.f18702a) {
            return false;
        }
        return true;
    }
}
