package com.google.android.gms.internal.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

final class c implements b {
    static {
        Covode.recordClassIndex(31573);
    }

    private c() {
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    @Override // com.google.android.gms.internal.f.b
    public final ScheduledExecutorService a(ThreadFactory threadFactory) {
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        a2.f79178g = threadFactory;
        return Executors.unconfigurableScheduledExecutorService((ScheduledExecutorService) g.a(a2.a()));
    }
}
