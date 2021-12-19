package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live_settings.Monitor;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.v;

public final class a implements Monitor {
    static {
        Covode.recordClassIndex(10497);
    }

    @Override // com.bytedance.android.live_settings.Monitor
    public final void performanceMonitor(String str, long j2) {
        l.d(str, "");
        c.a("ttlive_settings_manager_performance_monitor", 0, ag.a(v.a(str, Long.valueOf(j2))));
    }

    @Override // com.bytedance.android.live_settings.Monitor
    public final void reportException(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        c.a("ttlive_settings_manager_monitor", 0, ag.a(v.a("exception", str + ", " + str2)));
    }
}
