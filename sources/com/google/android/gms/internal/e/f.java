package com.google.android.gms.internal.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class f implements e {
    static {
        Covode.recordClassIndex(31569);
    }

    private f() {
    }

    @Override // com.google.android.gms.internal.e.e
    public final ScheduledExecutorService a() {
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        return Executors.unconfigurableScheduledExecutorService((ScheduledExecutorService) g.a(a2.a()));
    }

    /* synthetic */ f(byte b2) {
        this();
    }
}
