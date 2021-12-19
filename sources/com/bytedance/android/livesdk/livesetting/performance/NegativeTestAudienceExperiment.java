package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.b;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class NegativeTestAudienceExperiment {
    public static final NegativeTestAudienceExperiment INSTANCE = new NegativeTestAudienceExperiment();
    @Group(isDefault = true, value = "default group")
    private static final b close = new b((byte) 0);
    private static final h settingValue$delegate = i.a((h.f.a.a) a.f18733a);

    private final b getSettingValue() {
        return (b) settingValue$delegate.getValue();
    }

    private NegativeTestAudienceExperiment() {
    }

    public final b getClose() {
        return close;
    }

    public final long getCyclePeriod() {
        return getSettingValue().f18703b;
    }

    static final class a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18733a = new a();

        static {
            Covode.recordClassIndex(10914);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            Object valueSafely = SettingsManager.INSTANCE.getValueSafely(NegativeTestAudienceExperiment.class);
            if (valueSafely == null) {
                return NegativeTestAudienceExperiment.INSTANCE.getClose();
            }
            return valueSafely;
        }
    }

    static {
        Covode.recordClassIndex(10913);
    }

    public final long getCpuSleepTime() {
        return (getSettingValue().f18703b * (100 - getSettingValue().f18702a)) / 100;
    }

    public final boolean isEnable(boolean z) {
        if (getSettingValue().f18704c != z || getSettingValue().f18702a <= close.f18702a) {
            return false;
        }
        return true;
    }
}
