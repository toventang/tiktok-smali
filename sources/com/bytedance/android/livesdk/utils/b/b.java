package com.bytedance.android.livesdk.utils.b;

import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import f.a.aa;
import f.a.d.k;
import f.a.e.b.a;
import f.a.e.e.e.aj;
import f.a.e.e.e.ak;
import f.a.e.e.e.av;
import f.a.t;
import java.util.concurrent.TimeUnit;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public t<T> f22249a;

    static {
        Covode.recordClassIndex(13142);
    }

    b(t<T> tVar) {
        this.f22249a = tVar;
    }

    public final t<T> a(long j2) {
        return a(j2, a.f157195h);
    }

    public static t<Long> a(TimeUnit timeUnit) {
        aa a2;
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            a2 = f.a.k.a.a(g.b());
        } else {
            a2 = f.a.h.a.a(f.a.k.a.f158005b);
        }
        return a(timeUnit, a2);
    }

    public static t<Long> b(long j2, TimeUnit timeUnit) {
        aa a2;
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            a2 = f.a.k.a.a(g.b());
        } else {
            a2 = f.a.h.a.a(f.a.k.a.f158005b);
        }
        return a(j2, j2, timeUnit, a2);
    }

    private t<T> a(long j2, k<? super Throwable> kVar) {
        if (j2 >= 0) {
            f.a.e.b.b.a((Object) kVar, "predicate is null");
            return f.a.h.a.a(new av(this.f22249a, j2, kVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was ".concat(String.valueOf(j2)));
    }

    public static t<Long> a(long j2, TimeUnit timeUnit) {
        aa a2;
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            a2 = f.a.k.a.a(g.b());
        } else {
            a2 = f.a.h.a.a(f.a.k.a.f158005b);
        }
        return a(0, j2, timeUnit, a2);
    }

    private static t<Long> a(TimeUnit timeUnit, aa aaVar) {
        f.a.e.b.b.a((Object) timeUnit, "unit is null");
        f.a.e.b.b.a((Object) aaVar, "scheduler is null");
        return f.a.h.a.a(new ak(0, 9, Math.max(0L, 1000L), Math.max(0L, 1000L), timeUnit, aaVar));
    }

    private static t<Long> a(long j2, long j3, TimeUnit timeUnit, aa aaVar) {
        f.a.e.b.b.a((Object) timeUnit, "unit is null");
        f.a.e.b.b.a((Object) aaVar, "scheduler is null");
        return f.a.h.a.a(new aj(Math.max(0L, j2), Math.max(0L, j3), timeUnit, aaVar));
    }
}
