package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.am;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class LiveMessageTimeoutSetting {
    @Group(isDefault = true, value = "default group")
    private static final am DEFAULT = new am();
    public static final LiveMessageTimeoutSetting INSTANCE = new LiveMessageTimeoutSetting();
    private static final h settingValue$delegate = i.a((h.f.a.a) a.f18729a);

    private final am getSettingValue() {
        return (am) settingValue$delegate.getValue();
    }

    private LiveMessageTimeoutSetting() {
    }

    public final long getHttpFetchMonitorTimeout() {
        return getSettingValue().f18967a;
    }

    public final long getHttpFetchRequestTimeout() {
        return getSettingValue().f18968b;
    }

    public final long getWsConnectTimeout() {
        return getSettingValue().f18969c;
    }

    static final class a extends m implements h.f.a.a<am> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18729a = new a();

        static {
            Covode.recordClassIndex(10793);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ am invoke() {
            Object valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveMessageTimeoutSetting.class);
            if (valueSafely != null) {
                return valueSafely;
            }
            LiveMessageTimeoutSetting liveMessageTimeoutSetting = LiveMessageTimeoutSetting.INSTANCE;
            return LiveMessageTimeoutSetting.DEFAULT;
        }
    }

    static {
        Covode.recordClassIndex(10792);
    }
}
