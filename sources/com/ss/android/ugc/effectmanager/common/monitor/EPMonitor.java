package com.ss.android.ugc.effectmanager.common.monitor;

import com.bytedance.covode.number.Covode;

public final class EPMonitor {
    public static final EPMonitor INSTANCE = new EPMonitor();

    private EPMonitor() {
    }

    static {
        Covode.recordClassIndex(95309);
    }

    public static final void traceBegin(MonitorTrace monitorTrace) {
        if (monitorTrace != null) {
            monitorTrace.begin();
        }
    }

    public static final void traceEnd(MonitorTrace monitorTrace) {
        if (monitorTrace != null) {
            monitorTrace.end();
        }
    }

    public static final void traceStep(MonitorTrace monitorTrace, String str) {
        if (str != null && monitorTrace != null) {
            monitorTrace.addStep(str);
        }
    }
}
