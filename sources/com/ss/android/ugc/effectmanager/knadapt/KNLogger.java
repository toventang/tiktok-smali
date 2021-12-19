package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import d.a.e.a;
import h.f.b.l;

public final class KNLogger implements a {
    public static final KNLogger INSTANCE = new KNLogger();

    public final void setEnabled(boolean z) {
    }

    private KNLogger() {
    }

    @Override // d.a.e.a
    public final boolean getEnabled() {
        return EPLog.INSTANCE.getSEnableLog();
    }

    static {
        Covode.recordClassIndex(95550);
    }

    @Override // d.a.e.a
    public final void logDebug(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        EPLog.d(str, str2);
    }

    @Override // d.a.e.a
    public final void logError(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        EPLog.e(str, str2);
    }

    @Override // d.a.e.a
    public final void logError(String str, String str2, Throwable th) {
        l.c(str, "");
        l.c(str2, "");
        l.c(th, "");
        EPLog.e(str, str2, th);
    }
}
