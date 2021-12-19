package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class MonitorImpl implements Monitor {
    private final boolean isDebug;

    static {
        Covode.recordClassIndex(7358);
    }

    public static int com_bytedance_android_live_settings_MonitorImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public MonitorImpl(boolean z) {
        this.isDebug = z;
    }

    @Override // com.bytedance.android.live_settings.Monitor
    public final void performanceMonitor(String str, long j2) {
        l.c(str, "");
        if (this.isDebug) {
            com_bytedance_android_live_settings_MonitorImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e("LiveSettingPerformance", str + " cost: " + j2);
        }
    }

    @Override // com.bytedance.android.live_settings.Monitor
    public final void reportException(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        if (this.isDebug) {
            throw new Throwable(str + ' ' + str2);
        }
    }
}
