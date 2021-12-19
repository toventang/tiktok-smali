package com.bytedance.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    static ScheduledExecutorService f29686a;

    static {
        Covode.recordClassIndex(17238);
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        f29686a = (ScheduledExecutorService) g.a(a2.a());
    }

    public static Future a(Runnable runnable) {
        return f29686a.submit(runnable);
    }

    public static Future a(Runnable runnable, long j2) {
        return f29686a.scheduleWithFixedDelay(runnable, j2, 3600000, TimeUnit.MILLISECONDS);
    }
}
