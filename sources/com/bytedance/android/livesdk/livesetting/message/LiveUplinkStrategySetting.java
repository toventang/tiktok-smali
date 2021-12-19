package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.ap;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Map;

public final class LiveUplinkStrategySetting {
    @Group(isDefault = true, value = "default group")
    private static final ap DEFAULT = new ap();
    public static final LiveUplinkStrategySetting INSTANCE = new LiveUplinkStrategySetting();
    private static final h settingValue$delegate = i.a((h.f.a.a) a.f18730a);

    private final ap getSettingValue() {
        return (ap) settingValue$delegate.getValue();
    }

    private LiveUplinkStrategySetting() {
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>>, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> */
    public final Map<String, Map<String, Long>> getUplinkApiAllowedList() {
        return getSettingValue().f18977d;
    }

    public final long getWsUplinkWaitTimeout() {
        return getSettingValue().f18976c;
    }

    public final boolean supportUplink() {
        return getSettingValue().f18974a;
    }

    public final boolean supportHttpUplink() {
        if (getSettingValue().f18975b == 0) {
            return true;
        }
        return false;
    }

    public final boolean supportWSUplink() {
        if (getSettingValue().f18975b != 2) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<ap> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18730a = new a();

        static {
            Covode.recordClassIndex(10798);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ap invoke() {
            Object valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveUplinkStrategySetting.class);
            if (valueSafely != null) {
                return valueSafely;
            }
            LiveUplinkStrategySetting liveUplinkStrategySetting = LiveUplinkStrategySetting.INSTANCE;
            return LiveUplinkStrategySetting.DEFAULT;
        }
    }

    static {
        Covode.recordClassIndex(10797);
    }
}
