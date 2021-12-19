package com.ss.ugc.aweme.performance.core.monitor.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ScheduledExecutorService;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f153380a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static a f153381b;

    /* renamed from: c  reason: collision with root package name */
    private static ScheduledExecutorService f153382c;

    private b() {
    }

    static {
        Covode.recordClassIndex(101822);
    }

    private static ScheduledExecutorService a() {
        return (ScheduledExecutorService) g.a(l.a(o.SCHEDULED).a(4).a());
    }

    @Override // com.ss.ugc.aweme.performance.core.monitor.e.a
    public final void a(Runnable runnable) {
        h.f.b.l.c(runnable, "");
        a aVar = f153381b;
        if (aVar != null) {
            aVar.a(runnable);
            return;
        }
        if (f153382c == null) {
            f153382c = a();
        }
        ScheduledExecutorService scheduledExecutorService = f153382c;
        if (scheduledExecutorService == null) {
            h.f.b.l.a();
        }
        scheduledExecutorService.submit(runnable);
    }
}
