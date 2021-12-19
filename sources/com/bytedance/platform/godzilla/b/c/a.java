package com.bytedance.platform.godzilla.b.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.c.e;
import java.util.concurrent.TimeoutException;

public final class a extends e {
    static {
        Covode.recordClassIndex(25649);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "FinalizeTimeoutPlugin";
    }

    @Override // com.bytedance.platform.godzilla.c.e
    public final boolean c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.c.a, com.bytedance.platform.godzilla.c.e
    public final void a() {
        super.a();
    }

    @Override // com.bytedance.platform.godzilla.a.h
    public final boolean a(Thread thread, Throwable th) {
        if (thread == null || th == null || !thread.getName().equals("FinalizerWatchdogDaemon") || !(th instanceof TimeoutException)) {
            return false;
        }
        g.a(g.a.ERROR);
        return true;
    }
}
