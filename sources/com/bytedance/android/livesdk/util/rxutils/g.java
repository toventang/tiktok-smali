package com.bytedance.android.livesdk.util.rxutils;

import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.e.b.b;
import f.a.e.e.e.aj;
import f.a.k.a;
import f.a.t;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f22191a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(13102);
    }

    public static t<Long> a(TimeUnit timeUnit) {
        aa a2;
        l.d(timeUnit, "");
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            a2 = a.a(com.ss.android.ugc.aweme.cw.g.b());
        } else {
            a2 = f.a.h.a.a(a.f158005b);
        }
        l.b(a2, "");
        l.d(timeUnit, "");
        l.d(a2, "");
        b.a((Object) timeUnit, "unit is null");
        b.a((Object) a2, "scheduler is null");
        t<Long> a3 = f.a.h.a.a(new aj(Math.max(0L, 300L), Math.max(0L, 300L), timeUnit, a2));
        l.b(a3, "");
        return a3;
    }
}
